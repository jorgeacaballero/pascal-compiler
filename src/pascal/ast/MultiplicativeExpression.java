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
public class MultiplicativeExpression {
    public MultiplicativeExpression me;
    public MultiplicativeOp mo;
    public UnaryExpression ue;

    public MultiplicativeExpression(MultiplicativeExpression me, MultiplicativeOp mo, UnaryExpression ue) {
        this.me = me;
        this.mo = mo;
        this.ue = ue;
    }

    public MultiplicativeExpression(UnaryExpression ue) {
        this.ue = ue;
    }
    
    
}
