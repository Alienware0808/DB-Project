/*
 * Diese Klasse verwaltet die Metadaten welche genutzt
    werden um die horizontale oder vertikale Verteilung 
    auf die Datenbanken zu ermöglichen.
 */
package MetaData;

import MetaData.Constrains.Constraint;
import MetaData.Constrains.ForeignKeyConstraint;
import com.google.gson.Gson;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Franz Weidmann
 */
public class MetaDataManager
{

    private MetaDataSet metaDataSet;
    private final Connection conn;

    public MetaDataManager(Connection conn) throws Exception
    {
        this.conn = conn;
        String createSql = "create table meta (entry blob)";
        String insertSql = "Insert into meta values (null)";
        String selectSql = "select * from meta";
        try
        {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(createSql);
            stmt.executeUpdate(insertSql);
            metaDataSet = new MetaDataSet();
            save();
        } catch (Exception e)
        {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(selectSql);
            rs.next();
            byte[] buf = rs.getBytes(1);
            if (buf != null) {
                ObjectInputStream objectIn = new ObjectInputStream(
                    new ByteArrayInputStream(buf));
                metaDataSet = (MetaDataSet) objectIn.readObject();
            }
        }
    }

    public void addTableMetaData(MetaDataEntry metaDataEntry) throws Exception
    {
        metaDataSet.addEntry(metaDataEntry.TableName, metaDataEntry);
        save();
    }

    public void deleteTableMetaData(String tableName) throws Exception
    {
        metaDataSet.deleteEntry(tableName);
        save();
    }

    public MetaDataEntry getTableMetaData(String tableName)
    {
        return metaDataSet.getEntry(tableName);
    }

    public List<ForeignKeyConstraint> getReferencesToTable(String tableName)
    {
        ArrayList<ForeignKeyConstraint> res = new ArrayList<>();
        tableName = tableName.toLowerCase().trim();
        for (MetaDataEntry meta : this.metaDataSet.hashMap.values())
        {
            for (Constraint cnt : meta.constraints)
            {
                if (cnt instanceof ForeignKeyConstraint)
                {
                    ForeignKeyConstraint fc = (ForeignKeyConstraint) cnt;
                    if (fc.getForeignColumn().tableName.equals(tableName))
                    {
                        res.add(fc);
                    }
                }
            }
        }
        return res;
    }

    private void save() throws Exception
    {
        try {
            PreparedStatement pstmt =
                conn.prepareStatement("update META set ENTRY = ?");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oout = new ObjectOutputStream(baos);
            oout.writeObject(metaDataSet);
            oout.close();
            pstmt.setBytes(1, baos.toByteArray());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception i) {
           i.printStackTrace();
        }
    }
}
