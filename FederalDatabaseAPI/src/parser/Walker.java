/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Tobias Habermann
 * @param <T>
 */
public class Walker<T>
{

    private final ParseTree tree;
    private final IEvents eventHandler;
    public T workValue;

    public Walker(ParseTree tree, IEvents<T> eventHandler)
    {
        this.tree = tree;
        this.eventHandler = eventHandler;
    }

    public void run() throws Exception
    {
        run(tree);
    }

    private void run(ParseTree tree) throws Exception
    {
        for (int i = 0; i < tree.getChildCount(); i++)
        {
            workValue = (T) eventHandler.nodeFound(tree.getChild(i), workValue);
        }
        for (int i = 0; i < tree.getChildCount(); i++)
        {
            run(tree.getChild(i));
        }
        if (tree.getChildCount() == 0)
        {
            workValue = (T) eventHandler.finalNodeFound(tree, workValue);
            workValue = (T) eventHandler.finalLiteraFound(tree.getText(), workValue);
        }
    }

    public interface IEvents<T>
    {

        T nodeFound(ParseTree tree, T workValue)
                throws Exception;

        T finalNodeFound(ParseTree tree, T workValue)
                throws Exception;

        T finalLiteraFound(String text, T workValue)
                throws Exception;
    }
}
