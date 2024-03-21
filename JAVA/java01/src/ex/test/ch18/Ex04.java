package ex.test.ch18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

class Student{
	private String name; //접근 불가
	private int score;
	public Student (String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {return name;}
	public int getScore() {return score;}
}

public class Ex04 {
	public static void main(String[] args) {
//		List<Student> list = new ArrayList<>();
//		list.add(new Student("김자바",90));
		List<Student> list = Arrays.asList(
				new Student("홍길동", 90),
				new Student("김길동", 70));
		
		Iterator<Student> iter= list.iterator();
		while(iter.hasNext()) {
			Student s = iter.next();
			String name =s.getName();
			int score = s.getScore();
			System.out.println(name+"-"+score); // 같은 코드 
		}
		
		
		
		Stream<Student> str= list.stream();
		str.forEach(s -> { //for( Student s : list)
			String name= s.getName();
			int score = s.getScore();
			System.out.println(name+"-"+score);
		});
	}
}
