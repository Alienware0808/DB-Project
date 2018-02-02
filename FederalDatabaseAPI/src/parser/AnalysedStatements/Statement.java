/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.AnalysedStatements;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import parser.SQLiteParser;
import parser.Walker;

/**
 *
 * @author Tobias Habermann
 */
public abstract class Statement  {
    protected final ParseTree tree;
    
    public Statement(ParseTree tree)
    {
        this.tree = tree;
    }

    public ParseTree getTree() {
        return tree;
    }
    
    protected static boolean IsTerminalNode(ParseTree node, int terminalNodeId)
    {
        if(node instanceof TerminalNodeImpl)
        {
            return ((TerminalNodeImpl) node).symbol.getType() 
                    == terminalNodeId;
        }
        return false;
    }
    
    public String getText()
    {
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
        try {
            walker.run();
        } catch (Exception ex) {
            Logger.getLogger(Statement.class.getName()).log(Level.SEVERE, null, ex);
        }
        return walker.workValue.toString();
    }
}
