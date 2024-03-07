package ex.test.ch08;

public class Ex03 {

	public static void main(String[] args) {
		Super s1 = new Super();
		Game g1 = new Game();
		Play p1 = new Play();
		
		s1 = g1;
		s1 = p1;
		
		
		// 다형성
		Super s2 = new Game();
		System.out.println(s2.s);
		s2.getName();
		
		Super s3 = new Play();
		Object obj1 = new Super();
		Object obj2 = new Game();
		Object obj3 = new Play();
		
		
	}

}
