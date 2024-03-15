package ex.test.ch14;

public class Ex0000 {
	public static void main(String[] args) {
		System.out.println(factorial(4));
	}
	static long factorial(int n) {
		long result = 0;
		if(n==1) {
			result =1 ;
		} else {
			result =n*factorial(n-1); //재귀 호출 (나 자신을 다시 호출) - 반복문을 쓰자
		}
		return result;
	}
}