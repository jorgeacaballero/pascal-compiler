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
public class RecordField {
    public FieldIdList fil;
    public String colon;
    public Type ty;

    public RecordField(FieldIdList fil, String colon, Type ty) {
        this.fil = fil;
        this.colon = colon;
        this.ty = ty;
    }
    
    
}
