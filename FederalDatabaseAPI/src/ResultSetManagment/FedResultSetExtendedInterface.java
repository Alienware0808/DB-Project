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
public interface FedResultSetExtendedInterface extends FedResultSetInterface
{

    /**
     * Moves the cursor to the first row in this <code>ResultSet</code> object.
     *
     * @return <code>true</code> if the cursor is on a valid row;
     * <code>false</code> if there are no rows in the result set
     * @exception SQLException if a database access error occurs; this method is
     * called on a closed result set or the result set type is
     * <code>TYPE_FORWARD_ONLY</code>
     * @exception SQLFeatureNotSupportedException if the JDBC driver does not
     * support this method
     * @since 1.2
     */
    boolean first() throws FedException;

    int getCursorPosition() throws FedException;

    boolean setCursorPosition(int position) throws FedException;

    int getRowCount() throws FedException;
    
    Integer getInteger(int columnIndex) throws FedException;
}
