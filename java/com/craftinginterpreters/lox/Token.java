package com.craftinginterpreters.lox;
class Token{
	final TokenType type;
	final String lexeme;
	final Object literal;
	final int line;
	
	Token(TokenType type, String lexem, Object literal, int line){
		this.type = type;
		this.lexeme = lexem;
		this.literal = literal;
		this.line = line;
	}
	
	public String toString(){
		return type + " " + lexeme + " " + literal;
	}
}
