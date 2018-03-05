/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultSetManagment;

import FederalDB.FedException;
import FederalDB.FedResultSetInterface;

/**
 *
 * @author Admin
 */
public class FedResultSet implements FedResultSetInterface{
    private FedResultSetInterface rs;

    public FedResultSet(FedResultSetInterface rs) {
        this.rs = rs;
    }

    @Override
    public boolean next() throws FedException {
        return rs.next();
    }

    @Override
    public String getString(int columnIndex) throws FedException {
        return rs.getString(columnIndex);
    }

    @Override
    public int getInt(int columnIndex) throws FedException {
        return rs.getInt(columnIndex);
    }

    @Override
    public int getColumnCount() throws FedException {
        return rs.getColumnCount();
    }

    @Override
    public String getColumnName(int index) throws FedException {
        return rs.getColumnName(index);
    }

    @Override
    public int getColumnType(int index) throws FedException {
        return rs.getColumnType(index);
    }

    @Override
    public void close() throws FedException {
    }
}
