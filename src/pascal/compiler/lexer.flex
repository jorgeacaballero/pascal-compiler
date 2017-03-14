package pascal.compiler;

import java_cup.runtime.*;
import java.io.Reader;

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
	"program"		{ System.out.println("program"); return new Symbol(sym.PROGRAM); }
	"begin"			{ System.out.println("begin"); return new Symbol(sym.BEGIN); }
	"writeln"		{ System.out.println("writeln"); return new Symbol(sym.WRITE_LN); }
	"end"			{ System.out.println("end"); return new Symbol(sym.END); }
	"("				{ System.out.println("left parentesis"); return new Symbol(sym.LEFT_PAR); }
	")"				{ System.out.println("right parentesis"); return new Symbol(sym.RIGHT_PAR); }
	"["				{ System.out.println("left bracket"); return new Symbol(sym.LEFT_BRACKET); }
	"]"				{ System.out.println("right bracket"); return new Symbol(sym.RIGHT_BRACKET); }
	"{"				{ System.out.println("left key"); return new Symbol(sym.LEFT_KEY); }
	"}"				{ System.out.println("right key"); return new Symbol(sym.RIGHT_KEY); }
	";"				{ System.out.println("semicolon"); return new Symbol(sym.SEMICOLON); }
	":"				{ System.out.println("colon"); return new Symbol(sym.COLON); }
	","				{ System.out.println("coma"); return new Symbol(sym.COMA); }
	"."				{ System.out.println("dot"); return new Symbol(sym.DOT); }
	":="			{ System.out.println("asign"); return new Symbol(sym.ASIGN); }
	{num}			{ System.out.println("num: " + yytext()); return new Symbol(sym.BEGIN); }
	{comment}		{ System.out.println("comment: " + yytext().substring(1,yytext().length()-1)); return new Symbol(sym.BEGIN); }
	{math_ops}		{ System.out.println("math_ops: " + yytext()); return new Symbol(sym.BEGIN); }
	{relation_ops}	{ System.out.println("relation_ops: " + yytext()); return new Symbol(sym.BEGIN); }
	{type}			{ System.out.println("type: " + yytext()); return new Symbol(sym.BEGIN); }
	{io_ops}		{ System.out.println("io_ops: " + yytext()); return new Symbol(sym.BEGIN); }
	{identifier}	{ System.out.println("identifier: " + yytext()); return new Symbol(sym.BEGIN); }
	.				{ System.out.println("******Illegal char '" + yytext() + "' at line " + (yyline+1)); return new Symbol(sym.BEGIN); }
}