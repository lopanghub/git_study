package ex.practice.Mar15th;
import java.util.ArrayList;
public class Practice06 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		list.add("hello");
		list.add("hello");
		list.add("hello");
		list.add("hello");
		
		//기본적인 for문 
		//초기화; 조건식; 증감문
		for(int i = 0; i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		//향상된 for문
		//변수선언 : 배열 or 컬렉션
		for(String s : list) {
			System.out.print(s);
		}
	}
}
