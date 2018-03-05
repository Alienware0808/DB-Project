package FederalDB;


public interface FedResultSetInterface {
    
        /**
     * Moves the cursor forward one row from its current position.
     * A <code>ResultSet</code> cursor is initially positioned
     * before the first row; the first call to the method
     * <code>next</code> makes the first row the current row; the
     * second call makes the second row the current row, and so on.
     * <p>
     * When a call to the <code>next</code> method returns <code>false</code>,
     * the cursor is positioned after the last row. Any
     * invocation of a <code>ResultSet</code> method which requires a
     * current row will result in a <code>SQLException</code> being thrown.
     *  If the result set type is <code>TYPE_FORWARD_ONLY</code>, it is vendor specified
     * whether their JDBC driver implementation will return <code>false</code> or
     *  throw an <code>SQLException</code> on a
     * subsequent call to <code>next</code>.
     *
     * <P>If an input stream is open for the current row, a call
     * to the method <code>next</code> will
     * implicitly close it. A <code>ResultSet</code> object's
     * warning chain is cleared when a new row is read.
     *
     * @return <code>true</code> if the new current row is valid;
     * <code>false</code> if there are no more rows
     * @exception FedException if a database access error occurs or this method is
     *            called on a closed result set
     */
    boolean next() throws FedException;

    /**
     * Retrieves the value of the designated column in the current row
     * of this <code>ResultSet</code> object as
     * a <code>String</code> in the Java programming language.
     *
     * @param columnIndex the first column is 1, the second is 2, ...
     * @return the column value; if the value is SQL <code>NULL</code>, the
     * value returned is <code>null</code>
     * @exception FedException if the columnIndex is not valid;
     * if a database access error occurs or this method is
     *            called on a closed result set
     */
    String getString(int columnIndex) throws FedException;

    int getInt(int columnIndex) throws FedException;

    int getColumnCount() throws FedException;

    String getColumnName(int index) throws FedException;

    int getColumnType(int index) throws FedException;

    void close() throws FedException;
}
