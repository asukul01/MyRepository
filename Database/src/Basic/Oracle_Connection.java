package Basic;

import java.sql.*;

public class Oracle_Connection {
	public static Connection con;
	public static Statement stmt;

	public static Statement getStatementObject() {
		try {
			// step1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// step2 create the connection object
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Admin_Aritra", "oracle");

			// step3 create the statement object
			stmt = con.createStatement();

			// step4 execute query
			/*
			 * ResultSet rs = stmt.executeQuery("select * from emp"); while
			 * (rs.next()) System.out.println(rs.getInt(1) + "  " +
			 * rs.getString(2) + "  " + rs.getInt(3));
			 */

			// step5 close the connection object

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stmt;

	}

	public static void closeConnection() throws Exception {
		con.close();
	}

}
