package com.jspstduy.ch06.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.jspstudy.ch06.vo.Board;

public class BoardDao {

	// JDBC DB 프로그램에 필요한 객체
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private DataSource ds;

	public BoardDao() {
		try {
			// JNDI DBCP 사용하기 위한 기준 객체 생성
			Context initContext = new InitialContext();

			// java:/comp/env/ 아래에서 우리가 만든 이름
			Context envContext = (Context) initContext.lookup("java:/comp/env");

			ds = (DataSource) envContext.lookup("jdbc/bbsDBPool");
		} catch (NamingException e) {

			e.printStackTrace();
		}
	}

	// 게시 글 수정, 삭제에서 비밀 번호를 체크해주는 메서드 - 비번이 맞으면 true
	public boolean isPassCheck(String pass, int no) {
		boolean isPass = false;

		String sqlPass = "select pass from jspbbs where no=?";

		// DB연결
		try {

			conn = ds.getConnection();
			// SQL 쿼리를 발행해주는 객체
			pstmt = conn.prepareStatement(sqlPass);
			// 필요한값(입력값 placeholder ?)
			pstmt.setInt(1, no);

			// 쿼리를 발행하고 결과 집합인 ResultSet 객체를 받음
			rs = pstmt.executeQuery();

			if (rs.next()) {
				isPass = rs.getString(1).equals(pass);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				// DB작업에 사용한 자원을 해제 - 역순 닫기
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

		return isPass;
	}

	// no에 해당하는 게시글을 읽어와 반환하는 메서드
	public Board getBoard(int no) {
		String sqlBoard = "select * from jspbbs where no=?";
		Board board = null;

		// DB연결
		try {

			conn = ds.getConnection();
			// SQL 쿼리를 발행해주는 객체
			pstmt = conn.prepareStatement(sqlBoard);
			// 필요한값(입력값 placeholder ?)
			pstmt.setInt(1, no);

			// 쿼리를 발행하고 결과 집합인 ResultSet 객체를 받음
			rs = pstmt.executeQuery();

			if (rs.next()) {
				board = new Board();
				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegDate(rs.getTimestamp("reg_date"));
				board.setReadCount(rs.getInt("read_count"));
				board.setFile1(rs.getString("file1"));
				board.setPass(rs.getString("pass"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				// DB작업에 사용한 자원을 해제 - 역순 닫기
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
		return board;

	}

	// no에 해당하는 게시글 정보를 테이블에서 삭제하는 메서드
	public void deleteBoard(int no) {

		String sqlDelete = "DELETE FROM jspbbs where no=?";

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sqlDelete);
			// pstmt로 필요한 데이터를 설정

			pstmt.setInt(1, no);
			// db에 insert 쿼리를 발행
			pstmt.executeUpdate();

		} catch (SQLException e) {
		} finally {
			try {
				// DB작업에 사용한 자원을 해제 - 역순 닫기
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
	}

	// DB테이블에서 no에 해당하는
	public void updateBoard(Board board) {

		String sqlUpdate = "UPDATE jspbbs set title=?, writer=?, content=?," + " reg_date=SYSDATE, file1=? WHERE no=?";

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sqlUpdate);
			// pstmt로 필요한 데이터를 설정
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getContent());
			pstmt.setString(4, board.getFile1());
			pstmt.setInt(5, board.getNo());
			// db에 insert 쿼리를 발행
			pstmt.executeUpdate();

		} catch (SQLException e) {
		} finally {
			try {
				// DB작업에 사용한 자원을 해제 - 역순 닫기
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
	}

	// 폼에 입력한 게시글 정보를 DB에 저장하는 메서드
	public void insertBoard(Board board) {

		String sqlInsert = "insert into jspbbs(no, title, writer, content, " + "reg_date, read_count, pass, file1)"
				+ "Values(jspbbs_seq.nextval, ?, ?, ?, sysdate, 0, ?, ?)";

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sqlInsert);
			// pstmt로 필요한 데이터를 설정
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getContent());
			pstmt.setString(4, board.getPass());
			pstmt.setString(5, board.getFile1());

			// db에 insert 쿼리를 발행
			pstmt.executeUpdate();

		} catch (SQLException e) {
		} finally {
			try {
				// DB작업에 사용한 자원을 해제 - 역순 닫기
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
	}

	// 하나한의 기능 - 메서드(함수)
	// DB테이블에서 게시글 리스트를 읽어와서 반환하는 메서드
	public List<Board> boardList() {
		String sqlBoardList = "SELECT *FROM jspbbs Order by no desc";
		List<Board> bList = null;
		try {
			// 2. DB에 연결
			conn = ds.getConnection();

			// 3. DB에 sql 쿼리를 발행해주는 객체 -
			pstmt = conn.prepareStatement(sqlBoardList);

			// 4. DB에 퀴리를 발행하고 테이블에 조회한 결과 집합을 받는다.
			rs = pstmt.executeQuery();
			bList = new ArrayList<>();

			while (rs.next()) {
				// 한 행씩 데이터를 추출해서 Board 객체 담고 List에 담는다
				Board b = new Board();
				b.setNo(rs.getInt(1));
				b.setTitle(rs.getString("title"));
				b.setWriter(rs.getString("writer"));

				b.setRegDate(rs.getTimestamp("reg_date"));
				b.setReadCount(rs.getInt("read_count"));
				b.setFile1(rs.getString("file1"));

				bList.add(b);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// DB작업에 사용한 자원을 해제 - 역순 닫기
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {

			}
		}

		return bList;
	} // end boardList();
}