/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FederalDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;

/**
 *
 * @author Admin
 */
public class FedSavepoint
{
    private FedConnection conn;

    public FedSavepoint(FedConnection conn) throws SQLException
    {
        this.conn = conn;
        for(int i = 0; i < conn.getConn().length; i++)
        {
            conn.getConn()[i].setAutoCommit(false);
            conn.getConn()[i].commit();
        }
        
    }
    
    public void releaseSavepoint() throws SQLException
    {
        for(int i = 0; i < conn.getConn().length; i++)
        {
            conn.getConn()[i].commit();
            conn.getConn()[i].setAutoCommit(false);
        }
    }
    
    public void rollback() throws SQLException
    {
        for(int i = 0; i < conn.getConn().length; i++)
        {
            conn.getConn()[i].rollback();
            conn.getConn()[i].setAutoCommit(false);
        }
    }
}
