package ex.test.ch15;


import java.util.*;
import java.util.Map.Entry;

public class Ex09 {
	public static void main(String[] args) {
		TreeMap<Integer, String> score = new TreeMap<>();
		Scanner scan = new Scanner(System.in);

		while (score.size() < 5) {
			System.out.print("이름 : ");
			String name = scan.nextLine();
			System.out.print("점수 : ");
			int num = Integer.parseInt(scan.nextLine());
			score.put(num, name);
		}
		//점수 평균 : 몇 점
		//평균 이하 : 명단....
		Set<Entry<Integer, String>> set = score.entrySet();
		System.out.println(set);
		
		Iterator<Entry<Integer, String>> iter = set.iterator();
		int sum = 0;
		while(iter.hasNext()) {
			Entry<Integer, String> ent = iter.next();
			 sum = sum+ ent.getKey();
		}
		int average = sum/score.size();
		
		String names="";
		
		for(Entry<Integer, String> ent : score.entrySet())
			if (ent.getKey() < average) {
				names +=ent.getValue();
			}
		
		System.out.println("평균 이하 : "+ names);
	}
}
