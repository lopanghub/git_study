package ex.practice.Mar15th;

import java.util.*;

public class Practice03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(10);// 초기용량 10
		list.add(100);
		list.add(200);

		ArrayList list2 = new ArrayList(list);
		list2.add(300);
		list2.add(list);
		System.out.println(list2);

		System.out.println(list2.get(3));
		if (list2.contains(300)) {
			System.out.println("있다");
		}

		Object s = list.get(0);
	}
}
