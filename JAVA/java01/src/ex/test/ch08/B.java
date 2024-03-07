package ex.test.ch08;

// A클래스 상속
public class B extends A{ //상속은 하나의 클래스만 가능
	static int age=30;
	String name;
	
	
	public B() {
		super(100); // 조상의 기본 생성자 호출 this() 같이 못씀 둘다 첫줄에만 가능
		name = "java";
		y = 200; // 이미 물려받았다
	}
	
	//                      이쪽은 가능    <<<
	// 오버라이딩 public - protected - default - private
	// 더 넓은 개념만 가능
	@Override
	public void getName() { 
		String name ="local-value";
		System.out.println(name+"입니다.");
		System.out.println(this.name+"입니다.");
		System.out.println(super.name+"입니다.");
		super.getName();
	}
}
