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
public class Variable {
    public String idl;
    public String idr;
    public String brl;
    public String brr;
    public String dot;
    public SubscriptList sl;
    public String asig;

    public Variable(String idl, String brl, String brr, SubscriptList sl) {
        this.idl = idl;
        this.brl = brl;
        this.brr = brr;
        this.sl = sl;
    }

    public Variable(String idl, String idr, String dot) {
        this.idl = idl;
        this.idr = idr;
        this.dot = dot;
    }

    public Variable(String idl, String asig) {
        this.idl = idl;
        this.asig = asig;
    }
    
    public Variable(String idl) {
        this.idl = idl;
    }
    
    
}
