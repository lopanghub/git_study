package ex.test.ch06;

public class Ex04 {
	static int x = 100;
	int a = 10;
	
	static void xValue() {
		System.out.println(Ex04.x);
		
		//정적 메서드에서 인스턴스 변수 사용시 객체 생성 후 사용
		Ex04 e = new Ex04(); // 지역 참조 변수 xValue 종료되면 삭제
		System.out.println(e.a); 
	}
	void aValue() {
		System.out.println(x);
		System.out.println(a);
	}
	
	public static void main(String[] args) {
	 	Ex04 e = new Ex04();
		e.aValue();
		xValue();
		
	


	}

}
