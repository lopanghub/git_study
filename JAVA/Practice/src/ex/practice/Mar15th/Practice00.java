package ex.practice.Mar15th;

public class Practice00 {
	public static void main(String[] args) {
		int arr[][];
		int[] arr2 = new int[] { 1, 2, 3 };
		int[] arr6[] = new int[3][];
		boolean results[] = new boolean[] { false, false, true };

		int i = 1, j = 10;
		do {
			if (i++ > j--) {
				continue;
			}
			System.out.println("i=" + i + "j=" + j);
		} while (i < 5);
		System.out.println("i=" + i + "j=" + j);

		int num = 10;
		String s = num > 0 ? "양수" : num == 0 ? "0" : "음수";
		System.out.println(s);

	}
}
