package ex.test.ch15;

import java.util.HashSet;
import java.util.Iterator;

import ex.test.ch12.E;

public class Ex02 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(100); set.add("hello"); set.add(3.14);
		set.add(200); set.add(null); set.add(null);
		set.add(new Data()); set.add(new Data());
		System.out.println(set);
		// set은 인덱스가 없다 => get메서드가 없다 대신 iterator 를 사용
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Object obj = iter.next();
			System.out.println(obj );
		}
	}
}

class Data{
	
}
