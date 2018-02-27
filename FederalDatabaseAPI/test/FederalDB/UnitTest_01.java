/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FederalDB;

import java.sql.SQLSyntaxErrorException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author svwer
 */
public class UnitTest_01
{
    final String usernameTest = "VDBSA09";
    final String passwordTest = "VDBSA09";

    final String usernameValidation = "VDBSA09";
    final String passwordValidation = "VDBSA09";
    
    private FedConnection fedConnection = (new FedPseudoDriver()).getConnection(usernameValidation, passwordValidation);;
    private FedConnection connect;
    
    
    //Falsche Benutzername
    @Test
    public void ConnectionTest_02() {
        connect = (new FedPseudoDriver()).getConnection("VDBSA08", passwordValidation);
        assertNull(connect);
    }
    //Richtige Connection aufbauen
    @Test
    public void ConnectionTest() {
        connect = (new FedPseudoDriver()).getConnection(usernameValidation, passwordValidation);
        assertNotNull(connect);
    }
    //Test für getStatement
    @Test
    public void ConnectionTest_03() {
        assertNotNull(fedConnection.getStatement());
    }
    
    public UnitTest_01()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }
    //Erzeuge Tabelle für DropTest
    @Test
    public void test_drop_01(){
        boolean thrown = true;
        String sql = "create table Eins (\n" +
            "id integer,\n" +
            "name varchar(40),\n" +
            "eule varchar(40),\n" +
            "constraint FLUGHAFEN_PS\n" +
            "		primary key (id))\n";
         try{
            final FedStatement statement = fedConnection.getStatement();
            statement.executeUpdate(sql);
            thrown = false;
        } catch(Exception e) {}
        System.out.println("FederalDB.UnitTest_01.drop_01()   " + thrown);
         assertTrue(thrown);
    }
    //Drop Tabelle
    @Test
    public void test_drop_02(){
        boolean thrown = true;
        String sql = "drop table Eins cascade constraints";
         try{
            final FedStatement statement = fedConnection.getStatement();
            statement.executeUpdate(sql);
            thrown = false;
        } catch(Exception e) {}
        System.out.println("FederalDB.UnitTest_01.drop_02()   " + thrown);
         assertTrue(thrown);
    }
    //Erneut Drop tabelle
    @Test
    public void test_drop_03(){
        boolean thrown = true;
        String sql = "drop table Eins cascade constraints";
         try{
            final FedStatement statement = fedConnection.getStatement();
            statement.executeUpdate(sql);
            thrown = false;
        } catch(Exception e) {}
        System.out.println("FederalDB.UnitTest_01.drop_03()   " + thrown);
         assertTrue(thrown);
    }
    //Eine einfache Tabelle
    @Test
    public void test_create() {
        boolean thrown = true;
        String sql = "Create Table TEST ("+
            "id integer,\n" +
            "name varchar(40),\n" +
            "constraint Test_PK\n" +
            "	primary key (id)))";
        try {
            final FedStatement statement = fedConnection.getStatement();
            statement.executeUpdate(sql);
            thrown = false;
        } catch(Exception e) {}
        assertTrue(thrown);
    }
    
    //Tabelle Vertical
    @Test
    public void test_create_01(){
        boolean thrown = true;
        String sql = "create table myVert01 (\n" +
            "id integer,\n" +
            "name varchar(40),\n" +
            "eule varchar(40),\n" +
            "jemy varchar(30),\n" +
            "myint integer,\n" +
            "kume integer,\n" +
            "constraint FLUGHAFEN_PS\n" +
            "		primary key (id))\n" +
            "VERTICAL ((name,eule),(jemy,myint),(kume))";
         try{
            final FedStatement statement = fedConnection.getStatement();
            statement.executeUpdate(sql);
            thrown = false;
        } catch(Exception e) {}
        System.out.println("FederalDB.UnitTest_01.test_01()   " + thrown);
         assertTrue(thrown);
    }
    //Zwei gleiche Spalten
    @Test
    public void test_create_02(){
        boolean thrown = true;
        String sql = "create table myVert02 (\n" +
            "id integer,\n" +
            "name varchar(40),\n" +
            "name varchar(40),\n" +
            "jemy varchar(30),\n" +
            "myint integer,\n" +
            "kume integer,\n" +
            "constraint FLUGHAFEN_PS\n" +
            "		primary key (id))\n" +
            "VERTICAL ((name,eule),(jemy,myint),(kume))";
         try{
            final FedStatement statement = fedConnection.getStatement();
            statement.executeUpdate(sql);
            thrown = false;
        } catch(Exception e) {}
        System.out.println("FederalDB.UnitTest_01.test_02()   " + thrown);
         assertTrue(thrown);
    }
    //Ohne PrimaryKey
    @Test
    public void test_create_03(){
        boolean thrown = true;
        String sql = "create table myVert03 (\n" +
            "id integer,\n" +
            "name varchar(40),\n" +
            "eule varchar(40),\n" +
            "jemy varchar(30),\n" +
            "myint integer,\n" +
            "kume integer,\n" +
            "VERTICAL ((name,eule),(jemy,myint),(kume))";
         try{
            final FedStatement statement = fedConnection.getStatement();
            statement.executeUpdate(sql);
            thrown = false;
        } catch(Exception e) {}
        System.out.println("FederalDB.UnitTest_01.test_03()   " + thrown);
         assertTrue(thrown);
    }
    //Fehlendes Komma
    @Test
    public void test_create_04(){
        boolean thrown = true;
        String sql = "create table myVert04 (\n" +
            "id integer\n" +
            "name varchar(40),\n" +
            "eule varchar(40),\n" +
            "jemy varchar(30),\n" +
            "myint integer,\n" +
            "kume integer,\n" +
            "constraint FLUGHAFEN_PS\n" +
            "		primary key (id))\n" +
            "VERTICAL ((name,eule),(jemy,myint),(kume))";
         try{
            final FedStatement statement = fedConnection.getStatement();
            statement.executeUpdate(sql);
            thrown = false;
        } catch(Exception e) {}
        System.out.println("FederalDB.UnitTest_01.test_04()   " + thrown);
         assertTrue(thrown);
    }
    //Normal Horizontal flasche einteilung
    @Test
    public void test_create_05(){
        boolean thrown = true;
        String sql = "create table myVert05 (\n" +
            "id integer,\n" +
            "name varchar(40),\n" +
            "eule varchar(40),\n" +
            "jemy varchar(30),\n" +
            "myint integer,\n" +
            "kume integer,\n" +
            "constraint FLUGHAFEN_PS\n" +
            "		primary key (id))\n" +
            "HORIZONTAL ((name,eule),(jemy,myint),(kume))";
         try{
            final FedStatement statement = fedConnection.getStatement();
            statement.executeUpdate(sql);
            thrown = false;
        } catch(Exception e) {}
        System.out.println("FederalDB.UnitTest_01.test_05()   " + thrown);
         assertTrue(thrown);
    }
    //Horizontal normal
    @Test
    public void test_create_06(){
        boolean thrown = true;
        String sql = "create table myVert06 (\n" +
            "id integer,\n" +
            "name varchar(40),\n" +
            "eule varchar(40),\n" +
            "jemy varchar(30),\n" +
            "myint integer,\n" +
            "kume integer,\n" +
            "constraint FLUGHAFEN_PS\n" +
            "		primary key (id))\n" +
            "HORIZONTAL (jemy,(10,20))";
         try{
            final FedStatement statement = fedConnection.getStatement();
            statement.executeUpdate(sql);
            thrown = false;
        } catch(Exception e) {}
        System.out.println("FederalDB.UnitTest_01.test_06()   " + thrown);
         assertTrue(thrown);
    }
    //Vertical ohne werte
    @Test
    public void test_create_07(){
        boolean thrown = true;
        String sql = "create table myVert07 (\n" +
            "id integer,\n" +
            "name varchar(40),\n" +
            "eule varchar(40),\n" +
            "jemy varchar(30),\n" +
            "myint integer,\n" +
            "kume integer,\n" +
            "constraint FLUGHAFEN_PS\n" +
            "		primary key (id))\n" +
            "VERTICAL ()";
         try{
            final FedStatement statement = fedConnection.getStatement();
            statement.executeUpdate(sql);
            thrown = false;
        } catch(Exception e) {}
        System.out.println("FederalDB.UnitTest_01.test_07()   " + thrown);
         assertTrue(thrown);
    }
    //horizontal klein geschrieben, ohne werte
    @Test
    public void test_create_08(){
        boolean thrown = true;
        String sql = "create table myVert08 (\n" +
            "id integer,\n" +
            "name varchar(40),\n" +
            "eule varchar(40),\n" +
            "jemy varchar(30),\n" +
            "myint integer,\n" +
            "kume integer,\n" +
            "constraint FLUGHAFEN_PS\n" +
            "		primary key (id))\n" +
            "horizontal ()";
         try{
            final FedStatement statement = fedConnection.getStatement();
            statement.executeUpdate(sql);
            thrown = false;
        } catch(Exception e) {}
        System.out.println("FederalDB.UnitTest_01.test_08()   " + thrown);
         assertTrue(thrown);
    }
    //Einfach eine Tabelle
    @Test
    public void test_create_09(){
        boolean thrown = true;
        String sql = "create table TabEins (\n" +
            "id integer,\n" +
            "name varchar(40),\n" +
            "eule varchar(40),\n" +
            "jemy varchar(30),\n" +
            "myint integer,\n" +
            "kume integer,\n" +
            "constraint FLUGHAFEN_PS\n" +
            "		primary key (id))\n" +
            "VERTICAL ((name,eule),(jemy,myint),(kume))";
         try{
            final FedStatement statement = fedConnection.getStatement();
            statement.executeUpdate(sql);
            thrown = false;
        } catch(Exception e) {}
        System.out.println("FederalDB.UnitTest_01.test_09()   " + thrown);
         assertTrue(thrown);
    }
    //Zweites mal gleiche Tabelle
    @Test
    public void test_create_10(){
        boolean thrown = true;
        String sql = "create table TabEins (\n" +
            "id integer,\n" +
            "name varchar(40),\n" +
            "eule varchar(40),\n" +
            "jemy varchar(30),\n" +
            "myint integer,\n" +
            "kume integer,\n" +
            "constraint FLUGHAFEN_PS\n" +
            "		primary key (id))\n" +
            "VERTICAL ((name,eule),(jemy,myint),(kume))";
         try{
            final FedStatement statement = fedConnection.getStatement();
            statement.executeUpdate(sql);
            thrown = false;
        } catch(Exception e) {}
        System.out.println("FederalDB.UnitTest_01.test_10()   " + thrown);
         assertTrue(thrown);
    }
    
    
    
    
    
    
    
    
    //Falls gelungen wieder löschen
    @Test
    public void RBack() {
        try{
            final FedStatement statement = fedConnection.getStatement();
            statement.executeUpdate("Drop Table TEST");
            statement.executeUpdate("Drop Table myVert01");
            statement.executeUpdate("Drop Table myVert02");
            statement.executeUpdate("Drop Table myVert03");
            statement.executeUpdate("Drop Table myVert04");
            statement.executeUpdate("Drop Table myVert05");
            statement.executeUpdate("Drop Table myVert06");
            statement.executeUpdate("Drop Table myVert07");
            statement.executeUpdate("Drop Table myVert08");
            statement.executeUpdate("Drop Table TabEins");
        } catch (Exception e) {}
    }
}
