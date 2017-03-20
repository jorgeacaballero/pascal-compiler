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
public class AdditiveExpression {
    public AdditiveExpression ae;
    public AdditiveOp ao;
    public MultiplicativeExpression me;

    public AdditiveExpression(AdditiveExpression ae, AdditiveOp ao, MultiplicativeExpression me) {
        this.ae = ae;
        this.ao = ao;
        this.me = me;
    }

    public AdditiveExpression(MultiplicativeExpression me) {
        this.me = me;
    }
    
}
