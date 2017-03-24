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
public class TagField {
    public String idl;
    public String idr;
    public String colon;

    public TagField(String idl) {
        this.idl = idl;
    }

    public TagField(String idl, String idr, String colon) {
        this.idl = idl;
        this.idr = idr;
        this.colon = colon;
    }
    
    
}
