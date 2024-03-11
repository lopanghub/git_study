package ex.practice.Mar05th;

public class Tv {
	int ch;
	static int xx;
	
	
	// 메서드
	// 리턴타입 메서드이름(매개변수) { }
	int chUp() {
		ch++;
		System.out.println("채널증가");
		return ch;
	}
	
	// void = return;이 없다(생략)
	void chValue(int ch) {
		System.out.println(ch);
		System.out.println(this.ch);
		System.out.println(this);
	}
}
