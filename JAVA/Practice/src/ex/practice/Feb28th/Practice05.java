package ex.practice.Feb28th;

public class Practice05 {
	static int global_statuc_int;

	public static void main(String[] args) {
		int x = 100;
		int i; // for 문밖에서 쓰고 싶은면 여기서 선언
		for (i = 0; i < 3; i++) {

//			System.out.println(i);
			System.out.println(x);
			if (true) {
				int k = 100;
				System.out.println(k);
			}
			// System.out.println(k);
		}
		System.out.println(i); // 지역 변수는 선언된 블럭 내에서만 사용할 수 있다.
		System.out.println(x);

	}

	public static void method() {

	}
}
