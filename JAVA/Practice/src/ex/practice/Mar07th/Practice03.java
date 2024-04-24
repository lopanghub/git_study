package ex.practice.Mar07th;

public class Practice03 {

	public static void main(String[] args) {
		Super s1 = new Super();
		Max m1 = new Max();
		Ultra u1 = new Ultra();

		// 다형성
		s1 = m1;
		Super s2 = new Max();
		System.out.println(s2.s);
		s2.getName();
//		u1 = s1;
//		Ultra u2 = new Super();

		Object obj = new Super();

	}

}
