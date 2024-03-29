package ex.test.ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("id입력:");
		String id = scan.nextLine();
		System.out.println("pw입력:");
		String pw = scan.nextLine();
		System.out.println("age입력:");
		int age = scan.nextInt();
		
		Connection conn = OracleConnection.getOracle();
		
		String query ="update member set age=? where id=? and pw=?";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setString(2, id);
		pstmt.setString(3, pw);
		pstmt.setInt(1, age);
		
		int result = pstmt.executeUpdate();
		System.out.println(result);
		
		try {
			pstmt.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
