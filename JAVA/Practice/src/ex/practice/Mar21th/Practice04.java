package ex.practice.Mar21th;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

class Student {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
}

public class Practice04 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 90), new Student("김길동", 70));

		Iterator<Student> iter = list.iterator();
		while (iter.hasNext()) {
			Student s = iter.next();
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name+"__"+score);
		}
		
		Stream<Student> str = list.stream();
		str.forEach(s ->{ //for(Student s: list)와 유사
			String name =s.getName();
			int score = s.getScore();
			System.out.println(name+"__"+score);
		});
	}
}
