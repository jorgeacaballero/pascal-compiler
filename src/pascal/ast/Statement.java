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
public class Statement {
	public String if;
	public Expression exp;
	public String then;
	public Statement e;
	public String else;
	public Statement f;

	public Statement(String if, Expression exp, String then, Statement e, String else, Statement f){
		this.if = if;
		this.exp = exp;
		this.then = then;
		this.e = e;
		this.else; 
		this.f = f;
	}
	public String id;
	public String lpar;
	public ExpressionList el;
	public String rpar;

	public Statement(String id, String lpar, ExpressionList el, String rpar){
		this.id = id;
		this.lpar = lpar;
		this.el = el;
		this.rpar = rpar;		
	}

	public String wln;
	public Statement(String wln, String lpar, ExpressionList el, String rpar){
		this.wln = wln;
		this.lpar = lpar;
		this.el = el;
		this.rpar = rpar;		
	}
	
	public String rln;
	public Statement(String rln, String lpar, ExpressionList el, String rpar){
		this.rln = rln;
		this.lpar = lpar;
		this.el = el;
		this.rpar = rpar;		
	}

	public String rpt;
	public StatementList sl;
	public Until until;
	public Statement(String rpt, StatementList sl, Until until){
		this.rpt = rpt;
		this.sl = sl;
		this.until = until;	
	}

	public For for;
	public Asign asign;
	public String fl;
	public Do do;
	public Statement stm;
	public Statement(For for, String id, Asign asign, String fl, Do do, Statement stm){
		this.For for;
		this.String id;
		this.Asign asign;
		this.String fl;
		this.Do do;
		this.Statement stm;
	}

	public String with;
	public RecordVariableList: rvl;
	public Statement(String with, RecordVariableList rvl, Do do, Statement stm){
		this.with = with;
		this.rvl = rvl;
		this.do = do;
		this.stm = stm;
	}

	public String case;
	public String of;
	public CaseList cl;
	public String end;
	public Statement(String case, String of, Expression exp, CaseList cl, String end){
		this.String case = case;
		this.String of = of;
		this.CaseList cl = cl;
		this.String end = end;
	}

	public String while;
	public Statement( String while, Expression exp, Do do, Statement stm){
		this.String while = while;
		this.Expression exp = exp;
		this.Do do = do;
		this.Statement stm = stm;
	}

	public Statement(String if, Expression exp, String then, Statement stm){
		this.String if = if;
		this.Expression exp = exp;
		this.String then = then;
		this.Statement stm = stm;
	}

	public Variable var;
	public String sc;
	public Statement(Variable var, String sc, Expression exp){
		this.var = var;
		this.sc = sc;
		this.exp = exp;
	}

	public String beg;
	public Statement(String beg, StatementList sl, String end){
		this.beg = beg;
		this.sl = sl;
		this.end = end;
	}
	public Label lb;
	public String colon;
	public Statement(Label lb, String c, Statement stm){
		this.lb = lb;
		this.colon = colon;
		this.stm = stm;
	}

	public Statement(String id){
		this.id = id;
	}



    
}
