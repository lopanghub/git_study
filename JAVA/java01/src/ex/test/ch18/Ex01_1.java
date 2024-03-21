package ex.test.ch18;

interface Test {
	public abstract void add();// 추상 메서드

}

class A implements Test {
	public void add() {

	}
}

public class Ex01_1 {
	public static void main(String[] args) {
		Test t = new A(); // 다형성
		t.add(); // 자손이 오버라이딩한 메서드 호출, 정석적인 작성법

		Test t2 = new Test() {// 익명 클래스, 1회용
			public void add() {
				System.out.println("익명 클래스");
			}

		};
		Test t3 = () -> // 람다식 ; 메서드가 1개인 인터페이스만 구현 가능
		System.out.println("람다식");
		// 실행문이 하나면 {}; 생략가능

		t2.add();
		t3.add();
	}
}
