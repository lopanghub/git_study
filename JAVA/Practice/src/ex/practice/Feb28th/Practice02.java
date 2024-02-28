package ex.practice.Feb28th;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		
		// 1번
		System.out.print("문제1 \n숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		
		if (number1%2==0) {
			System.out.println("해당 수는 짝수입니다.");
		} else {
			System.out.println("해당 수는 홀수입니다.");
		}
		
		// 2번 패스
		// 3번
		System.out.print("문제3 \n첫번째 수를 입력하시오 :");
		
		int num3_1 = sc.nextInt();
		System.out.print("두번째 수를 입력하시오 :");
		int num3_2 = sc.nextInt();
		if(num3_1>num3_2) {
			System.out.println("더 큰 수는 "+num3_1+"입니다");
		} else if (num3_2>num3_1) {
			System.out.println("더 큰 수는 "+num3_2+"입니다");
		} else {
			System.out.println("두 수는 같습니다");
		}
		
		// 5번
		System.out.print("문제5 \n첫번째 수를 입력하시오 :");
		int num5_1 =sc.nextInt();
		System.out.print("두번째 수를 입력하시오 :");
		int num5_2 =sc.nextInt();
		System.out.print("세번째 수를 입력하시오 :");
		int num5_3 =sc.nextInt();
		
		
//		if (num5_2<min) {
//			min = num5_2;
//		}
//		if (num5_3<min) {
//			min = num5_3;
//		}
		
		
		// Math 사용
		int min = Math.min(Math.min(num5_1, num5_2), num5_3);
		System.out.println("최소값은 ? "+min);
		
	}

}
