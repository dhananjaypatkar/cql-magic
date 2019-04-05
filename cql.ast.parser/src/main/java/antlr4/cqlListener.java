package antlr4;

// Generated from cql.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cqlParser}.
 */
public interface cqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cqlParser#library}.
	 * @param ctx the parse tree
	 */
	void enterLibrary(cqlParser.LibraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#library}.
	 * @param ctx the parse tree
	 */
	void exitLibrary(cqlParser.LibraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#libraryDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLibraryDefinition(cqlParser.LibraryDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#libraryDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLibraryDefinition(cqlParser.LibraryDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#usingDefinition}.
	 * @param ctx the parse tree
	 */
	void enterUsingDefinition(cqlParser.UsingDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#usingDefinition}.
	 * @param ctx the parse tree
	 */
	void exitUsingDefinition(cqlParser.UsingDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#includeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterIncludeDefinition(cqlParser.IncludeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#includeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitIncludeDefinition(cqlParser.IncludeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#localIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterLocalIdentifier(cqlParser.LocalIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#localIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitLocalIdentifier(cqlParser.LocalIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(cqlParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(cqlParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#parameterDefinition}.
	 * @param ctx the parse tree
	 */
	void enterParameterDefinition(cqlParser.ParameterDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#parameterDefinition}.
	 * @param ctx the parse tree
	 */
	void exitParameterDefinition(cqlParser.ParameterDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#codesystemDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCodesystemDefinition(cqlParser.CodesystemDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#codesystemDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCodesystemDefinition(cqlParser.CodesystemDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#valuesetDefinition}.
	 * @param ctx the parse tree
	 */
	void enterValuesetDefinition(cqlParser.ValuesetDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#valuesetDefinition}.
	 * @param ctx the parse tree
	 */
	void exitValuesetDefinition(cqlParser.ValuesetDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#codesystems}.
	 * @param ctx the parse tree
	 */
	void enterCodesystems(cqlParser.CodesystemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#codesystems}.
	 * @param ctx the parse tree
	 */
	void exitCodesystems(cqlParser.CodesystemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#codesystemIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterCodesystemIdentifier(cqlParser.CodesystemIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#codesystemIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitCodesystemIdentifier(cqlParser.CodesystemIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#libraryIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterLibraryIdentifier(cqlParser.LibraryIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#libraryIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitLibraryIdentifier(cqlParser.LibraryIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#codeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCodeDefinition(cqlParser.CodeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#codeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCodeDefinition(cqlParser.CodeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#conceptDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConceptDefinition(cqlParser.ConceptDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#conceptDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConceptDefinition(cqlParser.ConceptDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#codeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterCodeIdentifier(cqlParser.CodeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#codeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitCodeIdentifier(cqlParser.CodeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#codesystemId}.
	 * @param ctx the parse tree
	 */
	void enterCodesystemId(cqlParser.CodesystemIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#codesystemId}.
	 * @param ctx the parse tree
	 */
	void exitCodesystemId(cqlParser.CodesystemIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#valuesetId}.
	 * @param ctx the parse tree
	 */
	void enterValuesetId(cqlParser.ValuesetIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#valuesetId}.
	 * @param ctx the parse tree
	 */
	void exitValuesetId(cqlParser.ValuesetIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#versionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterVersionSpecifier(cqlParser.VersionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#versionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitVersionSpecifier(cqlParser.VersionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#codeId}.
	 * @param ctx the parse tree
	 */
	void enterCodeId(cqlParser.CodeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#codeId}.
	 * @param ctx the parse tree
	 */
	void exitCodeId(cqlParser.CodeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(cqlParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(cqlParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#namedTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterNamedTypeSpecifier(cqlParser.NamedTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#namedTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitNamedTypeSpecifier(cqlParser.NamedTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#modelIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterModelIdentifier(cqlParser.ModelIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#modelIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitModelIdentifier(cqlParser.ModelIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#listTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterListTypeSpecifier(cqlParser.ListTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#listTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitListTypeSpecifier(cqlParser.ListTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#intervalTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterIntervalTypeSpecifier(cqlParser.IntervalTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#intervalTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitIntervalTypeSpecifier(cqlParser.IntervalTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#tupleTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTupleTypeSpecifier(cqlParser.TupleTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#tupleTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTupleTypeSpecifier(cqlParser.TupleTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#tupleElementDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTupleElementDefinition(cqlParser.TupleElementDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#tupleElementDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTupleElementDefinition(cqlParser.TupleElementDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#choiceTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterChoiceTypeSpecifier(cqlParser.ChoiceTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#choiceTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitChoiceTypeSpecifier(cqlParser.ChoiceTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(cqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(cqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#expressionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDefinition(cqlParser.ExpressionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#expressionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDefinition(cqlParser.ExpressionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#contextDefinition}.
	 * @param ctx the parse tree
	 */
	void enterContextDefinition(cqlParser.ContextDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#contextDefinition}.
	 * @param ctx the parse tree
	 */
	void exitContextDefinition(cqlParser.ContextDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(cqlParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(cqlParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#operandDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOperandDefinition(cqlParser.OperandDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#operandDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOperandDefinition(cqlParser.OperandDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(cqlParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(cqlParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#querySource}.
	 * @param ctx the parse tree
	 */
	void enterQuerySource(cqlParser.QuerySourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#querySource}.
	 * @param ctx the parse tree
	 */
	void exitQuerySource(cqlParser.QuerySourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#aliasedQuerySource}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuerySource(cqlParser.AliasedQuerySourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#aliasedQuerySource}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuerySource(cqlParser.AliasedQuerySourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(cqlParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(cqlParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#queryInclusionClause}.
	 * @param ctx the parse tree
	 */
	void enterQueryInclusionClause(cqlParser.QueryInclusionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#queryInclusionClause}.
	 * @param ctx the parse tree
	 */
	void exitQueryInclusionClause(cqlParser.QueryInclusionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#withClause}.
	 * @param ctx the parse tree
	 */
	void enterWithClause(cqlParser.WithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#withClause}.
	 * @param ctx the parse tree
	 */
	void exitWithClause(cqlParser.WithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#withoutClause}.
	 * @param ctx the parse tree
	 */
	void enterWithoutClause(cqlParser.WithoutClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#withoutClause}.
	 * @param ctx the parse tree
	 */
	void exitWithoutClause(cqlParser.WithoutClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#retrieve}.
	 * @param ctx the parse tree
	 */
	void enterRetrieve(cqlParser.RetrieveContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#retrieve}.
	 * @param ctx the parse tree
	 */
	void exitRetrieve(cqlParser.RetrieveContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#codePath}.
	 * @param ctx the parse tree
	 */
	void enterCodePath(cqlParser.CodePathContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#codePath}.
	 * @param ctx the parse tree
	 */
	void exitCodePath(cqlParser.CodePathContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#terminology}.
	 * @param ctx the parse tree
	 */
	void enterTerminology(cqlParser.TerminologyContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#terminology}.
	 * @param ctx the parse tree
	 */
	void exitTerminology(cqlParser.TerminologyContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#qualifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifier(cqlParser.QualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#qualifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifier(cqlParser.QualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(cqlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(cqlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#sourceClause}.
	 * @param ctx the parse tree
	 */
	void enterSourceClause(cqlParser.SourceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#sourceClause}.
	 * @param ctx the parse tree
	 */
	void exitSourceClause(cqlParser.SourceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#singleSourceClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleSourceClause(cqlParser.SingleSourceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#singleSourceClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleSourceClause(cqlParser.SingleSourceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#multipleSourceClause}.
	 * @param ctx the parse tree
	 */
	void enterMultipleSourceClause(cqlParser.MultipleSourceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#multipleSourceClause}.
	 * @param ctx the parse tree
	 */
	void exitMultipleSourceClause(cqlParser.MultipleSourceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(cqlParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(cqlParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#letClauseItem}.
	 * @param ctx the parse tree
	 */
	void enterLetClauseItem(cqlParser.LetClauseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#letClauseItem}.
	 * @param ctx the parse tree
	 */
	void exitLetClauseItem(cqlParser.LetClauseItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(cqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(cqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(cqlParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(cqlParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#sortClause}.
	 * @param ctx the parse tree
	 */
	void enterSortClause(cqlParser.SortClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#sortClause}.
	 * @param ctx the parse tree
	 */
	void exitSortClause(cqlParser.SortClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#sortDirection}.
	 * @param ctx the parse tree
	 */
	void enterSortDirection(cqlParser.SortDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#sortDirection}.
	 * @param ctx the parse tree
	 */
	void exitSortDirection(cqlParser.SortDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#sortByItem}.
	 * @param ctx the parse tree
	 */
	void enterSortByItem(cqlParser.SortByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#sortByItem}.
	 * @param ctx the parse tree
	 */
	void exitSortByItem(cqlParser.SortByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdentifier(cqlParser.QualifiedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#qualifiedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdentifier(cqlParser.QualifiedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code durationBetweenExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDurationBetweenExpression(cqlParser.DurationBetweenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code durationBetweenExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDurationBetweenExpression(cqlParser.DurationBetweenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inFixSetExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInFixSetExpression(cqlParser.InFixSetExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inFixSetExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInFixSetExpression(cqlParser.InFixSetExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code retrieveExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRetrieveExpression(cqlParser.RetrieveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code retrieveExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRetrieveExpression(cqlParser.RetrieveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timingExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTimingExpression(cqlParser.TimingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timingExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTimingExpression(cqlParser.TimingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpression(cqlParser.QueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpression(cqlParser.QueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(cqlParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(cqlParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(cqlParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(cqlParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(cqlParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(cqlParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(cqlParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(cqlParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(cqlParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(cqlParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code betweenExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBetweenExpression(cqlParser.BetweenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code betweenExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBetweenExpression(cqlParser.BetweenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code membershipExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMembershipExpression(cqlParser.MembershipExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code membershipExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMembershipExpression(cqlParser.MembershipExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code differenceBetweenExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDifferenceBetweenExpression(cqlParser.DifferenceBetweenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code differenceBetweenExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDifferenceBetweenExpression(cqlParser.DifferenceBetweenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inequalityExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInequalityExpression(cqlParser.InequalityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inequalityExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInequalityExpression(cqlParser.InequalityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(cqlParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(cqlParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code existenceExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExistenceExpression(cqlParser.ExistenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existenceExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExistenceExpression(cqlParser.ExistenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code impliesExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterImpliesExpression(cqlParser.ImpliesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code impliesExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitImpliesExpression(cqlParser.ImpliesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTermExpression(cqlParser.TermExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTermExpression(cqlParser.TermExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpression(cqlParser.TypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeExpression}
	 * labeled alternative in {@link cqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpression(cqlParser.TypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#dateTimePrecision}.
	 * @param ctx the parse tree
	 */
	void enterDateTimePrecision(cqlParser.DateTimePrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#dateTimePrecision}.
	 * @param ctx the parse tree
	 */
	void exitDateTimePrecision(cqlParser.DateTimePrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#dateTimeComponent}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeComponent(cqlParser.DateTimeComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#dateTimeComponent}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeComponent(cqlParser.DateTimeComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#pluralDateTimePrecision}.
	 * @param ctx the parse tree
	 */
	void enterPluralDateTimePrecision(cqlParser.PluralDateTimePrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#pluralDateTimePrecision}.
	 * @param ctx the parse tree
	 */
	void exitPluralDateTimePrecision(cqlParser.PluralDateTimePrecisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpressionTerm(cqlParser.AdditionExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpressionTerm(cqlParser.AdditionExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexedExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterIndexedExpressionTerm(cqlParser.IndexedExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexedExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitIndexedExpressionTerm(cqlParser.IndexedExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code widthExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterWidthExpressionTerm(cqlParser.WidthExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code widthExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitWidthExpressionTerm(cqlParser.WidthExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeUnitExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterTimeUnitExpressionTerm(cqlParser.TimeUnitExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeUnitExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitTimeUnitExpressionTerm(cqlParser.TimeUnitExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expandExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterExpandExpressionTerm(cqlParser.ExpandExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expandExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitExpandExpressionTerm(cqlParser.ExpandExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThenElseExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseExpressionTerm(cqlParser.IfThenElseExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThenElseExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseExpressionTerm(cqlParser.IfThenElseExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeBoundaryExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterTimeBoundaryExpressionTerm(cqlParser.TimeBoundaryExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeBoundaryExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitTimeBoundaryExpressionTerm(cqlParser.TimeBoundaryExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elementExtractorExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterElementExtractorExpressionTerm(cqlParser.ElementExtractorExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elementExtractorExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitElementExtractorExpressionTerm(cqlParser.ElementExtractorExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conversionExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterConversionExpressionTerm(cqlParser.ConversionExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conversionExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitConversionExpressionTerm(cqlParser.ConversionExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeExtentExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterTypeExtentExpressionTerm(cqlParser.TypeExtentExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeExtentExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitTypeExtentExpressionTerm(cqlParser.TypeExtentExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predecessorExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterPredecessorExpressionTerm(cqlParser.PredecessorExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predecessorExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitPredecessorExpressionTerm(cqlParser.PredecessorExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pointExtractorExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterPointExtractorExpressionTerm(cqlParser.PointExtractorExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pointExtractorExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitPointExtractorExpressionTerm(cqlParser.PointExtractorExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpressionTerm(cqlParser.MultiplicationExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpressionTerm(cqlParser.MultiplicationExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregateExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterAggregateExpressionTerm(cqlParser.AggregateExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitAggregateExpressionTerm(cqlParser.AggregateExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code durationExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterDurationExpressionTerm(cqlParser.DurationExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code durationExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitDurationExpressionTerm(cqlParser.DurationExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code differenceExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterDifferenceExpressionTerm(cqlParser.DifferenceExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code differenceExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitDifferenceExpressionTerm(cqlParser.DifferenceExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpressionTerm(cqlParser.CaseExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpressionTerm(cqlParser.CaseExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpressionTerm(cqlParser.PowerExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpressionTerm(cqlParser.PowerExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code successorExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterSuccessorExpressionTerm(cqlParser.SuccessorExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code successorExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitSuccessorExpressionTerm(cqlParser.SuccessorExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code polarityExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterPolarityExpressionTerm(cqlParser.PolarityExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code polarityExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitPolarityExpressionTerm(cqlParser.PolarityExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterTermExpressionTerm(cqlParser.TermExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitTermExpressionTerm(cqlParser.TermExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invocationExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void enterInvocationExpressionTerm(cqlParser.InvocationExpressionTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invocationExpressionTerm}
	 * labeled alternative in {@link cqlParser#expressionTerm}.
	 * @param ctx the parse tree
	 */
	void exitInvocationExpressionTerm(cqlParser.InvocationExpressionTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#caseExpressionItem}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpressionItem(cqlParser.CaseExpressionItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#caseExpressionItem}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpressionItem(cqlParser.CaseExpressionItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#dateTimePrecisionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDateTimePrecisionSpecifier(cqlParser.DateTimePrecisionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#dateTimePrecisionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDateTimePrecisionSpecifier(cqlParser.DateTimePrecisionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#relativeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterRelativeQualifier(cqlParser.RelativeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#relativeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitRelativeQualifier(cqlParser.RelativeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#offsetRelativeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterOffsetRelativeQualifier(cqlParser.OffsetRelativeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#offsetRelativeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitOffsetRelativeQualifier(cqlParser.OffsetRelativeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#exclusiveRelativeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveRelativeQualifier(cqlParser.ExclusiveRelativeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#exclusiveRelativeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveRelativeQualifier(cqlParser.ExclusiveRelativeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#quantityOffset}.
	 * @param ctx the parse tree
	 */
	void enterQuantityOffset(cqlParser.QuantityOffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#quantityOffset}.
	 * @param ctx the parse tree
	 */
	void exitQuantityOffset(cqlParser.QuantityOffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#temporalRelationship}.
	 * @param ctx the parse tree
	 */
	void enterTemporalRelationship(cqlParser.TemporalRelationshipContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#temporalRelationship}.
	 * @param ctx the parse tree
	 */
	void exitTemporalRelationship(cqlParser.TemporalRelationshipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concurrentWithIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void enterConcurrentWithIntervalOperatorPhrase(cqlParser.ConcurrentWithIntervalOperatorPhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concurrentWithIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void exitConcurrentWithIntervalOperatorPhrase(cqlParser.ConcurrentWithIntervalOperatorPhraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code includesIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void enterIncludesIntervalOperatorPhrase(cqlParser.IncludesIntervalOperatorPhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code includesIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void exitIncludesIntervalOperatorPhrase(cqlParser.IncludesIntervalOperatorPhraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code includedInIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void enterIncludedInIntervalOperatorPhrase(cqlParser.IncludedInIntervalOperatorPhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code includedInIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void exitIncludedInIntervalOperatorPhrase(cqlParser.IncludedInIntervalOperatorPhraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code beforeOrAfterIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void enterBeforeOrAfterIntervalOperatorPhrase(cqlParser.BeforeOrAfterIntervalOperatorPhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code beforeOrAfterIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void exitBeforeOrAfterIntervalOperatorPhrase(cqlParser.BeforeOrAfterIntervalOperatorPhraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code withinIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void enterWithinIntervalOperatorPhrase(cqlParser.WithinIntervalOperatorPhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code withinIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void exitWithinIntervalOperatorPhrase(cqlParser.WithinIntervalOperatorPhraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code meetsIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void enterMeetsIntervalOperatorPhrase(cqlParser.MeetsIntervalOperatorPhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code meetsIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void exitMeetsIntervalOperatorPhrase(cqlParser.MeetsIntervalOperatorPhraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code overlapsIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void enterOverlapsIntervalOperatorPhrase(cqlParser.OverlapsIntervalOperatorPhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code overlapsIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void exitOverlapsIntervalOperatorPhrase(cqlParser.OverlapsIntervalOperatorPhraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code startsIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void enterStartsIntervalOperatorPhrase(cqlParser.StartsIntervalOperatorPhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code startsIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void exitStartsIntervalOperatorPhrase(cqlParser.StartsIntervalOperatorPhraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code endsIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void enterEndsIntervalOperatorPhrase(cqlParser.EndsIntervalOperatorPhraseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code endsIntervalOperatorPhrase}
	 * labeled alternative in {@link cqlParser#intervalOperatorPhrase}.
	 * @param ctx the parse tree
	 */
	void exitEndsIntervalOperatorPhrase(cqlParser.EndsIntervalOperatorPhraseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invocationTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterInvocationTerm(cqlParser.InvocationTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invocationTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitInvocationTerm(cqlParser.InvocationTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterLiteralTerm(cqlParser.LiteralTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitLiteralTerm(cqlParser.LiteralTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code externalConstantTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterExternalConstantTerm(cqlParser.ExternalConstantTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code externalConstantTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitExternalConstantTerm(cqlParser.ExternalConstantTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalSelectorTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterIntervalSelectorTerm(cqlParser.IntervalSelectorTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalSelectorTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitIntervalSelectorTerm(cqlParser.IntervalSelectorTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleSelectorTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTupleSelectorTerm(cqlParser.TupleSelectorTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleSelectorTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTupleSelectorTerm(cqlParser.TupleSelectorTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instanceSelectorTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterInstanceSelectorTerm(cqlParser.InstanceSelectorTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instanceSelectorTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitInstanceSelectorTerm(cqlParser.InstanceSelectorTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listSelectorTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterListSelectorTerm(cqlParser.ListSelectorTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listSelectorTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitListSelectorTerm(cqlParser.ListSelectorTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code codeSelectorTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterCodeSelectorTerm(cqlParser.CodeSelectorTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code codeSelectorTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitCodeSelectorTerm(cqlParser.CodeSelectorTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conceptSelectorTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterConceptSelectorTerm(cqlParser.ConceptSelectorTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conceptSelectorTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitConceptSelectorTerm(cqlParser.ConceptSelectorTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedTerm(cqlParser.ParenthesizedTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedTerm}
	 * labeled alternative in {@link cqlParser#term}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedTerm(cqlParser.ParenthesizedTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#ratio}.
	 * @param ctx the parse tree
	 */
	void enterRatio(cqlParser.RatioContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#ratio}.
	 * @param ctx the parse tree
	 */
	void exitRatio(cqlParser.RatioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link cqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(cqlParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link cqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(cqlParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link cqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(cqlParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link cqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(cqlParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link cqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(cqlParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link cqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(cqlParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link cqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiteral(cqlParser.NumberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link cqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiteral(cqlParser.NumberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dateTimeLiteral}
	 * labeled alternative in {@link cqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterDateTimeLiteral(cqlParser.DateTimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dateTimeLiteral}
	 * labeled alternative in {@link cqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitDateTimeLiteral(cqlParser.DateTimeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeLiteral}
	 * labeled alternative in {@link cqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterTimeLiteral(cqlParser.TimeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeLiteral}
	 * labeled alternative in {@link cqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitTimeLiteral(cqlParser.TimeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quantityLiteral}
	 * labeled alternative in {@link cqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterQuantityLiteral(cqlParser.QuantityLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quantityLiteral}
	 * labeled alternative in {@link cqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitQuantityLiteral(cqlParser.QuantityLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ratioLiteral}
	 * labeled alternative in {@link cqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterRatioLiteral(cqlParser.RatioLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ratioLiteral}
	 * labeled alternative in {@link cqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitRatioLiteral(cqlParser.RatioLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#intervalSelector}.
	 * @param ctx the parse tree
	 */
	void enterIntervalSelector(cqlParser.IntervalSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#intervalSelector}.
	 * @param ctx the parse tree
	 */
	void exitIntervalSelector(cqlParser.IntervalSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#tupleSelector}.
	 * @param ctx the parse tree
	 */
	void enterTupleSelector(cqlParser.TupleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#tupleSelector}.
	 * @param ctx the parse tree
	 */
	void exitTupleSelector(cqlParser.TupleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#tupleElementSelector}.
	 * @param ctx the parse tree
	 */
	void enterTupleElementSelector(cqlParser.TupleElementSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#tupleElementSelector}.
	 * @param ctx the parse tree
	 */
	void exitTupleElementSelector(cqlParser.TupleElementSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#instanceSelector}.
	 * @param ctx the parse tree
	 */
	void enterInstanceSelector(cqlParser.InstanceSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#instanceSelector}.
	 * @param ctx the parse tree
	 */
	void exitInstanceSelector(cqlParser.InstanceSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#instanceElementSelector}.
	 * @param ctx the parse tree
	 */
	void enterInstanceElementSelector(cqlParser.InstanceElementSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#instanceElementSelector}.
	 * @param ctx the parse tree
	 */
	void exitInstanceElementSelector(cqlParser.InstanceElementSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#listSelector}.
	 * @param ctx the parse tree
	 */
	void enterListSelector(cqlParser.ListSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#listSelector}.
	 * @param ctx the parse tree
	 */
	void exitListSelector(cqlParser.ListSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#displayClause}.
	 * @param ctx the parse tree
	 */
	void enterDisplayClause(cqlParser.DisplayClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#displayClause}.
	 * @param ctx the parse tree
	 */
	void exitDisplayClause(cqlParser.DisplayClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#codeSelector}.
	 * @param ctx the parse tree
	 */
	void enterCodeSelector(cqlParser.CodeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#codeSelector}.
	 * @param ctx the parse tree
	 */
	void exitCodeSelector(cqlParser.CodeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#conceptSelector}.
	 * @param ctx the parse tree
	 */
	void enterConceptSelector(cqlParser.ConceptSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#conceptSelector}.
	 * @param ctx the parse tree
	 */
	void exitConceptSelector(cqlParser.ConceptSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(cqlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(cqlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#externalConstant}.
	 * @param ctx the parse tree
	 */
	void enterExternalConstant(cqlParser.ExternalConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#externalConstant}.
	 * @param ctx the parse tree
	 */
	void exitExternalConstant(cqlParser.ExternalConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberInvocation}
	 * labeled alternative in {@link cqlParser#invocation}.
	 * @param ctx the parse tree
	 */
	void enterMemberInvocation(cqlParser.MemberInvocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberInvocation}
	 * labeled alternative in {@link cqlParser#invocation}.
	 * @param ctx the parse tree
	 */
	void exitMemberInvocation(cqlParser.MemberInvocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionInvocation}
	 * labeled alternative in {@link cqlParser#invocation}.
	 * @param ctx the parse tree
	 */
	void enterFunctionInvocation(cqlParser.FunctionInvocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionInvocation}
	 * labeled alternative in {@link cqlParser#invocation}.
	 * @param ctx the parse tree
	 */
	void exitFunctionInvocation(cqlParser.FunctionInvocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisInvocation}
	 * labeled alternative in {@link cqlParser#invocation}.
	 * @param ctx the parse tree
	 */
	void enterThisInvocation(cqlParser.ThisInvocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisInvocation}
	 * labeled alternative in {@link cqlParser#invocation}.
	 * @param ctx the parse tree
	 */
	void exitThisInvocation(cqlParser.ThisInvocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexInvocation}
	 * labeled alternative in {@link cqlParser#invocation}.
	 * @param ctx the parse tree
	 */
	void enterIndexInvocation(cqlParser.IndexInvocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexInvocation}
	 * labeled alternative in {@link cqlParser#invocation}.
	 * @param ctx the parse tree
	 */
	void exitIndexInvocation(cqlParser.IndexInvocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code totalInvocation}
	 * labeled alternative in {@link cqlParser#invocation}.
	 * @param ctx the parse tree
	 */
	void enterTotalInvocation(cqlParser.TotalInvocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code totalInvocation}
	 * labeled alternative in {@link cqlParser#invocation}.
	 * @param ctx the parse tree
	 */
	void exitTotalInvocation(cqlParser.TotalInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(cqlParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(cqlParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(cqlParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(cqlParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#quantity}.
	 * @param ctx the parse tree
	 */
	void enterQuantity(cqlParser.QuantityContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#quantity}.
	 * @param ctx the parse tree
	 */
	void exitQuantity(cqlParser.QuantityContext ctx);
	/**
	 * Enter a parse tree produced by {@link cqlParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(cqlParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link cqlParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(cqlParser.UnitContext ctx);
}