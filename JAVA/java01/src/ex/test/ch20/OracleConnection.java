package ex.test.ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {
	public static Connection getOracle() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String user = "scott", pws = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";// 호스트:포트:sid
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
