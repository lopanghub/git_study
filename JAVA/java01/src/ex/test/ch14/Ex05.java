package ex.test.ch14;
import java.util.*;
public class Ex05 {
	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 50, 3, 5, 7, 8, 9, 2, 3 };
		// num 배열의 모든 데이터 출력하는 코드 작성
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		// 다른 방법 생각해보 자
		// 변수선언: 배열이나 컬렉션 객체 for each문
		for(int x : num) {
			System.out.print(x+" ");
		}
	}

}
