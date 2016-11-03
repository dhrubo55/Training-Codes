import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Transaction {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = DatabaseUtil.retrieveConnection();
		Scanner  k = new Scanner(System.in);
		
		PreparedStatement pst  =  con.prepareStatement("insert into student values(?,?,?,?)");
		System.out.println("Enter Roll");
		pst.setInt(1, k.nextInt());
		
		System.out.println("Enter Name");
		pst.setString(2, k.next());
		
		System.out.println("Enter Subject");
		pst.setString(3, k.next());
		
		System.out.println("Enter date in dd-mm-yyyy ");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");			
		String date1 = k.next();
		Date d1;
		java.sql.Date d2 = null;
		try {
			d1 = sdf.parse(date1);
			d2 = new java.sql.Date(d1.getTime());
		} catch (ParseException e) {
			System.out.println("date is not dd-mm-yyyy format");
		}
	}
}
