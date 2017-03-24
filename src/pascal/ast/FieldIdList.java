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
public class FieldIdList {
    public String id, comma;
    public FieldIdList fil;

    public FieldIdList(String id) {
        this.id = id;
    }

    public FieldIdList(FieldIdList fil, String comma, String id) {
        this.id = id;
        this.comma = comma;
        this.fil = fil;
    }
    
    
}
