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
public class ProcOrFunc {
    public String proc;
    public String func;
    public String idl;
    public String idr;
    public Parameters par;
    public BlockOrForward bof;
    public String colon;
    

    public ProcOrFunc(String proc, String idl, Parameters par, BlockOrForward bof) {
        this.proc = proc;
        this.idl = idl;
        this.par = par;
        this.bof = bof;
    }

    public ProcOrFunc(String func, String idl, String idr, Parameters par, BlockOrForward bof, String colon) {
        this.func = func;
        this.idl = idl;
        this.idr = idr;
        this.par = par;
        this.bof = bof;
        this.colon = colon;
    }
    
    
    
}
