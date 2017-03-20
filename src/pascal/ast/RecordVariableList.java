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
public class RecordVariableList {
    public RecordVariableList rvl;
    public String sign;
    public Variable v;

    public RecordVariableList(RecordVariableList rvl, String sign, Variable v) {
        this.rvl = rvl;
        this.sign = sign;
        this.v = v;
    }

    public RecordVariableList(Variable v) {
        this.v = v;
    }
    
}
