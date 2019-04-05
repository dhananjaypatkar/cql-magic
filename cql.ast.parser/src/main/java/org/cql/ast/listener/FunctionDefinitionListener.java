package org.cql.ast.listener;

import antlr4.cqlBaseListener;
import antlr4.cqlParser.FunctionDefinitionContext;

/**
 * 
 * @author Dhananjay
 *
 */
public class FunctionDefinitionListener extends cqlBaseListener {

	@Override
	public void enterFunctionDefinition(FunctionDefinitionContext ctx) {
		System.out.println(ctx.identifier().getText());
	}
	
}
