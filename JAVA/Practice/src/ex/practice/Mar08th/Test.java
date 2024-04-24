package ex.practice.Mar08th;

public class Test {

	public static void main(String[] args) {
		int[] x = { 0, '0', 'A', 'a' };
		System.out.println(add(x));
	}

	public static int add(int arr[]) {
		int x = -1;
		for (int i = 0; i < arr.length; i++)
			x = x < arr[i] ? arr[i] : x;
		return x;
	}

}
