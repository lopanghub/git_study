package ex.practice.Mar15th;

public class Practice0000 {
	public static void main(String[] args) {
		System.out.println(factorial(10));
		System.out.println(factorial2(10));

	}

	static long factorial(int n) {
		long result = 0;
		if (n == 1) {
			result = 1;
		} else {
			result = n * factorial(n - 1); // 재귀 호출은 잘 사용 x 반복문 쓰면 된다
		}
		return result;
	}

	static long factorial2(int n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
