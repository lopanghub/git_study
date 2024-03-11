package ex.practice.Mar05th;

public class Practice04 {
	static int x =100;
	int a = 10;
	
	static void xValue() { // 정적 메서드
		System.out.println(Practice04.x);
		
		
		// 정적 메서드에서 인스턴스 변수 사용시 객체 생성후 사용
		Practice04 p = new Practice04();
		System.out.println(p.a);
		
	}
	void aValue() { // 인스턴스 메서드에서는 정적 인스턴스 변수 모두 접근 가능
		System.out.println(x);
		System.out.println(a);
	}
	
	public static void main(String[] args) { //메인 역시 정적 메서드 객체 생성해야됨
		Practice04.xValue();
		
		Practice04 p = new Practice04();
		p.aValue();

	}

}
