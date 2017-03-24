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
public class FieldList {
    public FixedPart fp;
    public String sc;
    public VariantPart vp;

    public FieldList(FixedPart fp, String sc, VariantPart vp) {
        this.fp = fp;
        this.sc = sc;
        this.vp = vp;
    }

    public FieldList(FixedPart fp) {
        this.fp = fp;
    }

    public FieldList(VariantPart vp) {
        this.vp = vp;
    }
    
    
    
}
