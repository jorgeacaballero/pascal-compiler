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
public class StructuredType {
    public String array, lbra, rbra, of, end, file, packed, record, set;
    public IndexList il;
    public Type ty;
    public FieldList fl;
    public SimpleType simt;
    public StructuredType st;
    
    public StructuredType(String end, String record, FieldList fl) {
        this.end = end;
        this.record = record;
        this.fl = fl;
    }

    public StructuredType(String of, String set, SimpleType simt) {
        this.of = of;
        this.set = set;
        this.simt = simt;
    }

    public StructuredType(String of, String file, Type ty) {
        this.of = of;
        this.file = file;
        this.ty = ty;
    }

    public StructuredType(String packed, StructuredType st) {
        this.packed = packed;
        this.st = st;
    }
    
    public StructuredType(String array, String lbra, String rbra, String of, IndexList il, Type ty) {
        this.array = array;
        this.lbra = lbra;
        this.rbra = rbra;
        this.of = of;
        this.il = il;
        this.ty = ty;
    }
    
    
}
