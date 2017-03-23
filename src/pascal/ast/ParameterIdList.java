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
public class ParameterIdList {
    public String id;
    public ParameterIdList(String id){
    	this.id = id;
    }
    public ParameterIdList pl;
    public String c;
    public ParameterIdList(ParameterIdList pl, String c, String id){
    	this.pl = pl;
    	this.c = c;
    	this.id = id;
    }


}
