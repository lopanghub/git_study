package ex.test.ch15;
import java.util.*;
public class Ex10 {
	public static void main(String[] args) {
		//1. 배열에 중복된 데이터를 제거하고 출력하는 프로그램을 작성하시오.
		//(데이터 출력시 순서는 상관 없음)
		int arr[] = {10,20,30,40,50,60,70,40,30,20};
		List<Integer> list = new ArrayList<>();
		
		for(int i : arr) {
			if(!list.contains(i)) {
				System.out.println(i+" true");
				list.add(i);
			} else {
				System.out.println(i+" 중복");
			}
		}
		System.out.println();
	}
}
