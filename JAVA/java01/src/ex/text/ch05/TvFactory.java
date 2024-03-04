package ex.text.ch05;

public class TvFactory {

	public static void main(String[] args) {
		// 객체 = 제품 생성
//		Tv t1 = new Tv(); // Tv 객체생성
//		Tv t2;// 선언, 객체 생성은 아니다 
//		Tv t3 = new Tv("sam", -200, -100);
//		new Tv(); //이렇게만해도 생성자 호출됨
//	
//		Ex01 e = new Ex01(); // 모든 클래스는 설계도 객체 생성이 가능하다
//		String s = new String();
//		Object o1 = new Object();
//		
//		
//		System.out.println(t1.brand);
//		
//		System.out.println(t3.brand);
//		System.out.println(t3.channel);
//		System.out.println(t3.vol);
//		
//		System.out.println(t1.w+t3.h);
		
		Tv t1 = new Tv();
		Tv t2 = new Tv(50, 10);
		Tv t3 = new Tv("sam", 100, 50);
		
		System.out.println(t1.brand+" / "+ t1.channel + " / "+t1.vol);
		System.out.println(t2.brand+" / "+ t2.channel + " / "+t2.vol);
		System.out.println(t3.brand+" / "+ t3.channel + " / "+t3.vol);
		
		
	}

}
