package ex.test.ch02;

public class Ex05 {

	public static void main(String[] args) {
		int a = 10;
		// 조건식 ? true : false;
		char b = a > 0 ? 'A': 'B' ;
		boolean c = a > 0 ? true : false ;
		int d = a > 0 ? a> 10 ? 7: 0 : a> - 10 ? 0 : -100; // 어지럽네 ; 이렇겐 안쓴다
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
