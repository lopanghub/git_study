package ex.practice.Mar18th;
import java.util.*;
public class Practice04 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("hello", "world");
		map.put(77, "data");
		map.put("java", 1234);
		
		map.put(77, "korea");
		System.out.println(map);
		
		System.out.println(map.get(77));
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.containsValue(1234));
	}
}
