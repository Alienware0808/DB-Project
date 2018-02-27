/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FederalDB;

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
public class Insert_Test
{
    final String usernameTest = "VDBSA09";
    final String passwordTest = "VDBSA09";

    final String usernameValidation = "VDBSA09";
    final String passwordValidation = "VDBSA09";
    
    private FedConnection fedConnection = (new FedPseudoDriver()).getConnection(usernameValidation, passwordValidation);
    final FedStatement statement;
    public Insert_Test()
    {
        statement = fedConnection.getStatement();
        String FlHafen = "create table FLHAFEN (\n" +
                "FHC	varchar(3),\n" +
                "LAND	varchar(3),\n" +
                "STADT	varchar(50),\n" +
                "NAME	varchar(50),\n" +
                "constraint FLHAFEN_PS\n" +
                "	primary key (FHC)\n" +
                ")\n" +
                "VERTICAL ((FHC, LAND), (STADT, NAME));";
        String FlLinie = "create table FLLINIE (\n" +
                "FLC	varchar(2),\n" +
                "LAND	varchar(3),\n" +
                "HUB	varchar(3),\n" +
                "NAME	varchar(30),\n" +
                "ALLIANZ	varchar(20),\n" +
                "constraint FLLINIE_PS\n" +
                "	primary key (FLC),\n" +
                "constraint FLLINIE_FS_HUB\n" +
                "	foreign key (HUB) references FLHAFEN(FHC),\n" +
                "constraint FLLINIE_LAND_NN\n" +
                "	check (LAND is not null),\n" +
                "constraint FLLINIE_ALLIANZ_CHK\n" +
                "	check (ALLIANZ != 'BlackList')\n" +
                ")\n" +
                "HORIZONTAL (FLC('KK','MM'));";
        String Flg = "create table FLG (\n" +
                "FNR    integer,\n" +
                "FLC	varchar(2),\n" +
                "FLNR	integer, \n" +
                "VON	varchar(3),\n" +
                "NACH	varchar(3),\n" +
                "AB	integer,\n" +
                "AN	integer,\n" +
                "constraint FLG_PS\n" +
                "	primary key (FNR),\n" +
                "constraint FLG_FS_FLC\n" +
                "	foreign key (FLC) references FLLINIE(FLC),\n" +
                "constraint FLG_FS_VON\n" +
                "	foreign key (VON) references FLHAFEN(FHC),\n" +
                "constraint FLG_FS_NACH\n" +
                "	foreign key (NACH) references FLHAFEN(FHC),\n" +
                "constraint FLG_VON_NN\n" +
                "	check (VON is not null),\n" +
                "constraint FLG_NACH_NN\n" +
                "	check (NACH is not null),\n" +
                "constraint FLG_AB_NN\n" +
                "	check (AB is not null),\n" +
                "constraint FLG_AN_NN\n" +
                "	check (AN is not null),\n" +
                "constraint FLG_AB_CHK\n" +
                "	check (AB between 0 and 2400),\n" +
                "constraint FLG_AN_CHK\n" +
                "	check (AN between 0 and 2400),\n" +
                "constraint FLG_VONNACH_CHK\n" +
                "	check (VON != NACH)\n" +
                ")\n" +
                "HORIZONTAL (FLC('KK','MM'));";
        String FlPassagier = "create table FLPASSAGIER (\n" +
                "PNR	integer,\n" +
                "NAME	varchar(40),\n" +
                "VORNAME	varchar(40),	\n" +
                "LAND	varchar(3),\n" +
                "constraint FLPASSAGIER_PS\n" +
                "	primary key (PNR),\n" +
                "constraint FLPASSAGIER_NAME_NN\n" +
                "        check (NAME is not null)\n" +
                ")\n" +
                "VERTICAL ((PNR, NAME),(VORNAME, LAND));";
        String FlBuchung ="create table FLBUCHUNG (\n" +
                "BNR    integer,\n" +
                "PNR	integer,\n" +
                "FLC	varchar(2),\n" +
                "FLNR	integer,	\n" +
                "VON	varchar(3),\n" +
                "NACH	varchar(3),\n" +
                "TAG	varchar(20),\n" +
                "MEILEN integer,\n" +
                "PREIS  integer,\n" +
                "constraint FLBUCHUNG_PS\n" +
                "	primary key (BNR),\n" +
                "constraint FLBUCHUNG_FS_PNR\n" +
                "	foreign key (PNR) references FLPASSAGIER(PNR),\n" +
                "constraint FLBUCHUNG_FS_FLC\n" +
                "	foreign key (FLC) references FLLINIE(FLC),\n" +
                "constraint FLBUCHUNG_FS_VON\n" +
                "	foreign key (VON) references FLHAFEN(FHC),\n" +
                "constraint FLBUCHUNG_FS_NACH\n" +
                "	foreign key (NACH) references FLHAFEN(FHC),\n" +
                "constraint FLBUCHUNG_NACH_NN\n" +
                "	check (NACH is not null),\n" +
                "constraint FLBUCHUNG_MEILEN_NN\n" +
                "	check (MEILEN is not null),\n" +
                "constraint FLBUCHUNG_PREIS_NN\n" +
                "	check (PREIS is not null),\n" +
                "constraint FLBUCHUNG_MEILEN_CHK\n" +
                "        check (MEILEN >= 0),\n" +
                "constraint FLBUCHUNG_PREIS_CHK\n" +
                "        check (PREIS > 0)\n" +
                ")\n" +
                "HORIZONTAL (PNR(35,70));";
        try {
            statement.executeUpdate(FlHafen);
            System.out.println("Create FlugHafen");
            statement.executeUpdate(FlLinie);
            System.out.println("Create FlugLinie");
            statement.executeUpdate(Flg);
            System.out.println("Create Flug");
            statement.executeUpdate(FlPassagier);
            System.out.println("Create Passagier");
            statement.executeUpdate(FlBuchung);
            System.out.println("Create Buchung");
        } catch(Exception e) {}
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
//Korrekter Wert in Tabelle eintragen
    @Test
    public void test_insert_01() {
        String sql = "INSERT INTO FLHAFEN VALUES ('AKL', 'NZ ', 'Auckland', 'Auckland International')";
        try{
            assertEquals(1,statement.executeUpdate(sql));
        } catch(Exception e) {}
    }
    
    //Nicht Exitente Tabelle
    @Test
    public void test_insert_02() {
        String sql = "INSERT INTO Test VALUES ('AKL', 'NZ ', 'Auckland', 'Auckland International')";
        try{
            assertEquals(1,statement.executeUpdate(sql));
        } catch(Exception e) {}
    }
    
    //Ohne PrimaryKey
    @Test
    public void test_insert_03() {
        String sql = "INSERT INTO FLHAFEN (LAND, STADT, NAMEN)VALUES ('NZ ', 'Auckland', 'Auckland International')";
        try{
            assertEquals(1,statement.executeUpdate(sql));
        } catch(Exception e) {}
    }
    
    
    //Fremdschlüssel existiert nicht
    @Test
    public void test_insert_04() {
        String sql = "INSERT INTO FLLINIE VALUES ('AB', 'D ', 'test', 'Air Berlin', null)";
        try{
            assertEquals(1,statement.executeUpdate(sql));
        } catch(Exception e) {}
    }
    
    //Doppelter Primärschlüssel
    @Test
    public void test_insert_05() {
        String sql = "INSERT INTO FLHAFEN VALUES ('AKL', 'NZ ', 'Auckland', 'Auckland International')";
        try{
            assertEquals(1,statement.executeUpdate(sql));
        } catch(Exception e) {}
    }
    
    //Falsche Menge an Values zu wenig
    @Test
    public void test_insert_06() {
        String sql = "INSERT INTO FLHAFEN VALUES ('AKL', 'NZ ', 'Auckland')";
        try{
            assertEquals(1,statement.executeUpdate(sql));
        } catch(Exception e) {}
    }
    
    //Falsche Menge an Values zu viel
    @Test
    public void test_insert_07() {
        String sql = "INSERT INTO FLHAFEN VALUES ('AKL', 'NZ ', 'Auckland', 'Auckland International', 'Baum')";
        try{
            assertEquals(1,statement.executeUpdate(sql));
        } catch(Exception e) {}
    }
    
    //Grenzen bei Horizontal davor
    @Test
    public void test_insert_08() {
        String sql = "INSERT INTO FLLINIE VALUES ('KJ', 'D', null, 'Auckland International', null)";
        try{
            assertEquals(1,statement.executeUpdate(sql));
        } catch(Exception e) {}
    }
    
    //Grenzen bei Horizontal genau
    @Test
    public void test_insert_09() {
        String sql = "INSERT INTO FLLINIE VALUES ('KK', 'D', null, 'Auckland International', null)";
        try{
            assertEquals(1,statement.executeUpdate(sql));
        } catch(Exception e) {}
    }
    
    //Grenzen bei Horizontal, danach
    @Test
    public void test_insert_10() {
        String sql = "INSERT INTO FLLINIE VALUES ('KL', 'D', null, 'Auckland International', null)";
        try{
            assertEquals(1,statement.executeUpdate(sql));
        } catch(Exception e) {}
    }
    
    //Falsche Formate INT statt varchar
    @Test
    public void test_insert_11() {
        String sql = "INSERT INTO FLLINIE VALUES ('HM', 'D', null, 12, null)";
        try{
            assertEquals(1,statement.executeUpdate(sql));
        } catch(Exception e) {}
    }
    
    //Falsche Formate varchar statt int
    @Test
    public void test_insert_12() {
        String sql = "INSERT INTO FLPASSAGIER VALUES ('HM', 'Dumm', 'Beutel', 'D')";
        try{
            assertEquals(1,statement.executeUpdate(sql));
        } catch(Exception e) {}
    }
    
    //Test von Meilen > 0
    @Test
    public void test_insert_13() {
        String sql = "INSERT INTO FLBUCHUNG VALUES (200, 80, 'LH', 54, 'FRA', 'CDG', '19-SEP-2012', -200, 243);";
        try{
            assertEquals(0,statement.executeUpdate(sql));
        } catch(Exception e) {}
    }
    
    //Testen von NOT NULL
    @Test
    public void test_insert_14() {
        String sql = "INSERT INTO FLBUCHUNG VALUES (201, 80, 'LH', 54, 'FRA', 'CDG', '19-SEP-2012', 300, NULL);";
        try{
            assertEquals(0,statement.executeUpdate(sql));
        } catch(Exception e) {}
    }
    
    //Check Primary Key NOT Distributed
    @Test
    public void test_insert_15() {
        String sql = "INSERT INTO FLBUCHUNG VALUES (184, 81, 'DB', 90, 'TRU', 'FRA', '16-FEB-2010', 5000, 800);";
        try{
            assertEquals(0,statement.executeUpdate(sql));
        } catch(Exception e) {}
    }
    
    //Test Primary Key Distributed NOT IN same Partition
    @Test
    public void test_insert_16() {
        String sql = "INSERT INTO FLBUCHUNG VALUES (184, 81, 'DB', 90, 'CDG', 'FRA', '16-FEB-2010', 5000, 800);";
        try{
            assertEquals(1,statement.executeUpdate(sql));
        } catch(Exception e) {}
    }
    
    //Test RANGE
    @Test
    public void test_insert_17() {
        String sql = "INSERT INTO FLG VALUES (305, 'LH', 53, 'CDG', 'FRA', 1500, 9000);";
        try{
            assertEquals(1,statement.executeUpdate(sql));
        } catch(Exception e) {}
    }
    
    
    //Am Ende die TestTabellen wieder Löschen
    @Test
    public void drop() {
        try {
            statement.executeUpdate("Drop Table FLHAFEN cascade constraints");
            statement.executeUpdate("Drop Table FLLINIE cascade constraints");
            statement.executeUpdate("Drop Table FLG cascade constraints");
            statement.executeUpdate("Drop Table FLPASSAGIER cascade constraints");
            statement.executeUpdate("Drop Table FLBUCHUNG cascade constraints");
        } catch(Exception e) {}
        assertTrue(true);
        
    }
}
