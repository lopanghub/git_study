package ex.practice.Mar19th;

public class Student2 {
	final static int LEFT = 0;
	final static int CENTER = 1;
	final static int RIGHT = 2;

	String name = "";
	String studentNo = "";
	int koreanScore = 0;
	int mathScore = 0;
	int englishScore = 0;
	int total = 0;

	Student2(String name, String studentNo, int koreanScore, int mathScore, int englishScore) {
		this.name = name;
		this.studentNo = studentNo;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
		total = koreanScore + mathScore + englishScore;
	}

	



	//	public String toString() {
////		return format(name, 4, LEFT)
////				+
//	}
	// 정렬 포맷
	static String format(String str, int length, int alignment) {
		int diff = length - str.length(); // 시작 지점
		if (diff < 0) {
			return str.substring(0, length); // 글자수의 최대치를 length 제한
		}

		char[] source = str.toCharArray();// str을 캐릭터배열로 변환
		char[] result = new char[length]; // length 크기의 배열 생성

		// result 배열을 공백으로 채우기
		for (int i =0;i<result.length;i++) {
			result[i] = ' ';
		}

		switch (alignment) { // 좌 우 중앙에 따라 다르게 배열 복제
			case CENTER :
			System.arraycopy(source, 0, result, diff / 2, source.length);
			// arrraycopy(src : 원본배열,srcPos:복사 시작 위치, dest:대상 배열,
			// destPos:붙여넣기 시작위치,length:복사할 요소의 크기
			break;
			case RIGHT :
			System.arraycopy(source, 0, result, diff, source.length);
			break;
			case LEFT :
			
			System.arraycopy(source, 0, result, 0, source.length);
		}
		return new String(result);
	}
}
