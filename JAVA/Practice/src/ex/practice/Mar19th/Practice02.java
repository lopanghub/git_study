package ex.practice.Mar19th;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Practice02 {
	public static void main(String[] args) {
		Date day = new Date();
		Calendar cal = Calendar.getInstance();

		System.out.println(day);
		System.out.println(day.getYear()); // 1900 빼져있는 값
		System.out.println(day.getMonth()); // 0~11월
		System.out.println(day.getDate());
		System.out.println();

		System.out.println(day.getDay());// 일~토 숫자 표현

		System.out.println(cal); // 상수가 많다

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 생성자에 Spring Pattern

		String d = sdf.format(day);
		System.out.println(d);

		SimpleDateFormat sdf3 = new SimpleDateFormat("올해의 D번째 날");
		SimpleDateFormat sdf4 = new SimpleDateFormat("오늘은 MM달 W번째주 E요일");

		System.out.println(sdf3.format(day));
		System.out.println(sdf4.format(day));

	}
}
