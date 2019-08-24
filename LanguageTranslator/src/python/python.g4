/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * 
 * Python 3 Grammar
 * 
 *The grammar is based on the file of following Github:
 *https://github.com/antlr/grammars-v4/blob/master/python3/Python3.g4
 * 
 * All comments that start with "///" are copy-pasted from
 * The Python Language Reference
 * 
 * https://docs.python.org/3/reference/index.html
 * 
 */

grammar python;

tokens { 
	INDENT, 
	DEDENT
}

@lexer::members {
  private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
  private java.util.Stack<Integer> indents = new java.util.Stack<>();
  private int opened = 0;
  private Token lastToken = null;
  @Override
  public void emit(Token t) {
    super.setToken(t);
    tokens.offer(t);
  }
  @Override
  public Token nextToken() {
    if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
      for (int i = tokens.size() - 1; i >= 0; i--) {
        if (tokens.get(i).getType() == EOF) {
          tokens.remove(i);
        }
      }
      this.emit(commonToken(pythonParser.NEWLINE, "\n"));
      while (!indents.isEmpty()) {
        this.emit(createDedent());
        indents.pop();
      }
      this.emit(commonToken(pythonParser.EOF, "<EOF>"));
    }
    Token next = super.nextToken();
    if (next.getChannel() == Token.DEFAULT_CHANNEL) {
      // Keep track of the last token on the default channel.
      this.lastToken = next;
    }
    return tokens.isEmpty() ? next : tokens.poll();
  }
  private Token createDedent() {
    CommonToken dedent = commonToken(pythonParser.DEDENT, "");
    dedent.setLine(this.lastToken.getLine());
    return dedent;
  }
  private CommonToken commonToken(int type, String text) {
    int stop = this.getCharIndex() - 1;
    int start = text.isEmpty() ? stop : stop - text.length() + 1;
    return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
  }
  static int getIndentationCount(String spaces) {
    int count = 0;
    for (char ch : spaces.toCharArray()) {
      switch (ch) {
        case '\t':
          count += 8 - (count % 8);
          break;
        default:
          count++;
      }
    }
    return count;
  }
  boolean atStartOfInput() {
    return super.getCharPositionInLine() == 0 && super.getLine() == 1;
  }
}

/*
 * parser rules
 */

input
	: (NEWLINE | small_stmt | compound_stmt | functionCall)* EOF?
	;
	
functionCall
	:
	(var= NAME ASSIGN)? func= ('input' | 'print')  '(' testlist? ')'
	;
	
return_stmt
	: RETURN test? (SEMI_COLON)? 
	;
	
small_stmt
	: 
	e1= testlist (ASSIGN e2= testlist)?  (SEMI_COLON)? (NEWLINE | EOF)
	;

testlist
	: 
	test (COMMA test)* (COMMA)?
	;	

test
	: 
	(NOT e1= comparison) 
	| (e2= comparison)
	;

comparison
	:
	e1= expr (comparison_suffix)*
	;

comparison_suffix
	: op= ('<' |'>'	|'=='|'>='|'<='|'!=') e2= expr
	;
	
expr
	: 
	e1= atom  (expr_suffix)*
	;
	
expr_suffix
	: op= ('*'|'/'|'%'|'+'|'-') e2= atom 
	;

atom
	: (NAME)													#id 
    | (NUMBER) 													#num
    | (STRING)													#string
    | (TRUE) 													#true
    | (FALSE)													#false
    | (NAME '(' ( test (COMMA test )* )? ')')					#funccall
    | ('(' test ')'	)											#parens
    ;
//compound_stmt
compound_stmt
	: if_stmt 
	| while_stmt 
	| funcdef 
	;
//if
if_stmt
	: 
	IF t1= test COLON s1= suite (ELIF t2= test COLON s2= suite)* (ELSE COLON s3= suite)? 
	;

suite
	:  NEWLINE INDENT (small_stmt | compound_stmt |  functionCall | NEWLINE)*  return_stmt?  NEWLINE* DEDENT
	;
	
//while
while_stmt
	: WHILE test COLON s1= suite (ELSE COLON s2=  suite)?
	;
	
//funcdef
funcdef
	: DEF NAME parameterlist  COLON suite 
	; 

parameterlist
	:
	'(' ( parameter (COMMA parameter )* )? ')'
	;
	
parameter
	:
	NAME (COLON test)?
	;	
	
/*
 * lexer rules
 */

DEF : 'def';
RETURN : 'return';
IF : 'if';
ELIF : 'elif';
ELSE : 'else';
WHILE : 'while';
NOT : 'not';
TRUE : 'True';
FALSE : 'False';
CLASS : 'class';

ADD : '+';
MINUS : '-';
STAR : '*';
DIV : '/';

LESS_THAN : '<';
GREATER_THAN : '>';
EQUALS : '==';
NOT_EQ_2 : '!=';

ASSIGN : '=';

COMMA : ',';
COLON : ':';
DOT   : '.';
SEMI_COLON : ';';
EXCLA  : '!';
QUES : '?';
BACKSLASH : '\\';

OPEN_PAREN : '(' {opened++;};
CLOSE_PAREN : ')' {opened--;};
OPEN_BRACK : '[' {opened++;};
CLOSE_BRACK : ']' {opened--;};
OPEN_BRACE : '{' {opened++;};
CLOSE_BRACE : '}' {opened--;};

PUNC
: ADD
| MINUS
| STAR
| DIV
| LESS_THAN
| GREATER_THAN
| EQUALS
| NOT_EQ_2
| EXCLA
| QUES
| ASSIGN
| COMMA
| COLON
| DOT
| SEMI_COLON
| BACKSLASH
;

SKIP_
 : ( SPACES | COMMENT | LINE_JOINING ) -> skip
 ;
 
 NAME
 : ID_START ID_CONTINUE*
 ;
 
 NUMBER
 : NON_ZERO_DIGIT DIGIT*
 | '0'+
 ;
 
SPACES
 : [ \t]+
 ;
 
STRING
 : '"'(ID_START | DIGIT | PUNC | SPACES |'(' | ')' )*'"'
 ;

fragment COMMENT
 : '#' ~[\r\n\f]*
 ;

fragment LINE_JOINING
 : '\\' SPACES? ( '\r'? '\n' | '\r' | '\f')
 ;

fragment ID_START
 : '_'
 | [A-Z]
 | [a-z]
 ;

fragment ID_CONTINUE
 : ID_START 
 | [0-9]
;

fragment NON_ZERO_DIGIT
 : [1-9]
 ;
 
fragment DIGIT
 : [0-9]
 ;
 
NEWLINE
 : ( {atStartOfInput()}?   SPACES
   | ( '\r'? '\n' | '\r' | '\f' ) SPACES?)
   {
     String newLine = getText().replaceAll("[^\r\n\f]+", "");
     String spaces = getText().replaceAll("[\r\n\f]+", "");
     int next = _input.LA(1);
     if (opened > 0 || next == '\r' || next == '\n' || next == '\f' || next == '#') {
       skip();
     }
     else {
       emit(commonToken(NEWLINE, newLine));
       int indent = getIndentationCount(spaces);
       int previous = indents.isEmpty() ? 0 : indents.peek();
       if (indent == previous) {
         skip();
       }
       else if (indent > previous) {
         indents.push(indent);
         emit(commonToken(pythonParser.INDENT, spaces));
       }
       else {
         while(!indents.isEmpty() && indents.peek() > indent) {
           this.emit(createDedent());
           indents.pop();
         }
       }
     }
   }
   ;

