package ex.test.ch20;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ChatDB {
	public static void chatInsert(String msg) throws Exception{
		//msg --> [강사]aaa
		//msg --> #고원님이 나가셨습니다.
		char index0 = msg.charAt(0);
		if(index0=='[') {
			String id = msg.substring(1, msg.indexOf(']'));
			String message = msg.substring(msg.indexOf(']')+1);
			
			Connection conn = OracleConnection.getOracle();
			
			String query = "insert into chatting values(chatting_seq.nextval,?,?,sysdate)";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1,id);
			pstmt.setString(2, message);
			
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
		}
		
		
	}
}
