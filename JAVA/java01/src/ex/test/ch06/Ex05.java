package ex.test.ch06;

public class Ex05 {
	static int x;
	static String name;
	
	static {
		System.out.println("static{}");
		x = (int)(Math.random()*10);
		name = "java";
	} // 정적 변수 초기화 블럭
	
	public static void main(String[] args) {
		System.out.println("main()");
		System.out.println(x);
		System.out.println(name);
	}
	
	// 로딩순서 클래스 > 정적 > main() 실행 >인스턴스
}
