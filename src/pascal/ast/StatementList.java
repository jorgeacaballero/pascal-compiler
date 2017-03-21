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
public class StatementList {
    	public Statement stm;
    	public StatementList sl;
    	public String sc;

    	public StatementList(Statement stm){
    		this.stm = stm;
    	}

    	public StatementList(StatementList sl, String sc, Statement stm){
    		this.sl = sl;
    		this.sc = sc;
    		this.stm = stm;
    	}
}
