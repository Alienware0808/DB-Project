import java.sql.*;
import oracle.jdbc.driver.*;
import oracle.sql.*;
import java.util.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alienware Enes
 */
public class FedPseudoDriver implements FedPseudoDriverInterface
{
    public FedPseudoDriver()
    {
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
       
    }
    
    public FedConnection getConnection(String username, String password) 
    {
        Connection[] con = new Connection [2];
       
         try{
            DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
          
            String query="Select * from Test";
            //Get a connection do DB
            Class.forName("oracle.jdbc.OracleDriver"); //driver
 
            con [0]= DriverManager.getConnection("jdbc:oracle:thin:@mtsthelens.informatik.hs-fulda.de:1521:oralv9a","username","password");
            con [1]= DriverManager.getConnection("jdbc:oracle:thin:@krakatau.informatik.hs-fulda.de:1521:ORALV10A","username","password");
            con [2]= DriverManager.getConnection("jdbc:oracle:thin:@pinatubo.informatik.hs-fulda.de:1521:ORALV8A","username","password");
            
            Statement st = con[0].createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            
            
            /*con[0].close();
            con[1].close();
            con[2].close();*/ 
            
        }catch (Exception exc)
        {
            exc.printStackTrace();
        }
         
        FedConnection cone= new FedConnection(con);            
        return cone;
    }
}
