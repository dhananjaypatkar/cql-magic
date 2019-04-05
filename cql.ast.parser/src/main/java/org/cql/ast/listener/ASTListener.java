package org.cql.ast.listener;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import antlr4.cqlLexer;
import antlr4.cqlParser;

/**
 * @Dhananjay
 *
 */
public class ASTListener 
{
    public static void main( String[] args )
    {
    	Path path = Paths.get("src/main/resources/AdultMajorDepressiveDisorderMDDSuicideRiskAssessment-7.2.000.cql").toAbsolutePath();
    	String cql = StringOperations.getFileAsString(new File(path.toString()));
    	cqlLexer cqlLexer =  new cqlLexer(CharStreams.fromString(cql));
    	org.antlr.v4.runtime.CommonTokenStream token = new org.antlr.v4.runtime.CommonTokenStream(cqlLexer);
    	cqlParser cqlParser = new cqlParser(token);
    	ParseTree tree = cqlParser.library();
    	ParseTreeWalker walker = new ParseTreeWalker();
    	CqlWithListener cqlWithListener = new CqlWithListener();
    	walker.walk(cqlWithListener, tree);
    	walker.walk(new StatementListener(), tree);
    	walker.walk(new ExpressionDefinitionListener(), tree);
    	walker.walk(new QueryExpressionListener(), tree);
    	walker.walk(new RetrieveExpressionListener(), tree);
    }
}
