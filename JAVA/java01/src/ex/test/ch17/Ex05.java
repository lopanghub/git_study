package ex.test.ch17;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex05 {
	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;

		try {
			
			fos = new FileOutputStream("C:\\Users\\Global IT\\Desktop\\team-projects\\print.txt");
			ps = new PrintStream(fos);
			
			System.setOut(ps);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello world");
		System.out.println("hello world");
		System.err.println("Error");
	}
}
