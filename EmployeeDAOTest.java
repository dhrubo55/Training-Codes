import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDAOTest {

	Connection con;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	
	EmployeDAO emp;
	List<EmployeDAO> elist;
	
	public EmployeeDAOTest() throws ClassNotFoundException, SQLException
	{
		con = DatabaseUtil.retrieveConnection();
	}
	
	public List<EmployeDAO> showAllEmployee() throws SQLException
	{
		elist = new ArrayList<EmployeDAO>();
		st = con.createStatement();
		rs = st.executeQuery("select * from Studentinfo");
		
		while (rs.next()) {
			emp = new EmployeDAO();
			emp.setId(rs.getInt(1));
			emp.setLocation(rs.getString(2));
			//emp.set
			
		}
		
		return null;
		
	}
}
