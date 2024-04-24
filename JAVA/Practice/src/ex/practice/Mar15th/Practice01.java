package ex.practice.Mar15th;

import java.util.ArrayList;
import java.util.List;

public class Practice01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(100);
		list.add("hello");
		list.add(3.12);
		list.add(true);
		System.out.println(list);
		list.add("world");
		System.out.println(list);
		list.add(0, "kor");
		System.out.println(list); // 밀어넣기 덮어쓰기 아님

		List list2 = new ArrayList();
		list2.add("AAA");
		list2.add("ccc");

		list.add(list2);
		System.out.println(list);
		list.addAll(list2);
		System.out.println(list); // add와 addAll(Collection)의 차이

		list.clear();
		System.out.println(list.size());

		list2.remove(0);
		System.out.println(list2);
	}
}
