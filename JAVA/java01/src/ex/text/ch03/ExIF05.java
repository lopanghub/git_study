package ex.text.ch03;

public class ExIF05 {

	public static void main(String[] args) {
		int score = 89;
		String result = "F"; // 공백도 좋지만 else인 F값을 초기값으로 넣으면 생략가능(최적화)
		if (score >= 95) {
			result = "A+";
		} else if (score >= 90) {
			result = "A"; // true가 나오는 한구역만 실행
		} else if (score >= 85) {
			result = "B+";
		} else if (score >= 80) {
			result = "B";
			if(score>=85) {
				result +="+";
			}else {
				result += "0";
			}
		} else if (score >= 70) {
			result = "C";
		} else if (score >= 60) {
			result = "D";
		} // else {
//			result ="F학점";
//		}
		System.out.println(result+"학점");
	}

}
