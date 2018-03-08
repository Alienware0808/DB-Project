/*
 Unit Test class to test the SQLParser class in /API/data/SQLParser.java

 */
package FederalDB;

import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import Data.SQLHelper;
import MetaData.ColumnDefinition;
import MetaData.ColumnValue;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import parser.AnalysedStatements.CreateStatement;
import parser.ParseException;
import parser.SQLiteLexer;
import parser.SQLiteParser;
/**
 *
 * @author Franz Weidmann
 */
public class SQLHelperUnitTest
{
    final String usernameTest = "VDBSA09";
    final String passwordTest = "VDBSA02";

    final String usernameValidation = "VDBSA09";
    final String passwordValidation = "VDBSA09";
    
    final String tableNameTest = "testtt";
    final String tableNameValid = "FLHAFEN";
    
    final String colum1Test = "asjdias";
    // for table FLHAFEN
    final String colum1Valid = "STADT";
    
    final String colum2Test = "kkkk";
    // for table FLHAFEN
    final String colum2Valid = "LAND";
    
    final String colum3Test = "ländle";
    // for table FLHAFEN
    final String colum3Valid = "NAME";
    
    final String whereStringTest = "LAND is ot NULL";
    final String whereStringValid = "LAND is not NULL";
    
    final String createtableNameValid = "CREATIONTABLE";
    final String createSQL = "CREATE TABLE Persons (\n" +
    "    PersonID int,\n" +
    "    LastName varchar(255),\n" +
    "    FirstName varchar(255),\n" +
    "    Address varchar(255),\n" +
    "    City varchar(255))";

    final List<ColumnDefinition> columListTest = new ArrayList<ColumnDefinition>();
    final List<ColumnDefinition> columListValid = new ArrayList<ColumnDefinition>();
    
    final List<CreateStatement.CreateColumnDefinition> createColumnsDefinition = new ArrayList<CreateStatement.CreateColumnDefinition>();
    
    final List<ColumnValue> whereEqualsList = new ArrayList<ColumnValue>();
    
    private FedConnection fedConnection = (new FedPseudoDriver()).getConnection(usernameValidation, passwordValidation);
    private FedStatement statement;
    private FedConnection connect;
    
    
    //wrong username
    @Test
    public void ConnectionTest_Username() {
        connect = (new FedPseudoDriver()).getConnection(usernameTest, passwordValidation);
        assertNull(connect);
    }
    
    //wrong password
    @Test
    public void ConnectionTest_Password() {
        connect = (new FedPseudoDriver()).getConnection(usernameValidation, passwordTest);
        assertNull(connect);
    }
    
    //returns valid FedConnection
    @Test
    public void ConnectionTest_ConnValidation() {
        connect = (new FedPseudoDriver()).getConnection(usernameValidation, passwordValidation);
        assertNotNull(connect);
    }
    //Test for getStatement
    @Test
    public void ConnectionTest_getStatement() {
        assertNotNull(fedConnection.getStatement());
    }
    
    public SQLHelperUnitTest()
    {
        fillDataBase();
        fillColumnLists();
        fillWhereEqualslist();
        fillCreateDefinition();
    }
    
    // TODO: correct use of object ?
    private void fillWhereEqualslist(){
        whereEqualsList.add(new ColumnValue("STADT", "FLHAFEN", new Object()));
        whereEqualsList.add(new ColumnValue("STADT", "FLHAFE", new Object()));
    }
    
    // fill columnlist to test select funtctionality in SQLHelper
    private void fillColumnLists(){
        columListTest.add(new ColumnDefinition("stadt", tableNameValid));
        columListTest.add(new ColumnDefinition("dass", tableNameValid));
        
        columListValid.add(new ColumnDefinition("stadt", tableNameValid));
        columListValid.add(new ColumnDefinition("land", tableNameValid));
    }
    
    private ParseTree getTree(String sql) throws ParseException{
        CharStream stream = new ANTLRInputStream(sql);
        SQLiteLexer lexer = new SQLiteLexer(stream);
        SQLiteParser parser = new SQLiteParser(new CommonTokenStream(lexer));
        List<String> errors = new ArrayList<String>();
        parser.addErrorListener(new ANTLRErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int i, int i1, String string, RecognitionException re) {
                errors.add("SyntaxError: "+ i + ", " + i1 + ": " + string);
            }

            @Override
            public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean bln, BitSet bitset, ATNConfigSet atncs) {
                //errors.add("Ambiguity: " + i + ", " + i1);
            }

            @Override
            public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs) {
                 //errors.add("AttemptingFullContext: " + i + ", " + i1);
            }

            @Override
            public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs) {
                 //errors.add("ContextSensitivity: " + i + ", " + i1);
            }
        });
        SQLiteParser.ParseContext context = parser.parse();
        
        // Check for any errors 
        if(context.error() != null)
            context.error().forEach((next) -> {
                errors.add(next.toString());
            });
        if(errors.size() > 0)
            throw new ParseException(errors);
        
        // Get the list with all SQL Statements
        return context.children.get(0); // sql_stmt_list
    }
    
    private void fillCreateDefinition(){
       try{
           ParseTree parseTree = getTree(this.createSQL);
           CreateStatement.CreateColumnDefinition createColumnDef = CreateStatement.new CreateColumnDefinition(parseTree, this.tableNameValid);
           createColumnsDefinition.add(createColumnDef);
       }catch(ParseException pe){
           System.err.println(pe.getMessage());
       }
    }
    
    // fill database to be able to test functions
    private void fillDataBase(){
        
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
        String EigeneTest = "create table Holunder (\n" +
                "ID     integer,\n" +
                "FLC	varchar(2),\n" +
                "LAND	varchar(3),\n" +
                "constraint Holunder_PS\n" +
                "	primary key (ID),\n" +
                ")\n" +
                "HORIZONTAL (ID(4,8));";
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
            statement.executeUpdate(EigeneTest);
            System.out.println("Create Holunder");
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
    
    
    // invalid column
    @Test
    public void SQLHelperTest_Select_Column(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = null;
            try{
                selectTest = SQLHelper.select(conn, this.columListTest, this.tableNameValid);
                // checks wether the resultset is empty
                assertTrue(selectTest.isBeforeFirst());
            }catch(SQLException se){
                System.err.println(se.getMessage());
            }
        }
    }
    
    // invalid tablename
    @Test
    public void SQLHelperTest_Select_Table(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = null;
            try{
                selectTest = SQLHelper.select(conn, this.columListValid, this.tableNameTest);
                // checks wether the resultset is empty
                assertTrue(selectTest.isBeforeFirst());
            }catch(SQLException se){
                System.err.println(se.getMessage());
            }
        }
    }
    
    // test correct column count
    @Test
    public void SQLHelperTest_Select_Count(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet countTest = null;
            try{
                countTest = SQLHelper.select(conn, this.columListValid, this.tableNameValid);
                // get rowcount in resultset
                int rowcount = 0;
                if (countTest.last()) {
                    rowcount = countTest.getRow();
                } 
                
                assertEquals(this.columListValid.size(), rowcount);
                
            }catch(SQLException se){
                System.err.println(se.getMessage());
            }
        }
    }
    
    // invalid where equals
    @Test
    public void SQLHelperTest_Select_Where(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = null;
            try{
                selectTest = SQLHelper.select(conn, this.columListValid, this.tableNameValid, this.whereEqualsList);
                // checks wether the resultset is empty
                assertTrue(selectTest.isBeforeFirst());
            }catch(SQLException se){
                System.err.println(se.getMessage());
            }
        }
    }
    
    // test correct column count with where constraint
    // TODO
    @Test
    public void SQLHelperTest_Select_Coun_Where(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet countTest = null;
            try{
                countTest = SQLHelper.select(conn, this.columListValid, this.tableNameValid, this.whereEqualsList);
                // get rowcount in resultset
                int rowcount = 0;
                if (countTest.last()) {
                    rowcount = countTest.getRow();
                } 
                
                assertEquals(this.columListValid.size(), rowcount);
                
            }catch(SQLException se){
                System.err.println(se.getMessage());
            }
        }
    }
    
    
    
    // invalid column
    @Test
    public void SQLHelperTest_Select_Column_add1Column(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = null;
            try{
                selectTest = SQLHelper.select(conn, this.colum1Test, this.tableNameValid);
                // checks wether the resultset is empty
                assertTrue(selectTest.isBeforeFirst());
            }catch(SQLException se){
                System.err.println(se.getMessage());
            }
        }
    }
    
    // invalid table
    @Test
    public void SQLHelperTest_Select_Table_add1Column(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = null;
            try{
                selectTest = SQLHelper.select(conn, this.colum1Valid, this.tableNameTest);
                // checks wether the resultset is empty
                assertTrue(selectTest.isBeforeFirst());
            }catch(SQLException se){
                System.err.println(se.getMessage());
            }
        }
    }
    
    // invalid column
    @Test
    public void SQLHelperTest_Select_Column_add2Column(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = null;
            try{
                selectTest = SQLHelper.select(conn, this.colum1Test, this.colum2Test, this.tableNameValid);
                // checks wether the resultset is empty
                assertTrue(selectTest.isBeforeFirst());
            }catch(SQLException se){
                System.err.println(se.getMessage());
            }
        }
    }
    
    // invalid table
    @Test
    public void SQLHelperTest_Select_Table_add2Column(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = null;
            try{
                selectTest = SQLHelper.select(conn, this.colum1Valid, this.colum2Valid, this.tableNameTest);
                // checks wether the resultset is empty
                assertTrue(selectTest.isBeforeFirst());
            }catch(SQLException se){
                System.err.println(se.getMessage());
            }
        }
    }
    
    // invalid column
    @Test
    public void SQLHelperTest_Select_Column_add3Column(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = null;
            try{
                selectTest = SQLHelper.select(conn, this.colum1Test, this.colum2Test, this.colum3Test, this.tableNameValid);
                // checks wether the resultset is empty
                assertTrue(selectTest.isBeforeFirst());
            }catch(SQLException se){
                System.err.println(se.getMessage());
            }
        }
    }
    
    // invalid table
    @Test
    public void SQLHelperTest_Select_Table_add3Column(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = null;
            try{
                selectTest = SQLHelper.select(conn, this.colum1Valid, this.colum2Valid, this.colum3Valid, this.tableNameTest);
                // checks wether the resultset is empty
                assertTrue(selectTest.isBeforeFirst());
            }catch(SQLException se){
                System.err.println(se.getMessage());
            }
        }
    }
    
    
    // invalid column
    @Test
    public void SQLHelperTest_TrySelect_Column_add1Column(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = SQLHelper.trySelect(conn, this.colum1Test, this.tableNameValid);
            assertNull(selectTest);
        }
    }
    
    // invalid table
    @Test
    public void SQLHelperTest_TrySelect_Table_add1Column(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = SQLHelper.trySelect(conn, this.colum1Valid, this.tableNameTest);
            assertNull(selectTest);
        }
    }
    
    // invalid column
    @Test
    public void SQLHelperTest_TrySelect_Column_add2Column(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = SQLHelper.trySelect(conn, this.colum1Test, this.colum2Test, this.tableNameValid);
            assertNull(selectTest);
        }
    }
    
    // invalid table
    @Test
    public void SQLHelperTest_TrySelect_Table_add2Column(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = SQLHelper.trySelect(conn, this.colum1Valid, this.colum2Valid, this.tableNameTest);
            assertNull(selectTest);
        }
    }
    
    // invalid column
    @Test
    public void SQLHelperTest_TrySelect_Column_add3Column(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = SQLHelper.trySelect(conn, this.colum1Test, this.colum2Test, this.colum3Test, this.tableNameValid);
            assertNull(selectTest);                
        }
    }
    
    // invalid table
    @Test
    public void SQLHelperTest_TrySelect_Table_add3Column(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = SQLHelper.trySelect(conn, this.colum1Valid, this.colum2Valid, this.colum3Valid, this.tableNameTest);
            assertNull(selectTest);
        }
    }
    
    
    // invalid table name
    @Test
    public void SQLHelperTest_SelectAll_Table(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = null;
            try{
                selectTest = SQLHelper.selectAll(conn, this.tableNameTest);
                // checks wether the resultset is empty
                assertTrue(selectTest.isBeforeFirst());
            }catch(SQLException se){
                System.err.println(se.getMessage());
            }
        }
    }
  
    // invalid table name
    @Test
    public void SQLHelperTest_TrySelectAll_Table(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = SQLHelper.trySelectAll(conn, this.tableNameTest);
            assertNull(selectTest);
        }
    }
    
    // invalid table name
    @Test
    public void SQLHelperTest_SelectAll_Table_Where(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = null;
            try{
                selectTest = SQLHelper.selectAll(conn, this.tableNameTest, this.whereStringTest);
                // checks wether the resultset is empty
                assertTrue(selectTest.isBeforeFirst());
            }catch(SQLException se){
                System.err.println(se.getMessage());
            }
        }
    }
    
    // invalid table name
    @Test
    public void SQLHelperTest_DropTable_Table(){
        for(Connection conn : fedConnection.getConn()){
            ResultSet selectTest = null;
            try{
                SQLHelper.dropTable(conn, this.tableNameValid);
                selectTest = SQLHelper.select(conn, this.colum1Valid, this.tableNameValid);
                // checks wether the resultset is empty
                assertTrue(selectTest.isBeforeFirst());
                fillDataBase();
            }catch(SQLException se){
                System.err.println(se.getMessage());
            }
        }
    }
    
    // invalid table name
    @Test
    public void SQLHelperTest_TryDropTable_Table(){
        for(Connection conn : fedConnection.getConn()){
            assertFalse(SQLHelper.tryDropTable(conn, this.tableNameTest));
            fillDataBase();
        }
    }
    
    
    // invalid table name
    @Test
    public void SQLHelperTest_CreateTable_Table(){
        for(Connection conn : fedConnection.getConn()){
            try{
                SQLHelper.createTable(conn, this.createtableNameValid, this.createColumnsDefinition);
                ResultSet createResult = SQLHelper.select(conn, columListValid, this.createtableNameValid);
                assertFalse(createResult.isBeforeFirst());
                SQLHelper.dropTable(conn, this.createtableNameValid);
            }catch(SQLException se){
                System.err.println(se.getMessage());
            }
        }
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
