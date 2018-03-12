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

    @Override
    public FedConnection getConnection(String username, String password)
    {
        String[] con = new String[3];

        try
        {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            //Get a connection do DB
            Class.forName("oracle.jdbc.OracleDriver"); //driver
           
            con[0] = "jdbc:oracle:thin:@mtsthelens.informatik.hs-fulda.de:1521:ORALV9A";
            con[1] = "jdbc:oracle:thin:@krakatau.informatik.hs-fulda.de:1521:ORALV10A";
            con[2] = "jdbc:oracle:thin:@pinatubo.informatik.hs-fulda.de:1521:ORALV8A";

        } catch (Exception exc)
        {
            exc.printStackTrace();
        }
        FedConnection cone;
        try
        {
            cone = new FedConnection(con, username, password);
            return cone;
        } catch (Exception ex)
        {
            Logger.getLogger(FedPseudoDriver.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
