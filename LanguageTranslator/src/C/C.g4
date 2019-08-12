/*
 * University of Glasgow
 * Msc Project fall, 2019
 * Author: Yidi Cao
 * 
 * C 2011 grammar built from the C11 Spec 
 * 
 * The grammar is based on the file of following Github:
 * https://github.com/antlr/grammars-v4/blob/master/c/C.g4
 * 
 * All comments that start with "///" are copy-pasted from
 * The C Language Reference
 * 
 */
	
grammar C;

// Parser rules
//Declaration
externalDeclaration
    : (functionDefinition |  initDeclaratorList  | funccall )* EOF
    ;
    
typeSpecifier
    :  Void																				#void
    |   Char																			#char
    |   Int    																			#int
    |   Bool																			#bool
    ;
    
funccall
	: Identifier LeftParen actual? RightParen Semi
	;
	
initDeclaratorList
    :  ( typeSpecifier (id1= Identifier ('[' DigitSequence ']')?
    					| (id2= Identifier ('[' DigitSequence ']')? Assign c1= expression))
   		 (Comma (id3= Identifier ('[' DigitSequence ']')?
   		 		| (id4= Identifier ('[' DigitSequence ']')? Assign c2= expression)))? Semi)		#var_del
    ;
functionDefinition
    :   (c1= typeSpecifier id1= Identifier LeftParen parameterlist? RightParen 
    		LeftBrace blockItemList* RightBrace)												#void_func
	|	(c2= typeSpecifier id2= Identifier LeftParen parameterlist? RightParen  			
    		LeftBrace blockItemList* Return expression Semi RightBrace)							#notvoid_func
    ;
    
parameterlist
	:	parameter  (Comma parameter)*
	;
	
parameter
	:	typeSpecifier Identifier
	;

blockItemList 
    :   (statement |  (initDeclaratorList))+
    ;
   
//Expression	
expression
    :   e1= arithExpression (expression_suffix)*			
    ;
    
expression_suffix
	:	op= (Less | Greater | Equal | NotEqual) e2= arithExpression
	;

arithExpression
    :   e1= castExpression (arithExpression_suffix)*
    ;
    
arithExpression_suffix
	:	op= (Plus | Minus | Star | Div)  e2= castExpression
	;
    
castExpression
    :   DigitSequence																		#num						
    |	Identifier																			#id
    |	(LeftParen expression RightParen)													#parens
    |	(Identifier LeftParen actual? RightParen)											#func_call
    |	( CharValue )																		#char_value
    |	(CharArray)																			#char_array
    ;

//Statement
statement
    :   (LeftBrace blockItemList? RightBrace)												#compound_stmt
    |   (expression? Semi)																	#expr_stmt
    |   (If LeftParen e1= expression RightParen c1=statement (Else c3=statement)?)			#if_stmt	
    |   (While LeftParen expression RightParen statement)      								#while_stmt
    |	(funccall Semi)																		#func_stmt
    |	(Identifier Assign  expression (Comma Identifier Assign  expression)* Semi)			#assn_stmt
    ;
    
actual
	:	expression (Comma expression)*
	;
   
// Lexicon
Bool : '_Bool';
Char : 'char';
Else : 'else';
If : 'if';
Int : 'int';
Return : 'return';
While : 'while';
Void : 'void';

Equal : '==';
NotEqual : '!=';
Less : '<';
Greater : '>';
Plus : '+';
Minus : '-';
Star : '*';
Div : '/';

Assign : '=';

LeftParen : '(';
RightParen : ')';
LeftBrace : '{';
RightBrace : '}';
Semi : ';';
Comma : ',';
Double_quo : '"';
Dot : '.';
EXCLA  : '!';
QUES : '?';
BACKSLASH : '\\';


Identifier
    :   Nondigit
        (   Nondigit
        |   Digit
        )*
    ;
    
DigitSequence
    :   Digit+
    ;
    
CharValue
	: 	'\'' (Nondigit | Digit) '\''
    ;
    
CharArray
	:	Double_quo (Nondigit | Digit | Punc | Oprator | Whitespace | Newline)* Double_quo
	;
	
Punc
	: Comma
	| 	Dot
	|	Semi
	|	LeftParen
	|	RightParen
	|	LeftBrace
	|	RightBrace
	|	EXCLA
	|	QUES
	|	BACKSLASH
	;
	
Oprator
	:	Assign
	|	Equal
	|	NotEqual
	|	Less
	|	Greater
	|	Plus
	|	Minus
	|	Star
	|	Div
	;
	
fragment
Nondigit
    :   [a-zA-Z_]
    ;

fragment
Digit
    :   [0-9]
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
;