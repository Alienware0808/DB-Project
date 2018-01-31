package FederalDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ResultSetManagment.FedResultSet;
import java.util.List;
import parser.*;
import parser.AnalysedStatements.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;


public class FedStatement implements FedStatementInterface {
    private Connection con[] = new Connection[3];
    
    public FedStatement(Connection conn[])
        {             
             this.con=conn;
        }
    
    
    
        @Override
	public int executeUpdate(String sql) throws FedException {
              
             Statement[] statements;
            try {
                statements = SQLStatement.parseString(sql);
            } catch (Exception ex) {
                Logger.getLogger(FedStatement.class.getName()).log(Level.SEVERE, null, ex);
                throw new FedException(ex);
            }
            if(statements.length != 1)
                throw new FedException(new Exception("Only single Statements are valid for the update"));
            if(statements[0] instanceof LazyPreparedStatement)
            {
                LazyPreparedStatement lstmt = (LazyPreparedStatement)statements[0];
                
                switch (lstmt.statementType) {
                    case DROP:
                        for(int i=0; i<3;i++)
                        {
                            try {
                                PreparedStatement statement= con[i].prepareStatement(sql);
                                statement.executeUpdate();
                            } catch (Exception ex) {
                                //Logger.getLogger(FedStatement.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                    default:
                        throw new FedException(new Exception("Wrong type of statement for update"));
                }
            }
            else if(statements[0] instanceof CreateStatement)
            {
                CreateStatement createstmt = (CreateStatement)statements[0];
                if(createstmt.fedStatement instanceof CreateStatement.FedHorizontal)
                {
                    CreateStatement.FedHorizontal hori = (CreateStatement.FedHorizontal)createstmt.fedStatement;
                    if(MetaData.MetaDataManager.MetaManager.getMetaData(createstmt.tableName) == null)
                    {
                        List<Object> intervalls = hori.getIntervall();
                        switch(intervalls.size())
                        {
                            case 2: 
                            {
                                String createsql = "create table " + createstmt.tableName + " (";
                                for(int i = 0; i < createstmt.columnDefinitions.size(); i++)
                                {
                                    createsql += createstmt.columnDefinitions.get(i).getText();
                                    if(i+1 < createstmt.columnDefinitions.size())
                                        createsql += ", ";
                                }
                                if(createstmt.tableConstrains.size() > 0)
                                    createsql += ", ";
                                for(int i = 0; i < createstmt.tableConstrains.size(); i++)
                                {
                                    if(createstmt.tableConstrains.get(i).getCanBeLocal())
                                    {
                                        createsql += createstmt.tableConstrains.get(i).getText();
                                        if(i+1 < createstmt.tableConstrains.size())
                                            createsql += ", ";
                                    }
                                }
                                for(int i = 0; i < createstmt.tableConstrains.size(); i++)
                                {
                                    if(!createstmt.tableConstrains.get(i).getCanBeLocal())
                                    {
                                        // TOTAL MAYHEM
                                        throw new FedException(new NotImplementedException());
                                    }
                                }
                                createsql += ")";
                                
                            try {
                                PreparedStatement statement = con[0].prepareStatement(createsql);
                                statement.executeUpdate();
                                statement = con[1].prepareStatement(createsql);
                                statement.executeUpdate();
                                statement = con[2].prepareStatement(createsql);
                                statement.executeUpdate();
                            } catch (SQLException ex) {
                                Logger.getLogger(FedStatement.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            }break;
                        }
                    } else throw new FedException(new Exception("Table already exists"));
                }
                if(createstmt.fedStatement instanceof CreateStatement.FedVertical)
                {
                    CreateStatement.FedVertical vert = (CreateStatement.FedVertical)createstmt.fedStatement;
                    
                }else
                {
                    PreparedStatement statement;
                    try {
                        String stmt = createstmt.getText();
                        statement = con[0].prepareStatement(stmt);
                        statement.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(FedStatement.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }
            
            if(sql.startsWith("drop"))
            {
                
            }
           
           return 1;
	}

        @Override
    public FedResultSet executeQuery(String sql) throws FedException {
	return null;
	}

        @Override
    public FedConnection getConnection() throws FedException {
            return null;
	}

        @Override
    public void close() throws FedException {
	
	}
}
