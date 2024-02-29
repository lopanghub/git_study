package ex.text.ch04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
//		for(int i=0;i<10;i++) {
//			if(i %3==0 ) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		//hello 5번 출력하는 코드
//		for(int i =0;i<5;i++) {
//			System.out.println("hello");
//		}
		//정수를 입력받아, 입력 받은 정수만큼 hello를 출력하는 코드 작성
		Scanner sc = new Scanner(System.in);
//		int number = sc.nextInt();
//		
//		for (int i =0;i<number;i++) {
//			System.out.println("hi");
//		}
		
		// 구구단 : 실행받은 단수만 출력되게
		System.out.print("수를 입력하세요:");
		int count = sc.nextInt();
		
		aa:
		for (int i= 2; i<=9;i++) {
			if (i == count) {
				for(int j=1;j<=9;j++) {
					System.out.println(i+"X"+j);
				}
				break;
			}
		}
//		for (int i=1;i<10;i++) {
//			System.out.println(count+"X"+i);
//		}
	}

}
