package ex.practice.Feb28th;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~7까지의 수를 넣으세요 : ");
		int dayNumber = sc.nextInt();
		sc.nextLine();
		String day = "유효한 수를 넣으세요";
		switch (dayNumber) {
			case 1:
				day = "오늘은 월요일입니다.";
				break;
			case 2:
				day = "오늘은 화요일입니다.";
				break;
			case 3:
				day = "오늘은 수요일입니다.";
				break;
			case 4:
				day = "오늘은 목요일입니다.";
				break;
			case 5:
				day = "오늘은 금요일입니다.";
				break;
			case 6:
				day = "오늘은 토요일입니다.";
				break;
			case 7:
				day = "오늘은 일요일입니다.";
				break;
		}
		
		System.out.println(day); 
		
		System.out.print("당신이 좋아하는 음식 종류를 입력하세요 : ");
		String foodType = sc.nextLine();
		switch (foodType) {
		case "한식" :
			System.out.println("한식은 6000원에서 5만원대까지 있습니다.");
		}
	}

}
