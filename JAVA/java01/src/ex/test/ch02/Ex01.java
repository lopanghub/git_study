package ex.test.ch02;

public class Ex01 {

	public static void main(String[] args) {
		//증감 ++, --
		//정수, 실수 변수에 사용 가능 1순위/ 마지막 순위
		int a = 10;
		int b = 10;
		int c = a++ + b++; // 하나의 변수의 연산대기는 한번 밖에 안됨 10 + (a++)++ 면 a++이 적용됨
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
