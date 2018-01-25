/*
 * Diese Klasse verwaltet die Metadaten welche genutzt
    werden um die horizontale oder vertikale Verteilung 
    auf die Datenbanken zu ermöglichen.
 */
package MetaData;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Franz Weidmann
 */
public class MetaDataManager {
    private MetaDataSet metaDataSet;
    
    public MetaDataManager(String metaDataFilePath){
        String metaFileString;
        try{
            metaFileString = Files.lines(Paths.get(metaDataFilePath), StandardCharsets.UTF_8).toString();
            metaDataSet = new GsonBuilder().create().fromJson(metaFileString, MetaDataSet.class);

        }catch(Exception e){
            System.out.println("There is no metaData File. Empty dataset will be created");
            metaDataSet = new MetaDataSet();
        }

        
        System.out.println("MetaData read: "+metaDataSet.toString());
    }
    
    // Creates a new MetaData entry
    // parameter is string which contains 
    // all relevant values seperated by ".@."
    // indices:
    // 0 -> tablename, 1 -> pKey, 2 -> type, 3 -> attr1
    // 4 -> attr2, 5 -> attr3
    public void newMetaData(String tableName, MetaDataEntry mdE){
        metaDataSet.addEntry(tablename, mdE);
    }
    
    public void deleteMetaData(String tableName){
        metaDataSet.deleteEntry(tableName);
    }
    
    // returns the metaDataEntry which describes the database
    // distribution according to its tablename
    public MetaDataEntry getDistribution(String tableName){
        MetaDataEntry mdE = metaDataSet.getEntry(tableName);
        return mdE;
    }
    
    
    // to save the JavaObject of the metaData onto the file
    public void saveMetaData(String metaDataFilePath) throws Exception {
        String metaDataString = new GsonBuilder().create().toJson(metaDataSet);
        FileWriter fileWriter = new FileWriter(metaDataFilePath);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(metaDataString);
        printWriter.close();
        System.out.println("MetaData successfully saved to "+metaDataFilePath+"!");
    }
}
