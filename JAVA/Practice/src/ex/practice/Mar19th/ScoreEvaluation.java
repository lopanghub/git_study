package ex.practice.Mar19th;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreEvaluation {
	static ArrayList record = new ArrayList();
	static Scanner s = new Scanner(System.in);

	static int displayMenu() {
		System.out.println("**************************************************");
		System.out.println("*                성적 관리 프로그램              *");
		System.out.println("*                   version 1.0                  *");
		System.out.println("*             excerpt from Java           *");
		System.out.println("**************************************************");
		System.out.println();
		System.out.println();
		System.out.println(" 1. 학생성적 입력하기 ");
		System.out.println();
		System.out.println(" 2. 학생성적 삭제하기 ");
		System.out.println();
		System.out.println(" 3. 학생성적 정렬하여보기(이름순, 성적순) ");
		System.out.println();
		System.out.println(" 4. 프로그램 종료 ");
		System.out.println();
		System.out.println();
		System.out.print("원하는 메뉴를 선택하세요.(1~4) : ");

		int menu = 0;

		do {
			try {
				menu = Integer.parseInt(s.nextLine());
				if (menu >= 1 && menu <= 4) {
					break;
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("잘못된 메뉴 다시 입력");
				System.out.println("원하는 메뉴를 선택하세요.(1~4) : ");
			}
		} while (true);

		return menu;
	}

	static void inputRecord() {
		System.out.println("1. 학생성적 입력하기");
		System.out.println("이름,학번,국어성적,영어성적,수학성적'의 순서로 공백없이 입력하세요.");
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다.");
		
		while(true) {
			System.out.print(">>");
			
			try {
				String input = s.nextLine().trim();
				if(!input.equalsIgnoreCase("q")) {
					Scanner s2 = new Scanner(input).useDelimiter(",");
					record.add(new Student2(s2.next(),s2.next(),
							s2.nextInt(),s2.nextInt(),s2.nextInt()));
					System.out.println("입력 완료. 마치려면 q를 입력하세요");
				} else {
					return;
				}
				
			} catch(Exception e) {
				System.out.println(("입력 오류 정확하게 입력해주세요"));
			}
		}
	}

	static void deleteRecord() {
		while(true) {
			displayRecord();
			System.out.println("삭제하고자 하는 데이터의 학번을 입력하세요(q:메인화면)");
			System.out.println(">>");
		}
	}
	
	static void displayRecord() {
		int koreanTotal =0;
		int englishTotal =0;
		int mathTotal=0;
		int total=0;
		
		System.out.println();
		System.out.println("이름 번호 국어 영어 수학 총점 ");
		System.out.println("=================================");
		
		int length = record.size();
		
		if (length>0) {
			
		}
	}
	
	public static void main(String[] args) {
		while (true) {
			switch (displayMenu()) {
			case 1:
				inputRecord(); // 성적 입력
				break;
			case 2:
				deleteRecord();
				break;

			}
		}

	}
}


