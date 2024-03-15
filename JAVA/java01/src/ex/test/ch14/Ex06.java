package ex.test.ch14;

import java.util.ArrayList;

public class Ex06 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("util");
		list.add("hello");
		
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(String s : list) {
			System.out.println(s);
		}
	}
}
