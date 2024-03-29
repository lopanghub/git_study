package ex.practice.Mar29th;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {
	public static Connection getOracle() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String user ="scott", pws="tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, pws);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
