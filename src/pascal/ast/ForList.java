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
public class ForList {
    public Expression exr;
    public String sign;
    public Expression exl;

    public ForList(Expression exr, String sign, Expression exl) {
        this.exr = exr;
        this.sign = sign;
        this.exl = exl;
    }
    
    
}
