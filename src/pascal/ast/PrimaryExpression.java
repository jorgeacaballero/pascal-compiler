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
public class PrimaryExpression {
    public String tid;
    public String lsign;
    public String rsign;
    public ExpressionList el;
    public ElementList elm;
    public Expression exp;
    public Variable var;
    public String id;

    public PrimaryExpression(String tid, String lsign, ExpressionList el, String rsign) {
        this.tid = tid;
        this.el = el;
        this.lsign = lsign;
        this.rsign = rsign;
    }

    public PrimaryExpression(String lsign, ElementList elm, String rsign) {
        this.elm = elm;
        this.lsign = lsign;
        this.rsign = rsign;
    }

    public PrimaryExpression(String lsign, Expression exp, String rsign) {
        this.exp = exp;
        this.lsign = lsign;
        this.rsign = rsign;
    }

    public PrimaryExpression(String tid) {
        this.tid = tid;
    }

    public PrimaryExpression(Variable var) {
        this.var = var;
    }
    
    
    
}
