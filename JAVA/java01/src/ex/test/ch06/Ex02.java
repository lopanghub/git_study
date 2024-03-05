package ex.test.ch06;

public class Ex02 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.sum(10,20);
		System.out.println(cal.result);
		
		cal.sum(10.5, 20);
		System.out.println(cal.result);
	}

}
