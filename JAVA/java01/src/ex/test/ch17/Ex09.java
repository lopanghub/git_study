package ex.test.ch17;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex09 {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(7001);
			
			while(true) {
				Socket client = ss.accept(); // 소켓 like 전구소켓 한번에 하나씩 대량으로 사용하면 느려질수 있음 
				InputStream is = client.getInputStream();//클라이언트의 인풋스트림 꺼내기
				ObjectInputStream ois = new ObjectInputStream(is);
				String cip = client.getInetAddress()+""; //클라이언트의 아이피
				System.out.println(cip+"==>>"+ois.readObject());
				
				System.out.println(ois.readObject());
				ois.close();
				client.close();
			}
		} catch(Exception e) {
			
		}
	}
}
