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
public class VariantList {
    public Variant var;
    public VariantList vl;
    public String sc;

    public VariantList(Variant var) {
        this.var = var;
    }

    public VariantList(Variant var, String sc, VariantList vl) {
        this.var = var;
        this.vl = vl;
        this.sc = sc;
    }
    
    
}
