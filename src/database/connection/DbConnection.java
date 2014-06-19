package database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nikos
 */
public class DbConnection {

    /*
    private static final String DB_URL = "";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "nikos";
    */
    
    private static final String db_user= "root";
    private static final String db_pass= "a7777777";
    private static final String url = "jdbc:mysql://localhost:3306/mysql";
    private Connection con;    
    
    
    //constructor :
    public DbConnection(){        
        
    }
    
    
    public Connection getConn(){        
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
	} 
        catch(java.lang.ClassNotFoundException e) 
        {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
	}
 	try 
        {
            con = DriverManager.getConnection(url, db_user, db_pass);
	} 
        catch(SQLException ex) 
        {
            System.err.println("SQLException: " + ex.getMessage() + "     DBConnection.getConn");
	}
	return con;
    }
    
    
    
    
    
    
    
    
    
}//DbConnection.
