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
public class CaseList {
    public CaseLabelList cll;
    public String signl;
    public String signr;
    public Statement stm;
    public CaseList cl;

    public CaseList(CaseLabelList cll, String signl, Statement stm) {
        this.cll = cll;
        this.signl = signl;
        this.stm = stm;
    }

    public CaseList(CaseLabelList cll, String signl, String signr, Statement stm, CaseList cl) {
        this.cll = cll;
        this.signl = signl;
        this.signr = signr;
        this.stm = stm;
        this.cl = cl;
    }
    
    
}
