package ex.practice.Feb28th;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		System.out.print("문제1 = ");
		Scanner sc1 = new Scanner(System.in);
		int number1 = sc1.nextInt();
		if (number1 % 2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}

		System.out.print("문제2 = ");
		String result = "F";
		Scanner sc2 = new Scanner(System.in);
		int number2 = sc2.nextInt();

		if (number2 >= 90) {
			if (number2 >= 95) {
				result = "A+";
			} else {
				result = "A";
			}
		} else if (number2 >= 80) {
			if (number2 >= 85) {
				result = "B+";
			} else {
				result = "B";
			}
		} else if (number2 >= 70) {
			result = "C";
		} else if (number2 >= 60) {
			result = "D";
		}
		System.out.println(result + "학점");

		System.out.println("문제 3");
		System.out.print("첫 번째 수를 입력하시오 ");
		Scanner sc = new Scanner(System.in);
		int number3a = sc.nextInt();
		System.out.println("첫 번째 수 = " + number3a);

		System.out.print("두 번째 수를 입력하시오 ");

		int number3b = sc.nextInt();
		System.out.println("두 번째 수 = " + number3b);

		if (number3a >= number3b) {
			System.out.println(number3a + "는 " + number3b + "보다 큽니다.");
		} else {
			System.out.println(number3b + "는 " + number3a + "보다 큽니다.");
		}

		System.out.println("문제 4");
		System.out.print("나이를 입력하시오 : ");
		Scanner sc4 = new Scanner(System.in);
		int number4 = sc4.nextInt();
		if (number4 >= 19) {
			System.out.println("성인입니다");
		} else {
			System.out.println("미성년자입니다");
			System.out.println("당신은 " + (19 - number4) + "년 뒤에 성인이 됩니다.");
		}

		System.out.println("문제 5");
		System.out.println("정수를 세번 입력하세요 ");

		Scanner sc5a = new Scanner(System.in);
		int number5a = sc5a.nextInt();
		System.out.println("입력 값 = " + number5a);
		Scanner sc5b = new Scanner(System.in);
		int number5b = sc5b.nextInt();
		System.out.println("입력 값 = " + number5b);
		Scanner sc5c = new Scanner(System.in);
		int number5c = sc5c.nextInt();
		System.out.println("입력 값 = " + number5c);

		int result5 = number5c;
		if (number5a > number5b) {
			if (number5a > number5c) {
				result5 = number5a;
			}
		} else if (number5b > number5c) {
			result5 = number5b;
		}
		System.out.println("가장 큰 수는 " + result5 + "입니다.");
		// 풀이
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수 : ");
		int num3 = sc.nextInt();

		int max = num1;

		if (num2 > max) {
			max = num2;
		}

		if (num3 > max) {
			max = num3;
		}
		System.out.println("최대값 : " + max);
	}

}
