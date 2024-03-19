package ex.test.ch15;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;//되도록 별찍지 말고 하나씩 임포트
import java.util.Set;
import java.util.TreeSet;
public class Ex11_1 {
	Scanner scan = new Scanner(System.in);
	
	public void store_menu() {
		System.out.println("로또 프로그램");
		System.out.println("==========");
		System.out.println("1. 로또 구입");
		System.out.println("2. 종료");
		System.out.println("==========");
	}
	
	public void store_start() {
		while(true) {
			store_menu();
			System.out.println("메뉴 선택(1,2)");
			int choice;
			try {
				choice = Integer.parseInt(scan.nextLine());
				if(choice == 1) {
					//로또 구매
					buy_lotto();
				} else if(choice == 2) {
					System.out.println("프로그램 종료 .. !!");
					System.exit(0);
				} else {
					System.out.println("메뉴를 입력하세요");
				}
			} catch(Exception e) {
				System.out.println("잘못 입력 하셨습니다");
			}
					
		}
	}
	
	public void buy_lotto() {
		System.out.println("금액 입력");
		int money = Integer.parseInt(scan.nextLine());
		if(money < 1000) {
			System.out.println("1000원 이상 입력해주세요");
			return;
		} else if(money>100000) {
			System.out.println("10만원을 초과 할 수 없습니다");
			return;
		}
		System.out.println("받은 금액 : "+money+"원 이고 거스름돈 : "+(money%1000)+"원 입니다.");
		lottoNum(money);;
	}
	
	public void lottoNum(int money) {
		TreeSet<Integer> lottoSet = new TreeSet<>(); //순서x 중복x 정렬o
		int amount = money/1000;
		System.out.println();
		System.out.println("==로또 번호 출력==");
		for(int i=1;i<=amount;i++) {
			while(lottoSet.size()<6) {
				lottoSet.add((int)(Math.random()*45)+1);
			}
//			ArrayList<Integer> lottoList = new ArrayList<>(lottoSet);//생성자에 넣는건 addAll
//			Collections.sort(lottoList); //set은 정렬 기능이 없다
			System.out.println("로또번호["+i+"]"+lottoSet);
			lottoSet.clear();
		}
	}
	
	public static void main(String[] args) {
		Ex11_1 e = new Ex11_1();
		e.store_start();
	}
}
