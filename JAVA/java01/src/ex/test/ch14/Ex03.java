package ex.test.ch14;
import java.util.*;
public class Ex03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(10); //초기 용량 10 데이터는 없음
		list.add(100); list.add(200);
		
		ArrayList list2 = new ArrayList(list); //list를 넣어주고 생성
		list2.add(300); list2.add(400);
		System.out.println(list2);
		
		System.out.println(list2.get(0)); //get 메서드 0번째 반환
		
		if(list2.contains(100)) {//검색기능
			System.out.println("있다");
		}
		
		Object obj = list2.get(0); //컬렉션은 모든타입이 들어ㅏ서 오브젝트로 받아야됨
		if(obj instanceof Integer) {
			//막상 꺼낼때 확인해야되서 불편함 >> <E> 지정된 타입으로 넣는걸 권장
		}
	}
}
