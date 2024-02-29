package ex.text.ch04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		aaa : 
		for(int x=2; x<=9; x++) {
			for(int y=1; y<=9 ; y++) {
				System.out.println(x+" X "+y+" = "+(x*y));
				if(y==3) {
					break aaa;//if 가 들어간 반복문만 종료 
							  //aaa 넣으면 aaa 반복문 종료
				}
			}
		}
		
		//
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 = ");
		int count = sc.nextInt();
		
		for(int i = 1 ; i<10; i++) {
			System.out.println(count+"X"+i);
		}
	}
}
