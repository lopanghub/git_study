package ex.test.ch06;
//클래스 == 설계
//main(), new
//main() 없는 클래스는 Component Class - 실행 불가능
//main() 있는 클래스는 Container Class - 실행 가능 like 전원버튼
public class Ex01 {
	// 클래스 영역 선언된 변수 - 필드, 인스턴스 변수
	// 메서드, 생성자에서 선언된 변수 - 지역변수
	int a;
	double b; // 기본형 필드 , 인스턴스 변수는 기본값이 부여되서 선언으로 출력 가능
	boolean c;
	
	String str; // 참조형 필드
	Tv t1;	//같은 패키지안에서 Tv 클래스가 있어서 쓸 수 있다
 	//ex.test.ch05.Car c1;		// 참조형 필드 주소가 부여되지 않은 참조형은 null 대입
//	Member user1;
	
	
	public Ex01() { // 기본 생성자 매개변수 없는 생성자
		a =20;
		b = 3.14;
		t1 = new Tv();
		str = "hello";// String은 new String 생략가능(편의성)
	}
	
	public Ex01(int x, double y) { // 생성자가 여러개일때 구분법은 매개변수 
		this(x, y, null); //this는 항상 첫 줄
		a = x;
		b = y;
	}
	public Ex01 (int x, double y, String s){
		a = x;
		b = y;
		str = s;
	}
}
