package ex.practice.Mar15th;

import java.util.Scanner;

public class Practice00000 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		do {
			System.out.println("값 입력 마치려면 Q입력");
			input = scan.nextLine();
			System.out.println("입력 값" + input);
		} while (!input.equalsIgnoreCase("Q"));
		// 대소문자 상관없이 q 한글자 입력하면 false 나머지 경우 true(계속 반복)

		System.out.println("종료");
	}
}
