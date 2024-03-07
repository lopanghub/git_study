package ex.test.ch08;

public class Ex04 {
	public static void main(String[] args) {
		Super s1 = null;
		Game g1 = new Game();
		Game g2 = null;
		
		System.out.println(g1.s+" "+g1.count);
		g1.getName();
		g1.getPoint();
		
		s1 = (Super)g1; 
		System.out.println(s1);
		System.out.println(g1);
		
//		double a =3.14;
//		int b = (int)a;
		
		s1.getName();
		//s1.getPoint(); //int와 double에서의 소수점 같은 부분
		
		
		g2 = (Game)s1;
		System.out.println(g2.s+" "+g2.count);
		g2.getName();
		g2.getPoint();
		
		System.out.println(g1 == g2);
		
		Object obj = (Object)g2;
		System.out.println(obj==s1);//두 참조형 변수의 주소가 같은가?
		
		
	}
}
