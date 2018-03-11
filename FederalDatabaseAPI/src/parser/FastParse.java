/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import FederalDB.FedConnection;
import FederalDB.FedException;
import parser.AnalysedStatements.InsertStatement;
import parser.AnalysedStatements.Statement;

/**
 *
 * @author Admin
 */
public final class FastParse
{
    public static Statement fastParse(String sql, FedConnection fedcon) throws FedException
    {
        try
        {
            if(sql.toLowerCase().trim().startsWith("insert"))
            {
                return new InsertStatement(sql, fedcon);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static Object parseValue(String valuestr)
    {
        valuestr = valuestr.trim();
        if(valuestr.startsWith("'"))
            return valuestr.substring(1, valuestr.length()-1);
        if(valuestr.toLowerCase().equals("null"))
            return null;
        return Integer.parseInt(valuestr);
    }
}
