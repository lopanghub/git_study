package ex.test.ch06;

public class Tv {
	int ch;
	static int xx; // 정적 변수
	//static == 윈도우 시작프로그램 같은 것 실행과 동시에 동작  
	
	// 리턴타입 이름(매개변수...) {    }
	int chUP() {
		ch++;
		System.out.println("채널증가");
		return ch;
	}
	// void = return이 없다
	void chValue(int ch) {
		// 저장(변수에 대입)
		this.ch = 1000;
		System.out.println(ch);
		System.out.println(this.ch);
		System.out.println(this);
		this.ch = ch; // 지역변수 ch = 지역변수 ch 의미가 없다
		
		
		System.out.println(Product.count);
		
		return; // 생략 가능(보통 생략한다)
		
		
	}
	
}
