package ex.test.ch07;

public class User_Phone {

	public static void main(String[] args) {
		MobilePhone m = new MobilePhone();
		System.out.println("브랜드 "+m.brand);
		m.brand="Apple";
		System.out.println("브랜드 "+m.brand);
		
		m.call("010-1111-1134");
	}

}
