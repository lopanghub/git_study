package ex.practice.Mar05th;

public class Practice05 {
	static int x;
	static String name;

	static {
		System.out.println("static{}");
		x = (int) (Math.random() * 100 + 1);
		name = "java";
	}// 정적 변수 초기화 블럭

	public static void main(String[] args) {
		System.out.println("main()");
		System.out.println(x);
		System.out.println(name);

	}

}
