package ex.practice.Mar15th;

import java.util.*;

public class Practice04 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
//		list.add(100);

		String str = list.get(0);

		ArrayList<A> list2 = new ArrayList<>();
		A a = new A();
		B b = new B();
		list2.add(a);
		list2.add(b);
		list2.add(new C());
		System.out.println(list2);
	}
}
