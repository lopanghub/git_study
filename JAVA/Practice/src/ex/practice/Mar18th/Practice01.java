package ex.practice.Mar18th;

import java.util.*;

public class Practice01 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		LinkedList<String> ll = new LinkedList<>();
		System.out.println(add1(al));
		System.out.println(add1(ll));
		System.out.println(add2(al));
		System.out.println(add2(ll));
	}

	public static long add1(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add(i + "");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add(10500 + "X");
		}

		long end = System.currentTimeMillis();
		return end - start;
	}
}
