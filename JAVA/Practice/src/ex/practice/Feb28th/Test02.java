package ex.practice.Feb28th;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		int dayNumber = (int)(Math.random()*7);
		switch (dayNumber){
		case 0 :
			System.out.println("일요일입니다");
			break;
		case 1 :
			System.out.println("월요일입니다");
			break;
		case 2 :
			System.out.println("화요일입니다");
			break;
		case 3 :
			System.out.println("수요일입니다");
			break;
		case 4 :
			System.out.println("목요일입니다");
			break;
		case 5 :
			System.out.println("금요일입니다");
			break;
		case 6 :
			System.out.println("토요일입니다");
			break;
	
		}
		
		System.out.print ("음식 종류를 입력하세요 ");
		Scanner sc = new Scanner(System.in);
		String foodVariety = sc.nextLine(); // 스트링 입력은 nextLine //next는 여러 값을 동시에 입력받을 수 있다.
		String price = "";
		switch (foodVariety) {
			case "한식" : 
				price = "돼지 국밥 9900원";
				break;
			case "중식" :
				price = "간짜장 6900원";
				break;
			case "일식" :
				price = "광어초밥 19900원";
				break;
			case "양식" :
				price = "안심스테이크 59900원";
				break;
 		}
		System.out.println(price);
		
		
	}
}
