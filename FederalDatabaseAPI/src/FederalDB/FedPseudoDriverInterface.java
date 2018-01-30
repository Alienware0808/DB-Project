package FederalDB;


public interface FedPseudoDriverInterface {
    FedConnection getConnection(String username, String password) throws FedException;
}
