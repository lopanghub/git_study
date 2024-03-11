package ex.practice.Mar07th;

public class A {
	static int x = 100;
			int y = 200;
	
	public static void add() {
		System.out.println("정적 메서드");	
	}
	
	void getName() {
		System.out.println("인스턴스 메서드");
	}
}
