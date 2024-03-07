package ex.test.ch08;

class DeckTest 
{
	public static void main(String args[]) 
   {
		Deck d = new Deck();	// ī�� �� ��(Deck)�� �����.
		Card c = d.pick(0);		// ���� ���� ���� ���� ī�带 �̴´�.
		System.out.println(c);
		d.shuffle();			// ī�带 ���´�.
		c = d.pick(0);			// ���� �Ŀ� ���� ���� ī�带 �̴´�.
		System.out.println(c);
	}
}

// DeckŬ����
class Deck {
	final int CARD_NUM = 52;	// ī���� ����
	Card c[] = new Card[CARD_NUM]; //카드객체 52개의 null값을 가진 배열

	Deck () {	// Deck�� ī�带 �ʱ�ȭ�Ѵ�.
		int i=0;

		for(int k=Card.KIND_MAX; k > 0; k--) {
			for(int n=1; n < Card.NUM_MAX + 1 ; n++) {
				c[i++] = new Card(k, n); // 카드 데이터 생성
			}
		}
	}

	Card pick(int index) {	// ������ ��ġ(index)�� �ִ� ī�� �ϳ��� �����Ѵ�.
		if(0 <= index && index < CARD_NUM)
			return c[index];
		else
			return pick(); //아래 Card pick() 으로
	}

	Card pick() {			// Deck���� ī�� �ϳ��� �����Ѵ�.
		int index = (int)(Math.random() * CARD_NUM);
		return pick(index);
	}

	void shuffle() {			// ī���� ������ ���´�.
		for(int n=0; n < 1000; n++) {
			int i = (int)(Math.random() * CARD_NUM);
			Card temp = c[0];	// temp 값에 0번 배열 값을 넣고 i 값을 0번에 넣
			c[0] = c[i];		// i 값에 temp 값을 넣어 0과 i 값 변경을 천번 반복
			c[i] = temp;
		}
	}
} // DeckŬ������ ��

// CardŬ����
class Card {
	static final int KIND_MAX = 4;	// ī�� ������ ��
	static final int NUM_MAX  = 13;	// ���̺� ī�� ��

	static final int SPADE   = 4;
	static final int DIAMOND = 3;
	static final int HEART   = 2;
	static final int CLOVER  = 1;

	int kind;
	int number;

	Card() {
		this(SPADE, 1);
	}

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		String kind="";
		String number="";

		switch(this.kind) {
			case 4 :
				kind = "SPADE";
				break;
			case 3 :
				kind = "DIAMOND";
				break;
			case 2 :
				kind = "HEART";
				break;
			case 1 :
				kind = "CLOVER";
				break;
			default :
		}

		switch(this.number) {
			case 13 :
				number = "K";
				break;
			case 12 :
				number = "Q";
				break;
			case 11 :
				number = "J";
				break;
			default :
				number = this.number + "";
		}
		return "kind : " + kind + ", number : " + number;
	} // toString()�� ��
} // CardŬ������ ��