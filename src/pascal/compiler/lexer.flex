package pascal.compiler;

import java_cup.runtime.*;
import java.io.Reader;

%%

%public
%class Lexer
%cup
%char
%line
%column
%caseless

%{
	StringBuffer string = new StringBuffer();
	public Lexer(java.io.Reader in, ComplexSymbolFactory sf){
	this(in);
	symbolFactory = sf;
	}
	ComplexSymbolFactory symbolFactory;

	private Symbol symbol(String name, int sym) {
		System.out.println("name: " + name + " sym: " + sym);
		return new Symbol(sym, yyline, yycolumn);
	}

	private Symbol symbol(String name, int sym, Object val) {
		System.out.println("name: " + name + " sym: " + sym + " val: " + val);
		return new Symbol(sym, yyline, yycolumn, val);
	}

	private void error(String message) {
		System.out.println("Error at line "+(yyline+1)+", column "+(yycolumn+1)+" : "+message);
	}
%}

letter = [A-Za-z]
digit = [0-9]

boolean = "true"|"false"
integer = {digit}+

id = {letter}({letter}|{digit}|[_])*

comment = \{.*\}
%%

<YYINITIAL> {
	[ \n\t]+		{ }
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
	"type"			{ return symbol("type", sym.TYPE); }
	"var"			{ return symbol("var", sym.VAR); }
	"while"			{ return symbol("while", sym.WHILE); }
	"("				{ return symbol("(", sym.LEFT_PAR); }
	")"				{ return symbol(")", sym.RIGHT_PAR); }
	"["				{ return symbol("[", sym.LEFT_BRACKET); }
	"]"				{ return symbol("]", sym.RIGHT_BRACKET); }
	"{"				{ return symbol("{", sym.LEFT_KEY); }
	"}"				{ return symbol("}", sym.RIGHT_KEY); }
	";"				{ return symbol(";", sym.SEMICOLON); }
	":"				{ return symbol(":", sym.COLON); }
	","				{ return symbol(",", sym.COMA); }
	"."				{ return symbol(".", sym.DOT); }
	":="			{ return symbol(":=", sym.ASIGN); }
	"+"				{ return symbol("+", sym.PLUS); }
	"-"				{ return symbol("-", sym.MINUS); }
	"/"				{ return symbol("/", sym.DEVIDE); }
	"*"				{ return symbol("*", sym.PRODUCT); }
	"%"				{ return symbol("%", sym.MOD); }
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

	{letter}		{ return symbol("charconst", sym.CHAR_CONS, yytext()); }
	{integer}		{ return symbol("integerconst", sym.INT_CONST, yytext()); }
	{id}			{ return symbol("id", sym.ID, yytext()); }

	{comment}		{ System.out.println("comment: " + yytext().substring(1,yytext().length()-1)); }

	.				{ error("Illegal character <"+ yytext()+"> @ Line " + (yyline+1)); }
}