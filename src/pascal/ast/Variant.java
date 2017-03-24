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
public class Variant {
    public CaseLabelList cll;
    public String colon;
    public String lpar;
    public FieldList fl;
    public String rpar;

    public Variant(CaseLabelList cll, String colon, String lpar, FieldList fl, String rpar) {
        this.cll = cll;
        this.colon = colon;
        this.lpar = lpar;
        this.fl = fl;
        this.rpar = rpar;
    }
    
    
}
