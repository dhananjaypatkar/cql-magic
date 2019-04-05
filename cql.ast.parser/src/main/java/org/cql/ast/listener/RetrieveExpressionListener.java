package org.cql.ast.listener;

import antlr4.cqlBaseListener;
import antlr4.cqlParser.RetrieveExpressionContext;

/**
 * 
 * @author Dhananjay
 *
 */
public class RetrieveExpressionListener extends cqlBaseListener {
 
	@Override
	public void enterRetrieveExpression(RetrieveExpressionContext ctx) {
		ctx.children.forEach(c->System.out.println(c.getText()));
	}
	
	@Override
	public void exitRetrieveExpression(RetrieveExpressionContext ctx) {
		// TODO Auto-generated method stub
		super.exitRetrieveExpression(ctx);
	}
}
