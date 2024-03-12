package ex.practice.Mar12th;

public class FinallyTest3 {

	public static void main(String[] args) {
		method1();
		System.out.println("method1()의 수행을 마치고 main메서드로 복귀");
	}
	
	static void method1() {
		try {
			System.out.println("method1()이 호출");
			return;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1()의 fianlly 블럭이 실행");
		}
	}
}
