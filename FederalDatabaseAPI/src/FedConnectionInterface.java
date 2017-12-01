
public interface FedConnectionInterface {
    void setAutoCommit(boolean autoCommit) throws FedException;

    boolean getAutoCommit() throws FedException;

    void commit() throws FedException;

    void rollback() throws FedException;

    void close() throws FedException;

    FedStatement getStatement();
}
