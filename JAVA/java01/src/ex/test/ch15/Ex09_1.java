package ex.test.ch15;


import java.util.*;
import java.util.Map.Entry;

public class Ex09_1 {
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
		List<Integer> scores = new ArrayList(score.keySet());
		int sum = 0;
		for (int n : scores) {
			sum += n;
		}
		double avg = (double)sum/scores.size();
		System.out.println("평균 점수 :"+avg);
		
		Set<Entry<Integer, String>> set = score.subMap((int)avg, 101).entrySet();
//		Iterator<Entry<Integer, String>> iter = set.iterator();
//		String names = "";
//		while(iter.hasNext()) {
//			Entry<Integer,String> ent = iter.next();
//			names += ent.getValue()+" ";
//		}
//		System.out.println("평균이상 : "+names);
//		
//		//간단하게
//		Map<Integer, String> sm = score.subMap((int)avg, 101);
//		System.out.println(sm.values());
		String names = "";
		for (Entry<Integer,String> entry: set) {
			names += entry.getValue();
		}
		System.out.println(names);
	}
}
