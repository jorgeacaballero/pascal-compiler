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
public class SubscriptList {
    public SubscriptList sl;
    public String sign;
    public Expression e;

    public SubscriptList(SubscriptList sl, String sign, Expression e) {
        this.sl = sl;
        this.sign = sign;
        this.e = e;
    }

    public SubscriptList(Expression e) {
        this.e = e;
    }
    
    
}
