/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.AnalysedStatements;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.ContextException;
import parser.SQLiteParser;
import parser.Walker;

/**
 *
 * @author Tobias Habermann
 */
public class LazyPreparedStatement extends Statement{
    
    public final String sqlString;
    public final StatementType statementType;
    
    public LazyPreparedStatement(ParseTree tree) throws Exception {
        super(tree);
        statementType = getStatementType(tree);
        String sql = "";
        Walker walker = new Walker(tree, new Walker.IEvents() {
            @Override
            public Object nodeFound(ParseTree tree, Object workValue) throws Exception {
                return workValue;
            }

            @Override
            public Object finalNodeFound(ParseTree tree, Object workValue) throws Exception {
                workValue += tree.getText() + " ";
                return workValue;
            }

            @Override
            public Object finalLiteraFound(String text, Object workValue) throws Exception {
                //workValue += tree.getText() + " ";
                return workValue;
            }
        });
        walker.workValue = sql;
        walker.run();
        sqlString = walker.workValue.toString();
    }
    
    public static boolean isLazyStatement(ParseTree tree)
    {
        try {
            getStatementType(tree);
            return true;
        } catch (ContextException ex) {
            return false;
        }
    }
    
    private static StatementType getStatementType(ParseTree tree) throws ContextException
    {
        if(tree.getChild(0) instanceof SQLiteParser.Alter_session_stmtContext)
            return StatementType.ALTER_SESSION;
        else if(tree.getChild(0) instanceof SQLiteParser.Set_stmtContext)
            return StatementType.SET_ECHO;
        else if(tree.getChild(0) instanceof SQLiteParser.Rollback_stmtContext)
            return StatementType.ROLLBACK;
        else if(tree.getChild(0) instanceof SQLiteParser.Drop_table_stmtContext)
            return StatementType.DROP;
        else if(tree.getChild(0) instanceof SQLiteParser.Commit_stmtContext)
            return StatementType.COMMIT;
        else throw new ContextException("Cannot instanciate LazyParseStatement for this kind of Statement");
    }
    
    public enum StatementType
    {
        SET_ECHO,
        ALTER_SESSION,
        ROLLBACK,
        COMMIT,
        DROP,
    }
}
