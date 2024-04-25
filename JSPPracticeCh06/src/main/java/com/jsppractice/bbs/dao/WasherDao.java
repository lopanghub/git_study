package com.jsppractice.bbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.jsppractice.bbs.vo.Washer;

public class WasherDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private DataSource ds;
	
	public WasherDao() {
		
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			ds= (DataSource) envContext.lookup("jdbc/bbsDBPool");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// no의 게시글 읽어오기
	public Washer getWasher(int no) {
		String sqlGet = "select * from washer where no =?";
		Washer washer = null;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sqlGet);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
						
			if(rs.next()) {
				washer = new Washer();
				washer.setNo(rs.getInt("no"));
				washer.setName(rs.getString("name"));
				washer.setPrice(rs.getInt("price"));
				washer.setManufacturer(rs.getString("mau"));
				washer.setProductCode(rs.getString("p_code"));
				washer.setFunction(rs.getString("function"));
				
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null)conn.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return washer;
	}
	
	// washerList에 넣을 메서
	public List<Washer> washerList(){
		String sqlWasherList ="select * from washer";
		List<Washer> washerList = null;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sqlWasherList);
			rs = pstmt.executeQuery();
			
			washerList = new ArrayList<Washer>();
			
			while(rs.next()) {
				Washer washer = new Washer();
				washer.setNo(rs.getInt("no"));
				washer.setName(rs.getString("name"));
				washer.setPrice(rs.getInt("price"));
				washer.setManufacturer(rs.getString("mau"));
				washer.setProductCode(rs.getString("p_code"));
				washer.setFunction(rs.getString("function"));
				
				washerList.add(washer);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null)conn.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return washerList;
	}//end washerList
}