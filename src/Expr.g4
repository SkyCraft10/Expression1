grammar Expr;

program :
              declare*
              statement*
              EOF;

// Parse rule for variable declarations

declare   :
              INT VARIABLENAME SEMI;

// Parse rule for statements

statement :
            outstatement
           | assignstatement;

// Parse rule for print statements

outstatement  :
          OUTSTATEMENT term SEMI;

// Parse rule for assignment statements

assignstatement :
                 VARIABLENAME ASSIGN expression;

// Parse rule for expressions

expression :
            term
             |
             term PLUS term
             |term MINUS term
             |term DIV term
             |term MULT term
             |term MOD term;

// Parse rule for terms

term :
      identifier
      |integer
      |floatnum;

// Parse rule for identifiers
identifier: VARIABLENAME;

//Parse rule for integers
integer: INTEGERS;

// Parse rule for floating-point numbers
floatnum: FLOAT;

OUTSTATEMENT: 'print';
INT: 'int';

PLUS: '+';
MINUS: '-';
DIV: '/';
MULT: '*';
MOD: '%';
EQUALS: '==';
ASSIGN: '=';
NOTEQUAL: '!=';

SEMI: ';';

FLOAT: ('0' .. '9') + ('.' ('0' .. '9') +)?;

INTEGERS: ('0' .. '9')+;

VARIABLENAME: ('a' .. 'z') | ('A' .. 'Z') | '_';

// Ignore all white spaces
WS: [ \t\r\n]+ -> skip ;