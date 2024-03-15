package ex.test.ch14;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		// add();
		list.add(100);
		list.add("hello");
		list.add(3.14);
		list.add(false);
		System.out.println(list);
		list.add("world");
		System.out.println(list);
		list.add(0,"kor");
		System.out.println(list);

		//E = element 모든 값을 넣을 수 있다(컬렉션에서만)
		List list2 = new ArrayList();
		list2.add("AAA");
		list2.add("BBB");
		
		System.out.println(list2);
		list.add(list2);
		System.out.println(list);
		list.addAll(list2);
		System.out.println(list);
		System.out.println(list.size());
		
		list.clear(); //list 비우기
		System.out.println(list.size());
		
		
		list2.set(0, "kor"); //set - 변경
		System.out.println(list2);
		
		list2.remove(0); // 삭제
		System.out.println(list2);
	}
}
