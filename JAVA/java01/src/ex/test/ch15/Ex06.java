package ex.test.ch15;
import java.util.TreeSet;
public class Ex06 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(7); ts.add(1); ts.add(100);
		ts.add(70); ts.add(45); ts.add(20);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.lower(45));
		System.out.println(ts.higher(45));
		System.out.println(ts.floor(45));
	}
}
