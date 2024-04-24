package ex.practice.Mar18th;

import java.util.*;

public class Practice03 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num);
		}
		System.out.println(set);

		List list = new ArrayList(set);
		Collections.sort(list);
		System.out.println(list);
	}
}
