package ex.test.ch13;

public class Ex03 {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("hello");
		System.out.println(s1.hashCode());
		s1.append(" world");
		System.out.println(s1.hashCode());
		System.out.println(s1);
	}
}
