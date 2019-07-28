/*
 C 2011 grammar built from the C11 Spec 
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
    : (functionDefinition |   initDeclaratorList ';')* EOF
    ;
    
typeSpecifier
    :  'void'																				#void
    |   'char'																				#char
    |   'int'    																			#int
    |   '_Bool'																				#bool
    ;
    
initDeclaratorList
    :   typeSpecifier (id1= Identifier | id2= Identifier '=' c1= expression)
   		 (',' (id3= Identifier | id4= Identifier '=' c2= expression))?						#var_del
    ;
functionDefinition
    :   c1= typeSpecifier id1= Identifier '(' parameterlist? ')' 
    		'{' blockItemList* '}'															#void_func
	|	c2= typeSpecifier id2= Identifier '(' parameterlist? ')'  			
    		'{'blockItemList* Return expression ';' '}'										#notvoid_func
    ;
    
parameterlist
	:	parameter  (',' parameter)*
	;
	
parameter
	:	typeSpecifier Identifier
	;

blockItemList
    :   (statement |  (initDeclaratorList ';'))
    |   blockItemList (statement |  (initDeclaratorList ';'))
    ;
   
//Expression	
expression
    :   e3= arithExpression																		
    |   e1= expression ('<' | '>' | '==' | '!=') e2= arithExpression				
    ;

arithExpression
    :   e3= castExpression
    |   e1= arithExpression ('+' | '-' | '*' | '/')  e2= castExpression
    ;
    
castExpression
    :   DigitSequence																		#num						
    |	Identifier																			#id
    |	'(' expression ')'																	#parens
    |	Identifier '(' actual? ')'															#func_call
    |	'\''(Identifier | DigitSequence | Whitespace)'\''									#char_value
    ;

//Statement
statement
    :   '{' blockItemList? '}'																#compound_stmt
    |   expression? ';'																		#expr_stmt
    |   If '(' expression ')' c1=statement (Else c2=statement)?								#if_stmt	
    |   While '(' expression ')' statement      											#while_stmt
    |	id= Identifier '(' actual? ')'	';'													#funccall
    |	Identifier '='  expression	';'														#assn_stmt
    ;
    
actual
	:	expression (',' expression)*
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

Identifier
    :   Nondigit
        (   Nondigit
        |   Digit
        )*
    ;
    
DigitSequence
    :   Digit+
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