package ex.test.ch01;

public class Ex05 {

	public static void main(String[] args) {
				
		int a = 100;
		double b =(double)a ; //double(8) = int(4) 작은타입이 큰 타입 갈땐 별다른 오류없이 자동으로 (double) 생략가능
		
		double pi = 3.14;
		int x = (int)pi; // 큰 타입이 작은타입 갈때는 정보의 손실이 발생
		System.out.println(pi);
		System.out.println(x);
		
		int y = 66;
		char c = (char) y; // char는 아스키코드
		System.out.println(y);
		System.out.println(c);
		
		double aa = 99.9;
		char cc = (char)aa;
		System.out.println(aa);
		System.out.println(cc);
		
		aa = (double)(cc);
		
		System.out.println(aa);
		System.out.println(cc);
	}

}
