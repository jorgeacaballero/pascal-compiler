package pascal.compiler;
import jflex.sym;
%%

%class Lexer
%unicode
%line
%column
%cup

space = \s
letter = [A-Za-z]
digit = [0-9]
num = {digit}+
math_ops = [+|-|*|%|/]
relation_ops = [\=|<>|>|<|>=|<=]
boolean_ops = and{space}then|or{space}else|and|or|not
asig = ":="
type = string|integer|real|boolean|character
io_ops = Writeln|Readln


identifier = {letter}({letter}|{digit}|[_])*
comment = \{.*\}
%%

<YYINITIAL> {
	[ \n\t]+		{ }
	"program"		{ System.out.println("program"); }
	"begin"			{ System.out.println("begin"); }
	"writeln"		{ System.out.println("writeln"); }
	"end"			{ System.out.println("end"); }
	{num}			{ System.out.println("num: " + yytext()); }
	{comment}		{ System.out.println("comment: " + yytext().substring(1,yytext().length()-1)); }
	{asig}			{ System.out.println("asign"); }
	{math_ops}		{ System.out.println("math_ops: " + yytext()); }
	{relation_ops}	{ System.out.println("relation_ops: " + yytext()); }
	{boolean_ops}	{ System.out.println("boolean_ops: " + yytext()); }
	{type}			{ System.out.println("type: " + yytext()); }
	{io_ops}		{ System.out.println("io_ops: " + yytext()); }
	{identifier}	{ System.out.println("identifier: " + yytext()); }
	.				{}
}