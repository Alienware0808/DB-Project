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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Franz Weidmann
 */
public class MetaDataManager {
    private MetaDataSet metaDataSet;
    private final Connection conn;
    
    
    public MetaDataManager(Connection conn) throws SQLException
    {
        this.conn=conn;
        String createSql = "CREATE table meta (entry long)"; 
        String insertSql = "Insert into meta values ('')";
        String selectSql = "select * from meta";
        
        try{
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(createSql);
            stmt.executeUpdate(insertSql);
            save();
        }
        catch(Exception e){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(selectSql);
            rs.next();
            String json = rs.getString(0);
            metaDataSet = (MetaDataSet)new GsonBuilder().create().fromJson(json, MetaDataSet.class);
            rs.close();
        }
    }
    
    // Adds a new metadataentry to the gson hashmap
    public void newTableMetaData(String tableName, MetaDataEntry mdE) throws Exception{
        metaDataSet.addEntry(tableName, mdE);
    }
    
    public void deleteTableMetaData(String tableName) throws Exception{
        metaDataSet.deleteEntry(tableName);
    }
    
    // returns the metaDataEntry which describes the database
    // or null if there is no entry for this tablename
    // distribution according to its tablename
    public MetaDataEntry getTableMetaData(String tableName){
        return metaDataSet.getEntry(tableName);
    }
    
    // to save the JavaObject of the metaData onto the json file
    public void save() throws Exception {
        String metaDataString = new GsonBuilder().create().toJson(metaDataSet);
        String sql = "update META set ENTRY = '"+ metaDataString + "'";
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
    }
}
