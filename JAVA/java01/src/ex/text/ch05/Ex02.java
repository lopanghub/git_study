package ex.text.ch05;

public class Ex02 {

	public static void main(String[] args) {
		int [] a = new int[3]; // 배열 선언
		int b [] = new int[10];
		double [] c = new double[30];
		boolean [] d = new boolean[2];
		String [] s = new String[1];
		int k =550;
		a[0] = k;

		System.out.println(++a[0]);
		System.out.println(b[0]);
		System.out.println(c[0]);
		System.out.println(d[0]);
		System.out.println(s[0]);
		
		
		// 배열 명령어 length
		System.out.println(a.length);
		System.out.println(b.length);
	}

}
