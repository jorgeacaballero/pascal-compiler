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
public class Parameters {
    public FormalParameterList fpl;
    public String lpar, rpar;

    public Parameters(String lpar, FormalParameterList fpl, String rpar) {
        this.fpl = fpl;
        this.lpar = lpar;
        this.rpar = rpar;
    }
    
    
}
