// Generated from C:/Users/Admin/IdeaProjects/antlr/src\SQLite.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, K_ABORT=25, 
		K_ACTION=26, K_ADD=27, K_AFTER=28, K_ALL=29, K_ALTER=30, K_SET=31, K_ECHO=32, 
		K_ON=33, K_OFF=34, K_ANALYZE=35, K_AND=36, K_AS=37, K_ASC=38, K_ATTACH=39, 
		K_AUTOINCREMENT=40, K_BEFORE=41, K_BEGIN=42, K_BETWEEN=43, K_BY=44, K_CASCADE=45, 
		K_CASE=46, K_CAST=47, K_CHECK=48, K_COLLATE=49, K_COLUMN=50, K_COMMIT=51, 
		K_CONFLICT=52, K_CONSTRAINT=53, K_CONSTRAINTS=54, K_CREATE=55, K_VERTICAL=56, 
		K_HORIZONTAL=57, K_CROSS=58, K_CURRENT_DATE=59, K_CURRENT_TIME=60, K_CURRENT_TIMESTAMP=61, 
		K_DATABASE=62, K_DEFAULT=63, K_DEFERRABLE=64, K_DEFERRED=65, K_DELETE=66, 
		K_DESC=67, K_DETACH=68, K_DISTINCT=69, K_DROP=70, K_EACH=71, K_ELSE=72, 
		K_END=73, K_ESCAPE=74, K_EXCEPT=75, K_EXCLUSIVE=76, K_EXISTS=77, K_EXPLAIN=78, 
		K_FAIL=79, K_FOR=80, K_FOREIGN=81, K_FROM=82, K_FULL=83, K_GLOB=84, K_GROUP=85, 
		K_HAVING=86, K_IF=87, K_IGNORE=88, K_IMMEDIATE=89, K_IN=90, K_INDEX=91, 
		K_INDEXED=92, K_INITIALLY=93, K_INNER=94, K_INSERT=95, K_INSTEAD=96, K_INTERSECT=97, 
		K_INTO=98, K_IS=99, K_ISNULL=100, K_JOIN=101, K_KEY=102, K_LEFT=103, K_LIKE=104, 
		K_LIMIT=105, K_MATCH=106, K_NATURAL=107, K_NO=108, K_NOT=109, K_NOTNULL=110, 
		K_NULL=111, K_OF=112, K_OFFSET=113, K_OR=114, K_ORDER=115, K_OUTER=116, 
		K_PLAN=117, K_PRAGMA=118, K_PRIMARY=119, K_QUERY=120, K_RAISE=121, K_RECURSIVE=122, 
		K_REFERENCES=123, K_REGEXP=124, K_REINDEX=125, K_RELEASE=126, K_RENAME=127, 
		K_REPLACE=128, K_RESTRICT=129, K_RIGHT=130, K_ROLLBACK=131, K_ROW=132, 
		K_SAVEPOINT=133, K_SELECT=134, K_SESSION=135, K_TABLE=136, K_TEMP=137, 
		K_TEMPORARY=138, K_THEN=139, K_TO=140, K_TRANSACTION=141, K_TRIGGER=142, 
		K_UNION=143, K_UNIQUE=144, K_UPDATE=145, K_USING=146, K_VACUUM=147, K_VALUES=148, 
		K_VIEW=149, K_VIRTUAL=150, K_WHEN=151, K_WHERE=152, K_WITH=153, K_WITHOUT=154, 
		IDENTIFIER=155, NUMERIC_LITERAL=156, BIND_PARAMETER=157, STRING_LITERAL=158, 
		BLOB_LITERAL=159, SINGLE_LINE_COMMENT=160, MULTILINE_COMMENT=161, SPACES=162, 
		UNEXPECTED_CHAR=163;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_alter_stmt = 4, RULE_alter_session_stmt = 5, RULE_set_stmt = 6, RULE_set_keyword = 7, 
		RULE_set_value = 8, RULE_alter_table_stmt = 9, RULE_analyze_stmt = 10, 
		RULE_attach_stmt = 11, RULE_begin_stmt = 12, RULE_commit_stmt = 13, RULE_compound_select_stmt = 14, 
		RULE_create_index_stmt = 15, RULE_create_table_stmt = 16, RULE_federal_stmt = 17, 
		RULE_fed_vertical_stmt = 18, RULE_fed_vertical_attr = 19, RULE_fed_horizontal_stmt = 20, 
		RULE_fed_horizontal_attr_list = 21, RULE_fed_horizontal_attr = 22, RULE_create_trigger_stmt = 23, 
		RULE_create_view_stmt = 24, RULE_create_virtual_table_stmt = 25, RULE_delete_stmt = 26, 
		RULE_delete_stmt_limited = 27, RULE_detach_stmt = 28, RULE_drop_index_stmt = 29, 
		RULE_drop_table_stmt = 30, RULE_drop_table_options = 31, RULE_drop_trigger_stmt = 32, 
		RULE_drop_view_stmt = 33, RULE_factored_select_stmt = 34, RULE_insert_stmt = 35, 
		RULE_pragma_stmt = 36, RULE_reindex_stmt = 37, RULE_release_stmt = 38, 
		RULE_rollback_stmt = 39, RULE_savepoint_stmt = 40, RULE_simple_select_stmt = 41, 
		RULE_select_stmt = 42, RULE_select_or_values = 43, RULE_update_stmt = 44, 
		RULE_update_stmt_limited = 45, RULE_vacuum_stmt = 46, RULE_column_def = 47, 
		RULE_type_name = 48, RULE_column_constraint = 49, RULE_conflict_clause = 50, 
		RULE_expr = 51, RULE_foreign_key_clause = 52, RULE_raise_function = 53, 
		RULE_indexed_column = 54, RULE_table_constraint = 55, RULE_with_clause = 56, 
		RULE_qualified_table_name = 57, RULE_ordering_term = 58, RULE_pragma_value = 59, 
		RULE_common_table_expression = 60, RULE_result_column = 61, RULE_table_or_subquery = 62, 
		RULE_join_clause = 63, RULE_join_operator = 64, RULE_join_constraint = 65, 
		RULE_select_core = 66, RULE_compound_operator = 67, RULE_cte_table_name = 68, 
		RULE_signed_number = 69, RULE_literal_value = 70, RULE_unary_operator = 71, 
		RULE_error_message = 72, RULE_module_argument = 73, RULE_column_alias = 74, 
		RULE_keyword = 75, RULE_name = 76, RULE_function_name = 77, RULE_database_name = 78, 
		RULE_table_name = 79, RULE_table_or_index_name = 80, RULE_new_table_name = 81, 
		RULE_column_name = 82, RULE_collation_name = 83, RULE_foreign_table = 84, 
		RULE_index_name = 85, RULE_trigger_name = 86, RULE_view_name = 87, RULE_module_name = 88, 
		RULE_pragma_name = 89, RULE_savepoint_name = 90, RULE_table_alias = 91, 
		RULE_transaction_name = 92, RULE_any_name = 93;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "alter_stmt", "alter_session_stmt", 
		"set_stmt", "set_keyword", "set_value", "alter_table_stmt", "analyze_stmt", 
		"attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", "create_index_stmt", 
		"create_table_stmt", "federal_stmt", "fed_vertical_stmt", "fed_vertical_attr", 
		"fed_horizontal_stmt", "fed_horizontal_attr_list", "fed_horizontal_attr", 
		"create_trigger_stmt", "create_view_stmt", "create_virtual_table_stmt", 
		"delete_stmt", "delete_stmt_limited", "detach_stmt", "drop_index_stmt", 
		"drop_table_stmt", "drop_table_options", "drop_trigger_stmt", "drop_view_stmt", 
		"factored_select_stmt", "insert_stmt", "pragma_stmt", "reindex_stmt", 
		"release_stmt", "rollback_stmt", "savepoint_stmt", "simple_select_stmt", 
		"select_stmt", "select_or_values", "update_stmt", "update_stmt_limited", 
		"vacuum_stmt", "column_def", "type_name", "column_constraint", "conflict_clause", 
		"expr", "foreign_key_clause", "raise_function", "indexed_column", "table_constraint", 
		"with_clause", "qualified_table_name", "ordering_term", "pragma_value", 
		"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
		"join_operator", "join_constraint", "select_core", "compound_operator", 
		"cte_table_name", "signed_number", "literal_value", "unary_operator", 
		"error_message", "module_argument", "column_alias", "keyword", "name", 
		"function_name", "database_name", "table_name", "table_or_index_name", 
		"new_table_name", "column_name", "collation_name", "foreign_table", "index_name", 
		"trigger_name", "view_name", "module_name", "pragma_name", "savepoint_name", 
		"table_alias", "transaction_name", "any_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", "'~'", 
		"'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
		"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
		"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_ABORT", 
		"K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_SET", "K_ECHO", 
		"K_ON", "K_OFF", "K_ANALYZE", "K_AND", "K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", 
		"K_BEFORE", "K_BEGIN", "K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", 
		"K_CHECK", "K_COLLATE", "K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", 
		"K_CONSTRAINTS", "K_CREATE", "K_VERTICAL", "K_HORIZONTAL", "K_CROSS", 
		"K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", 
		"K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", 
		"K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ESCAPE", "K_EXCEPT", 
		"K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", 
		"K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", "K_IGNORE", 
		"K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", "K_INNER", 
		"K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", 
		"K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", 
		"K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", "K_OR", "K_ORDER", 
		"K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", 
		"K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", 
		"K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", 
		"K_SESSION", "K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", "K_TRANSACTION", 
		"K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", 
		"K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", 
		"IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", 
		"SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "SQLite.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLiteParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_SET) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (K_DELETE - 66)) | (1L << (K_DETACH - 66)) | (1L << (K_DROP - 66)) | (1L << (K_END - 66)) | (1L << (K_EXPLAIN - 66)) | (1L << (K_INSERT - 66)) | (1L << (K_PRAGMA - 66)) | (1L << (K_REINDEX - 66)) | (1L << (K_RELEASE - 66)) | (1L << (K_REPLACE - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (K_ROLLBACK - 131)) | (1L << (K_SAVEPOINT - 131)) | (1L << (K_SELECT - 131)) | (1L << (K_UPDATE - 131)) | (1L << (K_VACUUM - 131)) | (1L << (K_VALUES - 131)) | (1L << (K_WITH - 131)) | (1L << (UNEXPECTED_CHAR - 131)))) != 0)) {
				{
				setState(190);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case K_ALTER:
				case K_SET:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXPLAIN:
				case K_INSERT:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UPDATE:
				case K_VACUUM:
				case K_VALUES:
				case K_WITH:
					{
					setState(188);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(189);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(EOF);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLiteParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitError(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
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

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSql_stmt_list(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(200);
				match(SCOL);
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			sql_stmt();
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(207);
						match(SCOL);
						}
						}
						setState(210); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(212);
					sql_stmt();
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					match(SCOL);
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public Set_stmtContext set_stmt() {
			return getRuleContext(Set_stmtContext.class,0);
		}
		public Alter_stmtContext alter_stmt() {
			return getRuleContext(Alter_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(SQLiteParser.K_EXPLAIN, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLiteParser.K_QUERY, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLiteParser.K_PLAN, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSql_stmt(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(224);
				match(K_EXPLAIN);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(225);
					match(K_QUERY);
					setState(226);
					match(K_PLAN);
					}
				}

				}
			}

			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(231);
				analyze_stmt();
				}
				break;
			case 2:
				{
				setState(232);
				attach_stmt();
				}
				break;
			case 3:
				{
				setState(233);
				begin_stmt();
				}
				break;
			case 4:
				{
				setState(234);
				commit_stmt();
				}
				break;
			case 5:
				{
				setState(235);
				compound_select_stmt();
				}
				break;
			case 6:
				{
				setState(236);
				create_index_stmt();
				}
				break;
			case 7:
				{
				setState(237);
				create_table_stmt();
				}
				break;
			case 8:
				{
				setState(238);
				create_trigger_stmt();
				}
				break;
			case 9:
				{
				setState(239);
				create_view_stmt();
				}
				break;
			case 10:
				{
				setState(240);
				create_virtual_table_stmt();
				}
				break;
			case 11:
				{
				setState(241);
				delete_stmt();
				}
				break;
			case 12:
				{
				setState(242);
				delete_stmt_limited();
				}
				break;
			case 13:
				{
				setState(243);
				detach_stmt();
				}
				break;
			case 14:
				{
				setState(244);
				drop_index_stmt();
				}
				break;
			case 15:
				{
				setState(245);
				drop_table_stmt();
				}
				break;
			case 16:
				{
				setState(246);
				drop_trigger_stmt();
				}
				break;
			case 17:
				{
				setState(247);
				drop_view_stmt();
				}
				break;
			case 18:
				{
				setState(248);
				factored_select_stmt();
				}
				break;
			case 19:
				{
				setState(249);
				insert_stmt();
				}
				break;
			case 20:
				{
				setState(250);
				pragma_stmt();
				}
				break;
			case 21:
				{
				setState(251);
				reindex_stmt();
				}
				break;
			case 22:
				{
				setState(252);
				release_stmt();
				}
				break;
			case 23:
				{
				setState(253);
				rollback_stmt();
				}
				break;
			case 24:
				{
				setState(254);
				savepoint_stmt();
				}
				break;
			case 25:
				{
				setState(255);
				simple_select_stmt();
				}
				break;
			case 26:
				{
				setState(256);
				select_stmt();
				}
				break;
			case 27:
				{
				setState(257);
				update_stmt();
				}
				break;
			case 28:
				{
				setState(258);
				update_stmt_limited();
				}
				break;
			case 29:
				{
				setState(259);
				vacuum_stmt();
				}
				break;
			case 30:
				{
				setState(260);
				set_stmt();
				}
				break;
			case 31:
				{
				setState(261);
				alter_stmt();
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

	public static class Alter_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Alter_session_stmtContext alter_session_stmt() {
			return getRuleContext(Alter_session_stmtContext.class,0);
		}
		public Alter_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAlter_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAlter_stmt(this);
		}
	}

	public final Alter_stmtContext alter_stmt() throws RecognitionException {
		Alter_stmtContext _localctx = new Alter_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alter_stmt);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				alter_table_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				alter_session_stmt();
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

	public static class Alter_session_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SQLiteParser.K_ALTER, 0); }
		public TerminalNode K_SESSION() { return getToken(SQLiteParser.K_SESSION, 0); }
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public Alter_session_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_session_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAlter_session_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAlter_session_stmt(this);
		}
	}

	public final Alter_session_stmtContext alter_session_stmt() throws RecognitionException {
		Alter_session_stmtContext _localctx = new Alter_session_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alter_session_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(K_ALTER);
			setState(269);
			match(K_SESSION);
			setState(270);
			match(K_SET);
			setState(271);
			any_name();
			setState(272);
			match(ASSIGN);
			setState(273);
			any_name();
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

	public static class Set_stmtContext extends ParserRuleContext {
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public Set_keywordContext set_keyword() {
			return getRuleContext(Set_keywordContext.class,0);
		}
		public Set_valueContext set_value() {
			return getRuleContext(Set_valueContext.class,0);
		}
		public Set_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSet_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSet_stmt(this);
		}
	}

	public final Set_stmtContext set_stmt() throws RecognitionException {
		Set_stmtContext _localctx = new Set_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_set_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(K_SET);
			setState(276);
			set_keyword();
			setState(277);
			set_value();
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

	public static class Set_keywordContext extends ParserRuleContext {
		public TerminalNode K_ECHO() { return getToken(SQLiteParser.K_ECHO, 0); }
		public Set_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSet_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSet_keyword(this);
		}
	}

	public final Set_keywordContext set_keyword() throws RecognitionException {
		Set_keywordContext _localctx = new Set_keywordContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_set_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(K_ECHO);
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

	public static class Set_valueContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_OFF() { return getToken(SQLiteParser.K_OFF, 0); }
		public Set_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSet_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSet_value(this);
		}
	}

	public final Set_valueContext set_value() throws RecognitionException {
		Set_valueContext _localctx = new Set_valueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_set_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !(_la==K_ON || _la==K_OFF) ) {
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

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SQLiteParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SQLiteParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SQLiteParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(SQLiteParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAlter_table_stmt(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(K_ALTER);
			setState(284);
			match(K_TABLE);
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(285);
				database_name();
				setState(286);
				match(DOT);
				}
				break;
			}
			setState(290);
			table_name();
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(291);
				match(K_RENAME);
				setState(292);
				match(K_TO);
				setState(293);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(294);
				match(K_ADD);
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(295);
					match(K_COLUMN);
					}
					break;
				}
				setState(298);
				column_def();
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

	public static class Analyze_stmtContext extends ParserRuleContext {
		public TerminalNode K_ANALYZE() { return getToken(SQLiteParser.K_ANALYZE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAnalyze_stmt(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(K_ANALYZE);
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(302);
				database_name();
				}
				break;
			case 2:
				{
				setState(303);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(304);
				database_name();
				setState(305);
				match(DOT);
				setState(306);
				table_or_index_name();
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

	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode K_ATTACH() { return getToken(SQLiteParser.K_ATTACH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAttach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAttach_stmt(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(K_ATTACH);
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(311);
				match(K_DATABASE);
				}
				break;
			}
			setState(314);
			expr(0);
			setState(315);
			match(K_AS);
			setState(316);
			database_name();
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

	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLiteParser.K_EXCLUSIVE, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterBegin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitBegin_stmt(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(K_BEGIN);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_DEFERRED - 65)) | (1L << (K_EXCLUSIVE - 65)) | (1L << (K_IMMEDIATE - 65)))) != 0)) {
				{
				setState(319);
				_la = _input.LA(1);
				if ( !(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_DEFERRED - 65)) | (1L << (K_EXCLUSIVE - 65)) | (1L << (K_IMMEDIATE - 65)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(322);
				match(K_TRANSACTION);
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(323);
					transaction_name();
					}
					break;
				}
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

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode K_COMMIT() { return getToken(SQLiteParser.K_COMMIT, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCommit_stmt(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(329);
				match(K_TRANSACTION);
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(330);
					transaction_name();
					}
					break;
				}
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

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_UNION() { return getTokens(SQLiteParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(SQLiteParser.K_UNION, i);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(SQLiteParser.K_INTERSECT); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(SQLiteParser.K_INTERSECT, i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(SQLiteParser.K_EXCEPT); }
		public TerminalNode K_EXCEPT(int i) {
			return getToken(SQLiteParser.K_EXCEPT, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(SQLiteParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(SQLiteParser.K_ALL, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCompound_select_stmt(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(335);
				match(K_WITH);
				setState(337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(336);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(339);
				common_table_expression();
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(340);
					match(COMMA);
					setState(341);
					common_table_expression();
					}
					}
					setState(346);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(349);
			select_core();
			setState(359); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(356);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(350);
					match(K_UNION);
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(351);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(354);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(355);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(358);
				select_core();
				}
				}
				setState(361); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(363);
				match(K_ORDER);
				setState(364);
				match(K_BY);
				setState(365);
				ordering_term();
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(366);
					match(COMMA);
					setState(367);
					ordering_term();
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(375);
				match(K_LIMIT);
				setState(376);
				expr(0);
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(377);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(378);
					expr(0);
					}
				}

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

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_index_stmt(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(K_CREATE);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(384);
				match(K_UNIQUE);
				}
			}

			setState(387);
			match(K_INDEX);
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(388);
				match(K_IF);
				setState(389);
				match(K_NOT);
				setState(390);
				match(K_EXISTS);
				}
				break;
			}
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(393);
				database_name();
				setState(394);
				match(DOT);
				}
				break;
			}
			setState(398);
			index_name();
			setState(399);
			match(K_ON);
			setState(400);
			table_name();
			setState(401);
			match(OPEN_PAR);
			setState(402);
			indexed_column();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(403);
				match(COMMA);
				setState(404);
				indexed_column();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
			match(CLOSE_PAR);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(411);
				match(K_WHERE);
				setState(412);
				expr(0);
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Federal_stmtContext federal_stmt() {
			return getRuleContext(Federal_stmtContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode K_WITHOUT() { return getToken(SQLiteParser.K_WITHOUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_table_stmt(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(K_CREATE);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(416);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(419);
			match(K_TABLE);
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(420);
				match(K_IF);
				setState(421);
				match(K_NOT);
				setState(422);
				match(K_EXISTS);
				}
				break;
			}
			setState(428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(425);
				database_name();
				setState(426);
				match(DOT);
				}
				break;
			}
			setState(430);
			table_name();
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(431);
				match(OPEN_PAR);
				setState(432);
				column_def();
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(433);
						match(COMMA);
						setState(434);
						column_def();
						}
						} 
					}
					setState(439);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(440);
					match(COMMA);
					setState(441);
					table_constraint();
					}
					}
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(447);
				match(CLOSE_PAR);
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(448);
					match(K_WITHOUT);
					setState(449);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(452);
				match(K_AS);
				setState(453);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VERTICAL || _la==K_HORIZONTAL) {
				{
				setState(456);
				federal_stmt();
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

	public static class Federal_stmtContext extends ParserRuleContext {
		public Fed_vertical_stmtContext fed_vertical_stmt() {
			return getRuleContext(Fed_vertical_stmtContext.class,0);
		}
		public Fed_horizontal_stmtContext fed_horizontal_stmt() {
			return getRuleContext(Fed_horizontal_stmtContext.class,0);
		}
		public Federal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_federal_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFederal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFederal_stmt(this);
		}
	}

	public final Federal_stmtContext federal_stmt() throws RecognitionException {
		Federal_stmtContext _localctx = new Federal_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_federal_stmt);
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_VERTICAL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(459);
				fed_vertical_stmt();
				}
				}
				break;
			case K_HORIZONTAL:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(460);
				fed_horizontal_stmt();
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

	public static class Fed_vertical_stmtContext extends ParserRuleContext {
		public TerminalNode K_VERTICAL() { return getToken(SQLiteParser.K_VERTICAL, 0); }
		public List<Fed_vertical_attrContext> fed_vertical_attr() {
			return getRuleContexts(Fed_vertical_attrContext.class);
		}
		public Fed_vertical_attrContext fed_vertical_attr(int i) {
			return getRuleContext(Fed_vertical_attrContext.class,i);
		}
		public Fed_vertical_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fed_vertical_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFed_vertical_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFed_vertical_stmt(this);
		}
	}

	public final Fed_vertical_stmtContext fed_vertical_stmt() throws RecognitionException {
		Fed_vertical_stmtContext _localctx = new Fed_vertical_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fed_vertical_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(K_VERTICAL);
			setState(464);
			match(OPEN_PAR);
			{
			setState(465);
			fed_vertical_attr();
			}
			setState(466);
			match(COMMA);
			{
			setState(467);
			fed_vertical_attr();
			}
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(468);
				match(COMMA);
				setState(469);
				fed_vertical_attr();
				}
			}

			setState(472);
			match(CLOSE_PAR);
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

	public static class Fed_vertical_attrContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Fed_vertical_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fed_vertical_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFed_vertical_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFed_vertical_attr(this);
		}
	}

	public final Fed_vertical_attrContext fed_vertical_attr() throws RecognitionException {
		Fed_vertical_attrContext _localctx = new Fed_vertical_attrContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fed_vertical_attr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(OPEN_PAR);
			setState(475);
			column_name();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(476);
				match(COMMA);
				setState(477);
				column_name();
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(483);
			match(CLOSE_PAR);
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

	public static class Fed_horizontal_stmtContext extends ParserRuleContext {
		public TerminalNode K_HORIZONTAL() { return getToken(SQLiteParser.K_HORIZONTAL, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Fed_horizontal_attr_listContext fed_horizontal_attr_list() {
			return getRuleContext(Fed_horizontal_attr_listContext.class,0);
		}
		public Fed_horizontal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fed_horizontal_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFed_horizontal_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFed_horizontal_stmt(this);
		}
	}

	public final Fed_horizontal_stmtContext fed_horizontal_stmt() throws RecognitionException {
		Fed_horizontal_stmtContext _localctx = new Fed_horizontal_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_fed_horizontal_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(K_HORIZONTAL);
			setState(486);
			match(OPEN_PAR);
			setState(487);
			column_name();
			setState(488);
			match(OPEN_PAR);
			setState(489);
			fed_horizontal_attr_list();
			setState(490);
			match(CLOSE_PAR);
			setState(491);
			match(CLOSE_PAR);
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

	public static class Fed_horizontal_attr_listContext extends ParserRuleContext {
		public List<Fed_horizontal_attrContext> fed_horizontal_attr() {
			return getRuleContexts(Fed_horizontal_attrContext.class);
		}
		public Fed_horizontal_attrContext fed_horizontal_attr(int i) {
			return getRuleContext(Fed_horizontal_attrContext.class,i);
		}
		public Fed_horizontal_attr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fed_horizontal_attr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFed_horizontal_attr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFed_horizontal_attr_list(this);
		}
	}

	public final Fed_horizontal_attr_listContext fed_horizontal_attr_list() throws RecognitionException {
		Fed_horizontal_attr_listContext _localctx = new Fed_horizontal_attr_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fed_horizontal_attr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(493);
			fed_horizontal_attr();
			}
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(494);
				match(COMMA);
				setState(495);
				fed_horizontal_attr();
				}
				}
				setState(500);
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

	public static class Fed_horizontal_attrContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public Fed_horizontal_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fed_horizontal_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFed_horizontal_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFed_horizontal_attr(this);
		}
	}

	public final Fed_horizontal_attrContext fed_horizontal_attr() throws RecognitionException {
		Fed_horizontal_attrContext _localctx = new Fed_horizontal_attrContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_fed_horizontal_attr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_la = _input.LA(1);
			if ( !(_la==NUMERIC_LITERAL || _la==STRING_LITERAL) ) {
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

	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public TerminalNode K_BEFORE() { return getToken(SQLiteParser.K_BEFORE, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLiteParser.K_AFTER, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLiteParser.K_INSTEAD, 0); }
		public List<TerminalNode> K_OF() { return getTokens(SQLiteParser.K_OF); }
		public TerminalNode K_OF(int i) {
			return getToken(SQLiteParser.K_OF, i);
		}
		public TerminalNode K_FOR() { return getToken(SQLiteParser.K_FOR, 0); }
		public TerminalNode K_EACH() { return getToken(SQLiteParser.K_EACH, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLiteParser.K_WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_trigger_stmt(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(K_CREATE);
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(504);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(507);
			match(K_TRIGGER);
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(508);
				match(K_IF);
				setState(509);
				match(K_NOT);
				setState(510);
				match(K_EXISTS);
				}
				break;
			}
			setState(516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(513);
				database_name();
				setState(514);
				match(DOT);
				}
				break;
			}
			setState(518);
			trigger_name();
			setState(523);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(519);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(520);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(521);
				match(K_INSTEAD);
				setState(522);
				match(K_OF);
				}
				break;
			case K_DELETE:
			case K_INSERT:
			case K_UPDATE:
				break;
			default:
				break;
			}
			setState(539);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(525);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(526);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(527);
				match(K_UPDATE);
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(528);
					match(K_OF);
					setState(529);
					column_name();
					setState(534);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(530);
						match(COMMA);
						setState(531);
						column_name();
						}
						}
						setState(536);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(541);
			match(K_ON);
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(542);
				database_name();
				setState(543);
				match(DOT);
				}
				break;
			}
			setState(547);
			table_name();
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(548);
				match(K_FOR);
				setState(549);
				match(K_EACH);
				setState(550);
				match(K_ROW);
				}
			}

			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(553);
				match(K_WHEN);
				setState(554);
				expr(0);
				}
			}

			setState(557);
			match(K_BEGIN);
			setState(566); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(562);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(558);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(559);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(560);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(561);
					select_stmt();
					}
					break;
				}
				setState(564);
				match(SCOL);
				}
				}
				setState(568); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (K_DELETE - 66)) | (1L << (K_INSERT - 66)) | (1L << (K_REPLACE - 66)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (K_SELECT - 134)) | (1L << (K_UPDATE - 134)) | (1L << (K_VALUES - 134)) | (1L << (K_WITH - 134)))) != 0) );
			setState(570);
			match(K_END);
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

	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_view_stmt(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(K_CREATE);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(573);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(576);
			match(K_VIEW);
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(577);
				match(K_IF);
				setState(578);
				match(K_NOT);
				setState(579);
				match(K_EXISTS);
				}
				break;
			}
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(582);
				database_name();
				setState(583);
				match(DOT);
				}
				break;
			}
			setState(587);
			view_name();
			setState(588);
			match(K_AS);
			setState(589);
			select_stmt();
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

	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLiteParser.K_VIRTUAL, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_virtual_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_virtual_table_stmt(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(K_CREATE);
			setState(592);
			match(K_VIRTUAL);
			setState(593);
			match(K_TABLE);
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(594);
				match(K_IF);
				setState(595);
				match(K_NOT);
				setState(596);
				match(K_EXISTS);
				}
				break;
			}
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(599);
				database_name();
				setState(600);
				match(DOT);
				}
				break;
			}
			setState(604);
			table_name();
			setState(605);
			match(K_USING);
			setState(606);
			module_name();
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(607);
				match(OPEN_PAR);
				setState(608);
				module_argument();
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(609);
					match(COMMA);
					setState(610);
					module_argument();
					}
					}
					setState(615);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(616);
				match(CLOSE_PAR);
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDelete_stmt(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(620);
				with_clause();
				}
			}

			setState(623);
			match(K_DELETE);
			setState(624);
			match(K_FROM);
			setState(625);
			qualified_table_name();
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(626);
				match(K_WHERE);
				setState(627);
				expr(0);
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

	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDelete_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDelete_stmt_limited(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(630);
				with_clause();
				}
			}

			setState(633);
			match(K_DELETE);
			setState(634);
			match(K_FROM);
			setState(635);
			qualified_table_name();
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(636);
				match(K_WHERE);
				setState(637);
				expr(0);
				}
			}

			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(640);
					match(K_ORDER);
					setState(641);
					match(K_BY);
					setState(642);
					ordering_term();
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(643);
						match(COMMA);
						setState(644);
						ordering_term();
						}
						}
						setState(649);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(652);
				match(K_LIMIT);
				setState(653);
				expr(0);
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(654);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(655);
					expr(0);
					}
				}

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

	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DETACH() { return getToken(SQLiteParser.K_DETACH, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDetach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDetach_stmt(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(K_DETACH);
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(661);
				match(K_DATABASE);
				}
				break;
			}
			setState(664);
			database_name();
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

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_index_stmt(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(K_DROP);
			setState(667);
			match(K_INDEX);
			setState(670);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(668);
				match(K_IF);
				setState(669);
				match(K_EXISTS);
				}
				break;
			}
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(672);
				database_name();
				setState(673);
				match(DOT);
				}
				break;
			}
			setState(677);
			index_name();
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

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_table_optionsContext drop_table_options() {
			return getRuleContext(Drop_table_optionsContext.class,0);
		}
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_table_stmt(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(K_DROP);
			setState(680);
			match(K_TABLE);
			setState(683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(681);
				match(K_IF);
				setState(682);
				match(K_EXISTS);
				}
				break;
			}
			setState(688);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(685);
				database_name();
				setState(686);
				match(DOT);
				}
				break;
			}
			setState(690);
			table_name();
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CASCADE) {
				{
				setState(691);
				drop_table_options();
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

	public static class Drop_table_optionsContext extends ParserRuleContext {
		public TerminalNode K_CASCADE() { return getToken(SQLiteParser.K_CASCADE, 0); }
		public TerminalNode K_CONSTRAINTS() { return getToken(SQLiteParser.K_CONSTRAINTS, 0); }
		public Drop_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_table_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_table_options(this);
		}
	}

	public final Drop_table_optionsContext drop_table_options() throws RecognitionException {
		Drop_table_optionsContext _localctx = new Drop_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_drop_table_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(K_CASCADE);
			setState(695);
			match(K_CONSTRAINTS);
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

	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_trigger_stmt(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(K_DROP);
			setState(698);
			match(K_TRIGGER);
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(699);
				match(K_IF);
				setState(700);
				match(K_EXISTS);
				}
				break;
			}
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(703);
				database_name();
				setState(704);
				match(DOT);
				}
				break;
			}
			setState(708);
			trigger_name();
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

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_view_stmt(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(K_DROP);
			setState(711);
			match(K_VIEW);
			setState(714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(712);
				match(K_IF);
				setState(713);
				match(K_EXISTS);
				}
				break;
			}
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(716);
				database_name();
				setState(717);
				match(DOT);
				}
				break;
			}
			setState(721);
			view_name();
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

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFactored_select_stmt(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(723);
				match(K_WITH);
				setState(725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(724);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(727);
				common_table_expression();
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(728);
					match(COMMA);
					setState(729);
					common_table_expression();
					}
					}
					setState(734);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(737);
			select_core();
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(738);
				compound_operator();
				setState(739);
				select_core();
				}
				}
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(746);
				match(K_ORDER);
				setState(747);
				match(K_BY);
				setState(748);
				ordering_term();
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(749);
					match(COMMA);
					setState(750);
					ordering_term();
					}
					}
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(758);
				match(K_LIMIT);
				setState(759);
				expr(0);
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(760);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(761);
					expr(0);
					}
				}

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

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(SQLiteParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitInsert_stmt(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(766);
				with_clause();
				}
			}

			setState(786);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(769);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(770);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(771);
				match(K_INSERT);
				setState(772);
				match(K_OR);
				setState(773);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(774);
				match(K_INSERT);
				setState(775);
				match(K_OR);
				setState(776);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(777);
				match(K_INSERT);
				setState(778);
				match(K_OR);
				setState(779);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(780);
				match(K_INSERT);
				setState(781);
				match(K_OR);
				setState(782);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(783);
				match(K_INSERT);
				setState(784);
				match(K_OR);
				setState(785);
				match(K_IGNORE);
				}
				break;
			}
			setState(788);
			match(K_INTO);
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(789);
				database_name();
				setState(790);
				match(DOT);
				}
				break;
			}
			setState(794);
			table_name();
			setState(806);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(795);
				match(OPEN_PAR);
				setState(796);
				column_name();
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(797);
					match(COMMA);
					setState(798);
					column_name();
					}
					}
					setState(803);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(804);
				match(CLOSE_PAR);
				}
			}

			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(808);
				match(K_VALUES);
				setState(809);
				match(OPEN_PAR);
				setState(810);
				expr(0);
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(811);
					match(COMMA);
					setState(812);
					expr(0);
					}
					}
					setState(817);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(818);
				match(CLOSE_PAR);
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(819);
					match(COMMA);
					setState(820);
					match(OPEN_PAR);
					setState(821);
					expr(0);
					setState(826);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(822);
						match(COMMA);
						setState(823);
						expr(0);
						}
						}
						setState(828);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(829);
					match(CLOSE_PAR);
					}
					}
					setState(835);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(836);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(837);
				match(K_DEFAULT);
				setState(838);
				match(K_VALUES);
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

	public static class Pragma_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRAGMA() { return getToken(SQLiteParser.K_PRAGMA, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_stmt(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(K_PRAGMA);
			setState(845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(842);
				database_name();
				setState(843);
				match(DOT);
				}
				break;
			}
			setState(847);
			pragma_name();
			setState(854);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(848);
				match(ASSIGN);
				setState(849);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(850);
				match(OPEN_PAR);
				setState(851);
				pragma_value();
				setState(852);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_SET:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
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

	public static class Reindex_stmtContext extends ParserRuleContext {
		public TerminalNode K_REINDEX() { return getToken(SQLiteParser.K_REINDEX, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitReindex_stmt(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(K_REINDEX);
			setState(867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(857);
				collation_name();
				}
				break;
			case 2:
				{
				setState(861);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(858);
					database_name();
					setState(859);
					match(DOT);
					}
					break;
				}
				setState(865);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(863);
					table_name();
					}
					break;
				case 2:
					{
					setState(864);
					index_name();
					}
					break;
				}
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

	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode K_RELEASE() { return getToken(SQLiteParser.K_RELEASE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRelease_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRelease_stmt(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(K_RELEASE);
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(870);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(873);
			savepoint_name();
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

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRollback_stmt(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			match(K_ROLLBACK);
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(876);
				match(K_TRANSACTION);
				setState(878);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(877);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(887);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(882);
				match(K_TO);
				setState(884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(883);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(886);
				savepoint_name();
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

	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSavepoint_stmt(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			match(K_SAVEPOINT);
			setState(890);
			savepoint_name();
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

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSimple_select_stmt(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(892);
				match(K_WITH);
				setState(894);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(893);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(896);
				common_table_expression();
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(897);
					match(COMMA);
					setState(898);
					common_table_expression();
					}
					}
					setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(906);
			select_core();
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(907);
				match(K_ORDER);
				setState(908);
				match(K_BY);
				setState(909);
				ordering_term();
				setState(914);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(910);
					match(COMMA);
					setState(911);
					ordering_term();
					}
					}
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(919);
				match(K_LIMIT);
				setState(920);
				expr(0);
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(921);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(922);
					expr(0);
					}
				}

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

	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_stmt(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(927);
				match(K_WITH);
				setState(929);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(928);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(931);
				common_table_expression();
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(932);
					match(COMMA);
					setState(933);
					common_table_expression();
					}
					}
					setState(938);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(941);
			select_or_values();
			setState(947);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(942);
				compound_operator();
				setState(943);
				select_or_values();
				}
				}
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(950);
				match(K_ORDER);
				setState(951);
				match(K_BY);
				setState(952);
				ordering_term();
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(953);
					match(COMMA);
					setState(954);
					ordering_term();
					}
					}
					setState(959);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(962);
				match(K_LIMIT);
				setState(963);
				expr(0);
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(964);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(965);
					expr(0);
					}
				}

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

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_or_values(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_select_or_values);
		int _la;
		try {
			setState(1044);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(970);
				match(K_SELECT);
				setState(972);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(971);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
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
				setState(974);
				result_column();
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(975);
					match(COMMA);
					setState(976);
					result_column();
					}
					}
					setState(981);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(982);
					match(K_FROM);
					setState(992);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
					case 1:
						{
						setState(983);
						table_or_subquery();
						setState(988);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(984);
							match(COMMA);
							setState(985);
							table_or_subquery();
							}
							}
							setState(990);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(991);
						join_clause();
						}
						break;
					}
					}
				}

				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(996);
					match(K_WHERE);
					setState(997);
					expr(0);
					}
				}

				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1000);
					match(K_GROUP);
					setState(1001);
					match(K_BY);
					setState(1002);
					expr(0);
					setState(1007);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1003);
						match(COMMA);
						setState(1004);
						expr(0);
						}
						}
						setState(1009);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1012);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1010);
						match(K_HAVING);
						setState(1011);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1016);
				match(K_VALUES);
				setState(1017);
				match(OPEN_PAR);
				setState(1018);
				expr(0);
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1019);
					match(COMMA);
					setState(1020);
					expr(0);
					}
					}
					setState(1025);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1026);
				match(CLOSE_PAR);
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1027);
					match(COMMA);
					setState(1028);
					match(OPEN_PAR);
					setState(1029);
					expr(0);
					setState(1034);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1030);
						match(COMMA);
						setState(1031);
						expr(0);
						}
						}
						setState(1036);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1037);
					match(CLOSE_PAR);
					}
					}
					setState(1043);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUpdate_stmt(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1046);
				with_clause();
				}
			}

			setState(1049);
			match(K_UPDATE);
			setState(1060);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1050);
				match(K_OR);
				setState(1051);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1052);
				match(K_OR);
				setState(1053);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1054);
				match(K_OR);
				setState(1055);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1056);
				match(K_OR);
				setState(1057);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1058);
				match(K_OR);
				setState(1059);
				match(K_IGNORE);
				}
				break;
			}
			setState(1062);
			qualified_table_name();
			setState(1063);
			match(K_SET);
			setState(1064);
			column_name();
			setState(1065);
			match(ASSIGN);
			setState(1066);
			expr(0);
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1067);
				match(COMMA);
				setState(1068);
				column_name();
				setState(1069);
				match(ASSIGN);
				setState(1070);
				expr(0);
				}
				}
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1077);
				match(K_WHERE);
				setState(1078);
				expr(0);
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

	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUpdate_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUpdate_stmt_limited(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1081);
				with_clause();
				}
			}

			setState(1084);
			match(K_UPDATE);
			setState(1095);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1085);
				match(K_OR);
				setState(1086);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1087);
				match(K_OR);
				setState(1088);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1089);
				match(K_OR);
				setState(1090);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1091);
				match(K_OR);
				setState(1092);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1093);
				match(K_OR);
				setState(1094);
				match(K_IGNORE);
				}
				break;
			}
			setState(1097);
			qualified_table_name();
			setState(1098);
			match(K_SET);
			setState(1099);
			column_name();
			setState(1100);
			match(ASSIGN);
			setState(1101);
			expr(0);
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1102);
				match(COMMA);
				setState(1103);
				column_name();
				setState(1104);
				match(ASSIGN);
				setState(1105);
				expr(0);
				}
				}
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1112);
				match(K_WHERE);
				setState(1113);
				expr(0);
				}
			}

			setState(1134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1116);
					match(K_ORDER);
					setState(1117);
					match(K_BY);
					setState(1118);
					ordering_term();
					setState(1123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1119);
						match(COMMA);
						setState(1120);
						ordering_term();
						}
						}
						setState(1125);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1128);
				match(K_LIMIT);
				setState(1129);
				expr(0);
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1130);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1131);
					expr(0);
					}
				}

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

	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode K_VACUUM() { return getToken(SQLiteParser.K_VACUUM, 0); }
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitVacuum_stmt(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			match(K_VACUUM);
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

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_def(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			column_name();
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1139);
				type_name();
				}
				break;
			}
			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & ((1L << (K_NOT - 109)) | (1L << (K_NULL - 109)) | (1L << (K_PRIMARY - 109)) | (1L << (K_REFERENCES - 109)) | (1L << (K_UNIQUE - 109)))) != 0)) {
				{
				{
				setState(1142);
				column_constraint();
				}
				}
				setState(1147);
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

	public static class Type_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1149); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1148);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1151); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1153);
				match(OPEN_PAR);
				setState(1154);
				signed_number();
				setState(1155);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1157);
				match(OPEN_PAR);
				setState(1158);
				signed_number();
				setState(1159);
				match(COMMA);
				setState(1160);
				signed_number();
				setState(1161);
				match(CLOSE_PAR);
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

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLiteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_constraint(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1165);
				match(K_CONSTRAINT);
				setState(1166);
				name();
				}
			}

			setState(1202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1169);
				match(K_PRIMARY);
				setState(1170);
				match(K_KEY);
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1171);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1174);
				conflict_clause();
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1175);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1178);
					match(K_NOT);
					}
				}

				setState(1181);
				match(K_NULL);
				setState(1182);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1183);
				match(K_UNIQUE);
				setState(1184);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1185);
				match(K_CHECK);
				setState(1186);
				match(OPEN_PAR);
				setState(1187);
				expr(0);
				setState(1188);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1190);
				match(K_DEFAULT);
				setState(1197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1191);
					signed_number();
					}
					break;
				case 2:
					{
					setState(1192);
					literal_value();
					}
					break;
				case 3:
					{
					setState(1193);
					match(OPEN_PAR);
					setState(1194);
					expr(0);
					setState(1195);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1199);
				match(K_COLLATE);
				setState(1200);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1201);
				foreign_key_clause();
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

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLiteParser.K_CONFLICT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitConflict_clause(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1204);
				match(K_ON);
				setState(1205);
				match(K_CONFLICT);
				setState(1206);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (K_FAIL - 79)) | (1L << (K_IGNORE - 79)) | (1L << (K_REPLACE - 79)) | (1L << (K_ROLLBACK - 79)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SQLiteParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(SQLiteParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(SQLiteParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(SQLiteParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(SQLiteParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(1210);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1211);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1220);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
					case 1:
						{
						setState(1212);
						database_name();
						setState(1213);
						match(DOT);
						}
						break;
					}
					setState(1217);
					table_name();
					setState(1218);
					match(DOT);
					}
					break;
				}
				setState(1222);
				column_name();
				}
				break;
			case 4:
				{
				setState(1223);
				unary_operator();
				setState(1224);
				expr(21);
				}
				break;
			case 5:
				{
				setState(1226);
				function_name();
				setState(1227);
				match(OPEN_PAR);
				setState(1240);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_SET:
				case K_ON:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1229);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
					case 1:
						{
						setState(1228);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1231);
					expr(0);
					setState(1236);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1232);
						match(COMMA);
						setState(1233);
						expr(0);
						}
						}
						setState(1238);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1239);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1242);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1244);
				match(OPEN_PAR);
				setState(1245);
				expr(0);
				setState(1246);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1248);
				match(K_CAST);
				setState(1249);
				match(OPEN_PAR);
				setState(1250);
				expr(0);
				setState(1251);
				match(K_AS);
				setState(1252);
				type_name();
				setState(1253);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1256);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1255);
						match(K_NOT);
						}
					}

					setState(1258);
					match(K_EXISTS);
					}
				}

				setState(1261);
				match(OPEN_PAR);
				setState(1262);
				select_stmt();
				setState(1263);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1265);
				match(K_CASE);
				setState(1267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1266);
					expr(0);
					}
					break;
				}
				setState(1274); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1269);
					match(K_WHEN);
					setState(1270);
					expr(0);
					setState(1271);
					match(K_THEN);
					setState(1272);
					expr(0);
					}
					}
					setState(1276); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1278);
					match(K_ELSE);
					setState(1279);
					expr(0);
					}
				}

				setState(1282);
				match(K_END);
				}
				break;
			case 10:
				{
				setState(1284);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1385);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1287);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1288);
						match(PIPE2);
						setState(1289);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1290);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1291);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1292);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1293);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1294);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1295);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1296);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1297);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1298);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1299);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1300);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1301);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1302);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1315);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
						case 1:
							{
							setState(1303);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1304);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1305);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1306);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1307);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1308);
							match(K_IS);
							setState(1309);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1310);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1311);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1312);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1313);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1314);
							match(K_REGEXP);
							}
							break;
						}
						setState(1317);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1318);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1319);
						match(K_AND);
						setState(1320);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1321);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1322);
						match(K_OR);
						setState(1323);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1324);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1325);
						match(K_IS);
						setState(1327);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
						case 1:
							{
							setState(1326);
							match(K_NOT);
							}
							break;
						}
						setState(1329);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1330);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1332);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1331);
							match(K_NOT);
							}
						}

						setState(1334);
						match(K_BETWEEN);
						setState(1335);
						expr(0);
						setState(1336);
						match(K_AND);
						setState(1337);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1339);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1340);
						match(K_COLLATE);
						setState(1341);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1342);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1344);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1343);
							match(K_NOT);
							}
						}

						setState(1346);
						_la = _input.LA(1);
						if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (K_GLOB - 84)) | (1L << (K_LIKE - 84)) | (1L << (K_MATCH - 84)) | (1L << (K_REGEXP - 84)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1347);
						expr(0);
						setState(1350);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
						case 1:
							{
							setState(1348);
							match(K_ESCAPE);
							setState(1349);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1352);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1357);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1353);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1354);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1355);
							match(K_NOT);
							setState(1356);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1359);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1361);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1360);
							match(K_NOT);
							}
						}

						setState(1363);
						match(K_IN);
						setState(1383);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
						case 1:
							{
							setState(1364);
							match(OPEN_PAR);
							setState(1374);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
							case 1:
								{
								setState(1365);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1366);
								expr(0);
								setState(1371);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1367);
									match(COMMA);
									setState(1368);
									expr(0);
									}
									}
									setState(1373);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1376);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1380);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
							case 1:
								{
								setState(1377);
								database_name();
								setState(1378);
								match(DOT);
								}
								break;
							}
							setState(1382);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
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

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SQLiteParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_DEFERRABLE() { return getToken(SQLiteParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SQLiteParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SQLiteParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SQLiteParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SQLiteParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SQLiteParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SQLiteParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SQLiteParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SQLiteParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLiteParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SQLiteParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SQLiteParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SQLiteParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SQLiteParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SQLiteParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SQLiteParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SQLiteParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SQLiteParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SQLiteParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SQLiteParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SQLiteParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SQLiteParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SQLiteParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SQLiteParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitForeign_key_clause(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			match(K_REFERENCES);
			setState(1391);
			foreign_table();
			setState(1403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1392);
				match(OPEN_PAR);
				setState(1393);
				column_name();
				setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1394);
					match(COMMA);
					setState(1395);
					column_name();
					}
					}
					setState(1400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1401);
				match(CLOSE_PAR);
				}
			}

			setState(1423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_ON || _la==K_MATCH) {
				{
				{
				setState(1419);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1405);
					match(K_ON);
					setState(1406);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1415);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
					case 1:
						{
						setState(1407);
						match(K_SET);
						setState(1408);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1409);
						match(K_SET);
						setState(1410);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1411);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1412);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1413);
						match(K_NO);
						setState(1414);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1417);
					match(K_MATCH);
					setState(1418);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1426);
					match(K_NOT);
					}
				}

				setState(1429);
				match(K_DEFERRABLE);
				setState(1434);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1430);
					match(K_INITIALLY);
					setState(1431);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1432);
					match(K_INITIALLY);
					setState(1433);
					match(K_IMMEDIATE);
					}
					break;
				}
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

	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode K_RAISE() { return getToken(SQLiteParser.K_RAISE, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRaise_function(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1438);
			match(K_RAISE);
			setState(1439);
			match(OPEN_PAR);
			setState(1444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1440);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1441);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1442);
				match(COMMA);
				setState(1443);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1446);
			match(CLOSE_PAR);
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

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIndexed_column(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448);
			column_name();
			setState(1451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1449);
				match(K_COLLATE);
				setState(1450);
				collation_name();
				}
			}

			setState(1454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1453);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Table_constraintContext extends ParserRuleContext {
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_constraint(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1456);
				match(K_CONSTRAINT);
				setState(1457);
				name();
				}
			}

			setState(1496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1463);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1460);
					match(K_PRIMARY);
					setState(1461);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1462);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1465);
				match(OPEN_PAR);
				setState(1466);
				indexed_column();
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1467);
					match(COMMA);
					setState(1468);
					indexed_column();
					}
					}
					setState(1473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1474);
				match(CLOSE_PAR);
				setState(1475);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1477);
				match(K_CHECK);
				setState(1478);
				match(OPEN_PAR);
				setState(1479);
				expr(0);
				setState(1480);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1482);
				match(K_FOREIGN);
				setState(1483);
				match(K_KEY);
				setState(1484);
				match(OPEN_PAR);
				setState(1485);
				column_name();
				setState(1490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1486);
					match(COMMA);
					setState(1487);
					column_name();
					}
					}
					setState(1492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1493);
				match(CLOSE_PAR);
				setState(1494);
				foreign_key_clause();
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

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(SQLiteParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(SQLiteParser.K_AS, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitWith_clause(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			match(K_WITH);
			setState(1500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1499);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1502);
			cte_table_name();
			setState(1503);
			match(K_AS);
			setState(1504);
			match(OPEN_PAR);
			setState(1505);
			select_stmt();
			setState(1506);
			match(CLOSE_PAR);
			setState(1516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1507);
				match(COMMA);
				setState(1508);
				cte_table_name();
				setState(1509);
				match(K_AS);
				setState(1510);
				match(OPEN_PAR);
				setState(1511);
				select_stmt();
				setState(1512);
				match(CLOSE_PAR);
				}
				}
				setState(1518);
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

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitQualified_table_name(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1519);
				database_name();
				setState(1520);
				match(DOT);
				}
				break;
			}
			setState(1524);
			table_name();
			setState(1530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1525);
				match(K_INDEXED);
				setState(1526);
				match(K_BY);
				setState(1527);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1528);
				match(K_NOT);
				setState(1529);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_SET:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_LIMIT:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
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

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitOrdering_term(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1532);
			expr(0);
			setState(1535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1533);
				match(K_COLLATE);
				setState(1534);
				collation_name();
				}
			}

			setState(1538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1537);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_value(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_pragma_value);
		try {
			setState(1543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1540);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1541);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1542);
				match(STRING_LITERAL);
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

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCommon_table_expression(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			table_name();
			setState(1557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1546);
				match(OPEN_PAR);
				setState(1547);
				column_name();
				setState(1552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1548);
					match(COMMA);
					setState(1549);
					column_name();
					}
					}
					setState(1554);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1555);
				match(CLOSE_PAR);
				}
			}

			setState(1559);
			match(K_AS);
			setState(1560);
			match(OPEN_PAR);
			setState(1561);
			select_stmt();
			setState(1562);
			match(CLOSE_PAR);
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

	public static class Result_columnContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitResult_column(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_result_column);
		int _la;
		try {
			setState(1576);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1564);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1565);
				table_name();
				setState(1566);
				match(DOT);
				setState(1567);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1569);
				expr(0);
				setState(1574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1571);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1570);
						match(K_AS);
						}
					}

					setState(1573);
					column_alias();
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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_or_subquery(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_table_or_subquery);
		int _la;
		try {
			setState(1625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1581);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1578);
					database_name();
					setState(1579);
					match(DOT);
					}
					break;
				}
				setState(1583);
				table_name();
				setState(1588);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1585);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
					case 1:
						{
						setState(1584);
						match(K_AS);
						}
						break;
					}
					setState(1587);
					table_alias();
					}
					break;
				}
				setState(1595);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1590);
					match(K_INDEXED);
					setState(1591);
					match(K_BY);
					setState(1592);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1593);
					match(K_NOT);
					setState(1594);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case K_ALTER:
				case K_SET:
				case K_ON:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_VERTICAL:
				case K_HORIZONTAL:
				case K_CROSS:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXCEPT:
				case K_EXPLAIN:
				case K_GROUP:
				case K_INNER:
				case K_INSERT:
				case K_INTERSECT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_NATURAL:
				case K_ORDER:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UNION:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_WHERE:
				case K_WITH:
				case UNEXPECTED_CHAR:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1597);
				match(OPEN_PAR);
				setState(1607);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1598);
					table_or_subquery();
					setState(1603);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1599);
						match(COMMA);
						setState(1600);
						table_or_subquery();
						}
						}
						setState(1605);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1606);
					join_clause();
					}
					break;
				}
				setState(1609);
				match(CLOSE_PAR);
				setState(1614);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1611);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
					case 1:
						{
						setState(1610);
						match(K_AS);
						}
						break;
					}
					setState(1613);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1616);
				match(OPEN_PAR);
				setState(1617);
				select_stmt();
				setState(1618);
				match(CLOSE_PAR);
				setState(1623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1620);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
					case 1:
						{
						setState(1619);
						match(K_AS);
						}
						break;
					}
					setState(1622);
					table_alias();
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

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_clause(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			table_or_subquery();
			setState(1634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (K_INNER - 94)) | (1L << (K_JOIN - 94)) | (1L << (K_LEFT - 94)) | (1L << (K_NATURAL - 94)))) != 0)) {
				{
				{
				setState(1628);
				join_operator();
				setState(1629);
				table_or_subquery();
				setState(1630);
				join_constraint();
				}
				}
				setState(1636);
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

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_operator(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_join_operator);
		int _la;
		try {
			setState(1650);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1637);
				match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1638);
					match(K_NATURAL);
					}
				}

				setState(1647);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1641);
					match(K_LEFT);
					setState(1643);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1642);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1645);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1646);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1649);
				match(K_JOIN);
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

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_constraint(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1652);
				match(K_ON);
				setState(1653);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1654);
				match(K_USING);
				setState(1655);
				match(OPEN_PAR);
				setState(1656);
				column_name();
				setState(1661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1657);
					match(COMMA);
					setState(1658);
					column_name();
					}
					}
					setState(1663);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1664);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case CLOSE_PAR:
			case COMMA:
			case K_ALTER:
			case K_SET:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_VERTICAL:
			case K_HORIZONTAL:
			case K_CROSS:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXCEPT:
			case K_EXPLAIN:
			case K_GROUP:
			case K_INNER:
			case K_INSERT:
			case K_INTERSECT:
			case K_JOIN:
			case K_LEFT:
			case K_LIMIT:
			case K_NATURAL:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UNION:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
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

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_core(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_select_core);
		int _la;
		try {
			setState(1742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1668);
				match(K_SELECT);
				setState(1670);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(1669);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
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
				setState(1672);
				result_column();
				setState(1677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1673);
					match(COMMA);
					setState(1674);
					result_column();
					}
					}
					setState(1679);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1680);
					match(K_FROM);
					setState(1690);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
					case 1:
						{
						setState(1681);
						table_or_subquery();
						setState(1686);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1682);
							match(COMMA);
							setState(1683);
							table_or_subquery();
							}
							}
							setState(1688);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1689);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1694);
					match(K_WHERE);
					setState(1695);
					expr(0);
					}
				}

				setState(1712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1698);
					match(K_GROUP);
					setState(1699);
					match(K_BY);
					setState(1700);
					expr(0);
					setState(1705);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1701);
						match(COMMA);
						setState(1702);
						expr(0);
						}
						}
						setState(1707);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1710);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1708);
						match(K_HAVING);
						setState(1709);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1714);
				match(K_VALUES);
				setState(1715);
				match(OPEN_PAR);
				setState(1716);
				expr(0);
				setState(1721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1717);
					match(COMMA);
					setState(1718);
					expr(0);
					}
					}
					setState(1723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1724);
				match(CLOSE_PAR);
				setState(1739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1725);
					match(COMMA);
					setState(1726);
					match(OPEN_PAR);
					setState(1727);
					expr(0);
					setState(1732);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1728);
						match(COMMA);
						setState(1729);
						expr(0);
						}
						}
						setState(1734);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1735);
					match(CLOSE_PAR);
					}
					}
					setState(1741);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCompound_operator(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_compound_operator);
		try {
			setState(1749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1744);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1745);
				match(K_UNION);
				setState(1746);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1747);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1748);
				match(K_EXCEPT);
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

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCte_table_name(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			table_name();
			setState(1763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1752);
				match(OPEN_PAR);
				setState(1753);
				column_name();
				setState(1758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1754);
					match(COMMA);
					setState(1755);
					column_name();
					}
					}
					setState(1760);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1761);
				match(CLOSE_PAR);
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSigned_number(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1765);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1768);
			match(NUMERIC_LITERAL);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLiteParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitLiteral_value(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (K_NULL - 111)) | (1L << (NUMERIC_LITERAL - 111)) | (1L << (STRING_LITERAL - 111)) | (1L << (BLOB_LITERAL - 111)))) != 0)) ) {
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUnary_operator(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1772);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitError_message(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			match(STRING_LITERAL);
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

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitModule_argument(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_module_argument);
		try {
			setState(1778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1776);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1777);
				column_def();
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_alias(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1780);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLiteParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SQLiteParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLiteParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLiteParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLiteParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLiteParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLiteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLiteParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLiteParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLiteParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLiteParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLiteParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLiteParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLiteParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SQLiteParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLiteParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLiteParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SQLiteParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SQLiteParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLiteParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLiteParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLiteParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLiteParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SQLiteParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLiteParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLiteParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLiteParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLiteParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLiteParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLiteParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLiteParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SQLiteParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLiteParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLiteParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SQLiteParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLiteParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLiteParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLiteParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLiteParser.K_WITHOUT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_SET) | (1L << K_ON) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_RENAME - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)))) != 0)) ) {
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

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			any_name();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFunction_name(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1786);
			any_name();
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

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDatabase_name(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			any_name();
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			any_name();
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

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_or_index_name(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1792);
			any_name();
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

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitNew_table_name(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			any_name();
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			any_name();
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

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCollation_name(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
			any_name();
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

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitForeign_table(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			any_name();
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

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIndex_name(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			any_name();
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

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTrigger_name(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804);
			any_name();
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

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitView_name(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			any_name();
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

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitModule_name(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			any_name();
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

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_name(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			any_name();
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

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSavepoint_name(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1812);
			any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_alias(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			any_name();
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

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTransaction_name(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1816);
			any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAny_name(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_any_name);
		try {
			setState(1825);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1818);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_SET:
			case K_ON:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1819);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1820);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1821);
				match(OPEN_PAR);
				setState(1822);
				any_name();
				setState(1823);
				match(CLOSE_PAR);
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
		case 51:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a5\u0726\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\3"+
		"\2\3\2\7\2\u00c1\n\2\f\2\16\2\u00c4\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u00cc"+
		"\n\4\f\4\16\4\u00cf\13\4\3\4\3\4\6\4\u00d3\n\4\r\4\16\4\u00d4\3\4\7\4"+
		"\u00d8\n\4\f\4\16\4\u00db\13\4\3\4\7\4\u00de\n\4\f\4\16\4\u00e1\13\4\3"+
		"\5\3\5\3\5\5\5\u00e6\n\5\5\5\u00e8\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u0109\n\5\3\6\3\6\5\6\u010d\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u0123\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u012b\n\13\3\13"+
		"\5\13\u012e\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0137\n\f\3\r\3\r\5\r"+
		"\u013b\n\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u0143\n\16\3\16\3\16\5\16\u0147"+
		"\n\16\5\16\u0149\n\16\3\17\3\17\3\17\5\17\u014e\n\17\5\17\u0150\n\17\3"+
		"\20\3\20\5\20\u0154\n\20\3\20\3\20\3\20\7\20\u0159\n\20\f\20\16\20\u015c"+
		"\13\20\5\20\u015e\n\20\3\20\3\20\3\20\5\20\u0163\n\20\3\20\3\20\5\20\u0167"+
		"\n\20\3\20\6\20\u016a\n\20\r\20\16\20\u016b\3\20\3\20\3\20\3\20\3\20\7"+
		"\20\u0173\n\20\f\20\16\20\u0176\13\20\5\20\u0178\n\20\3\20\3\20\3\20\3"+
		"\20\5\20\u017e\n\20\5\20\u0180\n\20\3\21\3\21\5\21\u0184\n\21\3\21\3\21"+
		"\3\21\3\21\5\21\u018a\n\21\3\21\3\21\3\21\5\21\u018f\n\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\7\21\u0198\n\21\f\21\16\21\u019b\13\21\3\21\3"+
		"\21\3\21\5\21\u01a0\n\21\3\22\3\22\5\22\u01a4\n\22\3\22\3\22\3\22\3\22"+
		"\5\22\u01aa\n\22\3\22\3\22\3\22\5\22\u01af\n\22\3\22\3\22\3\22\3\22\3"+
		"\22\7\22\u01b6\n\22\f\22\16\22\u01b9\13\22\3\22\3\22\7\22\u01bd\n\22\f"+
		"\22\16\22\u01c0\13\22\3\22\3\22\3\22\5\22\u01c5\n\22\3\22\3\22\5\22\u01c9"+
		"\n\22\3\22\5\22\u01cc\n\22\3\23\3\23\5\23\u01d0\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u01d9\n\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25"+
		"\u01e1\n\25\f\25\16\25\u01e4\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u01f3\n\27\f\27\16\27\u01f6\13\27"+
		"\3\30\3\30\3\31\3\31\5\31\u01fc\n\31\3\31\3\31\3\31\3\31\5\31\u0202\n"+
		"\31\3\31\3\31\3\31\5\31\u0207\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u020e"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0217\n\31\f\31\16\31\u021a"+
		"\13\31\5\31\u021c\n\31\5\31\u021e\n\31\3\31\3\31\3\31\3\31\5\31\u0224"+
		"\n\31\3\31\3\31\3\31\3\31\5\31\u022a\n\31\3\31\3\31\5\31\u022e\n\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u0235\n\31\3\31\3\31\6\31\u0239\n\31\r\31"+
		"\16\31\u023a\3\31\3\31\3\32\3\32\5\32\u0241\n\32\3\32\3\32\3\32\3\32\5"+
		"\32\u0247\n\32\3\32\3\32\3\32\5\32\u024c\n\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0258\n\33\3\33\3\33\3\33\5\33\u025d\n"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0266\n\33\f\33\16\33\u0269"+
		"\13\33\3\33\3\33\5\33\u026d\n\33\3\34\5\34\u0270\n\34\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u0277\n\34\3\35\5\35\u027a\n\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0281\n\35\3\35\3\35\3\35\3\35\3\35\7\35\u0288\n\35\f\35\16\35\u028b"+
		"\13\35\5\35\u028d\n\35\3\35\3\35\3\35\3\35\5\35\u0293\n\35\5\35\u0295"+
		"\n\35\3\36\3\36\5\36\u0299\n\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u02a1"+
		"\n\37\3\37\3\37\3\37\5\37\u02a6\n\37\3\37\3\37\3 \3 \3 \3 \5 \u02ae\n"+
		" \3 \3 \3 \5 \u02b3\n \3 \3 \5 \u02b7\n \3!\3!\3!\3\"\3\"\3\"\3\"\5\""+
		"\u02c0\n\"\3\"\3\"\3\"\5\"\u02c5\n\"\3\"\3\"\3#\3#\3#\3#\5#\u02cd\n#\3"+
		"#\3#\3#\5#\u02d2\n#\3#\3#\3$\3$\5$\u02d8\n$\3$\3$\3$\7$\u02dd\n$\f$\16"+
		"$\u02e0\13$\5$\u02e2\n$\3$\3$\3$\3$\7$\u02e8\n$\f$\16$\u02eb\13$\3$\3"+
		"$\3$\3$\3$\7$\u02f2\n$\f$\16$\u02f5\13$\5$\u02f7\n$\3$\3$\3$\3$\5$\u02fd"+
		"\n$\5$\u02ff\n$\3%\5%\u0302\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\5%\u0315\n%\3%\3%\3%\3%\5%\u031b\n%\3%\3%\3%\3%\3%\7%\u0322"+
		"\n%\f%\16%\u0325\13%\3%\3%\5%\u0329\n%\3%\3%\3%\3%\3%\7%\u0330\n%\f%\16"+
		"%\u0333\13%\3%\3%\3%\3%\3%\3%\7%\u033b\n%\f%\16%\u033e\13%\3%\3%\7%\u0342"+
		"\n%\f%\16%\u0345\13%\3%\3%\3%\5%\u034a\n%\3&\3&\3&\3&\5&\u0350\n&\3&\3"+
		"&\3&\3&\3&\3&\3&\5&\u0359\n&\3\'\3\'\3\'\3\'\3\'\5\'\u0360\n\'\3\'\3\'"+
		"\5\'\u0364\n\'\5\'\u0366\n\'\3(\3(\5(\u036a\n(\3(\3(\3)\3)\3)\5)\u0371"+
		"\n)\5)\u0373\n)\3)\3)\5)\u0377\n)\3)\5)\u037a\n)\3*\3*\3*\3+\3+\5+\u0381"+
		"\n+\3+\3+\3+\7+\u0386\n+\f+\16+\u0389\13+\5+\u038b\n+\3+\3+\3+\3+\3+\3"+
		"+\7+\u0393\n+\f+\16+\u0396\13+\5+\u0398\n+\3+\3+\3+\3+\5+\u039e\n+\5+"+
		"\u03a0\n+\3,\3,\5,\u03a4\n,\3,\3,\3,\7,\u03a9\n,\f,\16,\u03ac\13,\5,\u03ae"+
		"\n,\3,\3,\3,\3,\7,\u03b4\n,\f,\16,\u03b7\13,\3,\3,\3,\3,\3,\7,\u03be\n"+
		",\f,\16,\u03c1\13,\5,\u03c3\n,\3,\3,\3,\3,\5,\u03c9\n,\5,\u03cb\n,\3-"+
		"\3-\5-\u03cf\n-\3-\3-\3-\7-\u03d4\n-\f-\16-\u03d7\13-\3-\3-\3-\3-\7-\u03dd"+
		"\n-\f-\16-\u03e0\13-\3-\5-\u03e3\n-\5-\u03e5\n-\3-\3-\5-\u03e9\n-\3-\3"+
		"-\3-\3-\3-\7-\u03f0\n-\f-\16-\u03f3\13-\3-\3-\5-\u03f7\n-\5-\u03f9\n-"+
		"\3-\3-\3-\3-\3-\7-\u0400\n-\f-\16-\u0403\13-\3-\3-\3-\3-\3-\3-\7-\u040b"+
		"\n-\f-\16-\u040e\13-\3-\3-\7-\u0412\n-\f-\16-\u0415\13-\5-\u0417\n-\3"+
		".\5.\u041a\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0427\n.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\7.\u0433\n.\f.\16.\u0436\13.\3.\3.\5.\u043a\n.\3/"+
		"\5/\u043d\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u044a\n/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\7/\u0456\n/\f/\16/\u0459\13/\3/\3/\5/\u045d\n/\3/\3"+
		"/\3/\3/\3/\7/\u0464\n/\f/\16/\u0467\13/\5/\u0469\n/\3/\3/\3/\3/\5/\u046f"+
		"\n/\5/\u0471\n/\3\60\3\60\3\61\3\61\5\61\u0477\n\61\3\61\7\61\u047a\n"+
		"\61\f\61\16\61\u047d\13\61\3\62\6\62\u0480\n\62\r\62\16\62\u0481\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u048e\n\62\3\63\3\63"+
		"\5\63\u0492\n\63\3\63\3\63\3\63\5\63\u0497\n\63\3\63\3\63\5\63\u049b\n"+
		"\63\3\63\5\63\u049e\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u04b0\n\63\3\63\3\63\3\63\5\63"+
		"\u04b5\n\63\3\64\3\64\3\64\5\64\u04ba\n\64\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\5\65\u04c2\n\65\3\65\3\65\3\65\5\65\u04c7\n\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\5\65\u04d0\n\65\3\65\3\65\3\65\7\65\u04d5\n\65\f\65\16"+
		"\65\u04d8\13\65\3\65\5\65\u04db\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u04eb\n\65\3\65\5\65\u04ee\n"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u04f6\n\65\3\65\3\65\3\65\3\65"+
		"\3\65\6\65\u04fd\n\65\r\65\16\65\u04fe\3\65\3\65\5\65\u0503\n\65\3\65"+
		"\3\65\3\65\5\65\u0508\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\5\65\u0526\n\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\5\65\u0532\n\65\3\65\3\65\3\65\5\65\u0537\n\65\3"+
		"\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0543\n\65\3\65"+
		"\3\65\3\65\3\65\5\65\u0549\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u0550\n"+
		"\65\3\65\3\65\5\65\u0554\n\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u055c"+
		"\n\65\f\65\16\65\u055f\13\65\5\65\u0561\n\65\3\65\3\65\3\65\3\65\5\65"+
		"\u0567\n\65\3\65\5\65\u056a\n\65\7\65\u056c\n\65\f\65\16\65\u056f\13\65"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0577\n\66\f\66\16\66\u057a\13\66"+
		"\3\66\3\66\5\66\u057e\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u058a\n\66\3\66\3\66\5\66\u058e\n\66\7\66\u0590\n\66\f\66\16"+
		"\66\u0593\13\66\3\66\5\66\u0596\n\66\3\66\3\66\3\66\3\66\3\66\5\66\u059d"+
		"\n\66\5\66\u059f\n\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u05a7\n\67\3"+
		"\67\3\67\38\38\38\58\u05ae\n8\38\58\u05b1\n8\39\39\59\u05b5\n9\39\39\3"+
		"9\59\u05ba\n9\39\39\39\39\79\u05c0\n9\f9\169\u05c3\139\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\79\u05d3\n9\f9\169\u05d6\139\39\39\39\59\u05db"+
		"\n9\3:\3:\5:\u05df\n:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\7:\u05ed\n:"+
		"\f:\16:\u05f0\13:\3;\3;\3;\5;\u05f5\n;\3;\3;\3;\3;\3;\3;\5;\u05fd\n;\3"+
		"<\3<\3<\5<\u0602\n<\3<\5<\u0605\n<\3=\3=\3=\5=\u060a\n=\3>\3>\3>\3>\3"+
		">\7>\u0611\n>\f>\16>\u0614\13>\3>\3>\5>\u0618\n>\3>\3>\3>\3>\3>\3?\3?"+
		"\3?\3?\3?\3?\3?\5?\u0626\n?\3?\5?\u0629\n?\5?\u062b\n?\3@\3@\3@\5@\u0630"+
		"\n@\3@\3@\5@\u0634\n@\3@\5@\u0637\n@\3@\3@\3@\3@\3@\5@\u063e\n@\3@\3@"+
		"\3@\3@\7@\u0644\n@\f@\16@\u0647\13@\3@\5@\u064a\n@\3@\3@\5@\u064e\n@\3"+
		"@\5@\u0651\n@\3@\3@\3@\3@\5@\u0657\n@\3@\5@\u065a\n@\5@\u065c\n@\3A\3"+
		"A\3A\3A\3A\7A\u0663\nA\fA\16A\u0666\13A\3B\3B\5B\u066a\nB\3B\3B\5B\u066e"+
		"\nB\3B\3B\5B\u0672\nB\3B\5B\u0675\nB\3C\3C\3C\3C\3C\3C\3C\7C\u067e\nC"+
		"\fC\16C\u0681\13C\3C\3C\5C\u0685\nC\3D\3D\5D\u0689\nD\3D\3D\3D\7D\u068e"+
		"\nD\fD\16D\u0691\13D\3D\3D\3D\3D\7D\u0697\nD\fD\16D\u069a\13D\3D\5D\u069d"+
		"\nD\5D\u069f\nD\3D\3D\5D\u06a3\nD\3D\3D\3D\3D\3D\7D\u06aa\nD\fD\16D\u06ad"+
		"\13D\3D\3D\5D\u06b1\nD\5D\u06b3\nD\3D\3D\3D\3D\3D\7D\u06ba\nD\fD\16D\u06bd"+
		"\13D\3D\3D\3D\3D\3D\3D\7D\u06c5\nD\fD\16D\u06c8\13D\3D\3D\7D\u06cc\nD"+
		"\fD\16D\u06cf\13D\5D\u06d1\nD\3E\3E\3E\3E\3E\5E\u06d8\nE\3F\3F\3F\3F\3"+
		"F\7F\u06df\nF\fF\16F\u06e2\13F\3F\3F\5F\u06e6\nF\3G\5G\u06e9\nG\3G\3G"+
		"\3H\3H\3I\3I\3J\3J\3K\3K\5K\u06f5\nK\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q"+
		"\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3"+
		"\\\3]\3]\3^\3^\3_\3_\3_\3_\3_\3_\3_\5_\u0724\n_\3_\2\3h`\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\2\26\3\2#$\5\2"+
		"CCNN[[\4\2\65\65KK\4\2\7\7ss\3\2\u008b\u008c\4\2\u009e\u009e\u00a0\u00a0"+
		"\4\2\37\37GG\4\2((EE\7\2\33\33QQZZ\u0082\u0082\u0085\u0085\4\2\t\t\16"+
		"\17\3\2\n\13\3\2\20\23\3\2\24\27\6\2VVjjll~~\4\2DD\u0093\u0093\5\2\33"+
		"\33QQ\u0085\u0085\6\2=?qq\u009e\u009e\u00a0\u00a1\4\2\n\foo\4\2\u009d"+
		"\u009d\u00a0\u00a0\b\2\33!##%\6799<\u0088\u008a\u009c\2\u082f\2\u00c2"+
		"\3\2\2\2\4\u00c7\3\2\2\2\6\u00cd\3\2\2\2\b\u00e7\3\2\2\2\n\u010c\3\2\2"+
		"\2\f\u010e\3\2\2\2\16\u0115\3\2\2\2\20\u0119\3\2\2\2\22\u011b\3\2\2\2"+
		"\24\u011d\3\2\2\2\26\u012f\3\2\2\2\30\u0138\3\2\2\2\32\u0140\3\2\2\2\34"+
		"\u014a\3\2\2\2\36\u015d\3\2\2\2 \u0181\3\2\2\2\"\u01a1\3\2\2\2$\u01cf"+
		"\3\2\2\2&\u01d1\3\2\2\2(\u01dc\3\2\2\2*\u01e7\3\2\2\2,\u01ef\3\2\2\2."+
		"\u01f7\3\2\2\2\60\u01f9\3\2\2\2\62\u023e\3\2\2\2\64\u0251\3\2\2\2\66\u026f"+
		"\3\2\2\28\u0279\3\2\2\2:\u0296\3\2\2\2<\u029c\3\2\2\2>\u02a9\3\2\2\2@"+
		"\u02b8\3\2\2\2B\u02bb\3\2\2\2D\u02c8\3\2\2\2F\u02e1\3\2\2\2H\u0301\3\2"+
		"\2\2J\u034b\3\2\2\2L\u035a\3\2\2\2N\u0367\3\2\2\2P\u036d\3\2\2\2R\u037b"+
		"\3\2\2\2T\u038a\3\2\2\2V\u03ad\3\2\2\2X\u0416\3\2\2\2Z\u0419\3\2\2\2\\"+
		"\u043c\3\2\2\2^\u0472\3\2\2\2`\u0474\3\2\2\2b\u047f\3\2\2\2d\u0491\3\2"+
		"\2\2f\u04b9\3\2\2\2h\u0507\3\2\2\2j\u0570\3\2\2\2l\u05a0\3\2\2\2n\u05aa"+
		"\3\2\2\2p\u05b4\3\2\2\2r\u05dc\3\2\2\2t\u05f4\3\2\2\2v\u05fe\3\2\2\2x"+
		"\u0609\3\2\2\2z\u060b\3\2\2\2|\u062a\3\2\2\2~\u065b\3\2\2\2\u0080\u065d"+
		"\3\2\2\2\u0082\u0674\3\2\2\2\u0084\u0684\3\2\2\2\u0086\u06d0\3\2\2\2\u0088"+
		"\u06d7\3\2\2\2\u008a\u06d9\3\2\2\2\u008c\u06e8\3\2\2\2\u008e\u06ec\3\2"+
		"\2\2\u0090\u06ee\3\2\2\2\u0092\u06f0\3\2\2\2\u0094\u06f4\3\2\2\2\u0096"+
		"\u06f6\3\2\2\2\u0098\u06f8\3\2\2\2\u009a\u06fa\3\2\2\2\u009c\u06fc\3\2"+
		"\2\2\u009e\u06fe\3\2\2\2\u00a0\u0700\3\2\2\2\u00a2\u0702\3\2\2\2\u00a4"+
		"\u0704\3\2\2\2\u00a6\u0706\3\2\2\2\u00a8\u0708\3\2\2\2\u00aa\u070a\3\2"+
		"\2\2\u00ac\u070c\3\2\2\2\u00ae\u070e\3\2\2\2\u00b0\u0710\3\2\2\2\u00b2"+
		"\u0712\3\2\2\2\u00b4\u0714\3\2\2\2\u00b6\u0716\3\2\2\2\u00b8\u0718\3\2"+
		"\2\2\u00ba\u071a\3\2\2\2\u00bc\u0723\3\2\2\2\u00be\u00c1\5\6\4\2\u00bf"+
		"\u00c1\5\4\3\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c5\u00c6\7\2\2\3\u00c6\3\3\2\2\2\u00c7\u00c8\7\u00a5"+
		"\2\2\u00c8\u00c9\b\3\1\2\u00c9\5\3\2\2\2\u00ca\u00cc\7\3\2\2\u00cb\u00ca"+
		"\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d9\5\b\5\2\u00d1\u00d3\7\3"+
		"\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\5\b\5\2\u00d7\u00d2\3\2"+
		"\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00df\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00de\7\3\2\2\u00dd\u00dc\3\2"+
		"\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\7\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\7P\2\2\u00e3\u00e4\7z\2\2\u00e4"+
		"\u00e6\7w\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2"+
		"\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u0108\3\2\2\2\u00e9"+
		"\u0109\5\26\f\2\u00ea\u0109\5\30\r\2\u00eb\u0109\5\32\16\2\u00ec\u0109"+
		"\5\34\17\2\u00ed\u0109\5\36\20\2\u00ee\u0109\5 \21\2\u00ef\u0109\5\"\22"+
		"\2\u00f0\u0109\5\60\31\2\u00f1\u0109\5\62\32\2\u00f2\u0109\5\64\33\2\u00f3"+
		"\u0109\5\66\34\2\u00f4\u0109\58\35\2\u00f5\u0109\5:\36\2\u00f6\u0109\5"+
		"<\37\2\u00f7\u0109\5> \2\u00f8\u0109\5B\"\2\u00f9\u0109\5D#\2\u00fa\u0109"+
		"\5F$\2\u00fb\u0109\5H%\2\u00fc\u0109\5J&\2\u00fd\u0109\5L\'\2\u00fe\u0109"+
		"\5N(\2\u00ff\u0109\5P)\2\u0100\u0109\5R*\2\u0101\u0109\5T+\2\u0102\u0109"+
		"\5V,\2\u0103\u0109\5Z.\2\u0104\u0109\5\\/\2\u0105\u0109\5^\60\2\u0106"+
		"\u0109\5\16\b\2\u0107\u0109\5\n\6\2\u0108\u00e9\3\2\2\2\u0108\u00ea\3"+
		"\2\2\2\u0108\u00eb\3\2\2\2\u0108\u00ec\3\2\2\2\u0108\u00ed\3\2\2\2\u0108"+
		"\u00ee\3\2\2\2\u0108\u00ef\3\2\2\2\u0108\u00f0\3\2\2\2\u0108\u00f1\3\2"+
		"\2\2\u0108\u00f2\3\2\2\2\u0108\u00f3\3\2\2\2\u0108\u00f4\3\2\2\2\u0108"+
		"\u00f5\3\2\2\2\u0108\u00f6\3\2\2\2\u0108\u00f7\3\2\2\2\u0108\u00f8\3\2"+
		"\2\2\u0108\u00f9\3\2\2\2\u0108\u00fa\3\2\2\2\u0108\u00fb\3\2\2\2\u0108"+
		"\u00fc\3\2\2\2\u0108\u00fd\3\2\2\2\u0108\u00fe\3\2\2\2\u0108\u00ff\3\2"+
		"\2\2\u0108\u0100\3\2\2\2\u0108\u0101\3\2\2\2\u0108\u0102\3\2\2\2\u0108"+
		"\u0103\3\2\2\2\u0108\u0104\3\2\2\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0107\3\2\2\2\u0109\t\3\2\2\2\u010a\u010d\5\24\13\2\u010b\u010d"+
		"\5\f\7\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\13\3\2\2\2\u010e"+
		"\u010f\7 \2\2\u010f\u0110\7\u0089\2\2\u0110\u0111\7!\2\2\u0111\u0112\5"+
		"\u00bc_\2\u0112\u0113\7\b\2\2\u0113\u0114\5\u00bc_\2\u0114\r\3\2\2\2\u0115"+
		"\u0116\7!\2\2\u0116\u0117\5\20\t\2\u0117\u0118\5\22\n\2\u0118\17\3\2\2"+
		"\2\u0119\u011a\7\"\2\2\u011a\21\3\2\2\2\u011b\u011c\t\2\2\2\u011c\23\3"+
		"\2\2\2\u011d\u011e\7 \2\2\u011e\u0122\7\u008a\2\2\u011f\u0120\5\u009e"+
		"P\2\u0120\u0121\7\4\2\2\u0121\u0123\3\2\2\2\u0122\u011f\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u012d\5\u00a0Q\2\u0125\u0126"+
		"\7\u0081\2\2\u0126\u0127\7\u008e\2\2\u0127\u012e\5\u00a4S\2\u0128\u012a"+
		"\7\35\2\2\u0129\u012b\7\64\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2"+
		"\u012b\u012c\3\2\2\2\u012c\u012e\5`\61\2\u012d\u0125\3\2\2\2\u012d\u0128"+
		"\3\2\2\2\u012e\25\3\2\2\2\u012f\u0136\7%\2\2\u0130\u0137\5\u009eP\2\u0131"+
		"\u0137\5\u00a2R\2\u0132\u0133\5\u009eP\2\u0133\u0134\7\4\2\2\u0134\u0135"+
		"\5\u00a2R\2\u0135\u0137\3\2\2\2\u0136\u0130\3\2\2\2\u0136\u0131\3\2\2"+
		"\2\u0136\u0132\3\2\2\2\u0136\u0137\3\2\2\2\u0137\27\3\2\2\2\u0138\u013a"+
		"\7)\2\2\u0139\u013b\7@\2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013d\5h\65\2\u013d\u013e\7\'\2\2\u013e\u013f\5\u009e"+
		"P\2\u013f\31\3\2\2\2\u0140\u0142\7,\2\2\u0141\u0143\t\3\2\2\u0142\u0141"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0148\3\2\2\2\u0144\u0146\7\u008f\2"+
		"\2\u0145\u0147\5\u00ba^\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0149\3\2\2\2\u0148\u0144\3\2\2\2\u0148\u0149\3\2\2\2\u0149\33\3\2\2"+
		"\2\u014a\u014f\t\4\2\2\u014b\u014d\7\u008f\2\2\u014c\u014e\5\u00ba^\2"+
		"\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014b"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\35\3\2\2\2\u0151\u0153\7\u009b\2\2"+
		"\u0152\u0154\7|\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u015a\5z>\2\u0156\u0157\7\7\2\2\u0157\u0159\5z>\2\u0158"+
		"\u0156\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0151\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0169\5\u0086D\2\u0160\u0162"+
		"\7\u0091\2\2\u0161\u0163\7\37\2\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\u0167\3\2\2\2\u0164\u0167\7c\2\2\u0165\u0167\7M\2\2\u0166\u0160"+
		"\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u016a\5\u0086D\2\u0169\u0166\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169"+
		"\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0177\3\2\2\2\u016d\u016e\7u\2\2\u016e"+
		"\u016f\7.\2\2\u016f\u0174\5v<\2\u0170\u0171\7\7\2\2\u0171\u0173\5v<\2"+
		"\u0172\u0170\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u016d\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017f\3\2\2\2\u0179\u017a\7k\2\2\u017a\u017d\5h\65"+
		"\2\u017b\u017c\t\5\2\2\u017c\u017e\5h\65\2\u017d\u017b\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u0180\3\2\2\2\u017f\u0179\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\37\3\2\2\2\u0181\u0183\79\2\2\u0182\u0184\7\u0092\2\2\u0183\u0182\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0189\7]\2\2\u0186"+
		"\u0187\7Y\2\2\u0187\u0188\7o\2\2\u0188\u018a\7O\2\2\u0189\u0186\3\2\2"+
		"\2\u0189\u018a\3\2\2\2\u018a\u018e\3\2\2\2\u018b\u018c\5\u009eP\2\u018c"+
		"\u018d\7\4\2\2\u018d\u018f\3\2\2\2\u018e\u018b\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u0190\3\2\2\2\u0190\u0191\5\u00acW\2\u0191\u0192\7#\2\2\u0192"+
		"\u0193\5\u00a0Q\2\u0193\u0194\7\5\2\2\u0194\u0199\5n8\2\u0195\u0196\7"+
		"\7\2\2\u0196\u0198\5n8\2\u0197\u0195\3\2\2\2\u0198\u019b\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2"+
		"\2\2\u019c\u019f\7\6\2\2\u019d\u019e\7\u009a\2\2\u019e\u01a0\5h\65\2\u019f"+
		"\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0!\3\2\2\2\u01a1\u01a3\79\2\2\u01a2"+
		"\u01a4\t\6\2\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5\u01a9\7\u008a\2\2\u01a6\u01a7\7Y\2\2\u01a7\u01a8\7o\2\2\u01a8"+
		"\u01aa\7O\2\2\u01a9\u01a6\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ae\3\2"+
		"\2\2\u01ab\u01ac\5\u009eP\2\u01ac\u01ad\7\4\2\2\u01ad\u01af\3\2\2\2\u01ae"+
		"\u01ab\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01c8\5\u00a0"+
		"Q\2\u01b1\u01b2\7\5\2\2\u01b2\u01b7\5`\61\2\u01b3\u01b4\7\7\2\2\u01b4"+
		"\u01b6\5`\61\2\u01b5\u01b3\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2"+
		"\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01be\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba"+
		"\u01bb\7\7\2\2\u01bb\u01bd\5p9\2\u01bc\u01ba\3\2\2\2\u01bd\u01c0\3\2\2"+
		"\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01be"+
		"\3\2\2\2\u01c1\u01c4\7\6\2\2\u01c2\u01c3\7\u009c\2\2\u01c3\u01c5\7\u009d"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c9\3\2\2\2\u01c6"+
		"\u01c7\7\'\2\2\u01c7\u01c9\5V,\2\u01c8\u01b1\3\2\2\2\u01c8\u01c6\3\2\2"+
		"\2\u01c9\u01cb\3\2\2\2\u01ca\u01cc\5$\23\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc"+
		"\3\2\2\2\u01cc#\3\2\2\2\u01cd\u01d0\5&\24\2\u01ce\u01d0\5*\26\2\u01cf"+
		"\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0%\3\2\2\2\u01d1\u01d2\7:\2\2\u01d2"+
		"\u01d3\7\5\2\2\u01d3\u01d4\5(\25\2\u01d4\u01d5\7\7\2\2\u01d5\u01d8\5("+
		"\25\2\u01d6\u01d7\7\7\2\2\u01d7\u01d9\5(\25\2\u01d8\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\7\6\2\2\u01db\'\3\2\2\2"+
		"\u01dc\u01dd\7\5\2\2\u01dd\u01e2\5\u00a6T\2\u01de\u01df\7\7\2\2\u01df"+
		"\u01e1\5\u00a6T\2\u01e0\u01de\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5"+
		"\u01e6\7\6\2\2\u01e6)\3\2\2\2\u01e7\u01e8\7;\2\2\u01e8\u01e9\7\5\2\2\u01e9"+
		"\u01ea\5\u00a6T\2\u01ea\u01eb\7\5\2\2\u01eb\u01ec\5,\27\2\u01ec\u01ed"+
		"\7\6\2\2\u01ed\u01ee\7\6\2\2\u01ee+\3\2\2\2\u01ef\u01f4\5.\30\2\u01f0"+
		"\u01f1\7\7\2\2\u01f1\u01f3\5.\30\2\u01f2\u01f0\3\2\2\2\u01f3\u01f6\3\2"+
		"\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5-\3\2\2\2\u01f6\u01f4"+
		"\3\2\2\2\u01f7\u01f8\t\7\2\2\u01f8/\3\2\2\2\u01f9\u01fb\79\2\2\u01fa\u01fc"+
		"\t\6\2\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd"+
		"\u0201\7\u0090\2\2\u01fe\u01ff\7Y\2\2\u01ff\u0200\7o\2\2\u0200\u0202\7"+
		"O\2\2\u0201\u01fe\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0206\3\2\2\2\u0203"+
		"\u0204\5\u009eP\2\u0204\u0205\7\4\2\2\u0205\u0207\3\2\2\2\u0206\u0203"+
		"\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020d\5\u00aeX"+
		"\2\u0209\u020e\7+\2\2\u020a\u020e\7\36\2\2\u020b\u020c\7b\2\2\u020c\u020e"+
		"\7r\2\2\u020d\u0209\3\2\2\2\u020d\u020a\3\2\2\2\u020d\u020b\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u021d\3\2\2\2\u020f\u021e\7D\2\2\u0210\u021e\7a\2"+
		"\2\u0211\u021b\7\u0093\2\2\u0212\u0213\7r\2\2\u0213\u0218\5\u00a6T\2\u0214"+
		"\u0215\7\7\2\2\u0215\u0217\5\u00a6T\2\u0216\u0214\3\2\2\2\u0217\u021a"+
		"\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021c\3\2\2\2\u021a"+
		"\u0218\3\2\2\2\u021b\u0212\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2"+
		"\2\2\u021d\u020f\3\2\2\2\u021d\u0210\3\2\2\2\u021d\u0211\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0223\7#\2\2\u0220\u0221\5\u009eP\2\u0221\u0222\7"+
		"\4\2\2\u0222\u0224\3\2\2\2\u0223\u0220\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0229\5\u00a0Q\2\u0226\u0227\7R\2\2\u0227\u0228\7"+
		"I\2\2\u0228\u022a\7\u0086\2\2\u0229\u0226\3\2\2\2\u0229\u022a\3\2\2\2"+
		"\u022a\u022d\3\2\2\2\u022b\u022c\7\u0099\2\2\u022c\u022e\5h\65\2\u022d"+
		"\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0238\7,"+
		"\2\2\u0230\u0235\5Z.\2\u0231\u0235\5H%\2\u0232\u0235\5\66\34\2\u0233\u0235"+
		"\5V,\2\u0234\u0230\3\2\2\2\u0234\u0231\3\2\2\2\u0234\u0232\3\2\2\2\u0234"+
		"\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\7\3\2\2\u0237\u0239\3\2"+
		"\2\2\u0238\u0234\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u0238\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\7K\2\2\u023d\61\3\2\2\2"+
		"\u023e\u0240\79\2\2\u023f\u0241\t\6\2\2\u0240\u023f\3\2\2\2\u0240\u0241"+
		"\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0246\7\u0097\2\2\u0243\u0244\7Y\2"+
		"\2\u0244\u0245\7o\2\2\u0245\u0247\7O\2\2\u0246\u0243\3\2\2\2\u0246\u0247"+
		"\3\2\2\2\u0247\u024b\3\2\2\2\u0248\u0249\5\u009eP\2\u0249\u024a\7\4\2"+
		"\2\u024a\u024c\3\2\2\2\u024b\u0248\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d"+
		"\3\2\2\2\u024d\u024e\5\u00b0Y\2\u024e\u024f\7\'\2\2\u024f\u0250\5V,\2"+
		"\u0250\63\3\2\2\2\u0251\u0252\79\2\2\u0252\u0253\7\u0098\2\2\u0253\u0257"+
		"\7\u008a\2\2\u0254\u0255\7Y\2\2\u0255\u0256\7o\2\2\u0256\u0258\7O\2\2"+
		"\u0257\u0254\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025c\3\2\2\2\u0259\u025a"+
		"\5\u009eP\2\u025a\u025b\7\4\2\2\u025b\u025d\3\2\2\2\u025c\u0259\3\2\2"+
		"\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\5\u00a0Q\2\u025f"+
		"\u0260\7\u0094\2\2\u0260\u026c\5\u00b2Z\2\u0261\u0262\7\5\2\2\u0262\u0267"+
		"\5\u0094K\2\u0263\u0264\7\7\2\2\u0264\u0266\5\u0094K\2\u0265\u0263\3\2"+
		"\2\2\u0266\u0269\3\2\2\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u026a\3\2\2\2\u0269\u0267\3\2\2\2\u026a\u026b\7\6\2\2\u026b\u026d\3\2"+
		"\2\2\u026c\u0261\3\2\2\2\u026c\u026d\3\2\2\2\u026d\65\3\2\2\2\u026e\u0270"+
		"\5r:\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u0272\7D\2\2\u0272\u0273\7T\2\2\u0273\u0276\5t;\2\u0274\u0275\7\u009a"+
		"\2\2\u0275\u0277\5h\65\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"\67\3\2\2\2\u0278\u027a\5r:\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2\2\2"+
		"\u027a\u027b\3\2\2\2\u027b\u027c\7D\2\2\u027c\u027d\7T\2\2\u027d\u0280"+
		"\5t;\2\u027e\u027f\7\u009a\2\2\u027f\u0281\5h\65\2\u0280\u027e\3\2\2\2"+
		"\u0280\u0281\3\2\2\2\u0281\u0294\3\2\2\2\u0282\u0283\7u\2\2\u0283\u0284"+
		"\7.\2\2\u0284\u0289\5v<\2\u0285\u0286\7\7\2\2\u0286\u0288\5v<\2\u0287"+
		"\u0285\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2"+
		"\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u0282\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\7k\2\2\u028f\u0292\5h\65"+
		"\2\u0290\u0291\t\5\2\2\u0291\u0293\5h\65\2\u0292\u0290\3\2\2\2\u0292\u0293"+
		"\3\2\2\2\u0293\u0295\3\2\2\2\u0294\u028c\3\2\2\2\u0294\u0295\3\2\2\2\u0295"+
		"9\3\2\2\2\u0296\u0298\7F\2\2\u0297\u0299\7@\2\2\u0298\u0297\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\5\u009eP\2\u029b;\3\2\2"+
		"\2\u029c\u029d\7H\2\2\u029d\u02a0\7]\2\2\u029e\u029f\7Y\2\2\u029f\u02a1"+
		"\7O\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a5\3\2\2\2\u02a2"+
		"\u02a3\5\u009eP\2\u02a3\u02a4\7\4\2\2\u02a4\u02a6\3\2\2\2\u02a5\u02a2"+
		"\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\5\u00acW"+
		"\2\u02a8=\3\2\2\2\u02a9\u02aa\7H\2\2\u02aa\u02ad\7\u008a\2\2\u02ab\u02ac"+
		"\7Y\2\2\u02ac\u02ae\7O\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae"+
		"\u02b2\3\2\2\2\u02af\u02b0\5\u009eP\2\u02b0\u02b1\7\4\2\2\u02b1\u02b3"+
		"\3\2\2\2\u02b2\u02af\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4"+
		"\u02b6\5\u00a0Q\2\u02b5\u02b7\5@!\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3"+
		"\2\2\2\u02b7?\3\2\2\2\u02b8\u02b9\7/\2\2\u02b9\u02ba\78\2\2\u02baA\3\2"+
		"\2\2\u02bb\u02bc\7H\2\2\u02bc\u02bf\7\u0090\2\2\u02bd\u02be\7Y\2\2\u02be"+
		"\u02c0\7O\2\2\u02bf\u02bd\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c4\3\2"+
		"\2\2\u02c1\u02c2\5\u009eP\2\u02c2\u02c3\7\4\2\2\u02c3\u02c5\3\2\2\2\u02c4"+
		"\u02c1\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\5\u00ae"+
		"X\2\u02c7C\3\2\2\2\u02c8\u02c9\7H\2\2\u02c9\u02cc\7\u0097\2\2\u02ca\u02cb"+
		"\7Y\2\2\u02cb\u02cd\7O\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd"+
		"\u02d1\3\2\2\2\u02ce\u02cf\5\u009eP\2\u02cf\u02d0\7\4\2\2\u02d0\u02d2"+
		"\3\2\2\2\u02d1\u02ce\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3"+
		"\u02d4\5\u00b0Y\2\u02d4E\3\2\2\2\u02d5\u02d7\7\u009b\2\2\u02d6\u02d8\7"+
		"|\2\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9"+
		"\u02de\5z>\2\u02da\u02db\7\7\2\2\u02db\u02dd\5z>\2\u02dc\u02da\3\2\2\2"+
		"\u02dd\u02e0\3\2\2\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e2"+
		"\3\2\2\2\u02e0\u02de\3\2\2\2\u02e1\u02d5\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2"+
		"\u02e3\3\2\2\2\u02e3\u02e9\5\u0086D\2\u02e4\u02e5\5\u0088E\2\u02e5\u02e6"+
		"\5\u0086D\2\u02e6\u02e8\3\2\2\2\u02e7\u02e4\3\2\2\2\u02e8\u02eb\3\2\2"+
		"\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02f6\3\2\2\2\u02eb\u02e9"+
		"\3\2\2\2\u02ec\u02ed\7u\2\2\u02ed\u02ee\7.\2\2\u02ee\u02f3\5v<\2\u02ef"+
		"\u02f0\7\7\2\2\u02f0\u02f2\5v<\2\u02f1\u02ef\3\2\2\2\u02f2\u02f5\3\2\2"+
		"\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3"+
		"\3\2\2\2\u02f6\u02ec\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02fe\3\2\2\2\u02f8"+
		"\u02f9\7k\2\2\u02f9\u02fc\5h\65\2\u02fa\u02fb\t\5\2\2\u02fb\u02fd\5h\65"+
		"\2\u02fc\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02ff\3\2\2\2\u02fe\u02f8"+
		"\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ffG\3\2\2\2\u0300\u0302\5r:\2\u0301\u0300"+
		"\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0314\3\2\2\2\u0303\u0315\7a\2\2\u0304"+
		"\u0315\7\u0082\2\2\u0305\u0306\7a\2\2\u0306\u0307\7t\2\2\u0307\u0315\7"+
		"\u0082\2\2\u0308\u0309\7a\2\2\u0309\u030a\7t\2\2\u030a\u0315\7\u0085\2"+
		"\2\u030b\u030c\7a\2\2\u030c\u030d\7t\2\2\u030d\u0315\7\33\2\2\u030e\u030f"+
		"\7a\2\2\u030f\u0310\7t\2\2\u0310\u0315\7Q\2\2\u0311\u0312\7a\2\2\u0312"+
		"\u0313\7t\2\2\u0313\u0315\7Z\2\2\u0314\u0303\3\2\2\2\u0314\u0304\3\2\2"+
		"\2\u0314\u0305\3\2\2\2\u0314\u0308\3\2\2\2\u0314\u030b\3\2\2\2\u0314\u030e"+
		"\3\2\2\2\u0314\u0311\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u031a\7d\2\2\u0317"+
		"\u0318\5\u009eP\2\u0318\u0319\7\4\2\2\u0319\u031b\3\2\2\2\u031a\u0317"+
		"\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u0328\5\u00a0Q"+
		"\2\u031d\u031e\7\5\2\2\u031e\u0323\5\u00a6T\2\u031f\u0320\7\7\2\2\u0320"+
		"\u0322\5\u00a6T\2\u0321\u031f\3\2\2\2\u0322\u0325\3\2\2\2\u0323\u0321"+
		"\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0326\3\2\2\2\u0325\u0323\3\2\2\2\u0326"+
		"\u0327\7\6\2\2\u0327\u0329\3\2\2\2\u0328\u031d\3\2\2\2\u0328\u0329\3\2"+
		"\2\2\u0329\u0349\3\2\2\2\u032a\u032b\7\u0096\2\2\u032b\u032c\7\5\2\2\u032c"+
		"\u0331\5h\65\2\u032d\u032e\7\7\2\2\u032e\u0330\5h\65\2\u032f\u032d\3\2"+
		"\2\2\u0330\u0333\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332"+
		"\u0334\3\2\2\2\u0333\u0331\3\2\2\2\u0334\u0343\7\6\2\2\u0335\u0336\7\7"+
		"\2\2\u0336\u0337\7\5\2\2\u0337\u033c\5h\65\2\u0338\u0339\7\7\2\2\u0339"+
		"\u033b\5h\65\2\u033a\u0338\3\2\2\2\u033b\u033e\3\2\2\2\u033c\u033a\3\2"+
		"\2\2\u033c\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u033c\3\2\2\2\u033f"+
		"\u0340\7\6\2\2\u0340\u0342\3\2\2\2\u0341\u0335\3\2\2\2\u0342\u0345\3\2"+
		"\2\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u034a\3\2\2\2\u0345"+
		"\u0343\3\2\2\2\u0346\u034a\5V,\2\u0347\u0348\7A\2\2\u0348\u034a\7\u0096"+
		"\2\2\u0349\u032a\3\2\2\2\u0349\u0346\3\2\2\2\u0349\u0347\3\2\2\2\u034a"+
		"I\3\2\2\2\u034b\u034f\7x\2\2\u034c\u034d\5\u009eP\2\u034d\u034e\7\4\2"+
		"\2\u034e\u0350\3\2\2\2\u034f\u034c\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351"+
		"\3\2\2\2\u0351\u0358\5\u00b4[\2\u0352\u0353\7\b\2\2\u0353\u0359\5x=\2"+
		"\u0354\u0355\7\5\2\2\u0355\u0356\5x=\2\u0356\u0357\7\6\2\2\u0357\u0359"+
		"\3\2\2\2\u0358\u0352\3\2\2\2\u0358\u0354\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"K\3\2\2\2\u035a\u0365\7\177\2\2\u035b\u0366\5\u00a8U\2\u035c\u035d\5\u009e"+
		"P\2\u035d\u035e\7\4\2\2\u035e\u0360\3\2\2\2\u035f\u035c\3\2\2\2\u035f"+
		"\u0360\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u0364\5\u00a0Q\2\u0362\u0364"+
		"\5\u00acW\2\u0363\u0361\3\2\2\2\u0363\u0362\3\2\2\2\u0364\u0366\3\2\2"+
		"\2\u0365\u035b\3\2\2\2\u0365\u035f\3\2\2\2\u0365\u0366\3\2\2\2\u0366M"+
		"\3\2\2\2\u0367\u0369\7\u0080\2\2\u0368\u036a\7\u0087\2\2\u0369\u0368\3"+
		"\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c\5\u00b6\\\2"+
		"\u036cO\3\2\2\2\u036d\u0372\7\u0085\2\2\u036e\u0370\7\u008f\2\2\u036f"+
		"\u0371\5\u00ba^\2\u0370\u036f\3\2\2\2\u0370\u0371\3\2\2\2\u0371\u0373"+
		"\3\2\2\2\u0372\u036e\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0379\3\2\2\2\u0374"+
		"\u0376\7\u008e\2\2\u0375\u0377\7\u0087\2\2\u0376\u0375\3\2\2\2\u0376\u0377"+
		"\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u037a\5\u00b6\\\2\u0379\u0374\3\2\2"+
		"\2\u0379\u037a\3\2\2\2\u037aQ\3\2\2\2\u037b\u037c\7\u0087\2\2\u037c\u037d"+
		"\5\u00b6\\\2\u037dS\3\2\2\2\u037e\u0380\7\u009b\2\2\u037f\u0381\7|\2\2"+
		"\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0387"+
		"\5z>\2\u0383\u0384\7\7\2\2\u0384\u0386\5z>\2\u0385\u0383\3\2\2\2\u0386"+
		"\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u038b\3\2"+
		"\2\2\u0389\u0387\3\2\2\2\u038a\u037e\3\2\2\2\u038a\u038b\3\2\2\2\u038b"+
		"\u038c\3\2\2\2\u038c\u0397\5\u0086D\2\u038d\u038e\7u\2\2\u038e\u038f\7"+
		".\2\2\u038f\u0394\5v<\2\u0390\u0391\7\7\2\2\u0391\u0393\5v<\2\u0392\u0390"+
		"\3\2\2\2\u0393\u0396\3\2\2\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395"+
		"\u0398\3\2\2\2\u0396\u0394\3\2\2\2\u0397\u038d\3\2\2\2\u0397\u0398\3\2"+
		"\2\2\u0398\u039f\3\2\2\2\u0399\u039a\7k\2\2\u039a\u039d\5h\65\2\u039b"+
		"\u039c\t\5\2\2\u039c\u039e\5h\65\2\u039d\u039b\3\2\2\2\u039d\u039e\3\2"+
		"\2\2\u039e\u03a0\3\2\2\2\u039f\u0399\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0"+
		"U\3\2\2\2\u03a1\u03a3\7\u009b\2\2\u03a2\u03a4\7|\2\2\u03a3\u03a2\3\2\2"+
		"\2\u03a3\u03a4\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03aa\5z>\2\u03a6\u03a7"+
		"\7\7\2\2\u03a7\u03a9\5z>\2\u03a8\u03a6\3\2\2\2\u03a9\u03ac\3\2\2\2\u03aa"+
		"\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ae\3\2\2\2\u03ac\u03aa\3\2"+
		"\2\2\u03ad\u03a1\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\3\2\2\2\u03af"+
		"\u03b5\5X-\2\u03b0\u03b1\5\u0088E\2\u03b1\u03b2\5X-\2\u03b2\u03b4\3\2"+
		"\2\2\u03b3\u03b0\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5"+
		"\u03b6\3\2\2\2\u03b6\u03c2\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b8\u03b9\7u"+
		"\2\2\u03b9\u03ba\7.\2\2\u03ba\u03bf\5v<\2\u03bb\u03bc\7\7\2\2\u03bc\u03be"+
		"\5v<\2\u03bd\u03bb\3\2\2\2\u03be\u03c1\3\2\2\2\u03bf\u03bd\3\2\2\2\u03bf"+
		"\u03c0\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c2\u03b8\3\2"+
		"\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03ca\3\2\2\2\u03c4\u03c5\7k\2\2\u03c5"+
		"\u03c8\5h\65\2\u03c6\u03c7\t\5\2\2\u03c7\u03c9\5h\65\2\u03c8\u03c6\3\2"+
		"\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03cb\3\2\2\2\u03ca\u03c4\3\2\2\2\u03ca"+
		"\u03cb\3\2\2\2\u03cbW\3\2\2\2\u03cc\u03ce\7\u0088\2\2\u03cd\u03cf\t\b"+
		"\2\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0"+
		"\u03d5\5|?\2\u03d1\u03d2\7\7\2\2\u03d2\u03d4\5|?\2\u03d3\u03d1\3\2\2\2"+
		"\u03d4\u03d7\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03e4"+
		"\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d8\u03e2\7T\2\2\u03d9\u03de\5~@\2\u03da"+
		"\u03db\7\7\2\2\u03db\u03dd\5~@\2\u03dc\u03da\3\2\2\2\u03dd\u03e0\3\2\2"+
		"\2\u03de\u03dc\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e3\3\2\2\2\u03e0\u03de"+
		"\3\2\2\2\u03e1\u03e3\5\u0080A\2\u03e2\u03d9\3\2\2\2\u03e2\u03e1\3\2\2"+
		"\2\u03e3\u03e5\3\2\2\2\u03e4\u03d8\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e8"+
		"\3\2\2\2\u03e6\u03e7\7\u009a\2\2\u03e7\u03e9\5h\65\2\u03e8\u03e6\3\2\2"+
		"\2\u03e8\u03e9\3\2\2\2\u03e9\u03f8\3\2\2\2\u03ea\u03eb\7W\2\2\u03eb\u03ec"+
		"\7.\2\2\u03ec\u03f1\5h\65\2\u03ed\u03ee\7\7\2\2\u03ee\u03f0\5h\65\2\u03ef"+
		"\u03ed\3\2\2\2\u03f0\u03f3\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f1\u03f2\3\2"+
		"\2\2\u03f2\u03f6\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f4\u03f5\7X\2\2\u03f5"+
		"\u03f7\5h\65\2\u03f6\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f9\3\2"+
		"\2\2\u03f8\u03ea\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u0417\3\2\2\2\u03fa"+
		"\u03fb\7\u0096\2\2\u03fb\u03fc\7\5\2\2\u03fc\u0401\5h\65\2\u03fd\u03fe"+
		"\7\7\2\2\u03fe\u0400\5h\65\2\u03ff\u03fd\3\2\2\2\u0400\u0403\3\2\2\2\u0401"+
		"\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0404\3\2\2\2\u0403\u0401\3\2"+
		"\2\2\u0404\u0413\7\6\2\2\u0405\u0406\7\7\2\2\u0406\u0407\7\5\2\2\u0407"+
		"\u040c\5h\65\2\u0408\u0409\7\7\2\2\u0409\u040b\5h\65\2\u040a\u0408\3\2"+
		"\2\2\u040b\u040e\3\2\2\2\u040c\u040a\3\2\2\2\u040c\u040d\3\2\2\2\u040d"+
		"\u040f\3\2\2\2\u040e\u040c\3\2\2\2\u040f\u0410\7\6\2\2\u0410\u0412\3\2"+
		"\2\2\u0411\u0405\3\2\2\2\u0412\u0415\3\2\2\2\u0413\u0411\3\2\2\2\u0413"+
		"\u0414\3\2\2\2\u0414\u0417\3\2\2\2\u0415\u0413\3\2\2\2\u0416\u03cc\3\2"+
		"\2\2\u0416\u03fa\3\2\2\2\u0417Y\3\2\2\2\u0418\u041a\5r:\2\u0419\u0418"+
		"\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u0426\7\u0093\2"+
		"\2\u041c\u041d\7t\2\2\u041d\u0427\7\u0085\2\2\u041e\u041f\7t\2\2\u041f"+
		"\u0427\7\33\2\2\u0420\u0421\7t\2\2\u0421\u0427\7\u0082\2\2\u0422\u0423"+
		"\7t\2\2\u0423\u0427\7Q\2\2\u0424\u0425\7t\2\2\u0425\u0427\7Z\2\2\u0426"+
		"\u041c\3\2\2\2\u0426\u041e\3\2\2\2\u0426\u0420\3\2\2\2\u0426\u0422\3\2"+
		"\2\2\u0426\u0424\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\3\2\2\2\u0428"+
		"\u0429\5t;\2\u0429\u042a\7!\2\2\u042a\u042b\5\u00a6T\2\u042b\u042c\7\b"+
		"\2\2\u042c\u0434\5h\65\2\u042d\u042e\7\7\2\2\u042e\u042f\5\u00a6T\2\u042f"+
		"\u0430\7\b\2\2\u0430\u0431\5h\65\2\u0431\u0433\3\2\2\2\u0432\u042d\3\2"+
		"\2\2\u0433\u0436\3\2\2\2\u0434\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435"+
		"\u0439\3\2\2\2\u0436\u0434\3\2\2\2\u0437\u0438\7\u009a\2\2\u0438\u043a"+
		"\5h\65\2\u0439\u0437\3\2\2\2\u0439\u043a\3\2\2\2\u043a[\3\2\2\2\u043b"+
		"\u043d\5r:\2\u043c\u043b\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u043e\3\2\2"+
		"\2\u043e\u0449\7\u0093\2\2\u043f\u0440\7t\2\2\u0440\u044a\7\u0085\2\2"+
		"\u0441\u0442\7t\2\2\u0442\u044a\7\33\2\2\u0443\u0444\7t\2\2\u0444\u044a"+
		"\7\u0082\2\2\u0445\u0446\7t\2\2\u0446\u044a\7Q\2\2\u0447\u0448\7t\2\2"+
		"\u0448\u044a\7Z\2\2\u0449\u043f\3\2\2\2\u0449\u0441\3\2\2\2\u0449\u0443"+
		"\3\2\2\2\u0449\u0445\3\2\2\2\u0449\u0447\3\2\2\2\u0449\u044a\3\2\2\2\u044a"+
		"\u044b\3\2\2\2\u044b\u044c\5t;\2\u044c\u044d\7!\2\2\u044d\u044e\5\u00a6"+
		"T\2\u044e\u044f\7\b\2\2\u044f\u0457\5h\65\2\u0450\u0451\7\7\2\2\u0451"+
		"\u0452\5\u00a6T\2\u0452\u0453\7\b\2\2\u0453\u0454\5h\65\2\u0454\u0456"+
		"\3\2\2\2\u0455\u0450\3\2\2\2\u0456\u0459\3\2\2\2\u0457\u0455\3\2\2\2\u0457"+
		"\u0458\3\2\2\2\u0458\u045c\3\2\2\2\u0459\u0457\3\2\2\2\u045a\u045b\7\u009a"+
		"\2\2\u045b\u045d\5h\65\2\u045c\u045a\3\2\2\2\u045c\u045d\3\2\2\2\u045d"+
		"\u0470\3\2\2\2\u045e\u045f\7u\2\2\u045f\u0460\7.\2\2\u0460\u0465\5v<\2"+
		"\u0461\u0462\7\7\2\2\u0462\u0464\5v<\2\u0463\u0461\3\2\2\2\u0464\u0467"+
		"\3\2\2\2\u0465\u0463\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0469\3\2\2\2\u0467"+
		"\u0465\3\2\2\2\u0468\u045e\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\3\2"+
		"\2\2\u046a\u046b\7k\2\2\u046b\u046e\5h\65\2\u046c\u046d\t\5\2\2\u046d"+
		"\u046f\5h\65\2\u046e\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0471\3\2"+
		"\2\2\u0470\u0468\3\2\2\2\u0470\u0471\3\2\2\2\u0471]\3\2\2\2\u0472\u0473"+
		"\7\u0095\2\2\u0473_\3\2\2\2\u0474\u0476\5\u00a6T\2\u0475\u0477\5b\62\2"+
		"\u0476\u0475\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u047b\3\2\2\2\u0478\u047a"+
		"\5d\63\2\u0479\u0478\3\2\2\2\u047a\u047d\3\2\2\2\u047b\u0479\3\2\2\2\u047b"+
		"\u047c\3\2\2\2\u047ca\3\2\2\2\u047d\u047b\3\2\2\2\u047e\u0480\5\u009a"+
		"N\2\u047f\u047e\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u047f\3\2\2\2\u0481"+
		"\u0482\3\2\2\2\u0482\u048d\3\2\2\2\u0483\u0484\7\5\2\2\u0484\u0485\5\u008c"+
		"G\2\u0485\u0486\7\6\2\2\u0486\u048e\3\2\2\2\u0487\u0488\7\5\2\2\u0488"+
		"\u0489\5\u008cG\2\u0489\u048a\7\7\2\2\u048a\u048b\5\u008cG\2\u048b\u048c"+
		"\7\6\2\2\u048c\u048e\3\2\2\2\u048d\u0483\3\2\2\2\u048d\u0487\3\2\2\2\u048d"+
		"\u048e\3\2\2\2\u048ec\3\2\2\2\u048f\u0490\7\67\2\2\u0490\u0492\5\u009a"+
		"N\2\u0491\u048f\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u04b4\3\2\2\2\u0493"+
		"\u0494\7y\2\2\u0494\u0496\7h\2\2\u0495\u0497\t\t\2\2\u0496\u0495\3\2\2"+
		"\2\u0496\u0497\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u049a\5f\64\2\u0499\u049b"+
		"\7*\2\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u04b5\3\2\2\2\u049c"+
		"\u049e\7o\2\2\u049d\u049c\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u049f\3\2"+
		"\2\2\u049f\u04a0\7q\2\2\u04a0\u04b5\5f\64\2\u04a1\u04a2\7\u0092\2\2\u04a2"+
		"\u04b5\5f\64\2\u04a3\u04a4\7\62\2\2\u04a4\u04a5\7\5\2\2\u04a5\u04a6\5"+
		"h\65\2\u04a6\u04a7\7\6\2\2\u04a7\u04b5\3\2\2\2\u04a8\u04af\7A\2\2\u04a9"+
		"\u04b0\5\u008cG\2\u04aa\u04b0\5\u008eH\2\u04ab\u04ac\7\5\2\2\u04ac\u04ad"+
		"\5h\65\2\u04ad\u04ae\7\6\2\2\u04ae\u04b0\3\2\2\2\u04af\u04a9\3\2\2\2\u04af"+
		"\u04aa\3\2\2\2\u04af\u04ab\3\2\2\2\u04b0\u04b5\3\2\2\2\u04b1\u04b2\7\63"+
		"\2\2\u04b2\u04b5\5\u00a8U\2\u04b3\u04b5\5j\66\2\u04b4\u0493\3\2\2\2\u04b4"+
		"\u049d\3\2\2\2\u04b4\u04a1\3\2\2\2\u04b4\u04a3\3\2\2\2\u04b4\u04a8\3\2"+
		"\2\2\u04b4\u04b1\3\2\2\2\u04b4\u04b3\3\2\2\2\u04b5e\3\2\2\2\u04b6\u04b7"+
		"\7#\2\2\u04b7\u04b8\7\66\2\2\u04b8\u04ba\t\n\2\2\u04b9\u04b6\3\2\2\2\u04b9"+
		"\u04ba\3\2\2\2\u04bag\3\2\2\2\u04bb\u04bc\b\65\1\2\u04bc\u0508\5\u008e"+
		"H\2\u04bd\u0508\7\u009f\2\2\u04be\u04bf\5\u009eP\2\u04bf\u04c0\7\4\2\2"+
		"\u04c0\u04c2\3\2\2\2\u04c1\u04be\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3"+
		"\3\2\2\2\u04c3\u04c4\5\u00a0Q\2\u04c4\u04c5\7\4\2\2\u04c5\u04c7\3\2\2"+
		"\2\u04c6\u04c1\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u0508"+
		"\5\u00a6T\2\u04c9\u04ca\5\u0090I\2\u04ca\u04cb\5h\65\27\u04cb\u0508\3"+
		"\2\2\2\u04cc\u04cd\5\u009cO\2\u04cd\u04da\7\5\2\2\u04ce\u04d0\7G\2\2\u04cf"+
		"\u04ce\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d6\5h"+
		"\65\2\u04d2\u04d3\7\7\2\2\u04d3\u04d5\5h\65\2\u04d4\u04d2\3\2\2\2\u04d5"+
		"\u04d8\3\2\2\2\u04d6\u04d4\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04db\3\2"+
		"\2\2\u04d8\u04d6\3\2\2\2\u04d9\u04db\7\t\2\2\u04da\u04cf\3\2\2\2\u04da"+
		"\u04d9\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04dd\7\6"+
		"\2\2\u04dd\u0508\3\2\2\2\u04de\u04df\7\5\2\2\u04df\u04e0\5h\65\2\u04e0"+
		"\u04e1\7\6\2\2\u04e1\u0508\3\2\2\2\u04e2\u04e3\7\61\2\2\u04e3\u04e4\7"+
		"\5\2\2\u04e4\u04e5\5h\65\2\u04e5\u04e6\7\'\2\2\u04e6\u04e7\5b\62\2\u04e7"+
		"\u04e8\7\6\2\2\u04e8\u0508\3\2\2\2\u04e9\u04eb\7o\2\2\u04ea\u04e9\3\2"+
		"\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ee\7O\2\2\u04ed"+
		"\u04ea\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\7\5"+
		"\2\2\u04f0\u04f1\5V,\2\u04f1\u04f2\7\6\2\2\u04f2\u0508\3\2\2\2\u04f3\u04f5"+
		"\7\60\2\2\u04f4\u04f6\5h\65\2\u04f5\u04f4\3\2\2\2\u04f5\u04f6\3\2\2\2"+
		"\u04f6\u04fc\3\2\2\2\u04f7\u04f8\7\u0099\2\2\u04f8\u04f9\5h\65\2\u04f9"+
		"\u04fa\7\u008d\2\2\u04fa\u04fb\5h\65\2\u04fb\u04fd\3\2\2\2\u04fc\u04f7"+
		"\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u04fc\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff"+
		"\u0502\3\2\2\2\u0500\u0501\7J\2\2\u0501\u0503\5h\65\2\u0502\u0500\3\2"+
		"\2\2\u0502\u0503\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\7K\2\2\u0505"+
		"\u0508\3\2\2\2\u0506\u0508\5l\67\2\u0507\u04bb\3\2\2\2\u0507\u04bd\3\2"+
		"\2\2\u0507\u04c6\3\2\2\2\u0507\u04c9\3\2\2\2\u0507\u04cc\3\2\2\2\u0507"+
		"\u04de\3\2\2\2\u0507\u04e2\3\2\2\2\u0507\u04ed\3\2\2\2\u0507\u04f3\3\2"+
		"\2\2\u0507\u0506\3\2\2\2\u0508\u056d\3\2\2\2\u0509\u050a\f\26\2\2\u050a"+
		"\u050b\7\r\2\2\u050b\u056c\5h\65\27\u050c\u050d\f\25\2\2\u050d\u050e\t"+
		"\13\2\2\u050e\u056c\5h\65\26\u050f\u0510\f\24\2\2\u0510\u0511\t\f\2\2"+
		"\u0511\u056c\5h\65\25\u0512\u0513\f\23\2\2\u0513\u0514\t\r\2\2\u0514\u056c"+
		"\5h\65\24\u0515\u0516\f\22\2\2\u0516\u0517\t\16\2\2\u0517\u056c\5h\65"+
		"\23\u0518\u0525\f\21\2\2\u0519\u0526\7\b\2\2\u051a\u0526\7\30\2\2\u051b"+
		"\u0526\7\31\2\2\u051c\u0526\7\32\2\2\u051d\u0526\7e\2\2\u051e\u051f\7"+
		"e\2\2\u051f\u0526\7o\2\2\u0520\u0526\7\\\2\2\u0521\u0526\7j\2\2\u0522"+
		"\u0526\7V\2\2\u0523\u0526\7l\2\2\u0524\u0526\7~\2\2\u0525\u0519\3\2\2"+
		"\2\u0525\u051a\3\2\2\2\u0525\u051b\3\2\2\2\u0525\u051c\3\2\2\2\u0525\u051d"+
		"\3\2\2\2\u0525\u051e\3\2\2\2\u0525\u0520\3\2\2\2\u0525\u0521\3\2\2\2\u0525"+
		"\u0522\3\2\2\2\u0525\u0523\3\2\2\2\u0525\u0524\3\2\2\2\u0526\u0527\3\2"+
		"\2\2\u0527\u056c\5h\65\22\u0528\u0529\f\20\2\2\u0529\u052a\7&\2\2\u052a"+
		"\u056c\5h\65\21\u052b\u052c\f\17\2\2\u052c\u052d\7t\2\2\u052d\u056c\5"+
		"h\65\20\u052e\u052f\f\b\2\2\u052f\u0531\7e\2\2\u0530\u0532\7o\2\2\u0531"+
		"\u0530\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u056c\5h"+
		"\65\t\u0534\u0536\f\7\2\2\u0535\u0537\7o\2\2\u0536\u0535\3\2\2\2\u0536"+
		"\u0537\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u0539\7-\2\2\u0539\u053a\5h\65"+
		"\2\u053a\u053b\7&\2\2\u053b\u053c\5h\65\b\u053c\u056c\3\2\2\2\u053d\u053e"+
		"\f\13\2\2\u053e\u053f\7\63\2\2\u053f\u056c\5\u00a8U\2\u0540\u0542\f\n"+
		"\2\2\u0541\u0543\7o\2\2\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543"+
		"\u0544\3\2\2\2\u0544\u0545\t\17\2\2\u0545\u0548\5h\65\2\u0546\u0547\7"+
		"L\2\2\u0547\u0549\5h\65\2\u0548\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549"+
		"\u056c\3\2\2\2\u054a\u054f\f\t\2\2\u054b\u0550\7f\2\2\u054c\u0550\7p\2"+
		"\2\u054d\u054e\7o\2\2\u054e\u0550\7q\2\2\u054f\u054b\3\2\2\2\u054f\u054c"+
		"\3\2\2\2\u054f\u054d\3\2\2\2\u0550\u056c\3\2\2\2\u0551\u0553\f\6\2\2\u0552"+
		"\u0554\7o\2\2\u0553\u0552\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0555\3\2"+
		"\2\2\u0555\u0569\7\\\2\2\u0556\u0560\7\5\2\2\u0557\u0561\5V,\2\u0558\u055d"+
		"\5h\65\2\u0559\u055a\7\7\2\2\u055a\u055c\5h\65\2\u055b\u0559\3\2\2\2\u055c"+
		"\u055f\3\2\2\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0561\3\2"+
		"\2\2\u055f\u055d\3\2\2\2\u0560\u0557\3\2\2\2\u0560\u0558\3\2\2\2\u0560"+
		"\u0561\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u056a\7\6\2\2\u0563\u0564\5\u009e"+
		"P\2\u0564\u0565\7\4\2\2\u0565\u0567\3\2\2\2\u0566\u0563\3\2\2\2\u0566"+
		"\u0567\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u056a\5\u00a0Q\2\u0569\u0556"+
		"\3\2\2\2\u0569\u0566\3\2\2\2\u056a\u056c\3\2\2\2\u056b\u0509\3\2\2\2\u056b"+
		"\u050c\3\2\2\2\u056b\u050f\3\2\2\2\u056b\u0512\3\2\2\2\u056b\u0515\3\2"+
		"\2\2\u056b\u0518\3\2\2\2\u056b\u0528\3\2\2\2\u056b\u052b\3\2\2\2\u056b"+
		"\u052e\3\2\2\2\u056b\u0534\3\2\2\2\u056b\u053d\3\2\2\2\u056b\u0540\3\2"+
		"\2\2\u056b\u054a\3\2\2\2\u056b\u0551\3\2\2\2\u056c\u056f\3\2\2\2\u056d"+
		"\u056b\3\2\2\2\u056d\u056e\3\2\2\2\u056ei\3\2\2\2\u056f\u056d\3\2\2\2"+
		"\u0570\u0571\7}\2\2\u0571\u057d\5\u00aaV\2\u0572\u0573\7\5\2\2\u0573\u0578"+
		"\5\u00a6T\2\u0574\u0575\7\7\2\2\u0575\u0577\5\u00a6T\2\u0576\u0574\3\2"+
		"\2\2\u0577\u057a\3\2\2\2\u0578\u0576\3\2\2\2\u0578\u0579\3\2\2\2\u0579"+
		"\u057b\3\2\2\2\u057a\u0578\3\2\2\2\u057b\u057c\7\6\2\2\u057c\u057e\3\2"+
		"\2\2\u057d\u0572\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0591\3\2\2\2\u057f"+
		"\u0580\7#\2\2\u0580\u0589\t\20\2\2\u0581\u0582\7!\2\2\u0582\u058a\7q\2"+
		"\2\u0583\u0584\7!\2\2\u0584\u058a\7A\2\2\u0585\u058a\7/\2\2\u0586\u058a"+
		"\7\u0083\2\2\u0587\u0588\7n\2\2\u0588\u058a\7\34\2\2\u0589\u0581\3\2\2"+
		"\2\u0589\u0583\3\2\2\2\u0589\u0585\3\2\2\2\u0589\u0586\3\2\2\2\u0589\u0587"+
		"\3\2\2\2\u058a\u058e\3\2\2\2\u058b\u058c\7l\2\2\u058c\u058e\5\u009aN\2"+
		"\u058d\u057f\3\2\2\2\u058d\u058b\3\2\2\2\u058e\u0590\3\2\2\2\u058f\u058d"+
		"\3\2\2\2\u0590\u0593\3\2\2\2\u0591\u058f\3\2\2\2\u0591\u0592\3\2\2\2\u0592"+
		"\u059e\3\2\2\2\u0593\u0591\3\2\2\2\u0594\u0596\7o\2\2\u0595\u0594\3\2"+
		"\2\2\u0595\u0596\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u059c\7B\2\2\u0598"+
		"\u0599\7_\2\2\u0599\u059d\7C\2\2\u059a\u059b\7_\2\2\u059b\u059d\7[\2\2"+
		"\u059c\u0598\3\2\2\2\u059c\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059f"+
		"\3\2\2\2\u059e\u0595\3\2\2\2\u059e\u059f\3\2\2\2\u059fk\3\2\2\2\u05a0"+
		"\u05a1\7{\2\2\u05a1\u05a6\7\5\2\2\u05a2\u05a7\7Z\2\2\u05a3\u05a4\t\21"+
		"\2\2\u05a4\u05a5\7\7\2\2\u05a5\u05a7\5\u0092J\2\u05a6\u05a2\3\2\2\2\u05a6"+
		"\u05a3\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05a9\7\6\2\2\u05a9m\3\2\2\2"+
		"\u05aa\u05ad\5\u00a6T\2\u05ab\u05ac\7\63\2\2\u05ac\u05ae\5\u00a8U\2\u05ad"+
		"\u05ab\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05b0\3\2\2\2\u05af\u05b1\t\t"+
		"\2\2\u05b0\u05af\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1o\3\2\2\2\u05b2\u05b3"+
		"\7\67\2\2\u05b3\u05b5\5\u009aN\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5\3\2\2"+
		"\2\u05b5\u05da\3\2\2\2\u05b6\u05b7\7y\2\2\u05b7\u05ba\7h\2\2\u05b8\u05ba"+
		"\7\u0092\2\2\u05b9\u05b6\3\2\2\2\u05b9\u05b8\3\2\2\2\u05ba\u05bb\3\2\2"+
		"\2\u05bb\u05bc\7\5\2\2\u05bc\u05c1\5n8\2\u05bd\u05be\7\7\2\2\u05be\u05c0"+
		"\5n8\2\u05bf\u05bd\3\2\2\2\u05c0\u05c3\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c1"+
		"\u05c2\3\2\2\2\u05c2\u05c4\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c4\u05c5\7\6"+
		"\2\2\u05c5\u05c6\5f\64\2\u05c6\u05db\3\2\2\2\u05c7\u05c8\7\62\2\2\u05c8"+
		"\u05c9\7\5\2\2\u05c9\u05ca\5h\65\2\u05ca\u05cb\7\6\2\2\u05cb\u05db\3\2"+
		"\2\2\u05cc\u05cd\7S\2\2\u05cd\u05ce\7h\2\2\u05ce\u05cf\7\5\2\2\u05cf\u05d4"+
		"\5\u00a6T\2\u05d0\u05d1\7\7\2\2\u05d1\u05d3\5\u00a6T\2\u05d2\u05d0\3\2"+
		"\2\2\u05d3\u05d6\3\2\2\2\u05d4\u05d2\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5"+
		"\u05d7\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d7\u05d8\7\6\2\2\u05d8\u05d9\5j"+
		"\66\2\u05d9\u05db\3\2\2\2\u05da\u05b9\3\2\2\2\u05da\u05c7\3\2\2\2\u05da"+
		"\u05cc\3\2\2\2\u05dbq\3\2\2\2\u05dc\u05de\7\u009b\2\2\u05dd\u05df\7|\2"+
		"\2\u05de\u05dd\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e1"+
		"\5\u008aF\2\u05e1\u05e2\7\'\2\2\u05e2\u05e3\7\5\2\2\u05e3\u05e4\5V,\2"+
		"\u05e4\u05ee\7\6\2\2\u05e5\u05e6\7\7\2\2\u05e6\u05e7\5\u008aF\2\u05e7"+
		"\u05e8\7\'\2\2\u05e8\u05e9\7\5\2\2\u05e9\u05ea\5V,\2\u05ea\u05eb\7\6\2"+
		"\2\u05eb\u05ed\3\2\2\2\u05ec\u05e5\3\2\2\2\u05ed\u05f0\3\2\2\2\u05ee\u05ec"+
		"\3\2\2\2\u05ee\u05ef\3\2\2\2\u05efs\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f1"+
		"\u05f2\5\u009eP\2\u05f2\u05f3\7\4\2\2\u05f3\u05f5\3\2\2\2\u05f4\u05f1"+
		"\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05fc\5\u00a0Q"+
		"\2\u05f7\u05f8\7^\2\2\u05f8\u05f9\7.\2\2\u05f9\u05fd\5\u00acW\2\u05fa"+
		"\u05fb\7o\2\2\u05fb\u05fd\7^\2\2\u05fc\u05f7\3\2\2\2\u05fc\u05fa\3\2\2"+
		"\2\u05fc\u05fd\3\2\2\2\u05fdu\3\2\2\2\u05fe\u0601\5h\65\2\u05ff\u0600"+
		"\7\63\2\2\u0600\u0602\5\u00a8U\2\u0601\u05ff\3\2\2\2\u0601\u0602\3\2\2"+
		"\2\u0602\u0604\3\2\2\2\u0603\u0605\t\t\2\2\u0604\u0603\3\2\2\2\u0604\u0605"+
		"\3\2\2\2\u0605w\3\2\2\2\u0606\u060a\5\u008cG\2\u0607\u060a\5\u009aN\2"+
		"\u0608\u060a\7\u00a0\2\2\u0609\u0606\3\2\2\2\u0609\u0607\3\2\2\2\u0609"+
		"\u0608\3\2\2\2\u060ay\3\2\2\2\u060b\u0617\5\u00a0Q\2\u060c\u060d\7\5\2"+
		"\2\u060d\u0612\5\u00a6T\2\u060e\u060f\7\7\2\2\u060f\u0611\5\u00a6T\2\u0610"+
		"\u060e\3\2\2\2\u0611\u0614\3\2\2\2\u0612\u0610\3\2\2\2\u0612\u0613\3\2"+
		"\2\2\u0613\u0615\3\2\2\2\u0614\u0612\3\2\2\2\u0615\u0616\7\6\2\2\u0616"+
		"\u0618\3\2\2\2\u0617\u060c\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\3\2"+
		"\2\2\u0619\u061a\7\'\2\2\u061a\u061b\7\5\2\2\u061b\u061c\5V,\2\u061c\u061d"+
		"\7\6\2\2\u061d{\3\2\2\2\u061e\u062b\7\t\2\2\u061f\u0620\5\u00a0Q\2\u0620"+
		"\u0621\7\4\2\2\u0621\u0622\7\t\2\2\u0622\u062b\3\2\2\2\u0623\u0628\5h"+
		"\65\2\u0624\u0626\7\'\2\2\u0625\u0624\3\2\2\2\u0625\u0626\3\2\2\2\u0626"+
		"\u0627\3\2\2\2\u0627\u0629\5\u0096L\2\u0628\u0625\3\2\2\2\u0628\u0629"+
		"\3\2\2\2\u0629\u062b\3\2\2\2\u062a\u061e\3\2\2\2\u062a\u061f\3\2\2\2\u062a"+
		"\u0623\3\2\2\2\u062b}\3\2\2\2\u062c\u062d\5\u009eP\2\u062d\u062e\7\4\2"+
		"\2\u062e\u0630\3\2\2\2\u062f\u062c\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0631"+
		"\3\2\2\2\u0631\u0636\5\u00a0Q\2\u0632\u0634\7\'\2\2\u0633\u0632\3\2\2"+
		"\2\u0633\u0634\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0637\5\u00b8]\2\u0636"+
		"\u0633\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u063d\3\2\2\2\u0638\u0639\7^"+
		"\2\2\u0639\u063a\7.\2\2\u063a\u063e\5\u00acW\2\u063b\u063c\7o\2\2\u063c"+
		"\u063e\7^\2\2\u063d\u0638\3\2\2\2\u063d\u063b\3\2\2\2\u063d\u063e\3\2"+
		"\2\2\u063e\u065c\3\2\2\2\u063f\u0649\7\5\2\2\u0640\u0645\5~@\2\u0641\u0642"+
		"\7\7\2\2\u0642\u0644\5~@\2\u0643\u0641\3\2\2\2\u0644\u0647\3\2\2\2\u0645"+
		"\u0643\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u064a\3\2\2\2\u0647\u0645\3\2"+
		"\2\2\u0648\u064a\5\u0080A\2\u0649\u0640\3\2\2\2\u0649\u0648\3\2\2\2\u064a"+
		"\u064b\3\2\2\2\u064b\u0650\7\6\2\2\u064c\u064e\7\'\2\2\u064d\u064c\3\2"+
		"\2\2\u064d\u064e\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0651\5\u00b8]\2\u0650"+
		"\u064d\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u065c\3\2\2\2\u0652\u0653\7\5"+
		"\2\2\u0653\u0654\5V,\2\u0654\u0659\7\6\2\2\u0655\u0657\7\'\2\2\u0656\u0655"+
		"\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0658\3\2\2\2\u0658\u065a\5\u00b8]"+
		"\2\u0659\u0656\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u065c\3\2\2\2\u065b\u062f"+
		"\3\2\2\2\u065b\u063f\3\2\2\2\u065b\u0652\3\2\2\2\u065c\177\3\2\2\2\u065d"+
		"\u0664\5~@\2\u065e\u065f\5\u0082B\2\u065f\u0660\5~@\2\u0660\u0661\5\u0084"+
		"C\2\u0661\u0663\3\2\2\2\u0662\u065e\3\2\2\2\u0663\u0666\3\2\2\2\u0664"+
		"\u0662\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u0081\3\2\2\2\u0666\u0664\3\2"+
		"\2\2\u0667\u0675\7\7\2\2\u0668\u066a\7m\2\2\u0669\u0668\3\2\2\2\u0669"+
		"\u066a\3\2\2\2\u066a\u0671\3\2\2\2\u066b\u066d\7i\2\2\u066c\u066e\7v\2"+
		"\2\u066d\u066c\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u0672\3\2\2\2\u066f\u0672"+
		"\7`\2\2\u0670\u0672\7<\2\2\u0671\u066b\3\2\2\2\u0671\u066f\3\2\2\2\u0671"+
		"\u0670\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0675\7g"+
		"\2\2\u0674\u0667\3\2\2\2\u0674\u0669\3\2\2\2\u0675\u0083\3\2\2\2\u0676"+
		"\u0677\7#\2\2\u0677\u0685\5h\65\2\u0678\u0679\7\u0094\2\2\u0679\u067a"+
		"\7\5\2\2\u067a\u067f\5\u00a6T\2\u067b\u067c\7\7\2\2\u067c\u067e\5\u00a6"+
		"T\2\u067d\u067b\3\2\2\2\u067e\u0681\3\2\2\2\u067f\u067d\3\2\2\2\u067f"+
		"\u0680\3\2\2\2\u0680\u0682\3\2\2\2\u0681\u067f\3\2\2\2\u0682\u0683\7\6"+
		"\2\2\u0683\u0685\3\2\2\2\u0684\u0676\3\2\2\2\u0684\u0678\3\2\2\2\u0684"+
		"\u0685\3\2\2\2\u0685\u0085\3\2\2\2\u0686\u0688\7\u0088\2\2\u0687\u0689"+
		"\t\b\2\2\u0688\u0687\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068a\3\2\2\2\u068a"+
		"\u068f\5|?\2\u068b\u068c\7\7\2\2\u068c\u068e\5|?\2\u068d\u068b\3\2\2\2"+
		"\u068e\u0691\3\2\2\2\u068f\u068d\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u069e"+
		"\3\2\2\2\u0691\u068f\3\2\2\2\u0692\u069c\7T\2\2\u0693\u0698\5~@\2\u0694"+
		"\u0695\7\7\2\2\u0695\u0697\5~@\2\u0696\u0694\3\2\2\2\u0697\u069a\3\2\2"+
		"\2\u0698\u0696\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069d\3\2\2\2\u069a\u0698"+
		"\3\2\2\2\u069b\u069d\5\u0080A\2\u069c\u0693\3\2\2\2\u069c\u069b\3\2\2"+
		"\2\u069d\u069f\3\2\2\2\u069e\u0692\3\2\2\2\u069e\u069f\3\2\2\2\u069f\u06a2"+
		"\3\2\2\2\u06a0\u06a1\7\u009a\2\2\u06a1\u06a3\5h\65\2\u06a2\u06a0\3\2\2"+
		"\2\u06a2\u06a3\3\2\2\2\u06a3\u06b2\3\2\2\2\u06a4\u06a5\7W\2\2\u06a5\u06a6"+
		"\7.\2\2\u06a6\u06ab\5h\65\2\u06a7\u06a8\7\7\2\2\u06a8\u06aa\5h\65\2\u06a9"+
		"\u06a7\3\2\2\2\u06aa\u06ad\3\2\2\2\u06ab\u06a9\3\2\2\2\u06ab\u06ac\3\2"+
		"\2\2\u06ac\u06b0\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ae\u06af\7X\2\2\u06af"+
		"\u06b1\5h\65\2\u06b0\u06ae\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b3\3\2"+
		"\2\2\u06b2\u06a4\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06d1\3\2\2\2\u06b4"+
		"\u06b5\7\u0096\2\2\u06b5\u06b6\7\5\2\2\u06b6\u06bb\5h\65\2\u06b7\u06b8"+
		"\7\7\2\2\u06b8\u06ba\5h\65\2\u06b9\u06b7\3\2\2\2\u06ba\u06bd\3\2\2\2\u06bb"+
		"\u06b9\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06be\3\2\2\2\u06bd\u06bb\3\2"+
		"\2\2\u06be\u06cd\7\6\2\2\u06bf\u06c0\7\7\2\2\u06c0\u06c1\7\5\2\2\u06c1"+
		"\u06c6\5h\65\2\u06c2\u06c3\7\7\2\2\u06c3\u06c5\5h\65\2\u06c4\u06c2\3\2"+
		"\2\2\u06c5\u06c8\3\2\2\2\u06c6\u06c4\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7"+
		"\u06c9\3\2\2\2\u06c8\u06c6\3\2\2\2\u06c9\u06ca\7\6\2\2\u06ca\u06cc\3\2"+
		"\2\2\u06cb\u06bf\3\2\2\2\u06cc\u06cf\3\2\2\2\u06cd\u06cb\3\2\2\2\u06cd"+
		"\u06ce\3\2\2\2\u06ce\u06d1\3\2\2\2\u06cf\u06cd\3\2\2\2\u06d0\u0686\3\2"+
		"\2\2\u06d0\u06b4\3\2\2\2\u06d1\u0087\3\2\2\2\u06d2\u06d8\7\u0091\2\2\u06d3"+
		"\u06d4\7\u0091\2\2\u06d4\u06d8\7\37\2\2\u06d5\u06d8\7c\2\2\u06d6\u06d8"+
		"\7M\2\2\u06d7\u06d2\3\2\2\2\u06d7\u06d3\3\2\2\2\u06d7\u06d5\3\2\2\2\u06d7"+
		"\u06d6\3\2\2\2\u06d8\u0089\3\2\2\2\u06d9\u06e5\5\u00a0Q\2\u06da\u06db"+
		"\7\5\2\2\u06db\u06e0\5\u00a6T\2\u06dc\u06dd\7\7\2\2\u06dd\u06df\5\u00a6"+
		"T\2\u06de\u06dc\3\2\2\2\u06df\u06e2\3\2\2\2\u06e0\u06de\3\2\2\2\u06e0"+
		"\u06e1\3\2\2\2\u06e1\u06e3\3\2\2\2\u06e2\u06e0\3\2\2\2\u06e3\u06e4\7\6"+
		"\2\2\u06e4\u06e6\3\2\2\2\u06e5\u06da\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6"+
		"\u008b\3\2\2\2\u06e7\u06e9\t\f\2\2\u06e8\u06e7\3\2\2\2\u06e8\u06e9\3\2"+
		"\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06eb\7\u009e\2\2\u06eb\u008d\3\2\2\2\u06ec"+
		"\u06ed\t\22\2\2\u06ed\u008f\3\2\2\2\u06ee\u06ef\t\23\2\2\u06ef\u0091\3"+
		"\2\2\2\u06f0\u06f1\7\u00a0\2\2\u06f1\u0093\3\2\2\2\u06f2\u06f5\5h\65\2"+
		"\u06f3\u06f5\5`\61\2\u06f4\u06f2\3\2\2\2\u06f4\u06f3\3\2\2\2\u06f5\u0095"+
		"\3\2\2\2\u06f6\u06f7\t\24\2\2\u06f7\u0097\3\2\2\2\u06f8\u06f9\t\25\2\2"+
		"\u06f9\u0099\3\2\2\2\u06fa\u06fb\5\u00bc_\2\u06fb\u009b\3\2\2\2\u06fc"+
		"\u06fd\5\u00bc_\2\u06fd\u009d\3\2\2\2\u06fe\u06ff\5\u00bc_\2\u06ff\u009f"+
		"\3\2\2\2\u0700\u0701\5\u00bc_\2\u0701\u00a1\3\2\2\2\u0702\u0703\5\u00bc"+
		"_\2\u0703\u00a3\3\2\2\2\u0704\u0705\5\u00bc_\2\u0705\u00a5\3\2\2\2\u0706"+
		"\u0707\5\u00bc_\2\u0707\u00a7\3\2\2\2\u0708\u0709\5\u00bc_\2\u0709\u00a9"+
		"\3\2\2\2\u070a\u070b\5\u00bc_\2\u070b\u00ab\3\2\2\2\u070c\u070d\5\u00bc"+
		"_\2\u070d\u00ad\3\2\2\2\u070e\u070f\5\u00bc_\2\u070f\u00af\3\2\2\2\u0710"+
		"\u0711\5\u00bc_\2\u0711\u00b1\3\2\2\2\u0712\u0713\5\u00bc_\2\u0713\u00b3"+
		"\3\2\2\2\u0714\u0715\5\u00bc_\2\u0715\u00b5\3\2\2\2\u0716\u0717\5\u00bc"+
		"_\2\u0717\u00b7\3\2\2\2\u0718\u0719\5\u00bc_\2\u0719\u00b9\3\2\2\2\u071a"+
		"\u071b\5\u00bc_\2\u071b\u00bb\3\2\2\2\u071c\u0724\7\u009d\2\2\u071d\u0724"+
		"\5\u0098M\2\u071e\u0724\7\u00a0\2\2\u071f\u0720\7\5\2\2\u0720\u0721\5"+
		"\u00bc_\2\u0721\u0722\7\6\2\2\u0722\u0724\3\2\2\2\u0723\u071c\3\2\2\2"+
		"\u0723\u071d\3\2\2\2\u0723\u071e\3\2\2\2\u0723\u071f\3\2\2\2\u0724\u00bd"+
		"\3\2\2\2\u00fd\u00c0\u00c2\u00cd\u00d4\u00d9\u00df\u00e5\u00e7\u0108\u010c"+
		"\u0122\u012a\u012d\u0136\u013a\u0142\u0146\u0148\u014d\u014f\u0153\u015a"+
		"\u015d\u0162\u0166\u016b\u0174\u0177\u017d\u017f\u0183\u0189\u018e\u0199"+
		"\u019f\u01a3\u01a9\u01ae\u01b7\u01be\u01c4\u01c8\u01cb\u01cf\u01d8\u01e2"+
		"\u01f4\u01fb\u0201\u0206\u020d\u0218\u021b\u021d\u0223\u0229\u022d\u0234"+
		"\u023a\u0240\u0246\u024b\u0257\u025c\u0267\u026c\u026f\u0276\u0279\u0280"+
		"\u0289\u028c\u0292\u0294\u0298\u02a0\u02a5\u02ad\u02b2\u02b6\u02bf\u02c4"+
		"\u02cc\u02d1\u02d7\u02de\u02e1\u02e9\u02f3\u02f6\u02fc\u02fe\u0301\u0314"+
		"\u031a\u0323\u0328\u0331\u033c\u0343\u0349\u034f\u0358\u035f\u0363\u0365"+
		"\u0369\u0370\u0372\u0376\u0379\u0380\u0387\u038a\u0394\u0397\u039d\u039f"+
		"\u03a3\u03aa\u03ad\u03b5\u03bf\u03c2\u03c8\u03ca\u03ce\u03d5\u03de\u03e2"+
		"\u03e4\u03e8\u03f1\u03f6\u03f8\u0401\u040c\u0413\u0416\u0419\u0426\u0434"+
		"\u0439\u043c\u0449\u0457\u045c\u0465\u0468\u046e\u0470\u0476\u047b\u0481"+
		"\u048d\u0491\u0496\u049a\u049d\u04af\u04b4\u04b9\u04c1\u04c6\u04cf\u04d6"+
		"\u04da\u04ea\u04ed\u04f5\u04fe\u0502\u0507\u0525\u0531\u0536\u0542\u0548"+
		"\u054f\u0553\u055d\u0560\u0566\u0569\u056b\u056d\u0578\u057d\u0589\u058d"+
		"\u0591\u0595\u059c\u059e\u05a6\u05ad\u05b0\u05b4\u05b9\u05c1\u05d4\u05da"+
		"\u05de\u05ee\u05f4\u05fc\u0601\u0604\u0609\u0612\u0617\u0625\u0628\u062a"+
		"\u062f\u0633\u0636\u063d\u0645\u0649\u064d\u0650\u0656\u0659\u065b\u0664"+
		"\u0669\u066d\u0671\u0674\u067f\u0684\u0688\u068f\u0698\u069c\u069e\u06a2"+
		"\u06ab\u06b0\u06b2\u06bb\u06c6\u06cd\u06d0\u06d7\u06e0\u06e5\u06e8\u06f4"+
		"\u0723";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}