package antlr4;

// Generated from cql.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, T__134=135, T__135=136, T__136=137, 
		T__137=138, T__138=139, T__139=140, T__140=141, T__141=142, T__142=143, 
		T__143=144, T__144=145, T__145=146, T__146=147, T__147=148, T__148=149, 
		T__149=150, T__150=151, T__151=152, DATETIME=153, TIME=154, IDENTIFIER=155, 
		QUOTEDIDENTIFIER=156, STRING=157, NUMBER=158, WS=159, COMMENT=160, LINE_COMMENT=161;
	public static final int
		RULE_library = 0, RULE_libraryDefinition = 1, RULE_usingDefinition = 2, 
		RULE_includeDefinition = 3, RULE_localIdentifier = 4, RULE_accessModifier = 5, 
		RULE_parameterDefinition = 6, RULE_codesystemDefinition = 7, RULE_valuesetDefinition = 8, 
		RULE_codesystems = 9, RULE_codesystemIdentifier = 10, RULE_libraryIdentifier = 11, 
		RULE_codeDefinition = 12, RULE_conceptDefinition = 13, RULE_codeIdentifier = 14, 
		RULE_codesystemId = 15, RULE_valuesetId = 16, RULE_versionSpecifier = 17, 
		RULE_codeId = 18, RULE_typeSpecifier = 19, RULE_namedTypeSpecifier = 20, 
		RULE_modelIdentifier = 21, RULE_listTypeSpecifier = 22, RULE_intervalTypeSpecifier = 23, 
		RULE_tupleTypeSpecifier = 24, RULE_tupleElementDefinition = 25, RULE_choiceTypeSpecifier = 26, 
		RULE_statement = 27, RULE_expressionDefinition = 28, RULE_contextDefinition = 29, 
		RULE_functionDefinition = 30, RULE_operandDefinition = 31, RULE_functionBody = 32, 
		RULE_querySource = 33, RULE_aliasedQuerySource = 34, RULE_alias = 35, 
		RULE_queryInclusionClause = 36, RULE_withClause = 37, RULE_withoutClause = 38, 
		RULE_retrieve = 39, RULE_codePath = 40, RULE_terminology = 41, RULE_qualifier = 42, 
		RULE_query = 43, RULE_sourceClause = 44, RULE_singleSourceClause = 45, 
		RULE_multipleSourceClause = 46, RULE_letClause = 47, RULE_letClauseItem = 48, 
		RULE_whereClause = 49, RULE_returnClause = 50, RULE_sortClause = 51, RULE_sortDirection = 52, 
		RULE_sortByItem = 53, RULE_qualifiedIdentifier = 54, RULE_expression = 55, 
		RULE_dateTimePrecision = 56, RULE_dateTimeComponent = 57, RULE_pluralDateTimePrecision = 58, 
		RULE_expressionTerm = 59, RULE_caseExpressionItem = 60, RULE_dateTimePrecisionSpecifier = 61, 
		RULE_relativeQualifier = 62, RULE_offsetRelativeQualifier = 63, RULE_exclusiveRelativeQualifier = 64, 
		RULE_quantityOffset = 65, RULE_temporalRelationship = 66, RULE_intervalOperatorPhrase = 67, 
		RULE_term = 68, RULE_ratio = 69, RULE_literal = 70, RULE_intervalSelector = 71, 
		RULE_tupleSelector = 72, RULE_tupleElementSelector = 73, RULE_instanceSelector = 74, 
		RULE_instanceElementSelector = 75, RULE_listSelector = 76, RULE_displayClause = 77, 
		RULE_codeSelector = 78, RULE_conceptSelector = 79, RULE_identifier = 80, 
		RULE_externalConstant = 81, RULE_invocation = 82, RULE_function = 83, 
		RULE_paramList = 84, RULE_quantity = 85, RULE_unit = 86;
	public static final String[] ruleNames = {
		"library", "libraryDefinition", "usingDefinition", "includeDefinition", 
		"localIdentifier", "accessModifier", "parameterDefinition", "codesystemDefinition", 
		"valuesetDefinition", "codesystems", "codesystemIdentifier", "libraryIdentifier", 
		"codeDefinition", "conceptDefinition", "codeIdentifier", "codesystemId", 
		"valuesetId", "versionSpecifier", "codeId", "typeSpecifier", "namedTypeSpecifier", 
		"modelIdentifier", "listTypeSpecifier", "intervalTypeSpecifier", "tupleTypeSpecifier", 
		"tupleElementDefinition", "choiceTypeSpecifier", "statement", "expressionDefinition", 
		"contextDefinition", "functionDefinition", "operandDefinition", "functionBody", 
		"querySource", "aliasedQuerySource", "alias", "queryInclusionClause", 
		"withClause", "withoutClause", "retrieve", "codePath", "terminology", 
		"qualifier", "query", "sourceClause", "singleSourceClause", "multipleSourceClause", 
		"letClause", "letClauseItem", "whereClause", "returnClause", "sortClause", 
		"sortDirection", "sortByItem", "qualifiedIdentifier", "expression", "dateTimePrecision", 
		"dateTimeComponent", "pluralDateTimePrecision", "expressionTerm", "caseExpressionItem", 
		"dateTimePrecisionSpecifier", "relativeQualifier", "offsetRelativeQualifier", 
		"exclusiveRelativeQualifier", "quantityOffset", "temporalRelationship", 
		"intervalOperatorPhrase", "term", "ratio", "literal", "intervalSelector", 
		"tupleSelector", "tupleElementSelector", "instanceSelector", "instanceElementSelector", 
		"listSelector", "displayClause", "codeSelector", "conceptSelector", "identifier", 
		"externalConstant", "invocation", "function", "paramList", "quantity", 
		"unit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'library'", "'version'", "'using'", "'include'", "'called'", "'public'", 
		"'private'", "'parameter'", "'default'", "'codesystem'", "':'", "'valueset'", 
		"'codesystems'", "'{'", "','", "'}'", "'.'", "'code'", "'from'", "'concept'", 
		"'List'", "'<'", "'>'", "'Interval'", "'Tuple'", "'Choice'", "'define'", 
		"'context'", "'function'", "'('", "')'", "'returns'", "'external'", "'with'", 
		"'such that'", "'without'", "'['", "'in'", "']'", "'let'", "'where'", 
		"'return'", "'all'", "'distinct'", "'sort'", "'by'", "'asc'", "'ascending'", 
		"'desc'", "'descending'", "'is'", "'not'", "'null'", "'true'", "'false'", 
		"'as'", "'cast'", "'exists'", "'properly'", "'between'", "'and'", "'duration'", 
		"'difference'", "'<='", "'>='", "'='", "'!='", "'~'", "'!~'", "'contains'", 
		"'or'", "'xor'", "'implies'", "'|'", "'union'", "'intersect'", "'except'", 
		"'year'", "'month'", "'week'", "'day'", "'hour'", "'minute'", "'second'", 
		"'millisecond'", "'date'", "'time'", "'timezone'", "'years'", "'months'", 
		"'weeks'", "'days'", "'hours'", "'minutes'", "'seconds'", "'milliseconds'", 
		"'convert'", "'to'", "'+'", "'-'", "'start'", "'end'", "'of'", "'width'", 
		"'successor'", "'predecessor'", "'singleton'", "'point'", "'minimum'", 
		"'maximum'", "'^'", "'*'", "'/'", "'div'", "'mod'", "'&'", "'if'", "'then'", 
		"'else'", "'case'", "'collapse'", "'flatten'", "'expand'", "'per'", "'when'", 
		"'or before'", "'or after'", "'or more'", "'or less'", "'less than'", 
		"'more than'", "'on or'", "'before'", "'after'", "'or on'", "'starts'", 
		"'ends'", "'occurs'", "'same'", "'includes'", "'during'", "'included in'", 
		"'within'", "'meets'", "'overlaps'", "'display'", "'Code'", "'Concept'", 
		"'%'", "'$this'", "'$index'", "'$total'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "DATETIME", "TIME", 
		"IDENTIFIER", "QUOTEDIDENTIFIER", "STRING", "NUMBER", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "cql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LibraryContext extends ParserRuleContext {
		public LibraryDefinitionContext libraryDefinition() {
			return getRuleContext(LibraryDefinitionContext.class,0);
		}
		public List<UsingDefinitionContext> usingDefinition() {
			return getRuleContexts(UsingDefinitionContext.class);
		}
		public UsingDefinitionContext usingDefinition(int i) {
			return getRuleContext(UsingDefinitionContext.class,i);
		}
		public List<IncludeDefinitionContext> includeDefinition() {
			return getRuleContexts(IncludeDefinitionContext.class);
		}
		public IncludeDefinitionContext includeDefinition(int i) {
			return getRuleContext(IncludeDefinitionContext.class,i);
		}
		public List<CodesystemDefinitionContext> codesystemDefinition() {
			return getRuleContexts(CodesystemDefinitionContext.class);
		}
		public CodesystemDefinitionContext codesystemDefinition(int i) {
			return getRuleContext(CodesystemDefinitionContext.class,i);
		}
		public List<ValuesetDefinitionContext> valuesetDefinition() {
			return getRuleContexts(ValuesetDefinitionContext.class);
		}
		public ValuesetDefinitionContext valuesetDefinition(int i) {
			return getRuleContext(ValuesetDefinitionContext.class,i);
		}
		public List<CodeDefinitionContext> codeDefinition() {
			return getRuleContexts(CodeDefinitionContext.class);
		}
		public CodeDefinitionContext codeDefinition(int i) {
			return getRuleContext(CodeDefinitionContext.class,i);
		}
		public List<ConceptDefinitionContext> conceptDefinition() {
			return getRuleContexts(ConceptDefinitionContext.class);
		}
		public ConceptDefinitionContext conceptDefinition(int i) {
			return getRuleContext(ConceptDefinitionContext.class,i);
		}
		public List<ParameterDefinitionContext> parameterDefinition() {
			return getRuleContexts(ParameterDefinitionContext.class);
		}
		public ParameterDefinitionContext parameterDefinition(int i) {
			return getRuleContext(ParameterDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LibraryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_library; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterLibrary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitLibrary(this);
		}
	}

	public final LibraryContext library() throws RecognitionException {
		LibraryContext _localctx = new LibraryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_library);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(174);
				libraryDefinition();
				}
			}

			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(177);
				usingDefinition();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(183);
				includeDefinition();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189);
					codesystemDefinition();
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(195);
					valuesetDefinition();
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(201);
					codeDefinition();
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					conceptDefinition();
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				{
				setState(213);
				parameterDefinition();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26 || _la==T__27) {
				{
				{
				setState(219);
				statement();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibraryDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VersionSpecifierContext versionSpecifier() {
			return getRuleContext(VersionSpecifierContext.class,0);
		}
		public LibraryDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterLibraryDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitLibraryDefinition(this);
		}
	}

	public final LibraryDefinitionContext libraryDefinition() throws RecognitionException {
		LibraryDefinitionContext _localctx = new LibraryDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_libraryDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__0);
			setState(226);
			identifier();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(227);
				match(T__1);
				setState(228);
				versionSpecifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingDefinitionContext extends ParserRuleContext {
		public ModelIdentifierContext modelIdentifier() {
			return getRuleContext(ModelIdentifierContext.class,0);
		}
		public VersionSpecifierContext versionSpecifier() {
			return getRuleContext(VersionSpecifierContext.class,0);
		}
		public UsingDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterUsingDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitUsingDefinition(this);
		}
	}

	public final UsingDefinitionContext usingDefinition() throws RecognitionException {
		UsingDefinitionContext _localctx = new UsingDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_usingDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__2);
			setState(232);
			modelIdentifier();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(233);
				match(T__1);
				setState(234);
				versionSpecifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IncludeDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VersionSpecifierContext versionSpecifier() {
			return getRuleContext(VersionSpecifierContext.class,0);
		}
		public LocalIdentifierContext localIdentifier() {
			return getRuleContext(LocalIdentifierContext.class,0);
		}
		public IncludeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterIncludeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitIncludeDefinition(this);
		}
	}

	public final IncludeDefinitionContext includeDefinition() throws RecognitionException {
		IncludeDefinitionContext _localctx = new IncludeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_includeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__3);
			setState(238);
			identifier();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(239);
				match(T__1);
				setState(240);
				versionSpecifier();
				}
			}

			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(243);
				match(T__4);
				setState(244);
				localIdentifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LocalIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterLocalIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitLocalIdentifier(this);
		}
	}

	public final LocalIdentifierContext localIdentifier() throws RecognitionException {
		LocalIdentifierContext _localctx = new LocalIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_localIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessModifierContext extends ParserRuleContext {
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitAccessModifier(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterParameterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitParameterDefinition(this);
		}
	}

	public final ParameterDefinitionContext parameterDefinition() throws RecognitionException {
		ParameterDefinitionContext _localctx = new ParameterDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameterDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(251);
				accessModifier();
				}
			}

			setState(254);
			match(T__7);
			setState(255);
			identifier();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__51))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__85 - 70)) | (1L << (T__86 - 70)) | (1L << (T__87 - 70)) | (1L << (T__100 - 70)) | (1L << (T__101 - 70)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (T__145 - 146)) | (1L << (T__146 - 146)) | (1L << (T__147 - 146)) | (1L << (IDENTIFIER - 146)) | (1L << (QUOTEDIDENTIFIER - 146)))) != 0)) {
				{
				setState(256);
				typeSpecifier();
				}
			}

			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(259);
				match(T__8);
				setState(260);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodesystemDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CodesystemIdContext codesystemId() {
			return getRuleContext(CodesystemIdContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public VersionSpecifierContext versionSpecifier() {
			return getRuleContext(VersionSpecifierContext.class,0);
		}
		public CodesystemDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codesystemDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterCodesystemDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitCodesystemDefinition(this);
		}
	}

	public final CodesystemDefinitionContext codesystemDefinition() throws RecognitionException {
		CodesystemDefinitionContext _localctx = new CodesystemDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_codesystemDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(263);
				accessModifier();
				}
			}

			setState(266);
			match(T__9);
			setState(267);
			identifier();
			setState(268);
			match(T__10);
			setState(269);
			codesystemId();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(270);
				match(T__1);
				setState(271);
				versionSpecifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesetDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValuesetIdContext valuesetId() {
			return getRuleContext(ValuesetIdContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public VersionSpecifierContext versionSpecifier() {
			return getRuleContext(VersionSpecifierContext.class,0);
		}
		public CodesystemsContext codesystems() {
			return getRuleContext(CodesystemsContext.class,0);
		}
		public ValuesetDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesetDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterValuesetDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitValuesetDefinition(this);
		}
	}

	public final ValuesetDefinitionContext valuesetDefinition() throws RecognitionException {
		ValuesetDefinitionContext _localctx = new ValuesetDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valuesetDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(274);
				accessModifier();
				}
			}

			setState(277);
			match(T__11);
			setState(278);
			identifier();
			setState(279);
			match(T__10);
			setState(280);
			valuesetId();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(281);
				match(T__1);
				setState(282);
				versionSpecifier();
				}
			}

			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(285);
				codesystems();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodesystemsContext extends ParserRuleContext {
		public List<CodesystemIdentifierContext> codesystemIdentifier() {
			return getRuleContexts(CodesystemIdentifierContext.class);
		}
		public CodesystemIdentifierContext codesystemIdentifier(int i) {
			return getRuleContext(CodesystemIdentifierContext.class,i);
		}
		public CodesystemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codesystems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterCodesystems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitCodesystems(this);
		}
	}

	public final CodesystemsContext codesystems() throws RecognitionException {
		CodesystemsContext _localctx = new CodesystemsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_codesystems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__12);
			setState(289);
			match(T__13);
			setState(290);
			codesystemIdentifier();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(291);
				match(T__14);
				setState(292);
				codesystemIdentifier();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodesystemIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LibraryIdentifierContext libraryIdentifier() {
			return getRuleContext(LibraryIdentifierContext.class,0);
		}
		public CodesystemIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codesystemIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterCodesystemIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitCodesystemIdentifier(this);
		}
	}

	public final CodesystemIdentifierContext codesystemIdentifier() throws RecognitionException {
		CodesystemIdentifierContext _localctx = new CodesystemIdentifierContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_codesystemIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(300);
				libraryIdentifier();
				setState(301);
				match(T__16);
				}
				break;
			}
			setState(305);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LibraryIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LibraryIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterLibraryIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitLibraryIdentifier(this);
		}
	}

	public final LibraryIdentifierContext libraryIdentifier() throws RecognitionException {
		LibraryIdentifierContext _localctx = new LibraryIdentifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_libraryIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CodeIdContext codeId() {
			return getRuleContext(CodeIdContext.class,0);
		}
		public CodesystemIdentifierContext codesystemIdentifier() {
			return getRuleContext(CodesystemIdentifierContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public DisplayClauseContext displayClause() {
			return getRuleContext(DisplayClauseContext.class,0);
		}
		public CodeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterCodeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitCodeDefinition(this);
		}
	}

	public final CodeDefinitionContext codeDefinition() throws RecognitionException {
		CodeDefinitionContext _localctx = new CodeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_codeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(309);
				accessModifier();
				}
			}

			setState(312);
			match(T__17);
			setState(313);
			identifier();
			setState(314);
			match(T__10);
			setState(315);
			codeId();
			setState(316);
			match(T__18);
			setState(317);
			codesystemIdentifier();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__145) {
				{
				setState(318);
				displayClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConceptDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<CodeIdentifierContext> codeIdentifier() {
			return getRuleContexts(CodeIdentifierContext.class);
		}
		public CodeIdentifierContext codeIdentifier(int i) {
			return getRuleContext(CodeIdentifierContext.class,i);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public DisplayClauseContext displayClause() {
			return getRuleContext(DisplayClauseContext.class,0);
		}
		public ConceptDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conceptDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterConceptDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitConceptDefinition(this);
		}
	}

	public final ConceptDefinitionContext conceptDefinition() throws RecognitionException {
		ConceptDefinitionContext _localctx = new ConceptDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conceptDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(321);
				accessModifier();
				}
			}

			setState(324);
			match(T__19);
			setState(325);
			identifier();
			setState(326);
			match(T__10);
			setState(327);
			match(T__13);
			setState(328);
			codeIdentifier();
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(329);
				match(T__14);
				setState(330);
				codeIdentifier();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(T__15);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__145) {
				{
				setState(337);
				displayClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LibraryIdentifierContext libraryIdentifier() {
			return getRuleContext(LibraryIdentifierContext.class,0);
		}
		public CodeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterCodeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitCodeIdentifier(this);
		}
	}

	public final CodeIdentifierContext codeIdentifier() throws RecognitionException {
		CodeIdentifierContext _localctx = new CodeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_codeIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(340);
				libraryIdentifier();
				setState(341);
				match(T__16);
				}
				break;
			}
			setState(345);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodesystemIdContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(cqlParser.STRING, 0); }
		public CodesystemIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codesystemId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterCodesystemId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitCodesystemId(this);
		}
	}

	public final CodesystemIdContext codesystemId() throws RecognitionException {
		CodesystemIdContext _localctx = new CodesystemIdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_codesystemId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesetIdContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(cqlParser.STRING, 0); }
		public ValuesetIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesetId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterValuesetId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitValuesetId(this);
		}
	}

	public final ValuesetIdContext valuesetId() throws RecognitionException {
		ValuesetIdContext _localctx = new ValuesetIdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valuesetId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersionSpecifierContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(cqlParser.STRING, 0); }
		public VersionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterVersionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitVersionSpecifier(this);
		}
	}

	public final VersionSpecifierContext versionSpecifier() throws RecognitionException {
		VersionSpecifierContext _localctx = new VersionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_versionSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeIdContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(cqlParser.STRING, 0); }
		public CodeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterCodeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitCodeId(this);
		}
	}

	public final CodeIdContext codeId() throws RecognitionException {
		CodeIdContext _localctx = new CodeIdContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_codeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public NamedTypeSpecifierContext namedTypeSpecifier() {
			return getRuleContext(NamedTypeSpecifierContext.class,0);
		}
		public ListTypeSpecifierContext listTypeSpecifier() {
			return getRuleContext(ListTypeSpecifierContext.class,0);
		}
		public IntervalTypeSpecifierContext intervalTypeSpecifier() {
			return getRuleContext(IntervalTypeSpecifierContext.class,0);
		}
		public TupleTypeSpecifierContext tupleTypeSpecifier() {
			return getRuleContext(TupleTypeSpecifierContext.class,0);
		}
		public ChoiceTypeSpecifierContext choiceTypeSpecifier() {
			return getRuleContext(ChoiceTypeSpecifierContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeSpecifier);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__17:
			case T__19:
			case T__40:
			case T__42:
			case T__43:
			case T__51:
			case T__69:
			case T__85:
			case T__86:
			case T__87:
			case T__100:
			case T__101:
			case T__145:
			case T__146:
			case T__147:
			case IDENTIFIER:
			case QUOTEDIDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				namedTypeSpecifier();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				listTypeSpecifier();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				intervalTypeSpecifier();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				tupleTypeSpecifier();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(359);
				choiceTypeSpecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedTypeSpecifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<QualifierContext> qualifier() {
			return getRuleContexts(QualifierContext.class);
		}
		public QualifierContext qualifier(int i) {
			return getRuleContext(QualifierContext.class,i);
		}
		public NamedTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterNamedTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitNamedTypeSpecifier(this);
		}
	}

	public final NamedTypeSpecifierContext namedTypeSpecifier() throws RecognitionException {
		NamedTypeSpecifierContext _localctx = new NamedTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_namedTypeSpecifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(362);
					qualifier();
					setState(363);
					match(T__16);
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(370);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModelIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ModelIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterModelIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitModelIdentifier(this);
		}
	}

	public final ModelIdentifierContext modelIdentifier() throws RecognitionException {
		ModelIdentifierContext _localctx = new ModelIdentifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_modelIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListTypeSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ListTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterListTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitListTypeSpecifier(this);
		}
	}

	public final ListTypeSpecifierContext listTypeSpecifier() throws RecognitionException {
		ListTypeSpecifierContext _localctx = new ListTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_listTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__20);
			setState(375);
			match(T__21);
			setState(376);
			typeSpecifier();
			setState(377);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalTypeSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public IntervalTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterIntervalTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitIntervalTypeSpecifier(this);
		}
	}

	public final IntervalTypeSpecifierContext intervalTypeSpecifier() throws RecognitionException {
		IntervalTypeSpecifierContext _localctx = new IntervalTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_intervalTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__23);
			setState(380);
			match(T__21);
			setState(381);
			typeSpecifier();
			setState(382);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeSpecifierContext extends ParserRuleContext {
		public List<TupleElementDefinitionContext> tupleElementDefinition() {
			return getRuleContexts(TupleElementDefinitionContext.class);
		}
		public TupleElementDefinitionContext tupleElementDefinition(int i) {
			return getRuleContext(TupleElementDefinitionContext.class,i);
		}
		public TupleTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterTupleTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitTupleTypeSpecifier(this);
		}
	}

	public final TupleTypeSpecifierContext tupleTypeSpecifier() throws RecognitionException {
		TupleTypeSpecifierContext _localctx = new TupleTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tupleTypeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__24);
			setState(385);
			match(T__13);
			setState(386);
			tupleElementDefinition();
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(387);
				match(T__14);
				setState(388);
				tupleElementDefinition();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleElementDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TupleElementDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleElementDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterTupleElementDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitTupleElementDefinition(this);
		}
	}

	public final TupleElementDefinitionContext tupleElementDefinition() throws RecognitionException {
		TupleElementDefinitionContext _localctx = new TupleElementDefinitionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tupleElementDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			identifier();
			setState(397);
			typeSpecifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChoiceTypeSpecifierContext extends ParserRuleContext {
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public ChoiceTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choiceTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterChoiceTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitChoiceTypeSpecifier(this);
		}
	}

	public final ChoiceTypeSpecifierContext choiceTypeSpecifier() throws RecognitionException {
		ChoiceTypeSpecifierContext _localctx = new ChoiceTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_choiceTypeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(T__25);
			setState(400);
			match(T__21);
			setState(401);
			typeSpecifier();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(402);
				match(T__14);
				setState(403);
				typeSpecifier();
				}
				}
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(409);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public ExpressionDefinitionContext expressionDefinition() {
			return getRuleContext(ExpressionDefinitionContext.class,0);
		}
		public ContextDefinitionContext contextDefinition() {
			return getRuleContext(ContextDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				expressionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				contextDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				functionDefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public ExpressionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterExpressionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitExpressionDefinition(this);
		}
	}

	public final ExpressionDefinitionContext expressionDefinition() throws RecognitionException {
		ExpressionDefinitionContext _localctx = new ExpressionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expressionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T__26);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(417);
				accessModifier();
				}
			}

			setState(420);
			identifier();
			setState(421);
			match(T__10);
			setState(422);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContextDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ContextDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterContextDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitContextDefinition(this);
		}
	}

	public final ContextDefinitionContext contextDefinition() throws RecognitionException {
		ContextDefinitionContext _localctx = new ContextDefinitionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_contextDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(T__27);
			setState(425);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public List<OperandDefinitionContext> operandDefinition() {
			return getRuleContexts(OperandDefinitionContext.class);
		}
		public OperandDefinitionContext operandDefinition(int i) {
			return getRuleContext(OperandDefinitionContext.class,i);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(T__26);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5 || _la==T__6) {
				{
				setState(428);
				accessModifier();
				}
			}

			setState(431);
			match(T__28);
			setState(432);
			identifier();
			setState(433);
			match(T__29);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__17) | (1L << T__19) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__51))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__85 - 70)) | (1L << (T__86 - 70)) | (1L << (T__87 - 70)) | (1L << (T__100 - 70)) | (1L << (T__101 - 70)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (T__145 - 146)) | (1L << (T__146 - 146)) | (1L << (T__147 - 146)) | (1L << (IDENTIFIER - 146)) | (1L << (QUOTEDIDENTIFIER - 146)))) != 0)) {
				{
				setState(434);
				operandDefinition();
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(435);
					match(T__14);
					setState(436);
					operandDefinition();
					}
					}
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(444);
			match(T__30);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(445);
				match(T__31);
				setState(446);
				typeSpecifier();
				}
			}

			setState(449);
			match(T__10);
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__13:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__23:
			case T__24:
			case T__29:
			case T__36:
			case T__40:
			case T__42:
			case T__43:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__56:
			case T__57:
			case T__61:
			case T__62:
			case T__69:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__108:
			case T__109:
			case T__116:
			case T__119:
			case T__120:
			case T__121:
			case T__122:
			case T__145:
			case T__146:
			case T__147:
			case T__148:
			case T__149:
			case T__150:
			case T__151:
			case DATETIME:
			case TIME:
			case IDENTIFIER:
			case QUOTEDIDENTIFIER:
			case STRING:
			case NUMBER:
				{
				setState(450);
				functionBody();
				}
				break;
			case T__32:
				{
				setState(451);
				match(T__32);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public OperandDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterOperandDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitOperandDefinition(this);
		}
	}

	public final OperandDefinitionContext operandDefinition() throws RecognitionException {
		OperandDefinitionContext _localctx = new OperandDefinitionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operandDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			identifier();
			setState(455);
			typeSpecifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySourceContext extends ParserRuleContext {
		public RetrieveContext retrieve() {
			return getRuleContext(RetrieveContext.class,0);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public QuerySourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterQuerySource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitQuerySource(this);
		}
	}

	public final QuerySourceContext querySource() throws RecognitionException {
		QuerySourceContext _localctx = new QuerySourceContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_querySource);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				retrieve();
				}
				break;
			case T__1:
			case T__17:
			case T__19:
			case T__40:
			case T__42:
			case T__43:
			case T__51:
			case T__69:
			case T__85:
			case T__86:
			case T__87:
			case T__100:
			case T__101:
			case T__145:
			case T__146:
			case T__147:
			case IDENTIFIER:
			case QUOTEDIDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				qualifiedIdentifier();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				match(T__29);
				setState(462);
				expression(0);
				setState(463);
				match(T__30);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasedQuerySourceContext extends ParserRuleContext {
		public QuerySourceContext querySource() {
			return getRuleContext(QuerySourceContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public AliasedQuerySourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasedQuerySource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterAliasedQuerySource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitAliasedQuerySource(this);
		}
	}

	public final AliasedQuerySourceContext aliasedQuerySource() throws RecognitionException {
		AliasedQuerySourceContext _localctx = new AliasedQuerySourceContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_aliasedQuerySource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			querySource();
			setState(468);
			alias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitAlias(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryInclusionClauseContext extends ParserRuleContext {
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public WithoutClauseContext withoutClause() {
			return getRuleContext(WithoutClauseContext.class,0);
		}
		public QueryInclusionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryInclusionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterQueryInclusionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitQueryInclusionClause(this);
		}
	}

	public final QueryInclusionClauseContext queryInclusionClause() throws RecognitionException {
		QueryInclusionClauseContext _localctx = new QueryInclusionClauseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_queryInclusionClause);
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				withClause();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				withoutClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithClauseContext extends ParserRuleContext {
		public AliasedQuerySourceContext aliasedQuerySource() {
			return getRuleContext(AliasedQuerySourceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterWithClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitWithClause(this);
		}
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_withClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(T__33);
			setState(477);
			aliasedQuerySource();
			setState(478);
			match(T__34);
			setState(479);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithoutClauseContext extends ParserRuleContext {
		public AliasedQuerySourceContext aliasedQuerySource() {
			return getRuleContext(AliasedQuerySourceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WithoutClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withoutClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterWithoutClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitWithoutClause(this);
		}
	}

	public final WithoutClauseContext withoutClause() throws RecognitionException {
		WithoutClauseContext _localctx = new WithoutClauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_withoutClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(T__35);
			setState(482);
			aliasedQuerySource();
			setState(483);
			match(T__34);
			setState(484);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetrieveContext extends ParserRuleContext {
		public NamedTypeSpecifierContext namedTypeSpecifier() {
			return getRuleContext(NamedTypeSpecifierContext.class,0);
		}
		public TerminologyContext terminology() {
			return getRuleContext(TerminologyContext.class,0);
		}
		public CodePathContext codePath() {
			return getRuleContext(CodePathContext.class,0);
		}
		public RetrieveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retrieve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterRetrieve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitRetrieve(this);
		}
	}

	public final RetrieveContext retrieve() throws RecognitionException {
		RetrieveContext _localctx = new RetrieveContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_retrieve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(T__36);
			setState(487);
			namedTypeSpecifier();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(488);
				match(T__10);
				setState(492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(489);
					codePath();
					setState(490);
					match(T__37);
					}
					break;
				}
				setState(494);
				terminology();
				}
			}

			setState(497);
			match(T__38);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodePathContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CodePathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codePath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterCodePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitCodePath(this);
		}
	}

	public final CodePathContext codePath() throws RecognitionException {
		CodePathContext _localctx = new CodePathContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_codePath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TerminologyContext extends ParserRuleContext {
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminologyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminology; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterTerminology(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitTerminology(this);
		}
	}

	public final TerminologyContext terminology() throws RecognitionException {
		TerminologyContext _localctx = new TerminologyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_terminology);
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				qualifiedIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(502);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitQualifier(this);
		}
	}

	public final QualifierContext qualifier() throws RecognitionException {
		QualifierContext _localctx = new QualifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_qualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public SourceClauseContext sourceClause() {
			return getRuleContext(SourceClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public List<QueryInclusionClauseContext> queryInclusionClause() {
			return getRuleContexts(QueryInclusionClauseContext.class);
		}
		public QueryInclusionClauseContext queryInclusionClause(int i) {
			return getRuleContext(QueryInclusionClauseContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public SortClauseContext sortClause() {
			return getRuleContext(SortClauseContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_query);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			sourceClause();
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(508);
				letClause();
				}
				break;
			}
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(511);
					queryInclusionClause();
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(517);
				whereClause();
				}
				break;
			}
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(520);
				returnClause();
				}
				break;
			}
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(523);
				sortClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceClauseContext extends ParserRuleContext {
		public SingleSourceClauseContext singleSourceClause() {
			return getRuleContext(SingleSourceClauseContext.class,0);
		}
		public MultipleSourceClauseContext multipleSourceClause() {
			return getRuleContext(MultipleSourceClauseContext.class,0);
		}
		public SourceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterSourceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitSourceClause(this);
		}
	}

	public final SourceClauseContext sourceClause() throws RecognitionException {
		SourceClauseContext _localctx = new SourceClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_sourceClause);
		try {
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__17:
			case T__19:
			case T__29:
			case T__36:
			case T__40:
			case T__42:
			case T__43:
			case T__51:
			case T__69:
			case T__85:
			case T__86:
			case T__87:
			case T__100:
			case T__101:
			case T__145:
			case T__146:
			case T__147:
			case IDENTIFIER:
			case QUOTEDIDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				singleSourceClause();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				multipleSourceClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleSourceClauseContext extends ParserRuleContext {
		public AliasedQuerySourceContext aliasedQuerySource() {
			return getRuleContext(AliasedQuerySourceContext.class,0);
		}
		public SingleSourceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleSourceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterSingleSourceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitSingleSourceClause(this);
		}
	}

	public final SingleSourceClauseContext singleSourceClause() throws RecognitionException {
		SingleSourceClauseContext _localctx = new SingleSourceClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_singleSourceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			aliasedQuerySource();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipleSourceClauseContext extends ParserRuleContext {
		public List<AliasedQuerySourceContext> aliasedQuerySource() {
			return getRuleContexts(AliasedQuerySourceContext.class);
		}
		public AliasedQuerySourceContext aliasedQuerySource(int i) {
			return getRuleContext(AliasedQuerySourceContext.class,i);
		}
		public MultipleSourceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleSourceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterMultipleSourceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitMultipleSourceClause(this);
		}
	}

	public final MultipleSourceClauseContext multipleSourceClause() throws RecognitionException {
		MultipleSourceClauseContext _localctx = new MultipleSourceClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_multipleSourceClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(T__18);
			setState(533);
			aliasedQuerySource();
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(534);
					match(T__14);
					setState(535);
					aliasedQuerySource();
					}
					} 
				}
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetClauseContext extends ParserRuleContext {
		public List<LetClauseItemContext> letClauseItem() {
			return getRuleContexts(LetClauseItemContext.class);
		}
		public LetClauseItemContext letClauseItem(int i) {
			return getRuleContext(LetClauseItemContext.class,i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitLetClause(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_letClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(T__39);
			setState(542);
			letClauseItem();
			setState(547);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(543);
					match(T__14);
					setState(544);
					letClauseItem();
					}
					} 
				}
				setState(549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetClauseItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LetClauseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClauseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterLetClauseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitLetClauseItem(this);
		}
	}

	public final LetClauseItemContext letClauseItem() throws RecognitionException {
		LetClauseItemContext _localctx = new LetClauseItemContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_letClauseItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			identifier();
			setState(551);
			match(T__10);
			setState(552);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(T__40);
			setState(555);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnClauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitReturnClause(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_returnClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(T__41);
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(558);
				_la = _input.LA(1);
				if ( !(_la==T__42 || _la==T__43) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(561);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortClauseContext extends ParserRuleContext {
		public SortDirectionContext sortDirection() {
			return getRuleContext(SortDirectionContext.class,0);
		}
		public List<SortByItemContext> sortByItem() {
			return getRuleContexts(SortByItemContext.class);
		}
		public SortByItemContext sortByItem(int i) {
			return getRuleContext(SortByItemContext.class,i);
		}
		public SortClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterSortClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitSortClause(this);
		}
	}

	public final SortClauseContext sortClause() throws RecognitionException {
		SortClauseContext _localctx = new SortClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_sortClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(T__44);
			setState(574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__46:
			case T__47:
			case T__48:
			case T__49:
				{
				setState(564);
				sortDirection();
				}
				break;
			case T__45:
				{
				{
				setState(565);
				match(T__45);
				setState(566);
				sortByItem();
				setState(571);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(567);
						match(T__14);
						setState(568);
						sortByItem();
						}
						} 
					}
					setState(573);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortDirectionContext extends ParserRuleContext {
		public SortDirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortDirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterSortDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitSortDirection(this);
		}
	}

	public final SortDirectionContext sortDirection() throws RecognitionException {
		SortDirectionContext _localctx = new SortDirectionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_sortDirection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortByItemContext extends ParserRuleContext {
		public ExpressionTermContext expressionTerm() {
			return getRuleContext(ExpressionTermContext.class,0);
		}
		public SortDirectionContext sortDirection() {
			return getRuleContext(SortDirectionContext.class,0);
		}
		public SortByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortByItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterSortByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitSortByItem(this);
		}
	}

	public final SortByItemContext sortByItem() throws RecognitionException {
		SortByItemContext _localctx = new SortByItemContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_sortByItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			expressionTerm(0);
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(579);
				sortDirection();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<QualifierContext> qualifier() {
			return getRuleContexts(QualifierContext.class);
		}
		public QualifierContext qualifier(int i) {
			return getRuleContext(QualifierContext.class,i);
		}
		public QualifiedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterQualifiedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitQualifiedIdentifier(this);
		}
	}

	public final QualifiedIdentifierContext qualifiedIdentifier() throws RecognitionException {
		QualifiedIdentifierContext _localctx = new QualifiedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_qualifiedIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(582);
					qualifier();
					setState(583);
					match(T__16);
					}
					} 
				}
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(590);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DurationBetweenExpressionContext extends ExpressionContext {
		public PluralDateTimePrecisionContext pluralDateTimePrecision() {
			return getRuleContext(PluralDateTimePrecisionContext.class,0);
		}
		public List<ExpressionTermContext> expressionTerm() {
			return getRuleContexts(ExpressionTermContext.class);
		}
		public ExpressionTermContext expressionTerm(int i) {
			return getRuleContext(ExpressionTermContext.class,i);
		}
		public DurationBetweenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterDurationBetweenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitDurationBetweenExpression(this);
		}
	}
	public static class InFixSetExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InFixSetExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterInFixSetExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitInFixSetExpression(this);
		}
	}
	public static class RetrieveExpressionContext extends ExpressionContext {
		public RetrieveContext retrieve() {
			return getRuleContext(RetrieveContext.class,0);
		}
		public RetrieveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterRetrieveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitRetrieveExpression(this);
		}
	}
	public static class TimingExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IntervalOperatorPhraseContext intervalOperatorPhrase() {
			return getRuleContext(IntervalOperatorPhraseContext.class,0);
		}
		public TimingExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterTimingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitTimingExpression(this);
		}
	}
	public static class QueryExpressionContext extends ExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QueryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterQueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitQueryExpression(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitNotExpression(this);
		}
	}
	public static class BooleanExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitBooleanExpression(this);
		}
	}
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitOrExpression(this);
		}
	}
	public static class CastExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public CastExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitCastExpression(this);
		}
	}
	public static class AndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitAndExpression(this);
		}
	}
	public static class BetweenExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ExpressionTermContext> expressionTerm() {
			return getRuleContexts(ExpressionTermContext.class);
		}
		public ExpressionTermContext expressionTerm(int i) {
			return getRuleContext(ExpressionTermContext.class,i);
		}
		public BetweenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterBetweenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitBetweenExpression(this);
		}
	}
	public static class MembershipExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DateTimePrecisionSpecifierContext dateTimePrecisionSpecifier() {
			return getRuleContext(DateTimePrecisionSpecifierContext.class,0);
		}
		public MembershipExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterMembershipExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitMembershipExpression(this);
		}
	}
	public static class DifferenceBetweenExpressionContext extends ExpressionContext {
		public PluralDateTimePrecisionContext pluralDateTimePrecision() {
			return getRuleContext(PluralDateTimePrecisionContext.class,0);
		}
		public List<ExpressionTermContext> expressionTerm() {
			return getRuleContexts(ExpressionTermContext.class);
		}
		public ExpressionTermContext expressionTerm(int i) {
			return getRuleContext(ExpressionTermContext.class,i);
		}
		public DifferenceBetweenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterDifferenceBetweenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitDifferenceBetweenExpression(this);
		}
	}
	public static class InequalityExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InequalityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterInequalityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitInequalityExpression(this);
		}
	}
	public static class EqualityExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitEqualityExpression(this);
		}
	}
	public static class ExistenceExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExistenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterExistenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitExistenceExpression(this);
		}
	}
	public static class ImpliesExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ImpliesExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterImpliesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitImpliesExpression(this);
		}
	}
	public static class TermExpressionContext extends ExpressionContext {
		public ExpressionTermContext expressionTerm() {
			return getRuleContext(ExpressionTermContext.class,0);
		}
		public TermExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterTermExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitTermExpression(this);
		}
	}
	public static class TypeExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitTypeExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				_localctx = new TermExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(593);
				expressionTerm(0);
				}
				break;
			case 2:
				{
				_localctx = new RetrieveExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(594);
				retrieve();
				}
				break;
			case 3:
				{
				_localctx = new QueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(595);
				query();
				}
				break;
			case 4:
				{
				_localctx = new CastExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(596);
				match(T__56);
				setState(597);
				expression(0);
				setState(598);
				match(T__55);
				setState(599);
				typeSpecifier();
				}
				break;
			case 5:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(601);
				match(T__51);
				setState(602);
				expression(13);
				}
				break;
			case 6:
				{
				_localctx = new ExistenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(603);
				match(T__57);
				setState(604);
				expression(12);
				}
				break;
			case 7:
				{
				_localctx = new DurationBetweenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__61) {
					{
					setState(605);
					match(T__61);
					setState(606);
					match(T__37);
					}
				}

				setState(609);
				pluralDateTimePrecision();
				setState(610);
				match(T__59);
				setState(611);
				expressionTerm(0);
				setState(612);
				match(T__60);
				setState(613);
				expressionTerm(0);
				}
				break;
			case 8:
				{
				_localctx = new DifferenceBetweenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(615);
				match(T__62);
				setState(616);
				match(T__37);
				setState(617);
				pluralDateTimePrecision();
				setState(618);
				match(T__59);
				setState(619);
				expressionTerm(0);
				setState(620);
				match(T__60);
				setState(621);
				expressionTerm(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(673);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(671);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new InequalityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(625);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(626);
						_la = _input.LA(1);
						if ( !(((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (T__21 - 22)) | (1L << (T__22 - 22)) | (1L << (T__63 - 22)) | (1L << (T__64 - 22)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(627);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new TimingExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(628);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(629);
						intervalOperatorPhrase();
						setState(630);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(632);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(633);
						_la = _input.LA(1);
						if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)) | (1L << (T__68 - 66)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(634);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new MembershipExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(635);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(636);
						_la = _input.LA(1);
						if ( !(_la==T__37 || _la==T__69) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(638);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
						case 1:
							{
							setState(637);
							dateTimePrecisionSpecifier();
							}
							break;
						}
						setState(640);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new AndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(641);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(642);
						match(T__60);
						setState(643);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(644);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(645);
						_la = _input.LA(1);
						if ( !(_la==T__70 || _la==T__71) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(646);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new ImpliesExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(647);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(648);
						match(T__72);
						setState(649);
						expression(3);
						}
						break;
					case 8:
						{
						_localctx = new InFixSetExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(650);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(651);
						_la = _input.LA(1);
						if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(652);
						expression(2);
						}
						break;
					case 9:
						{
						_localctx = new BooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(653);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(654);
						match(T__50);
						setState(656);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__51) {
							{
							setState(655);
							match(T__51);
							}
						}

						setState(658);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__53) | (1L << T__54))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 10:
						{
						_localctx = new TypeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(659);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(660);
						_la = _input.LA(1);
						if ( !(_la==T__50 || _la==T__55) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(661);
						typeSpecifier();
						}
						break;
					case 11:
						{
						_localctx = new BetweenExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(662);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(664);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__58) {
							{
							setState(663);
							match(T__58);
							}
						}

						setState(666);
						match(T__59);
						setState(667);
						expressionTerm(0);
						setState(668);
						match(T__60);
						setState(669);
						expressionTerm(0);
						}
						break;
					}
					} 
				}
				setState(675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DateTimePrecisionContext extends ParserRuleContext {
		public DateTimePrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimePrecision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterDateTimePrecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitDateTimePrecision(this);
		}
	}

	public final DateTimePrecisionContext dateTimePrecision() throws RecognitionException {
		DateTimePrecisionContext _localctx = new DateTimePrecisionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_dateTimePrecision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)) | (1L << (T__80 - 78)) | (1L << (T__81 - 78)) | (1L << (T__82 - 78)) | (1L << (T__83 - 78)) | (1L << (T__84 - 78)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateTimeComponentContext extends ParserRuleContext {
		public DateTimePrecisionContext dateTimePrecision() {
			return getRuleContext(DateTimePrecisionContext.class,0);
		}
		public DateTimeComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterDateTimeComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitDateTimeComponent(this);
		}
	}

	public final DateTimeComponentContext dateTimeComponent() throws RecognitionException {
		DateTimeComponentContext _localctx = new DateTimeComponentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_dateTimeComponent);
		try {
			setState(682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				dateTimePrecision();
				}
				break;
			case T__85:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				match(T__85);
				}
				break;
			case T__86:
				enterOuterAlt(_localctx, 3);
				{
				setState(680);
				match(T__86);
				}
				break;
			case T__87:
				enterOuterAlt(_localctx, 4);
				{
				setState(681);
				match(T__87);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PluralDateTimePrecisionContext extends ParserRuleContext {
		public PluralDateTimePrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluralDateTimePrecision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterPluralDateTimePrecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitPluralDateTimePrecision(this);
		}
	}

	public final PluralDateTimePrecisionContext pluralDateTimePrecision() throws RecognitionException {
		PluralDateTimePrecisionContext _localctx = new PluralDateTimePrecisionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_pluralDateTimePrecision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_la = _input.LA(1);
			if ( !(((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (T__88 - 89)) | (1L << (T__89 - 89)) | (1L << (T__90 - 89)) | (1L << (T__91 - 89)) | (1L << (T__92 - 89)) | (1L << (T__93 - 89)) | (1L << (T__94 - 89)) | (1L << (T__95 - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionTermContext extends ParserRuleContext {
		public ExpressionTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionTerm; }
	 
		public ExpressionTermContext() { }
		public void copyFrom(ExpressionTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditionExpressionTermContext extends ExpressionTermContext {
		public List<ExpressionTermContext> expressionTerm() {
			return getRuleContexts(ExpressionTermContext.class);
		}
		public ExpressionTermContext expressionTerm(int i) {
			return getRuleContext(ExpressionTermContext.class,i);
		}
		public AdditionExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterAdditionExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitAdditionExpressionTerm(this);
		}
	}
	public static class IndexedExpressionTermContext extends ExpressionTermContext {
		public ExpressionTermContext expressionTerm() {
			return getRuleContext(ExpressionTermContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IndexedExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterIndexedExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitIndexedExpressionTerm(this);
		}
	}
	public static class WidthExpressionTermContext extends ExpressionTermContext {
		public ExpressionTermContext expressionTerm() {
			return getRuleContext(ExpressionTermContext.class,0);
		}
		public WidthExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterWidthExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitWidthExpressionTerm(this);
		}
	}
	public static class TimeUnitExpressionTermContext extends ExpressionTermContext {
		public DateTimeComponentContext dateTimeComponent() {
			return getRuleContext(DateTimeComponentContext.class,0);
		}
		public ExpressionTermContext expressionTerm() {
			return getRuleContext(ExpressionTermContext.class,0);
		}
		public TimeUnitExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterTimeUnitExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitTimeUnitExpressionTerm(this);
		}
	}
	public static class ExpandExpressionTermContext extends ExpressionTermContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DateTimePrecisionContext dateTimePrecision() {
			return getRuleContext(DateTimePrecisionContext.class,0);
		}
		public ExpandExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterExpandExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitExpandExpressionTerm(this);
		}
	}
	public static class IfThenElseExpressionTermContext extends ExpressionTermContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IfThenElseExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterIfThenElseExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitIfThenElseExpressionTerm(this);
		}
	}
	public static class TimeBoundaryExpressionTermContext extends ExpressionTermContext {
		public ExpressionTermContext expressionTerm() {
			return getRuleContext(ExpressionTermContext.class,0);
		}
		public TimeBoundaryExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterTimeBoundaryExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitTimeBoundaryExpressionTerm(this);
		}
	}
	public static class ElementExtractorExpressionTermContext extends ExpressionTermContext {
		public ExpressionTermContext expressionTerm() {
			return getRuleContext(ExpressionTermContext.class,0);
		}
		public ElementExtractorExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterElementExtractorExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitElementExtractorExpressionTerm(this);
		}
	}
	public static class ConversionExpressionTermContext extends ExpressionTermContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ConversionExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterConversionExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitConversionExpressionTerm(this);
		}
	}
	public static class TypeExtentExpressionTermContext extends ExpressionTermContext {
		public NamedTypeSpecifierContext namedTypeSpecifier() {
			return getRuleContext(NamedTypeSpecifierContext.class,0);
		}
		public TypeExtentExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterTypeExtentExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitTypeExtentExpressionTerm(this);
		}
	}
	public static class PredecessorExpressionTermContext extends ExpressionTermContext {
		public ExpressionTermContext expressionTerm() {
			return getRuleContext(ExpressionTermContext.class,0);
		}
		public PredecessorExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterPredecessorExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitPredecessorExpressionTerm(this);
		}
	}
	public static class PointExtractorExpressionTermContext extends ExpressionTermContext {
		public ExpressionTermContext expressionTerm() {
			return getRuleContext(ExpressionTermContext.class,0);
		}
		public PointExtractorExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterPointExtractorExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitPointExtractorExpressionTerm(this);
		}
	}
	public static class MultiplicationExpressionTermContext extends ExpressionTermContext {
		public List<ExpressionTermContext> expressionTerm() {
			return getRuleContexts(ExpressionTermContext.class);
		}
		public ExpressionTermContext expressionTerm(int i) {
			return getRuleContext(ExpressionTermContext.class,i);
		}
		public MultiplicationExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterMultiplicationExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitMultiplicationExpressionTerm(this);
		}
	}
	public static class AggregateExpressionTermContext extends ExpressionTermContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AggregateExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterAggregateExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitAggregateExpressionTerm(this);
		}
	}
	public static class DurationExpressionTermContext extends ExpressionTermContext {
		public PluralDateTimePrecisionContext pluralDateTimePrecision() {
			return getRuleContext(PluralDateTimePrecisionContext.class,0);
		}
		public ExpressionTermContext expressionTerm() {
			return getRuleContext(ExpressionTermContext.class,0);
		}
		public DurationExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterDurationExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitDurationExpressionTerm(this);
		}
	}
	public static class DifferenceExpressionTermContext extends ExpressionTermContext {
		public PluralDateTimePrecisionContext pluralDateTimePrecision() {
			return getRuleContext(PluralDateTimePrecisionContext.class,0);
		}
		public ExpressionTermContext expressionTerm() {
			return getRuleContext(ExpressionTermContext.class,0);
		}
		public DifferenceExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterDifferenceExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitDifferenceExpressionTerm(this);
		}
	}
	public static class CaseExpressionTermContext extends ExpressionTermContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<CaseExpressionItemContext> caseExpressionItem() {
			return getRuleContexts(CaseExpressionItemContext.class);
		}
		public CaseExpressionItemContext caseExpressionItem(int i) {
			return getRuleContext(CaseExpressionItemContext.class,i);
		}
		public CaseExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterCaseExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitCaseExpressionTerm(this);
		}
	}
	public static class PowerExpressionTermContext extends ExpressionTermContext {
		public List<ExpressionTermContext> expressionTerm() {
			return getRuleContexts(ExpressionTermContext.class);
		}
		public ExpressionTermContext expressionTerm(int i) {
			return getRuleContext(ExpressionTermContext.class,i);
		}
		public PowerExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterPowerExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitPowerExpressionTerm(this);
		}
	}
	public static class SuccessorExpressionTermContext extends ExpressionTermContext {
		public ExpressionTermContext expressionTerm() {
			return getRuleContext(ExpressionTermContext.class,0);
		}
		public SuccessorExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterSuccessorExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitSuccessorExpressionTerm(this);
		}
	}
	public static class PolarityExpressionTermContext extends ExpressionTermContext {
		public ExpressionTermContext expressionTerm() {
			return getRuleContext(ExpressionTermContext.class,0);
		}
		public PolarityExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterPolarityExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitPolarityExpressionTerm(this);
		}
	}
	public static class TermExpressionTermContext extends ExpressionTermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterTermExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitTermExpressionTerm(this);
		}
	}
	public static class InvocationExpressionTermContext extends ExpressionTermContext {
		public ExpressionTermContext expressionTerm() {
			return getRuleContext(ExpressionTermContext.class,0);
		}
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public InvocationExpressionTermContext(ExpressionTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterInvocationExpressionTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitInvocationExpressionTerm(this);
		}
	}

	public final ExpressionTermContext expressionTerm() throws RecognitionException {
		return expressionTerm(0);
	}

	private ExpressionTermContext expressionTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionTermContext _localctx = new ExpressionTermContext(_ctx, _parentState);
		ExpressionTermContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_expressionTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				_localctx = new TermExpressionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(687);
				term();
				}
				break;
			case 2:
				{
				_localctx = new ConversionExpressionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(688);
				match(T__96);
				setState(689);
				expression(0);
				setState(690);
				match(T__97);
				setState(691);
				typeSpecifier();
				}
				break;
			case 3:
				{
				_localctx = new PolarityExpressionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(693);
				_la = _input.LA(1);
				if ( !(_la==T__98 || _la==T__99) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(694);
				expressionTerm(18);
				}
				break;
			case 4:
				{
				_localctx = new TimeBoundaryExpressionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(695);
				_la = _input.LA(1);
				if ( !(_la==T__100 || _la==T__101) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(696);
				match(T__102);
				setState(697);
				expressionTerm(17);
				}
				break;
			case 5:
				{
				_localctx = new TimeUnitExpressionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(698);
				dateTimeComponent();
				setState(699);
				match(T__18);
				setState(700);
				expressionTerm(16);
				}
				break;
			case 6:
				{
				_localctx = new DurationExpressionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(702);
				match(T__61);
				setState(703);
				match(T__37);
				setState(704);
				pluralDateTimePrecision();
				setState(705);
				match(T__102);
				setState(706);
				expressionTerm(15);
				}
				break;
			case 7:
				{
				_localctx = new DifferenceExpressionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(708);
				match(T__62);
				setState(709);
				match(T__37);
				setState(710);
				pluralDateTimePrecision();
				setState(711);
				match(T__102);
				setState(712);
				expressionTerm(14);
				}
				break;
			case 8:
				{
				_localctx = new WidthExpressionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(714);
				match(T__103);
				setState(715);
				match(T__102);
				setState(716);
				expressionTerm(13);
				}
				break;
			case 9:
				{
				_localctx = new SuccessorExpressionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(717);
				match(T__104);
				setState(718);
				match(T__102);
				setState(719);
				expressionTerm(12);
				}
				break;
			case 10:
				{
				_localctx = new PredecessorExpressionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(720);
				match(T__105);
				setState(721);
				match(T__102);
				setState(722);
				expressionTerm(11);
				}
				break;
			case 11:
				{
				_localctx = new ElementExtractorExpressionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(723);
				match(T__106);
				setState(724);
				match(T__18);
				setState(725);
				expressionTerm(10);
				}
				break;
			case 12:
				{
				_localctx = new PointExtractorExpressionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(726);
				match(T__107);
				setState(727);
				match(T__18);
				setState(728);
				expressionTerm(9);
				}
				break;
			case 13:
				{
				_localctx = new TypeExtentExpressionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(729);
				_la = _input.LA(1);
				if ( !(_la==T__108 || _la==T__109) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(730);
				namedTypeSpecifier();
				}
				break;
			case 14:
				{
				_localctx = new IfThenElseExpressionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(731);
				match(T__116);
				setState(732);
				expression(0);
				setState(733);
				match(T__117);
				setState(734);
				expression(0);
				setState(735);
				match(T__118);
				setState(736);
				expression(0);
				}
				break;
			case 15:
				{
				_localctx = new CaseExpressionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(738);
				match(T__119);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__29) | (1L << T__36) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__56) | (1L << T__57) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__77 - 70)) | (1L << (T__78 - 70)) | (1L << (T__79 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__82 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__85 - 70)) | (1L << (T__86 - 70)) | (1L << (T__87 - 70)) | (1L << (T__88 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__94 - 70)) | (1L << (T__95 - 70)) | (1L << (T__96 - 70)) | (1L << (T__98 - 70)) | (1L << (T__99 - 70)) | (1L << (T__100 - 70)) | (1L << (T__101 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__116 - 70)) | (1L << (T__119 - 70)) | (1L << (T__120 - 70)) | (1L << (T__121 - 70)) | (1L << (T__122 - 70)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (T__145 - 146)) | (1L << (T__146 - 146)) | (1L << (T__147 - 146)) | (1L << (T__148 - 146)) | (1L << (T__149 - 146)) | (1L << (T__150 - 146)) | (1L << (T__151 - 146)) | (1L << (DATETIME - 146)) | (1L << (TIME - 146)) | (1L << (IDENTIFIER - 146)) | (1L << (QUOTEDIDENTIFIER - 146)) | (1L << (STRING - 146)) | (1L << (NUMBER - 146)))) != 0)) {
					{
					setState(739);
					expression(0);
					}
				}

				setState(743); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(742);
					caseExpressionItem();
					}
					}
					setState(745); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__124 );
				setState(747);
				match(T__118);
				setState(748);
				expression(0);
				setState(749);
				match(T__101);
				}
				break;
			case 16:
				{
				_localctx = new AggregateExpressionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(751);
				_la = _input.LA(1);
				if ( !(_la==T__43 || _la==T__120 || _la==T__121) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(752);
				expression(0);
				}
				break;
			case 17:
				{
				_localctx = new ExpandExpressionTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(753);
				match(T__122);
				setState(754);
				expression(0);
				setState(760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(755);
					match(T__123);
					setState(758);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
					case 1:
						{
						setState(756);
						dateTimePrecision();
						}
						break;
					case 2:
						{
						setState(757);
						expression(0);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(783);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(781);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionTermContext(new ExpressionTermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionTerm);
						setState(764);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(765);
						match(T__110);
						setState(766);
						expressionTerm(8);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExpressionTermContext(new ExpressionTermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionTerm);
						setState(767);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(768);
						_la = _input.LA(1);
						if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (T__111 - 112)) | (1L << (T__112 - 112)) | (1L << (T__113 - 112)) | (1L << (T__114 - 112)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(769);
						expressionTerm(7);
						}
						break;
					case 3:
						{
						_localctx = new AdditionExpressionTermContext(new ExpressionTermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionTerm);
						setState(770);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(771);
						_la = _input.LA(1);
						if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (T__98 - 99)) | (1L << (T__99 - 99)) | (1L << (T__115 - 99)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(772);
						expressionTerm(6);
						}
						break;
					case 4:
						{
						_localctx = new InvocationExpressionTermContext(new ExpressionTermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionTerm);
						setState(773);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(774);
						match(T__16);
						setState(775);
						invocation();
						}
						break;
					case 5:
						{
						_localctx = new IndexedExpressionTermContext(new ExpressionTermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expressionTerm);
						setState(776);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(777);
						match(T__36);
						setState(778);
						expression(0);
						setState(779);
						match(T__38);
						}
						break;
					}
					} 
				}
				setState(785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CaseExpressionItemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CaseExpressionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpressionItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterCaseExpressionItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitCaseExpressionItem(this);
		}
	}

	public final CaseExpressionItemContext caseExpressionItem() throws RecognitionException {
		CaseExpressionItemContext _localctx = new CaseExpressionItemContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_caseExpressionItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			match(T__124);
			setState(787);
			expression(0);
			setState(788);
			match(T__117);
			setState(789);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateTimePrecisionSpecifierContext extends ParserRuleContext {
		public DateTimePrecisionContext dateTimePrecision() {
			return getRuleContext(DateTimePrecisionContext.class,0);
		}
		public DateTimePrecisionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimePrecisionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterDateTimePrecisionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitDateTimePrecisionSpecifier(this);
		}
	}

	public final DateTimePrecisionSpecifierContext dateTimePrecisionSpecifier() throws RecognitionException {
		DateTimePrecisionSpecifierContext _localctx = new DateTimePrecisionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_dateTimePrecisionSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			dateTimePrecision();
			setState(792);
			match(T__102);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelativeQualifierContext extends ParserRuleContext {
		public RelativeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterRelativeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitRelativeQualifier(this);
		}
	}

	public final RelativeQualifierContext relativeQualifier() throws RecognitionException {
		RelativeQualifierContext _localctx = new RelativeQualifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_relativeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			_la = _input.LA(1);
			if ( !(_la==T__125 || _la==T__126) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetRelativeQualifierContext extends ParserRuleContext {
		public OffsetRelativeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetRelativeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterOffsetRelativeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitOffsetRelativeQualifier(this);
		}
	}

	public final OffsetRelativeQualifierContext offsetRelativeQualifier() throws RecognitionException {
		OffsetRelativeQualifierContext _localctx = new OffsetRelativeQualifierContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_offsetRelativeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			_la = _input.LA(1);
			if ( !(_la==T__127 || _la==T__128) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExclusiveRelativeQualifierContext extends ParserRuleContext {
		public ExclusiveRelativeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveRelativeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterExclusiveRelativeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitExclusiveRelativeQualifier(this);
		}
	}

	public final ExclusiveRelativeQualifierContext exclusiveRelativeQualifier() throws RecognitionException {
		ExclusiveRelativeQualifierContext _localctx = new ExclusiveRelativeQualifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_exclusiveRelativeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			_la = _input.LA(1);
			if ( !(_la==T__129 || _la==T__130) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantityOffsetContext extends ParserRuleContext {
		public QuantityContext quantity() {
			return getRuleContext(QuantityContext.class,0);
		}
		public OffsetRelativeQualifierContext offsetRelativeQualifier() {
			return getRuleContext(OffsetRelativeQualifierContext.class,0);
		}
		public ExclusiveRelativeQualifierContext exclusiveRelativeQualifier() {
			return getRuleContext(ExclusiveRelativeQualifierContext.class,0);
		}
		public QuantityOffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantityOffset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterQuantityOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitQuantityOffset(this);
		}
	}

	public final QuantityOffsetContext quantityOffset() throws RecognitionException {
		QuantityOffsetContext _localctx = new QuantityOffsetContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_quantityOffset);
		int _la;
		try {
			setState(807);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(800);
				quantity();
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__127 || _la==T__128) {
					{
					setState(801);
					offsetRelativeQualifier();
					}
				}

				}
				}
				break;
			case T__129:
			case T__130:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(804);
				exclusiveRelativeQualifier();
				setState(805);
				quantity();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemporalRelationshipContext extends ParserRuleContext {
		public TemporalRelationshipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporalRelationship; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterTemporalRelationship(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitTemporalRelationship(this);
		}
	}

	public final TemporalRelationshipContext temporalRelationship() throws RecognitionException {
		TemporalRelationshipContext _localctx = new TemporalRelationshipContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_temporalRelationship);
		int _la;
		try {
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__131) {
					{
					setState(809);
					match(T__131);
					}
				}

				setState(812);
				_la = _input.LA(1);
				if ( !(_la==T__132 || _la==T__133) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(813);
				_la = _input.LA(1);
				if ( !(_la==T__132 || _la==T__133) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__134) {
					{
					setState(814);
					match(T__134);
					}
				}

				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalOperatorPhraseContext extends ParserRuleContext {
		public IntervalOperatorPhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalOperatorPhrase; }
	 
		public IntervalOperatorPhraseContext() { }
		public void copyFrom(IntervalOperatorPhraseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WithinIntervalOperatorPhraseContext extends IntervalOperatorPhraseContext {
		public QuantityContext quantity() {
			return getRuleContext(QuantityContext.class,0);
		}
		public WithinIntervalOperatorPhraseContext(IntervalOperatorPhraseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterWithinIntervalOperatorPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitWithinIntervalOperatorPhrase(this);
		}
	}
	public static class IncludedInIntervalOperatorPhraseContext extends IntervalOperatorPhraseContext {
		public DateTimePrecisionSpecifierContext dateTimePrecisionSpecifier() {
			return getRuleContext(DateTimePrecisionSpecifierContext.class,0);
		}
		public IncludedInIntervalOperatorPhraseContext(IntervalOperatorPhraseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterIncludedInIntervalOperatorPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitIncludedInIntervalOperatorPhrase(this);
		}
	}
	public static class EndsIntervalOperatorPhraseContext extends IntervalOperatorPhraseContext {
		public DateTimePrecisionSpecifierContext dateTimePrecisionSpecifier() {
			return getRuleContext(DateTimePrecisionSpecifierContext.class,0);
		}
		public EndsIntervalOperatorPhraseContext(IntervalOperatorPhraseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterEndsIntervalOperatorPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitEndsIntervalOperatorPhrase(this);
		}
	}
	public static class ConcurrentWithIntervalOperatorPhraseContext extends IntervalOperatorPhraseContext {
		public RelativeQualifierContext relativeQualifier() {
			return getRuleContext(RelativeQualifierContext.class,0);
		}
		public DateTimePrecisionContext dateTimePrecision() {
			return getRuleContext(DateTimePrecisionContext.class,0);
		}
		public ConcurrentWithIntervalOperatorPhraseContext(IntervalOperatorPhraseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterConcurrentWithIntervalOperatorPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitConcurrentWithIntervalOperatorPhrase(this);
		}
	}
	public static class OverlapsIntervalOperatorPhraseContext extends IntervalOperatorPhraseContext {
		public DateTimePrecisionSpecifierContext dateTimePrecisionSpecifier() {
			return getRuleContext(DateTimePrecisionSpecifierContext.class,0);
		}
		public OverlapsIntervalOperatorPhraseContext(IntervalOperatorPhraseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterOverlapsIntervalOperatorPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitOverlapsIntervalOperatorPhrase(this);
		}
	}
	public static class IncludesIntervalOperatorPhraseContext extends IntervalOperatorPhraseContext {
		public DateTimePrecisionSpecifierContext dateTimePrecisionSpecifier() {
			return getRuleContext(DateTimePrecisionSpecifierContext.class,0);
		}
		public IncludesIntervalOperatorPhraseContext(IntervalOperatorPhraseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterIncludesIntervalOperatorPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitIncludesIntervalOperatorPhrase(this);
		}
	}
	public static class BeforeOrAfterIntervalOperatorPhraseContext extends IntervalOperatorPhraseContext {
		public TemporalRelationshipContext temporalRelationship() {
			return getRuleContext(TemporalRelationshipContext.class,0);
		}
		public QuantityOffsetContext quantityOffset() {
			return getRuleContext(QuantityOffsetContext.class,0);
		}
		public DateTimePrecisionSpecifierContext dateTimePrecisionSpecifier() {
			return getRuleContext(DateTimePrecisionSpecifierContext.class,0);
		}
		public BeforeOrAfterIntervalOperatorPhraseContext(IntervalOperatorPhraseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterBeforeOrAfterIntervalOperatorPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitBeforeOrAfterIntervalOperatorPhrase(this);
		}
	}
	public static class MeetsIntervalOperatorPhraseContext extends IntervalOperatorPhraseContext {
		public DateTimePrecisionSpecifierContext dateTimePrecisionSpecifier() {
			return getRuleContext(DateTimePrecisionSpecifierContext.class,0);
		}
		public MeetsIntervalOperatorPhraseContext(IntervalOperatorPhraseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterMeetsIntervalOperatorPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitMeetsIntervalOperatorPhrase(this);
		}
	}
	public static class StartsIntervalOperatorPhraseContext extends IntervalOperatorPhraseContext {
		public DateTimePrecisionSpecifierContext dateTimePrecisionSpecifier() {
			return getRuleContext(DateTimePrecisionSpecifierContext.class,0);
		}
		public StartsIntervalOperatorPhraseContext(IntervalOperatorPhraseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterStartsIntervalOperatorPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitStartsIntervalOperatorPhrase(this);
		}
	}

	public final IntervalOperatorPhraseContext intervalOperatorPhrase() throws RecognitionException {
		IntervalOperatorPhraseContext _localctx = new IntervalOperatorPhraseContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_intervalOperatorPhrase);
		int _la;
		try {
			setState(900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				_localctx = new ConcurrentWithIntervalOperatorPhraseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (T__135 - 136)) | (1L << (T__136 - 136)) | (1L << (T__137 - 136)))) != 0)) {
					{
					setState(819);
					_la = _input.LA(1);
					if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (T__135 - 136)) | (1L << (T__136 - 136)) | (1L << (T__137 - 136)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(822);
				match(T__138);
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)) | (1L << (T__80 - 78)) | (1L << (T__81 - 78)) | (1L << (T__82 - 78)) | (1L << (T__83 - 78)) | (1L << (T__84 - 78)))) != 0)) {
					{
					setState(823);
					dateTimePrecision();
					}
				}

				setState(828);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__125:
				case T__126:
					{
					setState(826);
					relativeQualifier();
					}
					break;
				case T__55:
					{
					setState(827);
					match(T__55);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(831);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(830);
					_la = _input.LA(1);
					if ( !(_la==T__100 || _la==T__101) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new IncludesIntervalOperatorPhraseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(833);
					match(T__58);
					}
				}

				setState(836);
				match(T__139);
				setState(838);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(837);
					dateTimePrecisionSpecifier();
					}
					break;
				}
				setState(841);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(840);
					_la = _input.LA(1);
					if ( !(_la==T__100 || _la==T__101) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new IncludedInIntervalOperatorPhraseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (T__135 - 136)) | (1L << (T__136 - 136)) | (1L << (T__137 - 136)))) != 0)) {
					{
					setState(843);
					_la = _input.LA(1);
					if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (T__135 - 136)) | (1L << (T__136 - 136)) | (1L << (T__137 - 136)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(846);
					match(T__58);
					}
				}

				setState(849);
				_la = _input.LA(1);
				if ( !(_la==T__140 || _la==T__141) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(851);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(850);
					dateTimePrecisionSpecifier();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new BeforeOrAfterIntervalOperatorPhraseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (T__135 - 136)) | (1L << (T__136 - 136)) | (1L << (T__137 - 136)))) != 0)) {
					{
					setState(853);
					_la = _input.LA(1);
					if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (T__135 - 136)) | (1L << (T__136 - 136)) | (1L << (T__137 - 136)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (T__129 - 130)) | (1L << (T__130 - 130)) | (1L << (NUMBER - 130)))) != 0)) {
					{
					setState(856);
					quantityOffset();
					}
				}

				setState(859);
				temporalRelationship();
				setState(861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(860);
					dateTimePrecisionSpecifier();
					}
					break;
				}
				setState(864);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(863);
					_la = _input.LA(1);
					if ( !(_la==T__100 || _la==T__101) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new WithinIntervalOperatorPhraseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (T__135 - 136)) | (1L << (T__136 - 136)) | (1L << (T__137 - 136)))) != 0)) {
					{
					setState(866);
					_la = _input.LA(1);
					if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (T__135 - 136)) | (1L << (T__136 - 136)) | (1L << (T__137 - 136)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__58) {
					{
					setState(869);
					match(T__58);
					}
				}

				setState(872);
				match(T__142);
				setState(873);
				quantity();
				setState(874);
				match(T__102);
				setState(876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(875);
					_la = _input.LA(1);
					if ( !(_la==T__100 || _la==T__101) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new MeetsIntervalOperatorPhraseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(878);
				match(T__143);
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__132 || _la==T__133) {
					{
					setState(879);
					_la = _input.LA(1);
					if ( !(_la==T__132 || _la==T__133) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(883);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(882);
					dateTimePrecisionSpecifier();
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new OverlapsIntervalOperatorPhraseContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(885);
				match(T__144);
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__132 || _la==T__133) {
					{
					setState(886);
					_la = _input.LA(1);
					if ( !(_la==T__132 || _la==T__133) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(889);
					dateTimePrecisionSpecifier();
					}
					break;
				}
				}
				break;
			case 8:
				_localctx = new StartsIntervalOperatorPhraseContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(892);
				match(T__135);
				setState(894);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(893);
					dateTimePrecisionSpecifier();
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new EndsIntervalOperatorPhraseContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(896);
				match(T__136);
				setState(898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(897);
					dateTimePrecisionSpecifier();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExternalConstantTermContext extends TermContext {
		public ExternalConstantContext externalConstant() {
			return getRuleContext(ExternalConstantContext.class,0);
		}
		public ExternalConstantTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterExternalConstantTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitExternalConstantTerm(this);
		}
	}
	public static class TupleSelectorTermContext extends TermContext {
		public TupleSelectorContext tupleSelector() {
			return getRuleContext(TupleSelectorContext.class,0);
		}
		public TupleSelectorTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterTupleSelectorTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitTupleSelectorTerm(this);
		}
	}
	public static class LiteralTermContext extends TermContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterLiteralTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitLiteralTerm(this);
		}
	}
	public static class ConceptSelectorTermContext extends TermContext {
		public ConceptSelectorContext conceptSelector() {
			return getRuleContext(ConceptSelectorContext.class,0);
		}
		public ConceptSelectorTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterConceptSelectorTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitConceptSelectorTerm(this);
		}
	}
	public static class ParenthesizedTermContext extends TermContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterParenthesizedTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitParenthesizedTerm(this);
		}
	}
	public static class CodeSelectorTermContext extends TermContext {
		public CodeSelectorContext codeSelector() {
			return getRuleContext(CodeSelectorContext.class,0);
		}
		public CodeSelectorTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterCodeSelectorTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitCodeSelectorTerm(this);
		}
	}
	public static class InvocationTermContext extends TermContext {
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public InvocationTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterInvocationTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitInvocationTerm(this);
		}
	}
	public static class InstanceSelectorTermContext extends TermContext {
		public InstanceSelectorContext instanceSelector() {
			return getRuleContext(InstanceSelectorContext.class,0);
		}
		public InstanceSelectorTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterInstanceSelectorTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitInstanceSelectorTerm(this);
		}
	}
	public static class IntervalSelectorTermContext extends TermContext {
		public IntervalSelectorContext intervalSelector() {
			return getRuleContext(IntervalSelectorContext.class,0);
		}
		public IntervalSelectorTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterIntervalSelectorTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitIntervalSelectorTerm(this);
		}
	}
	public static class ListSelectorTermContext extends TermContext {
		public ListSelectorContext listSelector() {
			return getRuleContext(ListSelectorContext.class,0);
		}
		public ListSelectorTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterListSelectorTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitListSelectorTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_term);
		try {
			setState(915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				_localctx = new InvocationTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(902);
				invocation();
				}
				break;
			case 2:
				_localctx = new LiteralTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(903);
				literal();
				}
				break;
			case 3:
				_localctx = new ExternalConstantTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(904);
				externalConstant();
				}
				break;
			case 4:
				_localctx = new IntervalSelectorTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(905);
				intervalSelector();
				}
				break;
			case 5:
				_localctx = new TupleSelectorTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(906);
				tupleSelector();
				}
				break;
			case 6:
				_localctx = new InstanceSelectorTermContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(907);
				instanceSelector();
				}
				break;
			case 7:
				_localctx = new ListSelectorTermContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(908);
				listSelector();
				}
				break;
			case 8:
				_localctx = new CodeSelectorTermContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(909);
				codeSelector();
				}
				break;
			case 9:
				_localctx = new ConceptSelectorTermContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(910);
				conceptSelector();
				}
				break;
			case 10:
				_localctx = new ParenthesizedTermContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(911);
				match(T__29);
				setState(912);
				expression(0);
				setState(913);
				match(T__30);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RatioContext extends ParserRuleContext {
		public List<QuantityContext> quantity() {
			return getRuleContexts(QuantityContext.class);
		}
		public QuantityContext quantity(int i) {
			return getRuleContext(QuantityContext.class,i);
		}
		public RatioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterRatio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitRatio(this);
		}
	}

	public final RatioContext ratio() throws RecognitionException {
		RatioContext _localctx = new RatioContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_ratio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			quantity();
			setState(918);
			match(T__10);
			setState(919);
			quantity();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeLiteralContext extends LiteralContext {
		public TerminalNode TIME() { return getToken(cqlParser.TIME, 0); }
		public TimeLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterTimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitTimeLiteral(this);
		}
	}
	public static class NullLiteralContext extends LiteralContext {
		public NullLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitNullLiteral(this);
		}
	}
	public static class RatioLiteralContext extends LiteralContext {
		public RatioContext ratio() {
			return getRuleContext(RatioContext.class,0);
		}
		public RatioLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterRatioLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitRatioLiteral(this);
		}
	}
	public static class DateTimeLiteralContext extends LiteralContext {
		public TerminalNode DATETIME() { return getToken(cqlParser.DATETIME, 0); }
		public DateTimeLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterDateTimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitDateTimeLiteral(this);
		}
	}
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(cqlParser.STRING, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitStringLiteral(this);
		}
	}
	public static class BooleanLiteralContext extends LiteralContext {
		public BooleanLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitBooleanLiteral(this);
		}
	}
	public static class NumberLiteralContext extends LiteralContext {
		public TerminalNode NUMBER() { return getToken(cqlParser.NUMBER, 0); }
		public NumberLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitNumberLiteral(this);
		}
	}
	public static class QuantityLiteralContext extends LiteralContext {
		public QuantityContext quantity() {
			return getRuleContext(QuantityContext.class,0);
		}
		public QuantityLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterQuantityLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitQuantityLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_literal);
		int _la;
		try {
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(921);
				_la = _input.LA(1);
				if ( !(_la==T__53 || _la==T__54) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				match(T__52);
				}
				break;
			case 3:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(923);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumberLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(924);
				match(NUMBER);
				}
				break;
			case 5:
				_localctx = new DateTimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(925);
				match(DATETIME);
				}
				break;
			case 6:
				_localctx = new TimeLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(926);
				match(TIME);
				}
				break;
			case 7:
				_localctx = new QuantityLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(927);
				quantity();
				}
				break;
			case 8:
				_localctx = new RatioLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(928);
				ratio();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalSelectorContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IntervalSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterIntervalSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitIntervalSelector(this);
		}
	}

	public final IntervalSelectorContext intervalSelector() throws RecognitionException {
		IntervalSelectorContext _localctx = new IntervalSelectorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_intervalSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			match(T__23);
			setState(932);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__36) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(933);
			expression(0);
			setState(934);
			match(T__14);
			setState(935);
			expression(0);
			setState(936);
			_la = _input.LA(1);
			if ( !(_la==T__30 || _la==T__38) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleSelectorContext extends ParserRuleContext {
		public List<TupleElementSelectorContext> tupleElementSelector() {
			return getRuleContexts(TupleElementSelectorContext.class);
		}
		public TupleElementSelectorContext tupleElementSelector(int i) {
			return getRuleContext(TupleElementSelectorContext.class,i);
		}
		public TupleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterTupleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitTupleSelector(this);
		}
	}

	public final TupleSelectorContext tupleSelector() throws RecognitionException {
		TupleSelectorContext _localctx = new TupleSelectorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_tupleSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(938);
				match(T__24);
				}
			}

			setState(941);
			match(T__13);
			setState(951);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(942);
				match(T__10);
				}
				break;
			case T__1:
			case T__17:
			case T__19:
			case T__40:
			case T__42:
			case T__43:
			case T__51:
			case T__69:
			case T__85:
			case T__86:
			case T__87:
			case T__100:
			case T__101:
			case T__145:
			case T__146:
			case T__147:
			case IDENTIFIER:
			case QUOTEDIDENTIFIER:
				{
				{
				setState(943);
				tupleElementSelector();
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(944);
					match(T__14);
					setState(945);
					tupleElementSelector();
					}
					}
					setState(950);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(953);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleElementSelectorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TupleElementSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleElementSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterTupleElementSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitTupleElementSelector(this);
		}
	}

	public final TupleElementSelectorContext tupleElementSelector() throws RecognitionException {
		TupleElementSelectorContext _localctx = new TupleElementSelectorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_tupleElementSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			identifier();
			setState(956);
			match(T__10);
			setState(957);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceSelectorContext extends ParserRuleContext {
		public NamedTypeSpecifierContext namedTypeSpecifier() {
			return getRuleContext(NamedTypeSpecifierContext.class,0);
		}
		public List<InstanceElementSelectorContext> instanceElementSelector() {
			return getRuleContexts(InstanceElementSelectorContext.class);
		}
		public InstanceElementSelectorContext instanceElementSelector(int i) {
			return getRuleContext(InstanceElementSelectorContext.class,i);
		}
		public InstanceSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterInstanceSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitInstanceSelector(this);
		}
	}

	public final InstanceSelectorContext instanceSelector() throws RecognitionException {
		InstanceSelectorContext _localctx = new InstanceSelectorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_instanceSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			namedTypeSpecifier();
			setState(960);
			match(T__13);
			setState(970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(961);
				match(T__10);
				}
				break;
			case T__1:
			case T__17:
			case T__19:
			case T__40:
			case T__42:
			case T__43:
			case T__51:
			case T__69:
			case T__85:
			case T__86:
			case T__87:
			case T__100:
			case T__101:
			case T__145:
			case T__146:
			case T__147:
			case IDENTIFIER:
			case QUOTEDIDENTIFIER:
				{
				{
				setState(962);
				instanceElementSelector();
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(963);
					match(T__14);
					setState(964);
					instanceElementSelector();
					}
					}
					setState(969);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(972);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceElementSelectorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InstanceElementSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceElementSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterInstanceElementSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitInstanceElementSelector(this);
		}
	}

	public final InstanceElementSelectorContext instanceElementSelector() throws RecognitionException {
		InstanceElementSelectorContext _localctx = new InstanceElementSelectorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_instanceElementSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974);
			identifier();
			setState(975);
			match(T__10);
			setState(976);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListSelectorContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ListSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterListSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitListSelector(this);
		}
	}

	public final ListSelectorContext listSelector() throws RecognitionException {
		ListSelectorContext _localctx = new ListSelectorContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_listSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(978);
				match(T__20);
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(979);
					match(T__21);
					setState(980);
					typeSpecifier();
					setState(981);
					match(T__22);
					}
				}

				}
			}

			setState(987);
			match(T__13);
			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__29) | (1L << T__36) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__56) | (1L << T__57) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__77 - 70)) | (1L << (T__78 - 70)) | (1L << (T__79 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__82 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__85 - 70)) | (1L << (T__86 - 70)) | (1L << (T__87 - 70)) | (1L << (T__88 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__94 - 70)) | (1L << (T__95 - 70)) | (1L << (T__96 - 70)) | (1L << (T__98 - 70)) | (1L << (T__99 - 70)) | (1L << (T__100 - 70)) | (1L << (T__101 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__116 - 70)) | (1L << (T__119 - 70)) | (1L << (T__120 - 70)) | (1L << (T__121 - 70)) | (1L << (T__122 - 70)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (T__145 - 146)) | (1L << (T__146 - 146)) | (1L << (T__147 - 146)) | (1L << (T__148 - 146)) | (1L << (T__149 - 146)) | (1L << (T__150 - 146)) | (1L << (T__151 - 146)) | (1L << (DATETIME - 146)) | (1L << (TIME - 146)) | (1L << (IDENTIFIER - 146)) | (1L << (QUOTEDIDENTIFIER - 146)) | (1L << (STRING - 146)) | (1L << (NUMBER - 146)))) != 0)) {
				{
				setState(988);
				expression(0);
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(989);
					match(T__14);
					setState(990);
					expression(0);
					}
					}
					setState(995);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(998);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisplayClauseContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(cqlParser.STRING, 0); }
		public DisplayClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterDisplayClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitDisplayClause(this);
		}
	}

	public final DisplayClauseContext displayClause() throws RecognitionException {
		DisplayClauseContext _localctx = new DisplayClauseContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_displayClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			match(T__145);
			setState(1001);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeSelectorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(cqlParser.STRING, 0); }
		public CodesystemIdentifierContext codesystemIdentifier() {
			return getRuleContext(CodesystemIdentifierContext.class,0);
		}
		public DisplayClauseContext displayClause() {
			return getRuleContext(DisplayClauseContext.class,0);
		}
		public CodeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterCodeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitCodeSelector(this);
		}
	}

	public final CodeSelectorContext codeSelector() throws RecognitionException {
		CodeSelectorContext _localctx = new CodeSelectorContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_codeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			match(T__146);
			setState(1004);
			match(STRING);
			setState(1005);
			match(T__18);
			setState(1006);
			codesystemIdentifier();
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1007);
				displayClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConceptSelectorContext extends ParserRuleContext {
		public List<CodeSelectorContext> codeSelector() {
			return getRuleContexts(CodeSelectorContext.class);
		}
		public CodeSelectorContext codeSelector(int i) {
			return getRuleContext(CodeSelectorContext.class,i);
		}
		public DisplayClauseContext displayClause() {
			return getRuleContext(DisplayClauseContext.class,0);
		}
		public ConceptSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conceptSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterConceptSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitConceptSelector(this);
		}
	}

	public final ConceptSelectorContext conceptSelector() throws RecognitionException {
		ConceptSelectorContext _localctx = new ConceptSelectorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_conceptSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			match(T__147);
			setState(1011);
			match(T__13);
			setState(1012);
			codeSelector();
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(1013);
				match(T__14);
				setState(1014);
				codeSelector();
				}
				}
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1020);
			match(T__15);
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1021);
				displayClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(cqlParser.IDENTIFIER, 0); }
		public TerminalNode QUOTEDIDENTIFIER() { return getToken(cqlParser.QUOTEDIDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__17) | (1L << T__19) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__51))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__85 - 70)) | (1L << (T__86 - 70)) | (1L << (T__87 - 70)) | (1L << (T__100 - 70)) | (1L << (T__101 - 70)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (T__145 - 146)) | (1L << (T__146 - 146)) | (1L << (T__147 - 146)) | (1L << (IDENTIFIER - 146)) | (1L << (QUOTEDIDENTIFIER - 146)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalConstantContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExternalConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterExternalConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitExternalConstant(this);
		}
	}

	public final ExternalConstantContext externalConstant() throws RecognitionException {
		ExternalConstantContext _localctx = new ExternalConstantContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_externalConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(T__148);
			setState(1027);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvocationContext extends ParserRuleContext {
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
	 
		public InvocationContext() { }
		public void copyFrom(InvocationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TotalInvocationContext extends InvocationContext {
		public TotalInvocationContext(InvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterTotalInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitTotalInvocation(this);
		}
	}
	public static class ThisInvocationContext extends InvocationContext {
		public ThisInvocationContext(InvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterThisInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitThisInvocation(this);
		}
	}
	public static class IndexInvocationContext extends InvocationContext {
		public IndexInvocationContext(InvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterIndexInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitIndexInvocation(this);
		}
	}
	public static class FunctionInvocationContext extends InvocationContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionInvocationContext(InvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterFunctionInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitFunctionInvocation(this);
		}
	}
	public static class MemberInvocationContext extends InvocationContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MemberInvocationContext(InvocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterMemberInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitMemberInvocation(this);
		}
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_invocation);
		try {
			setState(1034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				_localctx = new MemberInvocationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1029);
				identifier();
				}
				break;
			case 2:
				_localctx = new FunctionInvocationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1030);
				function();
				}
				break;
			case 3:
				_localctx = new ThisInvocationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1031);
				match(T__149);
				}
				break;
			case 4:
				_localctx = new IndexInvocationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1032);
				match(T__150);
				}
				break;
			case 5:
				_localctx = new TotalInvocationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1033);
				match(T__151);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			identifier();
			setState(1037);
			match(T__29);
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__13) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__23) | (1L << T__24) | (1L << T__29) | (1L << T__36) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__56) | (1L << T__57) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__77 - 70)) | (1L << (T__78 - 70)) | (1L << (T__79 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__82 - 70)) | (1L << (T__83 - 70)) | (1L << (T__84 - 70)) | (1L << (T__85 - 70)) | (1L << (T__86 - 70)) | (1L << (T__87 - 70)) | (1L << (T__88 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__94 - 70)) | (1L << (T__95 - 70)) | (1L << (T__96 - 70)) | (1L << (T__98 - 70)) | (1L << (T__99 - 70)) | (1L << (T__100 - 70)) | (1L << (T__101 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__116 - 70)) | (1L << (T__119 - 70)) | (1L << (T__120 - 70)) | (1L << (T__121 - 70)) | (1L << (T__122 - 70)))) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (T__145 - 146)) | (1L << (T__146 - 146)) | (1L << (T__147 - 146)) | (1L << (T__148 - 146)) | (1L << (T__149 - 146)) | (1L << (T__150 - 146)) | (1L << (T__151 - 146)) | (1L << (DATETIME - 146)) | (1L << (TIME - 146)) | (1L << (IDENTIFIER - 146)) | (1L << (QUOTEDIDENTIFIER - 146)) | (1L << (STRING - 146)) | (1L << (NUMBER - 146)))) != 0)) {
				{
				setState(1038);
				paramList();
				}
			}

			setState(1041);
			match(T__30);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitParamList(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			expression(0);
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(1044);
				match(T__14);
				setState(1045);
				expression(0);
				}
				}
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantityContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(cqlParser.NUMBER, 0); }
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public QuantityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterQuantity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitQuantity(this);
		}
	}

	public final QuantityContext quantity() throws RecognitionException {
		QuantityContext _localctx = new QuantityContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_quantity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			match(NUMBER);
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1052);
				unit();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitContext extends ParserRuleContext {
		public DateTimePrecisionContext dateTimePrecision() {
			return getRuleContext(DateTimePrecisionContext.class,0);
		}
		public PluralDateTimePrecisionContext pluralDateTimePrecision() {
			return getRuleContext(PluralDateTimePrecisionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(cqlParser.STRING, 0); }
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cqlListener ) ((cqlListener)listener).exitUnit(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_unit);
		try {
			setState(1058);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
			case T__82:
			case T__83:
			case T__84:
				enterOuterAlt(_localctx, 1);
				{
				setState(1055);
				dateTimePrecision();
				}
				break;
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
				enterOuterAlt(_localctx, 2);
				{
				setState(1056);
				pluralDateTimePrecision();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1057);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 55:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 59:
			return expressionTerm_sempred((ExpressionTermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 16);
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean expressionTerm_sempred(ExpressionTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 5);
		case 14:
			return precpred(_ctx, 21);
		case 15:
			return precpred(_ctx, 20);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a3\u0427\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\5\2\u00b2\n\2\3\2\7\2\u00b5\n\2\f\2\16\2"+
		"\u00b8\13\2\3\2\7\2\u00bb\n\2\f\2\16\2\u00be\13\2\3\2\7\2\u00c1\n\2\f"+
		"\2\16\2\u00c4\13\2\3\2\7\2\u00c7\n\2\f\2\16\2\u00ca\13\2\3\2\7\2\u00cd"+
		"\n\2\f\2\16\2\u00d0\13\2\3\2\7\2\u00d3\n\2\f\2\16\2\u00d6\13\2\3\2\7\2"+
		"\u00d9\n\2\f\2\16\2\u00dc\13\2\3\2\7\2\u00df\n\2\f\2\16\2\u00e2\13\2\3"+
		"\3\3\3\3\3\3\3\5\3\u00e8\n\3\3\4\3\4\3\4\3\4\5\4\u00ee\n\4\3\5\3\5\3\5"+
		"\3\5\5\5\u00f4\n\5\3\5\3\5\5\5\u00f8\n\5\3\6\3\6\3\7\3\7\3\b\5\b\u00ff"+
		"\n\b\3\b\3\b\3\b\5\b\u0104\n\b\3\b\3\b\5\b\u0108\n\b\3\t\5\t\u010b\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0113\n\t\3\n\5\n\u0116\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u011e\n\n\3\n\5\n\u0121\n\n\3\13\3\13\3\13\3\13\3\13\7"+
		"\13\u0128\n\13\f\13\16\13\u012b\13\13\3\13\3\13\3\f\3\f\3\f\5\f\u0132"+
		"\n\f\3\f\3\f\3\r\3\r\3\16\5\16\u0139\n\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0142\n\16\3\17\5\17\u0145\n\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\7\17\u014e\n\17\f\17\16\17\u0151\13\17\3\17\3\17\5\17\u0155\n"+
		"\17\3\20\3\20\3\20\5\20\u015a\n\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u016b\n\25\3\26\3\26\3\26"+
		"\7\26\u0170\n\26\f\26\16\26\u0173\13\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\7\32"+
		"\u0188\n\32\f\32\16\32\u018b\13\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\7\34\u0197\n\34\f\34\16\34\u019a\13\34\3\34\3\34\3\35"+
		"\3\35\3\35\5\35\u01a1\n\35\3\36\3\36\5\36\u01a5\n\36\3\36\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3 \3 \5 \u01b0\n \3 \3 \3 \3 \3 \3 \7 \u01b8\n \f "+
		"\16 \u01bb\13 \5 \u01bd\n \3 \3 \3 \5 \u01c2\n \3 \3 \3 \5 \u01c7\n \3"+
		"!\3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\5#\u01d4\n#\3$\3$\3$\3%\3%\3&\3&\5&"+
		"\u01dd\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\5)\u01ef"+
		"\n)\3)\5)\u01f2\n)\3)\3)\3*\3*\3+\3+\5+\u01fa\n+\3,\3,\3-\3-\5-\u0200"+
		"\n-\3-\7-\u0203\n-\f-\16-\u0206\13-\3-\5-\u0209\n-\3-\5-\u020c\n-\3-\5"+
		"-\u020f\n-\3.\3.\5.\u0213\n.\3/\3/\3\60\3\60\3\60\3\60\7\60\u021b\n\60"+
		"\f\60\16\60\u021e\13\60\3\61\3\61\3\61\3\61\7\61\u0224\n\61\f\61\16\61"+
		"\u0227\13\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\5\64\u0232\n"+
		"\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u023c\n\65\f\65\16\65"+
		"\u023f\13\65\5\65\u0241\n\65\3\66\3\66\3\67\3\67\5\67\u0247\n\67\38\3"+
		"8\38\78\u024c\n8\f8\168\u024f\138\38\38\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\59\u0262\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\59\u0272\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u0281\n9\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u0293\n9\39\39\39\39\39"+
		"\39\59\u029b\n9\39\39\39\39\39\79\u02a2\n9\f9\169\u02a5\139\3:\3:\3;\3"+
		";\3;\3;\5;\u02ad\n;\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u02e7\n=\3=\6=\u02ea"+
		"\n=\r=\16=\u02eb\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u02f9\n=\5=\u02fb"+
		"\n=\5=\u02fd\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\7="+
		"\u0310\n=\f=\16=\u0313\13=\3>\3>\3>\3>\3>\3?\3?\3?\3@\3@\3A\3A\3B\3B\3"+
		"C\3C\5C\u0325\nC\3C\3C\3C\5C\u032a\nC\3D\5D\u032d\nD\3D\3D\3D\5D\u0332"+
		"\nD\5D\u0334\nD\3E\5E\u0337\nE\3E\3E\5E\u033b\nE\3E\3E\5E\u033f\nE\3E"+
		"\5E\u0342\nE\3E\5E\u0345\nE\3E\3E\5E\u0349\nE\3E\5E\u034c\nE\3E\5E\u034f"+
		"\nE\3E\5E\u0352\nE\3E\3E\5E\u0356\nE\3E\5E\u0359\nE\3E\5E\u035c\nE\3E"+
		"\3E\5E\u0360\nE\3E\5E\u0363\nE\3E\5E\u0366\nE\3E\5E\u0369\nE\3E\3E\3E"+
		"\3E\5E\u036f\nE\3E\3E\5E\u0373\nE\3E\5E\u0376\nE\3E\3E\5E\u037a\nE\3E"+
		"\5E\u037d\nE\3E\3E\5E\u0381\nE\3E\3E\5E\u0385\nE\5E\u0387\nE\3F\3F\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u0396\nF\3G\3G\3G\3G\3H\3H\3H\3H\3H"+
		"\3H\3H\3H\5H\u03a4\nH\3I\3I\3I\3I\3I\3I\3I\3J\5J\u03ae\nJ\3J\3J\3J\3J"+
		"\3J\7J\u03b5\nJ\fJ\16J\u03b8\13J\5J\u03ba\nJ\3J\3J\3K\3K\3K\3K\3L\3L\3"+
		"L\3L\3L\3L\7L\u03c8\nL\fL\16L\u03cb\13L\5L\u03cd\nL\3L\3L\3M\3M\3M\3M"+
		"\3N\3N\3N\3N\3N\5N\u03da\nN\5N\u03dc\nN\3N\3N\3N\3N\7N\u03e2\nN\fN\16"+
		"N\u03e5\13N\5N\u03e7\nN\3N\3N\3O\3O\3O\3P\3P\3P\3P\3P\5P\u03f3\nP\3Q\3"+
		"Q\3Q\3Q\3Q\7Q\u03fa\nQ\fQ\16Q\u03fd\13Q\3Q\3Q\5Q\u0401\nQ\3R\3R\3S\3S"+
		"\3S\3T\3T\3T\3T\3T\5T\u040d\nT\3U\3U\3U\5U\u0412\nU\3U\3U\3V\3V\3V\7V"+
		"\u0419\nV\fV\16V\u041c\13V\3W\3W\5W\u0420\nW\3X\3X\3X\5X\u0425\nX\3X\2"+
		"\4pxY\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\2\36\3\2\b\t\3\2-.\3\2\61\64\4\2"+
		"\30\31BC\3\2DG\4\2((HH\3\2IJ\3\2LO\3\2\679\4\2\65\65::\3\2PW\3\2[b\3\2"+
		"ef\3\2gh\3\2op\4\2..{|\3\2ru\4\2efvv\3\2\u0080\u0081\3\2\u0082\u0083\3"+
		"\2\u0084\u0085\3\2\u0087\u0088\3\2\u008a\u008c\3\2\u008f\u0090\3\289\4"+
		"\2  \'\'\4\2!!))\r\2\4\4\24\24\26\26++-.\66\66HHXZgh\u0094\u0096\u009d"+
		"\u009e\2\u0489\2\u00b1\3\2\2\2\4\u00e3\3\2\2\2\6\u00e9\3\2\2\2\b\u00ef"+
		"\3\2\2\2\n\u00f9\3\2\2\2\f\u00fb\3\2\2\2\16\u00fe\3\2\2\2\20\u010a\3\2"+
		"\2\2\22\u0115\3\2\2\2\24\u0122\3\2\2\2\26\u0131\3\2\2\2\30\u0135\3\2\2"+
		"\2\32\u0138\3\2\2\2\34\u0144\3\2\2\2\36\u0159\3\2\2\2 \u015d\3\2\2\2\""+
		"\u015f\3\2\2\2$\u0161\3\2\2\2&\u0163\3\2\2\2(\u016a\3\2\2\2*\u0171\3\2"+
		"\2\2,\u0176\3\2\2\2.\u0178\3\2\2\2\60\u017d\3\2\2\2\62\u0182\3\2\2\2\64"+
		"\u018e\3\2\2\2\66\u0191\3\2\2\28\u01a0\3\2\2\2:\u01a2\3\2\2\2<\u01aa\3"+
		"\2\2\2>\u01ad\3\2\2\2@\u01c8\3\2\2\2B\u01cb\3\2\2\2D\u01d3\3\2\2\2F\u01d5"+
		"\3\2\2\2H\u01d8\3\2\2\2J\u01dc\3\2\2\2L\u01de\3\2\2\2N\u01e3\3\2\2\2P"+
		"\u01e8\3\2\2\2R\u01f5\3\2\2\2T\u01f9\3\2\2\2V\u01fb\3\2\2\2X\u01fd\3\2"+
		"\2\2Z\u0212\3\2\2\2\\\u0214\3\2\2\2^\u0216\3\2\2\2`\u021f\3\2\2\2b\u0228"+
		"\3\2\2\2d\u022c\3\2\2\2f\u022f\3\2\2\2h\u0235\3\2\2\2j\u0242\3\2\2\2l"+
		"\u0244\3\2\2\2n\u024d\3\2\2\2p\u0271\3\2\2\2r\u02a6\3\2\2\2t\u02ac\3\2"+
		"\2\2v\u02ae\3\2\2\2x\u02fc\3\2\2\2z\u0314\3\2\2\2|\u0319\3\2\2\2~\u031c"+
		"\3\2\2\2\u0080\u031e\3\2\2\2\u0082\u0320\3\2\2\2\u0084\u0329\3\2\2\2\u0086"+
		"\u0333\3\2\2\2\u0088\u0386\3\2\2\2\u008a\u0395\3\2\2\2\u008c\u0397\3\2"+
		"\2\2\u008e\u03a3\3\2\2\2\u0090\u03a5\3\2\2\2\u0092\u03ad\3\2\2\2\u0094"+
		"\u03bd\3\2\2\2\u0096\u03c1\3\2\2\2\u0098\u03d0\3\2\2\2\u009a\u03db\3\2"+
		"\2\2\u009c\u03ea\3\2\2\2\u009e\u03ed\3\2\2\2\u00a0\u03f4\3\2\2\2\u00a2"+
		"\u0402\3\2\2\2\u00a4\u0404\3\2\2\2\u00a6\u040c\3\2\2\2\u00a8\u040e\3\2"+
		"\2\2\u00aa\u0415\3\2\2\2\u00ac\u041d\3\2\2\2\u00ae\u0424\3\2\2\2\u00b0"+
		"\u00b2\5\4\3\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b6\3\2"+
		"\2\2\u00b3\u00b5\5\6\4\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bc\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\u00bb\5\b\5\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c2\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00bf\u00c1\5\20\t\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c8\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c7\5\22\n\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ce\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00cb\u00cd\5\32\16\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d4\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d1\u00d3\5\34\17\2\u00d2\u00d1\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00da\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d9\5\16\b\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e0\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00df\58\35\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\3\3\2\2\2\u00e2\u00e0\3\2\2\2"+
		"\u00e3\u00e4\7\3\2\2\u00e4\u00e7\5\u00a2R\2\u00e5\u00e6\7\4\2\2\u00e6"+
		"\u00e8\5$\23\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\5\3\2\2\2"+
		"\u00e9\u00ea\7\5\2\2\u00ea\u00ed\5,\27\2\u00eb\u00ec\7\4\2\2\u00ec\u00ee"+
		"\5$\23\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\7\3\2\2\2\u00ef"+
		"\u00f0\7\6\2\2\u00f0\u00f3\5\u00a2R\2\u00f1\u00f2\7\4\2\2\u00f2\u00f4"+
		"\5$\23\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f6\7\7\2\2\u00f6\u00f8\5\n\6\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\t\3\2\2\2\u00f9\u00fa\5\u00a2R\2\u00fa\13\3\2\2\2\u00fb\u00fc"+
		"\t\2\2\2\u00fc\r\3\2\2\2\u00fd\u00ff\5\f\7\2\u00fe\u00fd\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\7\n\2\2\u0101\u0103\5\u00a2"+
		"R\2\u0102\u0104\5(\25\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0106\7\13\2\2\u0106\u0108\5p9\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\17\3\2\2\2\u0109\u010b\5\f\7\2\u010a\u0109"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\7\f\2\2\u010d"+
		"\u010e\5\u00a2R\2\u010e\u010f\7\r\2\2\u010f\u0112\5 \21\2\u0110\u0111"+
		"\7\4\2\2\u0111\u0113\5$\23\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\21\3\2\2\2\u0114\u0116\5\f\7\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2\2"+
		"\2\u0116\u0117\3\2\2\2\u0117\u0118\7\16\2\2\u0118\u0119\5\u00a2R\2\u0119"+
		"\u011a\7\r\2\2\u011a\u011d\5\"\22\2\u011b\u011c\7\4\2\2\u011c\u011e\5"+
		"$\23\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f"+
		"\u0121\5\24\13\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\23\3\2"+
		"\2\2\u0122\u0123\7\17\2\2\u0123\u0124\7\20\2\2\u0124\u0129\5\26\f\2\u0125"+
		"\u0126\7\21\2\2\u0126\u0128\5\26\f\2\u0127\u0125\3\2\2\2\u0128\u012b\3"+
		"\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c\u012d\7\22\2\2\u012d\25\3\2\2\2\u012e\u012f\5\30"+
		"\r\2\u012f\u0130\7\23\2\2\u0130\u0132\3\2\2\2\u0131\u012e\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\5\u00a2R\2\u0134\27\3\2"+
		"\2\2\u0135\u0136\5\u00a2R\2\u0136\31\3\2\2\2\u0137\u0139\5\f\7\2\u0138"+
		"\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\7\24"+
		"\2\2\u013b\u013c\5\u00a2R\2\u013c\u013d\7\r\2\2\u013d\u013e\5&\24\2\u013e"+
		"\u013f\7\25\2\2\u013f\u0141\5\26\f\2\u0140\u0142\5\u009cO\2\u0141\u0140"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0142\33\3\2\2\2\u0143\u0145\5\f\7\2\u0144"+
		"\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7\26"+
		"\2\2\u0147\u0148\5\u00a2R\2\u0148\u0149\7\r\2\2\u0149\u014a\7\20\2\2\u014a"+
		"\u014f\5\36\20\2\u014b\u014c\7\21\2\2\u014c\u014e\5\36\20\2\u014d\u014b"+
		"\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0154\7\22\2\2\u0153\u0155\5"+
		"\u009cO\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\35\3\2\2\2\u0156"+
		"\u0157\5\30\r\2\u0157\u0158\7\23\2\2\u0158\u015a\3\2\2\2\u0159\u0156\3"+
		"\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\5\u00a2R\2"+
		"\u015c\37\3\2\2\2\u015d\u015e\7\u009f\2\2\u015e!\3\2\2\2\u015f\u0160\7"+
		"\u009f\2\2\u0160#\3\2\2\2\u0161\u0162\7\u009f\2\2\u0162%\3\2\2\2\u0163"+
		"\u0164\7\u009f\2\2\u0164\'\3\2\2\2\u0165\u016b\5*\26\2\u0166\u016b\5."+
		"\30\2\u0167\u016b\5\60\31\2\u0168\u016b\5\62\32\2\u0169\u016b\5\66\34"+
		"\2\u016a\u0165\3\2\2\2\u016a\u0166\3\2\2\2\u016a\u0167\3\2\2\2\u016a\u0168"+
		"\3\2\2\2\u016a\u0169\3\2\2\2\u016b)\3\2\2\2\u016c\u016d\5V,\2\u016d\u016e"+
		"\7\23\2\2\u016e\u0170\3\2\2\2\u016f\u016c\3\2\2\2\u0170\u0173\3\2\2\2"+
		"\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171"+
		"\3\2\2\2\u0174\u0175\5\u00a2R\2\u0175+\3\2\2\2\u0176\u0177\5\u00a2R\2"+
		"\u0177-\3\2\2\2\u0178\u0179\7\27\2\2\u0179\u017a\7\30\2\2\u017a\u017b"+
		"\5(\25\2\u017b\u017c\7\31\2\2\u017c/\3\2\2\2\u017d\u017e\7\32\2\2\u017e"+
		"\u017f\7\30\2\2\u017f\u0180\5(\25\2\u0180\u0181\7\31\2\2\u0181\61\3\2"+
		"\2\2\u0182\u0183\7\33\2\2\u0183\u0184\7\20\2\2\u0184\u0189\5\64\33\2\u0185"+
		"\u0186\7\21\2\2\u0186\u0188\5\64\33\2\u0187\u0185\3\2\2\2\u0188\u018b"+
		"\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018c\u018d\7\22\2\2\u018d\63\3\2\2\2\u018e\u018f\5\u00a2"+
		"R\2\u018f\u0190\5(\25\2\u0190\65\3\2\2\2\u0191\u0192\7\34\2\2\u0192\u0193"+
		"\7\30\2\2\u0193\u0198\5(\25\2\u0194\u0195\7\21\2\2\u0195\u0197\5(\25\2"+
		"\u0196\u0194\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\7\31\2\2"+
		"\u019c\67\3\2\2\2\u019d\u01a1\5:\36\2\u019e\u01a1\5<\37\2\u019f\u01a1"+
		"\5> \2\u01a0\u019d\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1"+
		"9\3\2\2\2\u01a2\u01a4\7\35\2\2\u01a3\u01a5\5\f\7\2\u01a4\u01a3\3\2\2\2"+
		"\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\5\u00a2R\2\u01a7"+
		"\u01a8\7\r\2\2\u01a8\u01a9\5p9\2\u01a9;\3\2\2\2\u01aa\u01ab\7\36\2\2\u01ab"+
		"\u01ac\5\u00a2R\2\u01ac=\3\2\2\2\u01ad\u01af\7\35\2\2\u01ae\u01b0\5\f"+
		"\7\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1"+
		"\u01b2\7\37\2\2\u01b2\u01b3\5\u00a2R\2\u01b3\u01bc\7 \2\2\u01b4\u01b9"+
		"\5@!\2\u01b5\u01b6\7\21\2\2\u01b6\u01b8\5@!\2\u01b7\u01b5\3\2\2\2\u01b8"+
		"\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bd\3\2"+
		"\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01b4\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01c1\7!\2\2\u01bf\u01c0\7\"\2\2\u01c0\u01c2\5(\25"+
		"\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c6"+
		"\7\r\2\2\u01c4\u01c7\5B\"\2\u01c5\u01c7\7#\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c5\3\2\2\2\u01c7?\3\2\2\2\u01c8\u01c9\5\u00a2R\2\u01c9\u01ca\5(\25"+
		"\2\u01caA\3\2\2\2\u01cb\u01cc\5p9\2\u01ccC\3\2\2\2\u01cd\u01d4\5P)\2\u01ce"+
		"\u01d4\5n8\2\u01cf\u01d0\7 \2\2\u01d0\u01d1\5p9\2\u01d1\u01d2\7!\2\2\u01d2"+
		"\u01d4\3\2\2\2\u01d3\u01cd\3\2\2\2\u01d3\u01ce\3\2\2\2\u01d3\u01cf\3\2"+
		"\2\2\u01d4E\3\2\2\2\u01d5\u01d6\5D#\2\u01d6\u01d7\5H%\2\u01d7G\3\2\2\2"+
		"\u01d8\u01d9\5\u00a2R\2\u01d9I\3\2\2\2\u01da\u01dd\5L\'\2\u01db\u01dd"+
		"\5N(\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01ddK\3\2\2\2\u01de\u01df"+
		"\7$\2\2\u01df\u01e0\5F$\2\u01e0\u01e1\7%\2\2\u01e1\u01e2\5p9\2\u01e2M"+
		"\3\2\2\2\u01e3\u01e4\7&\2\2\u01e4\u01e5\5F$\2\u01e5\u01e6\7%\2\2\u01e6"+
		"\u01e7\5p9\2\u01e7O\3\2\2\2\u01e8\u01e9\7\'\2\2\u01e9\u01f1\5*\26\2\u01ea"+
		"\u01ee\7\r\2\2\u01eb\u01ec\5R*\2\u01ec\u01ed\7(\2\2\u01ed\u01ef\3\2\2"+
		"\2\u01ee\u01eb\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2"+
		"\5T+\2\u01f1\u01ea\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f4\7)\2\2\u01f4Q\3\2\2\2\u01f5\u01f6\5\u00a2R\2\u01f6S\3\2\2\2\u01f7"+
		"\u01fa\5n8\2\u01f8\u01fa\5p9\2\u01f9\u01f7\3\2\2\2\u01f9\u01f8\3\2\2\2"+
		"\u01faU\3\2\2\2\u01fb\u01fc\5\u00a2R\2\u01fcW\3\2\2\2\u01fd\u01ff\5Z."+
		"\2\u01fe\u0200\5`\61\2\u01ff\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0204"+
		"\3\2\2\2\u0201\u0203\5J&\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2"+
		"\2\2\u0207\u0209\5d\63\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020b\3\2\2\2\u020a\u020c\5f\64\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u020e\3\2\2\2\u020d\u020f\5h\65\2\u020e\u020d\3\2\2\2\u020e"+
		"\u020f\3\2\2\2\u020fY\3\2\2\2\u0210\u0213\5\\/\2\u0211\u0213\5^\60\2\u0212"+
		"\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213[\3\2\2\2\u0214\u0215\5F$\2\u0215"+
		"]\3\2\2\2\u0216\u0217\7\25\2\2\u0217\u021c\5F$\2\u0218\u0219\7\21\2\2"+
		"\u0219\u021b\5F$\2\u021a\u0218\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a"+
		"\3\2\2\2\u021c\u021d\3\2\2\2\u021d_\3\2\2\2\u021e\u021c\3\2\2\2\u021f"+
		"\u0220\7*\2\2\u0220\u0225\5b\62\2\u0221\u0222\7\21\2\2\u0222\u0224\5b"+
		"\62\2\u0223\u0221\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226a\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u0229\5\u00a2"+
		"R\2\u0229\u022a\7\r\2\2\u022a\u022b\5p9\2\u022bc\3\2\2\2\u022c\u022d\7"+
		"+\2\2\u022d\u022e\5p9\2\u022ee\3\2\2\2\u022f\u0231\7,\2\2\u0230\u0232"+
		"\t\3\2\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u0234\5p9\2\u0234g\3\2\2\2\u0235\u0240\7/\2\2\u0236\u0241\5j\66\2\u0237"+
		"\u0238\7\60\2\2\u0238\u023d\5l\67\2\u0239\u023a\7\21\2\2\u023a\u023c\5"+
		"l\67\2\u023b\u0239\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0236\3\2"+
		"\2\2\u0240\u0237\3\2\2\2\u0241i\3\2\2\2\u0242\u0243\t\4\2\2\u0243k\3\2"+
		"\2\2\u0244\u0246\5x=\2\u0245\u0247\5j\66\2\u0246\u0245\3\2\2\2\u0246\u0247"+
		"\3\2\2\2\u0247m\3\2\2\2\u0248\u0249\5V,\2\u0249\u024a\7\23\2\2\u024a\u024c"+
		"\3\2\2\2\u024b\u0248\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d"+
		"\u024e\3\2\2\2\u024e\u0250\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0251\5\u00a2"+
		"R\2\u0251o\3\2\2\2\u0252\u0253\b9\1\2\u0253\u0272\5x=\2\u0254\u0272\5"+
		"P)\2\u0255\u0272\5X-\2\u0256\u0257\7;\2\2\u0257\u0258\5p9\2\u0258\u0259"+
		"\7:\2\2\u0259\u025a\5(\25\2\u025a\u0272\3\2\2\2\u025b\u025c\7\66\2\2\u025c"+
		"\u0272\5p9\17\u025d\u025e\7<\2\2\u025e\u0272\5p9\16\u025f\u0260\7@\2\2"+
		"\u0260\u0262\7(\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263"+
		"\3\2\2\2\u0263\u0264\5v<\2\u0264\u0265\7>\2\2\u0265\u0266\5x=\2\u0266"+
		"\u0267\7?\2\2\u0267\u0268\5x=\2\u0268\u0272\3\2\2\2\u0269\u026a\7A\2\2"+
		"\u026a\u026b\7(\2\2\u026b\u026c\5v<\2\u026c\u026d\7>\2\2\u026d\u026e\5"+
		"x=\2\u026e\u026f\7?\2\2\u026f\u0270\5x=\2\u0270\u0272\3\2\2\2\u0271\u0252"+
		"\3\2\2\2\u0271\u0254\3\2\2\2\u0271\u0255\3\2\2\2\u0271\u0256\3\2\2\2\u0271"+
		"\u025b\3\2\2\2\u0271\u025d\3\2\2\2\u0271\u0261\3\2\2\2\u0271\u0269\3\2"+
		"\2\2\u0272\u02a3\3\2\2\2\u0273\u0274\f\n\2\2\u0274\u0275\t\5\2\2\u0275"+
		"\u02a2\5p9\13\u0276\u0277\f\t\2\2\u0277\u0278\5\u0088E\2\u0278\u0279\5"+
		"p9\n\u0279\u02a2\3\2\2\2\u027a\u027b\f\b\2\2\u027b\u027c\t\6\2\2\u027c"+
		"\u02a2\5p9\t\u027d\u027e\f\7\2\2\u027e\u0280\t\7\2\2\u027f\u0281\5|?\2"+
		"\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u02a2"+
		"\5p9\b\u0283\u0284\f\6\2\2\u0284\u0285\7?\2\2\u0285\u02a2\5p9\7\u0286"+
		"\u0287\f\5\2\2\u0287\u0288\t\b\2\2\u0288\u02a2\5p9\6\u0289\u028a\f\4\2"+
		"\2\u028a\u028b\7K\2\2\u028b\u02a2\5p9\5\u028c\u028d\f\3\2\2\u028d\u028e"+
		"\t\t\2\2\u028e\u02a2\5p9\4\u028f\u0290\f\22\2\2\u0290\u0292\7\65\2\2\u0291"+
		"\u0293\7\66\2\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3"+
		"\2\2\2\u0294\u02a2\t\n\2\2\u0295\u0296\f\21\2\2\u0296\u0297\t\13\2\2\u0297"+
		"\u02a2\5(\25\2\u0298\u029a\f\r\2\2\u0299\u029b\7=\2\2\u029a\u0299\3\2"+
		"\2\2\u029a\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\7>\2\2\u029d"+
		"\u029e\5x=\2\u029e\u029f\7?\2\2\u029f\u02a0\5x=\2\u02a0\u02a2\3\2\2\2"+
		"\u02a1\u0273\3\2\2\2\u02a1\u0276\3\2\2\2\u02a1\u027a\3\2\2\2\u02a1\u027d"+
		"\3\2\2\2\u02a1\u0283\3\2\2\2\u02a1\u0286\3\2\2\2\u02a1\u0289\3\2\2\2\u02a1"+
		"\u028c\3\2\2\2\u02a1\u028f\3\2\2\2\u02a1\u0295\3\2\2\2\u02a1\u0298\3\2"+
		"\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4"+
		"q\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a7\t\f\2\2\u02a7s\3\2\2\2\u02a8"+
		"\u02ad\5r:\2\u02a9\u02ad\7X\2\2\u02aa\u02ad\7Y\2\2\u02ab\u02ad\7Z\2\2"+
		"\u02ac\u02a8\3\2\2\2\u02ac\u02a9\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ab"+
		"\3\2\2\2\u02adu\3\2\2\2\u02ae\u02af\t\r\2\2\u02afw\3\2\2\2\u02b0\u02b1"+
		"\b=\1\2\u02b1\u02fd\5\u008aF\2\u02b2\u02b3\7c\2\2\u02b3\u02b4\5p9\2\u02b4"+
		"\u02b5\7d\2\2\u02b5\u02b6\5(\25\2\u02b6\u02fd\3\2\2\2\u02b7\u02b8\t\16"+
		"\2\2\u02b8\u02fd\5x=\24\u02b9\u02ba\t\17\2\2\u02ba\u02bb\7i\2\2\u02bb"+
		"\u02fd\5x=\23\u02bc\u02bd\5t;\2\u02bd\u02be\7\25\2\2\u02be\u02bf\5x=\22"+
		"\u02bf\u02fd\3\2\2\2\u02c0\u02c1\7@\2\2\u02c1\u02c2\7(\2\2\u02c2\u02c3"+
		"\5v<\2\u02c3\u02c4\7i\2\2\u02c4\u02c5\5x=\21\u02c5\u02fd\3\2\2\2\u02c6"+
		"\u02c7\7A\2\2\u02c7\u02c8\7(\2\2\u02c8\u02c9\5v<\2\u02c9\u02ca\7i\2\2"+
		"\u02ca\u02cb\5x=\20\u02cb\u02fd\3\2\2\2\u02cc\u02cd\7j\2\2\u02cd\u02ce"+
		"\7i\2\2\u02ce\u02fd\5x=\17\u02cf\u02d0\7k\2\2\u02d0\u02d1\7i\2\2\u02d1"+
		"\u02fd\5x=\16\u02d2\u02d3\7l\2\2\u02d3\u02d4\7i\2\2\u02d4\u02fd\5x=\r"+
		"\u02d5\u02d6\7m\2\2\u02d6\u02d7\7\25\2\2\u02d7\u02fd\5x=\f\u02d8\u02d9"+
		"\7n\2\2\u02d9\u02da\7\25\2\2\u02da\u02fd\5x=\13\u02db\u02dc\t\20\2\2\u02dc"+
		"\u02fd\5*\26\2\u02dd\u02de\7w\2\2\u02de\u02df\5p9\2\u02df\u02e0\7x\2\2"+
		"\u02e0\u02e1\5p9\2\u02e1\u02e2\7y\2\2\u02e2\u02e3\5p9\2\u02e3\u02fd\3"+
		"\2\2\2\u02e4\u02e6\7z\2\2\u02e5\u02e7\5p9\2\u02e6\u02e5\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02e9\3\2\2\2\u02e8\u02ea\5z>\2\u02e9\u02e8\3\2\2"+
		"\2\u02ea\u02eb\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed"+
		"\3\2\2\2\u02ed\u02ee\7y\2\2\u02ee\u02ef\5p9\2\u02ef\u02f0\7h\2\2\u02f0"+
		"\u02fd\3\2\2\2\u02f1\u02f2\t\21\2\2\u02f2\u02fd\5p9\2\u02f3\u02f4\7}\2"+
		"\2\u02f4\u02fa\5p9\2\u02f5\u02f8\7~\2\2\u02f6\u02f9\5r:\2\u02f7\u02f9"+
		"\5p9\2\u02f8\u02f6\3\2\2\2\u02f8\u02f7\3\2\2\2\u02f9\u02fb\3\2\2\2\u02fa"+
		"\u02f5\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fd\3\2\2\2\u02fc\u02b0\3\2"+
		"\2\2\u02fc\u02b2\3\2\2\2\u02fc\u02b7\3\2\2\2\u02fc\u02b9\3\2\2\2\u02fc"+
		"\u02bc\3\2\2\2\u02fc\u02c0\3\2\2\2\u02fc\u02c6\3\2\2\2\u02fc\u02cc\3\2"+
		"\2\2\u02fc\u02cf\3\2\2\2\u02fc\u02d2\3\2\2\2\u02fc\u02d5\3\2\2\2\u02fc"+
		"\u02d8\3\2\2\2\u02fc\u02db\3\2\2\2\u02fc\u02dd\3\2\2\2\u02fc\u02e4\3\2"+
		"\2\2\u02fc\u02f1\3\2\2\2\u02fc\u02f3\3\2\2\2\u02fd\u0311\3\2\2\2\u02fe"+
		"\u02ff\f\t\2\2\u02ff\u0300\7q\2\2\u0300\u0310\5x=\n\u0301\u0302\f\b\2"+
		"\2\u0302\u0303\t\22\2\2\u0303\u0310\5x=\t\u0304\u0305\f\7\2\2\u0305\u0306"+
		"\t\23\2\2\u0306\u0310\5x=\b\u0307\u0308\f\27\2\2\u0308\u0309\7\23\2\2"+
		"\u0309\u0310\5\u00a6T\2\u030a\u030b\f\26\2\2\u030b\u030c\7\'\2\2\u030c"+
		"\u030d\5p9\2\u030d\u030e\7)\2\2\u030e\u0310\3\2\2\2\u030f\u02fe\3\2\2"+
		"\2\u030f\u0301\3\2\2\2\u030f\u0304\3\2\2\2\u030f\u0307\3\2\2\2\u030f\u030a"+
		"\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2\2\u0312"+
		"y\3\2\2\2\u0313\u0311\3\2\2\2\u0314\u0315\7\177\2\2\u0315\u0316\5p9\2"+
		"\u0316\u0317\7x\2\2\u0317\u0318\5p9\2\u0318{\3\2\2\2\u0319\u031a\5r:\2"+
		"\u031a\u031b\7i\2\2\u031b}\3\2\2\2\u031c\u031d\t\24\2\2\u031d\177\3\2"+
		"\2\2\u031e\u031f\t\25\2\2\u031f\u0081\3\2\2\2\u0320\u0321\t\26\2\2\u0321"+
		"\u0083\3\2\2\2\u0322\u0324\5\u00acW\2\u0323\u0325\5\u0080A\2\u0324\u0323"+
		"\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u032a\3\2\2\2\u0326\u0327\5\u0082B"+
		"\2\u0327\u0328\5\u00acW\2\u0328\u032a\3\2\2\2\u0329\u0322\3\2\2\2\u0329"+
		"\u0326\3\2\2\2\u032a\u0085\3\2\2\2\u032b\u032d\7\u0086\2\2\u032c\u032b"+
		"\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0334\t\27\2\2"+
		"\u032f\u0331\t\27\2\2\u0330\u0332\7\u0089\2\2\u0331\u0330\3\2\2\2\u0331"+
		"\u0332\3\2\2\2\u0332\u0334\3\2\2\2\u0333\u032c\3\2\2\2\u0333\u032f\3\2"+
		"\2\2\u0334\u0087\3\2\2\2\u0335\u0337\t\30\2\2\u0336\u0335\3\2\2\2\u0336"+
		"\u0337\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033a\7\u008d\2\2\u0339\u033b"+
		"\5r:\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033e\3\2\2\2\u033c"+
		"\u033f\5~@\2\u033d\u033f\7:\2\2\u033e\u033c\3\2\2\2\u033e\u033d\3\2\2"+
		"\2\u033f\u0341\3\2\2\2\u0340\u0342\t\17\2\2\u0341\u0340\3\2\2\2\u0341"+
		"\u0342\3\2\2\2\u0342\u0387\3\2\2\2\u0343\u0345\7=\2\2\u0344\u0343\3\2"+
		"\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\7\u008e\2\2\u0347"+
		"\u0349\5|?\2\u0348\u0347\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034b\3\2\2"+
		"\2\u034a\u034c\t\17\2\2\u034b\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c"+
		"\u0387\3\2\2\2\u034d\u034f\t\30\2\2\u034e\u034d\3\2\2\2\u034e\u034f\3"+
		"\2\2\2\u034f\u0351\3\2\2\2\u0350\u0352\7=\2\2\u0351\u0350\3\2\2\2\u0351"+
		"\u0352\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0355\t\31\2\2\u0354\u0356\5"+
		"|?\2\u0355\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0387\3\2\2\2\u0357"+
		"\u0359\t\30\2\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035b\3"+
		"\2\2\2\u035a\u035c\5\u0084C\2\u035b\u035a\3\2\2\2\u035b\u035c\3\2\2\2"+
		"\u035c\u035d\3\2\2\2\u035d\u035f\5\u0086D\2\u035e\u0360\5|?\2\u035f\u035e"+
		"\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0362\3\2\2\2\u0361\u0363\t\17\2\2"+
		"\u0362\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0387\3\2\2\2\u0364\u0366"+
		"\t\30\2\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368\3\2\2\2"+
		"\u0367\u0369\7=\2\2\u0368\u0367\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036a"+
		"\3\2\2\2\u036a\u036b\7\u0091\2\2\u036b\u036c\5\u00acW\2\u036c\u036e\7"+
		"i\2\2\u036d\u036f\t\17\2\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f"+
		"\u0387\3\2\2\2\u0370\u0372\7\u0092\2\2\u0371\u0373\t\27\2\2\u0372\u0371"+
		"\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0375\3\2\2\2\u0374\u0376\5|?\2\u0375"+
		"\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0387\3\2\2\2\u0377\u0379\7\u0093"+
		"\2\2\u0378\u037a\t\27\2\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a"+
		"\u037c\3\2\2\2\u037b\u037d\5|?\2\u037c\u037b\3\2\2\2\u037c\u037d\3\2\2"+
		"\2\u037d\u0387\3\2\2\2\u037e\u0380\7\u008a\2\2\u037f\u0381\5|?\2\u0380"+
		"\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0387\3\2\2\2\u0382\u0384\7\u008b"+
		"\2\2\u0383\u0385\5|?\2\u0384\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387"+
		"\3\2\2\2\u0386\u0336\3\2\2\2\u0386\u0344\3\2\2\2\u0386\u034e\3\2\2\2\u0386"+
		"\u0358\3\2\2\2\u0386\u0365\3\2\2\2\u0386\u0370\3\2\2\2\u0386\u0377\3\2"+
		"\2\2\u0386\u037e\3\2\2\2\u0386\u0382\3\2\2\2\u0387\u0089\3\2\2\2\u0388"+
		"\u0396\5\u00a6T\2\u0389\u0396\5\u008eH\2\u038a\u0396\5\u00a4S\2\u038b"+
		"\u0396\5\u0090I\2\u038c\u0396\5\u0092J\2\u038d\u0396\5\u0096L\2\u038e"+
		"\u0396\5\u009aN\2\u038f\u0396\5\u009eP\2\u0390\u0396\5\u00a0Q\2\u0391"+
		"\u0392\7 \2\2\u0392\u0393\5p9\2\u0393\u0394\7!\2\2\u0394\u0396\3\2\2\2"+
		"\u0395\u0388\3\2\2\2\u0395\u0389\3\2\2\2\u0395\u038a\3\2\2\2\u0395\u038b"+
		"\3\2\2\2\u0395\u038c\3\2\2\2\u0395\u038d\3\2\2\2\u0395\u038e\3\2\2\2\u0395"+
		"\u038f\3\2\2\2\u0395\u0390\3\2\2\2\u0395\u0391\3\2\2\2\u0396\u008b\3\2"+
		"\2\2\u0397\u0398\5\u00acW\2\u0398\u0399\7\r\2\2\u0399\u039a\5\u00acW\2"+
		"\u039a\u008d\3\2\2\2\u039b\u03a4\t\32\2\2\u039c\u03a4\7\67\2\2\u039d\u03a4"+
		"\7\u009f\2\2\u039e\u03a4\7\u00a0\2\2\u039f\u03a4\7\u009b\2\2\u03a0\u03a4"+
		"\7\u009c\2\2\u03a1\u03a4\5\u00acW\2\u03a2\u03a4\5\u008cG\2\u03a3\u039b"+
		"\3\2\2\2\u03a3\u039c\3\2\2\2\u03a3\u039d\3\2\2\2\u03a3\u039e\3\2\2\2\u03a3"+
		"\u039f\3\2\2\2\u03a3\u03a0\3\2\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a2\3\2"+
		"\2\2\u03a4\u008f\3\2\2\2\u03a5\u03a6\7\32\2\2\u03a6\u03a7\t\33\2\2\u03a7"+
		"\u03a8\5p9\2\u03a8\u03a9\7\21\2\2\u03a9\u03aa\5p9\2\u03aa\u03ab\t\34\2"+
		"\2\u03ab\u0091\3\2\2\2\u03ac\u03ae\7\33\2\2\u03ad\u03ac\3\2\2\2\u03ad"+
		"\u03ae\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b9\7\20\2\2\u03b0\u03ba\7"+
		"\r\2\2\u03b1\u03b6\5\u0094K\2\u03b2\u03b3\7\21\2\2\u03b3\u03b5\5\u0094"+
		"K\2\u03b4\u03b2\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b6"+
		"\u03b7\3\2\2\2\u03b7\u03ba\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9\u03b0\3\2"+
		"\2\2\u03b9\u03b1\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\7\22\2\2\u03bc"+
		"\u0093\3\2\2\2\u03bd\u03be\5\u00a2R\2\u03be\u03bf\7\r\2\2\u03bf\u03c0"+
		"\5p9\2\u03c0\u0095\3\2\2\2\u03c1\u03c2\5*\26\2\u03c2\u03cc\7\20\2\2\u03c3"+
		"\u03cd\7\r\2\2\u03c4\u03c9\5\u0098M\2\u03c5\u03c6\7\21\2\2\u03c6\u03c8"+
		"\5\u0098M\2\u03c7\u03c5\3\2\2\2\u03c8\u03cb\3\2\2\2\u03c9\u03c7\3\2\2"+
		"\2\u03c9\u03ca\3\2\2\2\u03ca\u03cd\3\2\2\2\u03cb\u03c9\3\2\2\2\u03cc\u03c3"+
		"\3\2\2\2\u03cc\u03c4\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\7\22\2\2"+
		"\u03cf\u0097\3\2\2\2\u03d0\u03d1\5\u00a2R\2\u03d1\u03d2\7\r\2\2\u03d2"+
		"\u03d3\5p9\2\u03d3\u0099\3\2\2\2\u03d4\u03d9\7\27\2\2\u03d5\u03d6\7\30"+
		"\2\2\u03d6\u03d7\5(\25\2\u03d7\u03d8\7\31\2\2\u03d8\u03da\3\2\2\2\u03d9"+
		"\u03d5\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03dc\3\2\2\2\u03db\u03d4\3\2"+
		"\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03e6\7\20\2\2\u03de"+
		"\u03e3\5p9\2\u03df\u03e0\7\21\2\2\u03e0\u03e2\5p9\2\u03e1\u03df\3\2\2"+
		"\2\u03e2\u03e5\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e7"+
		"\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03de\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7"+
		"\u03e8\3\2\2\2\u03e8\u03e9\7\22\2\2\u03e9\u009b\3\2\2\2\u03ea\u03eb\7"+
		"\u0094\2\2\u03eb\u03ec\7\u009f\2\2\u03ec\u009d\3\2\2\2\u03ed\u03ee\7\u0095"+
		"\2\2\u03ee\u03ef\7\u009f\2\2\u03ef\u03f0\7\25\2\2\u03f0\u03f2\5\26\f\2"+
		"\u03f1\u03f3\5\u009cO\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3"+
		"\u009f\3\2\2\2\u03f4\u03f5\7\u0096\2\2\u03f5\u03f6\7\20\2\2\u03f6\u03fb"+
		"\5\u009eP\2\u03f7\u03f8\7\21\2\2\u03f8\u03fa\5\u009eP\2\u03f9\u03f7\3"+
		"\2\2\2\u03fa\u03fd\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc"+
		"\u03fe\3\2\2\2\u03fd\u03fb\3\2\2\2\u03fe\u0400\7\22\2\2\u03ff\u0401\5"+
		"\u009cO\2\u0400\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u00a1\3\2\2\2"+
		"\u0402\u0403\t\35\2\2\u0403\u00a3\3\2\2\2\u0404\u0405\7\u0097\2\2\u0405"+
		"\u0406\5\u00a2R\2\u0406\u00a5\3\2\2\2\u0407\u040d\5\u00a2R\2\u0408\u040d"+
		"\5\u00a8U\2\u0409\u040d\7\u0098\2\2\u040a\u040d\7\u0099\2\2\u040b\u040d"+
		"\7\u009a\2\2\u040c\u0407\3\2\2\2\u040c\u0408\3\2\2\2\u040c\u0409\3\2\2"+
		"\2\u040c\u040a\3\2\2\2\u040c\u040b\3\2\2\2\u040d\u00a7\3\2\2\2\u040e\u040f"+
		"\5\u00a2R\2\u040f\u0411\7 \2\2\u0410\u0412\5\u00aaV\2\u0411\u0410\3\2"+
		"\2\2\u0411\u0412\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0414\7!\2\2\u0414"+
		"\u00a9\3\2\2\2\u0415\u041a\5p9\2\u0416\u0417\7\21\2\2\u0417\u0419\5p9"+
		"\2\u0418\u0416\3\2\2\2\u0419\u041c\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b"+
		"\3\2\2\2\u041b\u00ab\3\2\2\2\u041c\u041a\3\2\2\2\u041d\u041f\7\u00a0\2"+
		"\2\u041e\u0420\5\u00aeX\2\u041f\u041e\3\2\2\2\u041f\u0420\3\2\2\2\u0420"+
		"\u00ad\3\2\2\2\u0421\u0425\5r:\2\u0422\u0425\5v<\2\u0423\u0425\7\u009f"+
		"\2\2\u0424\u0421\3\2\2\2\u0424\u0422\3\2\2\2\u0424\u0423\3\2\2\2\u0425"+
		"\u00af\3\2\2\2{\u00b1\u00b6\u00bc\u00c2\u00c8\u00ce\u00d4\u00da\u00e0"+
		"\u00e7\u00ed\u00f3\u00f7\u00fe\u0103\u0107\u010a\u0112\u0115\u011d\u0120"+
		"\u0129\u0131\u0138\u0141\u0144\u014f\u0154\u0159\u016a\u0171\u0189\u0198"+
		"\u01a0\u01a4\u01af\u01b9\u01bc\u01c1\u01c6\u01d3\u01dc\u01ee\u01f1\u01f9"+
		"\u01ff\u0204\u0208\u020b\u020e\u0212\u021c\u0225\u0231\u023d\u0240\u0246"+
		"\u024d\u0261\u0271\u0280\u0292\u029a\u02a1\u02a3\u02ac\u02e6\u02eb\u02f8"+
		"\u02fa\u02fc\u030f\u0311\u0324\u0329\u032c\u0331\u0333\u0336\u033a\u033e"+
		"\u0341\u0344\u0348\u034b\u034e\u0351\u0355\u0358\u035b\u035f\u0362\u0365"+
		"\u0368\u036e\u0372\u0375\u0379\u037c\u0380\u0384\u0386\u0395\u03a3\u03ad"+
		"\u03b6\u03b9\u03c9\u03cc\u03d9\u03db\u03e3\u03e6\u03f2\u03fb\u0400\u040c"+
		"\u0411\u041a\u041f\u0424";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}