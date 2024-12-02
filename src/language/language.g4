grammar language;

start : program;
program : (instruction)*;

openScope : LEFT_BRACKET ;
closeScope : RIGHT_BRACKET ;

scopeBlock : openScope (instruction)* closeScope;
instruction : variableAssignment
	    | condition 
        | whileLoop
        | scopeBlock
        | input
        | out
        ;
eol : EOL;


variableAssignment : variableName OP_ASSIGN variableValue eol;
variableName : ALPHANUMERIC;
variableValue : expression 
               | comparison 
               | literal 
               ;


condition : IF comparison scopeBlock ( ELSE scopeBlock )? ;

whileLoop : WHILE comparison loopBody ;
loopBody: openScope (instruction | tcontinue | tbreak)* closeScope;
tcontinue : CONT eol;
tbreak : BRK eol;


input: variableName OP_ASSIGN INPUT LEFT_PARENTHESIS RIGHT_PARENTHESIS eol;
out: OUT LEFT_PARENTHESIS expression RIGHT_PARENTHESIS eol;


expression : term ( OP_ADD term | OP_SUBTRACT term )* ;
term : factor ( OP_MULTIPLY factor | OP_DIVIDE factor | OP_MODE factor )* ;
factor: literal 
       | variableName 
       | LEFT_PARENTHESIS OP_SUBTRACT factor RIGHT_PARENTHESIS
       | LEFT_PARENTHESIS expression RIGHT_PARENTHESIS
       ;


comparison : LEFT_PARENTHESIS expression comparisonOperator expression  RIGHT_PARENTHESIS
           | LEFT_PARENTHESIS comparison logicalOperator comparison  RIGHT_PARENTHESIS
           | LEFT_PARENTHESIS OP_NOT comparison  RIGHT_PARENTHESIS
           | LEFT_PARENTHESIS comparison RIGHT_PARENTHESIS
           | LEFT_PARENTHESIS variableName RIGHT_PARENTHESIS
           ;
comparisonOperator : OP_EQUALS | OP_NOTEQUALS | OP_LESS | OP_LESSEQUAL | OP_MORE | OP_MOREEQUAL ;
logicalOperator : OP_OR | OP_AND ;



literal : intLiteral 
        | floatLiteral 
        ;
intLiteral : (NUMBER)+ ;
floatLiteral : (NUMBER)+ DOT (NUMBER)+ ;

// LEXEMS
EOL : ';' ;

IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
CONT : 'continue' ;
BRK : 'break' ;

OP_ASSIGN : '=' ;
OP_ADD : '+' ; 
OP_SUBTRACT : '-' ; 
OP_MULTIPLY : '*' ;
OP_DIVIDE : '/' ;
OP_MODE : '%' ;
OP_EQUALS : '==' ; 
OP_NOTEQUALS : '!=' ;
OP_LESS : '<' ;
OP_LESSEQUAL : '<=' ;
OP_MORE : '>' ;
OP_MOREEQUAL : '>=' ;
OP_OR : '||' ;
OP_AND : '&&' ;
OP_NOT : '!' ; 

LEFT_BRACKET : '{' ;
RIGHT_BRACKET : '}' ;
LEFT_PARENTHESIS : '(' ;
RIGHT_PARENTHESIS : ')' ;

OUT: 'out';
INPUT: 'input';

DOT : '.' ;

ALPHANUMERIC : 'v' [a-zA-Z0-9]+ ;
LETTER : [a-zA-Z] ;
NUMBER : [0-9] ;
WS : [ \t\r\n]+ -> skip;

