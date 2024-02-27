package ex.test.ch02;

public class Ex07 {

	public static void main(String[] args) {
		char a = 'a';
		// 기본형 - 정수,실수,논리
		// 참조형 - 클래스, 문자열
		String s = "hello"+a; // hello와 a를 연결하겠다
		System.out.println(s);
		System.out.println("hello world"+10);
		System.out.println(s+true);
		
		int x = 100;
		System.out.println("x = "+x); // string+int 는 string 무조건이다
	}

}
