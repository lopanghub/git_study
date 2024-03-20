package ex.test.ch17;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Ex09_1 {
	public static void main(String[] args) {
		try {
		Socket client = new Socket("192.168.0.56", 7001); //서버에 접속
		OutputStream os = client.getOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject("my name");
		oos.close();
		client.close();
		
		} catch(Exception e) {
			
		}
		
	}
}
