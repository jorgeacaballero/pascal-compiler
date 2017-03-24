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
public class CaseLabelList {
    public Constant c;
    public CaseLabelList cll;
    public String comma;

    public CaseLabelList(Constant c) {
        this.c = c;
    }

    public CaseLabelList(CaseLabelList cll, String comma, Constant c) {
        this.c = c;
        this.cll = cll;
        this.comma = comma;
    }
  
}
