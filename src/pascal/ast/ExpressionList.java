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
public class ExpressionList {
    public ExpressionList el;
    public String sign;
    public Expression ex;

    public ExpressionList(ExpressionList el, String sign, Expression ex) {
        this.el = el;
        this.sign = sign;
        this.ex = ex;
    }

    public ExpressionList(Expression ex) {
        this.ex = ex;
    }
    
    
}
