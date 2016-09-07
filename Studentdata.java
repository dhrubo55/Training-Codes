import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Studentdata {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/db1", "root", "");
			if (con != null) {
				System.out.println("connection succesful");
			} else {
				System.err.println("connection error");
			}

			Statement st = con.createStatement();
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Roll");
			int roll = sc.nextInt();
			
			System.out.println("Enter name");
			String name = sc.next();
			
			System.out.println("Enter Department");
			String subject= sc.next();
			
			System.out.println("Enter date in dd-mm-yyyy ");
			SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");			
			String date1 = sc.next();
			Date d1;
			java.sql.Date d2 = null;
			try {
				d1 = sdf.parse(date1);
				d2 = new java.sql.Date(d1.getTime());
			} catch (ParseException e) {
				System.out.println("date is not dd-mm-yyyy format");
			}
			
			int x =st.executeUpdate("insert into studentinfo values("+roll+",'"+name+"','"+subject+"','"+d2+"')");
			if(x==1)
			{
				System.out.println("Record added");
			}
			ResultSet rs = st.executeQuery("select * from studentinfo");
			
			
			
			//while(rs.next())
			rs.afterLast();
			while(rs.previous())
			System.out.println("For roll no "+rs.getInt(1) + "\t" + rs.getString(2) + "\t"
					+ rs.getString("Dept") + "\t" + rs.getDate(4) + "\t"
					);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}