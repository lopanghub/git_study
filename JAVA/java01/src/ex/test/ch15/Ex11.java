package ex.test.ch15;

import java.util.*;

public class Ex11 {
	public static void main(String[] args) {
		// set 계열 클래스 이용하여 로또번호
		// list 계열 클래스 이용하여 정렬하여 출력
		// 금액을 입력받아 금액만큼 로또 번호 생성 (금액은 천원 단위)
		// 구매 횟수 6: 거스름돈 4천원
		// 구매금액 5천원 // 5회 출력
		// 번호1[ ]
		// 번호2[ ]
		// ...

		// 스캐너
		Scanner scan = new Scanner(System.in);
		System.out.print("희망 구매 횟수 :");
		String order = scan.nextLine();
		System.out.print("구매 금액 :");
		String payment = scan.nextLine();
		int payments = Integer.parseInt(payment);
		if(payments%1000 != 0) {
			System.out.println("천원단위로 입력하세요");
		}
		System.out.println();

		int outputs = (payments / 1000) - Integer.parseInt(order);
		System.out.println("로또 구매 금액 : " + payment);
		System.out.println("로또 번호 " + outputs + "회 출력");

		// 로또번호
		for (int h = 0; h < outputs; h++) {
			TreeSet<Integer> set = new TreeSet<>();
			for (int i = 0; set.size() < 6; i++) {
				int num = (int) (Math.random() * 45) + 1;
				set.add(num);
			}

//			List list = new ArrayList(set);
//			Collections.sort(list);
			System.out.println("번호"+(h+1)+" : "+set);
		}
	}

}
