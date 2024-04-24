package ex.practice.Mar15th;

import java.util.ArrayList;
import java.util.Iterator;

public class Practice02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("AAA");
		list.add("AAA");
		list.add("AAA");
		list.add("AAA");
		list.add("AAA");
		list.add("AAA");
		System.out.println(list);

//		for(String s : list) {
//			list.remove(0);
//		}

		// Iterator로 삭제
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()) {
//			String item = iterator.next();
//			if("AAA".equals(item)){
//				iterator.remove();
//			}
//		}

		// for 역순
//		for(int i =list.size()-1;i>=0;i--) {
//			list.remove(0);
//		}
		// while
//		while(list.size()>0) {
//			list.remove(0);
//		}

		// removeAll로 제거
		ArrayList<String> remove = new ArrayList<>();
		for (String s : list) {
			remove.add(s);
		}
		list.removeAll(remove);
		System.out.println(list);
	}
}
