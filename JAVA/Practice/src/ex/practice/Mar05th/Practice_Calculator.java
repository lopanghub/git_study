package ex.practice.Mar05th;

public class Practice_Calculator {
	// 메소드 오버로딩
	String result = ""; // 계산결과

	String sum(int a, int b) {
		result = (a + b) + "";
		return result;
	}

	String sum(int a, double b) {
		result = (a + b) + "";
		return result;
	}

	String sum(double a, int b) {
		result = (a + b) + "";
		return result;
	}

	String sum(double a, double b) {
		result = (a + b) + "";
		return result;
	}
}
