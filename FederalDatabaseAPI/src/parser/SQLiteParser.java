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

@SuppressWarnings(
{
    "all", "warnings", "unchecked", "unused", "cast"
})
public class SQLiteParser extends Parser
{

    static
    {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache
            = new PredictionContextCache();
    public static final int SCOL = 1, DOT = 2, OPEN_PAR = 3, CLOSE_PAR = 4, COMMA = 5, ASSIGN = 6, STAR = 7, PLUS = 8,
            MINUS = 9, TILDE = 10, PIPE2 = 11, DIV = 12, MOD = 13, LT2 = 14, GT2 = 15, AMP = 16, PIPE = 17,
            LT = 18, LT_EQ = 19, GT = 20, GT_EQ = 21, EQ = 22, NOT_EQ1 = 23, NOT_EQ2 = 24, K_ABORT = 25,
            K_ACTION = 26, K_ADD = 27, K_AFTER = 28, K_ALL = 29, K_ALTER = 30, K_SET = 31, K_ECHO = 32,
            K_ON = 33, K_OFF = 34, K_ANALYZE = 35, K_AND = 36, K_AS = 37, K_ASC = 38, K_ATTACH = 39,
            K_AUTOINCREMENT = 40, K_BEFORE = 41, K_BEGIN = 42, K_BETWEEN = 43, K_BY = 44, K_CASCADE = 45,
            K_CASE = 46, K_CAST = 47, K_CHECK = 48, K_COLLATE = 49, K_COLUMN = 50, K_COMMIT = 51,
            K_CONFLICT = 52, K_CONSTRAINT = 53, K_CONSTRAINTS = 54, K_CREATE = 55, K_VERTICAL = 56,
            K_HORIZONTAL = 57, K_CROSS = 58, K_CURRENT_DATE = 59, K_CURRENT_TIME = 60, K_CURRENT_TIMESTAMP = 61,
            K_DATABASE = 62, K_DEFAULT = 63, K_DEFERRABLE = 64, K_DEFERRED = 65, K_DELETE = 66,
            K_DESC = 67, K_DETACH = 68, K_DISTINCT = 69, K_DROP = 70, K_EACH = 71, K_ELSE = 72,
            K_END = 73, K_ESCAPE = 74, K_EXCEPT = 75, K_EXCLUSIVE = 76, K_EXISTS = 77, K_EXPLAIN = 78,
            K_FAIL = 79, K_FOR = 80, K_FOREIGN = 81, K_FROM = 82, K_FULL = 83, K_GLOB = 84, K_GROUP = 85,
            K_HAVING = 86, K_IF = 87, K_IGNORE = 88, K_IMMEDIATE = 89, K_IN = 90, K_INDEX = 91,
            K_INDEXED = 92, K_INITIALLY = 93, K_INNER = 94, K_INSERT = 95, K_INSTEAD = 96, K_INTERSECT = 97,
            K_INTO = 98, K_IS = 99, K_ISNULL = 100, K_JOIN = 101, K_KEY = 102, K_LEFT = 103, K_LIKE = 104,
            K_LIMIT = 105, K_MATCH = 106, K_NATURAL = 107, K_NO = 108, K_NOT = 109, K_NOTNULL = 110,
            K_NULL = 111, K_OF = 112, K_OFFSET = 113, K_OR = 114, K_ORDER = 115, K_OUTER = 116,
            K_PLAN = 117, K_PRAGMA = 118, K_PRIMARY = 119, K_QUERY = 120, K_RAISE = 121, K_RECURSIVE = 122,
            K_REFERENCES = 123, K_REGEXP = 124, K_REINDEX = 125, K_RELEASE = 126, K_RENAME = 127,
            K_REPLACE = 128, K_RESTRICT = 129, K_RIGHT = 130, K_ROLLBACK = 131, K_ROW = 132,
            K_SAVEPOINT = 133, K_SELECT = 134, K_SESSION = 135, K_TABLE = 136, K_TEMP = 137,
            K_TEMPORARY = 138, K_THEN = 139, K_TO = 140, K_TRANSACTION = 141, K_TRIGGER = 142,
            K_UNION = 143, K_UNIQUE = 144, K_UPDATE = 145, K_USING = 146, K_VACUUM = 147, K_VALUES = 148,
            K_VIEW = 149, K_VIRTUAL = 150, K_WHEN = 151, K_WHERE = 152, K_WITH = 153, K_WITHOUT = 154,
            IDENTIFIER = 155, NUMERIC_LITERAL = 156, BIND_PARAMETER = 157, STRING_LITERAL = 158,
            BLOB_LITERAL = 159, SINGLE_LINE_COMMENT = 160, MULTILINE_COMMENT = 161, SPACES = 162,
            UNEXPECTED_CHAR = 163;
    public static final int RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3,
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
            RULE_select_core = 66, RULE_select_core_groud_by = 67, RULE_select_core_where = 68,
            RULE_compound_operator = 69, RULE_cte_table_name = 70, RULE_signed_number = 71,
            RULE_literal_value = 72, RULE_unary_operator = 73, RULE_error_message = 74,
            RULE_module_argument = 75, RULE_column_alias = 76, RULE_keyword = 77,
            RULE_name = 78, RULE_function_name = 79, RULE_database_name = 80, RULE_table_name = 81,
            RULE_table_or_index_name = 82, RULE_new_table_name = 83, RULE_column_name = 84,
            RULE_collation_name = 85, RULE_foreign_table = 86, RULE_index_name = 87,
            RULE_trigger_name = 88, RULE_view_name = 89, RULE_module_name = 90, RULE_pragma_name = 91,
            RULE_savepoint_name = 92, RULE_table_alias = 93, RULE_transaction_name = 94,
            RULE_any_name = 95;
    public static final String[] ruleNames =
    {
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
        "join_operator", "join_constraint", "select_core", "select_core_groud_by",
        "select_core_where", "compound_operator", "cte_table_name", "signed_number",
        "literal_value", "unary_operator", "error_message", "module_argument",
        "column_alias", "keyword", "name", "function_name", "database_name", "table_name",
        "table_or_index_name", "new_table_name", "column_name", "collation_name",
        "foreign_table", "index_name", "trigger_name", "view_name", "module_name",
        "pragma_name", "savepoint_name", "table_alias", "transaction_name", "any_name"
    };

    private static final String[] _LITERAL_NAMES =
    {
        null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", "'~'",
        "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'",
        "'>='", "'=='", "'!='", "'<>'"
    };
    private static final String[] _SYMBOLIC_NAMES =
    {
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

    static
    {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++)
        {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null)
            {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null)
            {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames()
    {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary()
    {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName()
    {
        return "SQLite.g4";
    }

    @Override
    public String[] getRuleNames()
    {
        return ruleNames;
    }

    @Override
    public String getSerializedATN()
    {
        return _serializedATN;
    }

    @Override
    public ATN getATN()
    {
        return _ATN;
    }

    public SQLiteParser(TokenStream input)
    {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class ParseContext extends ParserRuleContext
    {

        public TerminalNode EOF()
        {
            return getToken(SQLiteParser.EOF, 0);
        }

        public List<Sql_stmt_listContext> sql_stmt_list()
        {
            return getRuleContexts(Sql_stmt_listContext.class);
        }

        public Sql_stmt_listContext sql_stmt_list(int i)
        {
            return getRuleContext(Sql_stmt_listContext.class, i);
        }

        public List<ErrorContext> error()
        {
            return getRuleContexts(ErrorContext.class);
        }

        public ErrorContext error(int i)
        {
            return getRuleContext(ErrorContext.class, i);
        }

        public ParseContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_parse;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterParse(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitParse(this);
            }
        }
    }

    public final ParseContext parse() throws RecognitionException
    {
        ParseContext _localctx = new ParseContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_parse);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(196);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_SET) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (K_DELETE - 66)) | (1L << (K_DETACH - 66)) | (1L << (K_DROP - 66)) | (1L << (K_END - 66)) | (1L << (K_EXPLAIN - 66)) | (1L << (K_INSERT - 66)) | (1L << (K_PRAGMA - 66)) | (1L << (K_REINDEX - 66)) | (1L << (K_RELEASE - 66)) | (1L << (K_REPLACE - 66)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (K_ROLLBACK - 131)) | (1L << (K_SAVEPOINT - 131)) | (1L << (K_SELECT - 131)) | (1L << (K_UPDATE - 131)) | (1L << (K_VACUUM - 131)) | (1L << (K_WITH - 131)) | (1L << (UNEXPECTED_CHAR - 131)))) != 0))
                {
                    {
                        setState(194);
                        _errHandler.sync(this);
                        switch (_input.LA(1))
                        {
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
                            case K_WITH:
                            {
                                setState(192);
                                sql_stmt_list();
                            }
                            break;
                            case UNEXPECTED_CHAR:
                            {
                                setState(193);
                                error();
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                    }
                    setState(198);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(199);
                match(EOF);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class ErrorContext extends ParserRuleContext
    {

        public Token UNEXPECTED_CHAR;

        public TerminalNode UNEXPECTED_CHAR()
        {
            return getToken(SQLiteParser.UNEXPECTED_CHAR, 0);
        }

        public ErrorContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_error;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterError(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitError(this);
            }
        }
    }

    public final ErrorContext error() throws RecognitionException
    {
        ErrorContext _localctx = new ErrorContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_error);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(201);
                ((ErrorContext) _localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

                throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext) _localctx).UNEXPECTED_CHAR != null ? ((ErrorContext) _localctx).UNEXPECTED_CHAR.getText() : null));

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Sql_stmt_listContext extends ParserRuleContext
    {

        public List<Sql_stmtContext> sql_stmt()
        {
            return getRuleContexts(Sql_stmtContext.class);
        }

        public Sql_stmtContext sql_stmt(int i)
        {
            return getRuleContext(Sql_stmtContext.class, i);
        }

        public Sql_stmt_listContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_sql_stmt_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterSql_stmt_list(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitSql_stmt_list(this);
            }
        }
    }

    public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException
    {
        Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_sql_stmt_list);
        int _la;
        try
        {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(207);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == SCOL)
                {
                    {
                        {
                            setState(204);
                            match(SCOL);
                        }
                    }
                    setState(209);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(210);
                sql_stmt();
                setState(219);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER)
                {
                    if (_alt == 1)
                    {
                        {
                            {
                                setState(212);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                do
                                {
                                    {
                                        {
                                            setState(211);
                                            match(SCOL);
                                        }
                                    }
                                    setState(214);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                } while (_la == SCOL);
                                setState(216);
                                sql_stmt();
                            }
                        }
                    }
                    setState(221);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
                }
                setState(225);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER)
                {
                    if (_alt == 1)
                    {
                        {
                            {
                                setState(222);
                                match(SCOL);
                            }
                        }
                    }
                    setState(227);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Sql_stmtContext extends ParserRuleContext
    {

        public Analyze_stmtContext analyze_stmt()
        {
            return getRuleContext(Analyze_stmtContext.class, 0);
        }

        public Attach_stmtContext attach_stmt()
        {
            return getRuleContext(Attach_stmtContext.class, 0);
        }

        public Begin_stmtContext begin_stmt()
        {
            return getRuleContext(Begin_stmtContext.class, 0);
        }

        public Commit_stmtContext commit_stmt()
        {
            return getRuleContext(Commit_stmtContext.class, 0);
        }

        public Create_index_stmtContext create_index_stmt()
        {
            return getRuleContext(Create_index_stmtContext.class, 0);
        }

        public Create_table_stmtContext create_table_stmt()
        {
            return getRuleContext(Create_table_stmtContext.class, 0);
        }

        public Create_trigger_stmtContext create_trigger_stmt()
        {
            return getRuleContext(Create_trigger_stmtContext.class, 0);
        }

        public Create_view_stmtContext create_view_stmt()
        {
            return getRuleContext(Create_view_stmtContext.class, 0);
        }

        public Create_virtual_table_stmtContext create_virtual_table_stmt()
        {
            return getRuleContext(Create_virtual_table_stmtContext.class, 0);
        }

        public Delete_stmtContext delete_stmt()
        {
            return getRuleContext(Delete_stmtContext.class, 0);
        }

        public Delete_stmt_limitedContext delete_stmt_limited()
        {
            return getRuleContext(Delete_stmt_limitedContext.class, 0);
        }

        public Detach_stmtContext detach_stmt()
        {
            return getRuleContext(Detach_stmtContext.class, 0);
        }

        public Drop_index_stmtContext drop_index_stmt()
        {
            return getRuleContext(Drop_index_stmtContext.class, 0);
        }

        public Drop_table_stmtContext drop_table_stmt()
        {
            return getRuleContext(Drop_table_stmtContext.class, 0);
        }

        public Drop_trigger_stmtContext drop_trigger_stmt()
        {
            return getRuleContext(Drop_trigger_stmtContext.class, 0);
        }

        public Drop_view_stmtContext drop_view_stmt()
        {
            return getRuleContext(Drop_view_stmtContext.class, 0);
        }

        public Factored_select_stmtContext factored_select_stmt()
        {
            return getRuleContext(Factored_select_stmtContext.class, 0);
        }

        public Insert_stmtContext insert_stmt()
        {
            return getRuleContext(Insert_stmtContext.class, 0);
        }

        public Pragma_stmtContext pragma_stmt()
        {
            return getRuleContext(Pragma_stmtContext.class, 0);
        }

        public Reindex_stmtContext reindex_stmt()
        {
            return getRuleContext(Reindex_stmtContext.class, 0);
        }

        public Release_stmtContext release_stmt()
        {
            return getRuleContext(Release_stmtContext.class, 0);
        }

        public Rollback_stmtContext rollback_stmt()
        {
            return getRuleContext(Rollback_stmtContext.class, 0);
        }

        public Savepoint_stmtContext savepoint_stmt()
        {
            return getRuleContext(Savepoint_stmtContext.class, 0);
        }

        public Update_stmtContext update_stmt()
        {
            return getRuleContext(Update_stmtContext.class, 0);
        }

        public Update_stmt_limitedContext update_stmt_limited()
        {
            return getRuleContext(Update_stmt_limitedContext.class, 0);
        }

        public Vacuum_stmtContext vacuum_stmt()
        {
            return getRuleContext(Vacuum_stmtContext.class, 0);
        }

        public Set_stmtContext set_stmt()
        {
            return getRuleContext(Set_stmtContext.class, 0);
        }

        public Alter_stmtContext alter_stmt()
        {
            return getRuleContext(Alter_stmtContext.class, 0);
        }

        public TerminalNode K_EXPLAIN()
        {
            return getToken(SQLiteParser.K_EXPLAIN, 0);
        }

        public TerminalNode K_QUERY()
        {
            return getToken(SQLiteParser.K_QUERY, 0);
        }

        public TerminalNode K_PLAN()
        {
            return getToken(SQLiteParser.K_PLAN, 0);
        }

        public Sql_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_sql_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterSql_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitSql_stmt(this);
            }
        }
    }

    public final Sql_stmtContext sql_stmt() throws RecognitionException
    {
        Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_sql_stmt);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(233);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_EXPLAIN)
                {
                    {
                        setState(228);
                        match(K_EXPLAIN);
                        setState(231);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == K_QUERY)
                        {
                            {
                                setState(229);
                                match(K_QUERY);
                                setState(230);
                                match(K_PLAN);
                            }
                        }

                    }
                }

                setState(263);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 8, _ctx))
                {
                    case 1:
                    {
                        setState(235);
                        analyze_stmt();
                    }
                    break;
                    case 2:
                    {
                        setState(236);
                        attach_stmt();
                    }
                    break;
                    case 3:
                    {
                        setState(237);
                        begin_stmt();
                    }
                    break;
                    case 4:
                    {
                        setState(238);
                        commit_stmt();
                    }
                    break;
                    case 5:
                    {
                        setState(239);
                        create_index_stmt();
                    }
                    break;
                    case 6:
                    {
                        setState(240);
                        create_table_stmt();
                    }
                    break;
                    case 7:
                    {
                        setState(241);
                        create_trigger_stmt();
                    }
                    break;
                    case 8:
                    {
                        setState(242);
                        create_view_stmt();
                    }
                    break;
                    case 9:
                    {
                        setState(243);
                        create_virtual_table_stmt();
                    }
                    break;
                    case 10:
                    {
                        setState(244);
                        delete_stmt();
                    }
                    break;
                    case 11:
                    {
                        setState(245);
                        delete_stmt_limited();
                    }
                    break;
                    case 12:
                    {
                        setState(246);
                        detach_stmt();
                    }
                    break;
                    case 13:
                    {
                        setState(247);
                        drop_index_stmt();
                    }
                    break;
                    case 14:
                    {
                        setState(248);
                        drop_table_stmt();
                    }
                    break;
                    case 15:
                    {
                        setState(249);
                        drop_trigger_stmt();
                    }
                    break;
                    case 16:
                    {
                        setState(250);
                        drop_view_stmt();
                    }
                    break;
                    case 17:
                    {
                        setState(251);
                        factored_select_stmt();
                    }
                    break;
                    case 18:
                    {
                        setState(252);
                        insert_stmt();
                    }
                    break;
                    case 19:
                    {
                        setState(253);
                        pragma_stmt();
                    }
                    break;
                    case 20:
                    {
                        setState(254);
                        reindex_stmt();
                    }
                    break;
                    case 21:
                    {
                        setState(255);
                        release_stmt();
                    }
                    break;
                    case 22:
                    {
                        setState(256);
                        rollback_stmt();
                    }
                    break;
                    case 23:
                    {
                        setState(257);
                        savepoint_stmt();
                    }
                    break;
                    case 24:
                    {
                        setState(258);
                        update_stmt();
                    }
                    break;
                    case 25:
                    {
                        setState(259);
                        update_stmt_limited();
                    }
                    break;
                    case 26:
                    {
                        setState(260);
                        vacuum_stmt();
                    }
                    break;
                    case 27:
                    {
                        setState(261);
                        set_stmt();
                    }
                    break;
                    case 28:
                    {
                        setState(262);
                        alter_stmt();
                    }
                    break;
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Alter_stmtContext extends ParserRuleContext
    {

        public Alter_table_stmtContext alter_table_stmt()
        {
            return getRuleContext(Alter_table_stmtContext.class, 0);
        }

        public Alter_session_stmtContext alter_session_stmt()
        {
            return getRuleContext(Alter_session_stmtContext.class, 0);
        }

        public Alter_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_alter_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterAlter_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitAlter_stmt(this);
            }
        }
    }

    public final Alter_stmtContext alter_stmt() throws RecognitionException
    {
        Alter_stmtContext _localctx = new Alter_stmtContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_alter_stmt);
        try
        {
            setState(267);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 9, _ctx))
            {
                case 1:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(265);
                        alter_table_stmt();
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(266);
                        alter_session_stmt();
                    }
                    break;
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Alter_session_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_ALTER()
        {
            return getToken(SQLiteParser.K_ALTER, 0);
        }

        public TerminalNode K_SESSION()
        {
            return getToken(SQLiteParser.K_SESSION, 0);
        }

        public TerminalNode K_SET()
        {
            return getToken(SQLiteParser.K_SET, 0);
        }

        public List<Any_nameContext> any_name()
        {
            return getRuleContexts(Any_nameContext.class);
        }

        public Any_nameContext any_name(int i)
        {
            return getRuleContext(Any_nameContext.class, i);
        }

        public Alter_session_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_alter_session_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterAlter_session_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitAlter_session_stmt(this);
            }
        }
    }

    public final Alter_session_stmtContext alter_session_stmt() throws RecognitionException
    {
        Alter_session_stmtContext _localctx = new Alter_session_stmtContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_alter_session_stmt);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(269);
                match(K_ALTER);
                setState(270);
                match(K_SESSION);
                setState(271);
                match(K_SET);
                setState(272);
                any_name();
                setState(273);
                match(ASSIGN);
                setState(274);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Set_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_SET()
        {
            return getToken(SQLiteParser.K_SET, 0);
        }

        public Set_keywordContext set_keyword()
        {
            return getRuleContext(Set_keywordContext.class, 0);
        }

        public Set_valueContext set_value()
        {
            return getRuleContext(Set_valueContext.class, 0);
        }

        public Set_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_set_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterSet_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitSet_stmt(this);
            }
        }
    }

    public final Set_stmtContext set_stmt() throws RecognitionException
    {
        Set_stmtContext _localctx = new Set_stmtContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_set_stmt);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(276);
                match(K_SET);
                setState(277);
                set_keyword();
                setState(278);
                set_value();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Set_keywordContext extends ParserRuleContext
    {

        public TerminalNode K_ECHO()
        {
            return getToken(SQLiteParser.K_ECHO, 0);
        }

        public Set_keywordContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_set_keyword;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterSet_keyword(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitSet_keyword(this);
            }
        }
    }

    public final Set_keywordContext set_keyword() throws RecognitionException
    {
        Set_keywordContext _localctx = new Set_keywordContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_set_keyword);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(280);
                match(K_ECHO);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Set_valueContext extends ParserRuleContext
    {

        public TerminalNode K_ON()
        {
            return getToken(SQLiteParser.K_ON, 0);
        }

        public TerminalNode K_OFF()
        {
            return getToken(SQLiteParser.K_OFF, 0);
        }

        public Set_valueContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_set_value;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterSet_value(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitSet_value(this);
            }
        }
    }

    public final Set_valueContext set_value() throws RecognitionException
    {
        Set_valueContext _localctx = new Set_valueContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_set_value);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(282);
                _la = _input.LA(1);
                if (!(_la == K_ON || _la == K_OFF))
                {
                    _errHandler.recoverInline(this);
                } else
                {
                    if (_input.LA(1) == Token.EOF)
                    {
                        matchedEOF = true;
                    }
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Alter_table_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_ALTER()
        {
            return getToken(SQLiteParser.K_ALTER, 0);
        }

        public TerminalNode K_TABLE()
        {
            return getToken(SQLiteParser.K_TABLE, 0);
        }

        public Table_nameContext table_name()
        {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public TerminalNode K_RENAME()
        {
            return getToken(SQLiteParser.K_RENAME, 0);
        }

        public TerminalNode K_TO()
        {
            return getToken(SQLiteParser.K_TO, 0);
        }

        public New_table_nameContext new_table_name()
        {
            return getRuleContext(New_table_nameContext.class, 0);
        }

        public TerminalNode K_ADD()
        {
            return getToken(SQLiteParser.K_ADD, 0);
        }

        public Column_defContext column_def()
        {
            return getRuleContext(Column_defContext.class, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public TerminalNode K_COLUMN()
        {
            return getToken(SQLiteParser.K_COLUMN, 0);
        }

        public Alter_table_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_alter_table_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterAlter_table_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitAlter_table_stmt(this);
            }
        }
    }

    public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException
    {
        Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_alter_table_stmt);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(284);
                match(K_ALTER);
                setState(285);
                match(K_TABLE);
                setState(289);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 10, _ctx))
                {
                    case 1:
                    {
                        setState(286);
                        database_name();
                        setState(287);
                        match(DOT);
                    }
                    break;
                }
                setState(291);
                table_name();
                setState(300);
                _errHandler.sync(this);
                switch (_input.LA(1))
                {
                    case K_RENAME:
                    {
                        setState(292);
                        match(K_RENAME);
                        setState(293);
                        match(K_TO);
                        setState(294);
                        new_table_name();
                    }
                    break;
                    case K_ADD:
                    {
                        setState(295);
                        match(K_ADD);
                        setState(297);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 11, _ctx))
                        {
                            case 1:
                            {
                                setState(296);
                                match(K_COLUMN);
                            }
                            break;
                        }
                        setState(299);
                        column_def();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Analyze_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_ANALYZE()
        {
            return getToken(SQLiteParser.K_ANALYZE, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public Table_or_index_nameContext table_or_index_name()
        {
            return getRuleContext(Table_or_index_nameContext.class, 0);
        }

        public Analyze_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_analyze_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterAnalyze_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitAnalyze_stmt(this);
            }
        }
    }

    public final Analyze_stmtContext analyze_stmt() throws RecognitionException
    {
        Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_analyze_stmt);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(302);
                match(K_ANALYZE);
                setState(309);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 13, _ctx))
                {
                    case 1:
                    {
                        setState(303);
                        database_name();
                    }
                    break;
                    case 2:
                    {
                        setState(304);
                        table_or_index_name();
                    }
                    break;
                    case 3:
                    {
                        setState(305);
                        database_name();
                        setState(306);
                        match(DOT);
                        setState(307);
                        table_or_index_name();
                    }
                    break;
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Attach_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_ATTACH()
        {
            return getToken(SQLiteParser.K_ATTACH, 0);
        }

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode K_AS()
        {
            return getToken(SQLiteParser.K_AS, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public TerminalNode K_DATABASE()
        {
            return getToken(SQLiteParser.K_DATABASE, 0);
        }

        public Attach_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_attach_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterAttach_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitAttach_stmt(this);
            }
        }
    }

    public final Attach_stmtContext attach_stmt() throws RecognitionException
    {
        Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_attach_stmt);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(311);
                match(K_ATTACH);
                setState(313);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 14, _ctx))
                {
                    case 1:
                    {
                        setState(312);
                        match(K_DATABASE);
                    }
                    break;
                }
                setState(315);
                expr(0);
                setState(316);
                match(K_AS);
                setState(317);
                database_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Begin_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_BEGIN()
        {
            return getToken(SQLiteParser.K_BEGIN, 0);
        }

        public TerminalNode K_TRANSACTION()
        {
            return getToken(SQLiteParser.K_TRANSACTION, 0);
        }

        public TerminalNode K_DEFERRED()
        {
            return getToken(SQLiteParser.K_DEFERRED, 0);
        }

        public TerminalNode K_IMMEDIATE()
        {
            return getToken(SQLiteParser.K_IMMEDIATE, 0);
        }

        public TerminalNode K_EXCLUSIVE()
        {
            return getToken(SQLiteParser.K_EXCLUSIVE, 0);
        }

        public Transaction_nameContext transaction_name()
        {
            return getRuleContext(Transaction_nameContext.class, 0);
        }

        public Begin_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_begin_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterBegin_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitBegin_stmt(this);
            }
        }
    }

    public final Begin_stmtContext begin_stmt() throws RecognitionException
    {
        Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_begin_stmt);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(319);
                match(K_BEGIN);
                setState(321);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_DEFERRED - 65)) | (1L << (K_EXCLUSIVE - 65)) | (1L << (K_IMMEDIATE - 65)))) != 0))
                {
                    {
                        setState(320);
                        _la = _input.LA(1);
                        if (!(((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_DEFERRED - 65)) | (1L << (K_EXCLUSIVE - 65)) | (1L << (K_IMMEDIATE - 65)))) != 0)))
                        {
                            _errHandler.recoverInline(this);
                        } else
                        {
                            if (_input.LA(1) == Token.EOF)
                            {
                                matchedEOF = true;
                            }
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

                setState(327);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_TRANSACTION)
                {
                    {
                        setState(323);
                        match(K_TRANSACTION);
                        setState(325);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 16, _ctx))
                        {
                            case 1:
                            {
                                setState(324);
                                transaction_name();
                            }
                            break;
                        }
                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Commit_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_COMMIT()
        {
            return getToken(SQLiteParser.K_COMMIT, 0);
        }

        public TerminalNode K_END()
        {
            return getToken(SQLiteParser.K_END, 0);
        }

        public TerminalNode K_TRANSACTION()
        {
            return getToken(SQLiteParser.K_TRANSACTION, 0);
        }

        public Transaction_nameContext transaction_name()
        {
            return getRuleContext(Transaction_nameContext.class, 0);
        }

        public Commit_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_commit_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterCommit_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitCommit_stmt(this);
            }
        }
    }

    public final Commit_stmtContext commit_stmt() throws RecognitionException
    {
        Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_commit_stmt);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(329);
                _la = _input.LA(1);
                if (!(_la == K_COMMIT || _la == K_END))
                {
                    _errHandler.recoverInline(this);
                } else
                {
                    if (_input.LA(1) == Token.EOF)
                    {
                        matchedEOF = true;
                    }
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(334);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_TRANSACTION)
                {
                    {
                        setState(330);
                        match(K_TRANSACTION);
                        setState(332);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 18, _ctx))
                        {
                            case 1:
                            {
                                setState(331);
                                transaction_name();
                            }
                            break;
                        }
                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Compound_select_stmtContext extends ParserRuleContext
    {

        public List<Select_coreContext> select_core()
        {
            return getRuleContexts(Select_coreContext.class);
        }

        public Select_coreContext select_core(int i)
        {
            return getRuleContext(Select_coreContext.class, i);
        }

        public TerminalNode K_WITH()
        {
            return getToken(SQLiteParser.K_WITH, 0);
        }

        public List<Common_table_expressionContext> common_table_expression()
        {
            return getRuleContexts(Common_table_expressionContext.class);
        }

        public Common_table_expressionContext common_table_expression(int i)
        {
            return getRuleContext(Common_table_expressionContext.class, i);
        }

        public TerminalNode K_ORDER()
        {
            return getToken(SQLiteParser.K_ORDER, 0);
        }

        public TerminalNode K_BY()
        {
            return getToken(SQLiteParser.K_BY, 0);
        }

        public List<Ordering_termContext> ordering_term()
        {
            return getRuleContexts(Ordering_termContext.class);
        }

        public Ordering_termContext ordering_term(int i)
        {
            return getRuleContext(Ordering_termContext.class, i);
        }

        public TerminalNode K_LIMIT()
        {
            return getToken(SQLiteParser.K_LIMIT, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        public List<TerminalNode> K_UNION()
        {
            return getTokens(SQLiteParser.K_UNION);
        }

        public TerminalNode K_UNION(int i)
        {
            return getToken(SQLiteParser.K_UNION, i);
        }

        public List<TerminalNode> K_INTERSECT()
        {
            return getTokens(SQLiteParser.K_INTERSECT);
        }

        public TerminalNode K_INTERSECT(int i)
        {
            return getToken(SQLiteParser.K_INTERSECT, i);
        }

        public List<TerminalNode> K_EXCEPT()
        {
            return getTokens(SQLiteParser.K_EXCEPT);
        }

        public TerminalNode K_EXCEPT(int i)
        {
            return getToken(SQLiteParser.K_EXCEPT, i);
        }

        public TerminalNode K_RECURSIVE()
        {
            return getToken(SQLiteParser.K_RECURSIVE, 0);
        }

        public TerminalNode K_OFFSET()
        {
            return getToken(SQLiteParser.K_OFFSET, 0);
        }

        public List<TerminalNode> K_ALL()
        {
            return getTokens(SQLiteParser.K_ALL);
        }

        public TerminalNode K_ALL(int i)
        {
            return getToken(SQLiteParser.K_ALL, i);
        }

        public Compound_select_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_compound_select_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterCompound_select_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitCompound_select_stmt(this);
            }
        }
    }

    public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException
    {
        Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_compound_select_stmt);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(348);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_WITH)
                {
                    {
                        setState(336);
                        match(K_WITH);
                        setState(338);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 20, _ctx))
                        {
                            case 1:
                            {
                                setState(337);
                                match(K_RECURSIVE);
                            }
                            break;
                        }
                        setState(340);
                        common_table_expression();
                        setState(345);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(341);
                                    match(COMMA);
                                    setState(342);
                                    common_table_expression();
                                }
                            }
                            setState(347);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(350);
                select_core();
                setState(360);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do
                {
                    {
                        {
                            setState(357);
                            _errHandler.sync(this);
                            switch (_input.LA(1))
                            {
                                case K_UNION:
                                {
                                    setState(351);
                                    match(K_UNION);
                                    setState(353);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la == K_ALL)
                                    {
                                        {
                                            setState(352);
                                            match(K_ALL);
                                        }
                                    }

                                }
                                break;
                                case K_INTERSECT:
                                {
                                    setState(355);
                                    match(K_INTERSECT);
                                }
                                break;
                                case K_EXCEPT:
                                {
                                    setState(356);
                                    match(K_EXCEPT);
                                }
                                break;
                                default:
                                    throw new NoViableAltException(this);
                            }
                            setState(359);
                            select_core();
                        }
                    }
                    setState(362);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (_la == K_EXCEPT || _la == K_INTERSECT || _la == K_UNION);
                setState(374);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_ORDER)
                {
                    {
                        setState(364);
                        match(K_ORDER);
                        setState(365);
                        match(K_BY);
                        setState(366);
                        ordering_term();
                        setState(371);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(367);
                                    match(COMMA);
                                    setState(368);
                                    ordering_term();
                                }
                            }
                            setState(373);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(382);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_LIMIT)
                {
                    {
                        setState(376);
                        match(K_LIMIT);
                        setState(377);
                        expr(0);
                        setState(380);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == COMMA || _la == K_OFFSET)
                        {
                            {
                                setState(378);
                                _la = _input.LA(1);
                                if (!(_la == COMMA || _la == K_OFFSET))
                                {
                                    _errHandler.recoverInline(this);
                                } else
                                {
                                    if (_input.LA(1) == Token.EOF)
                                    {
                                        matchedEOF = true;
                                    }
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(379);
                                expr(0);
                            }
                        }

                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Create_index_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_CREATE()
        {
            return getToken(SQLiteParser.K_CREATE, 0);
        }

        public TerminalNode K_INDEX()
        {
            return getToken(SQLiteParser.K_INDEX, 0);
        }

        public Index_nameContext index_name()
        {
            return getRuleContext(Index_nameContext.class, 0);
        }

        public TerminalNode K_ON()
        {
            return getToken(SQLiteParser.K_ON, 0);
        }

        public Table_nameContext table_name()
        {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public List<Indexed_columnContext> indexed_column()
        {
            return getRuleContexts(Indexed_columnContext.class);
        }

        public Indexed_columnContext indexed_column(int i)
        {
            return getRuleContext(Indexed_columnContext.class, i);
        }

        public TerminalNode K_UNIQUE()
        {
            return getToken(SQLiteParser.K_UNIQUE, 0);
        }

        public TerminalNode K_IF()
        {
            return getToken(SQLiteParser.K_IF, 0);
        }

        public TerminalNode K_NOT()
        {
            return getToken(SQLiteParser.K_NOT, 0);
        }

        public TerminalNode K_EXISTS()
        {
            return getToken(SQLiteParser.K_EXISTS, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public TerminalNode K_WHERE()
        {
            return getToken(SQLiteParser.K_WHERE, 0);
        }

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        public Create_index_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_create_index_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterCreate_index_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitCreate_index_stmt(this);
            }
        }
    }

    public final Create_index_stmtContext create_index_stmt() throws RecognitionException
    {
        Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_create_index_stmt);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(384);
                match(K_CREATE);
                setState(386);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_UNIQUE)
                {
                    {
                        setState(385);
                        match(K_UNIQUE);
                    }
                }

                setState(388);
                match(K_INDEX);
                setState(392);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 31, _ctx))
                {
                    case 1:
                    {
                        setState(389);
                        match(K_IF);
                        setState(390);
                        match(K_NOT);
                        setState(391);
                        match(K_EXISTS);
                    }
                    break;
                }
                setState(397);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 32, _ctx))
                {
                    case 1:
                    {
                        setState(394);
                        database_name();
                        setState(395);
                        match(DOT);
                    }
                    break;
                }
                setState(399);
                index_name();
                setState(400);
                match(K_ON);
                setState(401);
                table_name();
                setState(402);
                match(OPEN_PAR);
                setState(403);
                indexed_column();
                setState(408);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA)
                {
                    {
                        {
                            setState(404);
                            match(COMMA);
                            setState(405);
                            indexed_column();
                        }
                    }
                    setState(410);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(411);
                match(CLOSE_PAR);
                setState(414);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_WHERE)
                {
                    {
                        setState(412);
                        match(K_WHERE);
                        setState(413);
                        expr(0);
                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Create_table_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_CREATE()
        {
            return getToken(SQLiteParser.K_CREATE, 0);
        }

        public TerminalNode K_TABLE()
        {
            return getToken(SQLiteParser.K_TABLE, 0);
        }

        public Table_nameContext table_name()
        {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public List<Column_defContext> column_def()
        {
            return getRuleContexts(Column_defContext.class);
        }

        public Column_defContext column_def(int i)
        {
            return getRuleContext(Column_defContext.class, i);
        }

        public TerminalNode K_AS()
        {
            return getToken(SQLiteParser.K_AS, 0);
        }

        public Select_stmtContext select_stmt()
        {
            return getRuleContext(Select_stmtContext.class, 0);
        }

        public TerminalNode K_IF()
        {
            return getToken(SQLiteParser.K_IF, 0);
        }

        public TerminalNode K_NOT()
        {
            return getToken(SQLiteParser.K_NOT, 0);
        }

        public TerminalNode K_EXISTS()
        {
            return getToken(SQLiteParser.K_EXISTS, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public Federal_stmtContext federal_stmt()
        {
            return getRuleContext(Federal_stmtContext.class, 0);
        }

        public TerminalNode K_TEMP()
        {
            return getToken(SQLiteParser.K_TEMP, 0);
        }

        public TerminalNode K_TEMPORARY()
        {
            return getToken(SQLiteParser.K_TEMPORARY, 0);
        }

        public List<Table_constraintContext> table_constraint()
        {
            return getRuleContexts(Table_constraintContext.class);
        }

        public Table_constraintContext table_constraint(int i)
        {
            return getRuleContext(Table_constraintContext.class, i);
        }

        public TerminalNode K_WITHOUT()
        {
            return getToken(SQLiteParser.K_WITHOUT, 0);
        }

        public TerminalNode IDENTIFIER()
        {
            return getToken(SQLiteParser.IDENTIFIER, 0);
        }

        public Create_table_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_create_table_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterCreate_table_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitCreate_table_stmt(this);
            }
        }
    }

    public final Create_table_stmtContext create_table_stmt() throws RecognitionException
    {
        Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_create_table_stmt);
        int _la;
        try
        {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(416);
                match(K_CREATE);
                setState(418);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_TEMP || _la == K_TEMPORARY)
                {
                    {
                        setState(417);
                        _la = _input.LA(1);
                        if (!(_la == K_TEMP || _la == K_TEMPORARY))
                        {
                            _errHandler.recoverInline(this);
                        } else
                        {
                            if (_input.LA(1) == Token.EOF)
                            {
                                matchedEOF = true;
                            }
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

                setState(420);
                match(K_TABLE);
                setState(424);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 36, _ctx))
                {
                    case 1:
                    {
                        setState(421);
                        match(K_IF);
                        setState(422);
                        match(K_NOT);
                        setState(423);
                        match(K_EXISTS);
                    }
                    break;
                }
                setState(429);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 37, _ctx))
                {
                    case 1:
                    {
                        setState(426);
                        database_name();
                        setState(427);
                        match(DOT);
                    }
                    break;
                }
                setState(431);
                table_name();
                setState(455);
                _errHandler.sync(this);
                switch (_input.LA(1))
                {
                    case OPEN_PAR:
                    {
                        setState(432);
                        match(OPEN_PAR);
                        setState(433);
                        column_def();
                        setState(438);
                        _errHandler.sync(this);
                        _alt = getInterpreter().adaptivePredict(_input, 38, _ctx);
                        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER)
                        {
                            if (_alt == 1)
                            {
                                {
                                    {
                                        setState(434);
                                        match(COMMA);
                                        setState(435);
                                        column_def();
                                    }
                                }
                            }
                            setState(440);
                            _errHandler.sync(this);
                            _alt = getInterpreter().adaptivePredict(_input, 38, _ctx);
                        }
                        setState(445);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(441);
                                    match(COMMA);
                                    setState(442);
                                    table_constraint();
                                }
                            }
                            setState(447);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(448);
                        match(CLOSE_PAR);
                        setState(451);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == K_WITHOUT)
                        {
                            {
                                setState(449);
                                match(K_WITHOUT);
                                setState(450);
                                match(IDENTIFIER);
                            }
                        }

                    }
                    break;
                    case K_AS:
                    {
                        setState(453);
                        match(K_AS);
                        setState(454);
                        select_stmt();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(458);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_VERTICAL || _la == K_HORIZONTAL)
                {
                    {
                        setState(457);
                        federal_stmt();
                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Federal_stmtContext extends ParserRuleContext
    {

        public Fed_vertical_stmtContext fed_vertical_stmt()
        {
            return getRuleContext(Fed_vertical_stmtContext.class, 0);
        }

        public Fed_horizontal_stmtContext fed_horizontal_stmt()
        {
            return getRuleContext(Fed_horizontal_stmtContext.class, 0);
        }

        public Federal_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_federal_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterFederal_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitFederal_stmt(this);
            }
        }
    }

    public final Federal_stmtContext federal_stmt() throws RecognitionException
    {
        Federal_stmtContext _localctx = new Federal_stmtContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_federal_stmt);
        try
        {
            setState(462);
            _errHandler.sync(this);
            switch (_input.LA(1))
            {
                case K_VERTICAL:
                    enterOuterAlt(_localctx, 1);
                    {
                        {
                            setState(460);
                            fed_vertical_stmt();
                        }
                    }
                    break;
                case K_HORIZONTAL:
                    enterOuterAlt(_localctx, 2);
                    {
                        {
                            setState(461);
                            fed_horizontal_stmt();
                        }
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Fed_vertical_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_VERTICAL()
        {
            return getToken(SQLiteParser.K_VERTICAL, 0);
        }

        public List<Fed_vertical_attrContext> fed_vertical_attr()
        {
            return getRuleContexts(Fed_vertical_attrContext.class);
        }

        public Fed_vertical_attrContext fed_vertical_attr(int i)
        {
            return getRuleContext(Fed_vertical_attrContext.class, i);
        }

        public Fed_vertical_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_fed_vertical_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterFed_vertical_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitFed_vertical_stmt(this);
            }
        }
    }

    public final Fed_vertical_stmtContext fed_vertical_stmt() throws RecognitionException
    {
        Fed_vertical_stmtContext _localctx = new Fed_vertical_stmtContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_fed_vertical_stmt);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(464);
                match(K_VERTICAL);
                setState(465);
                match(OPEN_PAR);
                {
                    setState(466);
                    fed_vertical_attr();
                }
                setState(467);
                match(COMMA);
                {
                    setState(468);
                    fed_vertical_attr();
                }
                setState(471);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == COMMA)
                {
                    {
                        setState(469);
                        match(COMMA);
                        setState(470);
                        fed_vertical_attr();
                    }
                }

                setState(473);
                match(CLOSE_PAR);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Fed_vertical_attrContext extends ParserRuleContext
    {

        public List<Column_nameContext> column_name()
        {
            return getRuleContexts(Column_nameContext.class);
        }

        public Column_nameContext column_name(int i)
        {
            return getRuleContext(Column_nameContext.class, i);
        }

        public Fed_vertical_attrContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_fed_vertical_attr;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterFed_vertical_attr(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitFed_vertical_attr(this);
            }
        }
    }

    public final Fed_vertical_attrContext fed_vertical_attr() throws RecognitionException
    {
        Fed_vertical_attrContext _localctx = new Fed_vertical_attrContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_fed_vertical_attr);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(475);
                match(OPEN_PAR);
                setState(476);
                column_name();
                setState(481);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA)
                {
                    {
                        {
                            setState(477);
                            match(COMMA);
                            setState(478);
                            column_name();
                        }
                    }
                    setState(483);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(484);
                match(CLOSE_PAR);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Fed_horizontal_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_HORIZONTAL()
        {
            return getToken(SQLiteParser.K_HORIZONTAL, 0);
        }

        public Column_nameContext column_name()
        {
            return getRuleContext(Column_nameContext.class, 0);
        }

        public Fed_horizontal_attr_listContext fed_horizontal_attr_list()
        {
            return getRuleContext(Fed_horizontal_attr_listContext.class, 0);
        }

        public Fed_horizontal_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_fed_horizontal_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterFed_horizontal_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitFed_horizontal_stmt(this);
            }
        }
    }

    public final Fed_horizontal_stmtContext fed_horizontal_stmt() throws RecognitionException
    {
        Fed_horizontal_stmtContext _localctx = new Fed_horizontal_stmtContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_fed_horizontal_stmt);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(486);
                match(K_HORIZONTAL);
                setState(487);
                match(OPEN_PAR);
                setState(488);
                column_name();
                setState(489);
                match(OPEN_PAR);
                setState(490);
                fed_horizontal_attr_list();
                setState(491);
                match(CLOSE_PAR);
                setState(492);
                match(CLOSE_PAR);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Fed_horizontal_attr_listContext extends ParserRuleContext
    {

        public List<Fed_horizontal_attrContext> fed_horizontal_attr()
        {
            return getRuleContexts(Fed_horizontal_attrContext.class);
        }

        public Fed_horizontal_attrContext fed_horizontal_attr(int i)
        {
            return getRuleContext(Fed_horizontal_attrContext.class, i);
        }

        public Fed_horizontal_attr_listContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_fed_horizontal_attr_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterFed_horizontal_attr_list(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitFed_horizontal_attr_list(this);
            }
        }
    }

    public final Fed_horizontal_attr_listContext fed_horizontal_attr_list() throws RecognitionException
    {
        Fed_horizontal_attr_listContext _localctx = new Fed_horizontal_attr_listContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_fed_horizontal_attr_list);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(494);
                    fed_horizontal_attr();
                }
                setState(499);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA)
                {
                    {
                        {
                            setState(495);
                            match(COMMA);
                            setState(496);
                            fed_horizontal_attr();
                        }
                    }
                    setState(501);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Fed_horizontal_attrContext extends ParserRuleContext
    {

        public TerminalNode STRING_LITERAL()
        {
            return getToken(SQLiteParser.STRING_LITERAL, 0);
        }

        public TerminalNode NUMERIC_LITERAL()
        {
            return getToken(SQLiteParser.NUMERIC_LITERAL, 0);
        }

        public Fed_horizontal_attrContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_fed_horizontal_attr;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterFed_horizontal_attr(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitFed_horizontal_attr(this);
            }
        }
    }

    public final Fed_horizontal_attrContext fed_horizontal_attr() throws RecognitionException
    {
        Fed_horizontal_attrContext _localctx = new Fed_horizontal_attrContext(_ctx, getState());
        enterRule(_localctx, 44, RULE_fed_horizontal_attr);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(502);
                _la = _input.LA(1);
                if (!(_la == NUMERIC_LITERAL || _la == STRING_LITERAL))
                {
                    _errHandler.recoverInline(this);
                } else
                {
                    if (_input.LA(1) == Token.EOF)
                    {
                        matchedEOF = true;
                    }
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Create_trigger_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_CREATE()
        {
            return getToken(SQLiteParser.K_CREATE, 0);
        }

        public TerminalNode K_TRIGGER()
        {
            return getToken(SQLiteParser.K_TRIGGER, 0);
        }

        public Trigger_nameContext trigger_name()
        {
            return getRuleContext(Trigger_nameContext.class, 0);
        }

        public TerminalNode K_ON()
        {
            return getToken(SQLiteParser.K_ON, 0);
        }

        public Table_nameContext table_name()
        {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public TerminalNode K_BEGIN()
        {
            return getToken(SQLiteParser.K_BEGIN, 0);
        }

        public TerminalNode K_END()
        {
            return getToken(SQLiteParser.K_END, 0);
        }

        public TerminalNode K_DELETE()
        {
            return getToken(SQLiteParser.K_DELETE, 0);
        }

        public TerminalNode K_INSERT()
        {
            return getToken(SQLiteParser.K_INSERT, 0);
        }

        public TerminalNode K_UPDATE()
        {
            return getToken(SQLiteParser.K_UPDATE, 0);
        }

        public TerminalNode K_IF()
        {
            return getToken(SQLiteParser.K_IF, 0);
        }

        public TerminalNode K_NOT()
        {
            return getToken(SQLiteParser.K_NOT, 0);
        }

        public TerminalNode K_EXISTS()
        {
            return getToken(SQLiteParser.K_EXISTS, 0);
        }

        public List<Database_nameContext> database_name()
        {
            return getRuleContexts(Database_nameContext.class);
        }

        public Database_nameContext database_name(int i)
        {
            return getRuleContext(Database_nameContext.class, i);
        }

        public TerminalNode K_BEFORE()
        {
            return getToken(SQLiteParser.K_BEFORE, 0);
        }

        public TerminalNode K_AFTER()
        {
            return getToken(SQLiteParser.K_AFTER, 0);
        }

        public TerminalNode K_INSTEAD()
        {
            return getToken(SQLiteParser.K_INSTEAD, 0);
        }

        public List<TerminalNode> K_OF()
        {
            return getTokens(SQLiteParser.K_OF);
        }

        public TerminalNode K_OF(int i)
        {
            return getToken(SQLiteParser.K_OF, i);
        }

        public TerminalNode K_FOR()
        {
            return getToken(SQLiteParser.K_FOR, 0);
        }

        public TerminalNode K_EACH()
        {
            return getToken(SQLiteParser.K_EACH, 0);
        }

        public TerminalNode K_ROW()
        {
            return getToken(SQLiteParser.K_ROW, 0);
        }

        public TerminalNode K_WHEN()
        {
            return getToken(SQLiteParser.K_WHEN, 0);
        }

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode K_TEMP()
        {
            return getToken(SQLiteParser.K_TEMP, 0);
        }

        public TerminalNode K_TEMPORARY()
        {
            return getToken(SQLiteParser.K_TEMPORARY, 0);
        }

        public List<Column_nameContext> column_name()
        {
            return getRuleContexts(Column_nameContext.class);
        }

        public Column_nameContext column_name(int i)
        {
            return getRuleContext(Column_nameContext.class, i);
        }

        public List<Update_stmtContext> update_stmt()
        {
            return getRuleContexts(Update_stmtContext.class);
        }

        public Update_stmtContext update_stmt(int i)
        {
            return getRuleContext(Update_stmtContext.class, i);
        }

        public List<Insert_stmtContext> insert_stmt()
        {
            return getRuleContexts(Insert_stmtContext.class);
        }

        public Insert_stmtContext insert_stmt(int i)
        {
            return getRuleContext(Insert_stmtContext.class, i);
        }

        public List<Delete_stmtContext> delete_stmt()
        {
            return getRuleContexts(Delete_stmtContext.class);
        }

        public Delete_stmtContext delete_stmt(int i)
        {
            return getRuleContext(Delete_stmtContext.class, i);
        }

        public List<Select_stmtContext> select_stmt()
        {
            return getRuleContexts(Select_stmtContext.class);
        }

        public Select_stmtContext select_stmt(int i)
        {
            return getRuleContext(Select_stmtContext.class, i);
        }

        public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_create_trigger_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterCreate_trigger_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitCreate_trigger_stmt(this);
            }
        }
    }

    public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException
    {
        Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_create_trigger_stmt);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(504);
                match(K_CREATE);
                setState(506);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_TEMP || _la == K_TEMPORARY)
                {
                    {
                        setState(505);
                        _la = _input.LA(1);
                        if (!(_la == K_TEMP || _la == K_TEMPORARY))
                        {
                            _errHandler.recoverInline(this);
                        } else
                        {
                            if (_input.LA(1) == Token.EOF)
                            {
                                matchedEOF = true;
                            }
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

                setState(508);
                match(K_TRIGGER);
                setState(512);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 48, _ctx))
                {
                    case 1:
                    {
                        setState(509);
                        match(K_IF);
                        setState(510);
                        match(K_NOT);
                        setState(511);
                        match(K_EXISTS);
                    }
                    break;
                }
                setState(517);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 49, _ctx))
                {
                    case 1:
                    {
                        setState(514);
                        database_name();
                        setState(515);
                        match(DOT);
                    }
                    break;
                }
                setState(519);
                trigger_name();
                setState(524);
                _errHandler.sync(this);
                switch (_input.LA(1))
                {
                    case K_BEFORE:
                    {
                        setState(520);
                        match(K_BEFORE);
                    }
                    break;
                    case K_AFTER:
                    {
                        setState(521);
                        match(K_AFTER);
                    }
                    break;
                    case K_INSTEAD:
                    {
                        setState(522);
                        match(K_INSTEAD);
                        setState(523);
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
                setState(540);
                _errHandler.sync(this);
                switch (_input.LA(1))
                {
                    case K_DELETE:
                    {
                        setState(526);
                        match(K_DELETE);
                    }
                    break;
                    case K_INSERT:
                    {
                        setState(527);
                        match(K_INSERT);
                    }
                    break;
                    case K_UPDATE:
                    {
                        setState(528);
                        match(K_UPDATE);
                        setState(538);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == K_OF)
                        {
                            {
                                setState(529);
                                match(K_OF);
                                setState(530);
                                column_name();
                                setState(535);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == COMMA)
                                {
                                    {
                                        {
                                            setState(531);
                                            match(COMMA);
                                            setState(532);
                                            column_name();
                                        }
                                    }
                                    setState(537);
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
                setState(542);
                match(K_ON);
                setState(546);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 54, _ctx))
                {
                    case 1:
                    {
                        setState(543);
                        database_name();
                        setState(544);
                        match(DOT);
                    }
                    break;
                }
                setState(548);
                table_name();
                setState(552);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_FOR)
                {
                    {
                        setState(549);
                        match(K_FOR);
                        setState(550);
                        match(K_EACH);
                        setState(551);
                        match(K_ROW);
                    }
                }

                setState(556);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_WHEN)
                {
                    {
                        setState(554);
                        match(K_WHEN);
                        setState(555);
                        expr(0);
                    }
                }

                setState(558);
                match(K_BEGIN);
                setState(567);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do
                {
                    {
                        {
                            setState(563);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 57, _ctx))
                            {
                                case 1:
                                {
                                    setState(559);
                                    update_stmt();
                                }
                                break;
                                case 2:
                                {
                                    setState(560);
                                    insert_stmt();
                                }
                                break;
                                case 3:
                                {
                                    setState(561);
                                    delete_stmt();
                                }
                                break;
                                case 4:
                                {
                                    setState(562);
                                    select_stmt();
                                }
                                break;
                            }
                            setState(565);
                            match(SCOL);
                        }
                    }
                    setState(569);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (K_DELETE - 66)) | (1L << (K_INSERT - 66)) | (1L << (K_REPLACE - 66)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (K_SELECT - 134)) | (1L << (K_UPDATE - 134)) | (1L << (K_VALUES - 134)) | (1L << (K_WITH - 134)))) != 0));
                setState(571);
                match(K_END);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Create_view_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_CREATE()
        {
            return getToken(SQLiteParser.K_CREATE, 0);
        }

        public TerminalNode K_VIEW()
        {
            return getToken(SQLiteParser.K_VIEW, 0);
        }

        public View_nameContext view_name()
        {
            return getRuleContext(View_nameContext.class, 0);
        }

        public TerminalNode K_AS()
        {
            return getToken(SQLiteParser.K_AS, 0);
        }

        public Select_stmtContext select_stmt()
        {
            return getRuleContext(Select_stmtContext.class, 0);
        }

        public TerminalNode K_IF()
        {
            return getToken(SQLiteParser.K_IF, 0);
        }

        public TerminalNode K_NOT()
        {
            return getToken(SQLiteParser.K_NOT, 0);
        }

        public TerminalNode K_EXISTS()
        {
            return getToken(SQLiteParser.K_EXISTS, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public TerminalNode K_TEMP()
        {
            return getToken(SQLiteParser.K_TEMP, 0);
        }

        public TerminalNode K_TEMPORARY()
        {
            return getToken(SQLiteParser.K_TEMPORARY, 0);
        }

        public Create_view_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_create_view_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterCreate_view_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitCreate_view_stmt(this);
            }
        }
    }

    public final Create_view_stmtContext create_view_stmt() throws RecognitionException
    {
        Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_create_view_stmt);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(573);
                match(K_CREATE);
                setState(575);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_TEMP || _la == K_TEMPORARY)
                {
                    {
                        setState(574);
                        _la = _input.LA(1);
                        if (!(_la == K_TEMP || _la == K_TEMPORARY))
                        {
                            _errHandler.recoverInline(this);
                        } else
                        {
                            if (_input.LA(1) == Token.EOF)
                            {
                                matchedEOF = true;
                            }
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

                setState(577);
                match(K_VIEW);
                setState(581);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 60, _ctx))
                {
                    case 1:
                    {
                        setState(578);
                        match(K_IF);
                        setState(579);
                        match(K_NOT);
                        setState(580);
                        match(K_EXISTS);
                    }
                    break;
                }
                setState(586);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 61, _ctx))
                {
                    case 1:
                    {
                        setState(583);
                        database_name();
                        setState(584);
                        match(DOT);
                    }
                    break;
                }
                setState(588);
                view_name();
                setState(589);
                match(K_AS);
                setState(590);
                select_stmt();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Create_virtual_table_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_CREATE()
        {
            return getToken(SQLiteParser.K_CREATE, 0);
        }

        public TerminalNode K_VIRTUAL()
        {
            return getToken(SQLiteParser.K_VIRTUAL, 0);
        }

        public TerminalNode K_TABLE()
        {
            return getToken(SQLiteParser.K_TABLE, 0);
        }

        public Table_nameContext table_name()
        {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public TerminalNode K_USING()
        {
            return getToken(SQLiteParser.K_USING, 0);
        }

        public Module_nameContext module_name()
        {
            return getRuleContext(Module_nameContext.class, 0);
        }

        public TerminalNode K_IF()
        {
            return getToken(SQLiteParser.K_IF, 0);
        }

        public TerminalNode K_NOT()
        {
            return getToken(SQLiteParser.K_NOT, 0);
        }

        public TerminalNode K_EXISTS()
        {
            return getToken(SQLiteParser.K_EXISTS, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public List<Module_argumentContext> module_argument()
        {
            return getRuleContexts(Module_argumentContext.class);
        }

        public Module_argumentContext module_argument(int i)
        {
            return getRuleContext(Module_argumentContext.class, i);
        }

        public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_create_virtual_table_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterCreate_virtual_table_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitCreate_virtual_table_stmt(this);
            }
        }
    }

    public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException
    {
        Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_create_virtual_table_stmt);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(592);
                match(K_CREATE);
                setState(593);
                match(K_VIRTUAL);
                setState(594);
                match(K_TABLE);
                setState(598);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 62, _ctx))
                {
                    case 1:
                    {
                        setState(595);
                        match(K_IF);
                        setState(596);
                        match(K_NOT);
                        setState(597);
                        match(K_EXISTS);
                    }
                    break;
                }
                setState(603);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 63, _ctx))
                {
                    case 1:
                    {
                        setState(600);
                        database_name();
                        setState(601);
                        match(DOT);
                    }
                    break;
                }
                setState(605);
                table_name();
                setState(606);
                match(K_USING);
                setState(607);
                module_name();
                setState(619);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OPEN_PAR)
                {
                    {
                        setState(608);
                        match(OPEN_PAR);
                        setState(609);
                        module_argument();
                        setState(614);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(610);
                                    match(COMMA);
                                    setState(611);
                                    module_argument();
                                }
                            }
                            setState(616);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(617);
                        match(CLOSE_PAR);
                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Delete_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_DELETE()
        {
            return getToken(SQLiteParser.K_DELETE, 0);
        }

        public TerminalNode K_FROM()
        {
            return getToken(SQLiteParser.K_FROM, 0);
        }

        public Qualified_table_nameContext qualified_table_name()
        {
            return getRuleContext(Qualified_table_nameContext.class, 0);
        }

        public With_clauseContext with_clause()
        {
            return getRuleContext(With_clauseContext.class, 0);
        }

        public TerminalNode K_WHERE()
        {
            return getToken(SQLiteParser.K_WHERE, 0);
        }

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        public Delete_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_delete_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterDelete_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitDelete_stmt(this);
            }
        }
    }

    public final Delete_stmtContext delete_stmt() throws RecognitionException
    {
        Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_delete_stmt);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(622);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_WITH)
                {
                    {
                        setState(621);
                        with_clause();
                    }
                }

                setState(624);
                match(K_DELETE);
                setState(625);
                match(K_FROM);
                setState(626);
                qualified_table_name();
                setState(629);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_WHERE)
                {
                    {
                        setState(627);
                        match(K_WHERE);
                        setState(628);
                        expr(0);
                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Delete_stmt_limitedContext extends ParserRuleContext
    {

        public TerminalNode K_DELETE()
        {
            return getToken(SQLiteParser.K_DELETE, 0);
        }

        public TerminalNode K_FROM()
        {
            return getToken(SQLiteParser.K_FROM, 0);
        }

        public Qualified_table_nameContext qualified_table_name()
        {
            return getRuleContext(Qualified_table_nameContext.class, 0);
        }

        public With_clauseContext with_clause()
        {
            return getRuleContext(With_clauseContext.class, 0);
        }

        public TerminalNode K_WHERE()
        {
            return getToken(SQLiteParser.K_WHERE, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode K_LIMIT()
        {
            return getToken(SQLiteParser.K_LIMIT, 0);
        }

        public TerminalNode K_ORDER()
        {
            return getToken(SQLiteParser.K_ORDER, 0);
        }

        public TerminalNode K_BY()
        {
            return getToken(SQLiteParser.K_BY, 0);
        }

        public List<Ordering_termContext> ordering_term()
        {
            return getRuleContexts(Ordering_termContext.class);
        }

        public Ordering_termContext ordering_term(int i)
        {
            return getRuleContext(Ordering_termContext.class, i);
        }

        public TerminalNode K_OFFSET()
        {
            return getToken(SQLiteParser.K_OFFSET, 0);
        }

        public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_delete_stmt_limited;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterDelete_stmt_limited(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitDelete_stmt_limited(this);
            }
        }
    }

    public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException
    {
        Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_delete_stmt_limited);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(632);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_WITH)
                {
                    {
                        setState(631);
                        with_clause();
                    }
                }

                setState(634);
                match(K_DELETE);
                setState(635);
                match(K_FROM);
                setState(636);
                qualified_table_name();
                setState(639);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_WHERE)
                {
                    {
                        setState(637);
                        match(K_WHERE);
                        setState(638);
                        expr(0);
                    }
                }

                setState(659);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_LIMIT || _la == K_ORDER)
                {
                    {
                        setState(651);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == K_ORDER)
                        {
                            {
                                setState(641);
                                match(K_ORDER);
                                setState(642);
                                match(K_BY);
                                setState(643);
                                ordering_term();
                                setState(648);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == COMMA)
                                {
                                    {
                                        {
                                            setState(644);
                                            match(COMMA);
                                            setState(645);
                                            ordering_term();
                                        }
                                    }
                                    setState(650);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                        }

                        setState(653);
                        match(K_LIMIT);
                        setState(654);
                        expr(0);
                        setState(657);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == COMMA || _la == K_OFFSET)
                        {
                            {
                                setState(655);
                                _la = _input.LA(1);
                                if (!(_la == COMMA || _la == K_OFFSET))
                                {
                                    _errHandler.recoverInline(this);
                                } else
                                {
                                    if (_input.LA(1) == Token.EOF)
                                    {
                                        matchedEOF = true;
                                    }
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(656);
                                expr(0);
                            }
                        }

                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Detach_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_DETACH()
        {
            return getToken(SQLiteParser.K_DETACH, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public TerminalNode K_DATABASE()
        {
            return getToken(SQLiteParser.K_DATABASE, 0);
        }

        public Detach_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_detach_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterDetach_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitDetach_stmt(this);
            }
        }
    }

    public final Detach_stmtContext detach_stmt() throws RecognitionException
    {
        Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_detach_stmt);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(661);
                match(K_DETACH);
                setState(663);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 74, _ctx))
                {
                    case 1:
                    {
                        setState(662);
                        match(K_DATABASE);
                    }
                    break;
                }
                setState(665);
                database_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Drop_index_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_DROP()
        {
            return getToken(SQLiteParser.K_DROP, 0);
        }

        public TerminalNode K_INDEX()
        {
            return getToken(SQLiteParser.K_INDEX, 0);
        }

        public Index_nameContext index_name()
        {
            return getRuleContext(Index_nameContext.class, 0);
        }

        public TerminalNode K_IF()
        {
            return getToken(SQLiteParser.K_IF, 0);
        }

        public TerminalNode K_EXISTS()
        {
            return getToken(SQLiteParser.K_EXISTS, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public Drop_index_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_drop_index_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterDrop_index_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitDrop_index_stmt(this);
            }
        }
    }

    public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException
    {
        Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_drop_index_stmt);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(667);
                match(K_DROP);
                setState(668);
                match(K_INDEX);
                setState(671);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 75, _ctx))
                {
                    case 1:
                    {
                        setState(669);
                        match(K_IF);
                        setState(670);
                        match(K_EXISTS);
                    }
                    break;
                }
                setState(676);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 76, _ctx))
                {
                    case 1:
                    {
                        setState(673);
                        database_name();
                        setState(674);
                        match(DOT);
                    }
                    break;
                }
                setState(678);
                index_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Drop_table_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_DROP()
        {
            return getToken(SQLiteParser.K_DROP, 0);
        }

        public TerminalNode K_TABLE()
        {
            return getToken(SQLiteParser.K_TABLE, 0);
        }

        public Table_nameContext table_name()
        {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public TerminalNode K_IF()
        {
            return getToken(SQLiteParser.K_IF, 0);
        }

        public TerminalNode K_EXISTS()
        {
            return getToken(SQLiteParser.K_EXISTS, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public Drop_table_optionsContext drop_table_options()
        {
            return getRuleContext(Drop_table_optionsContext.class, 0);
        }

        public Drop_table_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_drop_table_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterDrop_table_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitDrop_table_stmt(this);
            }
        }
    }

    public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException
    {
        Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_drop_table_stmt);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(680);
                match(K_DROP);
                setState(681);
                match(K_TABLE);
                setState(684);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 77, _ctx))
                {
                    case 1:
                    {
                        setState(682);
                        match(K_IF);
                        setState(683);
                        match(K_EXISTS);
                    }
                    break;
                }
                setState(689);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 78, _ctx))
                {
                    case 1:
                    {
                        setState(686);
                        database_name();
                        setState(687);
                        match(DOT);
                    }
                    break;
                }
                setState(691);
                table_name();
                setState(693);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_CASCADE)
                {
                    {
                        setState(692);
                        drop_table_options();
                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Drop_table_optionsContext extends ParserRuleContext
    {

        public TerminalNode K_CASCADE()
        {
            return getToken(SQLiteParser.K_CASCADE, 0);
        }

        public TerminalNode K_CONSTRAINTS()
        {
            return getToken(SQLiteParser.K_CONSTRAINTS, 0);
        }

        public Drop_table_optionsContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_drop_table_options;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterDrop_table_options(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitDrop_table_options(this);
            }
        }
    }

    public final Drop_table_optionsContext drop_table_options() throws RecognitionException
    {
        Drop_table_optionsContext _localctx = new Drop_table_optionsContext(_ctx, getState());
        enterRule(_localctx, 62, RULE_drop_table_options);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(695);
                match(K_CASCADE);
                setState(696);
                match(K_CONSTRAINTS);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Drop_trigger_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_DROP()
        {
            return getToken(SQLiteParser.K_DROP, 0);
        }

        public TerminalNode K_TRIGGER()
        {
            return getToken(SQLiteParser.K_TRIGGER, 0);
        }

        public Trigger_nameContext trigger_name()
        {
            return getRuleContext(Trigger_nameContext.class, 0);
        }

        public TerminalNode K_IF()
        {
            return getToken(SQLiteParser.K_IF, 0);
        }

        public TerminalNode K_EXISTS()
        {
            return getToken(SQLiteParser.K_EXISTS, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_drop_trigger_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterDrop_trigger_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitDrop_trigger_stmt(this);
            }
        }
    }

    public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException
    {
        Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_drop_trigger_stmt);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(698);
                match(K_DROP);
                setState(699);
                match(K_TRIGGER);
                setState(702);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 80, _ctx))
                {
                    case 1:
                    {
                        setState(700);
                        match(K_IF);
                        setState(701);
                        match(K_EXISTS);
                    }
                    break;
                }
                setState(707);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 81, _ctx))
                {
                    case 1:
                    {
                        setState(704);
                        database_name();
                        setState(705);
                        match(DOT);
                    }
                    break;
                }
                setState(709);
                trigger_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Drop_view_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_DROP()
        {
            return getToken(SQLiteParser.K_DROP, 0);
        }

        public TerminalNode K_VIEW()
        {
            return getToken(SQLiteParser.K_VIEW, 0);
        }

        public View_nameContext view_name()
        {
            return getRuleContext(View_nameContext.class, 0);
        }

        public TerminalNode K_IF()
        {
            return getToken(SQLiteParser.K_IF, 0);
        }

        public TerminalNode K_EXISTS()
        {
            return getToken(SQLiteParser.K_EXISTS, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public Drop_view_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_drop_view_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterDrop_view_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitDrop_view_stmt(this);
            }
        }
    }

    public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException
    {
        Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
        enterRule(_localctx, 66, RULE_drop_view_stmt);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(711);
                match(K_DROP);
                setState(712);
                match(K_VIEW);
                setState(715);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 82, _ctx))
                {
                    case 1:
                    {
                        setState(713);
                        match(K_IF);
                        setState(714);
                        match(K_EXISTS);
                    }
                    break;
                }
                setState(720);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 83, _ctx))
                {
                    case 1:
                    {
                        setState(717);
                        database_name();
                        setState(718);
                        match(DOT);
                    }
                    break;
                }
                setState(722);
                view_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Factored_select_stmtContext extends ParserRuleContext
    {

        public List<Select_coreContext> select_core()
        {
            return getRuleContexts(Select_coreContext.class);
        }

        public Select_coreContext select_core(int i)
        {
            return getRuleContext(Select_coreContext.class, i);
        }

        public TerminalNode K_WITH()
        {
            return getToken(SQLiteParser.K_WITH, 0);
        }

        public List<Common_table_expressionContext> common_table_expression()
        {
            return getRuleContexts(Common_table_expressionContext.class);
        }

        public Common_table_expressionContext common_table_expression(int i)
        {
            return getRuleContext(Common_table_expressionContext.class, i);
        }

        public List<Compound_operatorContext> compound_operator()
        {
            return getRuleContexts(Compound_operatorContext.class);
        }

        public Compound_operatorContext compound_operator(int i)
        {
            return getRuleContext(Compound_operatorContext.class, i);
        }

        public TerminalNode K_ORDER()
        {
            return getToken(SQLiteParser.K_ORDER, 0);
        }

        public TerminalNode K_BY()
        {
            return getToken(SQLiteParser.K_BY, 0);
        }

        public List<Ordering_termContext> ordering_term()
        {
            return getRuleContexts(Ordering_termContext.class);
        }

        public Ordering_termContext ordering_term(int i)
        {
            return getRuleContext(Ordering_termContext.class, i);
        }

        public TerminalNode K_LIMIT()
        {
            return getToken(SQLiteParser.K_LIMIT, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode K_RECURSIVE()
        {
            return getToken(SQLiteParser.K_RECURSIVE, 0);
        }

        public TerminalNode K_OFFSET()
        {
            return getToken(SQLiteParser.K_OFFSET, 0);
        }

        public Factored_select_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_factored_select_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterFactored_select_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitFactored_select_stmt(this);
            }
        }
    }

    public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException
    {
        Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
        enterRule(_localctx, 68, RULE_factored_select_stmt);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(736);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_WITH)
                {
                    {
                        setState(724);
                        match(K_WITH);
                        setState(726);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 84, _ctx))
                        {
                            case 1:
                            {
                                setState(725);
                                match(K_RECURSIVE);
                            }
                            break;
                        }
                        setState(728);
                        common_table_expression();
                        setState(733);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(729);
                                    match(COMMA);
                                    setState(730);
                                    common_table_expression();
                                }
                            }
                            setState(735);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(738);
                select_core();
                setState(744);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == K_EXCEPT || _la == K_INTERSECT || _la == K_UNION)
                {
                    {
                        {
                            setState(739);
                            compound_operator();
                            setState(740);
                            select_core();
                        }
                    }
                    setState(746);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(757);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_ORDER)
                {
                    {
                        setState(747);
                        match(K_ORDER);
                        setState(748);
                        match(K_BY);
                        setState(749);
                        ordering_term();
                        setState(754);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(750);
                                    match(COMMA);
                                    setState(751);
                                    ordering_term();
                                }
                            }
                            setState(756);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(765);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_LIMIT)
                {
                    {
                        setState(759);
                        match(K_LIMIT);
                        setState(760);
                        expr(0);
                        setState(763);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == COMMA || _la == K_OFFSET)
                        {
                            {
                                setState(761);
                                _la = _input.LA(1);
                                if (!(_la == COMMA || _la == K_OFFSET))
                                {
                                    _errHandler.recoverInline(this);
                                } else
                                {
                                    if (_input.LA(1) == Token.EOF)
                                    {
                                        matchedEOF = true;
                                    }
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(762);
                                expr(0);
                            }
                        }

                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Insert_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_INTO()
        {
            return getToken(SQLiteParser.K_INTO, 0);
        }

        public Table_nameContext table_name()
        {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public TerminalNode K_INSERT()
        {
            return getToken(SQLiteParser.K_INSERT, 0);
        }

        public TerminalNode K_REPLACE()
        {
            return getToken(SQLiteParser.K_REPLACE, 0);
        }

        public TerminalNode K_OR()
        {
            return getToken(SQLiteParser.K_OR, 0);
        }

        public TerminalNode K_ROLLBACK()
        {
            return getToken(SQLiteParser.K_ROLLBACK, 0);
        }

        public TerminalNode K_ABORT()
        {
            return getToken(SQLiteParser.K_ABORT, 0);
        }

        public TerminalNode K_FAIL()
        {
            return getToken(SQLiteParser.K_FAIL, 0);
        }

        public TerminalNode K_IGNORE()
        {
            return getToken(SQLiteParser.K_IGNORE, 0);
        }

        public TerminalNode K_VALUES()
        {
            return getToken(SQLiteParser.K_VALUES, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        public Select_stmtContext select_stmt()
        {
            return getRuleContext(Select_stmtContext.class, 0);
        }

        public TerminalNode K_DEFAULT()
        {
            return getToken(SQLiteParser.K_DEFAULT, 0);
        }

        public With_clauseContext with_clause()
        {
            return getRuleContext(With_clauseContext.class, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public List<Column_nameContext> column_name()
        {
            return getRuleContexts(Column_nameContext.class);
        }

        public Column_nameContext column_name(int i)
        {
            return getRuleContext(Column_nameContext.class, i);
        }

        public Insert_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_insert_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterInsert_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitInsert_stmt(this);
            }
        }
    }

    public final Insert_stmtContext insert_stmt() throws RecognitionException
    {
        Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
        enterRule(_localctx, 70, RULE_insert_stmt);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(768);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_WITH)
                {
                    {
                        setState(767);
                        with_clause();
                    }
                }

                setState(787);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 93, _ctx))
                {
                    case 1:
                    {
                        setState(770);
                        match(K_INSERT);
                    }
                    break;
                    case 2:
                    {
                        setState(771);
                        match(K_REPLACE);
                    }
                    break;
                    case 3:
                    {
                        setState(772);
                        match(K_INSERT);
                        setState(773);
                        match(K_OR);
                        setState(774);
                        match(K_REPLACE);
                    }
                    break;
                    case 4:
                    {
                        setState(775);
                        match(K_INSERT);
                        setState(776);
                        match(K_OR);
                        setState(777);
                        match(K_ROLLBACK);
                    }
                    break;
                    case 5:
                    {
                        setState(778);
                        match(K_INSERT);
                        setState(779);
                        match(K_OR);
                        setState(780);
                        match(K_ABORT);
                    }
                    break;
                    case 6:
                    {
                        setState(781);
                        match(K_INSERT);
                        setState(782);
                        match(K_OR);
                        setState(783);
                        match(K_FAIL);
                    }
                    break;
                    case 7:
                    {
                        setState(784);
                        match(K_INSERT);
                        setState(785);
                        match(K_OR);
                        setState(786);
                        match(K_IGNORE);
                    }
                    break;
                }
                setState(789);
                match(K_INTO);
                setState(793);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 94, _ctx))
                {
                    case 1:
                    {
                        setState(790);
                        database_name();
                        setState(791);
                        match(DOT);
                    }
                    break;
                }
                setState(795);
                table_name();
                setState(807);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OPEN_PAR)
                {
                    {
                        setState(796);
                        match(OPEN_PAR);
                        setState(797);
                        column_name();
                        setState(802);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(798);
                                    match(COMMA);
                                    setState(799);
                                    column_name();
                                }
                            }
                            setState(804);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(805);
                        match(CLOSE_PAR);
                    }
                }

                setState(840);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 100, _ctx))
                {
                    case 1:
                    {
                        setState(809);
                        match(K_VALUES);
                        setState(810);
                        match(OPEN_PAR);
                        setState(811);
                        expr(0);
                        setState(816);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(812);
                                    match(COMMA);
                                    setState(813);
                                    expr(0);
                                }
                            }
                            setState(818);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(819);
                        match(CLOSE_PAR);
                        setState(834);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(820);
                                    match(COMMA);
                                    setState(821);
                                    match(OPEN_PAR);
                                    setState(822);
                                    expr(0);
                                    setState(827);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    while (_la == COMMA)
                                    {
                                        {
                                            {
                                                setState(823);
                                                match(COMMA);
                                                setState(824);
                                                expr(0);
                                            }
                                        }
                                        setState(829);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                    }
                                    setState(830);
                                    match(CLOSE_PAR);
                                }
                            }
                            setState(836);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                    break;
                    case 2:
                    {
                        setState(837);
                        select_stmt();
                    }
                    break;
                    case 3:
                    {
                        setState(838);
                        match(K_DEFAULT);
                        setState(839);
                        match(K_VALUES);
                    }
                    break;
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Pragma_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_PRAGMA()
        {
            return getToken(SQLiteParser.K_PRAGMA, 0);
        }

        public Pragma_nameContext pragma_name()
        {
            return getRuleContext(Pragma_nameContext.class, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public Pragma_valueContext pragma_value()
        {
            return getRuleContext(Pragma_valueContext.class, 0);
        }

        public Pragma_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_pragma_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterPragma_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitPragma_stmt(this);
            }
        }
    }

    public final Pragma_stmtContext pragma_stmt() throws RecognitionException
    {
        Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
        enterRule(_localctx, 72, RULE_pragma_stmt);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(842);
                match(K_PRAGMA);
                setState(846);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 101, _ctx))
                {
                    case 1:
                    {
                        setState(843);
                        database_name();
                        setState(844);
                        match(DOT);
                    }
                    break;
                }
                setState(848);
                pragma_name();
                setState(855);
                _errHandler.sync(this);
                switch (_input.LA(1))
                {
                    case ASSIGN:
                    {
                        setState(849);
                        match(ASSIGN);
                        setState(850);
                        pragma_value();
                    }
                    break;
                    case OPEN_PAR:
                    {
                        setState(851);
                        match(OPEN_PAR);
                        setState(852);
                        pragma_value();
                        setState(853);
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
                    case K_WITH:
                    case UNEXPECTED_CHAR:
                        break;
                    default:
                        break;
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Reindex_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_REINDEX()
        {
            return getToken(SQLiteParser.K_REINDEX, 0);
        }

        public Collation_nameContext collation_name()
        {
            return getRuleContext(Collation_nameContext.class, 0);
        }

        public Table_nameContext table_name()
        {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public Index_nameContext index_name()
        {
            return getRuleContext(Index_nameContext.class, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public Reindex_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_reindex_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterReindex_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitReindex_stmt(this);
            }
        }
    }

    public final Reindex_stmtContext reindex_stmt() throws RecognitionException
    {
        Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
        enterRule(_localctx, 74, RULE_reindex_stmt);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(857);
                match(K_REINDEX);
                setState(868);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 105, _ctx))
                {
                    case 1:
                    {
                        setState(858);
                        collation_name();
                    }
                    break;
                    case 2:
                    {
                        setState(862);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 103, _ctx))
                        {
                            case 1:
                            {
                                setState(859);
                                database_name();
                                setState(860);
                                match(DOT);
                            }
                            break;
                        }
                        setState(866);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 104, _ctx))
                        {
                            case 1:
                            {
                                setState(864);
                                table_name();
                            }
                            break;
                            case 2:
                            {
                                setState(865);
                                index_name();
                            }
                            break;
                        }
                    }
                    break;
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Release_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_RELEASE()
        {
            return getToken(SQLiteParser.K_RELEASE, 0);
        }

        public Savepoint_nameContext savepoint_name()
        {
            return getRuleContext(Savepoint_nameContext.class, 0);
        }

        public TerminalNode K_SAVEPOINT()
        {
            return getToken(SQLiteParser.K_SAVEPOINT, 0);
        }

        public Release_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_release_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterRelease_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitRelease_stmt(this);
            }
        }
    }

    public final Release_stmtContext release_stmt() throws RecognitionException
    {
        Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
        enterRule(_localctx, 76, RULE_release_stmt);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(870);
                match(K_RELEASE);
                setState(872);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 106, _ctx))
                {
                    case 1:
                    {
                        setState(871);
                        match(K_SAVEPOINT);
                    }
                    break;
                }
                setState(874);
                savepoint_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Rollback_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_ROLLBACK()
        {
            return getToken(SQLiteParser.K_ROLLBACK, 0);
        }

        public TerminalNode K_TRANSACTION()
        {
            return getToken(SQLiteParser.K_TRANSACTION, 0);
        }

        public TerminalNode K_TO()
        {
            return getToken(SQLiteParser.K_TO, 0);
        }

        public Savepoint_nameContext savepoint_name()
        {
            return getRuleContext(Savepoint_nameContext.class, 0);
        }

        public Transaction_nameContext transaction_name()
        {
            return getRuleContext(Transaction_nameContext.class, 0);
        }

        public TerminalNode K_SAVEPOINT()
        {
            return getToken(SQLiteParser.K_SAVEPOINT, 0);
        }

        public Rollback_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_rollback_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterRollback_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitRollback_stmt(this);
            }
        }
    }

    public final Rollback_stmtContext rollback_stmt() throws RecognitionException
    {
        Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
        enterRule(_localctx, 78, RULE_rollback_stmt);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(876);
                match(K_ROLLBACK);
                setState(881);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_TRANSACTION)
                {
                    {
                        setState(877);
                        match(K_TRANSACTION);
                        setState(879);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 107, _ctx))
                        {
                            case 1:
                            {
                                setState(878);
                                transaction_name();
                            }
                            break;
                        }
                    }
                }

                setState(888);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_TO)
                {
                    {
                        setState(883);
                        match(K_TO);
                        setState(885);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 109, _ctx))
                        {
                            case 1:
                            {
                                setState(884);
                                match(K_SAVEPOINT);
                            }
                            break;
                        }
                        setState(887);
                        savepoint_name();
                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Savepoint_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_SAVEPOINT()
        {
            return getToken(SQLiteParser.K_SAVEPOINT, 0);
        }

        public Savepoint_nameContext savepoint_name()
        {
            return getRuleContext(Savepoint_nameContext.class, 0);
        }

        public Savepoint_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_savepoint_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterSavepoint_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitSavepoint_stmt(this);
            }
        }
    }

    public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException
    {
        Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
        enterRule(_localctx, 80, RULE_savepoint_stmt);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(890);
                match(K_SAVEPOINT);
                setState(891);
                savepoint_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Simple_select_stmtContext extends ParserRuleContext
    {

        public Select_coreContext select_core()
        {
            return getRuleContext(Select_coreContext.class, 0);
        }

        public TerminalNode K_WITH()
        {
            return getToken(SQLiteParser.K_WITH, 0);
        }

        public List<Common_table_expressionContext> common_table_expression()
        {
            return getRuleContexts(Common_table_expressionContext.class);
        }

        public Common_table_expressionContext common_table_expression(int i)
        {
            return getRuleContext(Common_table_expressionContext.class, i);
        }

        public TerminalNode K_ORDER()
        {
            return getToken(SQLiteParser.K_ORDER, 0);
        }

        public TerminalNode K_BY()
        {
            return getToken(SQLiteParser.K_BY, 0);
        }

        public List<Ordering_termContext> ordering_term()
        {
            return getRuleContexts(Ordering_termContext.class);
        }

        public Ordering_termContext ordering_term(int i)
        {
            return getRuleContext(Ordering_termContext.class, i);
        }

        public TerminalNode K_LIMIT()
        {
            return getToken(SQLiteParser.K_LIMIT, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode K_RECURSIVE()
        {
            return getToken(SQLiteParser.K_RECURSIVE, 0);
        }

        public TerminalNode K_OFFSET()
        {
            return getToken(SQLiteParser.K_OFFSET, 0);
        }

        public Simple_select_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_simple_select_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterSimple_select_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitSimple_select_stmt(this);
            }
        }
    }

    public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException
    {
        Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
        enterRule(_localctx, 82, RULE_simple_select_stmt);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(905);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_WITH)
                {
                    {
                        setState(893);
                        match(K_WITH);
                        setState(895);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 111, _ctx))
                        {
                            case 1:
                            {
                                setState(894);
                                match(K_RECURSIVE);
                            }
                            break;
                        }
                        setState(897);
                        common_table_expression();
                        setState(902);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(898);
                                    match(COMMA);
                                    setState(899);
                                    common_table_expression();
                                }
                            }
                            setState(904);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(907);
                select_core();
                setState(918);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_ORDER)
                {
                    {
                        setState(908);
                        match(K_ORDER);
                        setState(909);
                        match(K_BY);
                        setState(910);
                        ordering_term();
                        setState(915);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(911);
                                    match(COMMA);
                                    setState(912);
                                    ordering_term();
                                }
                            }
                            setState(917);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(926);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_LIMIT)
                {
                    {
                        setState(920);
                        match(K_LIMIT);
                        setState(921);
                        expr(0);
                        setState(924);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == COMMA || _la == K_OFFSET)
                        {
                            {
                                setState(922);
                                _la = _input.LA(1);
                                if (!(_la == COMMA || _la == K_OFFSET))
                                {
                                    _errHandler.recoverInline(this);
                                } else
                                {
                                    if (_input.LA(1) == Token.EOF)
                                    {
                                        matchedEOF = true;
                                    }
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(923);
                                expr(0);
                            }
                        }

                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Select_stmtContext extends ParserRuleContext
    {

        public List<Select_or_valuesContext> select_or_values()
        {
            return getRuleContexts(Select_or_valuesContext.class);
        }

        public Select_or_valuesContext select_or_values(int i)
        {
            return getRuleContext(Select_or_valuesContext.class, i);
        }

        public TerminalNode K_WITH()
        {
            return getToken(SQLiteParser.K_WITH, 0);
        }

        public List<Common_table_expressionContext> common_table_expression()
        {
            return getRuleContexts(Common_table_expressionContext.class);
        }

        public Common_table_expressionContext common_table_expression(int i)
        {
            return getRuleContext(Common_table_expressionContext.class, i);
        }

        public List<Compound_operatorContext> compound_operator()
        {
            return getRuleContexts(Compound_operatorContext.class);
        }

        public Compound_operatorContext compound_operator(int i)
        {
            return getRuleContext(Compound_operatorContext.class, i);
        }

        public TerminalNode K_ORDER()
        {
            return getToken(SQLiteParser.K_ORDER, 0);
        }

        public TerminalNode K_BY()
        {
            return getToken(SQLiteParser.K_BY, 0);
        }

        public List<Ordering_termContext> ordering_term()
        {
            return getRuleContexts(Ordering_termContext.class);
        }

        public Ordering_termContext ordering_term(int i)
        {
            return getRuleContext(Ordering_termContext.class, i);
        }

        public TerminalNode K_LIMIT()
        {
            return getToken(SQLiteParser.K_LIMIT, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode K_RECURSIVE()
        {
            return getToken(SQLiteParser.K_RECURSIVE, 0);
        }

        public TerminalNode K_OFFSET()
        {
            return getToken(SQLiteParser.K_OFFSET, 0);
        }

        public Select_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_select_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterSelect_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitSelect_stmt(this);
            }
        }
    }

    public final Select_stmtContext select_stmt() throws RecognitionException
    {
        Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
        enterRule(_localctx, 84, RULE_select_stmt);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(940);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_WITH)
                {
                    {
                        setState(928);
                        match(K_WITH);
                        setState(930);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 118, _ctx))
                        {
                            case 1:
                            {
                                setState(929);
                                match(K_RECURSIVE);
                            }
                            break;
                        }
                        setState(932);
                        common_table_expression();
                        setState(937);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(933);
                                    match(COMMA);
                                    setState(934);
                                    common_table_expression();
                                }
                            }
                            setState(939);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(942);
                select_or_values();
                setState(948);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == K_EXCEPT || _la == K_INTERSECT || _la == K_UNION)
                {
                    {
                        {
                            setState(943);
                            compound_operator();
                            setState(944);
                            select_or_values();
                        }
                    }
                    setState(950);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(961);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_ORDER)
                {
                    {
                        setState(951);
                        match(K_ORDER);
                        setState(952);
                        match(K_BY);
                        setState(953);
                        ordering_term();
                        setState(958);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(954);
                                    match(COMMA);
                                    setState(955);
                                    ordering_term();
                                }
                            }
                            setState(960);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(969);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_LIMIT)
                {
                    {
                        setState(963);
                        match(K_LIMIT);
                        setState(964);
                        expr(0);
                        setState(967);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == COMMA || _la == K_OFFSET)
                        {
                            {
                                setState(965);
                                _la = _input.LA(1);
                                if (!(_la == COMMA || _la == K_OFFSET))
                                {
                                    _errHandler.recoverInline(this);
                                } else
                                {
                                    if (_input.LA(1) == Token.EOF)
                                    {
                                        matchedEOF = true;
                                    }
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(966);
                                expr(0);
                            }
                        }

                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Select_or_valuesContext extends ParserRuleContext
    {

        public TerminalNode K_SELECT()
        {
            return getToken(SQLiteParser.K_SELECT, 0);
        }

        public List<Result_columnContext> result_column()
        {
            return getRuleContexts(Result_columnContext.class);
        }

        public Result_columnContext result_column(int i)
        {
            return getRuleContext(Result_columnContext.class, i);
        }

        public TerminalNode K_FROM()
        {
            return getToken(SQLiteParser.K_FROM, 0);
        }

        public TerminalNode K_WHERE()
        {
            return getToken(SQLiteParser.K_WHERE, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode K_GROUP()
        {
            return getToken(SQLiteParser.K_GROUP, 0);
        }

        public TerminalNode K_BY()
        {
            return getToken(SQLiteParser.K_BY, 0);
        }

        public TerminalNode K_DISTINCT()
        {
            return getToken(SQLiteParser.K_DISTINCT, 0);
        }

        public TerminalNode K_ALL()
        {
            return getToken(SQLiteParser.K_ALL, 0);
        }

        public List<Table_or_subqueryContext> table_or_subquery()
        {
            return getRuleContexts(Table_or_subqueryContext.class);
        }

        public Table_or_subqueryContext table_or_subquery(int i)
        {
            return getRuleContext(Table_or_subqueryContext.class, i);
        }

        public Join_clauseContext join_clause()
        {
            return getRuleContext(Join_clauseContext.class, 0);
        }

        public TerminalNode K_HAVING()
        {
            return getToken(SQLiteParser.K_HAVING, 0);
        }

        public TerminalNode K_VALUES()
        {
            return getToken(SQLiteParser.K_VALUES, 0);
        }

        public Select_or_valuesContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_select_or_values;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterSelect_or_values(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitSelect_or_values(this);
            }
        }
    }

    public final Select_or_valuesContext select_or_values() throws RecognitionException
    {
        Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
        enterRule(_localctx, 86, RULE_select_or_values);
        int _la;
        try
        {
            setState(1045);
            _errHandler.sync(this);
            switch (_input.LA(1))
            {
                case K_SELECT:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(971);
                        match(K_SELECT);
                        setState(973);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 126, _ctx))
                        {
                            case 1:
                            {
                                setState(972);
                                _la = _input.LA(1);
                                if (!(_la == K_ALL || _la == K_DISTINCT))
                                {
                                    _errHandler.recoverInline(this);
                                } else
                                {
                                    if (_input.LA(1) == Token.EOF)
                                    {
                                        matchedEOF = true;
                                    }
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                            }
                            break;
                        }
                        setState(975);
                        result_column();
                        setState(980);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(976);
                                    match(COMMA);
                                    setState(977);
                                    result_column();
                                }
                            }
                            setState(982);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(995);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == K_FROM)
                        {
                            {
                                setState(983);
                                match(K_FROM);
                                setState(993);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 129, _ctx))
                                {
                                    case 1:
                                    {
                                        setState(984);
                                        table_or_subquery();
                                        setState(989);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                        while (_la == COMMA)
                                        {
                                            {
                                                {
                                                    setState(985);
                                                    match(COMMA);
                                                    setState(986);
                                                    table_or_subquery();
                                                }
                                            }
                                            setState(991);
                                            _errHandler.sync(this);
                                            _la = _input.LA(1);
                                        }
                                    }
                                    break;
                                    case 2:
                                    {
                                        setState(992);
                                        join_clause();
                                    }
                                    break;
                                }
                            }
                        }

                        setState(999);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == K_WHERE)
                        {
                            {
                                setState(997);
                                match(K_WHERE);
                                setState(998);
                                expr(0);
                            }
                        }

                        setState(1015);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == K_GROUP)
                        {
                            {
                                setState(1001);
                                match(K_GROUP);
                                setState(1002);
                                match(K_BY);
                                setState(1003);
                                expr(0);
                                setState(1008);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == COMMA)
                                {
                                    {
                                        {
                                            setState(1004);
                                            match(COMMA);
                                            setState(1005);
                                            expr(0);
                                        }
                                    }
                                    setState(1010);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                                setState(1013);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == K_HAVING)
                                {
                                    {
                                        setState(1011);
                                        match(K_HAVING);
                                        setState(1012);
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
                        setState(1017);
                        match(K_VALUES);
                        setState(1018);
                        match(OPEN_PAR);
                        setState(1019);
                        expr(0);
                        setState(1024);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(1020);
                                    match(COMMA);
                                    setState(1021);
                                    expr(0);
                                }
                            }
                            setState(1026);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1027);
                        match(CLOSE_PAR);
                        setState(1042);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(1028);
                                    match(COMMA);
                                    setState(1029);
                                    match(OPEN_PAR);
                                    setState(1030);
                                    expr(0);
                                    setState(1035);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    while (_la == COMMA)
                                    {
                                        {
                                            {
                                                setState(1031);
                                                match(COMMA);
                                                setState(1032);
                                                expr(0);
                                            }
                                        }
                                        setState(1037);
                                        _errHandler.sync(this);
                                        _la = _input.LA(1);
                                    }
                                    setState(1038);
                                    match(CLOSE_PAR);
                                }
                            }
                            setState(1044);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Update_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_UPDATE()
        {
            return getToken(SQLiteParser.K_UPDATE, 0);
        }

        public Qualified_table_nameContext qualified_table_name()
        {
            return getRuleContext(Qualified_table_nameContext.class, 0);
        }

        public TerminalNode K_SET()
        {
            return getToken(SQLiteParser.K_SET, 0);
        }

        public List<Column_nameContext> column_name()
        {
            return getRuleContexts(Column_nameContext.class);
        }

        public Column_nameContext column_name(int i)
        {
            return getRuleContext(Column_nameContext.class, i);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        public With_clauseContext with_clause()
        {
            return getRuleContext(With_clauseContext.class, 0);
        }

        public TerminalNode K_OR()
        {
            return getToken(SQLiteParser.K_OR, 0);
        }

        public TerminalNode K_ROLLBACK()
        {
            return getToken(SQLiteParser.K_ROLLBACK, 0);
        }

        public TerminalNode K_ABORT()
        {
            return getToken(SQLiteParser.K_ABORT, 0);
        }

        public TerminalNode K_REPLACE()
        {
            return getToken(SQLiteParser.K_REPLACE, 0);
        }

        public TerminalNode K_FAIL()
        {
            return getToken(SQLiteParser.K_FAIL, 0);
        }

        public TerminalNode K_IGNORE()
        {
            return getToken(SQLiteParser.K_IGNORE, 0);
        }

        public TerminalNode K_WHERE()
        {
            return getToken(SQLiteParser.K_WHERE, 0);
        }

        public Update_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_update_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterUpdate_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitUpdate_stmt(this);
            }
        }
    }

    public final Update_stmtContext update_stmt() throws RecognitionException
    {
        Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
        enterRule(_localctx, 88, RULE_update_stmt);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1048);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_WITH)
                {
                    {
                        setState(1047);
                        with_clause();
                    }
                }

                setState(1050);
                match(K_UPDATE);
                setState(1061);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 140, _ctx))
                {
                    case 1:
                    {
                        setState(1051);
                        match(K_OR);
                        setState(1052);
                        match(K_ROLLBACK);
                    }
                    break;
                    case 2:
                    {
                        setState(1053);
                        match(K_OR);
                        setState(1054);
                        match(K_ABORT);
                    }
                    break;
                    case 3:
                    {
                        setState(1055);
                        match(K_OR);
                        setState(1056);
                        match(K_REPLACE);
                    }
                    break;
                    case 4:
                    {
                        setState(1057);
                        match(K_OR);
                        setState(1058);
                        match(K_FAIL);
                    }
                    break;
                    case 5:
                    {
                        setState(1059);
                        match(K_OR);
                        setState(1060);
                        match(K_IGNORE);
                    }
                    break;
                }
                setState(1063);
                qualified_table_name();
                setState(1064);
                match(K_SET);
                setState(1065);
                column_name();
                setState(1066);
                match(ASSIGN);
                setState(1067);
                expr(0);
                setState(1075);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA)
                {
                    {
                        {
                            setState(1068);
                            match(COMMA);
                            setState(1069);
                            column_name();
                            setState(1070);
                            match(ASSIGN);
                            setState(1071);
                            expr(0);
                        }
                    }
                    setState(1077);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1080);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_WHERE)
                {
                    {
                        setState(1078);
                        match(K_WHERE);
                        setState(1079);
                        expr(0);
                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Update_stmt_limitedContext extends ParserRuleContext
    {

        public TerminalNode K_UPDATE()
        {
            return getToken(SQLiteParser.K_UPDATE, 0);
        }

        public Qualified_table_nameContext qualified_table_name()
        {
            return getRuleContext(Qualified_table_nameContext.class, 0);
        }

        public TerminalNode K_SET()
        {
            return getToken(SQLiteParser.K_SET, 0);
        }

        public List<Column_nameContext> column_name()
        {
            return getRuleContexts(Column_nameContext.class);
        }

        public Column_nameContext column_name(int i)
        {
            return getRuleContext(Column_nameContext.class, i);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        public With_clauseContext with_clause()
        {
            return getRuleContext(With_clauseContext.class, 0);
        }

        public TerminalNode K_OR()
        {
            return getToken(SQLiteParser.K_OR, 0);
        }

        public TerminalNode K_ROLLBACK()
        {
            return getToken(SQLiteParser.K_ROLLBACK, 0);
        }

        public TerminalNode K_ABORT()
        {
            return getToken(SQLiteParser.K_ABORT, 0);
        }

        public TerminalNode K_REPLACE()
        {
            return getToken(SQLiteParser.K_REPLACE, 0);
        }

        public TerminalNode K_FAIL()
        {
            return getToken(SQLiteParser.K_FAIL, 0);
        }

        public TerminalNode K_IGNORE()
        {
            return getToken(SQLiteParser.K_IGNORE, 0);
        }

        public TerminalNode K_WHERE()
        {
            return getToken(SQLiteParser.K_WHERE, 0);
        }

        public TerminalNode K_LIMIT()
        {
            return getToken(SQLiteParser.K_LIMIT, 0);
        }

        public TerminalNode K_ORDER()
        {
            return getToken(SQLiteParser.K_ORDER, 0);
        }

        public TerminalNode K_BY()
        {
            return getToken(SQLiteParser.K_BY, 0);
        }

        public List<Ordering_termContext> ordering_term()
        {
            return getRuleContexts(Ordering_termContext.class);
        }

        public Ordering_termContext ordering_term(int i)
        {
            return getRuleContext(Ordering_termContext.class, i);
        }

        public TerminalNode K_OFFSET()
        {
            return getToken(SQLiteParser.K_OFFSET, 0);
        }

        public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_update_stmt_limited;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterUpdate_stmt_limited(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitUpdate_stmt_limited(this);
            }
        }
    }

    public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException
    {
        Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
        enterRule(_localctx, 90, RULE_update_stmt_limited);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1083);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_WITH)
                {
                    {
                        setState(1082);
                        with_clause();
                    }
                }

                setState(1085);
                match(K_UPDATE);
                setState(1096);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 144, _ctx))
                {
                    case 1:
                    {
                        setState(1086);
                        match(K_OR);
                        setState(1087);
                        match(K_ROLLBACK);
                    }
                    break;
                    case 2:
                    {
                        setState(1088);
                        match(K_OR);
                        setState(1089);
                        match(K_ABORT);
                    }
                    break;
                    case 3:
                    {
                        setState(1090);
                        match(K_OR);
                        setState(1091);
                        match(K_REPLACE);
                    }
                    break;
                    case 4:
                    {
                        setState(1092);
                        match(K_OR);
                        setState(1093);
                        match(K_FAIL);
                    }
                    break;
                    case 5:
                    {
                        setState(1094);
                        match(K_OR);
                        setState(1095);
                        match(K_IGNORE);
                    }
                    break;
                }
                setState(1098);
                qualified_table_name();
                setState(1099);
                match(K_SET);
                setState(1100);
                column_name();
                setState(1101);
                match(ASSIGN);
                setState(1102);
                expr(0);
                setState(1110);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA)
                {
                    {
                        {
                            setState(1103);
                            match(COMMA);
                            setState(1104);
                            column_name();
                            setState(1105);
                            match(ASSIGN);
                            setState(1106);
                            expr(0);
                        }
                    }
                    setState(1112);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1115);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_WHERE)
                {
                    {
                        setState(1113);
                        match(K_WHERE);
                        setState(1114);
                        expr(0);
                    }
                }

                setState(1135);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_LIMIT || _la == K_ORDER)
                {
                    {
                        setState(1127);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == K_ORDER)
                        {
                            {
                                setState(1117);
                                match(K_ORDER);
                                setState(1118);
                                match(K_BY);
                                setState(1119);
                                ordering_term();
                                setState(1124);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == COMMA)
                                {
                                    {
                                        {
                                            setState(1120);
                                            match(COMMA);
                                            setState(1121);
                                            ordering_term();
                                        }
                                    }
                                    setState(1126);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                        }

                        setState(1129);
                        match(K_LIMIT);
                        setState(1130);
                        expr(0);
                        setState(1133);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == COMMA || _la == K_OFFSET)
                        {
                            {
                                setState(1131);
                                _la = _input.LA(1);
                                if (!(_la == COMMA || _la == K_OFFSET))
                                {
                                    _errHandler.recoverInline(this);
                                } else
                                {
                                    if (_input.LA(1) == Token.EOF)
                                    {
                                        matchedEOF = true;
                                    }
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(1132);
                                expr(0);
                            }
                        }

                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Vacuum_stmtContext extends ParserRuleContext
    {

        public TerminalNode K_VACUUM()
        {
            return getToken(SQLiteParser.K_VACUUM, 0);
        }

        public Vacuum_stmtContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_vacuum_stmt;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterVacuum_stmt(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitVacuum_stmt(this);
            }
        }
    }

    public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException
    {
        Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
        enterRule(_localctx, 92, RULE_vacuum_stmt);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1137);
                match(K_VACUUM);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Column_defContext extends ParserRuleContext
    {

        public Column_nameContext column_name()
        {
            return getRuleContext(Column_nameContext.class, 0);
        }

        public Type_nameContext type_name()
        {
            return getRuleContext(Type_nameContext.class, 0);
        }

        public Column_defContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_column_def;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterColumn_def(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitColumn_def(this);
            }
        }
    }

    public final Column_defContext column_def() throws RecognitionException
    {
        Column_defContext _localctx = new Column_defContext(_ctx, getState());
        enterRule(_localctx, 94, RULE_column_def);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1139);
                column_name();
                setState(1140);
                type_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Type_nameContext extends ParserRuleContext
    {

        public NameContext name()
        {
            return getRuleContext(NameContext.class, 0);
        }

        public Signed_numberContext signed_number()
        {
            return getRuleContext(Signed_numberContext.class, 0);
        }

        public Type_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_type_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterType_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitType_name(this);
            }
        }
    }

    public final Type_nameContext type_name() throws RecognitionException
    {
        Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
        enterRule(_localctx, 96, RULE_type_name);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1142);
                name();
                setState(1147);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OPEN_PAR)
                {
                    {
                        setState(1143);
                        match(OPEN_PAR);
                        setState(1144);
                        signed_number();
                        setState(1145);
                        match(CLOSE_PAR);
                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Column_constraintContext extends ParserRuleContext
    {

        public TerminalNode K_PRIMARY()
        {
            return getToken(SQLiteParser.K_PRIMARY, 0);
        }

        public TerminalNode K_KEY()
        {
            return getToken(SQLiteParser.K_KEY, 0);
        }

        public Conflict_clauseContext conflict_clause()
        {
            return getRuleContext(Conflict_clauseContext.class, 0);
        }

        public TerminalNode K_NULL()
        {
            return getToken(SQLiteParser.K_NULL, 0);
        }

        public TerminalNode K_UNIQUE()
        {
            return getToken(SQLiteParser.K_UNIQUE, 0);
        }

        public TerminalNode K_CHECK()
        {
            return getToken(SQLiteParser.K_CHECK, 0);
        }

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode K_DEFAULT()
        {
            return getToken(SQLiteParser.K_DEFAULT, 0);
        }

        public TerminalNode K_COLLATE()
        {
            return getToken(SQLiteParser.K_COLLATE, 0);
        }

        public Collation_nameContext collation_name()
        {
            return getRuleContext(Collation_nameContext.class, 0);
        }

        public Foreign_key_clauseContext foreign_key_clause()
        {
            return getRuleContext(Foreign_key_clauseContext.class, 0);
        }

        public TerminalNode K_CONSTRAINT()
        {
            return getToken(SQLiteParser.K_CONSTRAINT, 0);
        }

        public NameContext name()
        {
            return getRuleContext(NameContext.class, 0);
        }

        public Signed_numberContext signed_number()
        {
            return getRuleContext(Signed_numberContext.class, 0);
        }

        public Literal_valueContext literal_value()
        {
            return getRuleContext(Literal_valueContext.class, 0);
        }

        public TerminalNode K_AUTOINCREMENT()
        {
            return getToken(SQLiteParser.K_AUTOINCREMENT, 0);
        }

        public TerminalNode K_NOT()
        {
            return getToken(SQLiteParser.K_NOT, 0);
        }

        public TerminalNode K_ASC()
        {
            return getToken(SQLiteParser.K_ASC, 0);
        }

        public TerminalNode K_DESC()
        {
            return getToken(SQLiteParser.K_DESC, 0);
        }

        public Column_constraintContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_column_constraint;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterColumn_constraint(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitColumn_constraint(this);
            }
        }
    }

    public final Column_constraintContext column_constraint() throws RecognitionException
    {
        Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
        enterRule(_localctx, 98, RULE_column_constraint);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1151);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_CONSTRAINT)
                {
                    {
                        setState(1149);
                        match(K_CONSTRAINT);
                        setState(1150);
                        name();
                    }
                }

                setState(1186);
                _errHandler.sync(this);
                switch (_input.LA(1))
                {
                    case K_PRIMARY:
                    {
                        setState(1153);
                        match(K_PRIMARY);
                        setState(1154);
                        match(K_KEY);
                        setState(1156);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == K_ASC || _la == K_DESC)
                        {
                            {
                                setState(1155);
                                _la = _input.LA(1);
                                if (!(_la == K_ASC || _la == K_DESC))
                                {
                                    _errHandler.recoverInline(this);
                                } else
                                {
                                    if (_input.LA(1) == Token.EOF)
                                    {
                                        matchedEOF = true;
                                    }
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                            }
                        }

                        setState(1158);
                        conflict_clause();
                        setState(1160);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == K_AUTOINCREMENT)
                        {
                            {
                                setState(1159);
                                match(K_AUTOINCREMENT);
                            }
                        }

                    }
                    break;
                    case K_NOT:
                    case K_NULL:
                    {
                        setState(1163);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == K_NOT)
                        {
                            {
                                setState(1162);
                                match(K_NOT);
                            }
                        }

                        setState(1165);
                        match(K_NULL);
                        setState(1166);
                        conflict_clause();
                    }
                    break;
                    case K_UNIQUE:
                    {
                        setState(1167);
                        match(K_UNIQUE);
                        setState(1168);
                        conflict_clause();
                    }
                    break;
                    case K_CHECK:
                    {
                        setState(1169);
                        match(K_CHECK);
                        setState(1170);
                        match(OPEN_PAR);
                        setState(1171);
                        expr(0);
                        setState(1172);
                        match(CLOSE_PAR);
                    }
                    break;
                    case K_DEFAULT:
                    {
                        setState(1174);
                        match(K_DEFAULT);
                        setState(1181);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 156, _ctx))
                        {
                            case 1:
                            {
                                setState(1175);
                                signed_number();
                            }
                            break;
                            case 2:
                            {
                                setState(1176);
                                literal_value();
                            }
                            break;
                            case 3:
                            {
                                setState(1177);
                                match(OPEN_PAR);
                                setState(1178);
                                expr(0);
                                setState(1179);
                                match(CLOSE_PAR);
                            }
                            break;
                        }
                    }
                    break;
                    case K_COLLATE:
                    {
                        setState(1183);
                        match(K_COLLATE);
                        setState(1184);
                        collation_name();
                    }
                    break;
                    case K_REFERENCES:
                    {
                        setState(1185);
                        foreign_key_clause();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Conflict_clauseContext extends ParserRuleContext
    {

        public TerminalNode K_ON()
        {
            return getToken(SQLiteParser.K_ON, 0);
        }

        public TerminalNode K_CONFLICT()
        {
            return getToken(SQLiteParser.K_CONFLICT, 0);
        }

        public TerminalNode K_ROLLBACK()
        {
            return getToken(SQLiteParser.K_ROLLBACK, 0);
        }

        public TerminalNode K_ABORT()
        {
            return getToken(SQLiteParser.K_ABORT, 0);
        }

        public TerminalNode K_FAIL()
        {
            return getToken(SQLiteParser.K_FAIL, 0);
        }

        public TerminalNode K_IGNORE()
        {
            return getToken(SQLiteParser.K_IGNORE, 0);
        }

        public TerminalNode K_REPLACE()
        {
            return getToken(SQLiteParser.K_REPLACE, 0);
        }

        public Conflict_clauseContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_conflict_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterConflict_clause(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitConflict_clause(this);
            }
        }
    }

    public final Conflict_clauseContext conflict_clause() throws RecognitionException
    {
        Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
        enterRule(_localctx, 100, RULE_conflict_clause);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1191);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_ON)
                {
                    {
                        setState(1188);
                        match(K_ON);
                        setState(1189);
                        match(K_CONFLICT);
                        setState(1190);
                        _la = _input.LA(1);
                        if (!(_la == K_ABORT || ((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (K_FAIL - 79)) | (1L << (K_IGNORE - 79)) | (1L << (K_REPLACE - 79)) | (1L << (K_ROLLBACK - 79)))) != 0)))
                        {
                            _errHandler.recoverInline(this);
                        } else
                        {
                            if (_input.LA(1) == Token.EOF)
                            {
                                matchedEOF = true;
                            }
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class ExprContext extends ParserRuleContext
    {

        public Literal_valueContext literal_value()
        {
            return getRuleContext(Literal_valueContext.class, 0);
        }

        public TerminalNode BIND_PARAMETER()
        {
            return getToken(SQLiteParser.BIND_PARAMETER, 0);
        }

        public Column_nameContext column_name()
        {
            return getRuleContext(Column_nameContext.class, 0);
        }

        public Table_nameContext table_name()
        {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public Unary_operatorContext unary_operator()
        {
            return getRuleContext(Unary_operatorContext.class, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        public Function_nameContext function_name()
        {
            return getRuleContext(Function_nameContext.class, 0);
        }

        public TerminalNode K_DISTINCT()
        {
            return getToken(SQLiteParser.K_DISTINCT, 0);
        }

        public TerminalNode K_CAST()
        {
            return getToken(SQLiteParser.K_CAST, 0);
        }

        public TerminalNode K_AS()
        {
            return getToken(SQLiteParser.K_AS, 0);
        }

        public Type_nameContext type_name()
        {
            return getRuleContext(Type_nameContext.class, 0);
        }

        public Select_stmtContext select_stmt()
        {
            return getRuleContext(Select_stmtContext.class, 0);
        }

        public TerminalNode K_EXISTS()
        {
            return getToken(SQLiteParser.K_EXISTS, 0);
        }

        public TerminalNode K_NOT()
        {
            return getToken(SQLiteParser.K_NOT, 0);
        }

        public TerminalNode K_CASE()
        {
            return getToken(SQLiteParser.K_CASE, 0);
        }

        public TerminalNode K_END()
        {
            return getToken(SQLiteParser.K_END, 0);
        }

        public List<TerminalNode> K_WHEN()
        {
            return getTokens(SQLiteParser.K_WHEN);
        }

        public TerminalNode K_WHEN(int i)
        {
            return getToken(SQLiteParser.K_WHEN, i);
        }

        public List<TerminalNode> K_THEN()
        {
            return getTokens(SQLiteParser.K_THEN);
        }

        public TerminalNode K_THEN(int i)
        {
            return getToken(SQLiteParser.K_THEN, i);
        }

        public TerminalNode K_ELSE()
        {
            return getToken(SQLiteParser.K_ELSE, 0);
        }

        public Raise_functionContext raise_function()
        {
            return getRuleContext(Raise_functionContext.class, 0);
        }

        public TerminalNode K_IS()
        {
            return getToken(SQLiteParser.K_IS, 0);
        }

        public TerminalNode K_IN()
        {
            return getToken(SQLiteParser.K_IN, 0);
        }

        public TerminalNode K_LIKE()
        {
            return getToken(SQLiteParser.K_LIKE, 0);
        }

        public TerminalNode K_GLOB()
        {
            return getToken(SQLiteParser.K_GLOB, 0);
        }

        public TerminalNode K_MATCH()
        {
            return getToken(SQLiteParser.K_MATCH, 0);
        }

        public TerminalNode K_REGEXP()
        {
            return getToken(SQLiteParser.K_REGEXP, 0);
        }

        public TerminalNode K_AND()
        {
            return getToken(SQLiteParser.K_AND, 0);
        }

        public TerminalNode K_OR()
        {
            return getToken(SQLiteParser.K_OR, 0);
        }

        public TerminalNode K_BETWEEN()
        {
            return getToken(SQLiteParser.K_BETWEEN, 0);
        }

        public TerminalNode K_COLLATE()
        {
            return getToken(SQLiteParser.K_COLLATE, 0);
        }

        public Collation_nameContext collation_name()
        {
            return getRuleContext(Collation_nameContext.class, 0);
        }

        public TerminalNode K_ESCAPE()
        {
            return getToken(SQLiteParser.K_ESCAPE, 0);
        }

        public TerminalNode K_ISNULL()
        {
            return getToken(SQLiteParser.K_ISNULL, 0);
        }

        public TerminalNode K_NOTNULL()
        {
            return getToken(SQLiteParser.K_NOTNULL, 0);
        }

        public TerminalNode K_NULL()
        {
            return getToken(SQLiteParser.K_NULL, 0);
        }

        public ExprContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterExpr(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitExpr(this);
            }
        }
    }

    public final ExprContext expr() throws RecognitionException
    {
        return expr(0);
    }

    private ExprContext expr(int _p) throws RecognitionException
    {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExprContext _localctx = new ExprContext(_ctx, _parentState);
        ExprContext _prevctx = _localctx;
        int _startState = 102;
        enterRecursionRule(_localctx, 102, RULE_expr, _p);
        int _la;
        try
        {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(1269);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 169, _ctx))
                {
                    case 1:
                    {
                        setState(1194);
                        literal_value();
                    }
                    break;
                    case 2:
                    {
                        setState(1195);
                        match(BIND_PARAMETER);
                    }
                    break;
                    case 3:
                    {
                        setState(1204);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 160, _ctx))
                        {
                            case 1:
                            {
                                setState(1199);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 159, _ctx))
                                {
                                    case 1:
                                    {
                                        setState(1196);
                                        database_name();
                                        setState(1197);
                                        match(DOT);
                                    }
                                    break;
                                }
                                setState(1201);
                                table_name();
                                setState(1202);
                                match(DOT);
                            }
                            break;
                        }
                        setState(1206);
                        column_name();
                    }
                    break;
                    case 4:
                    {
                        setState(1207);
                        unary_operator();
                        setState(1208);
                        expr(21);
                    }
                    break;
                    case 5:
                    {
                        setState(1210);
                        function_name();
                        setState(1211);
                        match(OPEN_PAR);
                        setState(1224);
                        _errHandler.sync(this);
                        switch (_input.LA(1))
                        {
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
                                setState(1213);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 161, _ctx))
                                {
                                    case 1:
                                    {
                                        setState(1212);
                                        match(K_DISTINCT);
                                    }
                                    break;
                                }
                                setState(1215);
                                expr(0);
                                setState(1220);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == COMMA)
                                {
                                    {
                                        {
                                            setState(1216);
                                            match(COMMA);
                                            setState(1217);
                                            expr(0);
                                        }
                                    }
                                    setState(1222);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                            break;
                            case STAR:
                            {
                                setState(1223);
                                match(STAR);
                            }
                            break;
                            case CLOSE_PAR:
                                break;
                            default:
                                break;
                        }
                        setState(1226);
                        match(CLOSE_PAR);
                    }
                    break;
                    case 6:
                    {
                        setState(1228);
                        match(OPEN_PAR);
                        setState(1229);
                        expr(0);
                        setState(1230);
                        match(CLOSE_PAR);
                    }
                    break;
                    case 7:
                    {
                        setState(1232);
                        match(K_CAST);
                        setState(1233);
                        match(OPEN_PAR);
                        setState(1234);
                        expr(0);
                        setState(1235);
                        match(K_AS);
                        setState(1236);
                        type_name();
                        setState(1237);
                        match(CLOSE_PAR);
                    }
                    break;
                    case 8:
                    {
                        setState(1243);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == K_EXISTS || _la == K_NOT)
                        {
                            {
                                setState(1240);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == K_NOT)
                                {
                                    {
                                        setState(1239);
                                        match(K_NOT);
                                    }
                                }

                                setState(1242);
                                match(K_EXISTS);
                            }
                        }

                        setState(1245);
                        match(OPEN_PAR);
                        setState(1246);
                        select_stmt();
                        setState(1247);
                        match(CLOSE_PAR);
                    }
                    break;
                    case 9:
                    {
                        setState(1249);
                        match(K_CASE);
                        setState(1251);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 166, _ctx))
                        {
                            case 1:
                            {
                                setState(1250);
                                expr(0);
                            }
                            break;
                        }
                        setState(1258);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        do
                        {
                            {
                                {
                                    setState(1253);
                                    match(K_WHEN);
                                    setState(1254);
                                    expr(0);
                                    setState(1255);
                                    match(K_THEN);
                                    setState(1256);
                                    expr(0);
                                }
                            }
                            setState(1260);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        } while (_la == K_WHEN);
                        setState(1264);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == K_ELSE)
                        {
                            {
                                setState(1262);
                                match(K_ELSE);
                                setState(1263);
                                expr(0);
                            }
                        }

                        setState(1266);
                        match(K_END);
                    }
                    break;
                    case 10:
                    {
                        setState(1268);
                        raise_function();
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(1371);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 182, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER)
                {
                    if (_alt == 1)
                    {
                        if (_parseListeners != null)
                        {
                            triggerExitRuleEvent();
                        }
                        _prevctx = _localctx;
                        {
                            setState(1369);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 181, _ctx))
                            {
                                case 1:
                                {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(1271);
                                    if (!(precpred(_ctx, 20)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 20)");
                                    }
                                    setState(1272);
                                    match(PIPE2);
                                    setState(1273);
                                    expr(21);
                                }
                                break;
                                case 2:
                                {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(1274);
                                    if (!(precpred(_ctx, 19)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 19)");
                                    }
                                    setState(1275);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)))
                                    {
                                        _errHandler.recoverInline(this);
                                    } else
                                    {
                                        if (_input.LA(1) == Token.EOF)
                                        {
                                            matchedEOF = true;
                                        }
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1276);
                                    expr(20);
                                }
                                break;
                                case 3:
                                {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(1277);
                                    if (!(precpred(_ctx, 18)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                                    }
                                    setState(1278);
                                    _la = _input.LA(1);
                                    if (!(_la == PLUS || _la == MINUS))
                                    {
                                        _errHandler.recoverInline(this);
                                    } else
                                    {
                                        if (_input.LA(1) == Token.EOF)
                                        {
                                            matchedEOF = true;
                                        }
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1279);
                                    expr(19);
                                }
                                break;
                                case 4:
                                {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(1280);
                                    if (!(precpred(_ctx, 17)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                                    }
                                    setState(1281);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)))
                                    {
                                        _errHandler.recoverInline(this);
                                    } else
                                    {
                                        if (_input.LA(1) == Token.EOF)
                                        {
                                            matchedEOF = true;
                                        }
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1282);
                                    expr(18);
                                }
                                break;
                                case 5:
                                {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(1283);
                                    if (!(precpred(_ctx, 16)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                                    }
                                    setState(1284);
                                    _la = _input.LA(1);
                                    if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)))
                                    {
                                        _errHandler.recoverInline(this);
                                    } else
                                    {
                                        if (_input.LA(1) == Token.EOF)
                                        {
                                            matchedEOF = true;
                                        }
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1285);
                                    expr(17);
                                }
                                break;
                                case 6:
                                {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(1286);
                                    if (!(precpred(_ctx, 15)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                                    }
                                    setState(1299);
                                    _errHandler.sync(this);
                                    switch (getInterpreter().adaptivePredict(_input, 170, _ctx))
                                    {
                                        case 1:
                                        {
                                            setState(1287);
                                            match(ASSIGN);
                                        }
                                        break;
                                        case 2:
                                        {
                                            setState(1288);
                                            match(EQ);
                                        }
                                        break;
                                        case 3:
                                        {
                                            setState(1289);
                                            match(NOT_EQ1);
                                        }
                                        break;
                                        case 4:
                                        {
                                            setState(1290);
                                            match(NOT_EQ2);
                                        }
                                        break;
                                        case 5:
                                        {
                                            setState(1291);
                                            match(K_IS);
                                        }
                                        break;
                                        case 6:
                                        {
                                            setState(1292);
                                            match(K_IS);
                                            setState(1293);
                                            match(K_NOT);
                                        }
                                        break;
                                        case 7:
                                        {
                                            setState(1294);
                                            match(K_IN);
                                        }
                                        break;
                                        case 8:
                                        {
                                            setState(1295);
                                            match(K_LIKE);
                                        }
                                        break;
                                        case 9:
                                        {
                                            setState(1296);
                                            match(K_GLOB);
                                        }
                                        break;
                                        case 10:
                                        {
                                            setState(1297);
                                            match(K_MATCH);
                                        }
                                        break;
                                        case 11:
                                        {
                                            setState(1298);
                                            match(K_REGEXP);
                                        }
                                        break;
                                    }
                                    setState(1301);
                                    expr(16);
                                }
                                break;
                                case 7:
                                {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(1302);
                                    if (!(precpred(_ctx, 14)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                                    }
                                    setState(1303);
                                    match(K_AND);
                                    setState(1304);
                                    expr(15);
                                }
                                break;
                                case 8:
                                {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(1305);
                                    if (!(precpred(_ctx, 13)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                                    }
                                    setState(1306);
                                    match(K_OR);
                                    setState(1307);
                                    expr(14);
                                }
                                break;
                                case 9:
                                {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(1308);
                                    if (!(precpred(_ctx, 6)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    }
                                    setState(1309);
                                    match(K_IS);
                                    setState(1311);
                                    _errHandler.sync(this);
                                    switch (getInterpreter().adaptivePredict(_input, 171, _ctx))
                                    {
                                        case 1:
                                        {
                                            setState(1310);
                                            match(K_NOT);
                                        }
                                        break;
                                    }
                                    setState(1313);
                                    expr(7);
                                }
                                break;
                                case 10:
                                {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(1314);
                                    if (!(precpred(_ctx, 5)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    }
                                    setState(1316);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la == K_NOT)
                                    {
                                        {
                                            setState(1315);
                                            match(K_NOT);
                                        }
                                    }

                                    setState(1318);
                                    match(K_BETWEEN);
                                    setState(1319);
                                    expr(0);
                                    setState(1320);
                                    match(K_AND);
                                    setState(1321);
                                    expr(6);
                                }
                                break;
                                case 11:
                                {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(1323);
                                    if (!(precpred(_ctx, 9)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    }
                                    setState(1324);
                                    match(K_COLLATE);
                                    setState(1325);
                                    collation_name();
                                }
                                break;
                                case 12:
                                {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(1326);
                                    if (!(precpred(_ctx, 8)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    }
                                    setState(1328);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la == K_NOT)
                                    {
                                        {
                                            setState(1327);
                                            match(K_NOT);
                                        }
                                    }

                                    setState(1330);
                                    _la = _input.LA(1);
                                    if (!(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (K_GLOB - 84)) | (1L << (K_LIKE - 84)) | (1L << (K_MATCH - 84)) | (1L << (K_REGEXP - 84)))) != 0)))
                                    {
                                        _errHandler.recoverInline(this);
                                    } else
                                    {
                                        if (_input.LA(1) == Token.EOF)
                                        {
                                            matchedEOF = true;
                                        }
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1331);
                                    expr(0);
                                    setState(1334);
                                    _errHandler.sync(this);
                                    switch (getInterpreter().adaptivePredict(_input, 174, _ctx))
                                    {
                                        case 1:
                                        {
                                            setState(1332);
                                            match(K_ESCAPE);
                                            setState(1333);
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
                                    setState(1336);
                                    if (!(precpred(_ctx, 7)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    }
                                    setState(1341);
                                    _errHandler.sync(this);
                                    switch (_input.LA(1))
                                    {
                                        case K_ISNULL:
                                        {
                                            setState(1337);
                                            match(K_ISNULL);
                                        }
                                        break;
                                        case K_NOTNULL:
                                        {
                                            setState(1338);
                                            match(K_NOTNULL);
                                        }
                                        break;
                                        case K_NOT:
                                        {
                                            setState(1339);
                                            match(K_NOT);
                                            setState(1340);
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
                                    setState(1343);
                                    if (!(precpred(_ctx, 4)))
                                    {
                                        throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    }
                                    setState(1345);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                    if (_la == K_NOT)
                                    {
                                        {
                                            setState(1344);
                                            match(K_NOT);
                                        }
                                    }

                                    setState(1347);
                                    match(K_IN);
                                    setState(1367);
                                    _errHandler.sync(this);
                                    switch (getInterpreter().adaptivePredict(_input, 180, _ctx))
                                    {
                                        case 1:
                                        {
                                            setState(1348);
                                            match(OPEN_PAR);
                                            setState(1358);
                                            _errHandler.sync(this);
                                            switch (getInterpreter().adaptivePredict(_input, 178, _ctx))
                                            {
                                                case 1:
                                                {
                                                    setState(1349);
                                                    select_stmt();
                                                }
                                                break;
                                                case 2:
                                                {
                                                    setState(1350);
                                                    expr(0);
                                                    setState(1355);
                                                    _errHandler.sync(this);
                                                    _la = _input.LA(1);
                                                    while (_la == COMMA)
                                                    {
                                                        {
                                                            {
                                                                setState(1351);
                                                                match(COMMA);
                                                                setState(1352);
                                                                expr(0);
                                                            }
                                                        }
                                                        setState(1357);
                                                        _errHandler.sync(this);
                                                        _la = _input.LA(1);
                                                    }
                                                }
                                                break;
                                            }
                                            setState(1360);
                                            match(CLOSE_PAR);
                                        }
                                        break;
                                        case 2:
                                        {
                                            setState(1364);
                                            _errHandler.sync(this);
                                            switch (getInterpreter().adaptivePredict(_input, 179, _ctx))
                                            {
                                                case 1:
                                                {
                                                    setState(1361);
                                                    database_name();
                                                    setState(1362);
                                                    match(DOT);
                                                }
                                                break;
                                            }
                                            setState(1366);
                                            table_name();
                                        }
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                    }
                    setState(1373);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 182, _ctx);
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class Foreign_key_clauseContext extends ParserRuleContext
    {

        public TerminalNode K_REFERENCES()
        {
            return getToken(SQLiteParser.K_REFERENCES, 0);
        }

        public Foreign_tableContext foreign_table()
        {
            return getRuleContext(Foreign_tableContext.class, 0);
        }

        public Column_nameContext column_name()
        {
            return getRuleContext(Column_nameContext.class, 0);
        }

        public TerminalNode K_DEFERRABLE()
        {
            return getToken(SQLiteParser.K_DEFERRABLE, 0);
        }

        public List<TerminalNode> K_ON()
        {
            return getTokens(SQLiteParser.K_ON);
        }

        public TerminalNode K_ON(int i)
        {
            return getToken(SQLiteParser.K_ON, i);
        }

        public List<TerminalNode> K_MATCH()
        {
            return getTokens(SQLiteParser.K_MATCH);
        }

        public TerminalNode K_MATCH(int i)
        {
            return getToken(SQLiteParser.K_MATCH, i);
        }

        public List<NameContext> name()
        {
            return getRuleContexts(NameContext.class);
        }

        public NameContext name(int i)
        {
            return getRuleContext(NameContext.class, i);
        }

        public List<TerminalNode> K_DELETE()
        {
            return getTokens(SQLiteParser.K_DELETE);
        }

        public TerminalNode K_DELETE(int i)
        {
            return getToken(SQLiteParser.K_DELETE, i);
        }

        public List<TerminalNode> K_UPDATE()
        {
            return getTokens(SQLiteParser.K_UPDATE);
        }

        public TerminalNode K_UPDATE(int i)
        {
            return getToken(SQLiteParser.K_UPDATE, i);
        }

        public TerminalNode K_NOT()
        {
            return getToken(SQLiteParser.K_NOT, 0);
        }

        public TerminalNode K_INITIALLY()
        {
            return getToken(SQLiteParser.K_INITIALLY, 0);
        }

        public TerminalNode K_DEFERRED()
        {
            return getToken(SQLiteParser.K_DEFERRED, 0);
        }

        public TerminalNode K_IMMEDIATE()
        {
            return getToken(SQLiteParser.K_IMMEDIATE, 0);
        }

        public List<TerminalNode> K_SET()
        {
            return getTokens(SQLiteParser.K_SET);
        }

        public TerminalNode K_SET(int i)
        {
            return getToken(SQLiteParser.K_SET, i);
        }

        public List<TerminalNode> K_NULL()
        {
            return getTokens(SQLiteParser.K_NULL);
        }

        public TerminalNode K_NULL(int i)
        {
            return getToken(SQLiteParser.K_NULL, i);
        }

        public List<TerminalNode> K_DEFAULT()
        {
            return getTokens(SQLiteParser.K_DEFAULT);
        }

        public TerminalNode K_DEFAULT(int i)
        {
            return getToken(SQLiteParser.K_DEFAULT, i);
        }

        public List<TerminalNode> K_CASCADE()
        {
            return getTokens(SQLiteParser.K_CASCADE);
        }

        public TerminalNode K_CASCADE(int i)
        {
            return getToken(SQLiteParser.K_CASCADE, i);
        }

        public List<TerminalNode> K_RESTRICT()
        {
            return getTokens(SQLiteParser.K_RESTRICT);
        }

        public TerminalNode K_RESTRICT(int i)
        {
            return getToken(SQLiteParser.K_RESTRICT, i);
        }

        public List<TerminalNode> K_NO()
        {
            return getTokens(SQLiteParser.K_NO);
        }

        public TerminalNode K_NO(int i)
        {
            return getToken(SQLiteParser.K_NO, i);
        }

        public List<TerminalNode> K_ACTION()
        {
            return getTokens(SQLiteParser.K_ACTION);
        }

        public TerminalNode K_ACTION(int i)
        {
            return getToken(SQLiteParser.K_ACTION, i);
        }

        public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_foreign_key_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterForeign_key_clause(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitForeign_key_clause(this);
            }
        }
    }

    public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException
    {
        Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
        enterRule(_localctx, 104, RULE_foreign_key_clause);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1374);
                match(K_REFERENCES);
                setState(1375);
                foreign_table();
                setState(1380);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OPEN_PAR)
                {
                    {
                        setState(1376);
                        match(OPEN_PAR);
                        setState(1377);
                        column_name();
                        setState(1378);
                        match(CLOSE_PAR);
                    }
                }

                setState(1400);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == K_ON || _la == K_MATCH)
                {
                    {
                        {
                            setState(1396);
                            _errHandler.sync(this);
                            switch (_input.LA(1))
                            {
                                case K_ON:
                                {
                                    setState(1382);
                                    match(K_ON);
                                    setState(1383);
                                    _la = _input.LA(1);
                                    if (!(_la == K_DELETE || _la == K_UPDATE))
                                    {
                                        _errHandler.recoverInline(this);
                                    } else
                                    {
                                        if (_input.LA(1) == Token.EOF)
                                        {
                                            matchedEOF = true;
                                        }
                                        _errHandler.reportMatch(this);
                                        consume();
                                    }
                                    setState(1392);
                                    _errHandler.sync(this);
                                    switch (getInterpreter().adaptivePredict(_input, 184, _ctx))
                                    {
                                        case 1:
                                        {
                                            setState(1384);
                                            match(K_SET);
                                            setState(1385);
                                            match(K_NULL);
                                        }
                                        break;
                                        case 2:
                                        {
                                            setState(1386);
                                            match(K_SET);
                                            setState(1387);
                                            match(K_DEFAULT);
                                        }
                                        break;
                                        case 3:
                                        {
                                            setState(1388);
                                            match(K_CASCADE);
                                        }
                                        break;
                                        case 4:
                                        {
                                            setState(1389);
                                            match(K_RESTRICT);
                                        }
                                        break;
                                        case 5:
                                        {
                                            setState(1390);
                                            match(K_NO);
                                            setState(1391);
                                            match(K_ACTION);
                                        }
                                        break;
                                    }
                                }
                                break;
                                case K_MATCH:
                                {
                                    setState(1394);
                                    match(K_MATCH);
                                    setState(1395);
                                    name();
                                }
                                break;
                                default:
                                    throw new NoViableAltException(this);
                            }
                        }
                    }
                    setState(1402);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1413);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_DEFERRABLE || _la == K_NOT)
                {
                    {
                        setState(1404);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == K_NOT)
                        {
                            {
                                setState(1403);
                                match(K_NOT);
                            }
                        }

                        setState(1406);
                        match(K_DEFERRABLE);
                        setState(1411);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 188, _ctx))
                        {
                            case 1:
                            {
                                setState(1407);
                                match(K_INITIALLY);
                                setState(1408);
                                match(K_DEFERRED);
                            }
                            break;
                            case 2:
                            {
                                setState(1409);
                                match(K_INITIALLY);
                                setState(1410);
                                match(K_IMMEDIATE);
                            }
                            break;
                        }
                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Raise_functionContext extends ParserRuleContext
    {

        public TerminalNode K_RAISE()
        {
            return getToken(SQLiteParser.K_RAISE, 0);
        }

        public TerminalNode K_IGNORE()
        {
            return getToken(SQLiteParser.K_IGNORE, 0);
        }

        public Error_messageContext error_message()
        {
            return getRuleContext(Error_messageContext.class, 0);
        }

        public TerminalNode K_ROLLBACK()
        {
            return getToken(SQLiteParser.K_ROLLBACK, 0);
        }

        public TerminalNode K_ABORT()
        {
            return getToken(SQLiteParser.K_ABORT, 0);
        }

        public TerminalNode K_FAIL()
        {
            return getToken(SQLiteParser.K_FAIL, 0);
        }

        public Raise_functionContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_raise_function;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterRaise_function(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitRaise_function(this);
            }
        }
    }

    public final Raise_functionContext raise_function() throws RecognitionException
    {
        Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
        enterRule(_localctx, 106, RULE_raise_function);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1415);
                match(K_RAISE);
                setState(1416);
                match(OPEN_PAR);
                setState(1421);
                _errHandler.sync(this);
                switch (_input.LA(1))
                {
                    case K_IGNORE:
                    {
                        setState(1417);
                        match(K_IGNORE);
                    }
                    break;
                    case K_ABORT:
                    case K_FAIL:
                    case K_ROLLBACK:
                    {
                        setState(1418);
                        _la = _input.LA(1);
                        if (!(_la == K_ABORT || _la == K_FAIL || _la == K_ROLLBACK))
                        {
                            _errHandler.recoverInline(this);
                        } else
                        {
                            if (_input.LA(1) == Token.EOF)
                            {
                                matchedEOF = true;
                            }
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        setState(1419);
                        match(COMMA);
                        setState(1420);
                        error_message();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(1423);
                match(CLOSE_PAR);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Indexed_columnContext extends ParserRuleContext
    {

        public Column_nameContext column_name()
        {
            return getRuleContext(Column_nameContext.class, 0);
        }

        public TerminalNode K_COLLATE()
        {
            return getToken(SQLiteParser.K_COLLATE, 0);
        }

        public Collation_nameContext collation_name()
        {
            return getRuleContext(Collation_nameContext.class, 0);
        }

        public TerminalNode K_ASC()
        {
            return getToken(SQLiteParser.K_ASC, 0);
        }

        public TerminalNode K_DESC()
        {
            return getToken(SQLiteParser.K_DESC, 0);
        }

        public Indexed_columnContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_indexed_column;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterIndexed_column(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitIndexed_column(this);
            }
        }
    }

    public final Indexed_columnContext indexed_column() throws RecognitionException
    {
        Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
        enterRule(_localctx, 108, RULE_indexed_column);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1425);
                column_name();
                setState(1428);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_COLLATE)
                {
                    {
                        setState(1426);
                        match(K_COLLATE);
                        setState(1427);
                        collation_name();
                    }
                }

                setState(1431);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_ASC || _la == K_DESC)
                {
                    {
                        setState(1430);
                        _la = _input.LA(1);
                        if (!(_la == K_ASC || _la == K_DESC))
                        {
                            _errHandler.recoverInline(this);
                        } else
                        {
                            if (_input.LA(1) == Token.EOF)
                            {
                                matchedEOF = true;
                            }
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Table_constraintContext extends ParserRuleContext
    {

        public List<Indexed_columnContext> indexed_column()
        {
            return getRuleContexts(Indexed_columnContext.class);
        }

        public Indexed_columnContext indexed_column(int i)
        {
            return getRuleContext(Indexed_columnContext.class, i);
        }

        public Conflict_clauseContext conflict_clause()
        {
            return getRuleContext(Conflict_clauseContext.class, 0);
        }

        public TerminalNode K_CHECK()
        {
            return getToken(SQLiteParser.K_CHECK, 0);
        }

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode K_FOREIGN()
        {
            return getToken(SQLiteParser.K_FOREIGN, 0);
        }

        public TerminalNode K_KEY()
        {
            return getToken(SQLiteParser.K_KEY, 0);
        }

        public Column_nameContext column_name()
        {
            return getRuleContext(Column_nameContext.class, 0);
        }

        public Foreign_key_clauseContext foreign_key_clause()
        {
            return getRuleContext(Foreign_key_clauseContext.class, 0);
        }

        public TerminalNode K_CONSTRAINT()
        {
            return getToken(SQLiteParser.K_CONSTRAINT, 0);
        }

        public NameContext name()
        {
            return getRuleContext(NameContext.class, 0);
        }

        public TerminalNode K_PRIMARY()
        {
            return getToken(SQLiteParser.K_PRIMARY, 0);
        }

        public TerminalNode K_UNIQUE()
        {
            return getToken(SQLiteParser.K_UNIQUE, 0);
        }

        public Table_constraintContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_table_constraint;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterTable_constraint(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitTable_constraint(this);
            }
        }
    }

    public final Table_constraintContext table_constraint() throws RecognitionException
    {
        Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
        enterRule(_localctx, 110, RULE_table_constraint);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1435);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_CONSTRAINT)
                {
                    {
                        setState(1433);
                        match(K_CONSTRAINT);
                        setState(1434);
                        name();
                    }
                }

                setState(1466);
                _errHandler.sync(this);
                switch (_input.LA(1))
                {
                    case K_PRIMARY:
                    case K_UNIQUE:
                    {
                        setState(1440);
                        _errHandler.sync(this);
                        switch (_input.LA(1))
                        {
                            case K_PRIMARY:
                            {
                                setState(1437);
                                match(K_PRIMARY);
                                setState(1438);
                                match(K_KEY);
                            }
                            break;
                            case K_UNIQUE:
                            {
                                setState(1439);
                                match(K_UNIQUE);
                            }
                            break;
                            default:
                                throw new NoViableAltException(this);
                        }
                        setState(1442);
                        match(OPEN_PAR);
                        setState(1443);
                        indexed_column();
                        setState(1448);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(1444);
                                    match(COMMA);
                                    setState(1445);
                                    indexed_column();
                                }
                            }
                            setState(1450);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1451);
                        match(CLOSE_PAR);
                        setState(1452);
                        conflict_clause();
                    }
                    break;
                    case K_CHECK:
                    {
                        setState(1454);
                        match(K_CHECK);
                        setState(1455);
                        match(OPEN_PAR);
                        setState(1456);
                        expr(0);
                        setState(1457);
                        match(CLOSE_PAR);
                    }
                    break;
                    case K_FOREIGN:
                    {
                        setState(1459);
                        match(K_FOREIGN);
                        setState(1460);
                        match(K_KEY);
                        setState(1461);
                        match(OPEN_PAR);
                        setState(1462);
                        column_name();
                        setState(1463);
                        match(CLOSE_PAR);
                        setState(1464);
                        foreign_key_clause();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class With_clauseContext extends ParserRuleContext
    {

        public TerminalNode K_WITH()
        {
            return getToken(SQLiteParser.K_WITH, 0);
        }

        public List<Cte_table_nameContext> cte_table_name()
        {
            return getRuleContexts(Cte_table_nameContext.class);
        }

        public Cte_table_nameContext cte_table_name(int i)
        {
            return getRuleContext(Cte_table_nameContext.class, i);
        }

        public List<TerminalNode> K_AS()
        {
            return getTokens(SQLiteParser.K_AS);
        }

        public TerminalNode K_AS(int i)
        {
            return getToken(SQLiteParser.K_AS, i);
        }

        public List<Select_stmtContext> select_stmt()
        {
            return getRuleContexts(Select_stmtContext.class);
        }

        public Select_stmtContext select_stmt(int i)
        {
            return getRuleContext(Select_stmtContext.class, i);
        }

        public TerminalNode K_RECURSIVE()
        {
            return getToken(SQLiteParser.K_RECURSIVE, 0);
        }

        public With_clauseContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_with_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterWith_clause(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitWith_clause(this);
            }
        }
    }

    public final With_clauseContext with_clause() throws RecognitionException
    {
        With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
        enterRule(_localctx, 112, RULE_with_clause);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1468);
                match(K_WITH);
                setState(1470);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 197, _ctx))
                {
                    case 1:
                    {
                        setState(1469);
                        match(K_RECURSIVE);
                    }
                    break;
                }
                setState(1472);
                cte_table_name();
                setState(1473);
                match(K_AS);
                setState(1474);
                match(OPEN_PAR);
                setState(1475);
                select_stmt();
                setState(1476);
                match(CLOSE_PAR);
                setState(1486);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA)
                {
                    {
                        {
                            setState(1477);
                            match(COMMA);
                            setState(1478);
                            cte_table_name();
                            setState(1479);
                            match(K_AS);
                            setState(1480);
                            match(OPEN_PAR);
                            setState(1481);
                            select_stmt();
                            setState(1482);
                            match(CLOSE_PAR);
                        }
                    }
                    setState(1488);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Qualified_table_nameContext extends ParserRuleContext
    {

        public Table_nameContext table_name()
        {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public TerminalNode K_INDEXED()
        {
            return getToken(SQLiteParser.K_INDEXED, 0);
        }

        public TerminalNode K_BY()
        {
            return getToken(SQLiteParser.K_BY, 0);
        }

        public Index_nameContext index_name()
        {
            return getRuleContext(Index_nameContext.class, 0);
        }

        public TerminalNode K_NOT()
        {
            return getToken(SQLiteParser.K_NOT, 0);
        }

        public Qualified_table_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_qualified_table_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterQualified_table_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitQualified_table_name(this);
            }
        }
    }

    public final Qualified_table_nameContext qualified_table_name() throws RecognitionException
    {
        Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
        enterRule(_localctx, 114, RULE_qualified_table_name);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1492);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 199, _ctx))
                {
                    case 1:
                    {
                        setState(1489);
                        database_name();
                        setState(1490);
                        match(DOT);
                    }
                    break;
                }
                setState(1494);
                table_name();
                setState(1500);
                _errHandler.sync(this);
                switch (_input.LA(1))
                {
                    case K_INDEXED:
                    {
                        setState(1495);
                        match(K_INDEXED);
                        setState(1496);
                        match(K_BY);
                        setState(1497);
                        index_name();
                    }
                    break;
                    case K_NOT:
                    {
                        setState(1498);
                        match(K_NOT);
                        setState(1499);
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
                    case K_WHERE:
                    case K_WITH:
                    case UNEXPECTED_CHAR:
                        break;
                    default:
                        break;
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Ordering_termContext extends ParserRuleContext
    {

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode K_COLLATE()
        {
            return getToken(SQLiteParser.K_COLLATE, 0);
        }

        public Collation_nameContext collation_name()
        {
            return getRuleContext(Collation_nameContext.class, 0);
        }

        public TerminalNode K_ASC()
        {
            return getToken(SQLiteParser.K_ASC, 0);
        }

        public TerminalNode K_DESC()
        {
            return getToken(SQLiteParser.K_DESC, 0);
        }

        public Ordering_termContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_ordering_term;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterOrdering_term(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitOrdering_term(this);
            }
        }
    }

    public final Ordering_termContext ordering_term() throws RecognitionException
    {
        Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
        enterRule(_localctx, 116, RULE_ordering_term);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1502);
                expr(0);
                setState(1505);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_COLLATE)
                {
                    {
                        setState(1503);
                        match(K_COLLATE);
                        setState(1504);
                        collation_name();
                    }
                }

                setState(1508);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_ASC || _la == K_DESC)
                {
                    {
                        setState(1507);
                        _la = _input.LA(1);
                        if (!(_la == K_ASC || _la == K_DESC))
                        {
                            _errHandler.recoverInline(this);
                        } else
                        {
                            if (_input.LA(1) == Token.EOF)
                            {
                                matchedEOF = true;
                            }
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Pragma_valueContext extends ParserRuleContext
    {

        public Signed_numberContext signed_number()
        {
            return getRuleContext(Signed_numberContext.class, 0);
        }

        public NameContext name()
        {
            return getRuleContext(NameContext.class, 0);
        }

        public TerminalNode STRING_LITERAL()
        {
            return getToken(SQLiteParser.STRING_LITERAL, 0);
        }

        public Pragma_valueContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_pragma_value;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterPragma_value(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitPragma_value(this);
            }
        }
    }

    public final Pragma_valueContext pragma_value() throws RecognitionException
    {
        Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
        enterRule(_localctx, 118, RULE_pragma_value);
        try
        {
            setState(1513);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 203, _ctx))
            {
                case 1:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1510);
                        signed_number();
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1511);
                        name();
                    }
                    break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(1512);
                        match(STRING_LITERAL);
                    }
                    break;
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Common_table_expressionContext extends ParserRuleContext
    {

        public Table_nameContext table_name()
        {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public TerminalNode K_AS()
        {
            return getToken(SQLiteParser.K_AS, 0);
        }

        public Select_stmtContext select_stmt()
        {
            return getRuleContext(Select_stmtContext.class, 0);
        }

        public List<Column_nameContext> column_name()
        {
            return getRuleContexts(Column_nameContext.class);
        }

        public Column_nameContext column_name(int i)
        {
            return getRuleContext(Column_nameContext.class, i);
        }

        public Common_table_expressionContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_common_table_expression;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterCommon_table_expression(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitCommon_table_expression(this);
            }
        }
    }

    public final Common_table_expressionContext common_table_expression() throws RecognitionException
    {
        Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
        enterRule(_localctx, 120, RULE_common_table_expression);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1515);
                table_name();
                setState(1527);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OPEN_PAR)
                {
                    {
                        setState(1516);
                        match(OPEN_PAR);
                        setState(1517);
                        column_name();
                        setState(1522);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(1518);
                                    match(COMMA);
                                    setState(1519);
                                    column_name();
                                }
                            }
                            setState(1524);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1525);
                        match(CLOSE_PAR);
                    }
                }

                setState(1529);
                match(K_AS);
                setState(1530);
                match(OPEN_PAR);
                setState(1531);
                select_stmt();
                setState(1532);
                match(CLOSE_PAR);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Result_columnContext extends ParserRuleContext
    {

        public Table_nameContext table_name()
        {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        public Column_aliasContext column_alias()
        {
            return getRuleContext(Column_aliasContext.class, 0);
        }

        public TerminalNode K_AS()
        {
            return getToken(SQLiteParser.K_AS, 0);
        }

        public Result_columnContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_result_column;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterResult_column(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitResult_column(this);
            }
        }
    }

    public final Result_columnContext result_column() throws RecognitionException
    {
        Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
        enterRule(_localctx, 122, RULE_result_column);
        int _la;
        try
        {
            setState(1546);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 208, _ctx))
            {
                case 1:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1534);
                        match(STAR);
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1535);
                        table_name();
                        setState(1536);
                        match(DOT);
                        setState(1537);
                        match(STAR);
                    }
                    break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(1539);
                        expr(0);
                        setState(1544);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == K_AS || _la == IDENTIFIER || _la == STRING_LITERAL)
                        {
                            {
                                setState(1541);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == K_AS)
                                {
                                    {
                                        setState(1540);
                                        match(K_AS);
                                    }
                                }

                                setState(1543);
                                column_alias();
                            }
                        }

                    }
                    break;
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Table_or_subqueryContext extends ParserRuleContext
    {

        public Table_nameContext table_name()
        {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public Database_nameContext database_name()
        {
            return getRuleContext(Database_nameContext.class, 0);
        }

        public Table_aliasContext table_alias()
        {
            return getRuleContext(Table_aliasContext.class, 0);
        }

        public TerminalNode K_INDEXED()
        {
            return getToken(SQLiteParser.K_INDEXED, 0);
        }

        public TerminalNode K_BY()
        {
            return getToken(SQLiteParser.K_BY, 0);
        }

        public Index_nameContext index_name()
        {
            return getRuleContext(Index_nameContext.class, 0);
        }

        public TerminalNode K_NOT()
        {
            return getToken(SQLiteParser.K_NOT, 0);
        }

        public TerminalNode K_AS()
        {
            return getToken(SQLiteParser.K_AS, 0);
        }

        public List<Table_or_subqueryContext> table_or_subquery()
        {
            return getRuleContexts(Table_or_subqueryContext.class);
        }

        public Table_or_subqueryContext table_or_subquery(int i)
        {
            return getRuleContext(Table_or_subqueryContext.class, i);
        }

        public Join_clauseContext join_clause()
        {
            return getRuleContext(Join_clauseContext.class, 0);
        }

        public Select_stmtContext select_stmt()
        {
            return getRuleContext(Select_stmtContext.class, 0);
        }

        public Table_or_subqueryContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_table_or_subquery;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterTable_or_subquery(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitTable_or_subquery(this);
            }
        }
    }

    public final Table_or_subqueryContext table_or_subquery() throws RecognitionException
    {
        Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
        enterRule(_localctx, 124, RULE_table_or_subquery);
        int _la;
        try
        {
            setState(1595);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 219, _ctx))
            {
                case 1:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1551);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 209, _ctx))
                        {
                            case 1:
                            {
                                setState(1548);
                                database_name();
                                setState(1549);
                                match(DOT);
                            }
                            break;
                        }
                        setState(1553);
                        table_name();
                        setState(1558);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 211, _ctx))
                        {
                            case 1:
                            {
                                setState(1555);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 210, _ctx))
                                {
                                    case 1:
                                    {
                                        setState(1554);
                                        match(K_AS);
                                    }
                                    break;
                                }
                                setState(1557);
                                table_alias();
                            }
                            break;
                        }
                        setState(1565);
                        _errHandler.sync(this);
                        switch (_input.LA(1))
                        {
                            case K_INDEXED:
                            {
                                setState(1560);
                                match(K_INDEXED);
                                setState(1561);
                                match(K_BY);
                                setState(1562);
                                index_name();
                            }
                            break;
                            case K_NOT:
                            {
                                setState(1563);
                                match(K_NOT);
                                setState(1564);
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
                        setState(1567);
                        match(OPEN_PAR);
                        setState(1577);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 214, _ctx))
                        {
                            case 1:
                            {
                                setState(1568);
                                table_or_subquery();
                                setState(1573);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == COMMA)
                                {
                                    {
                                        {
                                            setState(1569);
                                            match(COMMA);
                                            setState(1570);
                                            table_or_subquery();
                                        }
                                    }
                                    setState(1575);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                            break;
                            case 2:
                            {
                                setState(1576);
                                join_clause();
                            }
                            break;
                        }
                        setState(1579);
                        match(CLOSE_PAR);
                        setState(1584);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 216, _ctx))
                        {
                            case 1:
                            {
                                setState(1581);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 215, _ctx))
                                {
                                    case 1:
                                    {
                                        setState(1580);
                                        match(K_AS);
                                    }
                                    break;
                                }
                                setState(1583);
                                table_alias();
                            }
                            break;
                        }
                    }
                    break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(1586);
                        match(OPEN_PAR);
                        setState(1587);
                        select_stmt();
                        setState(1588);
                        match(CLOSE_PAR);
                        setState(1593);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 218, _ctx))
                        {
                            case 1:
                            {
                                setState(1590);
                                _errHandler.sync(this);
                                switch (getInterpreter().adaptivePredict(_input, 217, _ctx))
                                {
                                    case 1:
                                    {
                                        setState(1589);
                                        match(K_AS);
                                    }
                                    break;
                                }
                                setState(1592);
                                table_alias();
                            }
                            break;
                        }
                    }
                    break;
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Join_clauseContext extends ParserRuleContext
    {

        public List<Table_or_subqueryContext> table_or_subquery()
        {
            return getRuleContexts(Table_or_subqueryContext.class);
        }

        public Table_or_subqueryContext table_or_subquery(int i)
        {
            return getRuleContext(Table_or_subqueryContext.class, i);
        }

        public List<Join_operatorContext> join_operator()
        {
            return getRuleContexts(Join_operatorContext.class);
        }

        public Join_operatorContext join_operator(int i)
        {
            return getRuleContext(Join_operatorContext.class, i);
        }

        public List<Join_constraintContext> join_constraint()
        {
            return getRuleContexts(Join_constraintContext.class);
        }

        public Join_constraintContext join_constraint(int i)
        {
            return getRuleContext(Join_constraintContext.class, i);
        }

        public Join_clauseContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_join_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterJoin_clause(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitJoin_clause(this);
            }
        }
    }

    public final Join_clauseContext join_clause() throws RecognitionException
    {
        Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
        enterRule(_localctx, 126, RULE_join_clause);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1597);
                table_or_subquery();
                setState(1604);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA || _la == K_CROSS || ((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (K_INNER - 94)) | (1L << (K_JOIN - 94)) | (1L << (K_LEFT - 94)) | (1L << (K_NATURAL - 94)))) != 0))
                {
                    {
                        {
                            setState(1598);
                            join_operator();
                            setState(1599);
                            table_or_subquery();
                            setState(1600);
                            join_constraint();
                        }
                    }
                    setState(1606);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Join_operatorContext extends ParserRuleContext
    {

        public TerminalNode K_JOIN()
        {
            return getToken(SQLiteParser.K_JOIN, 0);
        }

        public TerminalNode K_NATURAL()
        {
            return getToken(SQLiteParser.K_NATURAL, 0);
        }

        public TerminalNode K_LEFT()
        {
            return getToken(SQLiteParser.K_LEFT, 0);
        }

        public TerminalNode K_INNER()
        {
            return getToken(SQLiteParser.K_INNER, 0);
        }

        public TerminalNode K_CROSS()
        {
            return getToken(SQLiteParser.K_CROSS, 0);
        }

        public TerminalNode K_OUTER()
        {
            return getToken(SQLiteParser.K_OUTER, 0);
        }

        public Join_operatorContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_join_operator;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterJoin_operator(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitJoin_operator(this);
            }
        }
    }

    public final Join_operatorContext join_operator() throws RecognitionException
    {
        Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
        enterRule(_localctx, 128, RULE_join_operator);
        int _la;
        try
        {
            setState(1620);
            _errHandler.sync(this);
            switch (_input.LA(1))
            {
                case COMMA:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1607);
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
                        setState(1609);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        if (_la == K_NATURAL)
                        {
                            {
                                setState(1608);
                                match(K_NATURAL);
                            }
                        }

                        setState(1617);
                        _errHandler.sync(this);
                        switch (_input.LA(1))
                        {
                            case K_LEFT:
                            {
                                setState(1611);
                                match(K_LEFT);
                                setState(1613);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                if (_la == K_OUTER)
                                {
                                    {
                                        setState(1612);
                                        match(K_OUTER);
                                    }
                                }

                            }
                            break;
                            case K_INNER:
                            {
                                setState(1615);
                                match(K_INNER);
                            }
                            break;
                            case K_CROSS:
                            {
                                setState(1616);
                                match(K_CROSS);
                            }
                            break;
                            case K_JOIN:
                                break;
                            default:
                                break;
                        }
                        setState(1619);
                        match(K_JOIN);
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Join_constraintContext extends ParserRuleContext
    {

        public TerminalNode K_ON()
        {
            return getToken(SQLiteParser.K_ON, 0);
        }

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode K_USING()
        {
            return getToken(SQLiteParser.K_USING, 0);
        }

        public List<Column_nameContext> column_name()
        {
            return getRuleContexts(Column_nameContext.class);
        }

        public Column_nameContext column_name(int i)
        {
            return getRuleContext(Column_nameContext.class, i);
        }

        public Join_constraintContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_join_constraint;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterJoin_constraint(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitJoin_constraint(this);
            }
        }
    }

    public final Join_constraintContext join_constraint() throws RecognitionException
    {
        Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
        enterRule(_localctx, 130, RULE_join_constraint);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1636);
                _errHandler.sync(this);
                switch (_input.LA(1))
                {
                    case K_ON:
                    {
                        setState(1622);
                        match(K_ON);
                        setState(1623);
                        expr(0);
                    }
                    break;
                    case K_USING:
                    {
                        setState(1624);
                        match(K_USING);
                        setState(1625);
                        match(OPEN_PAR);
                        setState(1626);
                        column_name();
                        setState(1631);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(1627);
                                    match(COMMA);
                                    setState(1628);
                                    column_name();
                                }
                            }
                            setState(1633);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1634);
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
                    case K_WHERE:
                    case K_WITH:
                    case UNEXPECTED_CHAR:
                        break;
                    default:
                        break;
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Select_coreContext extends ParserRuleContext
    {

        public TerminalNode K_SELECT()
        {
            return getToken(SQLiteParser.K_SELECT, 0);
        }

        public List<Result_columnContext> result_column()
        {
            return getRuleContexts(Result_columnContext.class);
        }

        public Result_columnContext result_column(int i)
        {
            return getRuleContext(Result_columnContext.class, i);
        }

        public TerminalNode K_FROM()
        {
            return getToken(SQLiteParser.K_FROM, 0);
        }

        public Select_core_whereContext select_core_where()
        {
            return getRuleContext(Select_core_whereContext.class, 0);
        }

        public Select_core_groud_byContext select_core_groud_by()
        {
            return getRuleContext(Select_core_groud_byContext.class, 0);
        }

        public TerminalNode K_DISTINCT()
        {
            return getToken(SQLiteParser.K_DISTINCT, 0);
        }

        public TerminalNode K_ALL()
        {
            return getToken(SQLiteParser.K_ALL, 0);
        }

        public List<Table_or_subqueryContext> table_or_subquery()
        {
            return getRuleContexts(Table_or_subqueryContext.class);
        }

        public Table_or_subqueryContext table_or_subquery(int i)
        {
            return getRuleContext(Table_or_subqueryContext.class, i);
        }

        public Join_clauseContext join_clause()
        {
            return getRuleContext(Join_clauseContext.class, 0);
        }

        public Select_coreContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_select_core;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterSelect_core(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitSelect_core(this);
            }
        }
    }

    public final Select_coreContext select_core() throws RecognitionException
    {
        Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
        enterRule(_localctx, 132, RULE_select_core);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1638);
                match(K_SELECT);
                setState(1640);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 227, _ctx))
                {
                    case 1:
                    {
                        setState(1639);
                        _la = _input.LA(1);
                        if (!(_la == K_ALL || _la == K_DISTINCT))
                        {
                            _errHandler.recoverInline(this);
                        } else
                        {
                            if (_input.LA(1) == Token.EOF)
                            {
                                matchedEOF = true;
                            }
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                    break;
                }
                setState(1642);
                result_column();
                setState(1647);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA)
                {
                    {
                        {
                            setState(1643);
                            match(COMMA);
                            setState(1644);
                            result_column();
                        }
                    }
                    setState(1649);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1662);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_FROM)
                {
                    {
                        setState(1650);
                        match(K_FROM);
                        setState(1660);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 230, _ctx))
                        {
                            case 1:
                            {
                                setState(1651);
                                table_or_subquery();
                                setState(1656);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la == COMMA)
                                {
                                    {
                                        {
                                            setState(1652);
                                            match(COMMA);
                                            setState(1653);
                                            table_or_subquery();
                                        }
                                    }
                                    setState(1658);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                            break;
                            case 2:
                            {
                                setState(1659);
                                join_clause();
                            }
                            break;
                        }
                    }
                }

                setState(1665);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_WHERE)
                {
                    {
                        setState(1664);
                        select_core_where();
                    }
                }

                setState(1668);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_GROUP)
                {
                    {
                        setState(1667);
                        select_core_groud_by();
                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Select_core_groud_byContext extends ParserRuleContext
    {

        public TerminalNode K_GROUP()
        {
            return getToken(SQLiteParser.K_GROUP, 0);
        }

        public TerminalNode K_BY()
        {
            return getToken(SQLiteParser.K_BY, 0);
        }

        public List<ExprContext> expr()
        {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i)
        {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode K_HAVING()
        {
            return getToken(SQLiteParser.K_HAVING, 0);
        }

        public Select_core_groud_byContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_select_core_groud_by;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterSelect_core_groud_by(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitSelect_core_groud_by(this);
            }
        }
    }

    public final Select_core_groud_byContext select_core_groud_by() throws RecognitionException
    {
        Select_core_groud_byContext _localctx = new Select_core_groud_byContext(_ctx, getState());
        enterRule(_localctx, 134, RULE_select_core_groud_by);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1670);
                match(K_GROUP);
                setState(1671);
                match(K_BY);
                setState(1672);
                expr(0);
                setState(1677);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA)
                {
                    {
                        {
                            setState(1673);
                            match(COMMA);
                            setState(1674);
                            expr(0);
                        }
                    }
                    setState(1679);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(1682);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == K_HAVING)
                {
                    {
                        setState(1680);
                        match(K_HAVING);
                        setState(1681);
                        expr(0);
                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Select_core_whereContext extends ParserRuleContext
    {

        public TerminalNode K_WHERE()
        {
            return getToken(SQLiteParser.K_WHERE, 0);
        }

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        public Select_core_whereContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_select_core_where;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterSelect_core_where(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitSelect_core_where(this);
            }
        }
    }

    public final Select_core_whereContext select_core_where() throws RecognitionException
    {
        Select_core_whereContext _localctx = new Select_core_whereContext(_ctx, getState());
        enterRule(_localctx, 136, RULE_select_core_where);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1684);
                match(K_WHERE);
                setState(1685);
                expr(0);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Compound_operatorContext extends ParserRuleContext
    {

        public TerminalNode K_UNION()
        {
            return getToken(SQLiteParser.K_UNION, 0);
        }

        public TerminalNode K_ALL()
        {
            return getToken(SQLiteParser.K_ALL, 0);
        }

        public TerminalNode K_INTERSECT()
        {
            return getToken(SQLiteParser.K_INTERSECT, 0);
        }

        public TerminalNode K_EXCEPT()
        {
            return getToken(SQLiteParser.K_EXCEPT, 0);
        }

        public Compound_operatorContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_compound_operator;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterCompound_operator(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitCompound_operator(this);
            }
        }
    }

    public final Compound_operatorContext compound_operator() throws RecognitionException
    {
        Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
        enterRule(_localctx, 138, RULE_compound_operator);
        try
        {
            setState(1692);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 236, _ctx))
            {
                case 1:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1687);
                        match(K_UNION);
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1688);
                        match(K_UNION);
                        setState(1689);
                        match(K_ALL);
                    }
                    break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(1690);
                        match(K_INTERSECT);
                    }
                    break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                    {
                        setState(1691);
                        match(K_EXCEPT);
                    }
                    break;
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Cte_table_nameContext extends ParserRuleContext
    {

        public Table_nameContext table_name()
        {
            return getRuleContext(Table_nameContext.class, 0);
        }

        public List<Column_nameContext> column_name()
        {
            return getRuleContexts(Column_nameContext.class);
        }

        public Column_nameContext column_name(int i)
        {
            return getRuleContext(Column_nameContext.class, i);
        }

        public Cte_table_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_cte_table_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterCte_table_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitCte_table_name(this);
            }
        }
    }

    public final Cte_table_nameContext cte_table_name() throws RecognitionException
    {
        Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
        enterRule(_localctx, 140, RULE_cte_table_name);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1694);
                table_name();
                setState(1706);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == OPEN_PAR)
                {
                    {
                        setState(1695);
                        match(OPEN_PAR);
                        setState(1696);
                        column_name();
                        setState(1701);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA)
                        {
                            {
                                {
                                    setState(1697);
                                    match(COMMA);
                                    setState(1698);
                                    column_name();
                                }
                            }
                            setState(1703);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(1704);
                        match(CLOSE_PAR);
                    }
                }

            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Signed_numberContext extends ParserRuleContext
    {

        public TerminalNode NUMERIC_LITERAL()
        {
            return getToken(SQLiteParser.NUMERIC_LITERAL, 0);
        }

        public Signed_numberContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_signed_number;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterSigned_number(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitSigned_number(this);
            }
        }
    }

    public final Signed_numberContext signed_number() throws RecognitionException
    {
        Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
        enterRule(_localctx, 142, RULE_signed_number);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1709);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == PLUS || _la == MINUS)
                {
                    {
                        setState(1708);
                        _la = _input.LA(1);
                        if (!(_la == PLUS || _la == MINUS))
                        {
                            _errHandler.recoverInline(this);
                        } else
                        {
                            if (_input.LA(1) == Token.EOF)
                            {
                                matchedEOF = true;
                            }
                            _errHandler.reportMatch(this);
                            consume();
                        }
                    }
                }

                setState(1711);
                match(NUMERIC_LITERAL);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Literal_valueContext extends ParserRuleContext
    {

        public TerminalNode NUMERIC_LITERAL()
        {
            return getToken(SQLiteParser.NUMERIC_LITERAL, 0);
        }

        public TerminalNode STRING_LITERAL()
        {
            return getToken(SQLiteParser.STRING_LITERAL, 0);
        }

        public TerminalNode BLOB_LITERAL()
        {
            return getToken(SQLiteParser.BLOB_LITERAL, 0);
        }

        public TerminalNode K_NULL()
        {
            return getToken(SQLiteParser.K_NULL, 0);
        }

        public TerminalNode K_CURRENT_TIME()
        {
            return getToken(SQLiteParser.K_CURRENT_TIME, 0);
        }

        public TerminalNode K_CURRENT_DATE()
        {
            return getToken(SQLiteParser.K_CURRENT_DATE, 0);
        }

        public TerminalNode K_CURRENT_TIMESTAMP()
        {
            return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0);
        }

        public Literal_valueContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_literal_value;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterLiteral_value(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitLiteral_value(this);
            }
        }
    }

    public final Literal_valueContext literal_value() throws RecognitionException
    {
        Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
        enterRule(_localctx, 144, RULE_literal_value);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1713);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & ((1L << (K_NULL - 111)) | (1L << (NUMERIC_LITERAL - 111)) | (1L << (STRING_LITERAL - 111)) | (1L << (BLOB_LITERAL - 111)))) != 0)))
                {
                    _errHandler.recoverInline(this);
                } else
                {
                    if (_input.LA(1) == Token.EOF)
                    {
                        matchedEOF = true;
                    }
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Unary_operatorContext extends ParserRuleContext
    {

        public TerminalNode K_NOT()
        {
            return getToken(SQLiteParser.K_NOT, 0);
        }

        public Unary_operatorContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_unary_operator;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterUnary_operator(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitUnary_operator(this);
            }
        }
    }

    public final Unary_operatorContext unary_operator() throws RecognitionException
    {
        Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
        enterRule(_localctx, 146, RULE_unary_operator);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1715);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la == K_NOT))
                {
                    _errHandler.recoverInline(this);
                } else
                {
                    if (_input.LA(1) == Token.EOF)
                    {
                        matchedEOF = true;
                    }
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Error_messageContext extends ParserRuleContext
    {

        public TerminalNode STRING_LITERAL()
        {
            return getToken(SQLiteParser.STRING_LITERAL, 0);
        }

        public Error_messageContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_error_message;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterError_message(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitError_message(this);
            }
        }
    }

    public final Error_messageContext error_message() throws RecognitionException
    {
        Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
        enterRule(_localctx, 148, RULE_error_message);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1717);
                match(STRING_LITERAL);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Module_argumentContext extends ParserRuleContext
    {

        public ExprContext expr()
        {
            return getRuleContext(ExprContext.class, 0);
        }

        public Column_defContext column_def()
        {
            return getRuleContext(Column_defContext.class, 0);
        }

        public Module_argumentContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_module_argument;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterModule_argument(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitModule_argument(this);
            }
        }
    }

    public final Module_argumentContext module_argument() throws RecognitionException
    {
        Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
        enterRule(_localctx, 150, RULE_module_argument);
        try
        {
            setState(1721);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 240, _ctx))
            {
                case 1:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1719);
                        expr(0);
                    }
                    break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                    {
                        setState(1720);
                        column_def();
                    }
                    break;
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Column_aliasContext extends ParserRuleContext
    {

        public TerminalNode IDENTIFIER()
        {
            return getToken(SQLiteParser.IDENTIFIER, 0);
        }

        public TerminalNode STRING_LITERAL()
        {
            return getToken(SQLiteParser.STRING_LITERAL, 0);
        }

        public Column_aliasContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_column_alias;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterColumn_alias(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitColumn_alias(this);
            }
        }
    }

    public final Column_aliasContext column_alias() throws RecognitionException
    {
        Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
        enterRule(_localctx, 152, RULE_column_alias);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1723);
                _la = _input.LA(1);
                if (!(_la == IDENTIFIER || _la == STRING_LITERAL))
                {
                    _errHandler.recoverInline(this);
                } else
                {
                    if (_input.LA(1) == Token.EOF)
                    {
                        matchedEOF = true;
                    }
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class KeywordContext extends ParserRuleContext
    {

        public TerminalNode K_ABORT()
        {
            return getToken(SQLiteParser.K_ABORT, 0);
        }

        public TerminalNode K_ACTION()
        {
            return getToken(SQLiteParser.K_ACTION, 0);
        }

        public TerminalNode K_ADD()
        {
            return getToken(SQLiteParser.K_ADD, 0);
        }

        public TerminalNode K_AFTER()
        {
            return getToken(SQLiteParser.K_AFTER, 0);
        }

        public TerminalNode K_ALL()
        {
            return getToken(SQLiteParser.K_ALL, 0);
        }

        public TerminalNode K_ALTER()
        {
            return getToken(SQLiteParser.K_ALTER, 0);
        }

        public TerminalNode K_ANALYZE()
        {
            return getToken(SQLiteParser.K_ANALYZE, 0);
        }

        public TerminalNode K_AND()
        {
            return getToken(SQLiteParser.K_AND, 0);
        }

        public TerminalNode K_AS()
        {
            return getToken(SQLiteParser.K_AS, 0);
        }

        public TerminalNode K_ASC()
        {
            return getToken(SQLiteParser.K_ASC, 0);
        }

        public TerminalNode K_ATTACH()
        {
            return getToken(SQLiteParser.K_ATTACH, 0);
        }

        public TerminalNode K_AUTOINCREMENT()
        {
            return getToken(SQLiteParser.K_AUTOINCREMENT, 0);
        }

        public TerminalNode K_BEFORE()
        {
            return getToken(SQLiteParser.K_BEFORE, 0);
        }

        public TerminalNode K_BEGIN()
        {
            return getToken(SQLiteParser.K_BEGIN, 0);
        }

        public TerminalNode K_BETWEEN()
        {
            return getToken(SQLiteParser.K_BETWEEN, 0);
        }

        public TerminalNode K_BY()
        {
            return getToken(SQLiteParser.K_BY, 0);
        }

        public TerminalNode K_CASCADE()
        {
            return getToken(SQLiteParser.K_CASCADE, 0);
        }

        public TerminalNode K_CASE()
        {
            return getToken(SQLiteParser.K_CASE, 0);
        }

        public TerminalNode K_CAST()
        {
            return getToken(SQLiteParser.K_CAST, 0);
        }

        public TerminalNode K_CHECK()
        {
            return getToken(SQLiteParser.K_CHECK, 0);
        }

        public TerminalNode K_COLLATE()
        {
            return getToken(SQLiteParser.K_COLLATE, 0);
        }

        public TerminalNode K_COLUMN()
        {
            return getToken(SQLiteParser.K_COLUMN, 0);
        }

        public TerminalNode K_COMMIT()
        {
            return getToken(SQLiteParser.K_COMMIT, 0);
        }

        public TerminalNode K_CONFLICT()
        {
            return getToken(SQLiteParser.K_CONFLICT, 0);
        }

        public TerminalNode K_CONSTRAINT()
        {
            return getToken(SQLiteParser.K_CONSTRAINT, 0);
        }

        public TerminalNode K_CREATE()
        {
            return getToken(SQLiteParser.K_CREATE, 0);
        }

        public TerminalNode K_CROSS()
        {
            return getToken(SQLiteParser.K_CROSS, 0);
        }

        public TerminalNode K_CURRENT_DATE()
        {
            return getToken(SQLiteParser.K_CURRENT_DATE, 0);
        }

        public TerminalNode K_CURRENT_TIME()
        {
            return getToken(SQLiteParser.K_CURRENT_TIME, 0);
        }

        public TerminalNode K_CURRENT_TIMESTAMP()
        {
            return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0);
        }

        public TerminalNode K_DATABASE()
        {
            return getToken(SQLiteParser.K_DATABASE, 0);
        }

        public TerminalNode K_DEFAULT()
        {
            return getToken(SQLiteParser.K_DEFAULT, 0);
        }

        public TerminalNode K_DEFERRABLE()
        {
            return getToken(SQLiteParser.K_DEFERRABLE, 0);
        }

        public TerminalNode K_DEFERRED()
        {
            return getToken(SQLiteParser.K_DEFERRED, 0);
        }

        public TerminalNode K_DELETE()
        {
            return getToken(SQLiteParser.K_DELETE, 0);
        }

        public TerminalNode K_DESC()
        {
            return getToken(SQLiteParser.K_DESC, 0);
        }

        public TerminalNode K_DETACH()
        {
            return getToken(SQLiteParser.K_DETACH, 0);
        }

        public TerminalNode K_DISTINCT()
        {
            return getToken(SQLiteParser.K_DISTINCT, 0);
        }

        public TerminalNode K_DROP()
        {
            return getToken(SQLiteParser.K_DROP, 0);
        }

        public TerminalNode K_EACH()
        {
            return getToken(SQLiteParser.K_EACH, 0);
        }

        public TerminalNode K_ELSE()
        {
            return getToken(SQLiteParser.K_ELSE, 0);
        }

        public TerminalNode K_END()
        {
            return getToken(SQLiteParser.K_END, 0);
        }

        public TerminalNode K_ESCAPE()
        {
            return getToken(SQLiteParser.K_ESCAPE, 0);
        }

        public TerminalNode K_EXCEPT()
        {
            return getToken(SQLiteParser.K_EXCEPT, 0);
        }

        public TerminalNode K_EXCLUSIVE()
        {
            return getToken(SQLiteParser.K_EXCLUSIVE, 0);
        }

        public TerminalNode K_EXISTS()
        {
            return getToken(SQLiteParser.K_EXISTS, 0);
        }

        public TerminalNode K_EXPLAIN()
        {
            return getToken(SQLiteParser.K_EXPLAIN, 0);
        }

        public TerminalNode K_FAIL()
        {
            return getToken(SQLiteParser.K_FAIL, 0);
        }

        public TerminalNode K_FOR()
        {
            return getToken(SQLiteParser.K_FOR, 0);
        }

        public TerminalNode K_FOREIGN()
        {
            return getToken(SQLiteParser.K_FOREIGN, 0);
        }

        public TerminalNode K_FROM()
        {
            return getToken(SQLiteParser.K_FROM, 0);
        }

        public TerminalNode K_FULL()
        {
            return getToken(SQLiteParser.K_FULL, 0);
        }

        public TerminalNode K_GLOB()
        {
            return getToken(SQLiteParser.K_GLOB, 0);
        }

        public TerminalNode K_GROUP()
        {
            return getToken(SQLiteParser.K_GROUP, 0);
        }

        public TerminalNode K_HAVING()
        {
            return getToken(SQLiteParser.K_HAVING, 0);
        }

        public TerminalNode K_IF()
        {
            return getToken(SQLiteParser.K_IF, 0);
        }

        public TerminalNode K_IGNORE()
        {
            return getToken(SQLiteParser.K_IGNORE, 0);
        }

        public TerminalNode K_IMMEDIATE()
        {
            return getToken(SQLiteParser.K_IMMEDIATE, 0);
        }

        public TerminalNode K_IN()
        {
            return getToken(SQLiteParser.K_IN, 0);
        }

        public TerminalNode K_INDEX()
        {
            return getToken(SQLiteParser.K_INDEX, 0);
        }

        public TerminalNode K_INDEXED()
        {
            return getToken(SQLiteParser.K_INDEXED, 0);
        }

        public TerminalNode K_INITIALLY()
        {
            return getToken(SQLiteParser.K_INITIALLY, 0);
        }

        public TerminalNode K_INNER()
        {
            return getToken(SQLiteParser.K_INNER, 0);
        }

        public TerminalNode K_INSERT()
        {
            return getToken(SQLiteParser.K_INSERT, 0);
        }

        public TerminalNode K_INSTEAD()
        {
            return getToken(SQLiteParser.K_INSTEAD, 0);
        }

        public TerminalNode K_INTERSECT()
        {
            return getToken(SQLiteParser.K_INTERSECT, 0);
        }

        public TerminalNode K_INTO()
        {
            return getToken(SQLiteParser.K_INTO, 0);
        }

        public TerminalNode K_IS()
        {
            return getToken(SQLiteParser.K_IS, 0);
        }

        public TerminalNode K_ISNULL()
        {
            return getToken(SQLiteParser.K_ISNULL, 0);
        }

        public TerminalNode K_JOIN()
        {
            return getToken(SQLiteParser.K_JOIN, 0);
        }

        public TerminalNode K_KEY()
        {
            return getToken(SQLiteParser.K_KEY, 0);
        }

        public TerminalNode K_LEFT()
        {
            return getToken(SQLiteParser.K_LEFT, 0);
        }

        public TerminalNode K_LIKE()
        {
            return getToken(SQLiteParser.K_LIKE, 0);
        }

        public TerminalNode K_LIMIT()
        {
            return getToken(SQLiteParser.K_LIMIT, 0);
        }

        public TerminalNode K_MATCH()
        {
            return getToken(SQLiteParser.K_MATCH, 0);
        }

        public TerminalNode K_NATURAL()
        {
            return getToken(SQLiteParser.K_NATURAL, 0);
        }

        public TerminalNode K_NO()
        {
            return getToken(SQLiteParser.K_NO, 0);
        }

        public TerminalNode K_NOT()
        {
            return getToken(SQLiteParser.K_NOT, 0);
        }

        public TerminalNode K_NOTNULL()
        {
            return getToken(SQLiteParser.K_NOTNULL, 0);
        }

        public TerminalNode K_NULL()
        {
            return getToken(SQLiteParser.K_NULL, 0);
        }

        public TerminalNode K_OF()
        {
            return getToken(SQLiteParser.K_OF, 0);
        }

        public TerminalNode K_OFFSET()
        {
            return getToken(SQLiteParser.K_OFFSET, 0);
        }

        public TerminalNode K_ON()
        {
            return getToken(SQLiteParser.K_ON, 0);
        }

        public TerminalNode K_OR()
        {
            return getToken(SQLiteParser.K_OR, 0);
        }

        public TerminalNode K_ORDER()
        {
            return getToken(SQLiteParser.K_ORDER, 0);
        }

        public TerminalNode K_OUTER()
        {
            return getToken(SQLiteParser.K_OUTER, 0);
        }

        public TerminalNode K_PLAN()
        {
            return getToken(SQLiteParser.K_PLAN, 0);
        }

        public TerminalNode K_PRAGMA()
        {
            return getToken(SQLiteParser.K_PRAGMA, 0);
        }

        public TerminalNode K_PRIMARY()
        {
            return getToken(SQLiteParser.K_PRIMARY, 0);
        }

        public TerminalNode K_QUERY()
        {
            return getToken(SQLiteParser.K_QUERY, 0);
        }

        public TerminalNode K_RAISE()
        {
            return getToken(SQLiteParser.K_RAISE, 0);
        }

        public TerminalNode K_RECURSIVE()
        {
            return getToken(SQLiteParser.K_RECURSIVE, 0);
        }

        public TerminalNode K_REFERENCES()
        {
            return getToken(SQLiteParser.K_REFERENCES, 0);
        }

        public TerminalNode K_REGEXP()
        {
            return getToken(SQLiteParser.K_REGEXP, 0);
        }

        public TerminalNode K_REINDEX()
        {
            return getToken(SQLiteParser.K_REINDEX, 0);
        }

        public TerminalNode K_RELEASE()
        {
            return getToken(SQLiteParser.K_RELEASE, 0);
        }

        public TerminalNode K_RENAME()
        {
            return getToken(SQLiteParser.K_RENAME, 0);
        }

        public TerminalNode K_REPLACE()
        {
            return getToken(SQLiteParser.K_REPLACE, 0);
        }

        public TerminalNode K_RESTRICT()
        {
            return getToken(SQLiteParser.K_RESTRICT, 0);
        }

        public TerminalNode K_RIGHT()
        {
            return getToken(SQLiteParser.K_RIGHT, 0);
        }

        public TerminalNode K_ROLLBACK()
        {
            return getToken(SQLiteParser.K_ROLLBACK, 0);
        }

        public TerminalNode K_ROW()
        {
            return getToken(SQLiteParser.K_ROW, 0);
        }

        public TerminalNode K_SAVEPOINT()
        {
            return getToken(SQLiteParser.K_SAVEPOINT, 0);
        }

        public TerminalNode K_SELECT()
        {
            return getToken(SQLiteParser.K_SELECT, 0);
        }

        public TerminalNode K_SET()
        {
            return getToken(SQLiteParser.K_SET, 0);
        }

        public TerminalNode K_TABLE()
        {
            return getToken(SQLiteParser.K_TABLE, 0);
        }

        public TerminalNode K_TEMP()
        {
            return getToken(SQLiteParser.K_TEMP, 0);
        }

        public TerminalNode K_TEMPORARY()
        {
            return getToken(SQLiteParser.K_TEMPORARY, 0);
        }

        public TerminalNode K_THEN()
        {
            return getToken(SQLiteParser.K_THEN, 0);
        }

        public TerminalNode K_TO()
        {
            return getToken(SQLiteParser.K_TO, 0);
        }

        public TerminalNode K_TRANSACTION()
        {
            return getToken(SQLiteParser.K_TRANSACTION, 0);
        }

        public TerminalNode K_TRIGGER()
        {
            return getToken(SQLiteParser.K_TRIGGER, 0);
        }

        public TerminalNode K_UNION()
        {
            return getToken(SQLiteParser.K_UNION, 0);
        }

        public TerminalNode K_UNIQUE()
        {
            return getToken(SQLiteParser.K_UNIQUE, 0);
        }

        public TerminalNode K_UPDATE()
        {
            return getToken(SQLiteParser.K_UPDATE, 0);
        }

        public TerminalNode K_USING()
        {
            return getToken(SQLiteParser.K_USING, 0);
        }

        public TerminalNode K_VACUUM()
        {
            return getToken(SQLiteParser.K_VACUUM, 0);
        }

        public TerminalNode K_VALUES()
        {
            return getToken(SQLiteParser.K_VALUES, 0);
        }

        public TerminalNode K_VIEW()
        {
            return getToken(SQLiteParser.K_VIEW, 0);
        }

        public TerminalNode K_VIRTUAL()
        {
            return getToken(SQLiteParser.K_VIRTUAL, 0);
        }

        public TerminalNode K_WHEN()
        {
            return getToken(SQLiteParser.K_WHEN, 0);
        }

        public TerminalNode K_WHERE()
        {
            return getToken(SQLiteParser.K_WHERE, 0);
        }

        public TerminalNode K_WITH()
        {
            return getToken(SQLiteParser.K_WITH, 0);
        }

        public TerminalNode K_WITHOUT()
        {
            return getToken(SQLiteParser.K_WITHOUT, 0);
        }

        public KeywordContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_keyword;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterKeyword(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitKeyword(this);
            }
        }
    }

    public final KeywordContext keyword() throws RecognitionException
    {
        KeywordContext _localctx = new KeywordContext(_ctx, getState());
        enterRule(_localctx, 154, RULE_keyword);
        int _la;
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1725);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_SET) | (1L << K_ON) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_RENAME - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)))) != 0)))
                {
                    _errHandler.recoverInline(this);
                } else
                {
                    if (_input.LA(1) == Token.EOF)
                    {
                        matchedEOF = true;
                    }
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class NameContext extends ParserRuleContext
    {

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public NameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterName(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitName(this);
            }
        }
    }

    public final NameContext name() throws RecognitionException
    {
        NameContext _localctx = new NameContext(_ctx, getState());
        enterRule(_localctx, 156, RULE_name);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1727);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Function_nameContext extends ParserRuleContext
    {

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Function_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_function_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterFunction_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitFunction_name(this);
            }
        }
    }

    public final Function_nameContext function_name() throws RecognitionException
    {
        Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
        enterRule(_localctx, 158, RULE_function_name);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1729);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Database_nameContext extends ParserRuleContext
    {

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Database_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_database_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterDatabase_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitDatabase_name(this);
            }
        }
    }

    public final Database_nameContext database_name() throws RecognitionException
    {
        Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
        enterRule(_localctx, 160, RULE_database_name);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1731);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Table_nameContext extends ParserRuleContext
    {

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Table_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_table_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterTable_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitTable_name(this);
            }
        }
    }

    public final Table_nameContext table_name() throws RecognitionException
    {
        Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
        enterRule(_localctx, 162, RULE_table_name);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1733);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Table_or_index_nameContext extends ParserRuleContext
    {

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Table_or_index_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_table_or_index_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterTable_or_index_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitTable_or_index_name(this);
            }
        }
    }

    public final Table_or_index_nameContext table_or_index_name() throws RecognitionException
    {
        Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
        enterRule(_localctx, 164, RULE_table_or_index_name);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1735);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class New_table_nameContext extends ParserRuleContext
    {

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public New_table_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_new_table_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterNew_table_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitNew_table_name(this);
            }
        }
    }

    public final New_table_nameContext new_table_name() throws RecognitionException
    {
        New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
        enterRule(_localctx, 166, RULE_new_table_name);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1737);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Column_nameContext extends ParserRuleContext
    {

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Column_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_column_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterColumn_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitColumn_name(this);
            }
        }
    }

    public final Column_nameContext column_name() throws RecognitionException
    {
        Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
        enterRule(_localctx, 168, RULE_column_name);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1739);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Collation_nameContext extends ParserRuleContext
    {

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Collation_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_collation_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterCollation_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitCollation_name(this);
            }
        }
    }

    public final Collation_nameContext collation_name() throws RecognitionException
    {
        Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
        enterRule(_localctx, 170, RULE_collation_name);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1741);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Foreign_tableContext extends ParserRuleContext
    {

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Foreign_tableContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_foreign_table;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterForeign_table(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitForeign_table(this);
            }
        }
    }

    public final Foreign_tableContext foreign_table() throws RecognitionException
    {
        Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
        enterRule(_localctx, 172, RULE_foreign_table);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1743);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Index_nameContext extends ParserRuleContext
    {

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Index_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_index_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterIndex_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitIndex_name(this);
            }
        }
    }

    public final Index_nameContext index_name() throws RecognitionException
    {
        Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
        enterRule(_localctx, 174, RULE_index_name);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1745);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Trigger_nameContext extends ParserRuleContext
    {

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Trigger_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_trigger_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterTrigger_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitTrigger_name(this);
            }
        }
    }

    public final Trigger_nameContext trigger_name() throws RecognitionException
    {
        Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
        enterRule(_localctx, 176, RULE_trigger_name);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1747);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class View_nameContext extends ParserRuleContext
    {

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public View_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_view_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterView_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitView_name(this);
            }
        }
    }

    public final View_nameContext view_name() throws RecognitionException
    {
        View_nameContext _localctx = new View_nameContext(_ctx, getState());
        enterRule(_localctx, 178, RULE_view_name);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1749);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Module_nameContext extends ParserRuleContext
    {

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Module_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_module_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterModule_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitModule_name(this);
            }
        }
    }

    public final Module_nameContext module_name() throws RecognitionException
    {
        Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
        enterRule(_localctx, 180, RULE_module_name);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1751);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Pragma_nameContext extends ParserRuleContext
    {

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Pragma_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_pragma_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterPragma_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitPragma_name(this);
            }
        }
    }

    public final Pragma_nameContext pragma_name() throws RecognitionException
    {
        Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
        enterRule(_localctx, 182, RULE_pragma_name);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1753);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Savepoint_nameContext extends ParserRuleContext
    {

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Savepoint_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_savepoint_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterSavepoint_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitSavepoint_name(this);
            }
        }
    }

    public final Savepoint_nameContext savepoint_name() throws RecognitionException
    {
        Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
        enterRule(_localctx, 184, RULE_savepoint_name);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1755);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Table_aliasContext extends ParserRuleContext
    {

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Table_aliasContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_table_alias;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterTable_alias(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitTable_alias(this);
            }
        }
    }

    public final Table_aliasContext table_alias() throws RecognitionException
    {
        Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
        enterRule(_localctx, 186, RULE_table_alias);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1757);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Transaction_nameContext extends ParserRuleContext
    {

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Transaction_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_transaction_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterTransaction_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitTransaction_name(this);
            }
        }
    }

    public final Transaction_nameContext transaction_name() throws RecognitionException
    {
        Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
        enterRule(_localctx, 188, RULE_transaction_name);
        try
        {
            enterOuterAlt(_localctx, 1);
            {
                setState(1759);
                any_name();
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public static class Any_nameContext extends ParserRuleContext
    {

        public TerminalNode IDENTIFIER()
        {
            return getToken(SQLiteParser.IDENTIFIER, 0);
        }

        public KeywordContext keyword()
        {
            return getRuleContext(KeywordContext.class, 0);
        }

        public TerminalNode STRING_LITERAL()
        {
            return getToken(SQLiteParser.STRING_LITERAL, 0);
        }

        public Any_nameContext any_name()
        {
            return getRuleContext(Any_nameContext.class, 0);
        }

        public Any_nameContext(ParserRuleContext parent, int invokingState)
        {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex()
        {
            return RULE_any_name;
        }

        @Override
        public void enterRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).enterAny_name(this);
            }
        }

        @Override
        public void exitRule(ParseTreeListener listener)
        {
            if (listener instanceof SQLiteListener)
            {
                ((SQLiteListener) listener).exitAny_name(this);
            }
        }
    }

    public final Any_nameContext any_name() throws RecognitionException
    {
        Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
        enterRule(_localctx, 190, RULE_any_name);
        try
        {
            setState(1768);
            _errHandler.sync(this);
            switch (_input.LA(1))
            {
                case IDENTIFIER:
                    enterOuterAlt(_localctx, 1);
                    {
                        setState(1761);
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
                        setState(1762);
                        keyword();
                    }
                    break;
                case STRING_LITERAL:
                    enterOuterAlt(_localctx, 3);
                    {
                        setState(1763);
                        match(STRING_LITERAL);
                    }
                    break;
                case OPEN_PAR:
                    enterOuterAlt(_localctx, 4);
                    {
                        setState(1764);
                        match(OPEN_PAR);
                        setState(1765);
                        any_name();
                        setState(1766);
                        match(CLOSE_PAR);
                    }
                    break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re)
        {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally
        {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex)
    {
        switch (ruleIndex)
        {
            case 51:
                return expr_sempred((ExprContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expr_sempred(ExprContext _localctx, int predIndex)
    {
        switch (predIndex)
        {
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

    public static final String _serializedATN
            = "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a5\u06ed\4\2\t"
            + "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
            + "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
            + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
            + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
            + "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
            + ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"
            + "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="
            + "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"
            + "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"
            + "\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"
            + "`\t`\4a\ta\3\2\3\2\7\2\u00c5\n\2\f\2\16\2\u00c8\13\2\3\2\3\2\3\3\3\3\3"
            + "\3\3\4\7\4\u00d0\n\4\f\4\16\4\u00d3\13\4\3\4\3\4\6\4\u00d7\n\4\r\4\16"
            + "\4\u00d8\3\4\7\4\u00dc\n\4\f\4\16\4\u00df\13\4\3\4\7\4\u00e2\n\4\f\4\16"
            + "\4\u00e5\13\4\3\5\3\5\3\5\5\5\u00ea\n\5\5\5\u00ec\n\5\3\5\3\5\3\5\3\5"
            + "\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"
            + "\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u010a\n\5\3\6\3\6\5\6\u010e\n\6\3\7\3\7"
            + "\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"
            + "\13\3\13\5\13\u0124\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u012c\n\13"
            + "\3\13\5\13\u012f\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0138\n\f\3\r\3"
            + "\r\5\r\u013c\n\r\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u0144\n\16\3\16\3\16\5"
            + "\16\u0148\n\16\5\16\u014a\n\16\3\17\3\17\3\17\5\17\u014f\n\17\5\17\u0151"
            + "\n\17\3\20\3\20\5\20\u0155\n\20\3\20\3\20\3\20\7\20\u015a\n\20\f\20\16"
            + "\20\u015d\13\20\5\20\u015f\n\20\3\20\3\20\3\20\5\20\u0164\n\20\3\20\3"
            + "\20\5\20\u0168\n\20\3\20\6\20\u016b\n\20\r\20\16\20\u016c\3\20\3\20\3"
            + "\20\3\20\3\20\7\20\u0174\n\20\f\20\16\20\u0177\13\20\5\20\u0179\n\20\3"
            + "\20\3\20\3\20\3\20\5\20\u017f\n\20\5\20\u0181\n\20\3\21\3\21\5\21\u0185"
            + "\n\21\3\21\3\21\3\21\3\21\5\21\u018b\n\21\3\21\3\21\3\21\5\21\u0190\n"
            + "\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0199\n\21\f\21\16\21\u019c"
            + "\13\21\3\21\3\21\3\21\5\21\u01a1\n\21\3\22\3\22\5\22\u01a5\n\22\3\22\3"
            + "\22\3\22\3\22\5\22\u01ab\n\22\3\22\3\22\3\22\5\22\u01b0\n\22\3\22\3\22"
            + "\3\22\3\22\3\22\7\22\u01b7\n\22\f\22\16\22\u01ba\13\22\3\22\3\22\7\22"
            + "\u01be\n\22\f\22\16\22\u01c1\13\22\3\22\3\22\3\22\5\22\u01c6\n\22\3\22"
            + "\3\22\5\22\u01ca\n\22\3\22\5\22\u01cd\n\22\3\23\3\23\5\23\u01d1\n\23\3"
            + "\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01da\n\24\3\24\3\24\3\25\3\25"
            + "\3\25\3\25\7\25\u01e2\n\25\f\25\16\25\u01e5\13\25\3\25\3\25\3\26\3\26"
            + "\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u01f4\n\27\f\27\16"
            + "\27\u01f7\13\27\3\30\3\30\3\31\3\31\5\31\u01fd\n\31\3\31\3\31\3\31\3\31"
            + "\5\31\u0203\n\31\3\31\3\31\3\31\5\31\u0208\n\31\3\31\3\31\3\31\3\31\3"
            + "\31\5\31\u020f\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0218\n\31"
            + "\f\31\16\31\u021b\13\31\5\31\u021d\n\31\5\31\u021f\n\31\3\31\3\31\3\31"
            + "\3\31\5\31\u0225\n\31\3\31\3\31\3\31\3\31\5\31\u022b\n\31\3\31\3\31\5"
            + "\31\u022f\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u0236\n\31\3\31\3\31\6\31"
            + "\u023a\n\31\r\31\16\31\u023b\3\31\3\31\3\32\3\32\5\32\u0242\n\32\3\32"
            + "\3\32\3\32\3\32\5\32\u0248\n\32\3\32\3\32\3\32\5\32\u024d\n\32\3\32\3"
            + "\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0259\n\33\3\33\3\33"
            + "\3\33\5\33\u025e\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0267\n"
            + "\33\f\33\16\33\u026a\13\33\3\33\3\33\5\33\u026e\n\33\3\34\5\34\u0271\n"
            + "\34\3\34\3\34\3\34\3\34\3\34\5\34\u0278\n\34\3\35\5\35\u027b\n\35\3\35"
            + "\3\35\3\35\3\35\3\35\5\35\u0282\n\35\3\35\3\35\3\35\3\35\3\35\7\35\u0289"
            + "\n\35\f\35\16\35\u028c\13\35\5\35\u028e\n\35\3\35\3\35\3\35\3\35\5\35"
            + "\u0294\n\35\5\35\u0296\n\35\3\36\3\36\5\36\u029a\n\36\3\36\3\36\3\37\3"
            + "\37\3\37\3\37\5\37\u02a2\n\37\3\37\3\37\3\37\5\37\u02a7\n\37\3\37\3\37"
            + "\3 \3 \3 \3 \5 \u02af\n \3 \3 \3 \5 \u02b4\n \3 \3 \5 \u02b8\n \3!\3!"
            + "\3!\3\"\3\"\3\"\3\"\5\"\u02c1\n\"\3\"\3\"\3\"\5\"\u02c6\n\"\3\"\3\"\3"
            + "#\3#\3#\3#\5#\u02ce\n#\3#\3#\3#\5#\u02d3\n#\3#\3#\3$\3$\5$\u02d9\n$\3"
            + "$\3$\3$\7$\u02de\n$\f$\16$\u02e1\13$\5$\u02e3\n$\3$\3$\3$\3$\7$\u02e9"
            + "\n$\f$\16$\u02ec\13$\3$\3$\3$\3$\3$\7$\u02f3\n$\f$\16$\u02f6\13$\5$\u02f8"
            + "\n$\3$\3$\3$\3$\5$\u02fe\n$\5$\u0300\n$\3%\5%\u0303\n%\3%\3%\3%\3%\3%"
            + "\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0316\n%\3%\3%\3%\3%\5%\u031c"
            + "\n%\3%\3%\3%\3%\3%\7%\u0323\n%\f%\16%\u0326\13%\3%\3%\5%\u032a\n%\3%\3"
            + "%\3%\3%\3%\7%\u0331\n%\f%\16%\u0334\13%\3%\3%\3%\3%\3%\3%\7%\u033c\n%"
            + "\f%\16%\u033f\13%\3%\3%\7%\u0343\n%\f%\16%\u0346\13%\3%\3%\3%\5%\u034b"
            + "\n%\3&\3&\3&\3&\5&\u0351\n&\3&\3&\3&\3&\3&\3&\3&\5&\u035a\n&\3\'\3\'\3"
            + "\'\3\'\3\'\5\'\u0361\n\'\3\'\3\'\5\'\u0365\n\'\5\'\u0367\n\'\3(\3(\5("
            + "\u036b\n(\3(\3(\3)\3)\3)\5)\u0372\n)\5)\u0374\n)\3)\3)\5)\u0378\n)\3)"
            + "\5)\u037b\n)\3*\3*\3*\3+\3+\5+\u0382\n+\3+\3+\3+\7+\u0387\n+\f+\16+\u038a"
            + "\13+\5+\u038c\n+\3+\3+\3+\3+\3+\3+\7+\u0394\n+\f+\16+\u0397\13+\5+\u0399"
            + "\n+\3+\3+\3+\3+\5+\u039f\n+\5+\u03a1\n+\3,\3,\5,\u03a5\n,\3,\3,\3,\7,"
            + "\u03aa\n,\f,\16,\u03ad\13,\5,\u03af\n,\3,\3,\3,\3,\7,\u03b5\n,\f,\16,"
            + "\u03b8\13,\3,\3,\3,\3,\3,\7,\u03bf\n,\f,\16,\u03c2\13,\5,\u03c4\n,\3,"
            + "\3,\3,\3,\5,\u03ca\n,\5,\u03cc\n,\3-\3-\5-\u03d0\n-\3-\3-\3-\7-\u03d5"
            + "\n-\f-\16-\u03d8\13-\3-\3-\3-\3-\7-\u03de\n-\f-\16-\u03e1\13-\3-\5-\u03e4"
            + "\n-\5-\u03e6\n-\3-\3-\5-\u03ea\n-\3-\3-\3-\3-\3-\7-\u03f1\n-\f-\16-\u03f4"
            + "\13-\3-\3-\5-\u03f8\n-\5-\u03fa\n-\3-\3-\3-\3-\3-\7-\u0401\n-\f-\16-\u0404"
            + "\13-\3-\3-\3-\3-\3-\3-\7-\u040c\n-\f-\16-\u040f\13-\3-\3-\7-\u0413\n-"
            + "\f-\16-\u0416\13-\5-\u0418\n-\3.\5.\u041b\n.\3.\3.\3.\3.\3.\3.\3.\3.\3"
            + ".\3.\3.\5.\u0428\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u0434\n.\f.\16.\u0437"
            + "\13.\3.\3.\5.\u043b\n.\3/\5/\u043e\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"
            + "/\5/\u044b\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u0457\n/\f/\16/\u045a\13"
            + "/\3/\3/\5/\u045e\n/\3/\3/\3/\3/\3/\7/\u0465\n/\f/\16/\u0468\13/\5/\u046a"
            + "\n/\3/\3/\3/\3/\5/\u0470\n/\5/\u0472\n/\3\60\3\60\3\61\3\61\3\61\3\62"
            + "\3\62\3\62\3\62\3\62\5\62\u047e\n\62\3\63\3\63\5\63\u0482\n\63\3\63\3"
            + "\63\3\63\5\63\u0487\n\63\3\63\3\63\5\63\u048b\n\63\3\63\5\63\u048e\n\63"
            + "\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"
            + "\3\63\3\63\5\63\u04a0\n\63\3\63\3\63\3\63\5\63\u04a5\n\63\3\64\3\64\3"
            + "\64\5\64\u04aa\n\64\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u04b2\n\65\3\65"
            + "\3\65\3\65\5\65\u04b7\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u04c0"
            + "\n\65\3\65\3\65\3\65\7\65\u04c5\n\65\f\65\16\65\u04c8\13\65\3\65\5\65"
            + "\u04cb\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"
            + "\3\65\3\65\5\65\u04db\n\65\3\65\5\65\u04de\n\65\3\65\3\65\3\65\3\65\3"
            + "\65\3\65\5\65\u04e6\n\65\3\65\3\65\3\65\3\65\3\65\6\65\u04ed\n\65\r\65"
            + "\16\65\u04ee\3\65\3\65\5\65\u04f3\n\65\3\65\3\65\3\65\5\65\u04f8\n\65"
            + "\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"
            + "\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"
            + "\5\65\u0516\n\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65"
            + "\u0522\n\65\3\65\3\65\3\65\5\65\u0527\n\65\3\65\3\65\3\65\3\65\3\65\3"
            + "\65\3\65\3\65\3\65\3\65\5\65\u0533\n\65\3\65\3\65\3\65\3\65\5\65\u0539"
            + "\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u0540\n\65\3\65\3\65\5\65\u0544\n"
            + "\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u054c\n\65\f\65\16\65\u054f\13"
            + "\65\5\65\u0551\n\65\3\65\3\65\3\65\3\65\5\65\u0557\n\65\3\65\5\65\u055a"
            + "\n\65\7\65\u055c\n\65\f\65\16\65\u055f\13\65\3\66\3\66\3\66\3\66\3\66"
            + "\3\66\5\66\u0567\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"
            + "\5\66\u0573\n\66\3\66\3\66\5\66\u0577\n\66\7\66\u0579\n\66\f\66\16\66"
            + "\u057c\13\66\3\66\5\66\u057f\n\66\3\66\3\66\3\66\3\66\3\66\5\66\u0586"
            + "\n\66\5\66\u0588\n\66\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u0590\n\67\3"
            + "\67\3\67\38\38\38\58\u0597\n8\38\58\u059a\n8\39\39\59\u059e\n9\39\39\3"
            + "9\59\u05a3\n9\39\39\39\39\79\u05a9\n9\f9\169\u05ac\139\39\39\39\39\39"
            + "\39\39\39\39\39\39\39\39\39\39\59\u05bd\n9\3:\3:\5:\u05c1\n:\3:\3:\3:"
            + "\3:\3:\3:\3:\3:\3:\3:\3:\3:\7:\u05cf\n:\f:\16:\u05d2\13:\3;\3;\3;\5;\u05d7"
            + "\n;\3;\3;\3;\3;\3;\3;\5;\u05df\n;\3<\3<\3<\5<\u05e4\n<\3<\5<\u05e7\n<"
            + "\3=\3=\3=\5=\u05ec\n=\3>\3>\3>\3>\3>\7>\u05f3\n>\f>\16>\u05f6\13>\3>\3"
            + ">\5>\u05fa\n>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\5?\u0608\n?\3?\5?\u060b"
            + "\n?\5?\u060d\n?\3@\3@\3@\5@\u0612\n@\3@\3@\5@\u0616\n@\3@\5@\u0619\n@"
            + "\3@\3@\3@\3@\3@\5@\u0620\n@\3@\3@\3@\3@\7@\u0626\n@\f@\16@\u0629\13@\3"
            + "@\5@\u062c\n@\3@\3@\5@\u0630\n@\3@\5@\u0633\n@\3@\3@\3@\3@\5@\u0639\n"
            + "@\3@\5@\u063c\n@\5@\u063e\n@\3A\3A\3A\3A\3A\7A\u0645\nA\fA\16A\u0648\13"
            + "A\3B\3B\5B\u064c\nB\3B\3B\5B\u0650\nB\3B\3B\5B\u0654\nB\3B\5B\u0657\n"
            + "B\3C\3C\3C\3C\3C\3C\3C\7C\u0660\nC\fC\16C\u0663\13C\3C\3C\5C\u0667\nC"
            + "\3D\3D\5D\u066b\nD\3D\3D\3D\7D\u0670\nD\fD\16D\u0673\13D\3D\3D\3D\3D\7"
            + "D\u0679\nD\fD\16D\u067c\13D\3D\5D\u067f\nD\5D\u0681\nD\3D\5D\u0684\nD"
            + "\3D\5D\u0687\nD\3E\3E\3E\3E\3E\7E\u068e\nE\fE\16E\u0691\13E\3E\3E\5E\u0695"
            + "\nE\3F\3F\3F\3G\3G\3G\3G\3G\5G\u069f\nG\3H\3H\3H\3H\3H\7H\u06a6\nH\fH"
            + "\16H\u06a9\13H\3H\3H\5H\u06ad\nH\3I\5I\u06b0\nI\3I\3I\3J\3J\3K\3K\3L\3"
            + "L\3M\3M\5M\u06bc\nM\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3"
            + "V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a"
            + "\3a\3a\3a\3a\3a\3a\5a\u06eb\na\3a\2\3hb\2\4\6\b\n\f\16\20\22\24\26\30"
            + "\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"
            + "\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"
            + "\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"
            + "\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\2\26\3\2#$\5\2CCNN[["
            + "\4\2\65\65KK\4\2\7\7ss\3\2\u008b\u008c\4\2\u009e\u009e\u00a0\u00a0\4\2"
            + "\37\37GG\4\2((EE\7\2\33\33QQZZ\u0082\u0082\u0085\u0085\4\2\t\t\16\17\3"
            + "\2\n\13\3\2\20\23\3\2\24\27\6\2VVjjll~~\4\2DD\u0093\u0093\5\2\33\33QQ"
            + "\u0085\u0085\6\2=?qq\u009e\u009e\u00a0\u00a1\4\2\n\foo\4\2\u009d\u009d"
            + "\u00a0\u00a0\b\2\33!##%\6799<\u0088\u008a\u009c\2\u07e7\2\u00c6\3\2\2"
            + "\2\4\u00cb\3\2\2\2\6\u00d1\3\2\2\2\b\u00eb\3\2\2\2\n\u010d\3\2\2\2\f\u010f"
            + "\3\2\2\2\16\u0116\3\2\2\2\20\u011a\3\2\2\2\22\u011c\3\2\2\2\24\u011e\3"
            + "\2\2\2\26\u0130\3\2\2\2\30\u0139\3\2\2\2\32\u0141\3\2\2\2\34\u014b\3\2"
            + "\2\2\36\u015e\3\2\2\2 \u0182\3\2\2\2\"\u01a2\3\2\2\2$\u01d0\3\2\2\2&\u01d2"
            + "\3\2\2\2(\u01dd\3\2\2\2*\u01e8\3\2\2\2,\u01f0\3\2\2\2.\u01f8\3\2\2\2\60"
            + "\u01fa\3\2\2\2\62\u023f\3\2\2\2\64\u0252\3\2\2\2\66\u0270\3\2\2\28\u027a"
            + "\3\2\2\2:\u0297\3\2\2\2<\u029d\3\2\2\2>\u02aa\3\2\2\2@\u02b9\3\2\2\2B"
            + "\u02bc\3\2\2\2D\u02c9\3\2\2\2F\u02e2\3\2\2\2H\u0302\3\2\2\2J\u034c\3\2"
            + "\2\2L\u035b\3\2\2\2N\u0368\3\2\2\2P\u036e\3\2\2\2R\u037c\3\2\2\2T\u038b"
            + "\3\2\2\2V\u03ae\3\2\2\2X\u0417\3\2\2\2Z\u041a\3\2\2\2\\\u043d\3\2\2\2"
            + "^\u0473\3\2\2\2`\u0475\3\2\2\2b\u0478\3\2\2\2d\u0481\3\2\2\2f\u04a9\3"
            + "\2\2\2h\u04f7\3\2\2\2j\u0560\3\2\2\2l\u0589\3\2\2\2n\u0593\3\2\2\2p\u059d"
            + "\3\2\2\2r\u05be\3\2\2\2t\u05d6\3\2\2\2v\u05e0\3\2\2\2x\u05eb\3\2\2\2z"
            + "\u05ed\3\2\2\2|\u060c\3\2\2\2~\u063d\3\2\2\2\u0080\u063f\3\2\2\2\u0082"
            + "\u0656\3\2\2\2\u0084\u0666\3\2\2\2\u0086\u0668\3\2\2\2\u0088\u0688\3\2"
            + "\2\2\u008a\u0696\3\2\2\2\u008c\u069e\3\2\2\2\u008e\u06a0\3\2\2\2\u0090"
            + "\u06af\3\2\2\2\u0092\u06b3\3\2\2\2\u0094\u06b5\3\2\2\2\u0096\u06b7\3\2"
            + "\2\2\u0098\u06bb\3\2\2\2\u009a\u06bd\3\2\2\2\u009c\u06bf\3\2\2\2\u009e"
            + "\u06c1\3\2\2\2\u00a0\u06c3\3\2\2\2\u00a2\u06c5\3\2\2\2\u00a4\u06c7\3\2"
            + "\2\2\u00a6\u06c9\3\2\2\2\u00a8\u06cb\3\2\2\2\u00aa\u06cd\3\2\2\2\u00ac"
            + "\u06cf\3\2\2\2\u00ae\u06d1\3\2\2\2\u00b0\u06d3\3\2\2\2\u00b2\u06d5\3\2"
            + "\2\2\u00b4\u06d7\3\2\2\2\u00b6\u06d9\3\2\2\2\u00b8\u06db\3\2\2\2\u00ba"
            + "\u06dd\3\2\2\2\u00bc\u06df\3\2\2\2\u00be\u06e1\3\2\2\2\u00c0\u06ea\3\2"
            + "\2\2\u00c2\u00c5\5\6\4\2\u00c3\u00c5\5\4\3\2\u00c4\u00c2\3\2\2\2\u00c4"
            + "\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"
            + "\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\2\2\3\u00ca"
            + "\3\3\2\2\2\u00cb\u00cc\7\u00a5\2\2\u00cc\u00cd\b\3\1\2\u00cd\5\3\2\2\2"
            + "\u00ce\u00d0\7\3\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf"
            + "\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4"
            + "\u00dd\5\b\5\2\u00d5\u00d7\7\3\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2"
            + "\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"
            + "\u00dc\5\b\5\2\u00db\u00d6\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"
            + "\2\2\u00dd\u00de\3\2\2\2\u00de\u00e3\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"
            + "\u00e2\7\3\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"
            + "\2\2\u00e3\u00e4\3\2\2\2\u00e4\7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9"
            + "\7P\2\2\u00e7\u00e8\7z\2\2\u00e8\u00ea\7w\2\2\u00e9\u00e7\3\2\2\2\u00e9"
            + "\u00ea\3\2\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00ec\3\2"
            + "\2\2\u00ec\u0109\3\2\2\2\u00ed\u010a\5\26\f\2\u00ee\u010a\5\30\r\2\u00ef"
            + "\u010a\5\32\16\2\u00f0\u010a\5\34\17\2\u00f1\u010a\5 \21\2\u00f2\u010a"
            + "\5\"\22\2\u00f3\u010a\5\60\31\2\u00f4\u010a\5\62\32\2\u00f5\u010a\5\64"
            + "\33\2\u00f6\u010a\5\66\34\2\u00f7\u010a\58\35\2\u00f8\u010a\5:\36\2\u00f9"
            + "\u010a\5<\37\2\u00fa\u010a\5> \2\u00fb\u010a\5B\"\2\u00fc\u010a\5D#\2"
            + "\u00fd\u010a\5F$\2\u00fe\u010a\5H%\2\u00ff\u010a\5J&\2\u0100\u010a\5L"
            + "\'\2\u0101\u010a\5N(\2\u0102\u010a\5P)\2\u0103\u010a\5R*\2\u0104\u010a"
            + "\5Z.\2\u0105\u010a\5\\/\2\u0106\u010a\5^\60\2\u0107\u010a\5\16\b\2\u0108"
            + "\u010a\5\n\6\2\u0109\u00ed\3\2\2\2\u0109\u00ee\3\2\2\2\u0109\u00ef\3\2"
            + "\2\2\u0109\u00f0\3\2\2\2\u0109\u00f1\3\2\2\2\u0109\u00f2\3\2\2\2\u0109"
            + "\u00f3\3\2\2\2\u0109\u00f4\3\2\2\2\u0109\u00f5\3\2\2\2\u0109\u00f6\3\2"
            + "\2\2\u0109\u00f7\3\2\2\2\u0109\u00f8\3\2\2\2\u0109\u00f9\3\2\2\2\u0109"
            + "\u00fa\3\2\2\2\u0109\u00fb\3\2\2\2\u0109\u00fc\3\2\2\2\u0109\u00fd\3\2"
            + "\2\2\u0109\u00fe\3\2\2\2\u0109\u00ff\3\2\2\2\u0109\u0100\3\2\2\2\u0109"
            + "\u0101\3\2\2\2\u0109\u0102\3\2\2\2\u0109\u0103\3\2\2\2\u0109\u0104\3\2"
            + "\2\2\u0109\u0105\3\2\2\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2\2\2\u0109"
            + "\u0108\3\2\2\2\u010a\t\3\2\2\2\u010b\u010e\5\24\13\2\u010c\u010e\5\f\7"
            + "\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\13\3\2\2\2\u010f\u0110"
            + "\7 \2\2\u0110\u0111\7\u0089\2\2\u0111\u0112\7!\2\2\u0112\u0113\5\u00c0"
            + "a\2\u0113\u0114\7\b\2\2\u0114\u0115\5\u00c0a\2\u0115\r\3\2\2\2\u0116\u0117"
            + "\7!\2\2\u0117\u0118\5\20\t\2\u0118\u0119\5\22\n\2\u0119\17\3\2\2\2\u011a"
            + "\u011b\7\"\2\2\u011b\21\3\2\2\2\u011c\u011d\t\2\2\2\u011d\23\3\2\2\2\u011e"
            + "\u011f\7 \2\2\u011f\u0123\7\u008a\2\2\u0120\u0121\5\u00a2R\2\u0121\u0122"
            + "\7\4\2\2\u0122\u0124\3\2\2\2\u0123\u0120\3\2\2\2\u0123\u0124\3\2\2\2\u0124"
            + "\u0125\3\2\2\2\u0125\u012e\5\u00a4S\2\u0126\u0127\7\u0081\2\2\u0127\u0128"
            + "\7\u008e\2\2\u0128\u012f\5\u00a8U\2\u0129\u012b\7\35\2\2\u012a\u012c\7"
            + "\64\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d"
            + "\u012f\5`\61\2\u012e\u0126\3\2\2\2\u012e\u0129\3\2\2\2\u012f\25\3\2\2"
            + "\2\u0130\u0137\7%\2\2\u0131\u0138\5\u00a2R\2\u0132\u0138\5\u00a6T\2\u0133"
            + "\u0134\5\u00a2R\2\u0134\u0135\7\4\2\2\u0135\u0136\5\u00a6T\2\u0136\u0138"
            + "\3\2\2\2\u0137\u0131\3\2\2\2\u0137\u0132\3\2\2\2\u0137\u0133\3\2\2\2\u0137"
            + "\u0138\3\2\2\2\u0138\27\3\2\2\2\u0139\u013b\7)\2\2\u013a\u013c\7@\2\2"
            + "\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e"
            + "\5h\65\2\u013e\u013f\7\'\2\2\u013f\u0140\5\u00a2R\2\u0140\31\3\2\2\2\u0141"
            + "\u0143\7,\2\2\u0142\u0144\t\3\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2"
            + "\2\2\u0144\u0149\3\2\2\2\u0145\u0147\7\u008f\2\2\u0146\u0148\5\u00be`"
            + "\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0145"
            + "\3\2\2\2\u0149\u014a\3\2\2\2\u014a\33\3\2\2\2\u014b\u0150\t\4\2\2\u014c"
            + "\u014e\7\u008f\2\2\u014d\u014f\5\u00be`\2\u014e\u014d\3\2\2\2\u014e\u014f"
            + "\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014c\3\2\2\2\u0150\u0151\3\2\2\2\u0151"
            + "\35\3\2\2\2\u0152\u0154\7\u009b\2\2\u0153\u0155\7|\2\2\u0154\u0153\3\2"
            + "\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u015b\5z>\2\u0157\u0158"
            + "\7\7\2\2\u0158\u015a\5z>\2\u0159\u0157\3\2\2\2\u015a\u015d\3\2\2\2\u015b"
            + "\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2"
            + "\2\2\u015e\u0152\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160"
            + "\u016a\5\u0086D\2\u0161\u0163\7\u0091\2\2\u0162\u0164\7\37\2\2\u0163\u0162"
            + "\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0168\3\2\2\2\u0165\u0168\7c\2\2\u0166"
            + "\u0168\7M\2\2\u0167\u0161\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2"
            + "\2\2\u0168\u0169\3\2\2\2\u0169\u016b\5\u0086D\2\u016a\u0167\3\2\2\2\u016b"
            + "\u016c\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0178\3\2"
            + "\2\2\u016e\u016f\7u\2\2\u016f\u0170\7.\2\2\u0170\u0175\5v<\2\u0171\u0172"
            + "\7\7\2\2\u0172\u0174\5v<\2\u0173\u0171\3\2\2\2\u0174\u0177\3\2\2\2\u0175"
            + "\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2"
            + "\2\2\u0178\u016e\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0180\3\2\2\2\u017a"
            + "\u017b\7k\2\2\u017b\u017e\5h\65\2\u017c\u017d\t\5\2\2\u017d\u017f\5h\65"
            + "\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017a"
            + "\3\2\2\2\u0180\u0181\3\2\2\2\u0181\37\3\2\2\2\u0182\u0184\79\2\2\u0183"
            + "\u0185\7\u0092\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186"
            + "\3\2\2\2\u0186\u018a\7]\2\2\u0187\u0188\7Y\2\2\u0188\u0189\7o\2\2\u0189"
            + "\u018b\7O\2\2\u018a\u0187\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018f\3\2"
            + "\2\2\u018c\u018d\5\u00a2R\2\u018d\u018e\7\4\2\2\u018e\u0190\3\2\2\2\u018f"
            + "\u018c\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\5\u00b0"
            + "Y\2\u0192\u0193\7#\2\2\u0193\u0194\5\u00a4S\2\u0194\u0195\7\5\2\2\u0195"
            + "\u019a\5n8\2\u0196\u0197\7\7\2\2\u0197\u0199\5n8\2\u0198\u0196\3\2\2\2"
            + "\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d"
            + "\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u01a0\7\6\2\2\u019e\u019f\7\u009a\2"
            + "\2\u019f\u01a1\5h\65\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1!"
            + "\3\2\2\2\u01a2\u01a4\79\2\2\u01a3\u01a5\t\6\2\2\u01a4\u01a3\3\2\2\2\u01a4"
            + "\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01aa\7\u008a\2\2\u01a7\u01a8"
            + "\7Y\2\2\u01a8\u01a9\7o\2\2\u01a9\u01ab\7O\2\2\u01aa\u01a7\3\2\2\2\u01aa"
            + "\u01ab\3\2\2\2\u01ab\u01af\3\2\2\2\u01ac\u01ad\5\u00a2R\2\u01ad\u01ae"
            + "\7\4\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ac\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"
            + "\u01b1\3\2\2\2\u01b1\u01c9\5\u00a4S\2\u01b2\u01b3\7\5\2\2\u01b3\u01b8"
            + "\5`\61\2\u01b4\u01b5\7\7\2\2\u01b5\u01b7\5`\61\2\u01b6\u01b4\3\2\2\2\u01b7"
            + "\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bf\3\2"
            + "\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\7\7\2\2\u01bc\u01be\5p9\2\u01bd\u01bb"
            + "\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"
            + "\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c5\7\6\2\2\u01c3\u01c4\7\u009c"
            + "\2\2\u01c4\u01c6\7\u009d\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"
            + "\u01ca\3\2\2\2\u01c7\u01c8\7\'\2\2\u01c8\u01ca\5V,\2\u01c9\u01b2\3\2\2"
            + "\2\u01c9\u01c7\3\2\2\2\u01ca\u01cc\3\2\2\2\u01cb\u01cd\5$\23\2\u01cc\u01cb"
            + "\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd#\3\2\2\2\u01ce\u01d1\5&\24\2\u01cf"
            + "\u01d1\5*\26\2\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1%\3\2\2\2"
            + "\u01d2\u01d3\7:\2\2\u01d3\u01d4\7\5\2\2\u01d4\u01d5\5(\25\2\u01d5\u01d6"
            + "\7\7\2\2\u01d6\u01d9\5(\25\2\u01d7\u01d8\7\7\2\2\u01d8\u01da\5(\25\2\u01d9"
            + "\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\7\6"
            + "\2\2\u01dc\'\3\2\2\2\u01dd\u01de\7\5\2\2\u01de\u01e3\5\u00aaV\2\u01df"
            + "\u01e0\7\7\2\2\u01e0\u01e2\5\u00aaV\2\u01e1\u01df\3\2\2\2\u01e2\u01e5"
            + "\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5"
            + "\u01e3\3\2\2\2\u01e6\u01e7\7\6\2\2\u01e7)\3\2\2\2\u01e8\u01e9\7;\2\2\u01e9"
            + "\u01ea\7\5\2\2\u01ea\u01eb\5\u00aaV\2\u01eb\u01ec\7\5\2\2\u01ec\u01ed"
            + "\5,\27\2\u01ed\u01ee\7\6\2\2\u01ee\u01ef\7\6\2\2\u01ef+\3\2\2\2\u01f0"
            + "\u01f5\5.\30\2\u01f1\u01f2\7\7\2\2\u01f2\u01f4\5.\30\2\u01f3\u01f1\3\2"
            + "\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"
            + "-\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\t\7\2\2\u01f9/\3\2\2\2\u01fa"
            + "\u01fc\79\2\2\u01fb\u01fd\t\6\2\2\u01fc\u01fb\3\2\2\2\u01fc\u01fd\3\2"
            + "\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0202\7\u0090\2\2\u01ff\u0200\7Y\2\2\u0200"
            + "\u0201\7o\2\2\u0201\u0203\7O\2\2\u0202\u01ff\3\2\2\2\u0202\u0203\3\2\2"
            + "\2\u0203\u0207\3\2\2\2\u0204\u0205\5\u00a2R\2\u0205\u0206\7\4\2\2\u0206"
            + "\u0208\3\2\2\2\u0207\u0204\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\3\2"
            + "\2\2\u0209\u020e\5\u00b2Z\2\u020a\u020f\7+\2\2\u020b\u020f\7\36\2\2\u020c"
            + "\u020d\7b\2\2\u020d\u020f\7r\2\2\u020e\u020a\3\2\2\2\u020e\u020b\3\2\2"
            + "\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u021e\3\2\2\2\u0210\u021f"
            + "\7D\2\2\u0211\u021f\7a\2\2\u0212\u021c\7\u0093\2\2\u0213\u0214\7r\2\2"
            + "\u0214\u0219\5\u00aaV\2\u0215\u0216\7\7\2\2\u0216\u0218\5\u00aaV\2\u0217"
            + "\u0215\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2"
            + "\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u0213\3\2\2\2\u021c"
            + "\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u0210\3\2\2\2\u021e\u0211\3\2"
            + "\2\2\u021e\u0212\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0224\7#\2\2\u0221"
            + "\u0222\5\u00a2R\2\u0222\u0223\7\4\2\2\u0223\u0225\3\2\2\2\u0224\u0221"
            + "\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u022a\5\u00a4S"
            + "\2\u0227\u0228\7R\2\2\u0228\u0229\7I\2\2\u0229\u022b\7\u0086\2\2\u022a"
            + "\u0227\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022d\7\u0099"
            + "\2\2\u022d\u022f\5h\65\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"
            + "\u0230\3\2\2\2\u0230\u0239\7,\2\2\u0231\u0236\5Z.\2\u0232\u0236\5H%\2"
            + "\u0233\u0236\5\66\34\2\u0234\u0236\5V,\2\u0235\u0231\3\2\2\2\u0235\u0232"
            + "\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237"
            + "\u0238\7\3\2\2\u0238\u023a\3\2\2\2\u0239\u0235\3\2\2\2\u023a\u023b\3\2"
            + "\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\3\2\2\2\u023d"
            + "\u023e\7K\2\2\u023e\61\3\2\2\2\u023f\u0241\79\2\2\u0240\u0242\t\6\2\2"
            + "\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0247"
            + "\7\u0097\2\2\u0244\u0245\7Y\2\2\u0245\u0246\7o\2\2\u0246\u0248\7O\2\2"
            + "\u0247\u0244\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u024c\3\2\2\2\u0249\u024a"
            + "\5\u00a2R\2\u024a\u024b\7\4\2\2\u024b\u024d\3\2\2\2\u024c\u0249\3\2\2"
            + "\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\5\u00b4[\2\u024f"
            + "\u0250\7\'\2\2\u0250\u0251\5V,\2\u0251\63\3\2\2\2\u0252\u0253\79\2\2\u0253"
            + "\u0254\7\u0098\2\2\u0254\u0258\7\u008a\2\2\u0255\u0256\7Y\2\2\u0256\u0257"
            + "\7o\2\2\u0257\u0259\7O\2\2\u0258\u0255\3\2\2\2\u0258\u0259\3\2\2\2\u0259"
            + "\u025d\3\2\2\2\u025a\u025b\5\u00a2R\2\u025b\u025c\7\4\2\2\u025c\u025e"
            + "\3\2\2\2\u025d\u025a\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f"
            + "\u0260\5\u00a4S\2\u0260\u0261\7\u0094\2\2\u0261\u026d\5\u00b6\\\2\u0262"
            + "\u0263\7\5\2\2\u0263\u0268\5\u0098M\2\u0264\u0265\7\7\2\2\u0265\u0267"
            + "\5\u0098M\2\u0266\u0264\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2"
            + "\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026c"
            + "\7\6\2\2\u026c\u026e\3\2\2\2\u026d\u0262\3\2\2\2\u026d\u026e\3\2\2\2\u026e"
            + "\65\3\2\2\2\u026f\u0271\5r:\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2"
            + "\u0271\u0272\3\2\2\2\u0272\u0273\7D\2\2\u0273\u0274\7T\2\2\u0274\u0277"
            + "\5t;\2\u0275\u0276\7\u009a\2\2\u0276\u0278\5h\65\2\u0277\u0275\3\2\2\2"
            + "\u0277\u0278\3\2\2\2\u0278\67\3\2\2\2\u0279\u027b\5r:\2\u027a\u0279\3"
            + "\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\7D\2\2\u027d"
            + "\u027e\7T\2\2\u027e\u0281\5t;\2\u027f\u0280\7\u009a\2\2\u0280\u0282\5"
            + "h\65\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0295\3\2\2\2\u0283"
            + "\u0284\7u\2\2\u0284\u0285\7.\2\2\u0285\u028a\5v<\2\u0286\u0287\7\7\2\2"
            + "\u0287\u0289\5v<\2\u0288\u0286\3\2\2\2\u0289\u028c\3\2\2\2\u028a\u0288"
            + "\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028d"
            + "\u0283\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\7k"
            + "\2\2\u0290\u0293\5h\65\2\u0291\u0292\t\5\2\2\u0292\u0294\5h\65\2\u0293"
            + "\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0296\3\2\2\2\u0295\u028d\3\2"
            + "\2\2\u0295\u0296\3\2\2\2\u02969\3\2\2\2\u0297\u0299\7F\2\2\u0298\u029a"
            + "\7@\2\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b"
            + "\u029c\5\u00a2R\2\u029c;\3\2\2\2\u029d\u029e\7H\2\2\u029e\u02a1\7]\2\2"
            + "\u029f\u02a0\7Y\2\2\u02a0\u02a2\7O\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2"
            + "\3\2\2\2\u02a2\u02a6\3\2\2\2\u02a3\u02a4\5\u00a2R\2\u02a4\u02a5\7\4\2"
            + "\2\u02a5\u02a7\3\2\2\2\u02a6\u02a3\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8"
            + "\3\2\2\2\u02a8\u02a9\5\u00b0Y\2\u02a9=\3\2\2\2\u02aa\u02ab\7H\2\2\u02ab"
            + "\u02ae\7\u008a\2\2\u02ac\u02ad\7Y\2\2\u02ad\u02af\7O\2\2\u02ae\u02ac\3"
            + "\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b3\3\2\2\2\u02b0\u02b1\5\u00a2R\2"
            + "\u02b1\u02b2\7\4\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02b0\3\2\2\2\u02b3\u02b4"
            + "\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\5\u00a4S\2\u02b6\u02b8\5@!\2"
            + "\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8?\3\2\2\2\u02b9\u02ba\7"
            + "/\2\2\u02ba\u02bb\78\2\2\u02bbA\3\2\2\2\u02bc\u02bd\7H\2\2\u02bd\u02c0"
            + "\7\u0090\2\2\u02be\u02bf\7Y\2\2\u02bf\u02c1\7O\2\2\u02c0\u02be\3\2\2\2"
            + "\u02c0\u02c1\3\2\2\2\u02c1\u02c5\3\2\2\2\u02c2\u02c3\5\u00a2R\2\u02c3"
            + "\u02c4\7\4\2\2\u02c4\u02c6\3\2\2\2\u02c5\u02c2\3\2\2\2\u02c5\u02c6\3\2"
            + "\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\5\u00b2Z\2\u02c8C\3\2\2\2\u02c9\u02ca"
            + "\7H\2\2\u02ca\u02cd\7\u0097\2\2\u02cb\u02cc\7Y\2\2\u02cc\u02ce\7O\2\2"
            + "\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d2\3\2\2\2\u02cf\u02d0"
            + "\5\u00a2R\2\u02d0\u02d1\7\4\2\2\u02d1\u02d3\3\2\2\2\u02d2\u02cf\3\2\2"
            + "\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\5\u00b4[\2\u02d5"
            + "E\3\2\2\2\u02d6\u02d8\7\u009b\2\2\u02d7\u02d9\7|\2\2\u02d8\u02d7\3\2\2"
            + "\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02df\5z>\2\u02db\u02dc"
            + "\7\7\2\2\u02dc\u02de\5z>\2\u02dd\u02db\3\2\2\2\u02de\u02e1\3\2\2\2\u02df"
            + "\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2"
            + "\2\2\u02e2\u02d6\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"
            + "\u02ea\5\u0086D\2\u02e5\u02e6\5\u008cG\2\u02e6\u02e7\5\u0086D\2\u02e7"
            + "\u02e9\3\2\2\2\u02e8\u02e5\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8\3\2"
            + "\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02f7\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed"
            + "\u02ee\7u\2\2\u02ee\u02ef\7.\2\2\u02ef\u02f4\5v<\2\u02f0\u02f1\7\7\2\2"
            + "\u02f1\u02f3\5v<\2\u02f2\u02f0\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2"
            + "\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7"
            + "\u02ed\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02ff\3\2\2\2\u02f9\u02fa\7k"
            + "\2\2\u02fa\u02fd\5h\65\2\u02fb\u02fc\t\5\2\2\u02fc\u02fe\5h\65\2\u02fd"
            + "\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0300\3\2\2\2\u02ff\u02f9\3\2"
            + "\2\2\u02ff\u0300\3\2\2\2\u0300G\3\2\2\2\u0301\u0303\5r:\2\u0302\u0301"
            + "\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0315\3\2\2\2\u0304\u0316\7a\2\2\u0305"
            + "\u0316\7\u0082\2\2\u0306\u0307\7a\2\2\u0307\u0308\7t\2\2\u0308\u0316\7"
            + "\u0082\2\2\u0309\u030a\7a\2\2\u030a\u030b\7t\2\2\u030b\u0316\7\u0085\2"
            + "\2\u030c\u030d\7a\2\2\u030d\u030e\7t\2\2\u030e\u0316\7\33\2\2\u030f\u0310"
            + "\7a\2\2\u0310\u0311\7t\2\2\u0311\u0316\7Q\2\2\u0312\u0313\7a\2\2\u0313"
            + "\u0314\7t\2\2\u0314\u0316\7Z\2\2\u0315\u0304\3\2\2\2\u0315\u0305\3\2\2"
            + "\2\u0315\u0306\3\2\2\2\u0315\u0309\3\2\2\2\u0315\u030c\3\2\2\2\u0315\u030f"
            + "\3\2\2\2\u0315\u0312\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u031b\7d\2\2\u0318"
            + "\u0319\5\u00a2R\2\u0319\u031a\7\4\2\2\u031a\u031c\3\2\2\2\u031b\u0318"
            + "\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u0329\5\u00a4S"
            + "\2\u031e\u031f\7\5\2\2\u031f\u0324\5\u00aaV\2\u0320\u0321\7\7\2\2\u0321"
            + "\u0323\5\u00aaV\2\u0322\u0320\3\2\2\2\u0323\u0326\3\2\2\2\u0324\u0322"
            + "\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0327\3\2\2\2\u0326\u0324\3\2\2\2\u0327"
            + "\u0328\7\6\2\2\u0328\u032a\3\2\2\2\u0329\u031e\3\2\2\2\u0329\u032a\3\2"
            + "\2\2\u032a\u034a\3\2\2\2\u032b\u032c\7\u0096\2\2\u032c\u032d\7\5\2\2\u032d"
            + "\u0332\5h\65\2\u032e\u032f\7\7\2\2\u032f\u0331\5h\65\2\u0330\u032e\3\2"
            + "\2\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333"
            + "\u0335\3\2\2\2\u0334\u0332\3\2\2\2\u0335\u0344\7\6\2\2\u0336\u0337\7\7"
            + "\2\2\u0337\u0338\7\5\2\2\u0338\u033d\5h\65\2\u0339\u033a\7\7\2\2\u033a"
            + "\u033c\5h\65\2\u033b\u0339\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2"
            + "\2\2\u033d\u033e\3\2\2\2\u033e\u0340\3\2\2\2\u033f\u033d\3\2\2\2\u0340"
            + "\u0341\7\6\2\2\u0341\u0343\3\2\2\2\u0342\u0336\3\2\2\2\u0343\u0346\3\2"
            + "\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u034b\3\2\2\2\u0346"
            + "\u0344\3\2\2\2\u0347\u034b\5V,\2\u0348\u0349\7A\2\2\u0349\u034b\7\u0096"
            + "\2\2\u034a\u032b\3\2\2\2\u034a\u0347\3\2\2\2\u034a\u0348\3\2\2\2\u034b"
            + "I\3\2\2\2\u034c\u0350\7x\2\2\u034d\u034e\5\u00a2R\2\u034e\u034f\7\4\2"
            + "\2\u034f\u0351\3\2\2\2\u0350\u034d\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0352"
            + "\3\2\2\2\u0352\u0359\5\u00b8]\2\u0353\u0354\7\b\2\2\u0354\u035a\5x=\2"
            + "\u0355\u0356\7\5\2\2\u0356\u0357\5x=\2\u0357\u0358\7\6\2\2\u0358\u035a"
            + "\3\2\2\2\u0359\u0353\3\2\2\2\u0359\u0355\3\2\2\2\u0359\u035a\3\2\2\2\u035a"
            + "K\3\2\2\2\u035b\u0366\7\177\2\2\u035c\u0367\5\u00acW\2\u035d\u035e\5\u00a2"
            + "R\2\u035e\u035f\7\4\2\2\u035f\u0361\3\2\2\2\u0360\u035d\3\2\2\2\u0360"
            + "\u0361\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0365\5\u00a4S\2\u0363\u0365"
            + "\5\u00b0Y\2\u0364\u0362\3\2\2\2\u0364\u0363\3\2\2\2\u0365\u0367\3\2\2"
            + "\2\u0366\u035c\3\2\2\2\u0366\u0360\3\2\2\2\u0366\u0367\3\2\2\2\u0367M"
            + "\3\2\2\2\u0368\u036a\7\u0080\2\2\u0369\u036b\7\u0087\2\2\u036a\u0369\3"
            + "\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\5\u00ba^\2"
            + "\u036dO\3\2\2\2\u036e\u0373\7\u0085\2\2\u036f\u0371\7\u008f\2\2\u0370"
            + "\u0372\5\u00be`\2\u0371\u0370\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0374"
            + "\3\2\2\2\u0373\u036f\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u037a\3\2\2\2\u0375"
            + "\u0377\7\u008e\2\2\u0376\u0378\7\u0087\2\2\u0377\u0376\3\2\2\2\u0377\u0378"
            + "\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037b\5\u00ba^\2\u037a\u0375\3\2\2"
            + "\2\u037a\u037b\3\2\2\2\u037bQ\3\2\2\2\u037c\u037d\7\u0087\2\2\u037d\u037e"
            + "\5\u00ba^\2\u037eS\3\2\2\2\u037f\u0381\7\u009b\2\2\u0380\u0382\7|\2\2"
            + "\u0381\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0388"
            + "\5z>\2\u0384\u0385\7\7\2\2\u0385\u0387\5z>\2\u0386\u0384\3\2\2\2\u0387"
            + "\u038a\3\2\2\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038c\3\2"
            + "\2\2\u038a\u0388\3\2\2\2\u038b\u037f\3\2\2\2\u038b\u038c\3\2\2\2\u038c"
            + "\u038d\3\2\2\2\u038d\u0398\5\u0086D\2\u038e\u038f\7u\2\2\u038f\u0390\7"
            + ".\2\2\u0390\u0395\5v<\2\u0391\u0392\7\7\2\2\u0392\u0394\5v<\2\u0393\u0391"
            + "\3\2\2\2\u0394\u0397\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2\2\2\u0396"
            + "\u0399\3\2\2\2\u0397\u0395\3\2\2\2\u0398\u038e\3\2\2\2\u0398\u0399\3\2"
            + "\2\2\u0399\u03a0\3\2\2\2\u039a\u039b\7k\2\2\u039b\u039e\5h\65\2\u039c"
            + "\u039d\t\5\2\2\u039d\u039f\5h\65\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2"
            + "\2\2\u039f\u03a1\3\2\2\2\u03a0\u039a\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1"
            + "U\3\2\2\2\u03a2\u03a4\7\u009b\2\2\u03a3\u03a5\7|\2\2\u03a4\u03a3\3\2\2"
            + "\2\u03a4\u03a5\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03ab\5z>\2\u03a7\u03a8"
            + "\7\7\2\2\u03a8\u03aa\5z>\2\u03a9\u03a7\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab"
            + "\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2"
            + "\2\2\u03ae\u03a2\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0"
            + "\u03b6\5X-\2\u03b1\u03b2\5\u008cG\2\u03b2\u03b3\5X-\2\u03b3\u03b5\3\2"
            + "\2\2\u03b4\u03b1\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b6"
            + "\u03b7\3\2\2\2\u03b7\u03c3\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9\u03ba\7u"
            + "\2\2\u03ba\u03bb\7.\2\2\u03bb\u03c0\5v<\2\u03bc\u03bd\7\7\2\2\u03bd\u03bf"
            + "\5v<\2\u03be\u03bc\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0\u03be\3\2\2\2\u03c0"
            + "\u03c1\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c3\u03b9\3\2"
            + "\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03cb\3\2\2\2\u03c5\u03c6\7k\2\2\u03c6"
            + "\u03c9\5h\65\2\u03c7\u03c8\t\5\2\2\u03c8\u03ca\5h\65\2\u03c9\u03c7\3\2"
            + "\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cc\3\2\2\2\u03cb\u03c5\3\2\2\2\u03cb"
            + "\u03cc\3\2\2\2\u03ccW\3\2\2\2\u03cd\u03cf\7\u0088\2\2\u03ce\u03d0\t\b"
            + "\2\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"
            + "\u03d6\5|?\2\u03d2\u03d3\7\7\2\2\u03d3\u03d5\5|?\2\u03d4\u03d2\3\2\2\2"
            + "\u03d5\u03d8\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03e5"
            + "\3\2\2\2\u03d8\u03d6\3\2\2\2\u03d9\u03e3\7T\2\2\u03da\u03df\5~@\2\u03db"
            + "\u03dc\7\7\2\2\u03dc\u03de\5~@\2\u03dd\u03db\3\2\2\2\u03de\u03e1\3\2\2"
            + "\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e4\3\2\2\2\u03e1\u03df"
            + "\3\2\2\2\u03e2\u03e4\5\u0080A\2\u03e3\u03da\3\2\2\2\u03e3\u03e2\3\2\2"
            + "\2\u03e4\u03e6\3\2\2\2\u03e5\u03d9\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e9"
            + "\3\2\2\2\u03e7\u03e8\7\u009a\2\2\u03e8\u03ea\5h\65\2\u03e9\u03e7\3\2\2"
            + "\2\u03e9\u03ea\3\2\2\2\u03ea\u03f9\3\2\2\2\u03eb\u03ec\7W\2\2\u03ec\u03ed"
            + "\7.\2\2\u03ed\u03f2\5h\65\2\u03ee\u03ef\7\7\2\2\u03ef\u03f1\5h\65\2\u03f0"
            + "\u03ee\3\2\2\2\u03f1\u03f4\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2"
            + "\2\2\u03f3\u03f7\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f5\u03f6\7X\2\2\u03f6"
            + "\u03f8\5h\65\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fa\3\2"
            + "\2\2\u03f9\u03eb\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u0418\3\2\2\2\u03fb"
            + "\u03fc\7\u0096\2\2\u03fc\u03fd\7\5\2\2\u03fd\u0402\5h\65\2\u03fe\u03ff"
            + "\7\7\2\2\u03ff\u0401\5h\65\2\u0400\u03fe\3\2\2\2\u0401\u0404\3\2\2\2\u0402"
            + "\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0405\3\2\2\2\u0404\u0402\3\2"
            + "\2\2\u0405\u0414\7\6\2\2\u0406\u0407\7\7\2\2\u0407\u0408\7\5\2\2\u0408"
            + "\u040d\5h\65\2\u0409\u040a\7\7\2\2\u040a\u040c\5h\65\2\u040b\u0409\3\2"
            + "\2\2\u040c\u040f\3\2\2\2\u040d\u040b\3\2\2\2\u040d\u040e\3\2\2\2\u040e"
            + "\u0410\3\2\2\2\u040f\u040d\3\2\2\2\u0410\u0411\7\6\2\2\u0411\u0413\3\2"
            + "\2\2\u0412\u0406\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2\2\2\u0414"
            + "\u0415\3\2\2\2\u0415\u0418\3\2\2\2\u0416\u0414\3\2\2\2\u0417\u03cd\3\2"
            + "\2\2\u0417\u03fb\3\2\2\2\u0418Y\3\2\2\2\u0419\u041b\5r:\2\u041a\u0419"
            + "\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u0427\7\u0093\2"
            + "\2\u041d\u041e\7t\2\2\u041e\u0428\7\u0085\2\2\u041f\u0420\7t\2\2\u0420"
            + "\u0428\7\33\2\2\u0421\u0422\7t\2\2\u0422\u0428\7\u0082\2\2\u0423\u0424"
            + "\7t\2\2\u0424\u0428\7Q\2\2\u0425\u0426\7t\2\2\u0426\u0428\7Z\2\2\u0427"
            + "\u041d\3\2\2\2\u0427\u041f\3\2\2\2\u0427\u0421\3\2\2\2\u0427\u0423\3\2"
            + "\2\2\u0427\u0425\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\3\2\2\2\u0429"
            + "\u042a\5t;\2\u042a\u042b\7!\2\2\u042b\u042c\5\u00aaV\2\u042c\u042d\7\b"
            + "\2\2\u042d\u0435\5h\65\2\u042e\u042f\7\7\2\2\u042f\u0430\5\u00aaV\2\u0430"
            + "\u0431\7\b\2\2\u0431\u0432\5h\65\2\u0432\u0434\3\2\2\2\u0433\u042e\3\2"
            + "\2\2\u0434\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436"
            + "\u043a\3\2\2\2\u0437\u0435\3\2\2\2\u0438\u0439\7\u009a\2\2\u0439\u043b"
            + "\5h\65\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2\2\2\u043b[\3\2\2\2\u043c"
            + "\u043e\5r:\2\u043d\u043c\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f\3\2\2"
            + "\2\u043f\u044a\7\u0093\2\2\u0440\u0441\7t\2\2\u0441\u044b\7\u0085\2\2"
            + "\u0442\u0443\7t\2\2\u0443\u044b\7\33\2\2\u0444\u0445\7t\2\2\u0445\u044b"
            + "\7\u0082\2\2\u0446\u0447\7t\2\2\u0447\u044b\7Q\2\2\u0448\u0449\7t\2\2"
            + "\u0449\u044b\7Z\2\2\u044a\u0440\3\2\2\2\u044a\u0442\3\2\2\2\u044a\u0444"
            + "\3\2\2\2\u044a\u0446\3\2\2\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2\2\2\u044b"
            + "\u044c\3\2\2\2\u044c\u044d\5t;\2\u044d\u044e\7!\2\2\u044e\u044f\5\u00aa"
            + "V\2\u044f\u0450\7\b\2\2\u0450\u0458\5h\65\2\u0451\u0452\7\7\2\2\u0452"
            + "\u0453\5\u00aaV\2\u0453\u0454\7\b\2\2\u0454\u0455\5h\65\2\u0455\u0457"
            + "\3\2\2\2\u0456\u0451\3\2\2\2\u0457\u045a\3\2\2\2\u0458\u0456\3\2\2\2\u0458"
            + "\u0459\3\2\2\2\u0459\u045d\3\2\2\2\u045a\u0458\3\2\2\2\u045b\u045c\7\u009a"
            + "\2\2\u045c\u045e\5h\65\2\u045d\u045b\3\2\2\2\u045d\u045e\3\2\2\2\u045e"
            + "\u0471\3\2\2\2\u045f\u0460\7u\2\2\u0460\u0461\7.\2\2\u0461\u0466\5v<\2"
            + "\u0462\u0463\7\7\2\2\u0463\u0465\5v<\2\u0464\u0462\3\2\2\2\u0465\u0468"
            + "\3\2\2\2\u0466\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u046a\3\2\2\2\u0468"
            + "\u0466\3\2\2\2\u0469\u045f\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046b\3\2"
            + "\2\2\u046b\u046c\7k\2\2\u046c\u046f\5h\65\2\u046d\u046e\t\5\2\2\u046e"
            + "\u0470\5h\65\2\u046f\u046d\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0472\3\2"
            + "\2\2\u0471\u0469\3\2\2\2\u0471\u0472\3\2\2\2\u0472]\3\2\2\2\u0473\u0474"
            + "\7\u0095\2\2\u0474_\3\2\2\2\u0475\u0476\5\u00aaV\2\u0476\u0477\5b\62\2"
            + "\u0477a\3\2\2\2\u0478\u047d\5\u009eP\2\u0479\u047a\7\5\2\2\u047a\u047b"
            + "\5\u0090I\2\u047b\u047c\7\6\2\2\u047c\u047e\3\2\2\2\u047d\u0479\3\2\2"
            + "\2\u047d\u047e\3\2\2\2\u047ec\3\2\2\2\u047f\u0480\7\67\2\2\u0480\u0482"
            + "\5\u009eP\2\u0481\u047f\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u04a4\3\2\2"
            + "\2\u0483\u0484\7y\2\2\u0484\u0486\7h\2\2\u0485\u0487\t\t\2\2\u0486\u0485"
            + "\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u048a\5f\64\2\u0489"
            + "\u048b\7*\2\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u04a5\3\2"
            + "\2\2\u048c\u048e\7o\2\2\u048d\u048c\3\2\2\2\u048d\u048e\3\2\2\2\u048e"
            + "\u048f\3\2\2\2\u048f\u0490\7q\2\2\u0490\u04a5\5f\64\2\u0491\u0492\7\u0092"
            + "\2\2\u0492\u04a5\5f\64\2\u0493\u0494\7\62\2\2\u0494\u0495\7\5\2\2\u0495"
            + "\u0496\5h\65\2\u0496\u0497\7\6\2\2\u0497\u04a5\3\2\2\2\u0498\u049f\7A"
            + "\2\2\u0499\u04a0\5\u0090I\2\u049a\u04a0\5\u0092J\2\u049b\u049c\7\5\2\2"
            + "\u049c\u049d\5h\65\2\u049d\u049e\7\6\2\2\u049e\u04a0\3\2\2\2\u049f\u0499"
            + "\3\2\2\2\u049f\u049a\3\2\2\2\u049f\u049b\3\2\2\2\u04a0\u04a5\3\2\2\2\u04a1"
            + "\u04a2\7\63\2\2\u04a2\u04a5\5\u00acW\2\u04a3\u04a5\5j\66\2\u04a4\u0483"
            + "\3\2\2\2\u04a4\u048d\3\2\2\2\u04a4\u0491\3\2\2\2\u04a4\u0493\3\2\2\2\u04a4"
            + "\u0498\3\2\2\2\u04a4\u04a1\3\2\2\2\u04a4\u04a3\3\2\2\2\u04a5e\3\2\2\2"
            + "\u04a6\u04a7\7#\2\2\u04a7\u04a8\7\66\2\2\u04a8\u04aa\t\n\2\2\u04a9\u04a6"
            + "\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aag\3\2\2\2\u04ab\u04ac\b\65\1\2\u04ac"
            + "\u04f8\5\u0092J\2\u04ad\u04f8\7\u009f\2\2\u04ae\u04af\5\u00a2R\2\u04af"
            + "\u04b0\7\4\2\2\u04b0\u04b2\3\2\2\2\u04b1\u04ae\3\2\2\2\u04b1\u04b2\3\2"
            + "\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\5\u00a4S\2\u04b4\u04b5\7\4\2\2\u04b5"
            + "\u04b7\3\2\2\2\u04b6\u04b1\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\3\2"
            + "\2\2\u04b8\u04f8\5\u00aaV\2\u04b9\u04ba\5\u0094K\2\u04ba\u04bb\5h\65\27"
            + "\u04bb\u04f8\3\2\2\2\u04bc\u04bd\5\u00a0Q\2\u04bd\u04ca\7\5\2\2\u04be"
            + "\u04c0\7G\2\2\u04bf\u04be\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1\3\2"
            + "\2\2\u04c1\u04c6\5h\65\2\u04c2\u04c3\7\7\2\2\u04c3\u04c5\5h\65\2\u04c4"
            + "\u04c2\3\2\2\2\u04c5\u04c8\3\2\2\2\u04c6\u04c4\3\2\2\2\u04c6\u04c7\3\2"
            + "\2\2\u04c7\u04cb\3\2\2\2\u04c8\u04c6\3\2\2\2\u04c9\u04cb\7\t\2\2\u04ca"
            + "\u04bf\3\2\2\2\u04ca\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\3\2"
            + "\2\2\u04cc\u04cd\7\6\2\2\u04cd\u04f8\3\2\2\2\u04ce\u04cf\7\5\2\2\u04cf"
            + "\u04d0\5h\65\2\u04d0\u04d1\7\6\2\2\u04d1\u04f8\3\2\2\2\u04d2\u04d3\7\61"
            + "\2\2\u04d3\u04d4\7\5\2\2\u04d4\u04d5\5h\65\2\u04d5\u04d6\7\'\2\2\u04d6"
            + "\u04d7\5b\62\2\u04d7\u04d8\7\6\2\2\u04d8\u04f8\3\2\2\2\u04d9\u04db\7o"
            + "\2\2\u04da\u04d9\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc"
            + "\u04de\7O\2\2\u04dd\u04da\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\3\2"
            + "\2\2\u04df\u04e0\7\5\2\2\u04e0\u04e1\5V,\2\u04e1\u04e2\7\6\2\2\u04e2\u04f8"
            + "\3\2\2\2\u04e3\u04e5\7\60\2\2\u04e4\u04e6\5h\65\2\u04e5\u04e4\3\2\2\2"
            + "\u04e5\u04e6\3\2\2\2\u04e6\u04ec\3\2\2\2\u04e7\u04e8\7\u0099\2\2\u04e8"
            + "\u04e9\5h\65\2\u04e9\u04ea\7\u008d\2\2\u04ea\u04eb\5h\65\2\u04eb\u04ed"
            + "\3\2\2\2\u04ec\u04e7\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ee"
            + "\u04ef\3\2\2\2\u04ef\u04f2\3\2\2\2\u04f0\u04f1\7J\2\2\u04f1\u04f3\5h\65"
            + "\2\u04f2\u04f0\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f5"
            + "\7K\2\2\u04f5\u04f8\3\2\2\2\u04f6\u04f8\5l\67\2\u04f7\u04ab\3\2\2\2\u04f7"
            + "\u04ad\3\2\2\2\u04f7\u04b6\3\2\2\2\u04f7\u04b9\3\2\2\2\u04f7\u04bc\3\2"
            + "\2\2\u04f7\u04ce\3\2\2\2\u04f7\u04d2\3\2\2\2\u04f7\u04dd\3\2\2\2\u04f7"
            + "\u04e3\3\2\2\2\u04f7\u04f6\3\2\2\2\u04f8\u055d\3\2\2\2\u04f9\u04fa\f\26"
            + "\2\2\u04fa\u04fb\7\r\2\2\u04fb\u055c\5h\65\27\u04fc\u04fd\f\25\2\2\u04fd"
            + "\u04fe\t\13\2\2\u04fe\u055c\5h\65\26\u04ff\u0500\f\24\2\2\u0500\u0501"
            + "\t\f\2\2\u0501\u055c\5h\65\25\u0502\u0503\f\23\2\2\u0503\u0504\t\r\2\2"
            + "\u0504\u055c\5h\65\24\u0505\u0506\f\22\2\2\u0506\u0507\t\16\2\2\u0507"
            + "\u055c\5h\65\23\u0508\u0515\f\21\2\2\u0509\u0516\7\b\2\2\u050a\u0516\7"
            + "\30\2\2\u050b\u0516\7\31\2\2\u050c\u0516\7\32\2\2\u050d\u0516\7e\2\2\u050e"
            + "\u050f\7e\2\2\u050f\u0516\7o\2\2\u0510\u0516\7\\\2\2\u0511\u0516\7j\2"
            + "\2\u0512\u0516\7V\2\2\u0513\u0516\7l\2\2\u0514\u0516\7~\2\2\u0515\u0509"
            + "\3\2\2\2\u0515\u050a\3\2\2\2\u0515\u050b\3\2\2\2\u0515\u050c\3\2\2\2\u0515"
            + "\u050d\3\2\2\2\u0515\u050e\3\2\2\2\u0515\u0510\3\2\2\2\u0515\u0511\3\2"
            + "\2\2\u0515\u0512\3\2\2\2\u0515\u0513\3\2\2\2\u0515\u0514\3\2\2\2\u0516"
            + "\u0517\3\2\2\2\u0517\u055c\5h\65\22\u0518\u0519\f\20\2\2\u0519\u051a\7"
            + "&\2\2\u051a\u055c\5h\65\21\u051b\u051c\f\17\2\2\u051c\u051d\7t\2\2\u051d"
            + "\u055c\5h\65\20\u051e\u051f\f\b\2\2\u051f\u0521\7e\2\2\u0520\u0522\7o"
            + "\2\2\u0521\u0520\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0523\3\2\2\2\u0523"
            + "\u055c\5h\65\t\u0524\u0526\f\7\2\2\u0525\u0527\7o\2\2\u0526\u0525\3\2"
            + "\2\2\u0526\u0527\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u0529\7-\2\2\u0529"
            + "\u052a\5h\65\2\u052a\u052b\7&\2\2\u052b\u052c\5h\65\b\u052c\u055c\3\2"
            + "\2\2\u052d\u052e\f\13\2\2\u052e\u052f\7\63\2\2\u052f\u055c\5\u00acW\2"
            + "\u0530\u0532\f\n\2\2\u0531\u0533\7o\2\2\u0532\u0531\3\2\2\2\u0532\u0533"
            + "\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0535\t\17\2\2\u0535\u0538\5h\65\2"
            + "\u0536\u0537\7L\2\2\u0537\u0539\5h\65\2\u0538\u0536\3\2\2\2\u0538\u0539"
            + "\3\2\2\2\u0539\u055c\3\2\2\2\u053a\u053f\f\t\2\2\u053b\u0540\7f\2\2\u053c"
            + "\u0540\7p\2\2\u053d\u053e\7o\2\2\u053e\u0540\7q\2\2\u053f\u053b\3\2\2"
            + "\2\u053f\u053c\3\2\2\2\u053f\u053d\3\2\2\2\u0540\u055c\3\2\2\2\u0541\u0543"
            + "\f\6\2\2\u0542\u0544\7o\2\2\u0543\u0542\3\2\2\2\u0543\u0544\3\2\2\2\u0544"
            + "\u0545\3\2\2\2\u0545\u0559\7\\\2\2\u0546\u0550\7\5\2\2\u0547\u0551\5V"
            + ",\2\u0548\u054d\5h\65\2\u0549\u054a\7\7\2\2\u054a\u054c\5h\65\2\u054b"
            + "\u0549\3\2\2\2\u054c\u054f\3\2\2\2\u054d\u054b\3\2\2\2\u054d\u054e\3\2"
            + "\2\2\u054e\u0551\3\2\2\2\u054f\u054d\3\2\2\2\u0550\u0547\3\2\2\2\u0550"
            + "\u0548\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u055a\7\6"
            + "\2\2\u0553\u0554\5\u00a2R\2\u0554\u0555\7\4\2\2\u0555\u0557\3\2\2\2\u0556"
            + "\u0553\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u055a\5\u00a4"
            + "S\2\u0559\u0546\3\2\2\2\u0559\u0556\3\2\2\2\u055a\u055c\3\2\2\2\u055b"
            + "\u04f9\3\2\2\2\u055b\u04fc\3\2\2\2\u055b\u04ff\3\2\2\2\u055b\u0502\3\2"
            + "\2\2\u055b\u0505\3\2\2\2\u055b\u0508\3\2\2\2\u055b\u0518\3\2\2\2\u055b"
            + "\u051b\3\2\2\2\u055b\u051e\3\2\2\2\u055b\u0524\3\2\2\2\u055b\u052d\3\2"
            + "\2\2\u055b\u0530\3\2\2\2\u055b\u053a\3\2\2\2\u055b\u0541\3\2\2\2\u055c"
            + "\u055f\3\2\2\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055ei\3\2\2\2"
            + "\u055f\u055d\3\2\2\2\u0560\u0561\7}\2\2\u0561\u0566\5\u00aeX\2\u0562\u0563"
            + "\7\5\2\2\u0563\u0564\5\u00aaV\2\u0564\u0565\7\6\2\2\u0565\u0567\3\2\2"
            + "\2\u0566\u0562\3\2\2\2\u0566\u0567\3\2\2\2\u0567\u057a\3\2\2\2\u0568\u0569"
            + "\7#\2\2\u0569\u0572\t\20\2\2\u056a\u056b\7!\2\2\u056b\u0573\7q\2\2\u056c"
            + "\u056d\7!\2\2\u056d\u0573\7A\2\2\u056e\u0573\7/\2\2\u056f\u0573\7\u0083"
            + "\2\2\u0570\u0571\7n\2\2\u0571\u0573\7\34\2\2\u0572\u056a\3\2\2\2\u0572"
            + "\u056c\3\2\2\2\u0572\u056e\3\2\2\2\u0572\u056f\3\2\2\2\u0572\u0570\3\2"
            + "\2\2\u0573\u0577\3\2\2\2\u0574\u0575\7l\2\2\u0575\u0577\5\u009eP\2\u0576"
            + "\u0568\3\2\2\2\u0576\u0574\3\2\2\2\u0577\u0579\3\2\2\2\u0578\u0576\3\2"
            + "\2\2\u0579\u057c\3\2\2\2\u057a\u0578\3\2\2\2\u057a\u057b\3\2\2\2\u057b"
            + "\u0587\3\2\2\2\u057c\u057a\3\2\2\2\u057d\u057f\7o\2\2\u057e\u057d\3\2"
            + "\2\2\u057e\u057f\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0585\7B\2\2\u0581"
            + "\u0582\7_\2\2\u0582\u0586\7C\2\2\u0583\u0584\7_\2\2\u0584\u0586\7[\2\2"
            + "\u0585\u0581\3\2\2\2\u0585\u0583\3\2\2\2\u0585\u0586\3\2\2\2\u0586\u0588"
            + "\3\2\2\2\u0587\u057e\3\2\2\2\u0587\u0588\3\2\2\2\u0588k\3\2\2\2\u0589"
            + "\u058a\7{\2\2\u058a\u058f\7\5\2\2\u058b\u0590\7Z\2\2\u058c\u058d\t\21"
            + "\2\2\u058d\u058e\7\7\2\2\u058e\u0590\5\u0096L\2\u058f\u058b\3\2\2\2\u058f"
            + "\u058c\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0592\7\6\2\2\u0592m\3\2\2\2"
            + "\u0593\u0596\5\u00aaV\2\u0594\u0595\7\63\2\2\u0595\u0597\5\u00acW\2\u0596"
            + "\u0594\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0599\3\2\2\2\u0598\u059a\t\t"
            + "\2\2\u0599\u0598\3\2\2\2\u0599\u059a\3\2\2\2\u059ao\3\2\2\2\u059b\u059c"
            + "\7\67\2\2\u059c\u059e\5\u009eP\2\u059d\u059b\3\2\2\2\u059d\u059e\3\2\2"
            + "\2\u059e\u05bc\3\2\2\2\u059f\u05a0\7y\2\2\u05a0\u05a3\7h\2\2\u05a1\u05a3"
            + "\7\u0092\2\2\u05a2\u059f\3\2\2\2\u05a2\u05a1\3\2\2\2\u05a3\u05a4\3\2\2"
            + "\2\u05a4\u05a5\7\5\2\2\u05a5\u05aa\5n8\2\u05a6\u05a7\7\7\2\2\u05a7\u05a9"
            + "\5n8\2\u05a8\u05a6\3\2\2\2\u05a9\u05ac\3\2\2\2\u05aa\u05a8\3\2\2\2\u05aa"
            + "\u05ab\3\2\2\2\u05ab\u05ad\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ad\u05ae\7\6"
            + "\2\2\u05ae\u05af\5f\64\2\u05af\u05bd\3\2\2\2\u05b0\u05b1\7\62\2\2\u05b1"
            + "\u05b2\7\5\2\2\u05b2\u05b3\5h\65\2\u05b3\u05b4\7\6\2\2\u05b4\u05bd\3\2"
            + "\2\2\u05b5\u05b6\7S\2\2\u05b6\u05b7\7h\2\2\u05b7\u05b8\7\5\2\2\u05b8\u05b9"
            + "\5\u00aaV\2\u05b9\u05ba\7\6\2\2\u05ba\u05bb\5j\66\2\u05bb\u05bd\3\2\2"
            + "\2\u05bc\u05a2\3\2\2\2\u05bc\u05b0\3\2\2\2\u05bc\u05b5\3\2\2\2\u05bdq"
            + "\3\2\2\2\u05be\u05c0\7\u009b\2\2\u05bf\u05c1\7|\2\2\u05c0\u05bf\3\2\2"
            + "\2\u05c0\u05c1\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\5\u008eH\2\u05c3"
            + "\u05c4\7\'\2\2\u05c4\u05c5\7\5\2\2\u05c5\u05c6\5V,\2\u05c6\u05d0\7\6\2"
            + "\2\u05c7\u05c8\7\7\2\2\u05c8\u05c9\5\u008eH\2\u05c9\u05ca\7\'\2\2\u05ca"
            + "\u05cb\7\5\2\2\u05cb\u05cc\5V,\2\u05cc\u05cd\7\6\2\2\u05cd\u05cf\3\2\2"
            + "\2\u05ce\u05c7\3\2\2\2\u05cf\u05d2\3\2\2\2\u05d0\u05ce\3\2\2\2\u05d0\u05d1"
            + "\3\2\2\2\u05d1s\3\2\2\2\u05d2\u05d0\3\2\2\2\u05d3\u05d4\5\u00a2R\2\u05d4"
            + "\u05d5\7\4\2\2\u05d5\u05d7\3\2\2\2\u05d6\u05d3\3\2\2\2\u05d6\u05d7\3\2"
            + "\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05de\5\u00a4S\2\u05d9\u05da\7^\2\2\u05da"
            + "\u05db\7.\2\2\u05db\u05df\5\u00b0Y\2\u05dc\u05dd\7o\2\2\u05dd\u05df\7"
            + "^\2\2\u05de\u05d9\3\2\2\2\u05de\u05dc\3\2\2\2\u05de\u05df\3\2\2\2\u05df"
            + "u\3\2\2\2\u05e0\u05e3\5h\65\2\u05e1\u05e2\7\63\2\2\u05e2\u05e4\5\u00ac"
            + "W\2\u05e3\u05e1\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e6\3\2\2\2\u05e5"
            + "\u05e7\t\t\2\2\u05e6\u05e5\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7w\3\2\2\2"
            + "\u05e8\u05ec\5\u0090I\2\u05e9\u05ec\5\u009eP\2\u05ea\u05ec\7\u00a0\2\2"
            + "\u05eb\u05e8\3\2\2\2\u05eb\u05e9\3\2\2\2\u05eb\u05ea\3\2\2\2\u05ecy\3"
            + "\2\2\2\u05ed\u05f9\5\u00a4S\2\u05ee\u05ef\7\5\2\2\u05ef\u05f4\5\u00aa"
            + "V\2\u05f0\u05f1\7\7\2\2\u05f1\u05f3\5\u00aaV\2\u05f2\u05f0\3\2\2\2\u05f3"
            + "\u05f6\3\2\2\2\u05f4\u05f2\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u05f7\3\2"
            + "\2\2\u05f6\u05f4\3\2\2\2\u05f7\u05f8\7\6\2\2\u05f8\u05fa\3\2\2\2\u05f9"
            + "\u05ee\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb\u05fc\7\'"
            + "\2\2\u05fc\u05fd\7\5\2\2\u05fd\u05fe\5V,\2\u05fe\u05ff\7\6\2\2\u05ff{"
            + "\3\2\2\2\u0600\u060d\7\t\2\2\u0601\u0602\5\u00a4S\2\u0602\u0603\7\4\2"
            + "\2\u0603\u0604\7\t\2\2\u0604\u060d\3\2\2\2\u0605\u060a\5h\65\2\u0606\u0608"
            + "\7\'\2\2\u0607\u0606\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u0609\3\2\2\2\u0609"
            + "\u060b\5\u009aN\2\u060a\u0607\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060d"
            + "\3\2\2\2\u060c\u0600\3\2\2\2\u060c\u0601\3\2\2\2\u060c\u0605\3\2\2\2\u060d"
            + "}\3\2\2\2\u060e\u060f\5\u00a2R\2\u060f\u0610\7\4\2\2\u0610\u0612\3\2\2"
            + "\2\u0611\u060e\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0618"
            + "\5\u00a4S\2\u0614\u0616\7\'\2\2\u0615\u0614\3\2\2\2\u0615\u0616\3\2\2"
            + "\2\u0616\u0617\3\2\2\2\u0617\u0619\5\u00bc_\2\u0618\u0615\3\2\2\2\u0618"
            + "\u0619\3\2\2\2\u0619\u061f\3\2\2\2\u061a\u061b\7^\2\2\u061b\u061c\7.\2"
            + "\2\u061c\u0620\5\u00b0Y\2\u061d\u061e\7o\2\2\u061e\u0620\7^\2\2\u061f"
            + "\u061a\3\2\2\2\u061f\u061d\3\2\2\2\u061f\u0620\3\2\2\2\u0620\u063e\3\2"
            + "\2\2\u0621\u062b\7\5\2\2\u0622\u0627\5~@\2\u0623\u0624\7\7\2\2\u0624\u0626"
            + "\5~@\2\u0625\u0623\3\2\2\2\u0626\u0629\3\2\2\2\u0627\u0625\3\2\2\2\u0627"
            + "\u0628\3\2\2\2\u0628\u062c\3\2\2\2\u0629\u0627\3\2\2\2\u062a\u062c\5\u0080"
            + "A\2\u062b\u0622\3\2\2\2\u062b\u062a\3\2\2\2\u062c\u062d\3\2\2\2\u062d"
            + "\u0632\7\6\2\2\u062e\u0630\7\'\2\2\u062f\u062e\3\2\2\2\u062f\u0630\3\2"
            + "\2\2\u0630\u0631\3\2\2\2\u0631\u0633\5\u00bc_\2\u0632\u062f\3\2\2\2\u0632"
            + "\u0633\3\2\2\2\u0633\u063e\3\2\2\2\u0634\u0635\7\5\2\2\u0635\u0636\5V"
            + ",\2\u0636\u063b\7\6\2\2\u0637\u0639\7\'\2\2\u0638\u0637\3\2\2\2\u0638"
            + "\u0639\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063c\5\u00bc_\2\u063b\u0638"
            + "\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063e\3\2\2\2\u063d\u0611\3\2\2\2\u063d"
            + "\u0621\3\2\2\2\u063d\u0634\3\2\2\2\u063e\177\3\2\2\2\u063f\u0646\5~@\2"
            + "\u0640\u0641\5\u0082B\2\u0641\u0642\5~@\2\u0642\u0643\5\u0084C\2\u0643"
            + "\u0645\3\2\2\2\u0644\u0640\3\2\2\2\u0645\u0648\3\2\2\2\u0646\u0644\3\2"
            + "\2\2\u0646\u0647\3\2\2\2\u0647\u0081\3\2\2\2\u0648\u0646\3\2\2\2\u0649"
            + "\u0657\7\7\2\2\u064a\u064c\7m\2\2\u064b\u064a\3\2\2\2\u064b\u064c\3\2"
            + "\2\2\u064c\u0653\3\2\2\2\u064d\u064f\7i\2\2\u064e\u0650\7v\2\2\u064f\u064e"
            + "\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0654\3\2\2\2\u0651\u0654\7`\2\2\u0652"
            + "\u0654\7<\2\2\u0653\u064d\3\2\2\2\u0653\u0651\3\2\2\2\u0653\u0652\3\2"
            + "\2\2\u0653\u0654\3\2\2\2\u0654\u0655\3\2\2\2\u0655\u0657\7g\2\2\u0656"
            + "\u0649\3\2\2\2\u0656\u064b\3\2\2\2\u0657\u0083\3\2\2\2\u0658\u0659\7#"
            + "\2\2\u0659\u0667\5h\65\2\u065a\u065b\7\u0094\2\2\u065b\u065c\7\5\2\2\u065c"
            + "\u0661\5\u00aaV\2\u065d\u065e\7\7\2\2\u065e\u0660\5\u00aaV\2\u065f\u065d"
            + "\3\2\2\2\u0660\u0663\3\2\2\2\u0661\u065f\3\2\2\2\u0661\u0662\3\2\2\2\u0662"
            + "\u0664\3\2\2\2\u0663\u0661\3\2\2\2\u0664\u0665\7\6\2\2\u0665\u0667\3\2"
            + "\2\2\u0666\u0658\3\2\2\2\u0666\u065a\3\2\2\2\u0666\u0667\3\2\2\2\u0667"
            + "\u0085\3\2\2\2\u0668\u066a\7\u0088\2\2\u0669\u066b\t\b\2\2\u066a\u0669"
            + "\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u0671\5|?\2\u066d"
            + "\u066e\7\7\2\2\u066e\u0670\5|?\2\u066f\u066d\3\2\2\2\u0670\u0673\3\2\2"
            + "\2\u0671\u066f\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0680\3\2\2\2\u0673\u0671"
            + "\3\2\2\2\u0674\u067e\7T\2\2\u0675\u067a\5~@\2\u0676\u0677\7\7\2\2\u0677"
            + "\u0679\5~@\2\u0678\u0676\3\2\2\2\u0679\u067c\3\2\2\2\u067a\u0678\3\2\2"
            + "\2\u067a\u067b\3\2\2\2\u067b\u067f\3\2\2\2\u067c\u067a\3\2\2\2\u067d\u067f"
            + "\5\u0080A\2\u067e\u0675\3\2\2\2\u067e\u067d\3\2\2\2\u067f\u0681\3\2\2"
            + "\2\u0680\u0674\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u0683\3\2\2\2\u0682\u0684"
            + "\5\u008aF\2\u0683\u0682\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0686\3\2\2"
            + "\2\u0685\u0687\5\u0088E\2\u0686\u0685\3\2\2\2\u0686\u0687\3\2\2\2\u0687"
            + "\u0087\3\2\2\2\u0688\u0689\7W\2\2\u0689\u068a\7.\2\2\u068a\u068f\5h\65"
            + "\2\u068b\u068c\7\7\2\2\u068c\u068e\5h\65\2\u068d\u068b\3\2\2\2\u068e\u0691"
            + "\3\2\2\2\u068f\u068d\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0694\3\2\2\2\u0691"
            + "\u068f\3\2\2\2\u0692\u0693\7X\2\2\u0693\u0695\5h\65\2\u0694\u0692\3\2"
            + "\2\2\u0694\u0695\3\2\2\2\u0695\u0089\3\2\2\2\u0696\u0697\7\u009a\2\2\u0697"
            + "\u0698\5h\65\2\u0698\u008b\3\2\2\2\u0699\u069f\7\u0091\2\2\u069a\u069b"
            + "\7\u0091\2\2\u069b\u069f\7\37\2\2\u069c\u069f\7c\2\2\u069d\u069f\7M\2"
            + "\2\u069e\u0699\3\2\2\2\u069e\u069a\3\2\2\2\u069e\u069c\3\2\2\2\u069e\u069d"
            + "\3\2\2\2\u069f\u008d\3\2\2\2\u06a0\u06ac\5\u00a4S\2\u06a1\u06a2\7\5\2"
            + "\2\u06a2\u06a7\5\u00aaV\2\u06a3\u06a4\7\7\2\2\u06a4\u06a6\5\u00aaV\2\u06a5"
            + "\u06a3\3\2\2\2\u06a6\u06a9\3\2\2\2\u06a7\u06a5\3\2\2\2\u06a7\u06a8\3\2"
            + "\2\2\u06a8\u06aa\3\2\2\2\u06a9\u06a7\3\2\2\2\u06aa\u06ab\7\6\2\2\u06ab"
            + "\u06ad\3\2\2\2\u06ac\u06a1\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u008f\3\2"
            + "\2\2\u06ae\u06b0\t\f\2\2\u06af\u06ae\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0"
            + "\u06b1\3\2\2\2\u06b1\u06b2\7\u009e\2\2\u06b2\u0091\3\2\2\2\u06b3\u06b4"
            + "\t\22\2\2\u06b4\u0093\3\2\2\2\u06b5\u06b6\t\23\2\2\u06b6\u0095\3\2\2\2"
            + "\u06b7\u06b8\7\u00a0\2\2\u06b8\u0097\3\2\2\2\u06b9\u06bc\5h\65\2\u06ba"
            + "\u06bc\5`\61\2\u06bb\u06b9\3\2\2\2\u06bb\u06ba\3\2\2\2\u06bc\u0099\3\2"
            + "\2\2\u06bd\u06be\t\24\2\2\u06be\u009b\3\2\2\2\u06bf\u06c0\t\25\2\2\u06c0"
            + "\u009d\3\2\2\2\u06c1\u06c2\5\u00c0a\2\u06c2\u009f\3\2\2\2\u06c3\u06c4"
            + "\5\u00c0a\2\u06c4\u00a1\3\2\2\2\u06c5\u06c6\5\u00c0a\2\u06c6\u00a3\3\2"
            + "\2\2\u06c7\u06c8\5\u00c0a\2\u06c8\u00a5\3\2\2\2\u06c9\u06ca\5\u00c0a\2"
            + "\u06ca\u00a7\3\2\2\2\u06cb\u06cc\5\u00c0a\2\u06cc\u00a9\3\2\2\2\u06cd"
            + "\u06ce\5\u00c0a\2\u06ce\u00ab\3\2\2\2\u06cf\u06d0\5\u00c0a\2\u06d0\u00ad"
            + "\3\2\2\2\u06d1\u06d2\5\u00c0a\2\u06d2\u00af\3\2\2\2\u06d3\u06d4\5\u00c0"
            + "a\2\u06d4\u00b1\3\2\2\2\u06d5\u06d6\5\u00c0a\2\u06d6\u00b3\3\2\2\2\u06d7"
            + "\u06d8\5\u00c0a\2\u06d8\u00b5\3\2\2\2\u06d9\u06da\5\u00c0a\2\u06da\u00b7"
            + "\3\2\2\2\u06db\u06dc\5\u00c0a\2\u06dc\u00b9\3\2\2\2\u06dd\u06de\5\u00c0"
            + "a\2\u06de\u00bb\3\2\2\2\u06df\u06e0\5\u00c0a\2\u06e0\u00bd\3\2\2\2\u06e1"
            + "\u06e2\5\u00c0a\2\u06e2\u00bf\3\2\2\2\u06e3\u06eb\7\u009d\2\2\u06e4\u06eb"
            + "\5\u009cO\2\u06e5\u06eb\7\u00a0\2\2\u06e6\u06e7\7\5\2\2\u06e7\u06e8\5"
            + "\u00c0a\2\u06e8\u06e9\7\6\2\2\u06e9\u06eb\3\2\2\2\u06ea\u06e3\3\2\2\2"
            + "\u06ea\u06e4\3\2\2\2\u06ea\u06e5\3\2\2\2\u06ea\u06e6\3\2\2\2\u06eb\u00c1"
            + "\3\2\2\2\u00f4\u00c4\u00c6\u00d1\u00d8\u00dd\u00e3\u00e9\u00eb\u0109\u010d"
            + "\u0123\u012b\u012e\u0137\u013b\u0143\u0147\u0149\u014e\u0150\u0154\u015b"
            + "\u015e\u0163\u0167\u016c\u0175\u0178\u017e\u0180\u0184\u018a\u018f\u019a"
            + "\u01a0\u01a4\u01aa\u01af\u01b8\u01bf\u01c5\u01c9\u01cc\u01d0\u01d9\u01e3"
            + "\u01f5\u01fc\u0202\u0207\u020e\u0219\u021c\u021e\u0224\u022a\u022e\u0235"
            + "\u023b\u0241\u0247\u024c\u0258\u025d\u0268\u026d\u0270\u0277\u027a\u0281"
            + "\u028a\u028d\u0293\u0295\u0299\u02a1\u02a6\u02ae\u02b3\u02b7\u02c0\u02c5"
            + "\u02cd\u02d2\u02d8\u02df\u02e2\u02ea\u02f4\u02f7\u02fd\u02ff\u0302\u0315"
            + "\u031b\u0324\u0329\u0332\u033d\u0344\u034a\u0350\u0359\u0360\u0364\u0366"
            + "\u036a\u0371\u0373\u0377\u037a\u0381\u0388\u038b\u0395\u0398\u039e\u03a0"
            + "\u03a4\u03ab\u03ae\u03b6\u03c0\u03c3\u03c9\u03cb\u03cf\u03d6\u03df\u03e3"
            + "\u03e5\u03e9\u03f2\u03f7\u03f9\u0402\u040d\u0414\u0417\u041a\u0427\u0435"
            + "\u043a\u043d\u044a\u0458\u045d\u0466\u0469\u046f\u0471\u047d\u0481\u0486"
            + "\u048a\u048d\u049f\u04a4\u04a9\u04b1\u04b6\u04bf\u04c6\u04ca\u04da\u04dd"
            + "\u04e5\u04ee\u04f2\u04f7\u0515\u0521\u0526\u0532\u0538\u053f\u0543\u054d"
            + "\u0550\u0556\u0559\u055b\u055d\u0566\u0572\u0576\u057a\u057e\u0585\u0587"
            + "\u058f\u0596\u0599\u059d\u05a2\u05aa\u05bc\u05c0\u05d0\u05d6\u05de\u05e3"
            + "\u05e6\u05eb\u05f4\u05f9\u0607\u060a\u060c\u0611\u0615\u0618\u061f\u0627"
            + "\u062b\u062f\u0632\u0638\u063b\u063d\u0646\u064b\u064f\u0653\u0656\u0661"
            + "\u0666\u066a\u0671\u067a\u067e\u0680\u0683\u0686\u068f\u0694\u069e\u06a7"
            + "\u06ac\u06af\u06bb\u06ea";
    public static final ATN _ATN
            = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static
    {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++)
        {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
