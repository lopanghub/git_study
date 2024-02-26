package ex.test.ch01;

public class Ex02 {

	public static void main(String[] args) {
		
		// 실수는 기본값이 double이므로 float 3.14는 에러가 난다
		float pi2 = 3.14f;
		double pi = 3.14;
		
		// byte, char, short, int, long
		byte a =127;
		char b = 65535;
		short c = 32767;
		int d = 2147483647;
		long e = 2147483648l;
		//float랑 마찬가지로 뒤에 l을 붙여준다
		
		
		long f = 100000*1000000;
		//연산은 실행할때 한다 에러는 안뜨지만
		System.out.println(f);
		//이상한 값이 출력된다 데이터오버플로우 현상
		
		byte x = (byte)(100+30);
		// 숫자는 중요하지 않다 int+int = int 이기때문에 에러가 뜬다
		// 타입변환을 해준다
		System.out.println(x);
		// 위와 마찬가지로 데이터오버플로우 현상이 나온다
	}

}
