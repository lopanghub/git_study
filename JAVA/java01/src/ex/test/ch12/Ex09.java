package ex.test.ch12;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("클래스 풀네임:");
		String cn = s.nextLine();
		Class c = null;
		try {
			c = Class.forName(cn);
			Constructor <?> cons = c.getConstructor();
            Object obj = cons.newInstance();
			System.out.println(obj.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
