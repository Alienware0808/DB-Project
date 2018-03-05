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
public class Update_Test
{
    final String usernameTest = "VDBSA09";
    final String passwordTest = "VDBSA09";

    final String usernameValidation = "VDBSA09";
    final String passwordValidation = "VDBSA09";
    
    private FedConnection fedConnection = (new FedPseudoDriver()).getConnection(usernameValidation, passwordValidation);
    final FedStatement statement;
    
    public Update_Test()
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
        //Insert für Test
        String a = "INSERT INTO FLLINIE VALUES ('AB', 'D  ', null, 'Air Berlin', null);";                                   
        String b = "INSERT INTO FLLINIE VALUES ('AC', 'CDN', null, 'Air Canada', 'Star');     ";                          
        String c = "INSERT INTO FLLINIE VALUES ('AF', 'F  ', null, 'Air France', 'SkyTeam');  ";                          
        String d = "INSERT INTO FLLINIE VALUES ('BA', 'GB ', null, 'British Airways', 'OneWorld'); ";                     
        String e = "INSERT INTO FLLINIE VALUES ('DB', 'D  ', null, 'Database Airlines', null); ";                           
        String f = "INSERT INTO FLLINIE VALUES ('DI', 'D  ', null, 'Deutsche BA', null);       ";                           
        String g = "INSERT INTO FLLINIE VALUES ('DL', 'USA', null, 'Delta Airlines', 'SkyTeam'); ";                       
        String h = "INSERT INTO FLLINIE VALUES ('JL', 'J  ', null, 'Japan Airlines', 'OneWorld'); ";                      
        String i = "INSERT INTO FLLINIE VALUES ('LH', 'D  ', null, 'Lufthansa', 'Star');        ";                        
        String j = "INSERT INTO FLLINIE VALUES ('NH', 'J  ', null, 'All Nippon Airways', 'Star'); ";                      
        String k = "INSERT INTO FLLINIE VALUES ('UA', 'USA', null, 'United Airlines', 'Star');";

        try{
            statement.executeUpdate(a);
            statement.executeUpdate(b);
            statement.executeUpdate(c);
            statement.executeUpdate(d);
            statement.executeUpdate(e);
            statement.executeUpdate(f);
            statement.executeUpdate(g);
            statement.executeUpdate(h);
            statement.executeUpdate(i);
            statement.executeUpdate(j);
            statement.executeUpdate(k);
        } catch (Exception ex) {
        System.out.println("Insert Fail");}
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

    @Test
    public void update_test() {
        try {
            assertEquals(11, statement.executeUpdate("update FLLINIE set HUB = NULL;"));
        }catch (Exception e) {}
        
    }
    
    @Test
    public void update_test_01() {
        try {
            assertEquals(1, statement.executeUpdate("update FLLINIE set HUB = 'FRA' where FLC = 'LH';"));
        }catch (Exception e) {}
        
    }
    
    
    // @Test
    // public void hello() {}
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
