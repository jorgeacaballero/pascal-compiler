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
public class FormalParameterSection {
    public ParameterIdList pil;
    public Parameters par;
    public String colon;
    public String idl;
    public String idr;
    public String var;
    public String proc;
    public String func;

    public FormalParameterSection(ParameterIdList pil, String colon, String idl) {
        this.pil = pil;
        this.colon = colon;
        this.idl = idl;
    }

    public FormalParameterSection(String var, ParameterIdList pil, String colon, String idl) {
        this.pil = pil;
        this.colon = colon;
        this.idl = idl;
        this.var = var;
    }

    public FormalParameterSection(String proc,String idl,Parameters par) {
        this.par = par;
        this.idl = idl;
        this.proc = proc;
    }

    public FormalParameterSection(String func, String idl, Parameters par, String colon,  String idr) {
        this.par = par;
        this.colon = colon;
        this.idl = idl;
        this.idr = idr;
        this.func = func;
    }
    
    
}
