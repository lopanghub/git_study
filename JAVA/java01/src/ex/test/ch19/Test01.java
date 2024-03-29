package ex.test.ch19;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test01 {
	public static void main(String[] args) {
		//stream 활용 중복되지않은 7의 배수
		int [] arr = {80, 21, 33, 70, 91, 70, 56, 60, 21, 100, 42, 30, 91};
		//arr+100; 자바에는 배열전체에 연산하는 기능은 없다 스트림을 쓰는 이유 
		
		//int 배열을 IntStream으로 변환
		IntStream is = Arrays.stream(arr);
		
		//stream 요소를 Integer 객체로 변환
		Stream<Integer> ss = is.boxed();
		
		//중복값 제거 
		ss = ss.distinct();
		
		//7의 배수만 선택
		ss = ss.filter(n -> n%7==0);
	
		//Integer -> String으로 변환
		Stream<String> strStream = ss.map(n->""+n);
		
		//스트림을 String 타입으로 변환
		String result = strStream.reduce("", (a,b) -> a+b);
		System.out.println(result);
		
		//최적화 작업
		String r =Arrays.stream(arr)
				.boxed()
				.distinct()
				.filter(n -> n%7==0)
				.map(n->""+n)
				.reduce("",(a,b)->a+b);
		System.out.println(r);
	}
}
