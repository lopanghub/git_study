package ex.test.ch15;

import java.util.*;

public class Ex05 {
	public static void main(String[] args) {
		
	HashMap<String, String> map = new HashMap<>();
	map.put("java", "1234");
	map.put("asdf", "1111");
	map.put("asdf", "1234");
	
	Scanner s = new Scanner(System.in);
	
	while(true) {
		System.out.println("id와 패스워드를 입력하세요");
		System.out.print("id : ");
		String id = s.nextLine().trim();
		
		System.out.print("password : ");
		String password = s.nextLine().trim();
		System.out.println();
		
		if(!map.containsKey(id)) {
			System.out.println("입력하신 id는 존재하지 않습니다 다시 입력하세요");
			continue;
		} else {
			if(!(map.get(id)).equals(password)){
				System.out.println("비밀번호가 일치 하지 않습니다. 다시 입력하세요");
			} else {
				System.out.println("id와 비밀번호가 일치합니다");
				break;
			}
		}
	}
}
}
