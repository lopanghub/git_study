package ex.test.ch14;
import java.util.*;
public class Ex04 {
	public static void main(String[] args) {
		//해당 리스트는 String만 대입 가능
		ArrayList<String> list = new ArrayList<>();
		//list.add(100); // int 값을 넣어 에러 발생
		list.add("hello"); list.add("world");
		
		String str = list.get(0);
		
		ArrayList<A> list2 = new ArrayList<>();
		A a = new A();
		B b = new B();
		list2.add(a);
		list2.add(b);
		list2.add(new C());
		System.out.println(list2);
		
		list2.get(1);
	}
}
