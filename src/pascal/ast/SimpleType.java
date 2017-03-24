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
public class SimpleType {
    public String lpar, rpar, id;
    public IdentifierList il;

    public SimpleType(String lpar, String rpar, IdentifierList il) {
        this.lpar = lpar;
        this.rpar = rpar;
        this.il = il;
    }

    public SimpleType(String id) {
        this.id = id;
    }
    
    
}
