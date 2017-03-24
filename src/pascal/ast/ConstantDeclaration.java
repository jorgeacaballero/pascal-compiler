/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pascal.ast;

/**
 *
 * @author jorgecaballero
 */
public class ConstantDeclaration {
    public String constant, id, equals, semicolon;
    public Constant constant_literal;
    public ConstantDeclaration constant_declaration;

    public ConstantDeclaration(String constant, String id, String equals, Constant constant_literal) {
        this.constant = constant;
        this.id = id;
        this.equals = equals;
        this.constant_literal = constant_literal;
    }

    public ConstantDeclaration(String id, String equals, String semicolon, Constant constant_literal, ConstantDeclaration constant_declaration) {
        this.id = id;
        this.equals = equals;
        this.semicolon = semicolon;
        this.constant_literal = constant_literal;
        this.constant_declaration = constant_declaration;
    }
    
    
    
    
}
