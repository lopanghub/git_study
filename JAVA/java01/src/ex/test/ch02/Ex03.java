package ex.test.ch02;

public class Ex03 {

	public static void main(String[] args) {
		// &&(and)
		// 주어진 조건이 모두 참일때 참!
		boolean result = false && true && false; //첫 false 이후의 계산은 하지 않는다
		System.out.println(result);
		
		int a = 10;
		boolean result2 = a>0 && a>10;
		System.out.println(result2);
		
		
		// ||(or)
		// 주어진 조건이 하나라도 참이면 참
		boolean result3 = false || false || true;
		System.out.println(result3);
		
		double pi = 3.14;
		boolean result4 = pi>0 || pi>20 || pi>30;//첫 true 이후의 계산은 하지 않는다
		System.out.println(result4);

	}

}
