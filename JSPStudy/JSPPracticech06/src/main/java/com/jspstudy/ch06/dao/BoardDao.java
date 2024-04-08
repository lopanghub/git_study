package com.jspstudy.ch06.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.jsppractice.ch06.vo.Board;

public class BoardDao {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private static DataSource ds;
	
	public BoardDao() {
		
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			ds = (DataSource) envContext.lookup("jdbc/bbsDBPool");	
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Board> boardList() {
		String sqlBoardList = "select * from jspbbs order by no desc";
		ArrayList<Board> bList = null;
		try {
		conn = ds.getConnection();
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
