package ex.test.ch17;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex07 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\Global IT\\Desktop\\team-projects\\data.txt");
		DataInputStream dis = new DataInputStream(fis);
		//쓴 순서대로 읽어야 한다
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readChar());
		
		
		dis.close();
		
		
	}
}
