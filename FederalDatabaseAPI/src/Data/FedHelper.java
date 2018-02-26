/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import FederalDB.FedConnection;
import FederalDB.FedStatement;
import MetaData.ColumnDefinition;
import MetaData.MetaDataEntry;
import java.util.List;

/**
 *
 * @author Admin
 */
public final class FedHelper {
    
    
    public static FedStatement select(FedConnection connection, List<ColumnDefinition> columns, 
            String table)
    {
        MetaData.MetaDataManager metaData = null;
        MetaDataEntry entry = metaData.getTableMetaData(table);
        // TODO Do the meta thingi ...
        if(/*horizontal*/true)
        {
            
        }
        return null;
    }
}
