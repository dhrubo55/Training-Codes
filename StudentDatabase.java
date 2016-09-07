import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JTable;

public class StudentDatabase extends JFrame {

	Statement st;
	ResultSet rs;
	Connection con;
	ResultSetMetaData metaData;
	JTable jt;
	Object data[][];
	Object column[];

	void studentdata(Connection con) throws SQLException {
		st = con.createStatement();
		rs = st.executeQuery("Select count(*) from studentinfo");

		rs.next();
		int rowCount = rs.getInt(1);

		rs = st.executeQuery("select * from studentinfo");
		metaData = rs.getMetaData();
		int c = metaData.getColumnCount();
		column = new Object[c];
		int p1 = 0;
		data = new Object[rowCount][c];
		for (int i = 1; i <= c; i++) {
			column[p1++] = metaData.getColumnName(i);
		}

		int row = 0;
		int col = 0;
		System.out.println(" c is " + c);
		while (rs.next()) {
			col = 0;
			int p = 1;
			for (int i = 0; i < c; i++) {
				data[row][col] = rs.getString(p++);
				col++;
			}
			System.out.println("col " + col);
			row++;
		}
		System.out.println(row);
	}

	public StudentDatabase() throws ClassNotFoundException, SQLException {
		con = DatabaseUtil.retrieveConnection();
		studentdata(con);
		jt = new JTable(data, column);

		add(jt);
		setVisible(true);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		new StudentDatabase();
	}

}
