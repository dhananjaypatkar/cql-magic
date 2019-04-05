package org.cql.ast.listener;

import antlr4.cqlBaseListener;
import antlr4.cqlParser.QueryExpressionContext;

/**
 * 
 * @author Dhananjay
 *
 */
public class QueryExpressionListener extends cqlBaseListener {
	@Override
	public void enterQueryExpression(QueryExpressionContext ctx) {
		ctx.children.forEach(c -> System.out.println(c.getText()));
	}
	
	@Override
	public void exitQueryExpression(QueryExpressionContext ctx) {
		// TODO Auto-generated method stub
		super.exitQueryExpression(ctx);
	}
}
