package ex.test.ch10;

public class Tv_main {

	public static void main(String[] args) {
		// 객체 생성
		Tv t1 = new Tv();
		Tv t2 = new Tv(10);
		
		t1.channel = 50;
		
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		System.out.println(Tv.power);
		t1.power = true;
		System.out.println(t1.power); //가능은 하지만 power가 인스턴스 변수가 되는건 아니다
		System.out.println(t2.power);
		System.out.println(Tv.power);
		
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer(98);
		StringBuffer sb3 = new StringBuffer("자고싶다");
		
		
		// Tv chValue[0]
		System.out.println(Tv.chValue[0]);
		
		
	}

}
