/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constants;

/**
 *
 * @author Gavin
 * @param <E>
 */
public class Token<E> implements GrammarSymbol {
    private TokenType tag;
    private E value;
    
    public Token(TokenType tag, E value) {
        this.tag = tag;
        this.value = value;
    }
    
    public Token(TokenType tag) {
        this.tag = tag;
        this.value = null;
    }
    
    public void setValue(E value) { this.value = value; }
    
    public E getValue() { return this.value; }
    
    public void setType(TokenType tag) { this.tag = tag; }
    
    public TokenType getType() { return this.tag; }
    
    public boolean isTypeOf(TokenType t) { return this.tag.equals(t); }
    
    public String getLexeme() { return this.value.toString().toLowerCase(); }
    
    public String toString() {
        return "(" + tag + ", " + value + ")";
    }
    
    public boolean equals(Token other) {
        return this.tag.equals(other.tag) && this.value.equals(other.value);
    }
    
    public int getIndex() {
        return tag.getIndex();
    }

    public boolean isToken() {
        return true;
    }

    public boolean isNonTerminal() {
        return false;
    }

    public boolean isAction() {
        return false;
    }
    
    public boolean equals(GrammarSymbol other) {
        return other.isToken() && this.tag.equals(other);
    }
    
    public static void main(String[] args) {
        Token test = new Token(TokenType.INTEGER);
        test.setValue("String");
        System.out.println(test.getValue().getClass());
        
    }
}
