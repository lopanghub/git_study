package ex.practice.Mar5th;

public class Practice01 {
	int a;
	double b;
	boolean c;
	
	String str;
	Tv t1; // 패키지안에 Tv 클래스가 있으면 쓸 수 있다
	
	public Practice01() { // 기본 생성자
		a = 20;
		b = 3.14;
		t1 = new Tv();
		//str = new String("hello");
		str = "hello"; // str은 new String 생략 가능
	}
	
	public Practice01(int a, double b) {
		this(a, b, null); //this() 다른 생성자 호출 ; 항상 첫줄
		this.a = a; // 여기서의 this 는 해당 인스턴스의 주소를 가르킴 
		this.b = b;
	}
	public Practice01(int a, double b, String s) {
		
	}
	
}
