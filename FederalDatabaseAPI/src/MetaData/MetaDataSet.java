/*
 * Diese Klasse beinhaltet lediglich eine Hashmap
    die alle Metadaten abspeichert beschreibt.
 */
package MetaData;

import java.util.HashMap;

/**
 *
 * @author Franz Weidmann
 */
public class MetaDataSet {
    private HashMap<String, MetaDataEntry> DataSet;
    
    public void addEntry(String tableName, MetaDataEntry mdE){
        DataSet.put(tableName, mdE);
    }
    
    public void deleteEntry(String tableName){
        DataSet.remove(tableName);
    }
    
    public MetaDataEntry getEntry(String tableName){
        return DataSet.get(tableName);
    }
    
    @Override
    public String toString(){
        return DataSet.toString();
    }
}
