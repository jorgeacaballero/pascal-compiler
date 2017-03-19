package pascal.compiler;

import java_cup.runtime.*;
import java.io.Reader;

import java_cup.runtime.Symbol;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;

%%

%public
%class Lexer
%cup
%char
%line
%column
%caseless
%eofval{
	if(stComment!=0)
		System.out.println("Comment started at line " + commentLine + " is not finished");
	return new Symbol(sym.EOF, yyline, yycolumn);
%eofval}
%eofclose
%{
	int stComment = 0;
	int commentLine;

	private Symbol symbol(String name, int sym) {
		System.out.println("name: " + name + " sym: " + sym);
		return new Symbol(sym, yyline, yycolumn);
	}

	private Symbol symbol(String name, int sym, Object val) {
		System.out.println("name: " + name + " sym: " + sym + " val: " + val);
		return new Symbol(sym, yyline, yycolumn, val);
	}

	private void error(String message) {
		System.err.println("Lexical Error at line "+(yyline+1)+", column "+(yycolumn+1)+" : "+message);
	}
%}

letter = [A-Za-z]
digit = [0-9]

boolean = "true"|"false"
integer = {digit}+

id = {letter}({letter}|{digit}|[_])*

%state COMMENT

%%

<YYINITIAL> {
	[ \n\t]+		{ }
	"{"				{ commentLine = yyline+1; stComment++; yybegin(COMMENT); }
	"program"		{ return symbol("program", sym.PROGRAM); }
	"begin"			{ return symbol("begin", sym.BEGIN); }
	"writeln"		{ return symbol("writeln", sym.WRITE_LN); }
	"end"			{ return symbol("end", sym.END); }
	"and"			{ return symbol("and", sym.AND); }
	"array"			{ return symbol("array", sym.ARRAY); }
	"const"			{ return symbol("const", sym.CONST); }
	"div"			{ return symbol("div", sym.DIV); }
	"do"			{ return symbol("do", sym.DO); }
	"else"			{ return symbol("else", sym.ELSE); }
	"for"			{ return symbol("for", sym.FOR); }
	"in"			{ return symbol("in", sym.IN); }
	"function"		{ return symbol("function", sym.FUNCTION); }
	"if"			{ return symbol("if", sym.IF); }
	"nil"			{ return symbol("nil", sym.NIL); }
	"not"			{ return symbol("not", sym.NOT); }
	"of"			{ return symbol("of", sym.OF); }
	"or"			{ return symbol("or", sym.OR); }
	"procedure"		{ return symbol("procedure", sym.PROCEDURE); }
	"record"		{ return symbol("record", sym.RECORD); }
	"then"			{ return symbol("then", sym.THEN); }
	"to"			{ return symbol("to", sym.TO); }
	"downto"		{ return symbol("downto", sym.DOWNTO); }
	"type"			{ return symbol("type", sym.TYPE); }
	"set"			{ return symbol("set", sym.SET); }
	"var"			{ return symbol("var", sym.VAR); }
	"file"			{ return symbol("file", sym.FILE); }
	"while"			{ return symbol("while", sym.WHILE); }
	"packed"		{ return symbol("packed", sym.PACKED); }
	"case"			{ return symbol("case", sym.CASE); }
	"forward"		{ return symbol("forward", sym.FORWARD); }
	"repeat"		{ return symbol("repeat", sym.REPEAT); }
	"until"			{ return symbol("until", sym.UNTIL); }
	"with"			{ return symbol("with", sym.WITH); }
	"("				{ return symbol("(", sym.LEFT_PAR); }
	")"				{ return symbol(")", sym.RIGHT_PAR); }
	"["				{ return symbol("[", sym.LEFT_BRACKET); }
	"]"				{ return symbol("]", sym.RIGHT_BRACKET); }
	";"				{ return symbol(";", sym.SEMICOLON); }
	":"				{ return symbol(":", sym.COLON); }
	","				{ return symbol(",", sym.COMMA); }
	"."				{ return symbol(".", sym.DOT); }
	":="			{ return symbol(":=", sym.ASIGN); }
	"+"				{ return symbol("+", sym.PLUS); }
	"-"				{ return symbol("-", sym.MINUS); }
	"/"				{ return symbol("/", sym.DIVIDE); }
	"*"				{ return symbol("*", sym.PRODUCT); }
	"^"				{ return symbol("^", sym.XOR); }
	"mod"			{ return symbol("mod", sym.MOD); }
	"="				{ return symbol("=", sym.EQUALS); }
	"<>"			{ return symbol("<>", sym.NOT_EQUAL); }
	">"				{ return symbol(">", sym.GREATER_THAN); }
	"<"				{ return symbol("<", sym.LESS_THAN); }
	">="			{ return symbol(">=", sym.GREATER_EQUALS); }
	"<="			{ return symbol("<=", sym.LESS_EQUAL); }
	"boolean"		{ return symbol("boolean", sym.BOOLEAN); }
	"true"			{ return symbol("true", sym.TRUE); }
	"false"			{ return symbol("false", sym.FALSE); }
	"char"			{ return symbol("char", sym.CHAR); }
	"integer"		{ return symbol("integer", sym.INTEGER); }
	"string"		{ return symbol("string", sym.STRING); }

	{letter}		{ return symbol("charconst", sym.CHAR_CONS, yytext()); }
	{integer}		{ return symbol("integerconst", sym.INT_CONST, yytext()); }

	{id}			{ return symbol("id", sym.ID, yytext()); }

	.				{ error("Illegal character <"+ yytext()+"> @ Line " + (yyline+1)); }
}

<COMMENT> {
	"{"		{ stComment++; }
	"}"		{ stComment--; if(stComment==0) yybegin(YYINITIAL); }
	[^]	{ }
}