package ex.practice.Feb27th;

import java.util.Date;

public class SpringFormat {

	public static void main(String[] args) {
		int hoge = 1;
		String str1 = String.format("변수 hoge의 내용은 %d이다.", hoge);
		System.out.println(str1);
		//변수 hoge의 내용은 1이다.
		
		String str2 = String.format("True는 %b, False는 %b", false, true);
		System.out.println(str2);
		//True는 false, False는 true
		//예제에선 true , false 순이길래 궁금해서 순서 바꿔봄
		
		String game = "game";
		String str3 = String.format("문자열의 내용은 %s", game);
		System.out.println(str3);
		//문자열의 내용은 game
		
		String str4 = String.format("귀하의 평가는 %c", 'A');
		System.out.println(str4);
		//귀하의 평가는 A
		
		String str5 = String.format("원주율은 %f", 3.1415);
		System.out.println(str5);
		//원주율은 3.141500
		
		
		Date date = new Date();
		String dateStr = String.format("%tH:%tM", date, date);
		System.out.println(dateStr);
		// 17:26(현재 시간)

	}

}
