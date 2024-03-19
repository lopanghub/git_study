package ex.test.ch16;

import java.util.StringTokenizer;

public class Ex05 {
	public static void main(String[] args) {
		String str = "100,200,300,400,500";
		StringTokenizer st = new StringTokenizer(str, ",");// 토큰은 다른언어에서도 사용
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		String[] s = str.split(","); // 자바에서는 split을 주로 쓰고
		for (String ss : s) {
			System.out.println(ss);
		}
		
		String str2 = "x=100*(200+300)/2";
		StringTokenizer st2 = new StringTokenizer(str2, "+-*/=()",true);
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
}
