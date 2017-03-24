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
public class FixedPart {
    public RecordField rf;
    public FixedPart fp;
    public String sc;

    public FixedPart(RecordField rf) {
        this.rf = rf;
    }

    public FixedPart(FixedPart fp, String sc, RecordField rf) {
        this.rf = rf;
        this.fp = fp;
        this.sc = sc;
    }
}
