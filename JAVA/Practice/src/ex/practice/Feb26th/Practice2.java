package ex.practice.Feb26th;

public class Practice2 {

	public static void main(String[] args) {
		double pi = 3.14;
		float pi2 = 3.14f; // 실수의 기본형 double
		
		byte a =127;
		char b = 65535;
		short c = 32767;
		int d = 2147483647;
		long e = 2147483648l; // 정수의 기본형은 int이고 int보다 작은 단위는 안붙여도 되지만 큰단위인 long은 l붙이기
		
		long f = 100000*20000000l; 
		System.out.println(f);
		
		byte g = (byte)(100+30); // int+ int = int라 에러남
		System.out.println(g);
	}

}
