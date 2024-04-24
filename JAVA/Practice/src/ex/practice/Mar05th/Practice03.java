package ex.practice.Mar05th;

public class Practice03 {
	int a = x; // 올리는 순서가 정적 변수가 우선이라 이상해보이지만 문법적으로 맞음
	static int x = 100;
	static int y = x; // 같은 정적 변수끼리는 위에서 아래로

	public static void main(String[] args) {
		System.out.println(x); // 정적 변수는 어디서나 사용 가능
		// System.out.println(a); 인스턴스 변수는 객체 호출이 있어야 사용 가능
		Practice03 p = new Practice03();
		System.out.println(p.a);

		System.out.println(Pracitce_Product.t0.chUp());
		// Pracice_Product 클래스의 정적 참조 변수 t0에 의해 생성된 인스턴스의 chUp 메서드를 출력
	}
}
