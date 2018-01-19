/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.IterativeParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.tool.GrammarParserInterpreter;
import parser.AnalysedStatements.LazyPreparedStatement;
import parser.AnalysedStatements.SelectStatement;
import parser.AnalysedStatements.Statement;
import parser.SQLiteParser.ErrorContext;

/**
 *
 * @author Tobias Habermann
 */
public class SQLStatement {
    
    /***
     * Accepts any complete SQL-Statements and creates a Statement-Class instance for each SQL-Statement
     * @param sql
     * Any SQL-Statement
     * @return
     * An Array with Statement-Class instances for each individual SQL-Statement
     * @throws ParseException 
     * If any Errors occour this Exception will be thrown. Including an Error-List with all Problems included
     */
    public static SQLStatement[] parseString(String sql)
            throws ParseException, ContextException, Exception
    {
        CharStream stream = new ANTLRInputStream(sql);
        SQLiteLexer lexer = new SQLiteLexer(stream);
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
        List<String> errors = new ArrayList<String>();
        parser.addErrorListener(new ANTLRErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int i, int i1, String string, RecognitionException re) {
                errors.add("SyntaxError: "+ i + ", " + i1 + ": " + string);
            }

            @Override
            public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean bln, BitSet bitset, ATNConfigSet atncs) {
                //errors.add("Ambiguity: " + i + ", " + i1);
            }

            @Override
            public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs) {
                 //errors.add("AttemptingFullContext: " + i + ", " + i1);
            }

            @Override
            public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs) {
                 //errors.add("ContextSensitivity: " + i + ", " + i1);
            }
        });
        SQLiteParser.ParseContext context = parser.parse();
        
        // Check for any errors 
        if(context.error() != null)
            context.error().forEach((next) -> {
                errors.add(next.toString());
            });
        if(errors.size() > 0)
            throw new ParseException(errors);
        
        // Get the list with all SQL Statements
        ParseTree sql_stmt_list = context.children.get(0); // sql_stmt_list
        List<Statement> statements = new ArrayList<>();
        
        // Analyse each SQL Statement
        for(int i = 0; i < sql_stmt_list.getChildCount(); i++)
        {
            ParseTree maybe_sql_stmt = sql_stmt_list.getChild(i);
            if(maybe_sql_stmt instanceof SQLiteParser.Sql_stmtContext)
            {
                ParseTree sql_stmt = maybe_sql_stmt.getChild(0);
                
                //select
                if(sql_stmt instanceof SQLiteParser.Factored_select_stmtContext)
                {
                    SQLiteParser.Select_coreContext select_stmt = (SQLiteParser.Select_coreContext)sql_stmt.getChild(0);
                    statements.add(new SelectStatement(select_stmt));
                }
                
                //alter session
                //rollback
                //commit
                //drop
                //set echo
                else if(LazyPreparedStatement.isLazyStatement(sql_stmt))
                    statements.add(new LazyPreparedStatement(sql_stmt));

                //create table

                //insert into
                
                //update

           }
        }
        return null;
    }
}
