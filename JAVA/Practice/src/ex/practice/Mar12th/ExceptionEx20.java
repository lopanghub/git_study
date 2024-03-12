package ex.practice.Mar12th;

public class ExceptionEx20 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main에서 예외 처리됨");
			e.printStackTrace();
		}

	}
	
	static void method1() throws Exception{
		throw new Exception();
	}
}
