package ex.practice.Mar12th;

import java.io.*;

public class ExceptionEx13 {

	public static void main(String[] args) {

		PrintStream ps = null;
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("error.log");
			ps = new PrintStream(fos);

			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(0 / 0);
			System.out.println(4);
		} catch (Exception ae) {
			ae.printStackTrace(ps);
			ps.println("���� �޽��� : " + ae.getMessage());
		}

	}

}
