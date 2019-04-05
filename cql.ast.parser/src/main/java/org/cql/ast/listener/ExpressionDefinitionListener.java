package org.cql.ast.listener;

import java.util.HashMap;
import java.util.Map;

import antlr4.cqlBaseListener;
import antlr4.cqlParser.ExpressionDefinitionContext;

/**
 * 
 * @author Dhananjay
 *
 */
public class ExpressionDefinitionListener extends cqlBaseListener {

	private Map<String,cqlBaseListener> listenerMap =new HashMap<>();
	
	public void init() {
		listenerMap.put("StatementContext", new StatementListener());
		listenerMap.put("WithClauseContext", new CqlWithListener());
		listenerMap.put("RetrieveExpressionContext", new RetrieveExpressionListener());
		listenerMap.put("QueryExpressionContext", new QueryExpressionListener());
	}
	
	 @Override
	public void enterExpressionDefinition(ExpressionDefinitionContext ctx) {
		// System.out.println(ctx.getText());
		// ctx.children.forEach(c -> System.out.println(c.getClass().getSimpleName()) );
	}
	 
	 @Override
	public void exitExpressionDefinition(ExpressionDefinitionContext ctx) {
		// TODO Auto-generated method stub
		super.exitExpressionDefinition(ctx);
	}
}
