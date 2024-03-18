package ex.test.ch15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		for(int i =0;set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
		
		List list = new ArrayList(set);
		Collections.sort(list); //정렬
		System.out.println(list);
	}
}
