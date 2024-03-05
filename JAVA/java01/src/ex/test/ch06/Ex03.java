package ex.test.ch06;

public class Ex03 {
	int a = x; // 인스턴스 변수 - new로 객체를 생성하고 써야 한다
	//순차적으로 진행되는건 같은 종류 끼리 여기선 정적 변수가 먼저 실행되므로 오류가 없음
	
	static int x = 100; // 정적 변수 - 프로그램 시작과 동시에 메모리 생성(언제든 사용가능)
	static int y = x;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
//		System.out.println(a);
		
		// 다른 클래스의 정적 변수를 쓸때는 해당클래스 이름 붙이기
		System.out.println(Product.count);
		
		Math.random(); // 랜덤은 정적 메서드
		
		Ex03 e = new Ex03();
		System.out.println(e.a);
		
		
		System.out.println(Product.t1.chUP());
		//out도 t1처럼 정적 참조형 변수
		
	}
	
	void sum() {
		
	}
	
	// 메모리의 올라가는 순서 
	// 메인 메서드가 있는 클래스 실행(Ex03) > 관련된 클래스(Pro, Tv) 실행
	// 각 클래스의 정적 멤버 올리기 > 참조형 변수 t1으로 객체생성(Tv) > 메인 실행
}
