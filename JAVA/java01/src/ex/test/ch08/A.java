package ex.test.ch08;

//자바의 모든 클래스는 기본적으로 Object를 상속 받는다
public class A extends Object{ //파이널 클래스는 조상이 될 수 없다
	 static int x = 100;
			int y= 200;
	String name = "A class";		
			
	public A()	{	} // 기본 생성자
	public A(int y) {
		this.y = y ;
	}
			
	public static void add() {
		System.out.println("정적 메서드");
	}
	void getName() { // final 붙으면 오버라이딩 불가
		System.out.println("인스턴스메서드");
	}
}
