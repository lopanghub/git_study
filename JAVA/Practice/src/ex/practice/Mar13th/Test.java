package ex.practice.Mar13th;

import java.math.BigInteger;
import java.util.*;
import java.util.regex.Pattern;

public class Test {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		Test t = new Test();

		// t.No1();
		// t.No2();
		// t.No3();
		t.No5();
		// t.No6();
		// t.No7();
		// t.No8();
	}

	// 1번 10이하의 정수를 입력 받고
	// 입력받은 횟수만큼 헬로월드 출력
	public void No1() {

		System.out.print("10 이하의 정수 입력 : ");
		int no = s.nextInt();
		if (1 <= no && no <= 10) {
			for (int i = 0; i < no; i++) {
				System.out.println("hello world");
			}
		} else {
			System.out.println("1~10 사이의 정수를 입력하세요");
		}
	}
	// 1번 끝

	// 2번 4567 받으면 4+5+6+7로 만들기
	public void No2() {
		System.out.print("정수를 입력하시오");
		String no = s.nextLine();
		int sum = 0;
		class Check {
			public boolean isNumeric(String no) {
				return Pattern.matches("^[0-9]*$", no);
			}
		}
		Check c = new Check();
		if (c.isNumeric(no)) {
			for (int i = 0; i < no.length(); i++) {
				char index = no.charAt(i);
				System.out.print(index + "+");
				sum += index - 48;
			}
		} else {
			System.out.println("정수를 입력하세요");
		}
		System.out.print("= " + sum);
	}
	// 2번끝

	// 3번 1부터 100까지의 합과 1부터 100까지의 곱
	public void No3() {
		int sum = 0;
		int mul = 1;

		// 합
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합 : " + sum);

		// 곱
//		for(int i =1; i<=100;i++) {
//			String no = i;
//			BigInteger b = new BigInteger("no");
//			b.multiply(no);
//		}
//		System.out.println("1부터 100까지의 곱 : "+mul);
	}
	// 3번끝

	// 5번 문자열의 첫번째 글자만 대문자
	public void No5() {
		System.out.println("여러 단어를 입력하세요");
		String word = s.nextLine();
		String[] arr = word.split(" ");
		String result = "";

		for (int i = 0; i < arr.length; i++) {
			String firstWord = arr[i].substring(0, 1).toUpperCase();
			String otherWord = arr[i].substring(1);
			result = firstWord + otherWord;

			System.out.print(result + " ");
		}

	}
	// 5번 끝

	// 6번 로꾸꺼로 출력
	public void No6() {

	}

	// 7번 문자열 각단어 첫번째만 리턴
	public void No7() {
		System.out.println("여러 단어를 입력하세요");
		String word = s.nextLine();
		String[] arr = word.split(" ");

		for (int i = 0; i < arr.length; i++) {
			String firstWord = arr[i].substring(0, 1);
			System.out.print(firstWord);
		}

	}
	// 7번 끝

	// 8번 arr 매개변수 - > 공백 /는 :로 변경
	public void No8() {
		System.out.println("예시문 : basic/java_web/jsp_framework/spring");
		String word = "basic/java_web/jsp_framework/spring";
		String result = "";

		result = word.replace("/", ":");
		result = result.replace("_", " ");
		System.out.println(result);

	}

}
