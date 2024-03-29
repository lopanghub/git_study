package ex.test.ch19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class Ex01 {
	public static void main(String[] args) throws Exception {
		/*
		 * 1. DB 드라이버 로딩 2. DB 연결 3. SQL문 작성 4. SQL문 실행 5. Select 사용한 경우 추출 6. 연결 해제
		 */

		// 1. 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 2. DB 연결
		String user = "scott", pw = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn = DriverManager.getConnection(url, user, pw);
		System.out.println(conn);

		// 3. SQL문 작성
		String query = "select * from emp";
		PreparedStatement pstmt = conn.prepareStatement(query);// 쿼리문 작성 객체
		// 한번 실행하면 다음부턴 기존의 실행한걸 재활용
		// conn.createStatement(query);
		// 실행시마다 생성

		// 4. SQL문 실행
		ResultSet rs = pstmt.executeQuery(); // DQL - select
		// int result = pstmt.executeUpdate();// DDL, DML - create, update, delete,
		// insert

		// 5. Select 사용한 경우 결과 추출

		while (rs.next()) {
			int no = rs.getInt("empno"); // empno컬럼의 값을 꺼낸다
			String name = rs.getString("ename");
			Timestamp day = rs.getTimestamp("hiredate");
			System.out.println(no + "\t" + name + "\t" + day);
		}

		// 6. 연결 해제
		try {
			rs.close();// 여기서 예외 발생하면 밑에가 발동 x 각각 예외 처리해야한다
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// dept 테이블 모든 내용 출력
	}
}
