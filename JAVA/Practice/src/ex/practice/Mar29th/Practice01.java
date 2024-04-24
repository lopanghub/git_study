package ex.practice.Mar29th;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("id 입력:");
		String id = scan.nextLine();
		System.out.println("pw 입력:");
		String pw = scan.nextLine();
		System.out.println("age 입력:");
		int age = scan.nextInt();

		Connection conn = OracleConnection.getOracle();

		String query = "insert into member values(?,?,?,sysdate)";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setString(1, id);
		pstmt.setString(2, pw);
		pstmt.setInt(3, age);

		int result = pstmt.executeUpdate();
		System.out.println("결과 " + result);

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
	}
}
