package ex.text.ch03;

public class ExFor02 {

	public static void main(String[] args) {
		// 1~100 사이의 짝수합 홀수합

		
		int even = 0;
		int odd = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {

				even += i;
			} else {
				odd += i;
			}
		}
		System.out.println(even);
		System.out.println(odd);
		
		
		
	}

}
