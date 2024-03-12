package ex.test.ch11;

public class Ex02 {

	public static void main(String[] args) {
		// add();
		try {
		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * 10);
			
				System.out.println(10 / r);
			}
		} catch (Exception e) {
			System.out.println("���� �� ����.");}
	}

	public static void add() {
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println("����");
		} finally {
			System.out.println("finally");
		}
		System.out.println("hello world");

	}

}
