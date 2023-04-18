grammar Wordy;

program: START statementList END;

comment
    : '/*'  ~('*/') '*/'
    | '//'  ~(NEWLINE);

assignString
    : LET variable BE stringTerm;

assignStringConst
    : LET variable ALWAYS BE stringTerm;

assignNum
    : LET variable BE expression;

assignNumConst
    : LET variable ALWAYS BE expression;

assignBool
    : LET variable BE bool;

assignBoolConst
    : LET variable ALWAYS BE bool;

assignStmt: assignNum | assignString | assignStringConst | assignNumConst | assignBool | assignBoolConst;

castNum
    : (IDENTIFIER | factor) AS NUM_TYPE;

strArray
    : '[' (stringTerm)? (',' stringTerm)* ']';
numArray
    : '[' (factor)? (',' factor)* ']';
boolArray
    : '[' (bool)? (',' bool)* ']';

array
    : strArray | numArray | boolArray | IDENTIFIER;

stringTerm
    : (concat | stringConstant | IDENTIFIER);

numTerm
    : factor (mulOp factor)*;

sayStmt
    : PRINT stringTerm;

 outputStmt
    : OUTPUT expression;

defThing
    : THING IDENTIFIER '{' (assignStmt)* '}';

defParam:
   IDENTIFIER AS TYPE;

defFunc
    : TO DO IDENTIFIER '(' WITH? (defParam)? (',' defParam)* ')' (OUTPUT AN TYPE)? '{' (statementList)? outputStmt '}';

funcCall:
    IDENTIFIER '(' (IDENTIFIER | expression)? (',' IDENTIFIER | expression)* ')';

//Not incorporated into `expression`, since it allows these by definition
relOpExpr
    : numExpression relOp numExpression
	| stringTerm relOp stringTerm
	| bool relOp bool;

ifStmt
    : IF (relOpExpr | bool) THEN curlyStatementList (OTHERWISE curlyStatementList)?;

curlyStatementList
    : '{' statementList '}';

loopEachStmt
    : LOOP FOR EACH IDENTIFIER IN array curlyStatementList;

loopUntilStment
    : LOOP UNTIL (relOpExpr | bool) curlyStatementList;

loopStmt
    : loopEachStmt
    | loopUntilStment;

statementList:
    statement (statement)*;

statement:
    assignStmt
    | ifStmt
    | sayStmt
    | funcCall
    | defFunc
    | defThing
    | loopStmt
    | outputStmt
    | comment;

boolConst
    : TRUE | FALSE;

bool
    : boolConst | IDENTIFIER;

characterConstant : CHARACTER ;
stringConstant    : STRING ;
variable : IDENTIFIER ;
     
number          : sign? unsignedNumber ;
unsignedNumber  : integerConstant | realConstant ;
integerConstant : INTEGER ;
realConstant    : REAL;

expression
    : numExpression (relOp numExpression)?
    | stringTerm (relOp stringTerm)?;


numExpression
    : sign? numTerm (addOp numTerm)*
    | castNum
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
    STRING_TYPE | NUM_TYPE| BOOL;

NUM_TYPE:
    INT | FLOAT;

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
TRUE: T R U E;
FALSE: F A L S E;
BOOL: B O O L | B O O L E A N;
THING: T H I N G;
IF: I F;
IS: I S;
THEN: T H E N;
NOT: N O T;
OTHERWISE: O T H E R W I S E;
LOOP: L O O P;
FOR: F O R;
EACH: E A C H;
IN: I N;
UNTIL: U N T I L;
AN: A;
START: S T A R T;
END: E N D;
    
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
       
eqlOp: '=' | 'equals' | IS;
neqOp: '!=' | 'not equals' | IS NOT | NOT;
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
//ANY  : ~[\r\n];
NEWLINE : '\r'? '\n' -> skip  ;
WS      : [ \t]+ -> skip ; 

QUOTE     : '\'' ;
CHARACTER : QUOTE CHARACTER_CHAR QUOTE ;
STRING    : QUOTE STRING_CHAR* QUOTE ;

fragment CHARACTER_CHAR : ~('\'')   
                        ;

fragment STRING_CHAR : QUOTE QUOTE  
                     | ~('\'')
                     ;