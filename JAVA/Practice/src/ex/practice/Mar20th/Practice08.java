package ex.practice.Mar20th;

import java.net.ServerSocket;

public class Practice08 {
	public static void main(String[] args) {
		int port=7000;
		try {
			ServerSocket ss =new ServerSocket(port);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
