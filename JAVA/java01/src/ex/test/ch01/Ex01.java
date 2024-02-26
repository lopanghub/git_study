package ex.test.ch01;

public class Ex01 {

	public static void main(String[] args) {
		// 타입 이름;
		int age; //변수의 박스만 만들어진 상태
		age = 100;
		System.out.println(age);
		
		double value = 3.14;
		age = 20;
		// 100이 없어지고 20이 들어옴

		System.out.println(age);
		System.out.println(value);
		
		int result = age+100;
		System.out.println(result);
	}

}
