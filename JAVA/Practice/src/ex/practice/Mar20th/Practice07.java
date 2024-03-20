package ex.practice.Mar20th;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Practice07 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("C:\\Users\\Global IT\\Desktop\\team-projects\\data2.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readChar());
		dis.close();
	}
}
