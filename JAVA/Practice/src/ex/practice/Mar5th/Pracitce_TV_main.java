package ex.practice.Mar5th;

public class Pracitce_TV_main {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		System.out.println(t1.ch);
		
		int a = t1.chUp()+1000;
		System.out.println(a);
		
		System.out.println(t1);
		t1.chValue(100);
		
	}

}
