package ex.practice.Mar5th;

public class Practice02 {
	
	public static void main(String[] args) {
		Practice_Calculator cal = new Practice_Calculator();
		cal.sum(10, 200);
		System.out.println(cal.result);
		
		cal.sum(3.14, 3.95);
		System.out.println(cal.result);
	}
}
