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
public class ElementList {
    public Element e;
    public ElementList el;
    public String sign;

    public ElementList(Element e) {
        this.e = e;
    }

    public ElementList(Element e, String s, ElementList el) {
        this.e = e;
        this.el = el;
        this.sign = s;
    }
    
}
