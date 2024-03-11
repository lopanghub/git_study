package ex.test.ch10;

public class Ex02 {

	public static void main(String[] args) {
		int a = 100;
		System.out.println(a+10);
		
		// 변수 활용
		for(a = 0; a<3; a++) {
			System.out.println("hello");
		}

	}
	
}

// 인스턴스 메서드 - 기능(동작)
// 인스턴스 변수에 관련된 작업
// 정적 멤버 사용가능
// this.x = 100;
// this.y = Tv.channel; < 인스턴스 메서드는 인스턴스 변수에 관련된 작업을 하는게 좋다
// Tv.channel = 100; < 정적 변수에 직접적인 대입은 가능하지만 x
// channelChange(100); 여기선 이런식으로


// 정적 메서드
// 정적 변수에 관련된 작업
// static void channelChange(int ch){
//	channel = ch;
//	}
