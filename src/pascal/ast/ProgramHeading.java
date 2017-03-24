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
public class ProgramHeading {
    public String lpar, rpar;
    public IdentifierList il;

    public ProgramHeading(String lpar, String rpar, IdentifierList il) {
        this.lpar = lpar;
        this.rpar = rpar;
        this.il = il;
    }
    
    
}
