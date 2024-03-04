package ex.text.ch05;

public class Tv {
	// 속성 = 필드 = 변수
	// 전원, 채널, 음량, 가로, 세로, 제조사
	
	boolean power = false;
	int channel ; //0~999
	int vol ; //0~30
	String brand; //명시적 초기화
	int w = 100;
	int h = 80; 
	
	// 생성자 - 클래스와 이름이 같다.
	public Tv(){
		this(10,1);
//		brand = "samsung";
//		channel = 10;
//		vol = 3;
		
		 // 매개변수가 적은쪽에서 this 사용
		System.out.println("생성자1");
	}
	
	public Tv(int c, int v) {
		this("LG",c,v);
		System.out.println("생성자2");
	}
	
	public Tv( String b, int c, int v) { // String b 는 매개변수
		System.out.println("생성자3");
		brand = b;
		if(c>=0&&c<=999) {
			channel = c;
		}
		if(v>=0&&v<=30) {
			vol = v;
		}
		
	}
	
	public Tv(String b, int c) {
		brand = b;
		channel = c;
	}
}

// 컴포넌트 클래스




