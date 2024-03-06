package ex.test.ch07;

public class Ex00 {

	public static void main(String[] args) {
		//정적 메서드
		String a = String.valueOf(false);
		String b = String.valueOf(100);
		String c = String.valueOf(3.14);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		//인스턴스 메서드
		String str = new String();
		String str2 = new String("hello world");
//		char c1 = str.charAt(0);
		char c2 = str2.charAt(1);
		
//		System.out.println(c1);
		System.out.println(c2);
	}
	
	void charAt(int a) {
		
	}

}
