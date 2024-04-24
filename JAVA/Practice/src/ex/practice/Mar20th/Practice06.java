package ex.practice.Mar20th;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Practice06 {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Global IT\\Desktop\\team-projects\\data2.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBoolean(false);
		dos.writeInt(100);
		dos.writeDouble(3.14);
		dos.writeChar('a');
		dos.flush();
		System.out.println("data2.txt에 " + dos.size() + "byte 저장");
		dos.close();
	}
}
