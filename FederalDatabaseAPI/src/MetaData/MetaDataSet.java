/*
 This class saves all metaDataEntries in a hashmap
with the tablename as its key
 */
package MetaData;

import java.util.HashMap;

/**
 *
 * @author Franz Weidmann
 */
public class MetaDataSet {
    private HashMap<String, MetaDataEntry> DataSet;
    
    public MetaDataSet(){
        DataSet = new HashMap<String, MetaDataEntry>();
    }

    public void addEntry(String tableName, MetaDataEntry mdE){
        DataSet.put(tableName, mdE);
    }
    
    public void deleteEntry(String tableName){
        MetaDataEntry mdE = DataSet.remove(tableName);
        if(mdE != null){
            System.out.println("TABLE "+tableName+" ENTRY REMOVED");
            System.out.println(mdE.toString());
        }else{ 
            System.out.println("NO ENTRY REMOVED!");
        }      
        
    }
    
    public MetaDataEntry getEntry(String tableName){
        return DataSet.get(tableName);
    }
    
    @Override
    public String toString(){
        return DataSet.toString();
    }
}
