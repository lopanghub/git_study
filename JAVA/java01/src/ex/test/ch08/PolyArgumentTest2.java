package ex.test.ch08;

class Product 
{
	int price;			// ��ǰ�� ����
	int bonusPoint;		// ��ǰ���� �� �����ϴ� ���ʽ�����

	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}

	Product() {
		price = 0;
		bonusPoint = 0;
	}
}

class Tv extends Product {
	Tv() {
		super(100);	
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer {			// ��, ������ ��� ���
	int money = 1000;	// �����ݾ�
	int bonusPoint = 0;	// ���ʽ�����
	Product[] item = new Product[10];	// ������ ��ǰ�� �����ϱ� ���� �迭
	int i =0;			// Product�迭�� ���� ī����

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}

		money -= p.price;	        // ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;	// ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		item[i++] = p;		        // ��ǰ�� Product[] item�� �����Ѵ�.
		System.out.println(p + "을/를 구입하셨습니다.");
	}

	void summary() {		    // ������ ��ǰ�� ���� ������ ����ؼ� ���� �ش�.
		int sum = 0;		 	// ������ ��ǰ�� �����հ�
		String itemList =""; 	// ������ ��ǰ���

		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i=0; i<item.length;i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}

		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

class PolyArgumentTest2 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
	}
}