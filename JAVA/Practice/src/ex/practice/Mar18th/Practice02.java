package ex.practice.Mar18th;
import java.util.*;
public class Practice02 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(100); set.add("helloe"); set.add(3.14);
		set.add(200); set.add(null); set.add(null);
		set.add(new Data());
		System.out.println(set);
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Object obj = iter.next();
			System.out.println(obj);
		}
	}
}

class Data{
	
}