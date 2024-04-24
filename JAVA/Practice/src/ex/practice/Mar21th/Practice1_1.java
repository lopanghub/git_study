package ex.practice.Mar21th;

interface Test {
	public abstract void add();
}

class A implements Test {
	public void add() {

	}
}

public class Practice1_1 {
	public static void main(String[] args) {
		Test t = new A(); // 부모가 자식을 참조
		t.add(); // 자식이 오버라이딩한 메서드를 호출, 다형성

		Test t2 = new Test() {
			public void add() {
				System.out.println("익명 클래스");
			}
		}; // ;익명 클래스 일회용

		Test t3 = () -> System.out.println("람다식");
		// 람다식 추상 메서드가 1개인 인터페이스에서만 구현 가능
		// 익명 클래스를 간결하게 표현
		// 메서드 이름 생략 실행문이 한개일 경우 블럭{}도 생략 가능
		t2.add();
		t3.add();
	}
}
