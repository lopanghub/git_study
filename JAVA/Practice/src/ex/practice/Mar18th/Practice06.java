package ex.practice.Mar18th;
import java.util.TreeSet;
public class Practice06 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(7); ts.add(1); ts.add(100);
		ts.add(70);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.lower(34));
		System.out.println(ts.higher(34));
		System.out.println(ts.floor(34));
	}
}
