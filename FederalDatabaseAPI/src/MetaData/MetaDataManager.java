/*
 * Diese Klasse verwaltet die Metadaten welche genutzt
    werden um die horizontale oder vertikale Verteilung 
    auf die Datenbanken zu ermöglichen.
 */
package MetaData;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Franz Weidmann
 */
public class MetaDataManager {
    private MetaDataSet metaDataSet;
    private String metaDataFilePath; 
    
    public MetaDataManager(String metaDataFilePath){
        this.metaDataFilePath = metaDataFilePath;
        String metaFileString;
        
        try{
            metaFileString = getMetaDataStringFromFile(metaDataFilePath);
            metaDataSet = new GsonBuilder().create().fromJson(metaFileString, MetaDataSet.class);

        }catch(Exception e){
            System.out.println("There is no metaData File. Empty dataset will be created");
            metaDataSet = new MetaDataSet();
        }

        
        System.out.println("MetaData read: "+metaDataSet);
    }
    
    // Adds a new metadataentry to the gson hashmap
    public void newMetaData(String tableName, MetaDataEntry mdE){
        metaDataSet.addEntry(tableName, mdE);
    }
    
    public void deleteMetaData(String tableName){
        metaDataSet.deleteEntry(tableName);
    }
    
    // returns the metaDataEntry which describes the database
    // or null if there is no entry for this tablename
    // distribution according to its tablename
    public MetaDataEntry getMetaData(String tableName){
        return metaDataSet.getEntry(tableName);
    }
    
    
    // to save the JavaObject of the metaData onto the json file
    public void saveMetaData() throws Exception {
        String metaDataString = new GsonBuilder().create().toJson(metaDataSet);
        System.out.println(metaDataString);
        FileWriter fileWriter = new FileWriter(metaDataFilePath);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.close();
        System.out.println("MetaData successfully saved to "+metaDataFilePath+"!");
    }
    
    private String getMetaDataStringFromFile(String path) throws Exception{
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();
        return new String(data, "UTF-8");
    }
}
