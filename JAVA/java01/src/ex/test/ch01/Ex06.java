package ex.test.ch01;

public class Ex06 {

	public static void main(String[] args) {

		int x = 100000;
		int y = 100000;
		
		long a = (long)x*(long)y; // 다른타입끼리 곱하면 큰타입으로 나온다
		System.out.println(a);
	}

}
