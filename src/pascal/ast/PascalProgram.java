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
public class PascalProgram {
    public String id;
    public ProgramHeading programHeading;
    public Block block;

    public PascalProgram(String id, ProgramHeading ph, Block b) {
        this.id = id;
        this.programHeading = ph;
        this.block = b;
    }

}
