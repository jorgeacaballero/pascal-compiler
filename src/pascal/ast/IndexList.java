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
public class IndexList {
    public SimpleType st;
    public IndexList il;
    public String comma;

    public IndexList(SimpleType st) {
        this.st = st;
    }

    public IndexList(IndexList il, String comma, SimpleType st) {
        this.st = st;
        this.il = il;
        this.comma = comma;
    }
    
    
}
