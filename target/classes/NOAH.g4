// Define the grammar name
grammar NOAH;

// Parser rules
start: statement* EOF ;

statement: assignment
         | ifStatement
         | forLoop
         | whileLoop
         | printStatement
         ;

assignment: IDENTIFIER '=' expression ';' ;

ifStatement: 'if' '(' expression ')' '{' statement* '}' 
             ('else' '{' statement* '}')?
           | expression '?' expression ':' expression ';' 
           ;

forLoop: 'for' '(' assignment expression ';' assignment ')' '{' statement* '}' ;

whileLoop: 'while' '(' expression ')' '{' statement* '}' ;

printStatement: 'print' '(' expression ')' ';' ;

// Expressions
expression: booleanExpr
          | stringExpr
          | relationalExpr
          ;

// Boolean Expressions
booleanExpr: BOOLEAN
           | booleanExpr 'and' booleanExpr
           | booleanExpr 'or' booleanExpr
           | 'not' booleanExpr
           | '(' booleanExpr ')'
           ;

// Numeric Expressions
// Relational Expressions (Separate from numeric expressions)
relationalExpr: arithmeticExpr (('<' | '>' | '==' | '!=') arithmeticExpr)? ;

// Arithmetic Expressions
arithmeticExpr: term (('+' | '-') term)* ;
term          : factor (('*' | '/') factor)* ;
factor        : numericValue
              | '(' arithmeticExpr ')'
              ;

// String Expressions
stringExpr: STRING ;

// Identifiers and Literals
identifier: IDENTIFIER ;
numericValue: NUMERIC ;

// Lexer Rules
BOOLEAN: 'true' | 'false' ;
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]* ;
NUMERIC: [0-9]+('.'[0-9]+)? ;
STRING: '"' .*? '"' ;
WS: [ \t\r\n]+ -> skip ;