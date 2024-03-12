package ex.test.ch11;

public class Ex05 {
	public static void main(String[] args) {
		try {
			add(); // 여기에 예외 처리
		} catch (Exception e) {
			System.out.println("예외발생");
		}
	}

	public static void add() 
			throws ArithmeticException, NullPointerException{
		System.out.println(10 / 0);
	}
}
