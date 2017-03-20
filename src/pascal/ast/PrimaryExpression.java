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
    public ExpressionList el;
    public ElementList elm;
    public Expression exp;
    public Variable var;

    public PrimaryExpression(String tid, ExpressionList el) {
        this.tid = tid;
        this.el = el;
    }

    public PrimaryExpression(ElementList elm) {
        this.elm = elm;
    }

    public PrimaryExpression(Expression exp) {
        this.exp = exp;
    }

    public PrimaryExpression(String tid) {
        this.tid = tid;
    }

    public PrimaryExpression(Variable var) {
        this.var = var;
    }
    
    
    
}
