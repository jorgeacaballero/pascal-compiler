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
    public String program;
    public String id;
    public ProgramHeading ph;
    public String sc;
    public Block b;
    public String dot;

    public PascalProgram(String program, String id, ProgramHeading ph, String sc, Block b, String dot) {
        this.program = program;
        this.id = id;
        this.ph = ph;
        this.sc = sc;
        this.b = b;
        this.dot = dot;
    }

}
