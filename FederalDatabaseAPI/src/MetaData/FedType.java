/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetaData;

/**
 *
 * @author Admin
 */
public class FedType {
    public int DatabaseCount;
    
    public FedType()
    {
        DatabaseCount = 1;
    }
    
    public FedType(int databaseCount)
    {
        setDatabaseCount(databaseCount);
    }

    public void setDatabaseCount(int DatabaseCount) {
        this.DatabaseCount = DatabaseCount;
    }
}
