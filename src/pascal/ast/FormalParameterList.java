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
public class FormalParameterList {
    public FormalParameterSection fps;
    public FormalParameterList fpl;
    public String sc;

    public FormalParameterList(FormalParameterSection fps) {
        this.fps = fps;
    }

    public FormalParameterList(FormalParameterList fpl, String sc, FormalParameterSection fps) {
        this.fps = fps;
        this.fpl = fpl;
        this.sc = sc;
    }
    
    
}
