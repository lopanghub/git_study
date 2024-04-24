package ex.practice.Mar19th;

import java.util.Calendar;

public class Practice03 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH) + 1 + "월");
		System.out.println(cal.get(Calendar.DATE) + "일");

		// 권장방식이지만 date보다 사용하기 불편해서 잘 안쓰임
	}
}
