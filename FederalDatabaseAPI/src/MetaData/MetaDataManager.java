/*
 * Diese Klasse verwaltet die Metadaten welche genutzt
    werden um die horizontale oder vertikale Verteilung 
    auf die Datenbanken zu ermöglichen.
 */
package metaData;
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
        }catch(Exception e){
            System.out.println("There is no metaData File. Dummy String is returned.");
            metaFileString = "{'DataSet':{'table1':{'attr1':'age','attr2':'22',attr3:'77'}}'}";
        }
        metaDataSet = new GsonBuilder().create().fromJson(metaFileString, MetaDataSet.class);
    }
    
    /*TODO: define input format*/
    public void newMetaData(String distribution){
        
        // dummy data
        String tableName = "person";
        MetaDataEntry mdE = new MetaDataEntry();
        mdE.Type = 'h';
        mdE.Attr1= "age";
        mdE.Attr2 = "23";
        mdE.Attr3 = "99";
        
        metaDataSet.addEntry(tableName, mdE);
    }
    
    public void deleteMetaData(String tableName){
        metaDataSet.deleteEntry(tableName);
    }
    
    public String[] getDistribution(String tableName){
        MetaDataEntry mdE = metaDataSet.getEntry(tableName);
        String[] distr = new String[]{
            mdE.Type,
            mdE.Attr1,
            mdE.Attr2,
            mdE.Attr3
        };
                
        return distr;
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
