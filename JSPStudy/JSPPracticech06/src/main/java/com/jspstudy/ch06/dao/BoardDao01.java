package com.jspstudy.ch06.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.jsppractice.ch06.vo.Board;

public class BoardDao01 {
	private static final String USER = "scott";
	private static final String PASS = "1234";
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	public BoardDao01() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Board> boardList() {
		String sqlBoardList = "select * from jspbbs order by no desc";
		ArrayList<Board> bList = null;
		try {
		conn = DriverManager.getConnection(URL, USER, PASS);
		pstmt = conn.prepareStatement(sqlBoardList);
		rs = pstmt.executeQuery();
		bList = new ArrayList<>();
		
			while (rs.next()) {
				Board b = new Board();
				b.setNo(rs.getInt(1));
				b.setTitle(rs.getString("title"));
				b.setWriter(rs.getString(3));
				b.setRegDate(rs.getTimestamp("reg_date"));
				b.setReadCount(rs.getInt("read_count"));
	
				bList.add(b);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return bList;
	} //end boardList();
}
