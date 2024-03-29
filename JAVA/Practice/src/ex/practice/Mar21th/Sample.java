package ex.practice.Mar21th;

import java.util.HashSet;
import java.util.Set;

public class Sample {
	public static void main(String[] args) {
		int [] arr = {80, 21, 33, 70, 91, 70, 56, 60, 21, 100, 42, 30, 91};
		Set<Integer> set = new HashSet<Integer>();
		
		for(int no : arr) {
			set.add(no);
		}
		
		String s = "";
		for(int i : set) {
			if (i%7==0) {
				s +=(i+"");
			}
		}
		System.out.println(s);
	}
}
