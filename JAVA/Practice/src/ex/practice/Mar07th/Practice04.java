package ex.practice.Mar07th;

public class Practice04 {
	public static void main(String[] args) {
		Super s1 = null;
		Max m1 = new Max();
		Max m2 = null;

		System.out.println(m1.s + " " + m1.ipTime);
		m1.getName();

//		double a = 3.14;
//		int b = (int)a;

		s1 = (Super) m1;
		System.out.println(s1);
		System.out.println(m1);
		s1.getName();

		m2 = (Max) s1;

		System.out.println(m1 == m2);
		Object obj = (Object) m2;
		System.out.println(obj == s1);
	}

}
