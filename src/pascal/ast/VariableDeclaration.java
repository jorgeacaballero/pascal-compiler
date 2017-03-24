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
public class VariableDeclaration {
    public String var, colon, sc;
    public VariableIdList vil;
    public VariableDeclaration vd;
    public Type t;

    public VariableDeclaration(String var, String colon, VariableIdList vil, Type t) {
        this.var = var;
        this.colon = colon;
        this.vil = vil;
        this.t = t;
    }

    public VariableDeclaration(String colon, String sc, VariableIdList vil, VariableDeclaration vd, Type t) {
        this.colon = colon;
        this.sc = sc;
        this.vil = vil;
        this.vd = vd;
        this.t = t;
    }
    
    
}
