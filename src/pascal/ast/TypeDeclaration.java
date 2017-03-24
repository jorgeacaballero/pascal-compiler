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
public class TypeDeclaration {
    public String id, eq, sc;
    public Type tl, tr;
    public TypeDeclaration td;

    public TypeDeclaration(String id, String eq, Type tl, Type tr) {
        this.id = id;
        this.eq = eq;
        this.tl = tl;
        this.tr = tr;
    }

    public TypeDeclaration(String id, String eq, String sc, Type tl, TypeDeclaration td) {
        this.id = id;
        this.eq = eq;
        this.sc = sc;
        this.tl = tl;
        this.td = td;
    }
    
    
}
