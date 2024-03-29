package ex.practice.Mar21th;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		int range = s.nextInt();
		System.out.println(range);
		
		String result = "";
		int result2= 0;
		for(int i = 0; i<range; i++) {
			int r = (int)(Math.random()*10);
			result += r;
			result2 += r;
		}
		System.out.println(result);
		System.out.println("각 자리 수의 합");
		System.out.println(result2);
	}
}
