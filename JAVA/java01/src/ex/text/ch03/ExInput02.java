package ex.text.ch03;

import java.util.Scanner;

public class ExInput02 {

	public static void main(String[] args) {
		System.out.print("숫자 입력 :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("입력 값="+num);
		
		if (num>=90) { 
			System.out.println("점수="+num);
			System.out.println("A 학점");
		} else {
			System.out.println("F 학점");
		}
	}

}
