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
    private Savepoint[] savepoints;
    private FedConnection conn;

    public FedSavepoint(FedConnection conn) throws SQLException
    {
        this.conn = conn;
        savepoints = new Savepoint[conn.getConn().length];
        for(int i = 0; i < savepoints.length; i++)
        {
            conn.getConn()[i].setAutoCommit(false);
            savepoints[i] = conn.getConn()[i].setSavepoint();
        }
        
    }
    
    public void releaseSavepoint() throws SQLException
    {
        for(int i = 0; i < savepoints.length; i++)
        {
            conn.getConn()[i].releaseSavepoint(savepoints[i]);
            conn.getConn()[i].setAutoCommit(true);
        }
    }
    
    public void rollback() throws SQLException
    {
        for(int i = 0; i < savepoints.length; i++)
        {
            conn.getConn()[i].rollback(savepoints[i]);
            conn.getConn()[i].setAutoCommit(true);
        }
    }
}
