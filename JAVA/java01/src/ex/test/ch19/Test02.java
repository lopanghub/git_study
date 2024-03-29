package ex.test.ch19;

import java.util.Random;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 값");
		int n = Integer.parseInt(scan.nextLine());// 문자로 입력받아 숫자로 형변환
		Random r = new Random();
		int sum =0;
		for(int i =0; i<n;i++) {
			int ran = r.nextInt(10);//0~9사이의 랜덤값
			//  ran = (int)(Math.random()*10);
			sum += ran;
			System.out.println(ran);
		}
		System.out.println();
		System.out.println("각 자리별 합 :"+sum);
	}
}
