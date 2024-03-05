package ex.test.ch06;

public class Tv_Main {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println(t1.ch);
		
		double a = (double)(t1.chUP())+1000; // 호출 - 메서드 실행
		System.out.println(a);
		
		
		t2.chUP();
		t2.chUP();
		System.out.println(t1.ch);
		System.out.println(t2.ch);
		
		
		System.out.println(t1);
		t1.chValue(77);
		System.out.println(t1.ch);
	}

}
