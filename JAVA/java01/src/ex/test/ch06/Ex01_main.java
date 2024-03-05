package ex.test.ch06;

public class Ex01_main {

	public static void main(String[] args) {
		// new - 객체 생성 - 메모리를 만든다
		Ex01 e1 = new Ex01(100, 10.7);
		System.out.println(e1);
		System.out.println(e1.a);
		System.out.println(e1.b);
		System.out.println(e1.c);
		System.out.println(e1.str); // 모든 참조형의 기본값은 null
		System.out.println(e1.t1);
		System.out.println(e1.t1.ch); // t1이 null인 경우 null exception 에러 발생
	}

}
