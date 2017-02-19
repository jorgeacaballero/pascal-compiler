package pascal.compiler;
import jflex.sym;
%%

%class Lexer
%unicode
%line
%column
%cup
%caseless

letter = [A-Za-z]
digit = [0-9]
num = {digit}+
identifier = {letter}({letter}|{digit}|[_])*
math_ops = [\+|\-|*|%|/]
relation_ops = [\=|<>|>|<|>=|<=]
asig = ":="
type = string|integer|real|boolean|character
io_ops = Writeln|Readln


comment = \{.*\}
%%

<YYINITIAL> {
	[ \n\t]+		{ }
	"program"		{ System.out.println("program"); }
	"begin"			{ System.out.println("begin"); }
	"writeln"		{ System.out.println("writeln"); }
	"end"			{ System.out.println("end"); }
	"("				{ System.out.println("left parentesis"); }
	")"				{ System.out.println("right parentesis"); }
	"["				{ System.out.println("left bracket"); }
	"]"				{ System.out.println("right bracket"); }
	"{"				{ System.out.println("left key"); }
	"}"				{ System.out.println("right key"); }
	";"				{ System.out.println("semicolon"); }
	":"				{ System.out.println("colon"); }
	","				{ System.out.println("coma"); }
	"."				{ System.out.println("dot"); }
	{num}			{ System.out.println("num: " + yytext()); }
	{comment}		{ System.out.println("comment: " + yytext().substring(1,yytext().length()-1)); }
	{asig}			{ System.out.println("asign"); }
	{math_ops}		{ System.out.println("math_ops: " + yytext()); }
	{relation_ops}	{ System.out.println("relation_ops: " + yytext()); }
	{type}			{ System.out.println("type: " + yytext()); }
	{io_ops}		{ System.out.println("io_ops: " + yytext()); }
	{identifier}	{ System.out.println("identifier: " + yytext()); }
	.				{ System.out.println("******Illegal char '" + yytext() + "' at line " + (yyline+1)); }
}