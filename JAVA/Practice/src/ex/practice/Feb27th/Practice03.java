package ex.practice.Feb27th;

public class Practice03 {

	public static void main(String[] args) {
		boolean result = false && true & true;
		System.out.println(result);
		
		int a = 10;
		boolean result2 = a>0 && a>10;
		System.out.println(result2);
		
		boolean result3 = true || false ;
		System.out.println(result3);
		
		double pi = 3.14;
		boolean result4 = pi>0 || pi>20 ;
		System.out.println(result4);
	}

}
