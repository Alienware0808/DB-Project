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
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Franz Weidmann
 */
public class MetaDataManager {
    private MetaDataSet metaDataSet;
    private final Connection conn;
    
    
    public MetaDataManager(Connection conn){
        this.conn=conn;
        String sql = "CREATE table meta (entry long)"; 
        String sqlI = "Insert into meta values ('')";
        
        try{
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            stmt.executeUpdate(sqlI);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
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
        String sql = "update META set ENTRY= "+ metaDataString;
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
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
