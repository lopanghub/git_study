package ex.test.ch15;

import java.util.HashMap;
import java.util.Map;

public class Ex04 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("hello", "World"); //key, value
		map.put(77, "Data");
		map.put("java", 1234);
		
		map.put(77, "korea");//키의 중복은 허용되지 않는다.
		System.out.println(map);
		
		System.out.println(map.get(77));
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.containsKey(77));
		
		
	}
}
