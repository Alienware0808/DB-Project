/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.AnalysedStatements;

import java.util.HashMap;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;
import parser.SQLiteParser;

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
    
    protected boolean IsTerminalNode(ParseTree node, int terminalNodeId)
    {
        if(node instanceof TerminalNodeImpl)
        {
            return ((TerminalNodeImpl) node).symbol.getType() 
                    == terminalNodeId;
        }
        return false;
    }
}
