package ex.test.ch19;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
		System.out.println("N입력");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		// 카드를 저장할 컬렉션 큐
		Queue<Integer> cardQ = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			cardQ.add(i);
		}

		while (cardQ.size() > 1) {
			cardQ.poll(); // 큐의 첫번째 값을 꺼낸다.
			cardQ.add(cardQ.poll());
			System.out.println(cardQ);
		}
		System.out.println(cardQ);
	}
}
