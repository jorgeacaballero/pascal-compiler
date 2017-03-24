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
public class VariantPart {
    public String caseexp;
    public TagField tf;
    public String of;
    public VariantList vl;

    public VariantPart(String caseexp, TagField tf, String of, VariantList vl) {
        this.caseexp = caseexp;
        this.tf = tf;
        this.of = of;
        this.vl = vl;
    }
    
    
}
