package ex.test.ch16;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		Date day = new Date();
		Calendar cal = Calendar.getInstance();
		System.out.println(day);
		System.out.println(day.getYear());
		System.out.println(day.getMonth());
		System.out.println(day.getDate());
		System.out.println();

		System.out.println(day.getHours());
		System.out.println(day.getMinutes());
		System.out.println(day.getSeconds());

		System.out.println();
		System.out.println(day.getDay());

		System.out.println(cal);

		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		SimpleDateFormat d2 = new SimpleDateFormat("yyyy년MM월dd일");

		String sdf = d.format(day);
		System.out.println(sdf);

		sdf = d2.format(day);
		System.out.println(sdf);
		
		SimpleDateFormat d3 = new SimpleDateFormat("오늘은 올해의 D번째 날입니다.");
		System.out.println(d3.format(day));
		
		SimpleDateFormat d4 = new SimpleDateFormat("오늘은 MM달의 W번째주 E요일 입니다");
		System.out.println(d4.format(day));
	}
}
