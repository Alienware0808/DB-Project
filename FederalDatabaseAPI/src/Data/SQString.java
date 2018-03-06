/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import MetaData.ColumnDefinition;
import java.util.List;
import parser.AnalysedStatements.CreateColumnDefinition;
import parser.AnalysedStatements.CreateStatement;

/**
 *
 * @author Admin
 */
final class SQString
{

    public static String columnList(List<ColumnDefinition> columns)
    {
        String sqlString = "";
        for (int i = 0; i < columns.size(); i++)
        {
            sqlString += columns.get(i).name.toLowerCase().trim();
            if (i + 1 < columns.size())
            {
                sqlString += ", ";
            }
        }
        return sqlString;
    }

    public static String columnDefinitionList(List<CreateColumnDefinition> columns)
    {
        String sqlString = "";
        for (int i = 0; i < columns.size(); i++)
        {
            sqlString += columns.get(i).getText();
            if (i + 1 < columns.size())
            {
                sqlString += ", ";
            }
        }
        return sqlString;
    }
}
