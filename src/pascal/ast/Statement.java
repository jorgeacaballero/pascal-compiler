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
	public String ifex;
	public Expression exp;
	public String then;
	public Statement e;
	public String elseex;
	public Statement f;
	public String id;
	public String lpar;
	public ExpressionList el;
	public String rpar;
        public String wln;
        public String rln;
        
        public String c;
        public String sll;

        public Statement(String ifex, Expression exp, String then, Statement e, String elseex, Statement f){
		this.ifex = ifex;
		this.exp = exp;
		this.then = then;
		this.e = e;
		this.elseex = elseex; 
		this.f = f;
	}

	public Statement(String id, String lpar, ExpressionList el, String rpar){
		this.id = id;
		this.lpar = lpar;
		this.el = el;
		this.rpar = rpar;		
	}

	public Statement(String wln, String lpar, String id, String rpar){
		this.id = id;
		this.lpar = lpar;
		this.el = el;
		this.rpar = rpar;		
	}

	public Statement(String wln, String lpar, String sll, String c, String id, String rpar){
		this.wln  = wln;
		this.lpar = lpar;
		this.sll = sll;
		this.c = c;
		this.id = id;
		this.rpar = rpar;
	}
	
//	public Statement(String wln, String lpar, ExpressionList el, String rpar){
//		this.wln = wln;
//		this.lpar = lpar;
//		this.el = el;
//		this.rpar = rpar;		
//	}
	
	
//	public Statement(String rln, String lpar, ExpressionList el, String rpar){
//		this.rln = rln;
//		this.lpar = lpar;
//		this.el = el;
//		this.rpar = rpar;		
//	}

	public String rpt;
	public StatementList sl;
	public String until;
	public Statement(String rpt, StatementList sl, String until){
		this.rpt = rpt;
		this.sl = sl;
		this.until = until;	
	}
        
        public Statement(String rpt, StatementList sl, String until, Expression exp){
		this.rpt = rpt;
		this.sl = sl;
		this.until = until;
                this.exp = exp;
	}

	public String forexp;
	public String asign;
	public ForList fl;
	public String doexp;
	public Statement stm;
	public Statement(String forex, String id, String asign, ForList fl, String doexp, Statement stm){
		this.forexp = forex;
		this.id = id;
		this.asign = asign;
		this.fl = fl;
		this.doexp = doexp;
		this.stm = stm;
	}

	public String with;
	public RecordVariableList rvl;
	public Statement(String with, RecordVariableList rvl, String doexp, Statement stm){
		this.with = with;
		this.rvl = rvl;
		this.doexp = doexp;
		this.stm = stm;
	}

	public String caseexp;
	public String of;
	public CaseList cl;
	public String end;
	public Statement(String caseexp, Expression exp, String of, CaseList cl, String end){
		this.caseexp = caseexp;
		this.of = of;
		this.cl = cl;
		this.end = end;
	}

	public String whileexp;
	public Statement(String whileexp, Expression exp, String doexp, Statement stm){
		this.whileexp = whileexp;
		this.exp = exp;
		this.doexp = doexp;
		this.stm = stm;
	}

//	public Statement(String ifexp, Expression exp, String then, Statement stm){
//		this.ifex = ifexp;
//		this.exp = exp;
//		this.then = then;
//		this.stm = stm;
//	}

	public Variable var;
	public String sc;
	public Statement(Variable var, Expression exp){
		this.var = var;
		this.exp = exp;
	}

	public String beg;
//	public Statement(String beg, StatementList sl, String end){
//		this.beg = beg;
//		this.sl = sl;
//		this.end = end;
//	}
	public Label lb;
	public String colon;
	public Statement(Label lb, String c, Statement stm){
		this.lb = lb;
		this.colon = c;
		this.stm = stm;
	}

	public Statement(String id){
		this.id = id;
	}



    
}
