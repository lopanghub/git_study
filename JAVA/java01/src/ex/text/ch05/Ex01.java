package ex.text.ch05;

public class Ex01 {

	public static void main(String[] args) {
		int a = 100;
		int b = a;
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2); // 두개의 아파트는 서로 다른 아파트다(주소가 다름)
		System.out.println(s1); // 주소가 아니라 hello가 나온다
		System.out.println(s2);
		
		Object obj1 = new Object();
		Object obj2 = obj1;
		System.out.println(obj1 == obj2);// 
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
