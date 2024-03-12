package ex.test.ch11;

public class Ex07 {

	public static void main(String[] args) {
		try {
			Class c = Class.forName("java.util.Date");
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("예외 발생");
		}

	}

}
