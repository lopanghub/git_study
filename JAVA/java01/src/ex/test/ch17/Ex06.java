package ex.test.ch17;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Global IT\\Desktop\\team-projects\\data.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBoolean(false); // 1
		dos.writeInt(100); // 4
		dos.writeDouble(3.14); //8
		dos.writeChar('A');//2
		dos.flush();
		System.out.println("data.txt에 "+dos.size()+"byte 저장");
		dos.close();
		//파일을 열면 1바이트 언어라 깨져 나온다 
	}
}
