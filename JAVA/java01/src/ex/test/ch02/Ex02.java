package ex.test.ch02;

public class Ex02 {

	public static void main(String[] args) {
		
		float b = 3.14f;
		double a = b;
		
		System.out.println(b);
		System.out.println(a); //오차가 발생한다
		
		
		int c = 10;
		System.out.println(c%7);
		
		long d = 100000 * 1000000L; // int는 21억
		System.out.println(d);
		
		int e = 10;
		int f = 20;
		
		boolean g = e!=f-10; // ! = 같이 띄어쓰기 금지
		System.out.println(g);
	}

}
