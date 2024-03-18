package ex.practice.Mar18th;

import java.util.TreeSet;

public class Practice07 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("sksksk");
		ts.add("mapelk");
		ts.add("visutl");
		ts.add("teslea");
		ts.add("kiauni");
		ts.add("basek");
		ts.add("osca");
		ts.add("s");
		System.out.println(ts);
		
		System.out.println(ts.subSet("m", "s"));
		System.out.println(ts.subSet("m",true, "s", true));
	}
}
