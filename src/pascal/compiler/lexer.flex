package pascal.compiler;
import jflex.sym;
%%

%class Lexer
%unicode
%line
%column
%cup

letter = [A-Za-z]
digit = [0-9]

identifier = {letter}({letter}|{digit}|[_])*
comment = \{.*\}
%state COMMENT
%%

<YYINITIAL> {
	[ \n\t]+		{ }
	"program"		{ System.out.println("program"); }
	"begin"			{ System.out.println("begin"); }
	"writeln"		{ System.out.println("writeln"); }
	"end"			{ System.out.println("end"); }
	{comment}		{ System.out.println("comment: " + yytext().substring(1,yytext().length()-1)); }
	{identifier}	{ System.out.println("identifier: " + yytext()); }
	.				{}
}