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
public class Type {
    public SimpleType st;
    public StructuredType strt;
    public Constant c;

    public Type(SimpleType st) {
        this.st = st;
    }

    public Type(StructuredType strt) {
        this.strt = strt;
    }

    public Type(Constant c) {
        this.c = c;
    }
    
    
}
