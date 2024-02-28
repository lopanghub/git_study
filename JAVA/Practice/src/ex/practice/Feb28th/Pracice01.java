package ex.practice.Feb28th;

public class Pracice01 {

	public static void main(String[] args) {
		int score = 89;
		String result = "F학점"; // 공백도 좋지만 else인 F값을 초기값으로 넣으면 생략가능(최적화)
		if (score >= 90) {
			if (score >= 95) {
				result = "A+";
			} else {
				result = "A";
			}
		}

		else if (score >= 80) {
			if (score >= 85) {
				result = "B+";
			} else {
				result = "B";
			}
		} else if (score >= 70) {
			result = "C";
		} else if (score >= 60) {
			result = "D";
		}

		System.out.println(result+"학점");
	}

}
