package ex.test.ch12;

public class Card {
	int number;
	String kind;
	public Card() { // 기본 생성자
		this(1, "card");//다른 생성자를 호출하는 메서드
	}
	public Card(int number, String kind) {
		this.number = number;
		this.kind = kind;
	}
	
	public String cardView() {
		return kind+"_"+number;
	}
}
