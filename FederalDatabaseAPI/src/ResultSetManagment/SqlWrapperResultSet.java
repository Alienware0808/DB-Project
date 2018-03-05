/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultSetManagment;

import FederalDB.FedException;
import FederalDB.FedResultSetInterface;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class SqlWrapperResultSet implements FedResultSetExtendedInterface
{

    ResultSet resultSet;
    private Integer cachedRowCount = null;

    public SqlWrapperResultSet(ResultSet resultSet)
    {
        this.resultSet = resultSet;
    }

    @Override
    public boolean next() throws FedException
    {
        try
        {
            return resultSet.next();
        } catch (SQLException ex)
        {
            throw new FedException(ex);
        }
    }

    @Override
    public String getString(int columnIndex) throws FedException
    {
        try
        {
            return resultSet.getString(columnIndex);
        } catch (SQLException ex)
        {
            throw new FedException(ex);
        }
    }

    @Override
    public int getInt(int columnIndex) throws FedException
    {
        try
        {
            return resultSet.getInt(columnIndex);
        } catch (SQLException ex)
        {
            throw new FedException(ex);
        }
    }

    @Override
    public int getColumnCount() throws FedException
    {
        try
        {
            int colcount = resultSet.getMetaData().getColumnCount();
            return colcount;
        } catch (SQLException ex)
        {
            throw new FedException(ex);
        }
    }

    @Override
    public String getColumnName(int index) throws FedException
    {
        try
        {
            return resultSet.getMetaData().getColumnName(index);
        } catch (SQLException ex)
        {
            throw new FedException(ex);
        }
    }

    @Override
    public int getColumnType(int index) throws FedException
    {
        try
        {
            return resultSet.getMetaData().getColumnType(index);
        } catch (SQLException ex)
        {
            throw new FedException(ex);
        }
    }

    @Override
    public void close() throws FedException
    {
        try
        {
            resultSet.close();
        } catch (SQLException ex)
        {
            throw new FedException(ex);
        }
    }

    @Override
    public boolean first() throws FedException
    {
        try
        {
            return resultSet.first();
        } catch (SQLException ex)
        {
            throw new FedException(ex);
        }
    }

    @Override
    public int getCursorPosition() throws FedException
    {
        try
        {
            return this.resultSet.getRow();
        } catch (SQLException ex)
        {
            throw new FedException(ex);
        }
    }

    @Override
    public boolean setCursorPosition(int position) throws FedException
    {
        try
        {
            return resultSet.absolute(position);
        } catch (SQLException ex)
        {
            throw new FedException(ex);
        }
    }

    @Override
    public int getRowCount() throws FedException
    {
        if (cachedRowCount == null)
        {
            int position = getCursorPosition();
            try
            {
                resultSet.last();
                cachedRowCount = resultSet.getRow();
            } catch (SQLException ex)
            {
                throw new FedException(ex);
            } finally
            {
                setCursorPosition(position);
            }
        }
        return cachedRowCount;
    }
}
