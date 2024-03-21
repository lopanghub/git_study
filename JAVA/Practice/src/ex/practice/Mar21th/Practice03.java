package ex.practice.Mar21th;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Practice03 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("AAA","BBB","CCC", "DDD");
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String value = iter.next();
			System.out.println(value);
		} // 기존의 반복자를 통한 처리방식
		
		Stream<String> str = list.stream();
		str.forEach(name -> System.out.println(name));
		//스트림을 이용한 같은 동작 굉장히 낯설다
	}
}
