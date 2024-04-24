package ex.practice.Mar19th;

import java.util.Stack;

public class Practice01 {
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();

		s.push("naver");
		s.push("daum");
		s.push("kakao");
		s.push("google");

		System.out.println(s);
		System.out.println(s.pop()); // stack에서제거
		System.out.println(s);
		System.out.println(s.peek()); // 제거x
		System.out.println(s);

		Stack<String> back = new Stack();
		Stack<String> forward = new Stack();

		back.push("naver");
		back.push("news");
		back.push("sports");
		back.push("NBA");

		System.out.println("뒤로 가기");
		forward.push(back.pop());
		System.out.println(back.peek() + "===" + forward.peek());

		// 새창으로 넘어갈 경우
		back.push("google");
		forward.clear();
	}
}
