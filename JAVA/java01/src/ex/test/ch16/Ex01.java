package ex.test.ch16;
import java.util.Stack;
public class Ex01 {
	public static void main(String[] args) {
		Stack<String> back = new Stack<>();
		Stack<String> forward = new Stack<>();
		Stack<String> s = new Stack<>();
		
		s.push("naver");
		s.push("google");
		s.push("oracle");
		s.push("daum");
		
		System.out.println(s);
		System.out.println(s.pop()); //pop /stack에서 제거
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		
		
		back.push("naver");
		back.push("news");
		back.push("sports");
		back.push("NBA");
		
		System.out.println("뒤로 가기");
		forward.push(back.pop());
		System.out.println(back.peek()+"--"+forward.peek());
		
		System.out.println("뒤로 가기");
		forward.push(back.pop());
		System.out.println(back.peek()+"--"+forward.peek());
		
		back.push("google");
		forward.clear();
	}
}
