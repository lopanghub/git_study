package ex.test.ch07;

public class Ex01 {
	static final int x = 400;
	
	public static void main(String[] args) {
		final int a = 100;
		System.out.println(a);
//		a = 200;
		System.out.println(Ex01.x);
//		x=500;
		System.out.println(Ex01.x);
		
		Member m1 = new Member("java","1234");
		Member m2 = new Member("oracle", "0000");
		System.out.println(m1.id+" "+m1.pw);
		System.out.println(m2.id+" "+m2.pw);
		
		//m1.id = "korea";
				
	}

}
