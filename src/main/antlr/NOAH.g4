grammar NOAH;

// Parser rules
start: statement* EOF;

statement
    : variableDeclaration
    | printStatement
    | assignment
    | ifStatement
    | forLoop
    | whileLoop
    ;

variableDeclaration
    : type IDENTIFIER '=' expression ';'
    ;

type
    : 'int'
    | 'float'
    | 'string'
    | 'boolean'
    ;

assignment
    : IDENTIFIER '=' expression ';'
    ;

printStatement
    : 'print' '(' printExpression ')' ';'
    ;

printExpression
    : expression ('+' expression)*
    ;

// Expression hierarchy without left recursion
expression
    : ternaryExpression
    ;

ternaryExpression
    : logicalExpression ('?' expression ':' expression)?
    ;

logicalExpression
    : comparisonExpression (('and' | 'or') comparisonExpression)*
    | 'not' comparisonExpression
    ;

comparisonExpression
    : additiveExpression (('>=' | '<=' | '>' | '<' | '==' | '!=') additiveExpression)?
    ;

additiveExpression
    : multiplicativeExpression (('+' | '-') multiplicativeExpression)*
    ;

multiplicativeExpression
    : primaryExpression (('*' | '/') primaryExpression)*
    ;

primaryExpression
    : '(' expression ')'
    | IDENTIFIER
    | BOOLEAN
    | INTEGER
    | FLOAT
    | STRING
    ;

ifStatement
    : 'if' '(' expression ')' '{' statement* '}'
      ('else' '{' statement* '}')?
    ;

forLoop
    : 'for' '(' forInitStatement expression ';' forUpdate ')' '{' statement* '}'
    ;

forInitStatement
    : type IDENTIFIER '=' expression ';'  // Variable declaration with initialization
    | IDENTIFIER '=' expression ';'       // Assignment
    ;

forUpdate
    : IDENTIFIER '=' expression
    ;

whileLoop
    : 'while' '(' expression ')' '{' statement* '}'
    ;


// Lexer rules
BOOLEAN: 'true' | 'false';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
INTEGER: [0-9]+;
FLOAT: [0-9]+'.'[0-9]+;
STRING: '"' .*? '"';
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' .*? '\n' -> skip;