package ex.practice.Mar18th;

import java.util.*;

public class Practice05 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("java", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");

		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("id 패스워드 입력");
			System.out.print("id : ");
			String id = s.nextLine();

			System.out.print("pw : ");
			String pw = s.nextLine().trim();
			System.out.println();

			if (!map.containsKey(id)) {
				System.out.println("없는 id 다시 입력");
				continue;
			} else {
				if (!(map.get(id)).equals(pw)) {
					System.out.println("비밀번호 불일치");
				} else {
					System.out.println("로그인 성공!");
					break;
				}
			}
		}
	}
}
