package ex.practice.Mar18th;
import java.util.*;
import java.util.Map.Entry;

public class Practice08 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(87,  "java");
		map.put(98,  "apple");
		map.put(75,  "sun");
		map.put(95,  "oracle");
		map.put(80,  "ibm");
		System.out.println(map);
		System.out.println(map.firstKey());
		System.out.println(map.get(map.firstKey()));
		
		Map.Entry<Integer, String> entry = map.firstEntry();
		System.out.println(entry);
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		
		Set<Entry<Integer, String>> set = map.entrySet();
		System.out.println(set);
		
		Iterator<Entry<Integer,String>> iter = set.iterator();
		while(iter.hasNext()) {
			Entry<Integer, String> ent = iter.next();
			System.out.println(ent.getKey()+"------"+ent.getValue());
		}
		
		
		
	}
}
