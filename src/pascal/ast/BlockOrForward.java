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
public class BlockOrForward {
    public Block bl;
    public String sc, fw;

    public BlockOrForward(String sc, Block bl) {
        this.bl = bl;
        this.sc = sc;
    }

    public BlockOrForward(String sc, String fw) {
        this.sc = sc;
        this.fw = fw;
    }
    
    
    
}
