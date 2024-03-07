package ex.test.ch08;

import ex.test.ch01.Super;

public class Ex02 extends Super {

	public static void main(String[] args) {
		System.out.println(Super.a);
		System.out.println(Super.b); // 프로텍트는 상속받으면 가능  
//		System.out.println(Super.c); // 디폴트는 패키지가 다르면 안됨
//		System.out.println(Super.d);

	}

}
