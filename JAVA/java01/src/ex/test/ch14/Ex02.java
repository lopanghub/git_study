package ex.test.ch14;

import java.util.ArrayList;

public class Ex02 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("AAA");
		list.add("BBB");
		list.add("CCC");
		list.add("DDD");
		System.out.println(list);
		
		//remove() 메서드 사용
			while(list.size()>0) {
			list.remove(0);
		}
		System.out.println(list);
	}
}	
