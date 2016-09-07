import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class studentdata2 {
	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			//Connection con = DriverManager.getConnection(
					//"jdbc:mysql://localhost/db1", "root", "");
			Connection con = DatabaseUtil.retrieveConnection();
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
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");			
			String date1 = sc.next();
			Date d1;
			java.sql.Date d2 = null;
			try {
				d1 = sdf.parse(date1);
				d2 = new java.sql.Date(d1.getTime());
			} catch (ParseException e) {
				System.out.println("date is not dd-mm-yyyy format");
			}
			
			java.sql.PreparedStatement pst = con.prepareStatement("insert into studentinfo values(?,?,?,?)");
			pst.setInt(1, roll);
			pst.setString(2, name);
			pst.setString(3, subject);
			pst.setDate(4, d2);
			
			int x =pst.executeUpdate("insert into studentinfo values("+roll+",'"+name+"','"+subject+"','"+d2+"')");
			if(x==1)
			{
				System.out.println("Record added");
			}
			ResultSet rs = st.executeQuery("select * from studentinfo");
			
			
			
			//while(rs.next())
			ResultSetMetaData metaData =rs.getMetaData();
			
			for(int i=1; i<= metaData.getColumnCount(); i++)
			{
				System.out.println(metaData.getColumnName(i)+"\t");
			}
			System.out.println();
			
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