/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser.AnalysedStatements;

import FederalDB.FedConnection;
import MetaData.MetaDataEntry;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.SQLiteParser;

/**
 *
 * @author Admin
 */
public class InsertStatement extends Statement{
    public final MetaDataEntry tableDescription;
    public List<Object> values;
    public FedConnection fedConnection;
 
    public InsertStatement(ParseTree tree, FedConnection fedConnection) {
        super(tree);
        values = new ArrayList<>();
        this.fedConnection = fedConnection;
        tableDescription = fedConnection.metaDataManger.getMetaData(tree.getChild(2).getText());
        for(int i = 4; i < tree.getChildCount(); i++)
        {
            if(tree.getChild(i).getChild(0) instanceof SQLiteParser.Literal_valueContext)
            {
                String valstr = tree.getChild(i).getText();
                if(valstr.startsWith("'"))
                {
                    valstr = valstr.substring(1);
                    valstr = valstr.substring(0,valstr.length()-2);
                    values.add(valstr);
                } else values.add(Integer.parseInt(valstr));
            }
        }
    }
}
