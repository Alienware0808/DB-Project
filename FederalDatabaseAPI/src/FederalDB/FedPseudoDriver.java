package FederalDB;

import java.io.IOException;
import java.sql.*;
import oracle.jdbc.driver.*;
import oracle.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


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

    public static void main(String[] args)
    {
        // TODO code application logic here

    }

    @Override
    public FedConnection getConnection(String username, String password)
    {
        Connection[] con = new Connection[3];

        try
        {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

            String query = "Select * from Test";
            //Get a connection do DB
            Class.forName("oracle.jdbc.OracleDriver"); //driver

            con[0] = DriverManager.getConnection("jdbc:oracle:thin:@mtsthelens.informatik.hs-fulda.de:1521:ORALV9A", username, password);
            con[1] = DriverManager.getConnection("jdbc:oracle:thin:@krakatau.informatik.hs-fulda.de:1521:ORALV10A", username, password);
            con[2] = DriverManager.getConnection("jdbc:oracle:thin:@pinatubo.informatik.hs-fulda.de:1521:ORALV8A", username, password);

        } catch (Exception exc)
        {
            exc.printStackTrace();
        }
        FedConnection cone;
        try
        {
            cone = new FedConnection(con);
            return cone;
        } catch (SQLException ex)
        {
            Logger.getLogger(FedPseudoDriver.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(FedPseudoDriver.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
