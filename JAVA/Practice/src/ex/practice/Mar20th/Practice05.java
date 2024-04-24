package ex.practice.Mar20th;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Practice05 {
	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("C:\\Users\\Global IT\\Desktop\\team-projects\\print2.txt");
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
