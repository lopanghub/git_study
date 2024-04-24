package com.jspstudy.ch06.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspstudy.ch06.vo.Board;

@WebServlet("/boardList01")
public class BoardListController01 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = "scott";
		String pass = "tiger";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.228:1521:orcl";
		// String url = "jdbc:oracle:thin:@localhost:1521:orcl";

		// JDBC DB 프로그램에 필요한 객체
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<Board> bList = null;

		try {
			// 1. 접속 드라이버 로딩
			Class.forName(driver);

			// 2. DB에 연결
			conn = DriverManager.getConnection(url, user, pass);

			// 3. DB에 sql 쿼리를 발행해 주는 객체 -
			pstmt = conn.prepareStatement("SELECT * FROM jspbbs ORDER BY no DESC");

			// 4. DB에 쿼리를 발행하고 테이블에서 조회한 결과 집합을 받는다.
			rs = pstmt.executeQuery();

			bList = new ArrayList<>();

			while (rs.next()) {
				// 한 행씩 데이터를 추출해서 Board 객체 담고 List에 담는다.
				Board b = new Board();
				b.setNo(rs.getInt(1));
				b.setTitle(rs.getString("title"));
				b.setWriter(rs.getString("writer"));
				b.setRegDate(rs.getTimestamp("reg_date"));
				b.setReadCount(rs.getInt("read_count"));
				b.setFile1(rs.getString("file1"));

				bList.add(b);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				// DB 작업에 사용한 자원을 해제 - 앞에서 가져온 역순으로 닫는다.
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		request.setAttribute("bList", bList);

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/board/boardList01.jsp");
		rd.forward(request, response);
	}
}
