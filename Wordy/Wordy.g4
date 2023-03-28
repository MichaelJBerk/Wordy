grammar Wordy;

assignString
    : LET variable BE stringTerm;

assignStringConst
    : LET variable ALWAYS BE stringTerm;

assignNum
    : LET variable BE expression;

assignNumConst
    : LET variable ALWAYS BE expression;

assignStmt: assignNum | assignString;

comment
    : '/*'  ~('*/')* '*/'
    | '//' ~(NEWLINE)* NEWLINE;

stringTerm
    : (concat | stringConstant );

numTerm
    : factor (mulOp factor)*;

sayStmt
    : PRINT stringTerm;

defParam:
    WITH IDENTIFIER AS TYPE;

defFunc
    : TO DO IDENTIFIER '(' (defParam)? (',' defParam)* ')' OUTPUT A TYPE '{' statementList '}';

funcCall:
    IDENTIFIER '(' (IDENTIFIER | expression)? (',' IDENTIFIER | expression)* ')';

statementList:
    statement (NEWLINE statement)*;

statement:
    assignStmt
    | sayStmt
    | funcCall;


characterConstant : CHARACTER ;
stringConstant    : STRING ;
variable : IDENTIFIER ;
     
number          : sign? unsignedNumber ;
unsignedNumber  : integerConstant | realConstant ;
integerConstant : INTEGER ;
realConstant    : REAL;

expression
    : baseExpression (relOp baseExpression)?
    | stringTerm (relOp stringTerm)?;

baseExpression
    : sign? numTerm (addOp numTerm)*
    | ADD (numTerm ',')+ AND numTerm;

factor
    : variable              # variableFactor
    | number                # numberFactor
    | characterConstant     # characterFactor
    | stringConstant        # stringFactor
    | neqOp factor          # notFactor
    | '(' expression ')'    # parenthesizedExpression
    ;

concat
    : STRING ('+'| AND) ( concat )+;

TYPE:
    STRING_TYPE | INT | FLOAT;

LET : L E T;
BE: B E;
ADD: A D D;
AND: A N D;
INPUT: I N P U T;
PRINT: P R I N T | S A Y;
TO: T O;
DO: D O;
WITH: W I T H;
AS: A S;
STRING_TYPE: S T R I N G;
INT: I N T;
FLOAT: F L O A T | R E A L;
OUTPUT: O U T P U T;
ALWAYS: A L W A Y S;
    
fragment A : ('a' | 'A') ;
fragment B : ('b' | 'B') ;
fragment C : ('c' | 'C') ;
fragment D : ('d' | 'D') ;
fragment E : ('e' | 'E') ;
fragment F : ('f' | 'F') ;
fragment G : ('g' | 'G') ;
fragment H : ('h' | 'H') ;
fragment I : ('i' | 'I') ;
fragment J : ('j' | 'J') ;
fragment K : ('k' | 'K') ;
fragment L : ('l' | 'L') ;
fragment M : ('m' | 'M') ;
fragment N : ('n' | 'N') ;
fragment O : ('o' | 'O') ;
fragment P : ('p' | 'P') ;
fragment Q : ('q' | 'Q') ;
fragment R : ('r' | 'R') ;
fragment S : ('s' | 'S') ;
fragment T : ('t' | 'T') ;
fragment U : ('u' | 'U') ;
fragment V : ('v' | 'V') ;
fragment W : ('w' | 'W') ;
fragment X : ('x' | 'X') ;
fragment Y : ('y' | 'Y') ;
fragment Z : ('z' | 'Z') ;

sign : '-' | '+' ;
       
eqlOp: '=' | 'equals' | 'is';
neqOp: '!=' | 'not equals' | 'is not' | 'not';
ltOp: '<' | 'less than';
gtOp: '>' | 'greater than';
leqOp: '<=' | 'less than or equal to';
geqOp: '>=' | 'greater than or equal to';
relOp: eqlOp | neqOp | ltOp | leqOp | gtOp | geqOp ;
addOp : '+' | '-' ;
mulOp : '*' | '/' ;

IDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
INTEGER : [0-9]+;

REAL       : INTEGER '.' INTEGER
           | INTEGER ('^' | 'e') ('+' | '-')? INTEGER
           | INTEGER '.' INTEGER ('^' | 'e') ('+' | '-')? INTEGER
           ;

NEWLINE : '\r'? '\n' -> skip  ;
WS      : [ \t]+ -> skip ; 

QUOTE     : '\'' ;
CHARACTER : QUOTE CHARACTER_CHAR QUOTE ;
STRING    : QUOTE STRING_CHAR* QUOTE ;

fragment CHARACTER_CHAR : ~('\'')   
                        ;

fragment STRING_CHAR : QUOTE QUOTE  
                     | ~('"')      
                     ;