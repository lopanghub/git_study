package ex.practice.Mar21th;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TEST03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("숫자를 입력하시오 : ");
		int n = s.nextInt();
		if (n < 0 || n > 500000) {
			System.out.println("1~500000까지의 숫자를 입력하시오");
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(i, i + 1);
		}

		for (int i = n; i > 0; i--) {
			if (list.size() > 1) {
				Integer change = list.get(1);
				list.remove(1);
				list.add(change);
				list.remove(0);
			}
		}
		System.out.println(list);

	}
}
