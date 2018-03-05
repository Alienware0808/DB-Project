/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.AnalysedStatements;

import MetaData.MetaDataEntry;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.ContextException;
import parser.SQLStatement;
import parser.SQLiteParser;
import parser.Walker;

/**
 *
 * @author Tobias Habermann
 */
public class LazyPreparedStatement extends Statement
{

    public final StatementType Type;
    public String TableName;

    public LazyPreparedStatement(ParseTree tree) throws Exception
    {
        super(tree);
        Type = getStatementType(tree);
        Walker<String> walker = new Walker<String>(tree, new Walker.IEvents<String>()
                {
                    @Override
                    public String nodeFound(ParseTree tree, String workValue) throws ContextException
                    {
                        // Set the Table Name
                        if (tree instanceof SQLiteParser.Table_nameContext)
                        {
                            workValue = tree.getText().toLowerCase().trim();
                        } 
                        return workValue;
                    }

                    @Override
                    public String finalNodeFound(ParseTree tree, String workValue)
                    {
                        return workValue;
                    }

                    @Override
                    public String finalLiteraFound(String text, String workValue)
                    {
                        return workValue;
                    }
                });
                walker.workValue = null;
                walker.run();
                TableName = walker.workValue;
    }

    public static boolean isLazyStatement(ParseTree tree)
    {
        try
        {
            getStatementType(tree);
            return true;
        } catch (ContextException ex)
        {
            return false;
        }
    }

    private static StatementType getStatementType(ParseTree tree) throws ContextException
    {
        if (tree.getChild(0) instanceof SQLiteParser.Alter_session_stmtContext)
        {
            return StatementType.ALTER_SESSION;
        } else if (tree.getChild(0) instanceof SQLiteParser.Set_stmtContext)
        {
            return StatementType.SET_ECHO;
        } else if (tree.getChild(0) instanceof SQLiteParser.Rollback_stmtContext)
        {
            return StatementType.ROLLBACK;
        } else if (IsTerminalNode(tree.getChild(0), SQLiteParser.K_DROP))
        {
            return StatementType.DROP;
        } else if (tree.getChild(0) instanceof SQLiteParser.Commit_stmtContext)
        {
            return StatementType.COMMIT;
        } else
        {
            throw new ContextException("Cannot instanciate LazyParseStatement for this kind of Statement");
        }
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
