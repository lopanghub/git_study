package ex.test.ch19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex01_1 {
	public static void main(String[] args) throws Exception{
		// 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// DB 연결
		String user = "scott", pw="tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";//호스트:포트:sid
		Connection conn = DriverManager.getConnection(url, user, pw);
		
		// SQL문 작성
		String query = "select * from dept";
		PreparedStatement pstmt =conn.prepareStatement(query);
		
		// SQL문 실행
		ResultSet rs = pstmt.executeQuery();
		
		// select 결과 추출
		while(rs.next()) {
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			System.out.println(deptno+"\t"+dname+"\t"+loc);
		
		}
		// 연결해제
		rs.close();
		pstmt.close();
		conn.close();
	}
}
