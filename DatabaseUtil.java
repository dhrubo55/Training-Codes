import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseUtil {

	static Connection con;
	
	public static Connection retrieveConnection()
	    throws ClassNotFoundException, SQLException{
	    	if(con==null)
	    	{
	    		Class.forName("com.mysql.jdbc.Driver");
	    		con = DriverManager.getConnection(
						"jdbc:mysql://localhost/db1", "root", "");
	    	}
		return con;
		
	}
}
