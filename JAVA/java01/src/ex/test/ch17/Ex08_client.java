package ex.test.ch17;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class Ex08_client {
	public static void main(String[] args) {
		String ip="192.168.0.56";
		int port=7000;
		
		try {
			Socket client = new Socket(ip, port);
			//서버에 접속- 서버측의 accept() 실행
			
			InputStream is = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			Object obj = ois.readObject();
			System.out.println(obj);
			ois.close();
			client.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
