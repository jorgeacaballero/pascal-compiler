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
public class IdentifierList {
    public String id, comma;
    public IdentifierList il;

    public IdentifierList(String id) {
        this.id = id;
    }

    public IdentifierList(String id, String comma, IdentifierList il) {
        this.id = id;
        this.comma = comma;
        this.il = il;
    }
    
    
}
