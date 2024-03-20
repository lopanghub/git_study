package ex.test.ch17;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Ex08 {
	public static void main(String[] args) {
		// 타임서버
		int port=7000; //0~65,535
		try { //192.168.0.56:7000  -- 소켓서버 생성
			ServerSocket ss = new ServerSocket(port);
			while(true) {
				Socket client = ss.accept();//클라이언트가 접속하도록 기다리는 역할
				OutputStream os = client.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				//System.out.println(client.getInetAddress());
				oos.writeObject(new Date());
				oos.flush();
				oos.close();
				client.close();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
