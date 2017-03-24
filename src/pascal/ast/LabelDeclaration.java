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
public class LabelDeclaration {
    public Label label;
    public LabelDeclaration label_declaration;
    public String integer, comma;

    public LabelDeclaration(Label label, String integer) {
        this.label = label;
        this.integer = integer;
    }

    public LabelDeclaration(LabelDeclaration label_declaration, String integer, String comma) {
        this.label_declaration = label_declaration;
        this.integer = integer;
        this.comma = comma;
    }
    
    
}
