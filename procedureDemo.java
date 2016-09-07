import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class procedureDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Scanner  k = new Scanner(System.in);
		Connection con = DatabaseUtil.retrieveConnection();
		Statement st = con.createStatement();
		//CallableStatement cst = con.prepareCall("{call stud_record()}");
		CallableStatement cst = con.prepareCall("{call stud_search(?)}");
		cst.setInt(1, k.nextInt());
		ResultSet rs = cst.executeQuery();
		
//		while(rs.next())
//		{
//			System.out.println("For roll no "+rs.getInt(1) + "\t" + rs.getString(2) + "\t"
//					+ rs.getString("Dept") + "\t" + rs.getDate(4) + "\t"
//					);
//		}
		
		if(rs.next())
		{
			System.out.println("For roll no "+rs.getInt(1) + "\t" + rs.getString(2) + "\t"
					+ rs.getString("Dept") + "\t" + rs.getDate(4) + "\t"
					);
		}
		else
		{
			System.out.println("Record not found");
		}
 	}

}
