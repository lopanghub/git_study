package ex.test.ch06;

public class Calculator {
	String result = ""; // 계산 결과
	
	void sum(int a, int b) {
//		result += (a+b); 깔끔하지만 결과값이 누적됨
		result = (a+b)+"";
	}
	void sum(double a, double b) {
		result = (a+b)+"";
	}
	void sum(double a, int b) {
		result = (a+b)+"";
	}
	void sum(int a, double b) {
		result = (a+b)+"";
	}
	
	
}
