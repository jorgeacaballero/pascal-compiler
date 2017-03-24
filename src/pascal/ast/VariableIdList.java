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
public class VariableIdList {
    public String id, comma;
    public VariableIdList vid;

    public VariableIdList(String id) {
        this.id = id;
    }

    public VariableIdList(String id, String comma, VariableIdList vid) {
        this.id = id;
        this.comma = comma;
        this.vid = vid;
    }
    
    
}
