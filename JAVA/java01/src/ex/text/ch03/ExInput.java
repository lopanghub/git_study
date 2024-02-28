package ex.text.ch03;

import java.util.Scanner;

public class ExInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 스캐너는 기본 클래스가 아니라 에러뜸
		int a = sc.nextInt(); // 숫자 입력받는다.
		System.out.println("입력 값 = "+a);
		int b = sc.nextInt(); // 숫자 입력받는다.
		System.out.println("입력 값 = "+b);
	}

} 
 