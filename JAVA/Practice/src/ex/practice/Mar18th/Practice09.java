package ex.practice.Mar18th;

import java.util.*;
import java.util.Map.Entry;

public class Practice09 {
	public static void main(String[] args) {
		TreeMap<String, Integer> score = new TreeMap();
		Scanner scan = new Scanner(System.in);

		while (score.size() < 5) {
			System.out.println("이름 : ");
			String name = scan.nextLine();
			System.out.println("점수 : ");
			int num = Integer.parseInt(scan.nextLine());
			score.put(name, num);
		}
		List<Integer> scores = new ArrayList(score.values());
		int sum = 0;
		for (int i : scores) {
			sum += i;
		}
		double avg = (double) sum / scores.size();
		System.out.println("평균 점수 : " + avg);

		List<String> underAvg = new ArrayList<>();
		for (Entry<String, Integer> ent : score.entrySet()) {
			if (ent.getValue() <= avg) {
				underAvg.add(ent.getKey());
			}
		}
		System.out.println("평균 이하 : " + underAvg);

	}
}
