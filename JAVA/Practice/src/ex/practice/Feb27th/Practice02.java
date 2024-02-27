package ex.practice.Feb27th;

public class Practice02 {

	public static void main(String[] args) {

		float b = 3.14f;
		double a = b;
		
		System.out.println(b);
		System.out.println(a);
		// 오차 발생 실수는 어지간해선 double 쓰는게 맞음
		
		int c = 10;
		System.out.println(c%7);
		
		int e = 10;
		int f = 20;
		boolean g = e!=f-10;
		System.out.println(g);

	}

}
