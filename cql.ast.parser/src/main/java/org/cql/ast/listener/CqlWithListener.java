package org.cql.ast.listener;

import antlr4.cqlBaseListener;
import antlr4.cqlParser.WithClauseContext;

/**
 * 
 * @author Dhananjay
 *
 */
public class CqlWithListener extends cqlBaseListener {

	
	@Override
	public void enterWithClause(WithClauseContext ctx) {
		ctx.expression().children.forEach(t -> System.out.println(t.getText()));
	}
	
	@Override
	public void exitWithClause(WithClauseContext ctx) {
		//System.out.println("here in walk");
	}
}
