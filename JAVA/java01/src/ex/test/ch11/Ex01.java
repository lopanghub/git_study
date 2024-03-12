package ex.test.ch11;

public class Ex01 {

	public static void main(String[] args) {
//		for(int i = 0; i<10;i++) {
//			int r = (int)(Math.random()*10);
//			System.out.println(10/r);
//		}
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(12);
		System.out.println(i1);
		System.out.println(i2);
		
//		Class.forName("hello");
		
		try {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3/0);
		System.out.println(4);
		System.out.println(5);
		}catch(Exception e) {
			System.out.println("예외");
		}finally {
			System.out.println("finally실행");
		}
		
	}

}
