package ex.practice.Mar19th;

import java.util.StringTokenizer;

public class Practice05 {
	public static void main(String[] args) {
		String str = "100,200, 300 ,400, 500";
		StringTokenizer st = new StringTokenizer(str, ",");
		//str , 구분자 토큰은 자바에선 덜 쓰이고 다른언어에서 잘쓰임
		while(st.hasMoreTokens()) { //어제 반복자와 같은 메커니즘
			System.out.println(st.nextToken().trim());
		}
		
		String []s =str.split(",");
		for(String ss: s) {
			System.out.println(ss.trim());
		} // 동일한 기능
		
		String str2 = "x=100*(200+300)/2";
		StringTokenizer st2 = new StringTokenizer(str2, "+-*/=()", true);
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken());
		}//true 가있으면 구분자 반환
	}
}
