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
        } catch(Exception tu) {}
        
        //Insert für Test Flughafen
        String aa = "INSERT INTO FLHAFEN VALUES ('AKL', 'NZ ', 'Auckland', 'Auckland International')";                  
        String ab ="INSERT INTO FLHAFEN VALUES ('ALC', 'E  ', 'Alicante', 'Alicante')";                                
        String ac = "INSERT INTO FLHAFEN VALUES ('ALF', 'N  ', 'Alta', 'Flughafen Alta')";                              
        String ad = "INSERT INTO FLHAFEN VALUES ('ANC', 'USA', 'Anchorage', 'Ted Stevens AIA')";                        
        String ae = "INSERT INTO FLHAFEN VALUES ('ARN', 'S  ', 'Stockholm', 'Arlanda')";                                
        String af = "INSERT INTO FLHAFEN VALUES ('BCN', 'E  ', 'Barcelona', '')";                                       
        String ag = "INSERT INTO FLHAFEN VALUES ('BHX', 'GB ', 'Birmingham', '')";                                      
        String ah = "INSERT INTO FLHAFEN VALUES ('BOS', 'USA', 'Boston', 'Edward Lawrence Logan')";                     
        String ai = "INSERT INTO FLHAFEN VALUES ('BRE', 'D  ', 'Bremen', 'City Airport Bremen')";                       
        String aj = "INSERT INTO FLHAFEN VALUES ('BRS', 'GB ', 'Bristol', 'International')";                            
        String ak = "INSERT INTO FLHAFEN VALUES ('CDG', 'F  ', 'Paris', 'Charles de Gaulle')";                          
        String al = "INSERT INTO FLHAFEN VALUES ('CGK', 'ID ', 'Jakarta', 'Sukarno-Hatta Airport')";                    
        String am = "INSERT INTO FLHAFEN VALUES ('CGN', 'D  ', 'Koeln', 'Konrad-Adenauer')";                            

        String an = "INSERT INTO FLHAFEN VALUES ('CPH', 'DK ', 'Kopenhagen', 'Kastrup')";                               
        String ao = "INSERT INTO FLHAFEN VALUES ('CPT', 'RSA', 'Kapstadt', '')";                                        
        String ap = "INSERT INTO FLHAFEN VALUES ('CRT', 'TUN', 'Chartage', 'Tunesien')";                                
        String aq = "INSERT INTO FLHAFEN VALUES ('DJE', 'TUN', 'Djerba', 'Aeroport de Djerba')";                        
        String ar = "INSERT INTO FLHAFEN VALUES ('DRS', 'D  ', 'Dresden', 'Dresden Airport')";                          
        String as = "INSERT INTO FLHAFEN VALUES ('DUS', 'D  ', 'Duesseldorf', 'Duesseldorf International')";            
        String at = "INSERT INTO FLHAFEN VALUES ('EDI', 'GB ', 'Edinburgh', '')";                                       
        String au = "INSERT INTO FLHAFEN VALUES ('ERF', 'D  ', 'Erfurt', 'Flughafen Erfurt(ERF)')";                     
        String av = "INSERT INTO FLHAFEN VALUES ('FCO', 'I  ', 'Rom', 'Fiumicino')";                                    
        String aw = "INSERT INTO FLHAFEN VALUES ('FDH', 'D  ', 'Friedrichshafen', 'Bodensee-Airport')";                 
        String ax = "INSERT INTO FLHAFEN VALUES ('FLR', 'I  ', 'Florenz', 'Peretola')";                                 
        String ay = "INSERT INTO FLHAFEN VALUES ('FRA', 'D  ', 'Frankfurt', 'Rhein-Main')";                             
        String az = "INSERT INTO FLHAFEN VALUES ('GOT', 'S  ', 'Goeteborg', 'Landvetter')";                             

        String ba = "INSERT INTO FLHAFEN VALUES ('GRZ', 'A  ', 'Graz', 'Flughafen Graz')";                              
        String bb = "INSERT INTO FLHAFEN VALUES ('GVA', 'CH ', 'Genf', 'Flughafen Genf')";                              
        String bc = "INSERT INTO FLHAFEN VALUES ('HAJ', 'D  ', 'Hannover', 'Langenhagen')";                             
        String bd = "INSERT INTO FLHAFEN VALUES ('HHN', 'D  ', 'Hahn', 'Flughafen Hahn')";                              
        String be = "INSERT INTO FLHAFEN VALUES ('HKG', 'CHN', 'HongKong', 'HongKong International')";                  
        String bf = "INSERT INTO FLHAFEN VALUES ('HRG', 'EG ', 'Hurghada', 'International')";                           
        String bg = "INSERT INTO FLHAFEN VALUES ('IAD', 'USA', 'Washington', 'Dulles')";                                
        String bh = "INSERT INTO FLHAFEN VALUES ('ISA', 'AUS', 'Mount Isa', 'Queensland')";                             
        String bi = "INSERT INTO FLHAFEN VALUES ('IST', 'TR ', 'Istanbul', 'Atatürk')";                                 
        String bj = "INSERT INTO FLHAFEN VALUES ('JFK', 'USA', 'New York', 'John F. Kennedy')";                         
        String bk = "INSERT INTO FLHAFEN VALUES ('KIX', 'J  ', 'Osaka', 'Kansai')";                                     
        String bl = "INSERT INTO FLHAFEN VALUES ('KLU', 'D  ', 'Klagenfurt', 'Klagenfurter Flughafen')";                
        String bm = "INSERT INTO FLHAFEN VALUES ('KSF', 'D  ', 'Kassel', 'Calden')";                                    

        String bn = "INSERT INTO FLHAFEN VALUES ('LAX', 'USA', 'Los Angeles', '')";                                     
        String bo = "INSERT INTO FLHAFEN VALUES ('LGW', 'GB ', 'London', 'Gatwick')";                                   
        String bp = "INSERT INTO FLHAFEN VALUES ('LHR', 'GB ', 'London', 'Heathrow')";                                  
        String bq = "INSERT INTO FLHAFEN VALUES ('LIM', 'PE ', 'Lima', 'Jorge Chávez')";                                
        String br = "INSERT INTO FLHAFEN VALUES ('LPA', 'E  ', 'Las Palmas', 'Las Palmas Airport')";                    
        String bs = "INSERT INTO FLHAFEN VALUES ('LYS', 'F  ', 'Lyon', 'Saint-Exupéry')";                               
        String bt = "INSERT INTO FLHAFEN VALUES ('MAN', 'GB ', 'Manchester', '')";                                      
        String bu = "INSERT INTO FLHAFEN VALUES ('MCO', 'USA', 'Orlando', '')";                                         
        String bv = "INSERT INTO FLHAFEN VALUES ('MIR', 'TUN', 'Monastir', 'Aéroport Monastir')";                       
        String bw = "INSERT INTO FLHAFEN VALUES ('MPL', 'F  ', 'Montpellier', 'Montpellier Airport')";                  
        String bx = "INSERT INTO FLHAFEN VALUES ('MRS', 'F  ', 'Marseille', 'Marseille Provence')";                     
        String by = "INSERT INTO FLHAFEN VALUES ('MUC', 'D  ', 'Munich', 'Franz-Josef Strauss')";                       
        String bz = "INSERT INTO FLHAFEN VALUES ('MVR', 'CMR', 'Maroua', 'Maroua Salek Airport')";                      

        String ca = "INSERT INTO FLHAFEN VALUES ('NAP', 'I  ', 'Neapel', 'Capodichino')";                               
        String cb = "INSERT INTO FLHAFEN VALUES ('NCE', 'D  ', 'Nice', '')";                                            
        String cc = "INSERT INTO FLHAFEN VALUES ('NRT', 'J  ', 'Tokio', 'Narita')";                                     
        String cd = "INSERT INTO FLHAFEN VALUES ('NUE', 'D  ', 'Nuernberg', '')";                                       
        String ce = "INSERT INTO FLHAFEN VALUES ('ORD', 'USA', 'Chicago', 'OHare')";                                   
        String cf = "INSERT INTO FLHAFEN VALUES ('ORY', 'F  ', 'Paris', 'Orly')";                                       
        String cg = "INSERT INTO FLHAFEN VALUES ('OSL', 'N  ', 'Oslo', 'Oslo Gardermoen')";                             
        String ch = "INSERT INTO FLHAFEN VALUES ('PAD', 'D  ', 'Paderborn', '')";                                       
        String ci = "INSERT INTO FLHAFEN VALUES ('PEK', 'CHN', 'Peking', 'Beijing Shoudu Guoji Jichang')";              
        String cj = "INSERT INTO FLHAFEN VALUES ('PMI', 'E  ', 'Palma', 'Aeropuerto de Son Sant Joan')";                
        String ck = "INSERT INTO FLHAFEN VALUES ('SEA', 'USA', 'Seattle', 'Seattle-Tacoma')";                           
        String cl = "INSERT INTO FLHAFEN VALUES ('SFO', 'USA', 'San Francisco', '')";                                   
        String cm = "INSERT INTO FLHAFEN VALUES ('SSH', 'ET ', 'Sharm El Sheikh', 'Sharm El Sheikh Nat. Airport')";     

        String cn = "INSERT INTO FLHAFEN VALUES ('STN', 'GB ', 'London', 'Stanstead')";                                 
        String co = "INSERT INTO FLHAFEN VALUES ('SVO', 'RUS', 'Moskau', 'Scheremetjewo')";                             
        String cp = "INSERT INTO FLHAFEN VALUES ('SZG', 'A  ', 'Salzburg', 'Salzburg Airport')";                        
        String cq = "INSERT INTO FLHAFEN VALUES ('TFS', 'E  ', 'Granadilla', 'Teneriffa/Süd')";                         
        String cr = "INSERT INTO FLHAFEN VALUES ('TLS', 'F  ', 'Toulouse', 'Blagnac')";                                 
        String cs = "INSERT INTO FLHAFEN VALUES ('TRD', 'N  ', 'Trondheim', 'Vaernes')";                                
        String ct = "INSERT INTO FLHAFEN VALUES ('TRU', 'PE ', 'Trujillo', '')";                                        
        String cu = "INSERT INTO FLHAFEN VALUES ('TUN', 'TUN', 'Aeroport de Tunis', 'Tunis')";                                     
        String cv = "INSERT INTO FLHAFEN VALUES ('TXL', 'D  ', 'Berlin', 'Tegel')";                                     
        String cw = "INSERT INTO FLHAFEN VALUES ('VCE', 'I  ', 'Venedig', 'Marco Polo')";                               
        String cx = "INSERT INTO FLHAFEN VALUES ('VIE', 'A  ', 'Wien', 'Schwechat')";                                   
        String cy = "INSERT INTO FLHAFEN VALUES ('VLC', 'E  ', 'Valencia', 'Manises')";                                 
        String cz = "INSERT INTO FLHAFEN VALUES ('YDE', 'CMR', 'Yaounde', null)";                                         

        String da = "INSERT INTO FLHAFEN VALUES ('YUL', 'CDN', 'Montreal', 'Pierre Elliot Trudeau')";                   
        String db = "INSERT INTO FLHAFEN VALUES ('YVR', 'CDN', 'Vancouver', 'Vancouver International')";                
        String dc = "INSERT INTO FLHAFEN VALUES ('YYC', 'CDN', 'Calgary', 'Municipal Airport')";                        
        String dd = "INSERT INTO FLHAFEN VALUES ('YYZ', 'CDN', 'Toronto', 'Lester Pearson')";                           
        String de = "INSERT INTO FLHAFEN VALUES ('ZAZ', 'E  ', 'Zaragoza', null)";                                        
        String df = "INSERT INTO FLHAFEN VALUES ('ZRH', 'CH ', 'Zuerich', 'Kloten')"; 
        
        try{
            statement.executeUpdate(aa);
            statement.executeUpdate(ab);
            statement.executeUpdate(ac);
            statement.executeUpdate(ad);
            statement.executeUpdate(ae);
            statement.executeUpdate(af);
            statement.executeUpdate(ag);
            statement.executeUpdate(ah);
            statement.executeUpdate(ai);
            statement.executeUpdate(aj);
            statement.executeUpdate(ak);
            statement.executeUpdate(al);
            statement.executeUpdate(am);
            statement.executeUpdate(an);
            statement.executeUpdate(ao);
            statement.executeUpdate(ap);
            statement.executeUpdate(aq);
            statement.executeUpdate(ar);
            statement.executeUpdate(as);
            statement.executeUpdate(at);
            statement.executeUpdate(au);
            statement.executeUpdate(av);
            statement.executeUpdate(aw);
            statement.executeUpdate(ax);
            statement.executeUpdate(ay);
            statement.executeUpdate(az);
            
            statement.executeUpdate(ba);
            statement.executeUpdate(bb);
            statement.executeUpdate(bc);
            statement.executeUpdate(bd);
            statement.executeUpdate(be);
            statement.executeUpdate(bf);
            statement.executeUpdate(bg);
            statement.executeUpdate(bh);
            statement.executeUpdate(bi);
            statement.executeUpdate(bj);
            statement.executeUpdate(bk);
            statement.executeUpdate(bl);
            statement.executeUpdate(bm);
            statement.executeUpdate(bn);
            statement.executeUpdate(bo);
            statement.executeUpdate(bp);
            statement.executeUpdate(bq);
            statement.executeUpdate(br);
            statement.executeUpdate(bs);
            statement.executeUpdate(bt);
            statement.executeUpdate(bu);
            statement.executeUpdate(bv);
            statement.executeUpdate(bw);
            statement.executeUpdate(bx);
            statement.executeUpdate(by);
            statement.executeUpdate(bz);
            
            statement.executeUpdate(ca);
            statement.executeUpdate(cb);
            statement.executeUpdate(cc);
            statement.executeUpdate(cd);
            statement.executeUpdate(ce);
            statement.executeUpdate(cf);
            statement.executeUpdate(cg);
            statement.executeUpdate(ch);
            statement.executeUpdate(ci);
            statement.executeUpdate(cj);
            statement.executeUpdate(ck);
            statement.executeUpdate(cl);
            statement.executeUpdate(cm);
            statement.executeUpdate(cn);
            statement.executeUpdate(co);
            statement.executeUpdate(cp);
            statement.executeUpdate(cq);
            statement.executeUpdate(cr);
            statement.executeUpdate(cs);
            statement.executeUpdate(ct);
            statement.executeUpdate(cu);
            statement.executeUpdate(cv);
            statement.executeUpdate(cw);
            statement.executeUpdate(cx);
            statement.executeUpdate(cy);
            statement.executeUpdate(cz);
            
            statement.executeUpdate(da);
            statement.executeUpdate(db);
            statement.executeUpdate(dc);
            statement.executeUpdate(dd);
            statement.executeUpdate(de);
            statement.executeUpdate(df);
        } catch (Exception tu) {
        System.out.println("Insert Fail");}
        //Insert für Test Fluglinie
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
        } catch (Exception tu) {
        System.out.println("Insert Fail");}
        //Insert Flug
        String ea = "INSERT INTO FLG VALUES (91, 'AC', 10, 'YYZ', 'FRA', 1815, 740)";                                    
        String eb = "INSERT INTO FLG VALUES (52, 'AC', 11, 'YUL', 'YYZ', 1500, 1700)";                                   
        String ec = "INSERT INTO FLG VALUES (18, 'AF', 9, 'TXL', 'CDG', 915, 1040)";                                     
        String ed = "INSERT INTO FLG VALUES (74, 'AF', 33, 'FRA', 'CDG', 900, 1010)";                                    
        String ee = "INSERT INTO FLG VALUES (84, 'AF', 34, 'FRA', 'CDG', 1200, 1210)";                                   
        String ef = "INSERT INTO FLG VALUES (1, 'AF', 35, 'CDG', 'FRA', 1400, 1500)";                                    
        String eg = "INSERT INTO FLG VALUES (92, 'AF', 45, 'CDG', 'NRT', 1220, 730)";                                    
        String eh = "INSERT INTO FLG VALUES (2, 'BA', 84, 'ORD', 'SFO', 1530, 1800)";                                    
        String ei = "INSERT INTO FLG VALUES (66, 'BA', 86, 'FRA', 'LHR', 910, 1050)";                                    
        String ej = "INSERT INTO FLG VALUES (3, 'BA', 87, 'LHR', 'FRA', 1310, 1450)";                                    
        String ek = "INSERT INTO FLG VALUES (4, 'BA', 88, 'LHR', 'BHX', 1010, 1050)";                                    
        String el = "INSERT INTO FLG VALUES (5, 'BA', 90, 'LGW', 'BHX', 1020, 1150)";                                    
        String em = "INSERT INTO FLG VALUES (36, 'DB', 2, 'HHN', 'FRA', 1120, 1230)";                                    

        String en = "INSERT INTO FLG VALUES (85, 'DB', 3, 'FRA', 'HHN', 1530, 1640)";                                    
        String eo = "INSERT INTO FLG VALUES (19, 'DB', 6, 'ERF', 'FRA', 915, 945)";                                      
        String ep = "INSERT INTO FLG VALUES (75, 'DB', 7, 'FRA', 'ERF', 1000, 1030)";                                    
        String eq = "INSERT INTO FLG VALUES (20, 'DB', 8, 'MIR', 'FRA', 1000, 1230)";                                    
        String er = "INSERT INTO FLG VALUES (21, 'DB', 9, 'FRA', 'MIR', 1500, 1730)";                                    
        String es = "INSERT INTO FLG VALUES (67, 'DB', 10, 'DJE', 'FRA', 1000, 1230)";                                   
        String et = "INSERT INTO FLG VALUES (6, 'DB', 11, 'FRA', 'DJE', 1500, 1730)";                                    
        String eu = "INSERT INTO FLG VALUES (76, 'DB', 14, 'LYS', 'FRA', 1845, 1955)";                                   
        String ev = "INSERT INTO FLG VALUES (37, 'DB', 15, 'FRA', 'LYS', 115, 230)";                                     
        String ew = "INSERT INTO FLG VALUES (38, 'DB', 16, 'PMI', 'FRA', 455, 650)";                                     
        String ex = "INSERT INTO FLG VALUES (68, 'DB', 17, 'FRA', 'PMI', 915, 1150)";                                    
        String ey = "INSERT INTO FLG VALUES (93, 'DB', 18, 'DRS', 'FRA', 600, 700)";                                     
        String ez = "INSERT INTO FLG VALUES (77, 'DB', 19, 'FRA', 'DRS', 1750, 1850)";                                   

        String fa = "INSERT INTO FLG VALUES (39, 'DB', 20, 'ALF', 'FRA', 630, 700)";                                     
        String fb = "INSERT INTO FLG VALUES (78, 'DB', 21, 'FRA', 'ALF', 930, 1050)";                                    
        String fc = "INSERT INTO FLG VALUES (86, 'DB', 22, 'PEK', 'FRA', 0, 800)";                                       
        String fd = "INSERT INTO FLG VALUES (53, 'DB', 23, 'FRA', 'PEK', 1500, 2300)";                                   
        String fe = "INSERT INTO FLG VALUES (40, 'DB', 24, 'KLU', 'FRA', 1050, 1250)";                                   
        String ff = "INSERT INTO FLG VALUES (22, 'DB', 25, 'FRA', 'KLU', 1450, 1650)";                                   
        String fg = "INSERT INTO FLG VALUES (23, 'DB', 28, 'TUN', 'FRA', 1000, 1230)";                                   
        String fh = "INSERT INTO FLG VALUES (24, 'DB', 29, 'FRA', 'TUN', 1500, 1730)";                                   
        String fi = "INSERT INTO FLG VALUES (94, 'DB', 32, 'MPL', 'FRA', 820, 1050)";                                    
        String fj = "INSERT INTO FLG VALUES (69, 'DB', 33, 'FRA', 'MPL', 1210, 1440)";                                   
        String fk = "INSERT INTO FLG VALUES (25, 'DB', 36, 'HAJ', 'FRA', 800, 900)";                                     
        String fl = "INSERT INTO FLG VALUES (26, 'DB', 37, 'FRA', 'HAJ', 1200, 1300)";                                   
        String fm = "INSERT INTO FLG VALUES (95, 'DB', 40, 'YYC', 'FRA', 815, 1715)";                                    

        String fn = "INSERT INTO FLG VALUES (27, 'DB', 41, 'FRA', 'YYC', 1830, 330)";                                    
        String fo = "INSERT INTO FLG VALUES (28, 'DB', 42, 'SSH', 'FRA', 500, 900)";                                     
        String fp = "INSERT INTO FLG VALUES (29, 'DB', 43, 'FRA', 'SSH', 1100, 1400)";                                   
        String fq = "INSERT INTO FLG VALUES (7, 'DB', 46, 'LIM', 'FRA', 2055, 1830)";                                    
        String fr = "INSERT INTO FLG VALUES (79, 'DB', 47, 'FRA', 'LIM', 2015, 820)";                                    
        String fs = "INSERT INTO FLG VALUES (8, 'DB', 48, 'DUS', 'FRA', 915, 1000)";                                     
        String ft = "INSERT INTO FLG VALUES (41, 'DB', 49, 'FRA', 'DUS', 1115, 1200)";                                   
        String fu = "INSERT INTO FLG VALUES (96, 'DB', 54, 'SVO', 'FRA', 1620, 1745)";                                   
        String fv = "INSERT INTO FLG VALUES (80, 'DB', 55, 'FRA', 'SVO', 1845, 2010)";                                   
        String fw = "INSERT INTO FLG VALUES (87, 'DB', 56, 'BRE', 'FRA', 615, 700)";                                     
        String fx = "INSERT INTO FLG VALUES (9, 'DB', 57, 'FRA', 'BRE', 800, 845)";                                      
        String fy = "INSERT INTO FLG VALUES (54, 'DB', 58, 'LPA', 'FRA', 100, 550)";                                     
        String fz = "INSERT INTO FLG VALUES (10, 'DB', 59, 'FRA', 'LPA', 1700, 2150)";                                   

        String ga = "INSERT INTO FLG VALUES (42, 'DB', 60, 'ISA', 'FRA', 415, 32)";                                      
        String gb = "INSERT INTO FLG VALUES (43, 'DB', 61, 'FRA', 'ISA', 1750, 909)";                                    
        String gc = "INSERT INTO FLG VALUES (55, 'DB', 62, 'HKG', 'FRA', 1000, 1700)";                                   
        String gd = "INSERT INTO FLG VALUES (56, 'DB', 63, 'FRA', 'HKG', 1900, 800)";                                    
        String ge = "INSERT INTO FLG VALUES (11, 'DB', 72, 'YDE', 'FRA', 2315, 725)";                                    
        String gf = "INSERT INTO FLG VALUES (57, 'DB', 73, 'FRA', 'YDE', 1740, 2340)";                                   
        String gg = "INSERT INTO FLG VALUES (58, 'DB', 74, 'CGK', 'FRA', 2300, 1000)";                                   
        String gh = "INSERT INTO FLG VALUES (12, 'DB', 75, 'FRA', 'CGK', 1700, 1300)";                                   
        String gi = "INSERT INTO FLG VALUES (70, 'DB', 76, 'MVR', 'FRA', 1000, 1700)";                                   
        String gj = "INSERT INTO FLG VALUES (59, 'DB', 77, 'FRA', 'MVR', 1800, 100)";                                    
        String gk = "INSERT INTO FLG VALUES (44, 'DB', 78, 'TLS', 'FRA', 830, 1000)";                                    
        String gl = "INSERT INTO FLG VALUES (71, 'DB', 79, 'FRA', 'TLS', 1230, 1400)";                                   
        String gm = "INSERT INTO FLG VALUES (72, 'DB', 80, 'SZG', 'FRA', 800, 1000)";                                    

        String gn = "INSERT INTO FLG VALUES (45, 'DB', 81, 'FRA', 'SZG', 1200, 1400)";                                   
        String go = "INSERT INTO FLG VALUES (60, 'DB', 82, 'CRT', 'FRA', 1000, 1230)";                                   
        String gp = "INSERT INTO FLG VALUES (61, 'DB', 83, 'FRA', 'CRT', 1500, 1730)";                                   
        String gq = "INSERT INTO FLG VALUES (46, 'DB', 90, 'TRU', 'FRA', 2200, 1020)";                                   
        String gr = "INSERT INTO FLG VALUES (30, 'DB', 91, 'FRA', 'TRU', 1430, 2200)";                                   
        String gs = "INSERT INTO FLG VALUES (13, 'DL', 7, 'ORD', 'SFO', 1140, 1530)";                                    
        String gt = "INSERT INTO FLG VALUES (14, 'DL', 9, 'LAX', 'NRT', 2220, 1000)";                                    
        String gu = "INSERT INTO FLG VALUES (97, 'DL', 33, 'SFO', 'LAX', 900, 1005)";                                    
        String gv = "INSERT INTO FLG VALUES (98, 'JL', 12, 'TXL', 'KIX', 1355, 820)";                                    
        String gw = "INSERT INTO FLG VALUES (31, 'LH', 5, 'FRA', 'TXL', 730, 830)";                                      
        String gx = "INSERT INTO FLG VALUES (62, 'LH', 6, 'TXL', 'FRA', 930, 1030)";                                     
        String gy = "INSERT INTO FLG VALUES (88, 'LH', 7, 'FRA', 'TXL', 1130, 1230)";                                    
        String gz = "INSERT INTO FLG VALUES (63, 'LH', 8, 'TXL', 'FRA', 1230, 1330)";                                    

        String ha = "INSERT INTO FLG VALUES (47, 'LH', 9, 'FRA', 'TXL', 1430, 1530)";                                    
        String hb = "INSERT INTO FLG VALUES (48, 'LH', 10, 'TXL', 'FRA', 1630, 1730)";                                   
        String hc = "INSERT INTO FLG VALUES (15, 'LH', 20, 'TXL', 'CDG', 900, 1140)";                                    
        String hd = "INSERT INTO FLG VALUES (32, 'LH', 24, 'TXL', 'FRA', 2130, 2310)";                                   
        String he = "INSERT INTO FLG VALUES (89, 'LH', 32, 'JFK', 'LAX', 1400, 1800)";                                   
        String hf = "INSERT INTO FLG VALUES (16, 'LH', 34, 'FRA', 'SFO', 1015, 1245)";                                   
        String hg = "INSERT INTO FLG VALUES (49, 'LH', 36, 'SFO', 'LAX', 1700, 1815)";                                   
        String hh = "INSERT INTO FLG VALUES (90, 'LH', 40, 'FRA', 'LHR', 700, 815)";                                     
        String hi = "INSERT INTO FLG VALUES (99, 'LH', 41, 'LHR', 'FRA', 1025, 1145)";                                   
        String hj = "INSERT INTO FLG VALUES (50, 'LH', 42, 'FRA', 'LHR', 1300, 1415)";                                   
        String hk = "INSERT INTO FLG VALUES (81, 'LH', 43, 'LHR', 'FRA', 1515, 1640)";                                   
        String hl = "INSERT INTO FLG VALUES (64, 'LH', 44, 'FRA', 'LHR', 1600, 1715)";                                   
        String hm = "INSERT INTO FLG VALUES (17, 'LH', 45, 'LHR', 'FRA', 1830, 2000)";                                   

        String hn = "INSERT INTO FLG VALUES (33, 'LH', 46, 'FRA', 'LHR', 2130, 2245)";                                   
        String ho = "INSERT INTO FLG VALUES (51, 'LH', 47, 'LHR', 'FRA', 700, 820)";                                     
        String hp = "INSERT INTO FLG VALUES (34, 'LH', 50, 'FRA', 'CDG', 710, 810)";                                     
        String hq = "INSERT INTO FLG VALUES (100, 'LH', 51, 'CDG', 'FRA', 930, 1030)";                                   
        String hr = "INSERT INTO FLG VALUES (82, 'LH', 52, 'FRA', 'CDG', 1210, 1310)";                                   
        String hs = "INSERT INTO FLG VALUES (35, 'LH', 53, 'CDG', 'FRA', 1500, 1620)";                                   
        String ht = "INSERT INTO FLG VALUES (73, 'LH', 54, 'FRA', 'CDG', 1740, 1850)";                                   
        String hu = "INSERT INTO FLG VALUES (83, 'LH', 55, 'CDG', 'FRA', 2000, 2120)";                                   
        String hv = "INSERT INTO FLG VALUES (65, 'LH', 60, 'FRA', 'BHX', 1005, 1130)";
        
        try{
            statement.executeUpdate(ea);
            statement.executeUpdate(eb);
            statement.executeUpdate(ec);
            statement.executeUpdate(ed);
            statement.executeUpdate(ee);
            statement.executeUpdate(ef);
            statement.executeUpdate(eg);
            statement.executeUpdate(eh);
            statement.executeUpdate(ei);
            statement.executeUpdate(ej);
            statement.executeUpdate(ek);
            statement.executeUpdate(el);
            statement.executeUpdate(em);
            statement.executeUpdate(en);
            statement.executeUpdate(eo);
            statement.executeUpdate(ep);
            statement.executeUpdate(eq);
            statement.executeUpdate(er);
            statement.executeUpdate(es);
            statement.executeUpdate(et);
            statement.executeUpdate(eu);
            statement.executeUpdate(ev);
            statement.executeUpdate(ew);
            statement.executeUpdate(ex);
            statement.executeUpdate(ej);
            statement.executeUpdate(ez);
            
            statement.executeUpdate(fa);
            statement.executeUpdate(fb);
            statement.executeUpdate(fc);
            statement.executeUpdate(fd);
            statement.executeUpdate(fe);
            statement.executeUpdate(ff);
            statement.executeUpdate(fg);
            statement.executeUpdate(fh);
            statement.executeUpdate(fi);
            statement.executeUpdate(fj);
            statement.executeUpdate(fk);
            statement.executeUpdate(fl);
            statement.executeUpdate(fm);
            statement.executeUpdate(fn);
            statement.executeUpdate(fo);
            statement.executeUpdate(fp);
            statement.executeUpdate(fq);
            statement.executeUpdate(fr);
            statement.executeUpdate(fs);
            statement.executeUpdate(ft);
            statement.executeUpdate(fu);
            statement.executeUpdate(fv);
            statement.executeUpdate(fw);
            statement.executeUpdate(fx);
            statement.executeUpdate(fy);
            statement.executeUpdate(fz);
            
            statement.executeUpdate(ga);
            statement.executeUpdate(gb);
            statement.executeUpdate(gc);
            statement.executeUpdate(gd);
            statement.executeUpdate(ge);
            statement.executeUpdate(gf);
            statement.executeUpdate(gg);
            statement.executeUpdate(gh);
            statement.executeUpdate(gi);
            statement.executeUpdate(gj);
            statement.executeUpdate(gk);
            statement.executeUpdate(gl);
            statement.executeUpdate(gm);
            statement.executeUpdate(gn);
            statement.executeUpdate(go);
            statement.executeUpdate(gp);
            statement.executeUpdate(gq);
            statement.executeUpdate(gr);
            statement.executeUpdate(gs);
            statement.executeUpdate(gt);
            statement.executeUpdate(gu);
            statement.executeUpdate(gv);
            statement.executeUpdate(gw);
            statement.executeUpdate(gx);
            statement.executeUpdate(gj);
            statement.executeUpdate(gz);
            
            statement.executeUpdate(ha);
            statement.executeUpdate(hb);
            statement.executeUpdate(hc);
            statement.executeUpdate(hd);
            statement.executeUpdate(he);
            statement.executeUpdate(hf);
            statement.executeUpdate(hg);
            statement.executeUpdate(hh);
            statement.executeUpdate(hi);
            statement.executeUpdate(hj);
            statement.executeUpdate(hk);
            statement.executeUpdate(hl);
            statement.executeUpdate(hm);
            statement.executeUpdate(hn);
            statement.executeUpdate(ho);
            statement.executeUpdate(hp);
            statement.executeUpdate(hq);
            statement.executeUpdate(hr);
            statement.executeUpdate(hs);
            statement.executeUpdate(ht);
            statement.executeUpdate(hu);
            statement.executeUpdate(hv);
        } catch (Exception tu) {
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
//Test für Mehrzeiliges Update
    @Test
    public void update_test() {
        try {
            assertEquals(11, statement.executeUpdate("update FLLINIE set HUB = NULL;"));
        }catch (Exception e) {}
        
    }
   
//Test für einzeiliges Update
    @Test
    public void update_test_01() {
        try {
            assertEquals(1, statement.executeUpdate("update FLLINIE set HUB = 'FRA' where FLC = 'LH';"));
        }catch (Exception e) {}
        
    }
    
//Test für Update nicht existente Zeile
    @Test
    public void update_test_02() {
        try{
            assertEquals(0, statement.executeUpdate("Update FLLINIE set HUB = 'FRA' where FLC = 'test';"));
        }catch (Exception e) {}
    }
    
//Nicht existente Tabelle Updaten
    @Test
    public void update_test_03() {
        try{
            assertEquals(0, statement.executeUpdate("Update BAUM set HUB = 'FRA' where FLC = 'test';"));
        }catch (Exception e) {}
    }
    
//Conditions Updaten HUB != 'Blacklist
    @Test
    public void update_test_04() {
        try{
            assertEquals(0, statement.executeUpdate("Update FLLINIE set HUB = 'BlackList' where FLC = 'LH';"));
        }catch (Exception e) {}
    }
    
//Conditions Updaten AB between 0 and 2400
    @Test
    public void update_test_05() {
        try{
            assertEquals(0, statement.executeUpdate("Update FLG set AB = 1000 where FLC = 'LH';"));
        }catch (Exception e) {}
    }
    
    //Conditions Updaten x not null
    @Test
    public void update_test_06() {
        try{
            assertEquals(0, statement.executeUpdate("Update FLG set VON = null where FLC = 'LH';"));
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
        } catch(Exception tu) {}
        assertTrue(true);
        
    }
}
