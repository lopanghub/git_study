package ex.test.ch08;

import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		B b = new B();
		
		//클래스 변수
		System.out.println(b.x);
		System.out.println(b.age);	
		System.out.println(b.name);	
		System.out.println(b.y);	
		
		b.getName();
		
		C c = new C();
		
		System.out.println(c.x);
//		System.out.println(c.age);	
//		System.out.println(c.name);	
		System.out.println(c.y);
		
		c.add();
		c.getName();
		
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1); // 생략된 toString을 오버라이딩해서 문자열을 볼수 있게
		System.out.println(s1 == s2); // 참조 변수끼리의 비교는 주소가 달라 false
		System.out.println(s1.equals(s2)); 
		
		A a = new A();
		System.out.println(a);
		System.out.println(a.toString());
		
		Date d = new Date();
		System.out.println(d.toString());
	}

}
