package ex.test.ch18;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Ex03 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("AAA","BBB","CCC","DDD");
		//new ArrayList(); list.add("AAA") 한번에 처리
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			String value = iter.next();
			System.out.println(value);
		} // 기존 처리 방식
		
		Stream<String> str = list.stream();
		str.forEach(name -> System.out.println(name));
		//같은 동작 익숙해지기 쉽지 않다
	}
}
//신기술 세미나 / 포럼 활동