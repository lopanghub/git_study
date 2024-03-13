package ex.test.ch12;

public class Ex04 {

	public static void main(String[] args) {
		Card c1 = new Card(7, "heart");
		System.out.println(c1.cardView());
		
		//익명 클래스
		//익명 클래스가 카드 클래스를 상속 받음
		//재사용이 불가능함
		Card c2 = new Card(10, "heart") {
			@Override
			public String cardView() {
				if(kind == "heart") {
					kind = "하트";
				}
				return kind+"_"+number;
			}
		};
		System.out.println(c2.cardView());
		
		Card c3 = new Card(2, "heart");
		System.out.println(c3.cardView());
	}

}
