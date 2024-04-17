package com.jspstudy.bbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.jspstudy.bbs.vo.Board;

//DBCP를 활용한 DAO(Data Access Object) 클래스
public class BoardDao {
	
	// 데이터베이스 작업에 필요한 객체 타입으로 변수를 선언	
	// Connection 객체는 DB에 연결해 작업을 수행할 수 있도록 지원하는 객체
	private Connection conn;
	
	// Statement, PreparedStatement 객체는 DB에 쿼리를 발행하는 객체
	private PreparedStatement pstmt;
	
	// ResultSet 객체는 DB에 SELECT 쿼리를 발행한 결과를 저장하는 객체
	private ResultSet rs;
	
	/* DataSource 객체는 데이터 원본과 연결할 수 있도록 지원하는 객체
	 * JNDI 방식으로 DBCP를 찾아 DBCP에서 Connection 객체를 대여하는 객체 
	 **/
	private static DataSource ds;
	
	/* 기본 생성자가 호출될 때 마다 ConnectionPool에 접근해  Connection 객체를
	 * 얻어 올 수 있는 DataSource 객체를 생성한다.
	 **/
	public BoardDao() {	 
		try {			
			/* 1. 자바 네이밍 서비스를 사용하기 위해 
			 * javax.naming 패키지의 InitialContext 객체를 생성한다.
			 **/ 
			Context initContext = new InitialContext();
			
			/* 2. InitialContext 객체를 이용해 디렉토리 서비스에서 필요한 객체를
			 * 찾기 위해 기본 네임스페이스를 인자로 지정해 Context 객체를 얻는다.
			 *
			 * 디렉토리 서비스에서 필요한 객체를 찾기 위한 일종의 URL 개념으로 
			 * 디렉토리 방식을 사용하므로 java:comp/env와 같이 지정한다.
			 **/
			Context envContext = (Context) initContext.lookup("java:/comp/env");

			/* 3. "jdbc/bbsDBPool"이라는 이름을 가진 DBCP에 접근하기 위한
			 * DataSource 객체를 얻는다.
			 *
			 * context.xml 파일에서 지정한 수의 커넥션을 생성해 커넥션 풀에 저장한다.
			 * "java:/comp/env"는 JNDI에서 기본적으로 사용하는 네임스페이스 이고 
			 * "jdbc/bbsDBPool"은 DBCP 이름으로 임의로 지정하여 사용할 수 있다.
			 * 
			 * BoardDao 클래스가 사용되면 클래스 정보가 메모리에 로딩되면서
			 * new 연산자에 의해서 BoardDao 클래스의 인스턴스가 생성된다.
			 * 그리고 이 생성자가 호출되면서 DBCP를 찾는 코드가 실행되고 DBCP에 
			 * 접근해 Connection 객체를 대여할 수 있는 DataSource 객체를 구한다.
			 **/
			ds = (DataSource) envContext.lookup("jdbc/bbsDBPool");
			
		} catch(NamingException e) {			
			System.out.println("BoardDao() : NamingException");
			e.printStackTrace();			
		} 
	}	
		
	/* 검색어에 해당하는 게시 글 수를 계산하기 위해 호출되는 메서드
	 * DB 테이블에서 해당 검색어가 포함된 게시 글의 수를 반환하는 메서드
	 **/
	public int getBoardCount(String type, String keyword) {
		System.out.println(type + " - " + keyword);
		
		/* 이 부분에서 우리는 SQL 쿼리를 작성하는데 주의를 기울여야 한다.
		 * 검색 옵션에 따라서 검색하는 컬럼이 다르기 때문에 파라미터로 받은 type을 
		 * 아래와 같이 쿼리의 파라미터(?)로 지정해 검색 옵션의 변경에 따라 동적으로
		 * 다른 쿼리가 발행되게 하고 싶지만 이 방법은 제대로 동작하지 못한다. 
		 * 
		 * "SELECT COUNT(*) FROM jspbbs WHERE ? LIKE '%' || ? || '%'"
		 * 
		 * 
		 * PreparedStatement는 기준이 되는 SQL 쿼리를 캐싱하기 때문에
		 * 이 객체를 Connection 객체로부터 받아 올 때 기준 쿼리를 인수로 지정하는데
		 * 이 때 WHERE에 검색 대상이 되는 컬럼명을 파라미터로(?) 지정하게 되면
		 * 쿼리가 캐싱될 때 검색 대상이 되는 컬럼이 지정되지 못하게 되므로 이 쿼리의
		 * 검색 결과는 항상 0이 된다.
		 * 
		 * 기준 쿼리에서 사용되는 컬럼은 PreparedStatement 객체를 생성할 때
		 * 정해져 있어야하기 때문에 아래와 같이 type을 지정하면 된다.
		 **/		
		String sqlCount = "SELECT COUNT(*) FROM jspbbs WHERE " 	
					+ type + " LIKE '%' || ? || '%'";
		//String sqlCount = 
		//	"SELECT COUNT(*) FROM jspbbs WHERE " + type + " LIKE ?";
		int count = 0;
		
		try{			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sqlCount);
			pstmt.setString(1,  keyword);			
			//pstmt.setString(1,  "%" + keyword + "%");
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}			
		} catch(Exception e) {			
			e.printStackTrace();
		} finally {			
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
			} catch(SQLException se) {}
		}
		return count;
		
	} // end getBoardCount(String type, String keyword);


	/* 제목, 작성자, 내용에서 검색어가 포함된 게시 글 검색 시 호출되는 메서드
	 * 요청한 페이지에 해당하는 검색 결과를 DB에서 읽어와 반환하는 메서드
	 **/
	public ArrayList<Board> searchList(
			String type, String keyword, int startRow, int endRow) {
		
		/* 검색어가 포함된 게시 글 리스트를 추출하기 위한 쿼리
		 * 테이블에서 현재 페이지에 해당하는 게시 글을 검색할 때 ROWNUM을 사용했다.
		 * ROWNUM은 쿼리의 결과로 검색되는 행들의 순서 값을 가진 의사컬럼으로
		 * 1부터 시작한다. 최신 게시 글을 먼저 보여주기 위해 ORDER BY DESC를 
		 * 지정하고 요청된 페이지에 보여줄 게시 글의 시작 행과 마지막 행을 지정한다.
		 *  
		 * 아래의 쿼리로 질의하게 되면 게시 글 전체를 글 번호에 해당하는 no를 기준으로
		 * 내림차순 정렬하여 검색하고 WHERE 절에 지정한 첫 번째 Placeholder(?)에
		 * 해당하는 시작 행부터 두 번째 Placeholder(?)에 해당하는 마지막 행까지의
		 * 게시 글을 추출할 수 있다.
		 **/		
		String sqlSearchList = "SELECT * FROM (SELECT ROWNUM num, no, title,"
			    + " writer, content, reg_date, read_count, pass, file1 FROM"
				+ " (SELECT * FROM jspbbs WHERE " + type + " LIKE ?"
				+ " ORDER BY no DESC)) WHERE num >= ? AND num <= ?";
		
		ArrayList<Board> boardList = null;
		
		try{			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sqlSearchList);			
			pstmt.setString(1, "%" + keyword + "%");
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				boardList = new ArrayList<Board>();
				
				do {					
					Board board = new Board();
					board.setNo(rs.getInt("no"));
					board.setTitle(rs.getString("title"));
					board.setWriter(rs.getString("writer"));
					board.setContent(rs.getString("content"));												
					board.setRegDate(rs.getTimestamp("reg_date"));
					board.setReadCount(rs.getInt("read_count"));
					board.setPass(rs.getString("pass"));
					board.setFile1(rs.getString("file1"));
					
					boardList.add(board);
					
				} while(rs.next());
			}
		} catch(Exception e) {			
			e.printStackTrace();
			
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(SQLException se) {}
		}
		return boardList;
		
	} // end searchList(String type, String keyword, int startRow, int endRow);
	
	
	/* 전체 게시 글 수를 계산하기 위해 호출되는 메서드 - paging 처리에 사용
	 * DB 테이블에 등록된 모든 게시 글의 수를 반환하는 메서드
	 **/
	public int getBoardCount() {
		
		String sqlCount = "SELECT COUNT(*) FROM jspbbs";
		int count = 0;
		
		try{			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sqlCount);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				count = rs.getInt(1);
			}			
		} catch(Exception e) {			
			e.printStackTrace();
		} finally {			
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
			} catch(SQLException se) {}
		}
		return count;
		
	} // end getBoardCount();
	

	/* 한 페이지에 보여 질 게시 글 리스트 요청시 호출되는 메소드
	 * 요청한 페이지에 해당하는 게시 글 리스트를 DB에서 읽어와 반환하는 메소드
	 **/
	public ArrayList<Board> boardList(int startRow, int endRow) {
		
		/* 요청한 페이지에 해당하는 게시 글 리스트를 추출하기 위한 쿼리
		 * 테이블에서 현재 페이지에 해당하는 게시 글을 검색할 때 ROWNUM을 사용했다.
		 * ROWNUM은 쿼리의 결과로 검색되는 행들의 순서 값을 가진 의사컬럼으로
		 * 1부터 시작한다. 최신 게시 글을 먼저 보여주기 위해 ORDER BY DESC를 
		 * 지정하고 요청된 페이지에 보여줄 게시 글의 시작 행과 마지막 행을 지정한다.
		 *  
		 * 아래의 쿼리로 질의하게 되면 게시 글 전체를 글 번호에 해당하는 no를 기준으로
		 * 내림차순 정렬하여 검색하고 WHERE 절에 지정한 첫 번째 Placeholder(?)에
		 * 해당하는 시작 행 부터 두 번째 Placeholder(?)에 해당하는 마지막 행까지의
		 * 게시 글을 추출할 수 있다.
		 **/		
		String sqlBoardList = "SELECT * FROM (SELECT ROWNUM num,"
				+ " no, title, writer, content, reg_date, read_count, pass, file1 FROM"
				+ " (SELECT * FROM jspbbs ORDER BY no DESC)) "
				+ " WHERE num >= ? AND num <= ?";
		
		ArrayList<Board> boardList = null;
		
		try{			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sqlBoardList);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				boardList = new ArrayList<Board>();
				
				do {					
					Board board = new Board();
					board.setNo(rs.getInt("no"));
					board.setTitle(rs.getString("title"));
					board.setWriter(rs.getString("writer"));
					board.setContent(rs.getString("content"));												
					board.setRegDate(rs.getTimestamp("reg_date"));
					board.setReadCount(rs.getInt("read_count"));
					board.setPass(rs.getString("pass"));
					board.setFile1(rs.getString("file1"));
					
					boardList.add(board);
					
				} while(rs.next());
			}
		} catch(Exception e) {			
			e.printStackTrace();
			
		} finally {			
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(SQLException se) {}
		}
		return boardList;
	}
	

	/* 게시 글 내용 보기 요청 시 호출되는 메서드
	 * no에 해당하는 게시 글 을 DB에서 읽어와 Board 객체로 반환하는 메서드 
	 **/
	public Board getBoard(int no) {
		String sqlBoard = "SELECT * FROM jspbbs WHERE no=?";
		Board board = null;
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sqlBoard);
			pstmt.setInt(1,  no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board = new Board();
				
				board.setNo(rs.getInt("no"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));				
				board.setRegDate(rs.getTimestamp("reg_date"));
				board.setReadCount(rs.getInt("read_count"));
				board.setPass(rs.getString("pass"));
				board.setFile1(rs.getString("file1"));
			}			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(SQLException e) {}
		}
		return board;
	}	
	
	
	/* 게시 글쓰기 요청시 호출되는 메서드
	 * 게시 글을 작성하고 등록하기 버튼을 클릭하면 게시 글을 DB에 추가하는 메서드 
	 **/
	public void insertBoard(Board board) {
		
		String sqlInsert = "INSERT INTO jspbbs(no, title, writer, content,"
				+ " reg_date, read_count, pass, file1) "
				+ " VALUES(jspbbs_seq.NEXTVAL, ?, ?, ?, SYSDATE, 0, ?, ?)";
		
		try {			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sqlInsert);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());			
			pstmt.setString(3, board.getContent());
			pstmt.setString(4, board.getPass());
			pstmt.setString(5, board.getFile1());
			pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();			
		} finally {			
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
			} catch(SQLException se) {}
		}
	}
	
	
	/* 게시 글 수정, 게시 글 삭제 시 비밀번호 입력을 체크하는 메서드
	 **/
	public boolean isPassCheck(int no, String pass) {
		boolean isPass = false;
		String sqlPass = "SELECT pass FROM jspbbs WHERE no=?";
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sqlPass);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				isPass = rs.getString(1).equals(pass); 
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch(SQLException e) {}
		} 
		return isPass;
	}	
	
	
	/* 게시 글 수정 요청시 호출되는 메서드
	 * no에 해당하는 게시 글을 DB에서 수정하는 메서드 
	 **/
	public void updateBoard(Board board) {
		/* 파일이 업로드 되었을 때와 그렇지 않을 때를 동적 쿼리로 작성
		 * 기존의 쿼리는 파일이 업로드 되면 업로드된 파일 이름으로 변경할 수 있지만
		 * 업로드 되지 않는 경우에는 파일 이름이 null로 입력되는 쿼리이므로 업로드 
		 * 되었을 때와 그렇지 않을 때에 따라서 쿼리가 동적으로 변경되도록 작성해야 함  
		 **/
		String fileUpdate = board.getFile1() != null ? ", file1=?" : "";
		String sqlUpdate = "UPDATE jspbbs set title=?, writer=?, content=?,"				
				+ " reg_date=SYSDATE" + fileUpdate + " WHERE no=?";
		
		try {			
			conn = ds.getConnection();			
			pstmt = conn.prepareStatement(sqlUpdate);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());			
			pstmt.setString(3, board.getContent());

			// 파일이 업로되었을 때와 그렇지 않을 때를 구분해서 처리
			if(board.getFile1() != null) {
				pstmt.setString(4, board.getFile1());
				pstmt.setInt(5, board.getNo());
			} else {
				pstmt.setInt(4,  board.getNo());
			}
			
			pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();			
		} finally {			
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
			} catch(SQLException se) {}
		}
	}
	
	
	/* 게시 글 삭제 요청 시 호출되는 메서드 
	 * no에 해당 하는 게시 글을 DB에서 삭제하는 메서드 
	 **/
	public void deleteBoard(int no) {
		
		String sqlDelete = "DELETE FROM jspbbs WHERE no=?"; 
		try {			
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sqlDelete);
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();			
		} finally {			
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
			} catch(SQLException se) {}
		}
	}
}






