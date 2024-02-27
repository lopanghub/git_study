package ex.test.ch02;

public class Ex04 {

	public static void main(String[] args) {
		// &, |, ^ 비트연산
		// 비트 2진수 연산
		int a = 13; // 1101
		int b = 10; // 1010 이 두개에 대해서 and 연산 들어감
		int c = a & b;
		int d = a | b;
		int e = a ^ b; // 배타 계산 같으면 false 틀리면 true;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		// 16진수 C6E
		// 10진수 3182
		//  2진수 110001101110
		//  8진수 6156
	}

}
