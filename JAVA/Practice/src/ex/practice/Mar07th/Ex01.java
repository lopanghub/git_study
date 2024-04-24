package ex.practice.Mar07th;

import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		B b = new B();

		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.age);
		System.out.println(b.name);

		b.getName();

		C c = new C();
		System.out.println(c.x);
		System.out.println(c.y);
//		System.out.println(c.age);
//		System.out.println(c.name);

		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1);
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));// equals 는 Object 메서드

		A a = new A();
		System.out.println(a); // toString이 생략되어있다
		System.out.println(a.toString());

		Date d = new Date();
		System.out.println(d.toString()); // toString이 오버라이딩되서 사용
	}

}
