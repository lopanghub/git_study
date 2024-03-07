package ex.practice.Mar7th;

public class Practice05 {
	public static void main(String[] args){
		Super s1 = new Super();
		Ultra u1 = new Ultra();
		Ultra u2 = null;
		
		Super s = new Ultra();
		//Ultra u = new Super();
		
		System.out.println(s1.s);
		s1.getName();
		
		if(u1 instanceof Super) {//상속관계인가?&&자손인가?
			System.out.println("가능");
			s1 = (Super)u1;
		} else {
			System.out.println("불가능");
			s1 = new Super();
		}
		System.out.println(s1);
		System.out.println(u1);
}
}
