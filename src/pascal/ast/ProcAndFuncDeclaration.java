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
public class ProcAndFuncDeclaration {
    public ProcOrFunc pof;
    public ProcAndFuncDeclaration pafd;
    public String sc;

    public ProcAndFuncDeclaration(ProcOrFunc pof) {
        this.pof = pof;
    }

    public ProcAndFuncDeclaration( ProcAndFuncDeclaration pafd, String sc, ProcOrFunc pof) {
        this.pof = pof;
        this.pafd = pafd;
        this.sc = sc;
    }
    
    
}
