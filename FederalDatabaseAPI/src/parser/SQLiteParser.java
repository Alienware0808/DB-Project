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
		K_ACTION=26, K_ADD=27, K_AFTER=28, K_ALL=29, K_ALTER=30, K_ANALYZE=31, 
		K_AND=32, K_AS=33, K_ASC=34, K_ATTACH=35, K_AUTOINCREMENT=36, K_BEFORE=37, 
		K_BEGIN=38, K_BETWEEN=39, K_BY=40, K_CASCADE=41, K_CASE=42, K_CAST=43, 
		K_CHECK=44, K_COLLATE=45, K_COLUMN=46, K_COMMIT=47, K_CONFLICT=48, K_CONSTRAINT=49, 
		K_CREATE=50, K_VERTICAL=51, K_HORIZONTAL=52, K_CROSS=53, K_CURRENT_DATE=54, 
		K_CURRENT_TIME=55, K_CURRENT_TIMESTAMP=56, K_DATABASE=57, K_DEFAULT=58, 
		K_DEFERRABLE=59, K_DEFERRED=60, K_DELETE=61, K_DESC=62, K_DETACH=63, K_DISTINCT=64, 
		K_DROP=65, K_EACH=66, K_ELSE=67, K_END=68, K_ESCAPE=69, K_EXCEPT=70, K_EXCLUSIVE=71, 
		K_EXISTS=72, K_EXPLAIN=73, K_FAIL=74, K_FOR=75, K_FOREIGN=76, K_FROM=77, 
		K_FULL=78, K_GLOB=79, K_GROUP=80, K_HAVING=81, K_IF=82, K_IGNORE=83, K_IMMEDIATE=84, 
		K_IN=85, K_INDEX=86, K_INDEXED=87, K_INITIALLY=88, K_INNER=89, K_INSERT=90, 
		K_INSTEAD=91, K_INTERSECT=92, K_INTO=93, K_IS=94, K_ISNULL=95, K_JOIN=96, 
		K_KEY=97, K_LEFT=98, K_LIKE=99, K_LIMIT=100, K_MATCH=101, K_NATURAL=102, 
		K_NO=103, K_NOT=104, K_NOTNULL=105, K_NULL=106, K_OF=107, K_OFFSET=108, 
		K_ON=109, K_OR=110, K_ORDER=111, K_OUTER=112, K_PLAN=113, K_PRAGMA=114, 
		K_PRIMARY=115, K_QUERY=116, K_RAISE=117, K_RECURSIVE=118, K_REFERENCES=119, 
		K_REGEXP=120, K_REINDEX=121, K_RELEASE=122, K_RENAME=123, K_REPLACE=124, 
		K_RESTRICT=125, K_RIGHT=126, K_ROLLBACK=127, K_ROW=128, K_SAVEPOINT=129, 
		K_SELECT=130, K_SET=131, K_TABLE=132, K_TEMP=133, K_TEMPORARY=134, K_THEN=135, 
		K_TO=136, K_TRANSACTION=137, K_TRIGGER=138, K_UNION=139, K_UNIQUE=140, 
		K_UPDATE=141, K_USING=142, K_VACUUM=143, K_VALUES=144, K_VIEW=145, K_VIRTUAL=146, 
		K_WHEN=147, K_WHERE=148, K_WITH=149, K_WITHOUT=150, IDENTIFIER=151, NUMERIC_LITERAL=152, 
		BIND_PARAMETER=153, STRING_LITERAL=154, BLOB_LITERAL=155, SINGLE_LINE_COMMENT=156, 
		MULTILINE_COMMENT=157, SPACES=158, UNEXPECTED_CHAR=159;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_alter_table_stmt = 4, RULE_analyze_stmt = 5, RULE_attach_stmt = 6, 
		RULE_begin_stmt = 7, RULE_commit_stmt = 8, RULE_compound_select_stmt = 9, 
		RULE_create_index_stmt = 10, RULE_create_table_stmt = 11, RULE_federal_stmt = 12, 
		RULE_fed_vertical_stmt = 13, RULE_fed_vertical_attr = 14, RULE_fed_horizontal_stmt = 15, 
		RULE_fed_horizontal_attr_list = 16, RULE_fed_horizontal_attr = 17, RULE_create_trigger_stmt = 18, 
		RULE_create_view_stmt = 19, RULE_create_virtual_table_stmt = 20, RULE_delete_stmt = 21, 
		RULE_delete_stmt_limited = 22, RULE_detach_stmt = 23, RULE_drop_index_stmt = 24, 
		RULE_drop_table_stmt = 25, RULE_drop_trigger_stmt = 26, RULE_drop_view_stmt = 27, 
		RULE_factored_select_stmt = 28, RULE_insert_stmt = 29, RULE_pragma_stmt = 30, 
		RULE_reindex_stmt = 31, RULE_release_stmt = 32, RULE_rollback_stmt = 33, 
		RULE_savepoint_stmt = 34, RULE_simple_select_stmt = 35, RULE_select_stmt = 36, 
		RULE_select_or_values = 37, RULE_update_stmt = 38, RULE_update_stmt_limited = 39, 
		RULE_vacuum_stmt = 40, RULE_column_def = 41, RULE_type_name = 42, RULE_column_constraint = 43, 
		RULE_conflict_clause = 44, RULE_expr = 45, RULE_foreign_key_clause = 46, 
		RULE_raise_function = 47, RULE_indexed_column = 48, RULE_table_constraint = 49, 
		RULE_with_clause = 50, RULE_qualified_table_name = 51, RULE_ordering_term = 52, 
		RULE_pragma_value = 53, RULE_common_table_expression = 54, RULE_result_column = 55, 
		RULE_table_or_subquery = 56, RULE_join_clause = 57, RULE_join_operator = 58, 
		RULE_join_constraint = 59, RULE_select_core = 60, RULE_compound_operator = 61, 
		RULE_cte_table_name = 62, RULE_signed_number = 63, RULE_literal_value = 64, 
		RULE_unary_operator = 65, RULE_error_message = 66, RULE_module_argument = 67, 
		RULE_column_alias = 68, RULE_keyword = 69, RULE_name = 70, RULE_function_name = 71, 
		RULE_database_name = 72, RULE_table_name = 73, RULE_table_or_index_name = 74, 
		RULE_new_table_name = 75, RULE_column_name = 76, RULE_collation_name = 77, 
		RULE_foreign_table = 78, RULE_index_name = 79, RULE_trigger_name = 80, 
		RULE_view_name = 81, RULE_module_name = 82, RULE_pragma_name = 83, RULE_savepoint_name = 84, 
		RULE_table_alias = 85, RULE_transaction_name = 86, RULE_any_name = 87;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "analyze_stmt", 
		"attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", "create_index_stmt", 
		"create_table_stmt", "federal_stmt", "fed_vertical_stmt", "fed_vertical_attr", 
		"fed_horizontal_stmt", "fed_horizontal_attr_list", "fed_horizontal_attr", 
		"create_trigger_stmt", "create_view_stmt", "create_virtual_table_stmt", 
		"delete_stmt", "delete_stmt_limited", "detach_stmt", "drop_index_stmt", 
		"drop_table_stmt", "drop_trigger_stmt", "drop_view_stmt", "factored_select_stmt", 
		"insert_stmt", "pragma_stmt", "reindex_stmt", "release_stmt", "rollback_stmt", 
		"savepoint_stmt", "simple_select_stmt", "select_stmt", "select_or_values", 
		"update_stmt", "update_stmt_limited", "vacuum_stmt", "column_def", "type_name", 
		"column_constraint", "conflict_clause", "expr", "foreign_key_clause", 
		"raise_function", "indexed_column", "table_constraint", "with_clause", 
		"qualified_table_name", "ordering_term", "pragma_value", "common_table_expression", 
		"result_column", "table_or_subquery", "join_clause", "join_operator", 
		"join_constraint", "select_core", "compound_operator", "cte_table_name", 
		"signed_number", "literal_value", "unary_operator", "error_message", "module_argument", 
		"column_alias", "keyword", "name", "function_name", "database_name", "table_name", 
		"table_or_index_name", "new_table_name", "column_name", "collation_name", 
		"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
		"pragma_name", "savepoint_name", "table_alias", "transaction_name", "any_name"
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
		"K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", 
		"K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", 
		"K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", 
		"K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_VERTICAL", 
		"K_HORIZONTAL", "K_CROSS", "K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", 
		"K_DATABASE", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", "K_DESC", 
		"K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ESCAPE", 
		"K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", 
		"K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", 
		"K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", 
		"K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", 
		"K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", 
		"K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_OR", 
		"K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", 
		"K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", 
		"K_REPLACE", "K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", 
		"K_SELECT", "K_SET", "K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", 
		"K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", 
		"K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", 
		"K_WITHOUT", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
		"BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", 
		"UNEXPECTED_CHAR"
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
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE) | (1L << K_DELETE) | (1L << K_DETACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_DROP - 65)) | (1L << (K_END - 65)) | (1L << (K_EXPLAIN - 65)) | (1L << (K_INSERT - 65)) | (1L << (K_PRAGMA - 65)) | (1L << (K_REINDEX - 65)) | (1L << (K_RELEASE - 65)) | (1L << (K_REPLACE - 65)) | (1L << (K_ROLLBACK - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (K_SAVEPOINT - 129)) | (1L << (K_SELECT - 129)) | (1L << (K_UPDATE - 129)) | (1L << (K_VACUUM - 129)) | (1L << (K_VALUES - 129)) | (1L << (K_WITH - 129)) | (1L << (UNEXPECTED_CHAR - 129)))) != 0)) {
				{
				setState(178);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case K_ALTER:
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
					setState(176);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(177);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
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
			setState(185);
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
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(188);
				match(SCOL);
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			sql_stmt();
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(195);
						match(SCOL);
						}
						}
						setState(198); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(200);
					sql_stmt();
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(206);
					match(SCOL);
					}
					} 
				}
				setState(211);
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
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
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
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(212);
				match(K_EXPLAIN);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(213);
					match(K_QUERY);
					setState(214);
					match(K_PLAN);
					}
				}

				}
			}

			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(219);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(220);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(221);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(222);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(223);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(224);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(225);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(226);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(227);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(228);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(229);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(230);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(231);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(232);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(233);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(234);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(235);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(236);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(237);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(238);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(239);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(240);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(241);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(242);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(243);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(244);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(245);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(246);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(247);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(248);
				vacuum_stmt();
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
		enterRule(_localctx, 8, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(K_ALTER);
			setState(252);
			match(K_TABLE);
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(253);
				database_name();
				setState(254);
				match(DOT);
				}
				break;
			}
			setState(258);
			table_name();
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(259);
				match(K_RENAME);
				setState(260);
				match(K_TO);
				setState(261);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(262);
				match(K_ADD);
				setState(264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(263);
					match(K_COLUMN);
					}
					break;
				}
				setState(266);
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
		enterRule(_localctx, 10, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(K_ANALYZE);
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(270);
				database_name();
				}
				break;
			case 2:
				{
				setState(271);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(272);
				database_name();
				setState(273);
				match(DOT);
				setState(274);
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
		enterRule(_localctx, 12, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(K_ATTACH);
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(279);
				match(K_DATABASE);
				}
				break;
			}
			setState(282);
			expr(0);
			setState(283);
			match(K_AS);
			setState(284);
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
		enterRule(_localctx, 14, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(K_BEGIN);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (K_DEFERRED - 60)) | (1L << (K_EXCLUSIVE - 60)) | (1L << (K_IMMEDIATE - 60)))) != 0)) {
				{
				setState(287);
				_la = _input.LA(1);
				if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (K_DEFERRED - 60)) | (1L << (K_EXCLUSIVE - 60)) | (1L << (K_IMMEDIATE - 60)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(290);
				match(K_TRANSACTION);
				setState(292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(291);
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
		enterRule(_localctx, 16, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(297);
				match(K_TRANSACTION);
				setState(299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(298);
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
		enterRule(_localctx, 18, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(303);
				match(K_WITH);
				setState(305);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(304);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(307);
				common_table_expression();
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(308);
					match(COMMA);
					setState(309);
					common_table_expression();
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(317);
			select_core();
			setState(327); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(324);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(318);
					match(K_UNION);
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(319);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(322);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(323);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(326);
				select_core();
				}
				}
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(331);
				match(K_ORDER);
				setState(332);
				match(K_BY);
				setState(333);
				ordering_term();
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(334);
					match(COMMA);
					setState(335);
					ordering_term();
					}
					}
					setState(340);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(343);
				match(K_LIMIT);
				setState(344);
				expr(0);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(345);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(346);
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
		enterRule(_localctx, 20, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(K_CREATE);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(352);
				match(K_UNIQUE);
				}
			}

			setState(355);
			match(K_INDEX);
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(356);
				match(K_IF);
				setState(357);
				match(K_NOT);
				setState(358);
				match(K_EXISTS);
				}
				break;
			}
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(361);
				database_name();
				setState(362);
				match(DOT);
				}
				break;
			}
			setState(366);
			index_name();
			setState(367);
			match(K_ON);
			setState(368);
			table_name();
			setState(369);
			match(OPEN_PAR);
			setState(370);
			indexed_column();
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(371);
				match(COMMA);
				setState(372);
				indexed_column();
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			match(CLOSE_PAR);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(379);
				match(K_WHERE);
				setState(380);
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
		enterRule(_localctx, 22, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(K_CREATE);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(384);
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

			setState(387);
			match(K_TABLE);
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
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
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
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
			table_name();
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(399);
				match(OPEN_PAR);
				setState(400);
				column_def();
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(401);
						match(COMMA);
						setState(402);
						column_def();
						}
						} 
					}
					setState(407);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(408);
					match(COMMA);
					setState(409);
					table_constraint();
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(415);
				match(CLOSE_PAR);
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(416);
					match(K_WITHOUT);
					setState(417);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(420);
				match(K_AS);
				setState(421);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VERTICAL || _la==K_HORIZONTAL) {
				{
				setState(424);
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
		enterRule(_localctx, 24, RULE_federal_stmt);
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_VERTICAL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(427);
				fed_vertical_stmt();
				}
				}
				break;
			case K_HORIZONTAL:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(428);
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
		enterRule(_localctx, 26, RULE_fed_vertical_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(K_VERTICAL);
			setState(432);
			match(OPEN_PAR);
			{
			setState(433);
			fed_vertical_attr();
			}
			setState(434);
			match(COMMA);
			{
			setState(435);
			fed_vertical_attr();
			}
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(436);
				match(COMMA);
				setState(437);
				fed_vertical_attr();
				}
			}

			setState(440);
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
		enterRule(_localctx, 28, RULE_fed_vertical_attr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(OPEN_PAR);
			setState(443);
			column_name();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(444);
				match(COMMA);
				setState(445);
				column_name();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
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
		enterRule(_localctx, 30, RULE_fed_horizontal_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(K_HORIZONTAL);
			setState(454);
			match(OPEN_PAR);
			setState(455);
			column_name();
			setState(456);
			match(OPEN_PAR);
			setState(457);
			fed_horizontal_attr_list();
			setState(458);
			match(CLOSE_PAR);
			setState(459);
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
		enterRule(_localctx, 32, RULE_fed_horizontal_attr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(461);
			fed_horizontal_attr();
			}
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(462);
				match(COMMA);
				setState(463);
				fed_horizontal_attr();
				}
				}
				setState(468);
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
		enterRule(_localctx, 34, RULE_fed_horizontal_attr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
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
		enterRule(_localctx, 36, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(K_CREATE);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(472);
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

			setState(475);
			match(K_TRIGGER);
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(476);
				match(K_IF);
				setState(477);
				match(K_NOT);
				setState(478);
				match(K_EXISTS);
				}
				break;
			}
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(481);
				database_name();
				setState(482);
				match(DOT);
				}
				break;
			}
			setState(486);
			trigger_name();
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(487);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(488);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(489);
				match(K_INSTEAD);
				setState(490);
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
			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(493);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(494);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(495);
				match(K_UPDATE);
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(496);
					match(K_OF);
					setState(497);
					column_name();
					setState(502);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(498);
						match(COMMA);
						setState(499);
						column_name();
						}
						}
						setState(504);
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
			setState(509);
			match(K_ON);
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(510);
				database_name();
				setState(511);
				match(DOT);
				}
				break;
			}
			setState(515);
			table_name();
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(516);
				match(K_FOR);
				setState(517);
				match(K_EACH);
				setState(518);
				match(K_ROW);
				}
			}

			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(521);
				match(K_WHEN);
				setState(522);
				expr(0);
				}
			}

			setState(525);
			match(K_BEGIN);
			setState(534); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(526);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(527);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(528);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(529);
					select_stmt();
					}
					break;
				}
				setState(532);
				match(SCOL);
				}
				}
				setState(536); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (K_INSERT - 90)) | (1L << (K_REPLACE - 90)) | (1L << (K_SELECT - 90)) | (1L << (K_UPDATE - 90)) | (1L << (K_VALUES - 90)) | (1L << (K_WITH - 90)))) != 0) );
			setState(538);
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
		enterRule(_localctx, 38, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(K_CREATE);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(541);
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

			setState(544);
			match(K_VIEW);
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(545);
				match(K_IF);
				setState(546);
				match(K_NOT);
				setState(547);
				match(K_EXISTS);
				}
				break;
			}
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(550);
				database_name();
				setState(551);
				match(DOT);
				}
				break;
			}
			setState(555);
			view_name();
			setState(556);
			match(K_AS);
			setState(557);
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
		enterRule(_localctx, 40, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(K_CREATE);
			setState(560);
			match(K_VIRTUAL);
			setState(561);
			match(K_TABLE);
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(562);
				match(K_IF);
				setState(563);
				match(K_NOT);
				setState(564);
				match(K_EXISTS);
				}
				break;
			}
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(567);
				database_name();
				setState(568);
				match(DOT);
				}
				break;
			}
			setState(572);
			table_name();
			setState(573);
			match(K_USING);
			setState(574);
			module_name();
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(575);
				match(OPEN_PAR);
				setState(576);
				module_argument();
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(577);
					match(COMMA);
					setState(578);
					module_argument();
					}
					}
					setState(583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(584);
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
		enterRule(_localctx, 42, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(588);
				with_clause();
				}
			}

			setState(591);
			match(K_DELETE);
			setState(592);
			match(K_FROM);
			setState(593);
			qualified_table_name();
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(594);
				match(K_WHERE);
				setState(595);
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
		enterRule(_localctx, 44, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(598);
				with_clause();
				}
			}

			setState(601);
			match(K_DELETE);
			setState(602);
			match(K_FROM);
			setState(603);
			qualified_table_name();
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(604);
				match(K_WHERE);
				setState(605);
				expr(0);
				}
			}

			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(608);
					match(K_ORDER);
					setState(609);
					match(K_BY);
					setState(610);
					ordering_term();
					setState(615);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(611);
						match(COMMA);
						setState(612);
						ordering_term();
						}
						}
						setState(617);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(620);
				match(K_LIMIT);
				setState(621);
				expr(0);
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(622);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(623);
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
		enterRule(_localctx, 46, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			match(K_DETACH);
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(629);
				match(K_DATABASE);
				}
				break;
			}
			setState(632);
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
		enterRule(_localctx, 48, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(K_DROP);
			setState(635);
			match(K_INDEX);
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(636);
				match(K_IF);
				setState(637);
				match(K_EXISTS);
				}
				break;
			}
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(640);
				database_name();
				setState(641);
				match(DOT);
				}
				break;
			}
			setState(645);
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
		enterRule(_localctx, 50, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(K_DROP);
			setState(648);
			match(K_TABLE);
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(649);
				match(K_IF);
				setState(650);
				match(K_EXISTS);
				}
				break;
			}
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(653);
				database_name();
				setState(654);
				match(DOT);
				}
				break;
			}
			setState(658);
			table_name();
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
		enterRule(_localctx, 52, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(K_DROP);
			setState(661);
			match(K_TRIGGER);
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(662);
				match(K_IF);
				setState(663);
				match(K_EXISTS);
				}
				break;
			}
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(666);
				database_name();
				setState(667);
				match(DOT);
				}
				break;
			}
			setState(671);
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
		enterRule(_localctx, 54, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(K_DROP);
			setState(674);
			match(K_VIEW);
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(675);
				match(K_IF);
				setState(676);
				match(K_EXISTS);
				}
				break;
			}
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(679);
				database_name();
				setState(680);
				match(DOT);
				}
				break;
			}
			setState(684);
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
		enterRule(_localctx, 56, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(686);
				match(K_WITH);
				setState(688);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(687);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(690);
				common_table_expression();
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(691);
					match(COMMA);
					setState(692);
					common_table_expression();
					}
					}
					setState(697);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(700);
			select_core();
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(701);
				compound_operator();
				setState(702);
				select_core();
				}
				}
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(709);
				match(K_ORDER);
				setState(710);
				match(K_BY);
				setState(711);
				ordering_term();
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(712);
					match(COMMA);
					setState(713);
					ordering_term();
					}
					}
					setState(718);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(721);
				match(K_LIMIT);
				setState(722);
				expr(0);
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(723);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(724);
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
		enterRule(_localctx, 58, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(729);
				with_clause();
				}
			}

			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(732);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(733);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(734);
				match(K_INSERT);
				setState(735);
				match(K_OR);
				setState(736);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(737);
				match(K_INSERT);
				setState(738);
				match(K_OR);
				setState(739);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(740);
				match(K_INSERT);
				setState(741);
				match(K_OR);
				setState(742);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(743);
				match(K_INSERT);
				setState(744);
				match(K_OR);
				setState(745);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(746);
				match(K_INSERT);
				setState(747);
				match(K_OR);
				setState(748);
				match(K_IGNORE);
				}
				break;
			}
			setState(751);
			match(K_INTO);
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(752);
				database_name();
				setState(753);
				match(DOT);
				}
				break;
			}
			setState(757);
			table_name();
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(758);
				match(OPEN_PAR);
				setState(759);
				column_name();
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(760);
					match(COMMA);
					setState(761);
					column_name();
					}
					}
					setState(766);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(767);
				match(CLOSE_PAR);
				}
			}

			setState(802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(771);
				match(K_VALUES);
				setState(772);
				match(OPEN_PAR);
				setState(773);
				expr(0);
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(774);
					match(COMMA);
					setState(775);
					expr(0);
					}
					}
					setState(780);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(781);
				match(CLOSE_PAR);
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(782);
					match(COMMA);
					setState(783);
					match(OPEN_PAR);
					setState(784);
					expr(0);
					setState(789);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(785);
						match(COMMA);
						setState(786);
						expr(0);
						}
						}
						setState(791);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(792);
					match(CLOSE_PAR);
					}
					}
					setState(798);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(799);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(800);
				match(K_DEFAULT);
				setState(801);
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
		enterRule(_localctx, 60, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(K_PRAGMA);
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(805);
				database_name();
				setState(806);
				match(DOT);
				}
				break;
			}
			setState(810);
			pragma_name();
			setState(817);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(811);
				match(ASSIGN);
				setState(812);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(813);
				match(OPEN_PAR);
				setState(814);
				pragma_value();
				setState(815);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
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
		enterRule(_localctx, 62, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			match(K_REINDEX);
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(820);
				collation_name();
				}
				break;
			case 2:
				{
				setState(824);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(821);
					database_name();
					setState(822);
					match(DOT);
					}
					break;
				}
				setState(828);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(826);
					table_name();
					}
					break;
				case 2:
					{
					setState(827);
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
		enterRule(_localctx, 64, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			match(K_RELEASE);
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(833);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(836);
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
		enterRule(_localctx, 66, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(K_ROLLBACK);
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(839);
				match(K_TRANSACTION);
				setState(841);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(840);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(845);
				match(K_TO);
				setState(847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(846);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(849);
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
		enterRule(_localctx, 68, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(K_SAVEPOINT);
			setState(853);
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
		enterRule(_localctx, 70, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(855);
				match(K_WITH);
				setState(857);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(856);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(859);
				common_table_expression();
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(860);
					match(COMMA);
					setState(861);
					common_table_expression();
					}
					}
					setState(866);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(869);
			select_core();
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(870);
				match(K_ORDER);
				setState(871);
				match(K_BY);
				setState(872);
				ordering_term();
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(873);
					match(COMMA);
					setState(874);
					ordering_term();
					}
					}
					setState(879);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(882);
				match(K_LIMIT);
				setState(883);
				expr(0);
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(884);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(885);
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
		enterRule(_localctx, 72, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(890);
				match(K_WITH);
				setState(892);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(891);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(894);
				common_table_expression();
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(895);
					match(COMMA);
					setState(896);
					common_table_expression();
					}
					}
					setState(901);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(904);
			select_or_values();
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(905);
				compound_operator();
				setState(906);
				select_or_values();
				}
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(913);
				match(K_ORDER);
				setState(914);
				match(K_BY);
				setState(915);
				ordering_term();
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(916);
					match(COMMA);
					setState(917);
					ordering_term();
					}
					}
					setState(922);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(925);
				match(K_LIMIT);
				setState(926);
				expr(0);
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(927);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(928);
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
		enterRule(_localctx, 74, RULE_select_or_values);
		int _la;
		try {
			setState(1007);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(933);
				match(K_SELECT);
				setState(935);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(934);
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
				setState(937);
				result_column();
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(938);
					match(COMMA);
					setState(939);
					result_column();
					}
					}
					setState(944);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(945);
					match(K_FROM);
					setState(955);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
					case 1:
						{
						setState(946);
						table_or_subquery();
						setState(951);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(947);
							match(COMMA);
							setState(948);
							table_or_subquery();
							}
							}
							setState(953);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(954);
						join_clause();
						}
						break;
					}
					}
				}

				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(959);
					match(K_WHERE);
					setState(960);
					expr(0);
					}
				}

				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(963);
					match(K_GROUP);
					setState(964);
					match(K_BY);
					setState(965);
					expr(0);
					setState(970);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(966);
						match(COMMA);
						setState(967);
						expr(0);
						}
						}
						setState(972);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(975);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(973);
						match(K_HAVING);
						setState(974);
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
				setState(979);
				match(K_VALUES);
				setState(980);
				match(OPEN_PAR);
				setState(981);
				expr(0);
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(982);
					match(COMMA);
					setState(983);
					expr(0);
					}
					}
					setState(988);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(989);
				match(CLOSE_PAR);
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(990);
					match(COMMA);
					setState(991);
					match(OPEN_PAR);
					setState(992);
					expr(0);
					setState(997);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(993);
						match(COMMA);
						setState(994);
						expr(0);
						}
						}
						setState(999);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1000);
					match(CLOSE_PAR);
					}
					}
					setState(1006);
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
		enterRule(_localctx, 76, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1009);
				with_clause();
				}
			}

			setState(1012);
			match(K_UPDATE);
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1013);
				match(K_OR);
				setState(1014);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1015);
				match(K_OR);
				setState(1016);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1017);
				match(K_OR);
				setState(1018);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1019);
				match(K_OR);
				setState(1020);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1021);
				match(K_OR);
				setState(1022);
				match(K_IGNORE);
				}
				break;
			}
			setState(1025);
			qualified_table_name();
			setState(1026);
			match(K_SET);
			setState(1027);
			column_name();
			setState(1028);
			match(ASSIGN);
			setState(1029);
			expr(0);
			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1030);
				match(COMMA);
				setState(1031);
				column_name();
				setState(1032);
				match(ASSIGN);
				setState(1033);
				expr(0);
				}
				}
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1040);
				match(K_WHERE);
				setState(1041);
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
		enterRule(_localctx, 78, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1044);
				with_clause();
				}
			}

			setState(1047);
			match(K_UPDATE);
			setState(1058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1048);
				match(K_OR);
				setState(1049);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1050);
				match(K_OR);
				setState(1051);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1052);
				match(K_OR);
				setState(1053);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1054);
				match(K_OR);
				setState(1055);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1056);
				match(K_OR);
				setState(1057);
				match(K_IGNORE);
				}
				break;
			}
			setState(1060);
			qualified_table_name();
			setState(1061);
			match(K_SET);
			setState(1062);
			column_name();
			setState(1063);
			match(ASSIGN);
			setState(1064);
			expr(0);
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1065);
				match(COMMA);
				setState(1066);
				column_name();
				setState(1067);
				match(ASSIGN);
				setState(1068);
				expr(0);
				}
				}
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1075);
				match(K_WHERE);
				setState(1076);
				expr(0);
				}
			}

			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1089);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1079);
					match(K_ORDER);
					setState(1080);
					match(K_BY);
					setState(1081);
					ordering_term();
					setState(1086);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1082);
						match(COMMA);
						setState(1083);
						ordering_term();
						}
						}
						setState(1088);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1091);
				match(K_LIMIT);
				setState(1092);
				expr(0);
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1093);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1094);
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
		enterRule(_localctx, 80, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
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
		enterRule(_localctx, 82, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			column_name();
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1102);
				type_name();
				}
				break;
			}
			setState(1108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (K_NOT - 104)) | (1L << (K_NULL - 104)) | (1L << (K_PRIMARY - 104)) | (1L << (K_REFERENCES - 104)) | (1L << (K_UNIQUE - 104)))) != 0)) {
				{
				{
				setState(1105);
				column_constraint();
				}
				}
				setState(1110);
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
		enterRule(_localctx, 84, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1112); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1111);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1114); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1116);
				match(OPEN_PAR);
				setState(1117);
				signed_number();
				setState(1118);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1120);
				match(OPEN_PAR);
				setState(1121);
				signed_number();
				setState(1122);
				match(COMMA);
				setState(1123);
				signed_number();
				setState(1124);
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
		enterRule(_localctx, 86, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1128);
				match(K_CONSTRAINT);
				setState(1129);
				name();
				}
			}

			setState(1165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1132);
				match(K_PRIMARY);
				setState(1133);
				match(K_KEY);
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1134);
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

				setState(1137);
				conflict_clause();
				setState(1139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1138);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1141);
					match(K_NOT);
					}
				}

				setState(1144);
				match(K_NULL);
				setState(1145);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1146);
				match(K_UNIQUE);
				setState(1147);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1148);
				match(K_CHECK);
				setState(1149);
				match(OPEN_PAR);
				setState(1150);
				expr(0);
				setState(1151);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1153);
				match(K_DEFAULT);
				setState(1160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1154);
					signed_number();
					}
					break;
				case 2:
					{
					setState(1155);
					literal_value();
					}
					break;
				case 3:
					{
					setState(1156);
					match(OPEN_PAR);
					setState(1157);
					expr(0);
					setState(1158);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1162);
				match(K_COLLATE);
				setState(1163);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1164);
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
		enterRule(_localctx, 88, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1167);
				match(K_ON);
				setState(1168);
				match(K_CONFLICT);
				setState(1169);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (K_FAIL - 74)) | (1L << (K_IGNORE - 74)) | (1L << (K_REPLACE - 74)) | (1L << (K_ROLLBACK - 74)))) != 0)) ) {
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
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1173);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1174);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1178);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
					case 1:
						{
						setState(1175);
						database_name();
						setState(1176);
						match(DOT);
						}
						break;
					}
					setState(1180);
					table_name();
					setState(1181);
					match(DOT);
					}
					break;
				}
				setState(1185);
				column_name();
				}
				break;
			case 4:
				{
				setState(1186);
				unary_operator();
				setState(1187);
				expr(21);
				}
				break;
			case 5:
				{
				setState(1189);
				function_name();
				setState(1190);
				match(OPEN_PAR);
				setState(1203);
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
				case K_ON:
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
				case K_SET:
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
					setState(1192);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
					case 1:
						{
						setState(1191);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1194);
					expr(0);
					setState(1199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1195);
						match(COMMA);
						setState(1196);
						expr(0);
						}
						}
						setState(1201);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1202);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1205);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1207);
				match(OPEN_PAR);
				setState(1208);
				expr(0);
				setState(1209);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1211);
				match(K_CAST);
				setState(1212);
				match(OPEN_PAR);
				setState(1213);
				expr(0);
				setState(1214);
				match(K_AS);
				setState(1215);
				type_name();
				setState(1216);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1219);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1218);
						match(K_NOT);
						}
					}

					setState(1221);
					match(K_EXISTS);
					}
				}

				setState(1224);
				match(OPEN_PAR);
				setState(1225);
				select_stmt();
				setState(1226);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1228);
				match(K_CASE);
				setState(1230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1229);
					expr(0);
					}
					break;
				}
				setState(1237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1232);
					match(K_WHEN);
					setState(1233);
					expr(0);
					setState(1234);
					match(K_THEN);
					setState(1235);
					expr(0);
					}
					}
					setState(1239); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1241);
					match(K_ELSE);
					setState(1242);
					expr(0);
					}
				}

				setState(1245);
				match(K_END);
				}
				break;
			case 10:
				{
				setState(1247);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1348);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1250);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1251);
						match(PIPE2);
						setState(1252);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1253);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1254);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1255);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1256);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1257);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1258);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1259);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1260);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1261);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1262);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1263);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1264);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1265);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1278);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
						case 1:
							{
							setState(1266);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1267);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1268);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1269);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1270);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1271);
							match(K_IS);
							setState(1272);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1273);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1274);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1275);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1276);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1277);
							match(K_REGEXP);
							}
							break;
						}
						setState(1280);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1281);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1282);
						match(K_AND);
						setState(1283);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1284);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1285);
						match(K_OR);
						setState(1286);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1287);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1288);
						match(K_IS);
						setState(1290);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
						case 1:
							{
							setState(1289);
							match(K_NOT);
							}
							break;
						}
						setState(1292);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1293);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1295);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1294);
							match(K_NOT);
							}
						}

						setState(1297);
						match(K_BETWEEN);
						setState(1298);
						expr(0);
						setState(1299);
						match(K_AND);
						setState(1300);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1302);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1303);
						match(K_COLLATE);
						setState(1304);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1305);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1307);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1306);
							match(K_NOT);
							}
						}

						setState(1309);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (K_GLOB - 79)) | (1L << (K_LIKE - 79)) | (1L << (K_MATCH - 79)) | (1L << (K_REGEXP - 79)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1310);
						expr(0);
						setState(1313);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
						case 1:
							{
							setState(1311);
							match(K_ESCAPE);
							setState(1312);
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
						setState(1315);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1320);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1316);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1317);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1318);
							match(K_NOT);
							setState(1319);
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
						setState(1322);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1324);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1323);
							match(K_NOT);
							}
						}

						setState(1326);
						match(K_IN);
						setState(1346);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
						case 1:
							{
							setState(1327);
							match(OPEN_PAR);
							setState(1337);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
							case 1:
								{
								setState(1328);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1329);
								expr(0);
								setState(1334);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1330);
									match(COMMA);
									setState(1331);
									expr(0);
									}
									}
									setState(1336);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1339);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1343);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
							case 1:
								{
								setState(1340);
								database_name();
								setState(1341);
								match(DOT);
								}
								break;
							}
							setState(1345);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
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
		enterRule(_localctx, 92, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			match(K_REFERENCES);
			setState(1354);
			foreign_table();
			setState(1366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1355);
				match(OPEN_PAR);
				setState(1356);
				column_name();
				setState(1361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1357);
					match(COMMA);
					setState(1358);
					column_name();
					}
					}
					setState(1363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1364);
				match(CLOSE_PAR);
				}
			}

			setState(1386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1382);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1368);
					match(K_ON);
					setState(1369);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1378);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
					case 1:
						{
						setState(1370);
						match(K_SET);
						setState(1371);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1372);
						match(K_SET);
						setState(1373);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1374);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1375);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1376);
						match(K_NO);
						setState(1377);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1380);
					match(K_MATCH);
					setState(1381);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1389);
					match(K_NOT);
					}
				}

				setState(1392);
				match(K_DEFERRABLE);
				setState(1397);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1393);
					match(K_INITIALLY);
					setState(1394);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1395);
					match(K_INITIALLY);
					setState(1396);
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
		enterRule(_localctx, 94, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1401);
			match(K_RAISE);
			setState(1402);
			match(OPEN_PAR);
			setState(1407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1403);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1404);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1405);
				match(COMMA);
				setState(1406);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1409);
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
		enterRule(_localctx, 96, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
			column_name();
			setState(1414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1412);
				match(K_COLLATE);
				setState(1413);
				collation_name();
				}
			}

			setState(1417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1416);
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
		enterRule(_localctx, 98, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1419);
				match(K_CONSTRAINT);
				setState(1420);
				name();
				}
			}

			setState(1459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1426);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1423);
					match(K_PRIMARY);
					setState(1424);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1425);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1428);
				match(OPEN_PAR);
				setState(1429);
				indexed_column();
				setState(1434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1430);
					match(COMMA);
					setState(1431);
					indexed_column();
					}
					}
					setState(1436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1437);
				match(CLOSE_PAR);
				setState(1438);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1440);
				match(K_CHECK);
				setState(1441);
				match(OPEN_PAR);
				setState(1442);
				expr(0);
				setState(1443);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1445);
				match(K_FOREIGN);
				setState(1446);
				match(K_KEY);
				setState(1447);
				match(OPEN_PAR);
				setState(1448);
				column_name();
				setState(1453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1449);
					match(COMMA);
					setState(1450);
					column_name();
					}
					}
					setState(1455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1456);
				match(CLOSE_PAR);
				setState(1457);
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
		enterRule(_localctx, 100, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			match(K_WITH);
			setState(1463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1462);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1465);
			cte_table_name();
			setState(1466);
			match(K_AS);
			setState(1467);
			match(OPEN_PAR);
			setState(1468);
			select_stmt();
			setState(1469);
			match(CLOSE_PAR);
			setState(1479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1470);
				match(COMMA);
				setState(1471);
				cte_table_name();
				setState(1472);
				match(K_AS);
				setState(1473);
				match(OPEN_PAR);
				setState(1474);
				select_stmt();
				setState(1475);
				match(CLOSE_PAR);
				}
				}
				setState(1481);
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
		enterRule(_localctx, 102, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1482);
				database_name();
				setState(1483);
				match(DOT);
				}
				break;
			}
			setState(1487);
			table_name();
			setState(1493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1488);
				match(K_INDEXED);
				setState(1489);
				match(K_BY);
				setState(1490);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1491);
				match(K_NOT);
				setState(1492);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
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
			case K_SET:
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
		enterRule(_localctx, 104, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			expr(0);
			setState(1498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1496);
				match(K_COLLATE);
				setState(1497);
				collation_name();
				}
			}

			setState(1501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1500);
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
		enterRule(_localctx, 106, RULE_pragma_value);
		try {
			setState(1506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1503);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1504);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1505);
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
		enterRule(_localctx, 108, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1508);
			table_name();
			setState(1520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1509);
				match(OPEN_PAR);
				setState(1510);
				column_name();
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1511);
					match(COMMA);
					setState(1512);
					column_name();
					}
					}
					setState(1517);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1518);
				match(CLOSE_PAR);
				}
			}

			setState(1522);
			match(K_AS);
			setState(1523);
			match(OPEN_PAR);
			setState(1524);
			select_stmt();
			setState(1525);
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
		enterRule(_localctx, 110, RULE_result_column);
		int _la;
		try {
			setState(1539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1527);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1528);
				table_name();
				setState(1529);
				match(DOT);
				setState(1530);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1532);
				expr(0);
				setState(1537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1534);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1533);
						match(K_AS);
						}
					}

					setState(1536);
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
		enterRule(_localctx, 112, RULE_table_or_subquery);
		int _la;
		try {
			setState(1588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1541);
					database_name();
					setState(1542);
					match(DOT);
					}
					break;
				}
				setState(1546);
				table_name();
				setState(1551);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1548);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
					case 1:
						{
						setState(1547);
						match(K_AS);
						}
						break;
					}
					setState(1550);
					table_alias();
					}
					break;
				}
				setState(1558);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1553);
					match(K_INDEXED);
					setState(1554);
					match(K_BY);
					setState(1555);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1556);
					match(K_NOT);
					setState(1557);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case K_ALTER:
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
				case K_ON:
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
				setState(1560);
				match(OPEN_PAR);
				setState(1570);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1561);
					table_or_subquery();
					setState(1566);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1562);
						match(COMMA);
						setState(1563);
						table_or_subquery();
						}
						}
						setState(1568);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1569);
					join_clause();
					}
					break;
				}
				setState(1572);
				match(CLOSE_PAR);
				setState(1577);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1574);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
					case 1:
						{
						setState(1573);
						match(K_AS);
						}
						break;
					}
					setState(1576);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1579);
				match(OPEN_PAR);
				setState(1580);
				select_stmt();
				setState(1581);
				match(CLOSE_PAR);
				setState(1586);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1583);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
					case 1:
						{
						setState(1582);
						match(K_AS);
						}
						break;
					}
					setState(1585);
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
		enterRule(_localctx, 114, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			table_or_subquery();
			setState(1597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INNER - 89)) | (1L << (K_JOIN - 89)) | (1L << (K_LEFT - 89)) | (1L << (K_NATURAL - 89)))) != 0)) {
				{
				{
				setState(1591);
				join_operator();
				setState(1592);
				table_or_subquery();
				setState(1593);
				join_constraint();
				}
				}
				setState(1599);
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
		enterRule(_localctx, 116, RULE_join_operator);
		int _la;
		try {
			setState(1613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1600);
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
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1601);
					match(K_NATURAL);
					}
				}

				setState(1610);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1604);
					match(K_LEFT);
					setState(1606);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1605);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1608);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1609);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1612);
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
		enterRule(_localctx, 118, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1615);
				match(K_ON);
				setState(1616);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1617);
				match(K_USING);
				setState(1618);
				match(OPEN_PAR);
				setState(1619);
				column_name();
				setState(1624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1620);
					match(COMMA);
					setState(1621);
					column_name();
					}
					}
					setState(1626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1627);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case CLOSE_PAR:
			case COMMA:
			case K_ALTER:
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
		enterRule(_localctx, 120, RULE_select_core);
		int _la;
		try {
			setState(1705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1631);
				match(K_SELECT);
				setState(1633);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1632);
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
				setState(1635);
				result_column();
				setState(1640);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1636);
					match(COMMA);
					setState(1637);
					result_column();
					}
					}
					setState(1642);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1643);
					match(K_FROM);
					setState(1653);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
					case 1:
						{
						setState(1644);
						table_or_subquery();
						setState(1649);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1645);
							match(COMMA);
							setState(1646);
							table_or_subquery();
							}
							}
							setState(1651);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1652);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1657);
					match(K_WHERE);
					setState(1658);
					expr(0);
					}
				}

				setState(1675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1661);
					match(K_GROUP);
					setState(1662);
					match(K_BY);
					setState(1663);
					expr(0);
					setState(1668);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1664);
						match(COMMA);
						setState(1665);
						expr(0);
						}
						}
						setState(1670);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1673);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1671);
						match(K_HAVING);
						setState(1672);
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
				setState(1677);
				match(K_VALUES);
				setState(1678);
				match(OPEN_PAR);
				setState(1679);
				expr(0);
				setState(1684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1680);
					match(COMMA);
					setState(1681);
					expr(0);
					}
					}
					setState(1686);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1687);
				match(CLOSE_PAR);
				setState(1702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1688);
					match(COMMA);
					setState(1689);
					match(OPEN_PAR);
					setState(1690);
					expr(0);
					setState(1695);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1691);
						match(COMMA);
						setState(1692);
						expr(0);
						}
						}
						setState(1697);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1698);
					match(CLOSE_PAR);
					}
					}
					setState(1704);
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
		enterRule(_localctx, 122, RULE_compound_operator);
		try {
			setState(1712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1707);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1708);
				match(K_UNION);
				setState(1709);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1710);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1711);
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
		enterRule(_localctx, 124, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			table_name();
			setState(1726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1715);
				match(OPEN_PAR);
				setState(1716);
				column_name();
				setState(1721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1717);
					match(COMMA);
					setState(1718);
					column_name();
					}
					}
					setState(1723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1724);
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
		enterRule(_localctx, 126, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1728);
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

			setState(1731);
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
		enterRule(_localctx, 128, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (K_NULL - 106)) | (1L << (NUMERIC_LITERAL - 106)) | (1L << (STRING_LITERAL - 106)) | (1L << (BLOB_LITERAL - 106)))) != 0)) ) {
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
		enterRule(_localctx, 130, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735);
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
		enterRule(_localctx, 132, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
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
		enterRule(_localctx, 134, RULE_module_argument);
		try {
			setState(1741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1739);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1740);
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
		enterRule(_localctx, 136, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
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
		enterRule(_localctx, 138, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (K_ABORT - 25)) | (1L << (K_ACTION - 25)) | (1L << (K_ADD - 25)) | (1L << (K_AFTER - 25)) | (1L << (K_ALL - 25)) | (1L << (K_ALTER - 25)) | (1L << (K_ANALYZE - 25)) | (1L << (K_AND - 25)) | (1L << (K_AS - 25)) | (1L << (K_ASC - 25)) | (1L << (K_ATTACH - 25)) | (1L << (K_AUTOINCREMENT - 25)) | (1L << (K_BEFORE - 25)) | (1L << (K_BEGIN - 25)) | (1L << (K_BETWEEN - 25)) | (1L << (K_BY - 25)) | (1L << (K_CASCADE - 25)) | (1L << (K_CASE - 25)) | (1L << (K_CAST - 25)) | (1L << (K_CHECK - 25)) | (1L << (K_COLLATE - 25)) | (1L << (K_COLUMN - 25)) | (1L << (K_COMMIT - 25)) | (1L << (K_CONFLICT - 25)) | (1L << (K_CONSTRAINT - 25)) | (1L << (K_CREATE - 25)) | (1L << (K_CROSS - 25)) | (1L << (K_CURRENT_DATE - 25)) | (1L << (K_CURRENT_TIME - 25)) | (1L << (K_CURRENT_TIMESTAMP - 25)) | (1L << (K_DATABASE - 25)) | (1L << (K_DEFAULT - 25)) | (1L << (K_DEFERRABLE - 25)) | (1L << (K_DEFERRED - 25)) | (1L << (K_DELETE - 25)) | (1L << (K_DESC - 25)) | (1L << (K_DETACH - 25)) | (1L << (K_DISTINCT - 25)) | (1L << (K_DROP - 25)) | (1L << (K_EACH - 25)) | (1L << (K_ELSE - 25)) | (1L << (K_END - 25)) | (1L << (K_ESCAPE - 25)) | (1L << (K_EXCEPT - 25)) | (1L << (K_EXCLUSIVE - 25)) | (1L << (K_EXISTS - 25)) | (1L << (K_EXPLAIN - 25)) | (1L << (K_FAIL - 25)) | (1L << (K_FOR - 25)) | (1L << (K_FOREIGN - 25)) | (1L << (K_FROM - 25)) | (1L << (K_FULL - 25)) | (1L << (K_GLOB - 25)) | (1L << (K_GROUP - 25)) | (1L << (K_HAVING - 25)) | (1L << (K_IF - 25)) | (1L << (K_IGNORE - 25)) | (1L << (K_IMMEDIATE - 25)) | (1L << (K_IN - 25)) | (1L << (K_INDEX - 25)) | (1L << (K_INDEXED - 25)) | (1L << (K_INITIALLY - 25)))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INNER - 89)) | (1L << (K_INSERT - 89)) | (1L << (K_INSTEAD - 89)) | (1L << (K_INTERSECT - 89)) | (1L << (K_INTO - 89)) | (1L << (K_IS - 89)) | (1L << (K_ISNULL - 89)) | (1L << (K_JOIN - 89)) | (1L << (K_KEY - 89)) | (1L << (K_LEFT - 89)) | (1L << (K_LIKE - 89)) | (1L << (K_LIMIT - 89)) | (1L << (K_MATCH - 89)) | (1L << (K_NATURAL - 89)) | (1L << (K_NO - 89)) | (1L << (K_NOT - 89)) | (1L << (K_NOTNULL - 89)) | (1L << (K_NULL - 89)) | (1L << (K_OF - 89)) | (1L << (K_OFFSET - 89)) | (1L << (K_ON - 89)) | (1L << (K_OR - 89)) | (1L << (K_ORDER - 89)) | (1L << (K_OUTER - 89)) | (1L << (K_PLAN - 89)) | (1L << (K_PRAGMA - 89)) | (1L << (K_PRIMARY - 89)) | (1L << (K_QUERY - 89)) | (1L << (K_RAISE - 89)) | (1L << (K_RECURSIVE - 89)) | (1L << (K_REFERENCES - 89)) | (1L << (K_REGEXP - 89)) | (1L << (K_REINDEX - 89)) | (1L << (K_RELEASE - 89)) | (1L << (K_RENAME - 89)) | (1L << (K_REPLACE - 89)) | (1L << (K_RESTRICT - 89)) | (1L << (K_RIGHT - 89)) | (1L << (K_ROLLBACK - 89)) | (1L << (K_ROW - 89)) | (1L << (K_SAVEPOINT - 89)) | (1L << (K_SELECT - 89)) | (1L << (K_SET - 89)) | (1L << (K_TABLE - 89)) | (1L << (K_TEMP - 89)) | (1L << (K_TEMPORARY - 89)) | (1L << (K_THEN - 89)) | (1L << (K_TO - 89)) | (1L << (K_TRANSACTION - 89)) | (1L << (K_TRIGGER - 89)) | (1L << (K_UNION - 89)) | (1L << (K_UNIQUE - 89)) | (1L << (K_UPDATE - 89)) | (1L << (K_USING - 89)) | (1L << (K_VACUUM - 89)) | (1L << (K_VALUES - 89)) | (1L << (K_VIEW - 89)) | (1L << (K_VIRTUAL - 89)) | (1L << (K_WHEN - 89)) | (1L << (K_WHERE - 89)) | (1L << (K_WITH - 89)) | (1L << (K_WITHOUT - 89)))) != 0)) ) {
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
		enterRule(_localctx, 140, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
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
		enterRule(_localctx, 142, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
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
		enterRule(_localctx, 144, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
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
		enterRule(_localctx, 146, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1753);
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
		enterRule(_localctx, 148, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1755);
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
		enterRule(_localctx, 150, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757);
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
		enterRule(_localctx, 152, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1759);
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
		enterRule(_localctx, 154, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1761);
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
		enterRule(_localctx, 156, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
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
		enterRule(_localctx, 158, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1765);
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
		enterRule(_localctx, 160, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1767);
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
		enterRule(_localctx, 162, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1769);
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
		enterRule(_localctx, 164, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1771);
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
		enterRule(_localctx, 166, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1773);
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
		enterRule(_localctx, 168, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1775);
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
		enterRule(_localctx, 170, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
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
		enterRule(_localctx, 172, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
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
		enterRule(_localctx, 174, RULE_any_name);
		try {
			setState(1788);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1781);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
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
			case K_ON:
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
			case K_SET:
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
				setState(1782);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1783);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1784);
				match(OPEN_PAR);
				setState(1785);
				any_name();
				setState(1786);
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
		case 45:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a1\u0701\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\7\2\u00b5\n\2\f\2\16\2\u00b8\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u00c0\n\4\f\4\16\4\u00c3\13\4\3\4\3\4\6"+
		"\4\u00c7\n\4\r\4\16\4\u00c8\3\4\7\4\u00cc\n\4\f\4\16\4\u00cf\13\4\3\4"+
		"\7\4\u00d2\n\4\f\4\16\4\u00d5\13\4\3\5\3\5\3\5\5\5\u00da\n\5\5\5\u00dc"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00fc\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u0103\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u010b\n\6"+
		"\3\6\5\6\u010e\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0117\n\7\3\b\3\b\5"+
		"\b\u011b\n\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u0123\n\t\3\t\3\t\5\t\u0127\n"+
		"\t\5\t\u0129\n\t\3\n\3\n\3\n\5\n\u012e\n\n\5\n\u0130\n\n\3\13\3\13\5\13"+
		"\u0134\n\13\3\13\3\13\3\13\7\13\u0139\n\13\f\13\16\13\u013c\13\13\5\13"+
		"\u013e\n\13\3\13\3\13\3\13\5\13\u0143\n\13\3\13\3\13\5\13\u0147\n\13\3"+
		"\13\6\13\u014a\n\13\r\13\16\13\u014b\3\13\3\13\3\13\3\13\3\13\7\13\u0153"+
		"\n\13\f\13\16\13\u0156\13\13\5\13\u0158\n\13\3\13\3\13\3\13\3\13\5\13"+
		"\u015e\n\13\5\13\u0160\n\13\3\f\3\f\5\f\u0164\n\f\3\f\3\f\3\f\3\f\5\f"+
		"\u016a\n\f\3\f\3\f\3\f\5\f\u016f\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0178"+
		"\n\f\f\f\16\f\u017b\13\f\3\f\3\f\3\f\5\f\u0180\n\f\3\r\3\r\5\r\u0184\n"+
		"\r\3\r\3\r\3\r\3\r\5\r\u018a\n\r\3\r\3\r\3\r\5\r\u018f\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u0196\n\r\f\r\16\r\u0199\13\r\3\r\3\r\7\r\u019d\n\r\f\r\16"+
		"\r\u01a0\13\r\3\r\3\r\3\r\5\r\u01a5\n\r\3\r\3\r\5\r\u01a9\n\r\3\r\5\r"+
		"\u01ac\n\r\3\16\3\16\5\16\u01b0\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u01b9\n\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u01c1\n\20\f\20\16"+
		"\20\u01c4\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\7\22\u01d3\n\22\f\22\16\22\u01d6\13\22\3\23\3\23\3\24\3\24"+
		"\5\24\u01dc\n\24\3\24\3\24\3\24\3\24\5\24\u01e2\n\24\3\24\3\24\3\24\5"+
		"\24\u01e7\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u01ee\n\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u01f7\n\24\f\24\16\24\u01fa\13\24\5\24\u01fc"+
		"\n\24\5\24\u01fe\n\24\3\24\3\24\3\24\3\24\5\24\u0204\n\24\3\24\3\24\3"+
		"\24\3\24\5\24\u020a\n\24\3\24\3\24\5\24\u020e\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0215\n\24\3\24\3\24\6\24\u0219\n\24\r\24\16\24\u021a\3\24"+
		"\3\24\3\25\3\25\5\25\u0221\n\25\3\25\3\25\3\25\3\25\5\25\u0227\n\25\3"+
		"\25\3\25\3\25\5\25\u022c\n\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0238\n\26\3\26\3\26\3\26\5\26\u023d\n\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\7\26\u0246\n\26\f\26\16\26\u0249\13\26\3\26\3"+
		"\26\5\26\u024d\n\26\3\27\5\27\u0250\n\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0257\n\27\3\30\5\30\u025a\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u0261\n"+
		"\30\3\30\3\30\3\30\3\30\3\30\7\30\u0268\n\30\f\30\16\30\u026b\13\30\5"+
		"\30\u026d\n\30\3\30\3\30\3\30\3\30\5\30\u0273\n\30\5\30\u0275\n\30\3\31"+
		"\3\31\5\31\u0279\n\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0281\n\32\3"+
		"\32\3\32\3\32\5\32\u0286\n\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u028e"+
		"\n\33\3\33\3\33\3\33\5\33\u0293\n\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34"+
		"\u029b\n\34\3\34\3\34\3\34\5\34\u02a0\n\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\35\5\35\u02a8\n\35\3\35\3\35\3\35\5\35\u02ad\n\35\3\35\3\35\3\36\3\36"+
		"\5\36\u02b3\n\36\3\36\3\36\3\36\7\36\u02b8\n\36\f\36\16\36\u02bb\13\36"+
		"\5\36\u02bd\n\36\3\36\3\36\3\36\3\36\7\36\u02c3\n\36\f\36\16\36\u02c6"+
		"\13\36\3\36\3\36\3\36\3\36\3\36\7\36\u02cd\n\36\f\36\16\36\u02d0\13\36"+
		"\5\36\u02d2\n\36\3\36\3\36\3\36\3\36\5\36\u02d8\n\36\5\36\u02da\n\36\3"+
		"\37\5\37\u02dd\n\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u02f0\n\37\3\37\3\37\3\37\3\37"+
		"\5\37\u02f6\n\37\3\37\3\37\3\37\3\37\3\37\7\37\u02fd\n\37\f\37\16\37\u0300"+
		"\13\37\3\37\3\37\5\37\u0304\n\37\3\37\3\37\3\37\3\37\3\37\7\37\u030b\n"+
		"\37\f\37\16\37\u030e\13\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0316\n"+
		"\37\f\37\16\37\u0319\13\37\3\37\3\37\7\37\u031d\n\37\f\37\16\37\u0320"+
		"\13\37\3\37\3\37\3\37\5\37\u0325\n\37\3 \3 \3 \3 \5 \u032b\n \3 \3 \3"+
		" \3 \3 \3 \3 \5 \u0334\n \3!\3!\3!\3!\3!\5!\u033b\n!\3!\3!\5!\u033f\n"+
		"!\5!\u0341\n!\3\"\3\"\5\"\u0345\n\"\3\"\3\"\3#\3#\3#\5#\u034c\n#\5#\u034e"+
		"\n#\3#\3#\5#\u0352\n#\3#\5#\u0355\n#\3$\3$\3$\3%\3%\5%\u035c\n%\3%\3%"+
		"\3%\7%\u0361\n%\f%\16%\u0364\13%\5%\u0366\n%\3%\3%\3%\3%\3%\3%\7%\u036e"+
		"\n%\f%\16%\u0371\13%\5%\u0373\n%\3%\3%\3%\3%\5%\u0379\n%\5%\u037b\n%\3"+
		"&\3&\5&\u037f\n&\3&\3&\3&\7&\u0384\n&\f&\16&\u0387\13&\5&\u0389\n&\3&"+
		"\3&\3&\3&\7&\u038f\n&\f&\16&\u0392\13&\3&\3&\3&\3&\3&\7&\u0399\n&\f&\16"+
		"&\u039c\13&\5&\u039e\n&\3&\3&\3&\3&\5&\u03a4\n&\5&\u03a6\n&\3\'\3\'\5"+
		"\'\u03aa\n\'\3\'\3\'\3\'\7\'\u03af\n\'\f\'\16\'\u03b2\13\'\3\'\3\'\3\'"+
		"\3\'\7\'\u03b8\n\'\f\'\16\'\u03bb\13\'\3\'\5\'\u03be\n\'\5\'\u03c0\n\'"+
		"\3\'\3\'\5\'\u03c4\n\'\3\'\3\'\3\'\3\'\3\'\7\'\u03cb\n\'\f\'\16\'\u03ce"+
		"\13\'\3\'\3\'\5\'\u03d2\n\'\5\'\u03d4\n\'\3\'\3\'\3\'\3\'\3\'\7\'\u03db"+
		"\n\'\f\'\16\'\u03de\13\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u03e6\n\'\f\'\16"+
		"\'\u03e9\13\'\3\'\3\'\7\'\u03ed\n\'\f\'\16\'\u03f0\13\'\5\'\u03f2\n\'"+
		"\3(\5(\u03f5\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0402\n(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\7(\u040e\n(\f(\16(\u0411\13(\3(\3(\5(\u0415\n(\3"+
		")\5)\u0418\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0425\n)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\7)\u0431\n)\f)\16)\u0434\13)\3)\3)\5)\u0438\n)\3)"+
		"\3)\3)\3)\3)\7)\u043f\n)\f)\16)\u0442\13)\5)\u0444\n)\3)\3)\3)\3)\5)\u044a"+
		"\n)\5)\u044c\n)\3*\3*\3+\3+\5+\u0452\n+\3+\7+\u0455\n+\f+\16+\u0458\13"+
		"+\3,\6,\u045b\n,\r,\16,\u045c\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0469\n"+
		",\3-\3-\5-\u046d\n-\3-\3-\3-\5-\u0472\n-\3-\3-\5-\u0476\n-\3-\5-\u0479"+
		"\n-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u048b\n-\3-\3-"+
		"\3-\5-\u0490\n-\3.\3.\3.\5.\u0495\n.\3/\3/\3/\3/\3/\3/\5/\u049d\n/\3/"+
		"\3/\3/\5/\u04a2\n/\3/\3/\3/\3/\3/\3/\3/\5/\u04ab\n/\3/\3/\3/\7/\u04b0"+
		"\n/\f/\16/\u04b3\13/\3/\5/\u04b6\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\5/\u04c6\n/\3/\5/\u04c9\n/\3/\3/\3/\3/\3/\3/\5/\u04d1\n/\3/\3"+
		"/\3/\3/\3/\6/\u04d8\n/\r/\16/\u04d9\3/\3/\5/\u04de\n/\3/\3/\3/\5/\u04e3"+
		"\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\5/\u0501\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u050d"+
		"\n/\3/\3/\3/\5/\u0512\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u051e\n/\3/"+
		"\3/\3/\3/\5/\u0524\n/\3/\3/\3/\3/\3/\5/\u052b\n/\3/\3/\5/\u052f\n/\3/"+
		"\3/\3/\3/\3/\3/\7/\u0537\n/\f/\16/\u053a\13/\5/\u053c\n/\3/\3/\3/\3/\5"+
		"/\u0542\n/\3/\5/\u0545\n/\7/\u0547\n/\f/\16/\u054a\13/\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\7\60\u0552\n\60\f\60\16\60\u0555\13\60\3\60\3\60\5\60"+
		"\u0559\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0565"+
		"\n\60\3\60\3\60\5\60\u0569\n\60\7\60\u056b\n\60\f\60\16\60\u056e\13\60"+
		"\3\60\5\60\u0571\n\60\3\60\3\60\3\60\3\60\3\60\5\60\u0578\n\60\5\60\u057a"+
		"\n\60\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0582\n\61\3\61\3\61\3\62\3\62"+
		"\3\62\5\62\u0589\n\62\3\62\5\62\u058c\n\62\3\63\3\63\5\63\u0590\n\63\3"+
		"\63\3\63\3\63\5\63\u0595\n\63\3\63\3\63\3\63\3\63\7\63\u059b\n\63\f\63"+
		"\16\63\u059e\13\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\7\63\u05ae\n\63\f\63\16\63\u05b1\13\63\3\63\3\63\3"+
		"\63\5\63\u05b6\n\63\3\64\3\64\5\64\u05ba\n\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u05c8\n\64\f\64\16\64\u05cb\13"+
		"\64\3\65\3\65\3\65\5\65\u05d0\n\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u05d8\n\65\3\66\3\66\3\66\5\66\u05dd\n\66\3\66\5\66\u05e0\n\66\3\67\3"+
		"\67\3\67\5\67\u05e5\n\67\38\38\38\38\38\78\u05ec\n8\f8\168\u05ef\138\3"+
		"8\38\58\u05f3\n8\38\38\38\38\38\39\39\39\39\39\39\39\59\u0601\n9\39\5"+
		"9\u0604\n9\59\u0606\n9\3:\3:\3:\5:\u060b\n:\3:\3:\5:\u060f\n:\3:\5:\u0612"+
		"\n:\3:\3:\3:\3:\3:\5:\u0619\n:\3:\3:\3:\3:\7:\u061f\n:\f:\16:\u0622\13"+
		":\3:\5:\u0625\n:\3:\3:\5:\u0629\n:\3:\5:\u062c\n:\3:\3:\3:\3:\5:\u0632"+
		"\n:\3:\5:\u0635\n:\5:\u0637\n:\3;\3;\3;\3;\3;\7;\u063e\n;\f;\16;\u0641"+
		"\13;\3<\3<\5<\u0645\n<\3<\3<\5<\u0649\n<\3<\3<\5<\u064d\n<\3<\5<\u0650"+
		"\n<\3=\3=\3=\3=\3=\3=\3=\7=\u0659\n=\f=\16=\u065c\13=\3=\3=\5=\u0660\n"+
		"=\3>\3>\5>\u0664\n>\3>\3>\3>\7>\u0669\n>\f>\16>\u066c\13>\3>\3>\3>\3>"+
		"\7>\u0672\n>\f>\16>\u0675\13>\3>\5>\u0678\n>\5>\u067a\n>\3>\3>\5>\u067e"+
		"\n>\3>\3>\3>\3>\3>\7>\u0685\n>\f>\16>\u0688\13>\3>\3>\5>\u068c\n>\5>\u068e"+
		"\n>\3>\3>\3>\3>\3>\7>\u0695\n>\f>\16>\u0698\13>\3>\3>\3>\3>\3>\3>\7>\u06a0"+
		"\n>\f>\16>\u06a3\13>\3>\3>\7>\u06a7\n>\f>\16>\u06aa\13>\5>\u06ac\n>\3"+
		"?\3?\3?\3?\3?\5?\u06b3\n?\3@\3@\3@\3@\3@\7@\u06ba\n@\f@\16@\u06bd\13@"+
		"\3@\3@\5@\u06c1\n@\3A\5A\u06c4\nA\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\5E\u06d0"+
		"\nE\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P"+
		"\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\5Y\u06ff\nY\3Y\2\3\\Z\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\2\25\5\2>>IIVV"+
		"\4\2\61\61FF\4\2\7\7nn\3\2\u0087\u0088\4\2\u009a\u009a\u009c\u009c\4\2"+
		"\37\37BB\4\2$$@@\7\2\33\33LLUU~~\u0081\u0081\4\2\t\t\16\17\3\2\n\13\3"+
		"\2\20\23\3\2\24\27\6\2QQeeggzz\4\2??\u008f\u008f\5\2\33\33LL\u0081\u0081"+
		"\6\28:ll\u009a\u009a\u009c\u009d\4\2\n\fjj\4\2\u0099\u0099\u009c\u009c"+
		"\4\2\33\64\67\u0098\2\u080d\2\u00b6\3\2\2\2\4\u00bb\3\2\2\2\6\u00c1\3"+
		"\2\2\2\b\u00db\3\2\2\2\n\u00fd\3\2\2\2\f\u010f\3\2\2\2\16\u0118\3\2\2"+
		"\2\20\u0120\3\2\2\2\22\u012a\3\2\2\2\24\u013d\3\2\2\2\26\u0161\3\2\2\2"+
		"\30\u0181\3\2\2\2\32\u01af\3\2\2\2\34\u01b1\3\2\2\2\36\u01bc\3\2\2\2 "+
		"\u01c7\3\2\2\2\"\u01cf\3\2\2\2$\u01d7\3\2\2\2&\u01d9\3\2\2\2(\u021e\3"+
		"\2\2\2*\u0231\3\2\2\2,\u024f\3\2\2\2.\u0259\3\2\2\2\60\u0276\3\2\2\2\62"+
		"\u027c\3\2\2\2\64\u0289\3\2\2\2\66\u0296\3\2\2\28\u02a3\3\2\2\2:\u02bc"+
		"\3\2\2\2<\u02dc\3\2\2\2>\u0326\3\2\2\2@\u0335\3\2\2\2B\u0342\3\2\2\2D"+
		"\u0348\3\2\2\2F\u0356\3\2\2\2H\u0365\3\2\2\2J\u0388\3\2\2\2L\u03f1\3\2"+
		"\2\2N\u03f4\3\2\2\2P\u0417\3\2\2\2R\u044d\3\2\2\2T\u044f\3\2\2\2V\u045a"+
		"\3\2\2\2X\u046c\3\2\2\2Z\u0494\3\2\2\2\\\u04e2\3\2\2\2^\u054b\3\2\2\2"+
		"`\u057b\3\2\2\2b\u0585\3\2\2\2d\u058f\3\2\2\2f\u05b7\3\2\2\2h\u05cf\3"+
		"\2\2\2j\u05d9\3\2\2\2l\u05e4\3\2\2\2n\u05e6\3\2\2\2p\u0605\3\2\2\2r\u0636"+
		"\3\2\2\2t\u0638\3\2\2\2v\u064f\3\2\2\2x\u065f\3\2\2\2z\u06ab\3\2\2\2|"+
		"\u06b2\3\2\2\2~\u06b4\3\2\2\2\u0080\u06c3\3\2\2\2\u0082\u06c7\3\2\2\2"+
		"\u0084\u06c9\3\2\2\2\u0086\u06cb\3\2\2\2\u0088\u06cf\3\2\2\2\u008a\u06d1"+
		"\3\2\2\2\u008c\u06d3\3\2\2\2\u008e\u06d5\3\2\2\2\u0090\u06d7\3\2\2\2\u0092"+
		"\u06d9\3\2\2\2\u0094\u06db\3\2\2\2\u0096\u06dd\3\2\2\2\u0098\u06df\3\2"+
		"\2\2\u009a\u06e1\3\2\2\2\u009c\u06e3\3\2\2\2\u009e\u06e5\3\2\2\2\u00a0"+
		"\u06e7\3\2\2\2\u00a2\u06e9\3\2\2\2\u00a4\u06eb\3\2\2\2\u00a6\u06ed\3\2"+
		"\2\2\u00a8\u06ef\3\2\2\2\u00aa\u06f1\3\2\2\2\u00ac\u06f3\3\2\2\2\u00ae"+
		"\u06f5\3\2\2\2\u00b0\u06fe\3\2\2\2\u00b2\u00b5\5\6\4\2\u00b3\u00b5\5\4"+
		"\3\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\u00ba\7\2\2\3\u00ba\3\3\2\2\2\u00bb\u00bc\7\u00a1\2\2\u00bc"+
		"\u00bd\b\3\1\2\u00bd\5\3\2\2\2\u00be\u00c0\7\3\2\2\u00bf\u00be\3\2\2\2"+
		"\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4"+
		"\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00cd\5\b\5\2\u00c5\u00c7\7\3\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\5\b\5\2\u00cb\u00c6\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d3\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\7\3\2\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\7\3\2\2\2"+
		"\u00d5\u00d3\3\2\2\2\u00d6\u00d9\7K\2\2\u00d7\u00d8\7v\2\2\u00d8\u00da"+
		"\7s\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db"+
		"\u00d6\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00fb\3\2\2\2\u00dd\u00fc\5\n"+
		"\6\2\u00de\u00fc\5\f\7\2\u00df\u00fc\5\16\b\2\u00e0\u00fc\5\20\t\2\u00e1"+
		"\u00fc\5\22\n\2\u00e2\u00fc\5\24\13\2\u00e3\u00fc\5\26\f\2\u00e4\u00fc"+
		"\5\30\r\2\u00e5\u00fc\5&\24\2\u00e6\u00fc\5(\25\2\u00e7\u00fc\5*\26\2"+
		"\u00e8\u00fc\5,\27\2\u00e9\u00fc\5.\30\2\u00ea\u00fc\5\60\31\2\u00eb\u00fc"+
		"\5\62\32\2\u00ec\u00fc\5\64\33\2\u00ed\u00fc\5\66\34\2\u00ee\u00fc\58"+
		"\35\2\u00ef\u00fc\5:\36\2\u00f0\u00fc\5<\37\2\u00f1\u00fc\5> \2\u00f2"+
		"\u00fc\5@!\2\u00f3\u00fc\5B\"\2\u00f4\u00fc\5D#\2\u00f5\u00fc\5F$\2\u00f6"+
		"\u00fc\5H%\2\u00f7\u00fc\5J&\2\u00f8\u00fc\5N(\2\u00f9\u00fc\5P)\2\u00fa"+
		"\u00fc\5R*\2\u00fb\u00dd\3\2\2\2\u00fb\u00de\3\2\2\2\u00fb\u00df\3\2\2"+
		"\2\u00fb\u00e0\3\2\2\2\u00fb\u00e1\3\2\2\2\u00fb\u00e2\3\2\2\2\u00fb\u00e3"+
		"\3\2\2\2\u00fb\u00e4\3\2\2\2\u00fb\u00e5\3\2\2\2\u00fb\u00e6\3\2\2\2\u00fb"+
		"\u00e7\3\2\2\2\u00fb\u00e8\3\2\2\2\u00fb\u00e9\3\2\2\2\u00fb\u00ea\3\2"+
		"\2\2\u00fb\u00eb\3\2\2\2\u00fb\u00ec\3\2\2\2\u00fb\u00ed\3\2\2\2\u00fb"+
		"\u00ee\3\2\2\2\u00fb\u00ef\3\2\2\2\u00fb\u00f0\3\2\2\2\u00fb\u00f1\3\2"+
		"\2\2\u00fb\u00f2\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fb\u00f4\3\2\2\2\u00fb"+
		"\u00f5\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00f7\3\2\2\2\u00fb\u00f8\3\2"+
		"\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\t\3\2\2\2\u00fd\u00fe"+
		"\7 \2\2\u00fe\u0102\7\u0086\2\2\u00ff\u0100\5\u0092J\2\u0100\u0101\7\4"+
		"\2\2\u0101\u0103\3\2\2\2\u0102\u00ff\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u010d\5\u0094K\2\u0105\u0106\7}\2\2\u0106\u0107\7"+
		"\u008a\2\2\u0107\u010e\5\u0098M\2\u0108\u010a\7\35\2\2\u0109\u010b\7\60"+
		"\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010e\5T+\2\u010d\u0105\3\2\2\2\u010d\u0108\3\2\2\2\u010e\13\3\2\2\2"+
		"\u010f\u0116\7!\2\2\u0110\u0117\5\u0092J\2\u0111\u0117\5\u0096L\2\u0112"+
		"\u0113\5\u0092J\2\u0113\u0114\7\4\2\2\u0114\u0115\5\u0096L\2\u0115\u0117"+
		"\3\2\2\2\u0116\u0110\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0112\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\r\3\2\2\2\u0118\u011a\7%\2\2\u0119\u011b\7;\2\2\u011a"+
		"\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\5\\"+
		"/\2\u011d\u011e\7#\2\2\u011e\u011f\5\u0092J\2\u011f\17\3\2\2\2\u0120\u0122"+
		"\7(\2\2\u0121\u0123\t\2\2\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0128\3\2\2\2\u0124\u0126\7\u008b\2\2\u0125\u0127\5\u00aeX\2\u0126\u0125"+
		"\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0124\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\21\3\2\2\2\u012a\u012f\t\3\2\2\u012b\u012d\7\u008b"+
		"\2\2\u012c\u012e\5\u00aeX\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u0130\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u0130\3\2\2\2\u0130\23\3\2\2"+
		"\2\u0131\u0133\7\u0097\2\2\u0132\u0134\7x\2\2\u0133\u0132\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u013a\5n8\2\u0136\u0137\7\7\2"+
		"\2\u0137\u0139\5n8\2\u0138\u0136\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013d"+
		"\u0131\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0149\5z"+
		">\2\u0140\u0142\7\u008d\2\2\u0141\u0143\7\37\2\2\u0142\u0141\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0147\3\2\2\2\u0144\u0147\7^\2\2\u0145\u0147\7H\2"+
		"\2\u0146\u0140\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u014a\5z>\2\u0149\u0146\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0157\3\2\2\2\u014d\u014e\7q"+
		"\2\2\u014e\u014f\7*\2\2\u014f\u0154\5j\66\2\u0150\u0151\7\7\2\2\u0151"+
		"\u0153\5j\66\2\u0152\u0150\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0157"+
		"\u014d\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015f\3\2\2\2\u0159\u015a\7f"+
		"\2\2\u015a\u015d\5\\/\2\u015b\u015c\t\4\2\2\u015c\u015e\5\\/\2\u015d\u015b"+
		"\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\3\2\2\2\u015f\u0159\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\25\3\2\2\2\u0161\u0163\7\64\2\2\u0162\u0164\7\u008e"+
		"\2\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0169\7X\2\2\u0166\u0167\7T\2\2\u0167\u0168\7j\2\2\u0168\u016a\7J\2\2"+
		"\u0169\u0166\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016e\3\2\2\2\u016b\u016c"+
		"\5\u0092J\2\u016c\u016d\7\4\2\2\u016d\u016f\3\2\2\2\u016e\u016b\3\2\2"+
		"\2\u016e\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\5\u00a0Q\2\u0171"+
		"\u0172\7o\2\2\u0172\u0173\5\u0094K\2\u0173\u0174\7\5\2\2\u0174\u0179\5"+
		"b\62\2\u0175\u0176\7\7\2\2\u0176\u0178\5b\62\2\u0177\u0175\3\2\2\2\u0178"+
		"\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2"+
		"\2\2\u017b\u0179\3\2\2\2\u017c\u017f\7\6\2\2\u017d\u017e\7\u0096\2\2\u017e"+
		"\u0180\5\\/\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\27\3\2\2\2"+
		"\u0181\u0183\7\64\2\2\u0182\u0184\t\5\2\2\u0183\u0182\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0189\7\u0086\2\2\u0186\u0187\7T\2"+
		"\2\u0187\u0188\7j\2\2\u0188\u018a\7J\2\2\u0189\u0186\3\2\2\2\u0189\u018a"+
		"\3\2\2\2\u018a\u018e\3\2\2\2\u018b\u018c\5\u0092J\2\u018c\u018d\7\4\2"+
		"\2\u018d\u018f\3\2\2\2\u018e\u018b\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u01a8\5\u0094K\2\u0191\u0192\7\5\2\2\u0192\u0197\5T+\2"+
		"\u0193\u0194\7\7\2\2\u0194\u0196\5T+\2\u0195\u0193\3\2\2\2\u0196\u0199"+
		"\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019e\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u019a\u019b\7\7\2\2\u019b\u019d\5d\63\2\u019c\u019a\3\2"+
		"\2\2\u019d\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a4\7\6\2\2\u01a2\u01a3\7\u0098"+
		"\2\2\u01a3\u01a5\7\u0099\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a9\3\2\2\2\u01a6\u01a7\7#\2\2\u01a7\u01a9\5J&\2\u01a8\u0191\3\2\2"+
		"\2\u01a8\u01a6\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01ac\5\32\16\2\u01ab"+
		"\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\31\3\2\2\2\u01ad\u01b0\5\34\17"+
		"\2\u01ae\u01b0\5 \21\2\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0\33"+
		"\3\2\2\2\u01b1\u01b2\7\65\2\2\u01b2\u01b3\7\5\2\2\u01b3\u01b4\5\36\20"+
		"\2\u01b4\u01b5\7\7\2\2\u01b5\u01b8\5\36\20\2\u01b6\u01b7\7\7\2\2\u01b7"+
		"\u01b9\5\36\20\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3"+
		"\2\2\2\u01ba\u01bb\7\6\2\2\u01bb\35\3\2\2\2\u01bc\u01bd\7\5\2\2\u01bd"+
		"\u01c2\5\u009aN\2\u01be\u01bf\7\7\2\2\u01bf\u01c1\5\u009aN\2\u01c0\u01be"+
		"\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\7\6\2\2\u01c6\37\3\2\2"+
		"\2\u01c7\u01c8\7\66\2\2\u01c8\u01c9\7\5\2\2\u01c9\u01ca\5\u009aN\2\u01ca"+
		"\u01cb\7\5\2\2\u01cb\u01cc\5\"\22\2\u01cc\u01cd\7\6\2\2\u01cd\u01ce\7"+
		"\6\2\2\u01ce!\3\2\2\2\u01cf\u01d4\5$\23\2\u01d0\u01d1\7\7\2\2\u01d1\u01d3"+
		"\5$\23\2\u01d2\u01d0\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5#\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d8\t\6\2\2"+
		"\u01d8%\3\2\2\2\u01d9\u01db\7\64\2\2\u01da\u01dc\t\5\2\2\u01db\u01da\3"+
		"\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e1\7\u008c\2\2"+
		"\u01de\u01df\7T\2\2\u01df\u01e0\7j\2\2\u01e0\u01e2\7J\2\2\u01e1\u01de"+
		"\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e6\3\2\2\2\u01e3\u01e4\5\u0092J"+
		"\2\u01e4\u01e5\7\4\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e3\3\2\2\2\u01e6\u01e7"+
		"\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ed\5\u00a2R\2\u01e9\u01ee\7\'\2"+
		"\2\u01ea\u01ee\7\36\2\2\u01eb\u01ec\7]\2\2\u01ec\u01ee\7m\2\2\u01ed\u01e9"+
		"\3\2\2\2\u01ed\u01ea\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u01fd\3\2\2\2\u01ef\u01fe\7?\2\2\u01f0\u01fe\7\\\2\2\u01f1\u01fb\7\u008f"+
		"\2\2\u01f2\u01f3\7m\2\2\u01f3\u01f8\5\u009aN\2\u01f4\u01f5\7\7\2\2\u01f5"+
		"\u01f7\5\u009aN\2\u01f6\u01f4\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6"+
		"\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb"+
		"\u01f2\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ef\3\2"+
		"\2\2\u01fd\u01f0\3\2\2\2\u01fd\u01f1\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0203\7o\2\2\u0200\u0201\5\u0092J\2\u0201\u0202\7\4\2\2\u0202\u0204\3"+
		"\2\2\2\u0203\u0200\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0209\5\u0094K\2\u0206\u0207\7M\2\2\u0207\u0208\7D\2\2\u0208\u020a\7"+
		"\u0082\2\2\u0209\u0206\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020d\3\2\2\2"+
		"\u020b\u020c\7\u0095\2\2\u020c\u020e\5\\/\2\u020d\u020b\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0218\7(\2\2\u0210\u0215\5N("+
		"\2\u0211\u0215\5<\37\2\u0212\u0215\5,\27\2\u0213\u0215\5J&\2\u0214\u0210"+
		"\3\2\2\2\u0214\u0211\3\2\2\2\u0214\u0212\3\2\2\2\u0214\u0213\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u0217\7\3\2\2\u0217\u0219\3\2\2\2\u0218\u0214\3\2"+
		"\2\2\u0219\u021a\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\u021d\7F\2\2\u021d\'\3\2\2\2\u021e\u0220\7\64\2\2"+
		"\u021f\u0221\t\5\2\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0222"+
		"\3\2\2\2\u0222\u0226\7\u0093\2\2\u0223\u0224\7T\2\2\u0224\u0225\7j\2\2"+
		"\u0225\u0227\7J\2\2\u0226\u0223\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022b"+
		"\3\2\2\2\u0228\u0229\5\u0092J\2\u0229\u022a\7\4\2\2\u022a\u022c\3\2\2"+
		"\2\u022b\u0228\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e"+
		"\5\u00a4S\2\u022e\u022f\7#\2\2\u022f\u0230\5J&\2\u0230)\3\2\2\2\u0231"+
		"\u0232\7\64\2\2\u0232\u0233\7\u0094\2\2\u0233\u0237\7\u0086\2\2\u0234"+
		"\u0235\7T\2\2\u0235\u0236\7j\2\2\u0236\u0238\7J\2\2\u0237\u0234\3\2\2"+
		"\2\u0237\u0238\3\2\2\2\u0238\u023c\3\2\2\2\u0239\u023a\5\u0092J\2\u023a"+
		"\u023b\7\4\2\2\u023b\u023d\3\2\2\2\u023c\u0239\3\2\2\2\u023c\u023d\3\2"+
		"\2\2\u023d\u023e\3\2\2\2\u023e\u023f\5\u0094K\2\u023f\u0240\7\u0090\2"+
		"\2\u0240\u024c\5\u00a6T\2\u0241\u0242\7\5\2\2\u0242\u0247\5\u0088E\2\u0243"+
		"\u0244\7\7\2\2\u0244\u0246\5\u0088E\2\u0245\u0243\3\2\2\2\u0246\u0249"+
		"\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024a\3\2\2\2\u0249"+
		"\u0247\3\2\2\2\u024a\u024b\7\6\2\2\u024b\u024d\3\2\2\2\u024c\u0241\3\2"+
		"\2\2\u024c\u024d\3\2\2\2\u024d+\3\2\2\2\u024e\u0250\5f\64\2\u024f\u024e"+
		"\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\7?\2\2\u0252"+
		"\u0253\7O\2\2\u0253\u0256\5h\65\2\u0254\u0255\7\u0096\2\2\u0255\u0257"+
		"\5\\/\2\u0256\u0254\3\2\2\2\u0256\u0257\3\2\2\2\u0257-\3\2\2\2\u0258\u025a"+
		"\5f\64\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u025c\7?\2\2\u025c\u025d\7O\2\2\u025d\u0260\5h\65\2\u025e\u025f\7\u0096"+
		"\2\2\u025f\u0261\5\\/\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261"+
		"\u0274\3\2\2\2\u0262\u0263\7q\2\2\u0263\u0264\7*\2\2\u0264\u0269\5j\66"+
		"\2\u0265\u0266\7\7\2\2\u0266\u0268\5j\66\2\u0267\u0265\3\2\2\2\u0268\u026b"+
		"\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026d\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026c\u0262\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2"+
		"\2\2\u026e\u026f\7f\2\2\u026f\u0272\5\\/\2\u0270\u0271\t\4\2\2\u0271\u0273"+
		"\5\\/\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2\2\2\u0274"+
		"\u026c\3\2\2\2\u0274\u0275\3\2\2\2\u0275/\3\2\2\2\u0276\u0278\7A\2\2\u0277"+
		"\u0279\7;\2\2\u0278\u0277\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\3\2"+
		"\2\2\u027a\u027b\5\u0092J\2\u027b\61\3\2\2\2\u027c\u027d\7C\2\2\u027d"+
		"\u0280\7X\2\2\u027e\u027f\7T\2\2\u027f\u0281\7J\2\2\u0280\u027e\3\2\2"+
		"\2\u0280\u0281\3\2\2\2\u0281\u0285\3\2\2\2\u0282\u0283\5\u0092J\2\u0283"+
		"\u0284\7\4\2\2\u0284\u0286\3\2\2\2\u0285\u0282\3\2\2\2\u0285\u0286\3\2"+
		"\2\2\u0286\u0287\3\2\2\2\u0287\u0288\5\u00a0Q\2\u0288\63\3\2\2\2\u0289"+
		"\u028a\7C\2\2\u028a\u028d\7\u0086\2\2\u028b\u028c\7T\2\2\u028c\u028e\7"+
		"J\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0292\3\2\2\2\u028f"+
		"\u0290\5\u0092J\2\u0290\u0291\7\4\2\2\u0291\u0293\3\2\2\2\u0292\u028f"+
		"\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\5\u0094K"+
		"\2\u0295\65\3\2\2\2\u0296\u0297\7C\2\2\u0297\u029a\7\u008c\2\2\u0298\u0299"+
		"\7T\2\2\u0299\u029b\7J\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b"+
		"\u029f\3\2\2\2\u029c\u029d\5\u0092J\2\u029d\u029e\7\4\2\2\u029e\u02a0"+
		"\3\2\2\2\u029f\u029c\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u02a2\5\u00a2R\2\u02a2\67\3\2\2\2\u02a3\u02a4\7C\2\2\u02a4\u02a7\7\u0093"+
		"\2\2\u02a5\u02a6\7T\2\2\u02a6\u02a8\7J\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8"+
		"\3\2\2\2\u02a8\u02ac\3\2\2\2\u02a9\u02aa\5\u0092J\2\u02aa\u02ab\7\4\2"+
		"\2\u02ab\u02ad\3\2\2\2\u02ac\u02a9\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae"+
		"\3\2\2\2\u02ae\u02af\5\u00a4S\2\u02af9\3\2\2\2\u02b0\u02b2\7\u0097\2\2"+
		"\u02b1\u02b3\7x\2\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4"+
		"\3\2\2\2\u02b4\u02b9\5n8\2\u02b5\u02b6\7\7\2\2\u02b6\u02b8\5n8\2\u02b7"+
		"\u02b5\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2"+
		"\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02b0\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c4\5z>\2\u02bf\u02c0\5|?\2"+
		"\u02c0\u02c1\5z>\2\u02c1\u02c3\3\2\2\2\u02c2\u02bf\3\2\2\2\u02c3\u02c6"+
		"\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02d1\3\2\2\2\u02c6"+
		"\u02c4\3\2\2\2\u02c7\u02c8\7q\2\2\u02c8\u02c9\7*\2\2\u02c9\u02ce\5j\66"+
		"\2\u02ca\u02cb\7\7\2\2\u02cb\u02cd\5j\66\2\u02cc\u02ca\3\2\2\2\u02cd\u02d0"+
		"\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0"+
		"\u02ce\3\2\2\2\u02d1\u02c7\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d9\3\2"+
		"\2\2\u02d3\u02d4\7f\2\2\u02d4\u02d7\5\\/\2\u02d5\u02d6\t\4\2\2\u02d6\u02d8"+
		"\5\\/\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2\2\2\u02d9"+
		"\u02d3\3\2\2\2\u02d9\u02da\3\2\2\2\u02da;\3\2\2\2\u02db\u02dd\5f\64\2"+
		"\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02ef\3\2\2\2\u02de\u02f0"+
		"\7\\\2\2\u02df\u02f0\7~\2\2\u02e0\u02e1\7\\\2\2\u02e1\u02e2\7p\2\2\u02e2"+
		"\u02f0\7~\2\2\u02e3\u02e4\7\\\2\2\u02e4\u02e5\7p\2\2\u02e5\u02f0\7\u0081"+
		"\2\2\u02e6\u02e7\7\\\2\2\u02e7\u02e8\7p\2\2\u02e8\u02f0\7\33\2\2\u02e9"+
		"\u02ea\7\\\2\2\u02ea\u02eb\7p\2\2\u02eb\u02f0\7L\2\2\u02ec\u02ed\7\\\2"+
		"\2\u02ed\u02ee\7p\2\2\u02ee\u02f0\7U\2\2\u02ef\u02de\3\2\2\2\u02ef\u02df"+
		"\3\2\2\2\u02ef\u02e0\3\2\2\2\u02ef\u02e3\3\2\2\2\u02ef\u02e6\3\2\2\2\u02ef"+
		"\u02e9\3\2\2\2\u02ef\u02ec\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f5\7_"+
		"\2\2\u02f2\u02f3\5\u0092J\2\u02f3\u02f4\7\4\2\2\u02f4\u02f6\3\2\2\2\u02f5"+
		"\u02f2\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u0303\5\u0094"+
		"K\2\u02f8\u02f9\7\5\2\2\u02f9\u02fe\5\u009aN\2\u02fa\u02fb\7\7\2\2\u02fb"+
		"\u02fd\5\u009aN\2\u02fc\u02fa\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc"+
		"\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\3\2\2\2\u0300\u02fe\3\2\2\2\u0301"+
		"\u0302\7\6\2\2\u0302\u0304\3\2\2\2\u0303\u02f8\3\2\2\2\u0303\u0304\3\2"+
		"\2\2\u0304\u0324\3\2\2\2\u0305\u0306\7\u0092\2\2\u0306\u0307\7\5\2\2\u0307"+
		"\u030c\5\\/\2\u0308\u0309\7\7\2\2\u0309\u030b\5\\/\2\u030a\u0308\3\2\2"+
		"\2\u030b\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030f"+
		"\3\2\2\2\u030e\u030c\3\2\2\2\u030f\u031e\7\6\2\2\u0310\u0311\7\7\2\2\u0311"+
		"\u0312\7\5\2\2\u0312\u0317\5\\/\2\u0313\u0314\7\7\2\2\u0314\u0316\5\\"+
		"/\2\u0315\u0313\3\2\2\2\u0316\u0319\3\2\2\2\u0317\u0315\3\2\2\2\u0317"+
		"\u0318\3\2\2\2\u0318\u031a\3\2\2\2\u0319\u0317\3\2\2\2\u031a\u031b\7\6"+
		"\2\2\u031b\u031d\3\2\2\2\u031c\u0310\3\2\2\2\u031d\u0320\3\2\2\2\u031e"+
		"\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0325\3\2\2\2\u0320\u031e\3\2"+
		"\2\2\u0321\u0325\5J&\2\u0322\u0323\7<\2\2\u0323\u0325\7\u0092\2\2\u0324"+
		"\u0305\3\2\2\2\u0324\u0321\3\2\2\2\u0324\u0322\3\2\2\2\u0325=\3\2\2\2"+
		"\u0326\u032a\7t\2\2\u0327\u0328\5\u0092J\2\u0328\u0329\7\4\2\2\u0329\u032b"+
		"\3\2\2\2\u032a\u0327\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u0333\5\u00a8U\2\u032d\u032e\7\b\2\2\u032e\u0334\5l\67\2\u032f\u0330"+
		"\7\5\2\2\u0330\u0331\5l\67\2\u0331\u0332\7\6\2\2\u0332\u0334\3\2\2\2\u0333"+
		"\u032d\3\2\2\2\u0333\u032f\3\2\2\2\u0333\u0334\3\2\2\2\u0334?\3\2\2\2"+
		"\u0335\u0340\7{\2\2\u0336\u0341\5\u009cO\2\u0337\u0338\5\u0092J\2\u0338"+
		"\u0339\7\4\2\2\u0339\u033b\3\2\2\2\u033a\u0337\3\2\2\2\u033a\u033b\3\2"+
		"\2\2\u033b\u033e\3\2\2\2\u033c\u033f\5\u0094K\2\u033d\u033f\5\u00a0Q\2"+
		"\u033e\u033c\3\2\2\2\u033e\u033d\3\2\2\2\u033f\u0341\3\2\2\2\u0340\u0336"+
		"\3\2\2\2\u0340\u033a\3\2\2\2\u0340\u0341\3\2\2\2\u0341A\3\2\2\2\u0342"+
		"\u0344\7|\2\2\u0343\u0345\7\u0083\2\2\u0344\u0343\3\2\2\2\u0344\u0345"+
		"\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\5\u00aaV\2\u0347C\3\2\2\2\u0348"+
		"\u034d\7\u0081\2\2\u0349\u034b\7\u008b\2\2\u034a\u034c\5\u00aeX\2\u034b"+
		"\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034e\3\2\2\2\u034d\u0349\3\2"+
		"\2\2\u034d\u034e\3\2\2\2\u034e\u0354\3\2\2\2\u034f\u0351\7\u008a\2\2\u0350"+
		"\u0352\7\u0083\2\2\u0351\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353"+
		"\3\2\2\2\u0353\u0355\5\u00aaV\2\u0354\u034f\3\2\2\2\u0354\u0355\3\2\2"+
		"\2\u0355E\3\2\2\2\u0356\u0357\7\u0083\2\2\u0357\u0358\5\u00aaV\2\u0358"+
		"G\3\2\2\2\u0359\u035b\7\u0097\2\2\u035a\u035c\7x\2\2\u035b\u035a\3\2\2"+
		"\2\u035b\u035c\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u0362\5n8\2\u035e\u035f"+
		"\7\7\2\2\u035f\u0361\5n8\2\u0360\u035e\3\2\2\2\u0361\u0364\3\2\2\2\u0362"+
		"\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0366\3\2\2\2\u0364\u0362\3\2"+
		"\2\2\u0365\u0359\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367\3\2\2\2\u0367"+
		"\u0372\5z>\2\u0368\u0369\7q\2\2\u0369\u036a\7*\2\2\u036a\u036f\5j\66\2"+
		"\u036b\u036c\7\7\2\2\u036c\u036e\5j\66\2\u036d\u036b\3\2\2\2\u036e\u0371"+
		"\3\2\2\2\u036f\u036d\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0373\3\2\2\2\u0371"+
		"\u036f\3\2\2\2\u0372\u0368\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u037a\3\2"+
		"\2\2\u0374\u0375\7f\2\2\u0375\u0378\5\\/\2\u0376\u0377\t\4\2\2\u0377\u0379"+
		"\5\\/\2\u0378\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037b\3\2\2\2\u037a"+
		"\u0374\3\2\2\2\u037a\u037b\3\2\2\2\u037bI\3\2\2\2\u037c\u037e\7\u0097"+
		"\2\2\u037d\u037f\7x\2\2\u037e\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f"+
		"\u0380\3\2\2\2\u0380\u0385\5n8\2\u0381\u0382\7\7\2\2\u0382\u0384\5n8\2"+
		"\u0383\u0381\3\2\2\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2\2\2\u0385\u0386"+
		"\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0388\u037c\3\2\2\2\u0388"+
		"\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u0390\5L\'\2\u038b\u038c\5|?"+
		"\2\u038c\u038d\5L\'\2\u038d\u038f\3\2\2\2\u038e\u038b\3\2\2\2\u038f\u0392"+
		"\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u039d\3\2\2\2\u0392"+
		"\u0390\3\2\2\2\u0393\u0394\7q\2\2\u0394\u0395\7*\2\2\u0395\u039a\5j\66"+
		"\2\u0396\u0397\7\7\2\2\u0397\u0399\5j\66\2\u0398\u0396\3\2\2\2\u0399\u039c"+
		"\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039e\3\2\2\2\u039c"+
		"\u039a\3\2\2\2\u039d\u0393\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a5\3\2"+
		"\2\2\u039f\u03a0\7f\2\2\u03a0\u03a3\5\\/\2\u03a1\u03a2\t\4\2\2\u03a2\u03a4"+
		"\5\\/\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a6\3\2\2\2\u03a5"+
		"\u039f\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6K\3\2\2\2\u03a7\u03a9\7\u0084"+
		"\2\2\u03a8\u03aa\t\7\2\2\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa"+
		"\u03ab\3\2\2\2\u03ab\u03b0\5p9\2\u03ac\u03ad\7\7\2\2\u03ad\u03af\5p9\2"+
		"\u03ae\u03ac\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1"+
		"\3\2\2\2\u03b1\u03bf\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3\u03bd\7O\2\2\u03b4"+
		"\u03b9\5r:\2\u03b5\u03b6\7\7\2\2\u03b6\u03b8\5r:\2\u03b7\u03b5\3\2\2\2"+
		"\u03b8\u03bb\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03be"+
		"\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc\u03be\5t;\2\u03bd\u03b4\3\2\2\2\u03bd"+
		"\u03bc\3\2\2\2\u03be\u03c0\3\2\2\2\u03bf\u03b3\3\2\2\2\u03bf\u03c0\3\2"+
		"\2\2\u03c0\u03c3\3\2\2\2\u03c1\u03c2\7\u0096\2\2\u03c2\u03c4\5\\/\2\u03c3"+
		"\u03c1\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03d3\3\2\2\2\u03c5\u03c6\7R"+
		"\2\2\u03c6\u03c7\7*\2\2\u03c7\u03cc\5\\/\2\u03c8\u03c9\7\7\2\2\u03c9\u03cb"+
		"\5\\/\2\u03ca\u03c8\3\2\2\2\u03cb\u03ce\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cc"+
		"\u03cd\3\2\2\2\u03cd\u03d1\3\2\2\2\u03ce\u03cc\3\2\2\2\u03cf\u03d0\7S"+
		"\2\2\u03d0\u03d2\5\\/\2\u03d1\u03cf\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2"+
		"\u03d4\3\2\2\2\u03d3\u03c5\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03f2\3\2"+
		"\2\2\u03d5\u03d6\7\u0092\2\2\u03d6\u03d7\7\5\2\2\u03d7\u03dc\5\\/\2\u03d8"+
		"\u03d9\7\7\2\2\u03d9\u03db\5\\/\2\u03da\u03d8\3\2\2\2\u03db\u03de\3\2"+
		"\2\2\u03dc\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03df\3\2\2\2\u03de"+
		"\u03dc\3\2\2\2\u03df\u03ee\7\6\2\2\u03e0\u03e1\7\7\2\2\u03e1\u03e2\7\5"+
		"\2\2\u03e2\u03e7\5\\/\2\u03e3\u03e4\7\7\2\2\u03e4\u03e6\5\\/\2\u03e5\u03e3"+
		"\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8"+
		"\u03ea\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03eb\7\6\2\2\u03eb\u03ed\3\2"+
		"\2\2\u03ec\u03e0\3\2\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee"+
		"\u03ef\3\2\2\2\u03ef\u03f2\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\u03a7\3\2"+
		"\2\2\u03f1\u03d5\3\2\2\2\u03f2M\3\2\2\2\u03f3\u03f5\5f\64\2\u03f4\u03f3"+
		"\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u0401\7\u008f\2"+
		"\2\u03f7\u03f8\7p\2\2\u03f8\u0402\7\u0081\2\2\u03f9\u03fa\7p\2\2\u03fa"+
		"\u0402\7\33\2\2\u03fb\u03fc\7p\2\2\u03fc\u0402\7~\2\2\u03fd\u03fe\7p\2"+
		"\2\u03fe\u0402\7L\2\2\u03ff\u0400\7p\2\2\u0400\u0402\7U\2\2\u0401\u03f7"+
		"\3\2\2\2\u0401\u03f9\3\2\2\2\u0401\u03fb\3\2\2\2\u0401\u03fd\3\2\2\2\u0401"+
		"\u03ff\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0404\5h"+
		"\65\2\u0404\u0405\7\u0085\2\2\u0405\u0406\5\u009aN\2\u0406\u0407\7\b\2"+
		"\2\u0407\u040f\5\\/\2\u0408\u0409\7\7\2\2\u0409\u040a\5\u009aN\2\u040a"+
		"\u040b\7\b\2\2\u040b\u040c\5\\/\2\u040c\u040e\3\2\2\2\u040d\u0408\3\2"+
		"\2\2\u040e\u0411\3\2\2\2\u040f\u040d\3\2\2\2\u040f\u0410\3\2\2\2\u0410"+
		"\u0414\3\2\2\2\u0411\u040f\3\2\2\2\u0412\u0413\7\u0096\2\2\u0413\u0415"+
		"\5\\/\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415O\3\2\2\2\u0416\u0418"+
		"\5f\64\2\u0417\u0416\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0419\3\2\2\2\u0419"+
		"\u0424\7\u008f\2\2\u041a\u041b\7p\2\2\u041b\u0425\7\u0081\2\2\u041c\u041d"+
		"\7p\2\2\u041d\u0425\7\33\2\2\u041e\u041f\7p\2\2\u041f\u0425\7~\2\2\u0420"+
		"\u0421\7p\2\2\u0421\u0425\7L\2\2\u0422\u0423\7p\2\2\u0423\u0425\7U\2\2"+
		"\u0424\u041a\3\2\2\2\u0424\u041c\3\2\2\2\u0424\u041e\3\2\2\2\u0424\u0420"+
		"\3\2\2\2\u0424\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u0426\3\2\2\2\u0426"+
		"\u0427\5h\65\2\u0427\u0428\7\u0085\2\2\u0428\u0429\5\u009aN\2\u0429\u042a"+
		"\7\b\2\2\u042a\u0432\5\\/\2\u042b\u042c\7\7\2\2\u042c\u042d\5\u009aN\2"+
		"\u042d\u042e\7\b\2\2\u042e\u042f\5\\/\2\u042f\u0431\3\2\2\2\u0430\u042b"+
		"\3\2\2\2\u0431\u0434\3\2\2\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433"+
		"\u0437\3\2\2\2\u0434\u0432\3\2\2\2\u0435\u0436\7\u0096\2\2\u0436\u0438"+
		"\5\\/\2\u0437\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u044b\3\2\2\2\u0439"+
		"\u043a\7q\2\2\u043a\u043b\7*\2\2\u043b\u0440\5j\66\2\u043c\u043d\7\7\2"+
		"\2\u043d\u043f\5j\66\2\u043e\u043c\3\2\2\2\u043f\u0442\3\2\2\2\u0440\u043e"+
		"\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0444\3\2\2\2\u0442\u0440\3\2\2\2\u0443"+
		"\u0439\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0445\3\2\2\2\u0445\u0446\7f"+
		"\2\2\u0446\u0449\5\\/\2\u0447\u0448\t\4\2\2\u0448\u044a\5\\/\2\u0449\u0447"+
		"\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044c\3\2\2\2\u044b\u0443\3\2\2\2\u044b"+
		"\u044c\3\2\2\2\u044cQ\3\2\2\2\u044d\u044e\7\u0091\2\2\u044eS\3\2\2\2\u044f"+
		"\u0451\5\u009aN\2\u0450\u0452\5V,\2\u0451\u0450\3\2\2\2\u0451\u0452\3"+
		"\2\2\2\u0452\u0456\3\2\2\2\u0453\u0455\5X-\2\u0454\u0453\3\2\2\2\u0455"+
		"\u0458\3\2\2\2\u0456\u0454\3\2\2\2\u0456\u0457\3\2\2\2\u0457U\3\2\2\2"+
		"\u0458\u0456\3\2\2\2\u0459\u045b\5\u008eH\2\u045a\u0459\3\2\2\2\u045b"+
		"\u045c\3\2\2\2\u045c\u045a\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u0468\3\2"+
		"\2\2\u045e\u045f\7\5\2\2\u045f\u0460\5\u0080A\2\u0460\u0461\7\6\2\2\u0461"+
		"\u0469\3\2\2\2\u0462\u0463\7\5\2\2\u0463\u0464\5\u0080A\2\u0464\u0465"+
		"\7\7\2\2\u0465\u0466\5\u0080A\2\u0466\u0467\7\6\2\2\u0467\u0469\3\2\2"+
		"\2\u0468\u045e\3\2\2\2\u0468\u0462\3\2\2\2\u0468\u0469\3\2\2\2\u0469W"+
		"\3\2\2\2\u046a\u046b\7\63\2\2\u046b\u046d\5\u008eH\2\u046c\u046a\3\2\2"+
		"\2\u046c\u046d\3\2\2\2\u046d\u048f\3\2\2\2\u046e\u046f\7u\2\2\u046f\u0471"+
		"\7c\2\2\u0470\u0472\t\b\2\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472"+
		"\u0473\3\2\2\2\u0473\u0475\5Z.\2\u0474\u0476\7&\2\2\u0475\u0474\3\2\2"+
		"\2\u0475\u0476\3\2\2\2\u0476\u0490\3\2\2\2\u0477\u0479\7j\2\2\u0478\u0477"+
		"\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b\7l\2\2\u047b"+
		"\u0490\5Z.\2\u047c\u047d\7\u008e\2\2\u047d\u0490\5Z.\2\u047e\u047f\7."+
		"\2\2\u047f\u0480\7\5\2\2\u0480\u0481\5\\/\2\u0481\u0482\7\6\2\2\u0482"+
		"\u0490\3\2\2\2\u0483\u048a\7<\2\2\u0484\u048b\5\u0080A\2\u0485\u048b\5"+
		"\u0082B\2\u0486\u0487\7\5\2\2\u0487\u0488\5\\/\2\u0488\u0489\7\6\2\2\u0489"+
		"\u048b\3\2\2\2\u048a\u0484\3\2\2\2\u048a\u0485\3\2\2\2\u048a\u0486\3\2"+
		"\2\2\u048b\u0490\3\2\2\2\u048c\u048d\7/\2\2\u048d\u0490\5\u009cO\2\u048e"+
		"\u0490\5^\60\2\u048f\u046e\3\2\2\2\u048f\u0478\3\2\2\2\u048f\u047c\3\2"+
		"\2\2\u048f\u047e\3\2\2\2\u048f\u0483\3\2\2\2\u048f\u048c\3\2\2\2\u048f"+
		"\u048e\3\2\2\2\u0490Y\3\2\2\2\u0491\u0492\7o\2\2\u0492\u0493\7\62\2\2"+
		"\u0493\u0495\t\t\2\2\u0494\u0491\3\2\2\2\u0494\u0495\3\2\2\2\u0495[\3"+
		"\2\2\2\u0496\u0497\b/\1\2\u0497\u04e3\5\u0082B\2\u0498\u04e3\7\u009b\2"+
		"\2\u0499\u049a\5\u0092J\2\u049a\u049b\7\4\2\2\u049b\u049d\3\2\2\2\u049c"+
		"\u0499\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u049f\5\u0094"+
		"K\2\u049f\u04a0\7\4\2\2\u04a0\u04a2\3\2\2\2\u04a1\u049c\3\2\2\2\u04a1"+
		"\u04a2\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04e3\5\u009aN\2\u04a4\u04a5"+
		"\5\u0084C\2\u04a5\u04a6\5\\/\27\u04a6\u04e3\3\2\2\2\u04a7\u04a8\5\u0090"+
		"I\2\u04a8\u04b5\7\5\2\2\u04a9\u04ab\7B\2\2\u04aa\u04a9\3\2\2\2\u04aa\u04ab"+
		"\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04b1\5\\/\2\u04ad\u04ae\7\7\2\2\u04ae"+
		"\u04b0\5\\/\2\u04af\u04ad\3\2\2\2\u04b0\u04b3\3\2\2\2\u04b1\u04af\3\2"+
		"\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b6\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b4"+
		"\u04b6\7\t\2\2\u04b5\u04aa\3\2\2\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3\2"+
		"\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\7\6\2\2\u04b8\u04e3\3\2\2\2\u04b9"+
		"\u04ba\7\5\2\2\u04ba\u04bb\5\\/\2\u04bb\u04bc\7\6\2\2\u04bc\u04e3\3\2"+
		"\2\2\u04bd\u04be\7-\2\2\u04be\u04bf\7\5\2\2\u04bf\u04c0\5\\/\2\u04c0\u04c1"+
		"\7#\2\2\u04c1\u04c2\5V,\2\u04c2\u04c3\7\6\2\2\u04c3\u04e3\3\2\2\2\u04c4"+
		"\u04c6\7j\2\2\u04c5\u04c4\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c7\3\2"+
		"\2\2\u04c7\u04c9\7J\2\2\u04c8\u04c5\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9"+
		"\u04ca\3\2\2\2\u04ca\u04cb\7\5\2\2\u04cb\u04cc\5J&\2\u04cc\u04cd\7\6\2"+
		"\2\u04cd\u04e3\3\2\2\2\u04ce\u04d0\7,\2\2\u04cf\u04d1\5\\/\2\u04d0\u04cf"+
		"\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d7\3\2\2\2\u04d2\u04d3\7\u0095\2"+
		"\2\u04d3\u04d4\5\\/\2\u04d4\u04d5\7\u0089\2\2\u04d5\u04d6\5\\/\2\u04d6"+
		"\u04d8\3\2\2\2\u04d7\u04d2\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04d7\3\2"+
		"\2\2\u04d9\u04da\3\2\2\2\u04da\u04dd\3\2\2\2\u04db\u04dc\7E\2\2\u04dc"+
		"\u04de\5\\/\2\u04dd\u04db\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\3\2"+
		"\2\2\u04df\u04e0\7F\2\2\u04e0\u04e3\3\2\2\2\u04e1\u04e3\5`\61\2\u04e2"+
		"\u0496\3\2\2\2\u04e2\u0498\3\2\2\2\u04e2\u04a1\3\2\2\2\u04e2\u04a4\3\2"+
		"\2\2\u04e2\u04a7\3\2\2\2\u04e2\u04b9\3\2\2\2\u04e2\u04bd\3\2\2\2\u04e2"+
		"\u04c8\3\2\2\2\u04e2\u04ce\3\2\2\2\u04e2\u04e1\3\2\2\2\u04e3\u0548\3\2"+
		"\2\2\u04e4\u04e5\f\26\2\2\u04e5\u04e6\7\r\2\2\u04e6\u0547\5\\/\27\u04e7"+
		"\u04e8\f\25\2\2\u04e8\u04e9\t\n\2\2\u04e9\u0547\5\\/\26\u04ea\u04eb\f"+
		"\24\2\2\u04eb\u04ec\t\13\2\2\u04ec\u0547\5\\/\25\u04ed\u04ee\f\23\2\2"+
		"\u04ee\u04ef\t\f\2\2\u04ef\u0547\5\\/\24\u04f0\u04f1\f\22\2\2\u04f1\u04f2"+
		"\t\r\2\2\u04f2\u0547\5\\/\23\u04f3\u0500\f\21\2\2\u04f4\u0501\7\b\2\2"+
		"\u04f5\u0501\7\30\2\2\u04f6\u0501\7\31\2\2\u04f7\u0501\7\32\2\2\u04f8"+
		"\u0501\7`\2\2\u04f9\u04fa\7`\2\2\u04fa\u0501\7j\2\2\u04fb\u0501\7W\2\2"+
		"\u04fc\u0501\7e\2\2\u04fd\u0501\7Q\2\2\u04fe\u0501\7g\2\2\u04ff\u0501"+
		"\7z\2\2\u0500\u04f4\3\2\2\2\u0500\u04f5\3\2\2\2\u0500\u04f6\3\2\2\2\u0500"+
		"\u04f7\3\2\2\2\u0500\u04f8\3\2\2\2\u0500\u04f9\3\2\2\2\u0500\u04fb\3\2"+
		"\2\2\u0500\u04fc\3\2\2\2\u0500\u04fd\3\2\2\2\u0500\u04fe\3\2\2\2\u0500"+
		"\u04ff\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0547\5\\/\22\u0503\u0504\f\20"+
		"\2\2\u0504\u0505\7\"\2\2\u0505\u0547\5\\/\21\u0506\u0507\f\17\2\2\u0507"+
		"\u0508\7p\2\2\u0508\u0547\5\\/\20\u0509\u050a\f\b\2\2\u050a\u050c\7`\2"+
		"\2\u050b\u050d\7j\2\2\u050c\u050b\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e"+
		"\3\2\2\2\u050e\u0547\5\\/\t\u050f\u0511\f\7\2\2\u0510\u0512\7j\2\2\u0511"+
		"\u0510\3\2\2\2\u0511\u0512\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514\7)"+
		"\2\2\u0514\u0515\5\\/\2\u0515\u0516\7\"\2\2\u0516\u0517\5\\/\b\u0517\u0547"+
		"\3\2\2\2\u0518\u0519\f\13\2\2\u0519\u051a\7/\2\2\u051a\u0547\5\u009cO"+
		"\2\u051b\u051d\f\n\2\2\u051c\u051e\7j\2\2\u051d\u051c\3\2\2\2\u051d\u051e"+
		"\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0520\t\16\2\2\u0520\u0523\5\\/\2\u0521"+
		"\u0522\7G\2\2\u0522\u0524\5\\/\2\u0523\u0521\3\2\2\2\u0523\u0524\3\2\2"+
		"\2\u0524\u0547\3\2\2\2\u0525\u052a\f\t\2\2\u0526\u052b\7a\2\2\u0527\u052b"+
		"\7k\2\2\u0528\u0529\7j\2\2\u0529\u052b\7l\2\2\u052a\u0526\3\2\2\2\u052a"+
		"\u0527\3\2\2\2\u052a\u0528\3\2\2\2\u052b\u0547\3\2\2\2\u052c\u052e\f\6"+
		"\2\2\u052d\u052f\7j\2\2\u052e\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f"+
		"\u0530\3\2\2\2\u0530\u0544\7W\2\2\u0531\u053b\7\5\2\2\u0532\u053c\5J&"+
		"\2\u0533\u0538\5\\/\2\u0534\u0535\7\7\2\2\u0535\u0537\5\\/\2\u0536\u0534"+
		"\3\2\2\2\u0537\u053a\3\2\2\2\u0538\u0536\3\2\2\2\u0538\u0539\3\2\2\2\u0539"+
		"\u053c\3\2\2\2\u053a\u0538\3\2\2\2\u053b\u0532\3\2\2\2\u053b\u0533\3\2"+
		"\2\2\u053b\u053c\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u0545\7\6\2\2\u053e"+
		"\u053f\5\u0092J\2\u053f\u0540\7\4\2\2\u0540\u0542\3\2\2\2\u0541\u053e"+
		"\3\2\2\2\u0541\u0542\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0545\5\u0094K"+
		"\2\u0544\u0531\3\2\2\2\u0544\u0541\3\2\2\2\u0545\u0547\3\2\2\2\u0546\u04e4"+
		"\3\2\2\2\u0546\u04e7\3\2\2\2\u0546\u04ea\3\2\2\2\u0546\u04ed\3\2\2\2\u0546"+
		"\u04f0\3\2\2\2\u0546\u04f3\3\2\2\2\u0546\u0503\3\2\2\2\u0546\u0506\3\2"+
		"\2\2\u0546\u0509\3\2\2\2\u0546\u050f\3\2\2\2\u0546\u0518\3\2\2\2\u0546"+
		"\u051b\3\2\2\2\u0546\u0525\3\2\2\2\u0546\u052c\3\2\2\2\u0547\u054a\3\2"+
		"\2\2\u0548\u0546\3\2\2\2\u0548\u0549\3\2\2\2\u0549]\3\2\2\2\u054a\u0548"+
		"\3\2\2\2\u054b\u054c\7y\2\2\u054c\u0558\5\u009eP\2\u054d\u054e\7\5\2\2"+
		"\u054e\u0553\5\u009aN\2\u054f\u0550\7\7\2\2\u0550\u0552\5\u009aN\2\u0551"+
		"\u054f\3\2\2\2\u0552\u0555\3\2\2\2\u0553\u0551\3\2\2\2\u0553\u0554\3\2"+
		"\2\2\u0554\u0556\3\2\2\2\u0555\u0553\3\2\2\2\u0556\u0557\7\6\2\2\u0557"+
		"\u0559\3\2\2\2\u0558\u054d\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u056c\3\2"+
		"\2\2\u055a\u055b\7o\2\2\u055b\u0564\t\17\2\2\u055c\u055d\7\u0085\2\2\u055d"+
		"\u0565\7l\2\2\u055e\u055f\7\u0085\2\2\u055f\u0565\7<\2\2\u0560\u0565\7"+
		"+\2\2\u0561\u0565\7\177\2\2\u0562\u0563\7i\2\2\u0563\u0565\7\34\2\2\u0564"+
		"\u055c\3\2\2\2\u0564\u055e\3\2\2\2\u0564\u0560\3\2\2\2\u0564\u0561\3\2"+
		"\2\2\u0564\u0562\3\2\2\2\u0565\u0569\3\2\2\2\u0566\u0567\7g\2\2\u0567"+
		"\u0569\5\u008eH\2\u0568\u055a\3\2\2\2\u0568\u0566\3\2\2\2\u0569\u056b"+
		"\3\2\2\2\u056a\u0568\3\2\2\2\u056b\u056e\3\2\2\2\u056c\u056a\3\2\2\2\u056c"+
		"\u056d\3\2\2\2\u056d\u0579\3\2\2\2\u056e\u056c\3\2\2\2\u056f\u0571\7j"+
		"\2\2\u0570\u056f\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0572\3\2\2\2\u0572"+
		"\u0577\7=\2\2\u0573\u0574\7Z\2\2\u0574\u0578\7>\2\2\u0575\u0576\7Z\2\2"+
		"\u0576\u0578\7V\2\2\u0577\u0573\3\2\2\2\u0577\u0575\3\2\2\2\u0577\u0578"+
		"\3\2\2\2\u0578\u057a\3\2\2\2\u0579\u0570\3\2\2\2\u0579\u057a\3\2\2\2\u057a"+
		"_\3\2\2\2\u057b\u057c\7w\2\2\u057c\u0581\7\5\2\2\u057d\u0582\7U\2\2\u057e"+
		"\u057f\t\20\2\2\u057f\u0580\7\7\2\2\u0580\u0582\5\u0086D\2\u0581\u057d"+
		"\3\2\2\2\u0581\u057e\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0584\7\6\2\2\u0584"+
		"a\3\2\2\2\u0585\u0588\5\u009aN\2\u0586\u0587\7/\2\2\u0587\u0589\5\u009c"+
		"O\2\u0588\u0586\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058b\3\2\2\2\u058a"+
		"\u058c\t\b\2\2\u058b\u058a\3\2\2\2\u058b\u058c\3\2\2\2\u058cc\3\2\2\2"+
		"\u058d\u058e\7\63\2\2\u058e\u0590\5\u008eH\2\u058f\u058d\3\2\2\2\u058f"+
		"\u0590\3\2\2\2\u0590\u05b5\3\2\2\2\u0591\u0592\7u\2\2\u0592\u0595\7c\2"+
		"\2\u0593\u0595\7\u008e\2\2\u0594\u0591\3\2\2\2\u0594\u0593\3\2\2\2\u0595"+
		"\u0596\3\2\2\2\u0596\u0597\7\5\2\2\u0597\u059c\5b\62\2\u0598\u0599\7\7"+
		"\2\2\u0599\u059b\5b\62\2\u059a\u0598\3\2\2\2\u059b\u059e\3\2\2\2\u059c"+
		"\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059f\3\2\2\2\u059e\u059c\3\2"+
		"\2\2\u059f\u05a0\7\6\2\2\u05a0\u05a1\5Z.\2\u05a1\u05b6\3\2\2\2\u05a2\u05a3"+
		"\7.\2\2\u05a3\u05a4\7\5\2\2\u05a4\u05a5\5\\/\2\u05a5\u05a6\7\6\2\2\u05a6"+
		"\u05b6\3\2\2\2\u05a7\u05a8\7N\2\2\u05a8\u05a9\7c\2\2\u05a9\u05aa\7\5\2"+
		"\2\u05aa\u05af\5\u009aN\2\u05ab\u05ac\7\7\2\2\u05ac\u05ae\5\u009aN\2\u05ad"+
		"\u05ab\3\2\2\2\u05ae\u05b1\3\2\2\2\u05af\u05ad\3\2\2\2\u05af\u05b0\3\2"+
		"\2\2\u05b0\u05b2\3\2\2\2\u05b1\u05af\3\2\2\2\u05b2\u05b3\7\6\2\2\u05b3"+
		"\u05b4\5^\60\2\u05b4\u05b6\3\2\2\2\u05b5\u0594\3\2\2\2\u05b5\u05a2\3\2"+
		"\2\2\u05b5\u05a7\3\2\2\2\u05b6e\3\2\2\2\u05b7\u05b9\7\u0097\2\2\u05b8"+
		"\u05ba\7x\2\2\u05b9\u05b8\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bb\3\2"+
		"\2\2\u05bb\u05bc\5~@\2\u05bc\u05bd\7#\2\2\u05bd\u05be\7\5\2\2\u05be\u05bf"+
		"\5J&\2\u05bf\u05c9\7\6\2\2\u05c0\u05c1\7\7\2\2\u05c1\u05c2\5~@\2\u05c2"+
		"\u05c3\7#\2\2\u05c3\u05c4\7\5\2\2\u05c4\u05c5\5J&\2\u05c5\u05c6\7\6\2"+
		"\2\u05c6\u05c8\3\2\2\2\u05c7\u05c0\3\2\2\2\u05c8\u05cb\3\2\2\2\u05c9\u05c7"+
		"\3\2\2\2\u05c9\u05ca\3\2\2\2\u05cag\3\2\2\2\u05cb\u05c9\3\2\2\2\u05cc"+
		"\u05cd\5\u0092J\2\u05cd\u05ce\7\4\2\2\u05ce\u05d0\3\2\2\2\u05cf\u05cc"+
		"\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d7\5\u0094K"+
		"\2\u05d2\u05d3\7Y\2\2\u05d3\u05d4\7*\2\2\u05d4\u05d8\5\u00a0Q\2\u05d5"+
		"\u05d6\7j\2\2\u05d6\u05d8\7Y\2\2\u05d7\u05d2\3\2\2\2\u05d7\u05d5\3\2\2"+
		"\2\u05d7\u05d8\3\2\2\2\u05d8i\3\2\2\2\u05d9\u05dc\5\\/\2\u05da\u05db\7"+
		"/\2\2\u05db\u05dd\5\u009cO\2\u05dc\u05da\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd"+
		"\u05df\3\2\2\2\u05de\u05e0\t\b\2\2\u05df\u05de\3\2\2\2\u05df\u05e0\3\2"+
		"\2\2\u05e0k\3\2\2\2\u05e1\u05e5\5\u0080A\2\u05e2\u05e5\5\u008eH\2\u05e3"+
		"\u05e5\7\u009c\2\2\u05e4\u05e1\3\2\2\2\u05e4\u05e2\3\2\2\2\u05e4\u05e3"+
		"\3\2\2\2\u05e5m\3\2\2\2\u05e6\u05f2\5\u0094K\2\u05e7\u05e8\7\5\2\2\u05e8"+
		"\u05ed\5\u009aN\2\u05e9\u05ea\7\7\2\2\u05ea\u05ec\5\u009aN\2\u05eb\u05e9"+
		"\3\2\2\2\u05ec\u05ef\3\2\2\2\u05ed\u05eb\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee"+
		"\u05f0\3\2\2\2\u05ef\u05ed\3\2\2\2\u05f0\u05f1\7\6\2\2\u05f1\u05f3\3\2"+
		"\2\2\u05f2\u05e7\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4"+
		"\u05f5\7#\2\2\u05f5\u05f6\7\5\2\2\u05f6\u05f7\5J&\2\u05f7\u05f8\7\6\2"+
		"\2\u05f8o\3\2\2\2\u05f9\u0606\7\t\2\2\u05fa\u05fb\5\u0094K\2\u05fb\u05fc"+
		"\7\4\2\2\u05fc\u05fd\7\t\2\2\u05fd\u0606\3\2\2\2\u05fe\u0603\5\\/\2\u05ff"+
		"\u0601\7#\2\2\u0600\u05ff\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0602\3\2"+
		"\2\2\u0602\u0604\5\u008aF\2\u0603\u0600\3\2\2\2\u0603\u0604\3\2\2\2\u0604"+
		"\u0606\3\2\2\2\u0605\u05f9\3\2\2\2\u0605\u05fa\3\2\2\2\u0605\u05fe\3\2"+
		"\2\2\u0606q\3\2\2\2\u0607\u0608\5\u0092J\2\u0608\u0609\7\4\2\2\u0609\u060b"+
		"\3\2\2\2\u060a\u0607\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060c\3\2\2\2\u060c"+
		"\u0611\5\u0094K\2\u060d\u060f\7#\2\2\u060e\u060d\3\2\2\2\u060e\u060f\3"+
		"\2\2\2\u060f\u0610\3\2\2\2\u0610\u0612\5\u00acW\2\u0611\u060e\3\2\2\2"+
		"\u0611\u0612\3\2\2\2\u0612\u0618\3\2\2\2\u0613\u0614\7Y\2\2\u0614\u0615"+
		"\7*\2\2\u0615\u0619\5\u00a0Q\2\u0616\u0617\7j\2\2\u0617\u0619\7Y\2\2\u0618"+
		"\u0613\3\2\2\2\u0618\u0616\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u0637\3\2"+
		"\2\2\u061a\u0624\7\5\2\2\u061b\u0620\5r:\2\u061c\u061d\7\7\2\2\u061d\u061f"+
		"\5r:\2\u061e\u061c\3\2\2\2\u061f\u0622\3\2\2\2\u0620\u061e\3\2\2\2\u0620"+
		"\u0621\3\2\2\2\u0621\u0625\3\2\2\2\u0622\u0620\3\2\2\2\u0623\u0625\5t"+
		";\2\u0624\u061b\3\2\2\2\u0624\u0623\3\2\2\2\u0625\u0626\3\2\2\2\u0626"+
		"\u062b\7\6\2\2\u0627\u0629\7#\2\2\u0628\u0627\3\2\2\2\u0628\u0629\3\2"+
		"\2\2\u0629\u062a\3\2\2\2\u062a\u062c\5\u00acW\2\u062b\u0628\3\2\2\2\u062b"+
		"\u062c\3\2\2\2\u062c\u0637\3\2\2\2\u062d\u062e\7\5\2\2\u062e\u062f\5J"+
		"&\2\u062f\u0634\7\6\2\2\u0630\u0632\7#\2\2\u0631\u0630\3\2\2\2\u0631\u0632"+
		"\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0635\5\u00acW\2\u0634\u0631\3\2\2"+
		"\2\u0634\u0635\3\2\2\2\u0635\u0637\3\2\2\2\u0636\u060a\3\2\2\2\u0636\u061a"+
		"\3\2\2\2\u0636\u062d\3\2\2\2\u0637s\3\2\2\2\u0638\u063f\5r:\2\u0639\u063a"+
		"\5v<\2\u063a\u063b\5r:\2\u063b\u063c\5x=\2\u063c\u063e\3\2\2\2\u063d\u0639"+
		"\3\2\2\2\u063e\u0641\3\2\2\2\u063f\u063d\3\2\2\2\u063f\u0640\3\2\2\2\u0640"+
		"u\3\2\2\2\u0641\u063f\3\2\2\2\u0642\u0650\7\7\2\2\u0643\u0645\7h\2\2\u0644"+
		"\u0643\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u064c\3\2\2\2\u0646\u0648\7d"+
		"\2\2\u0647\u0649\7r\2\2\u0648\u0647\3\2\2\2\u0648\u0649\3\2\2\2\u0649"+
		"\u064d\3\2\2\2\u064a\u064d\7[\2\2\u064b\u064d\7\67\2\2\u064c\u0646\3\2"+
		"\2\2\u064c\u064a\3\2\2\2\u064c\u064b\3\2\2\2\u064c\u064d\3\2\2\2\u064d"+
		"\u064e\3\2\2\2\u064e\u0650\7b\2\2\u064f\u0642\3\2\2\2\u064f\u0644\3\2"+
		"\2\2\u0650w\3\2\2\2\u0651\u0652\7o\2\2\u0652\u0660\5\\/\2\u0653\u0654"+
		"\7\u0090\2\2\u0654\u0655\7\5\2\2\u0655\u065a\5\u009aN\2\u0656\u0657\7"+
		"\7\2\2\u0657\u0659\5\u009aN\2\u0658\u0656\3\2\2\2\u0659\u065c\3\2\2\2"+
		"\u065a\u0658\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065d\3\2\2\2\u065c\u065a"+
		"\3\2\2\2\u065d\u065e\7\6\2\2\u065e\u0660\3\2\2\2\u065f\u0651\3\2\2\2\u065f"+
		"\u0653\3\2\2\2\u065f\u0660\3\2\2\2\u0660y\3\2\2\2\u0661\u0663\7\u0084"+
		"\2\2\u0662\u0664\t\7\2\2\u0663\u0662\3\2\2\2\u0663\u0664\3\2\2\2\u0664"+
		"\u0665\3\2\2\2\u0665\u066a\5p9\2\u0666\u0667\7\7\2\2\u0667\u0669\5p9\2"+
		"\u0668\u0666\3\2\2\2\u0669\u066c\3\2\2\2\u066a\u0668\3\2\2\2\u066a\u066b"+
		"\3\2\2\2\u066b\u0679\3\2\2\2\u066c\u066a\3\2\2\2\u066d\u0677\7O\2\2\u066e"+
		"\u0673\5r:\2\u066f\u0670\7\7\2\2\u0670\u0672\5r:\2\u0671\u066f\3\2\2\2"+
		"\u0672\u0675\3\2\2\2\u0673\u0671\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0678"+
		"\3\2\2\2\u0675\u0673\3\2\2\2\u0676\u0678\5t;\2\u0677\u066e\3\2\2\2\u0677"+
		"\u0676\3\2\2\2\u0678\u067a\3\2\2\2\u0679\u066d\3\2\2\2\u0679\u067a\3\2"+
		"\2\2\u067a\u067d\3\2\2\2\u067b\u067c\7\u0096\2\2\u067c\u067e\5\\/\2\u067d"+
		"\u067b\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u068d\3\2\2\2\u067f\u0680\7R"+
		"\2\2\u0680\u0681\7*\2\2\u0681\u0686\5\\/\2\u0682\u0683\7\7\2\2\u0683\u0685"+
		"\5\\/\2\u0684\u0682\3\2\2\2\u0685\u0688\3\2\2\2\u0686\u0684\3\2\2\2\u0686"+
		"\u0687\3\2\2\2\u0687\u068b\3\2\2\2\u0688\u0686\3\2\2\2\u0689\u068a\7S"+
		"\2\2\u068a\u068c\5\\/\2\u068b\u0689\3\2\2\2\u068b\u068c\3\2\2\2\u068c"+
		"\u068e\3\2\2\2\u068d\u067f\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u06ac\3\2"+
		"\2\2\u068f\u0690\7\u0092\2\2\u0690\u0691\7\5\2\2\u0691\u0696\5\\/\2\u0692"+
		"\u0693\7\7\2\2\u0693\u0695\5\\/\2\u0694\u0692\3\2\2\2\u0695\u0698\3\2"+
		"\2\2\u0696\u0694\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u0699\3\2\2\2\u0698"+
		"\u0696\3\2\2\2\u0699\u06a8\7\6\2\2\u069a\u069b\7\7\2\2\u069b\u069c\7\5"+
		"\2\2\u069c\u06a1\5\\/\2\u069d\u069e\7\7\2\2\u069e\u06a0\5\\/\2\u069f\u069d"+
		"\3\2\2\2\u06a0\u06a3\3\2\2\2\u06a1\u069f\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2"+
		"\u06a4\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a4\u06a5\7\6\2\2\u06a5\u06a7\3\2"+
		"\2\2\u06a6\u069a\3\2\2\2\u06a7\u06aa\3\2\2\2\u06a8\u06a6\3\2\2\2\u06a8"+
		"\u06a9\3\2\2\2\u06a9\u06ac\3\2\2\2\u06aa\u06a8\3\2\2\2\u06ab\u0661\3\2"+
		"\2\2\u06ab\u068f\3\2\2\2\u06ac{\3\2\2\2\u06ad\u06b3\7\u008d\2\2\u06ae"+
		"\u06af\7\u008d\2\2\u06af\u06b3\7\37\2\2\u06b0\u06b3\7^\2\2\u06b1\u06b3"+
		"\7H\2\2\u06b2\u06ad\3\2\2\2\u06b2\u06ae\3\2\2\2\u06b2\u06b0\3\2\2\2\u06b2"+
		"\u06b1\3\2\2\2\u06b3}\3\2\2\2\u06b4\u06c0\5\u0094K\2\u06b5\u06b6\7\5\2"+
		"\2\u06b6\u06bb\5\u009aN\2\u06b7\u06b8\7\7\2\2\u06b8\u06ba\5\u009aN\2\u06b9"+
		"\u06b7\3\2\2\2\u06ba\u06bd\3\2\2\2\u06bb\u06b9\3\2\2\2\u06bb\u06bc\3\2"+
		"\2\2\u06bc\u06be\3\2\2\2\u06bd\u06bb\3\2\2\2\u06be\u06bf\7\6\2\2\u06bf"+
		"\u06c1\3\2\2\2\u06c0\u06b5\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\177\3\2\2"+
		"\2\u06c2\u06c4\t\13\2\2\u06c3\u06c2\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4"+
		"\u06c5\3\2\2\2\u06c5\u06c6\7\u009a\2\2\u06c6\u0081\3\2\2\2\u06c7\u06c8"+
		"\t\21\2\2\u06c8\u0083\3\2\2\2\u06c9\u06ca\t\22\2\2\u06ca\u0085\3\2\2\2"+
		"\u06cb\u06cc\7\u009c\2\2\u06cc\u0087\3\2\2\2\u06cd\u06d0\5\\/\2\u06ce"+
		"\u06d0\5T+\2\u06cf\u06cd\3\2\2\2\u06cf\u06ce\3\2\2\2\u06d0\u0089\3\2\2"+
		"\2\u06d1\u06d2\t\23\2\2\u06d2\u008b\3\2\2\2\u06d3\u06d4\t\24\2\2\u06d4"+
		"\u008d\3\2\2\2\u06d5\u06d6\5\u00b0Y\2\u06d6\u008f\3\2\2\2\u06d7\u06d8"+
		"\5\u00b0Y\2\u06d8\u0091\3\2\2\2\u06d9\u06da\5\u00b0Y\2\u06da\u0093\3\2"+
		"\2\2\u06db\u06dc\5\u00b0Y\2\u06dc\u0095\3\2\2\2\u06dd\u06de\5\u00b0Y\2"+
		"\u06de\u0097\3\2\2\2\u06df\u06e0\5\u00b0Y\2\u06e0\u0099\3\2\2\2\u06e1"+
		"\u06e2\5\u00b0Y\2\u06e2\u009b\3\2\2\2\u06e3\u06e4\5\u00b0Y\2\u06e4\u009d"+
		"\3\2\2\2\u06e5\u06e6\5\u00b0Y\2\u06e6\u009f\3\2\2\2\u06e7\u06e8\5\u00b0"+
		"Y\2\u06e8\u00a1\3\2\2\2\u06e9\u06ea\5\u00b0Y\2\u06ea\u00a3\3\2\2\2\u06eb"+
		"\u06ec\5\u00b0Y\2\u06ec\u00a5\3\2\2\2\u06ed\u06ee\5\u00b0Y\2\u06ee\u00a7"+
		"\3\2\2\2\u06ef\u06f0\5\u00b0Y\2\u06f0\u00a9\3\2\2\2\u06f1\u06f2\5\u00b0"+
		"Y\2\u06f2\u00ab\3\2\2\2\u06f3\u06f4\5\u00b0Y\2\u06f4\u00ad\3\2\2\2\u06f5"+
		"\u06f6\5\u00b0Y\2\u06f6\u00af\3\2\2\2\u06f7\u06ff\7\u0099\2\2\u06f8\u06ff"+
		"\5\u008cG\2\u06f9\u06ff\7\u009c\2\2\u06fa\u06fb\7\5\2\2\u06fb\u06fc\5"+
		"\u00b0Y\2\u06fc\u06fd\7\6\2\2\u06fd\u06ff\3\2\2\2\u06fe\u06f7\3\2\2\2"+
		"\u06fe\u06f8\3\2\2\2\u06fe\u06f9\3\2\2\2\u06fe\u06fa\3\2\2\2\u06ff\u00b1"+
		"\3\2\2\2\u00fb\u00b4\u00b6\u00c1\u00c8\u00cd\u00d3\u00d9\u00db\u00fb\u0102"+
		"\u010a\u010d\u0116\u011a\u0122\u0126\u0128\u012d\u012f\u0133\u013a\u013d"+
		"\u0142\u0146\u014b\u0154\u0157\u015d\u015f\u0163\u0169\u016e\u0179\u017f"+
		"\u0183\u0189\u018e\u0197\u019e\u01a4\u01a8\u01ab\u01af\u01b8\u01c2\u01d4"+
		"\u01db\u01e1\u01e6\u01ed\u01f8\u01fb\u01fd\u0203\u0209\u020d\u0214\u021a"+
		"\u0220\u0226\u022b\u0237\u023c\u0247\u024c\u024f\u0256\u0259\u0260\u0269"+
		"\u026c\u0272\u0274\u0278\u0280\u0285\u028d\u0292\u029a\u029f\u02a7\u02ac"+
		"\u02b2\u02b9\u02bc\u02c4\u02ce\u02d1\u02d7\u02d9\u02dc\u02ef\u02f5\u02fe"+
		"\u0303\u030c\u0317\u031e\u0324\u032a\u0333\u033a\u033e\u0340\u0344\u034b"+
		"\u034d\u0351\u0354\u035b\u0362\u0365\u036f\u0372\u0378\u037a\u037e\u0385"+
		"\u0388\u0390\u039a\u039d\u03a3\u03a5\u03a9\u03b0\u03b9\u03bd\u03bf\u03c3"+
		"\u03cc\u03d1\u03d3\u03dc\u03e7\u03ee\u03f1\u03f4\u0401\u040f\u0414\u0417"+
		"\u0424\u0432\u0437\u0440\u0443\u0449\u044b\u0451\u0456\u045c\u0468\u046c"+
		"\u0471\u0475\u0478\u048a\u048f\u0494\u049c\u04a1\u04aa\u04b1\u04b5\u04c5"+
		"\u04c8\u04d0\u04d9\u04dd\u04e2\u0500\u050c\u0511\u051d\u0523\u052a\u052e"+
		"\u0538\u053b\u0541\u0544\u0546\u0548\u0553\u0558\u0564\u0568\u056c\u0570"+
		"\u0577\u0579\u0581\u0588\u058b\u058f\u0594\u059c\u05af\u05b5\u05b9\u05c9"+
		"\u05cf\u05d7\u05dc\u05df\u05e4\u05ed\u05f2\u0600\u0603\u0605\u060a\u060e"+
		"\u0611\u0618\u0620\u0624\u0628\u062b\u0631\u0634\u0636\u063f\u0644\u0648"+
		"\u064c\u064f\u065a\u065f\u0663\u066a\u0673\u0677\u0679\u067d\u0686\u068b"+
		"\u068d\u0696\u06a1\u06a8\u06ab\u06b2\u06bb\u06c0\u06c3\u06cf\u06fe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}