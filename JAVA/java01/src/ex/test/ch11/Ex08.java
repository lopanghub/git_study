package ex.test.ch11;

public class Ex08 {

	public static void main(String[] args) {
		System.out.println("main()시작");
		aa();
		System.out.println("main()시작");

	}
	
	public static void aa() {
		System.out.println("aa()시작");
		bb();
		System.out.println("aa()종료");
	}
	public static void bb() {
		System.out.println("bb()시작");
		try {
			System.out.println('a'/0);//예외 강제 발생
		} catch(Exception e) {
			System.out.println( e.getMessage());
			e.printStackTrace();
		}
		System.out.println("bb()종료");
		
	}

}
