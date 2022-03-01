grammar Expr;

prog :
             declare*
             EOF;

// Rule for variable declarations

declare   : INT VARIABLENAME SEMI
            | makestate;

// Rule for statements

makestate : assignstate
            |outstate;

// Rule for assignment statements

assignstate:
           VARIABLENAME ASSIGN expression;

// Rule for print statements

outstate :
          OUTSTATEMENT term SEMI;

// Rule for expressions

expression : term SEMI
             |term (PLUS|MINUS) term SEMI
             |term (MULT|DIV) term SEMI
             |term MOD term SEMI;

// Rule for terms

term :
      id
      |integer
      |floatnum;

// Rule for identifiers
id: VARIABLENAME;

// Rule for integers
integer: INTEGER;

// Rule for floating-point numbers
floatnum: FLOAT;

OUTSTATEMENT: 'print';
INT: 'int';

PLUS: '+';
MINUS: '-';
DIV: '/';
MULT: '*';
MOD: '%';
ASSIGN: '=';
NOTEQUAL: '!=';

SEMI: ';';

POINT: '.';

FLOAT: [0-9]+ '.' [0-9]*
       | '.'[0-9]+;

INTEGER: [0-9]+ ;

VARIABLENAME: [a-zA-Z]+;

// Ignore all white spaces
WS: [ \t\r\n]+ -> skip ;