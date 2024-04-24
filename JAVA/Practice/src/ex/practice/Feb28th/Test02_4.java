package ex.practice.Feb28th;

import java.util.Scanner;

public class Test02_4 {

	public static void main(String[] args) {
		System.out.print("문제4 숫자를 입력하시오= ");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		switch (m) {
		case 1, 3:
			System.out.println("male");
			break;
		case 2, 4:
			System.out.println("female");
			break;
		default:
			System.out.println("유효한 값을 입력하시오(1~4)");
		}

	}

}
