package ex.test.ch10;

public class Ex04 {

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a);
		System.out.println(a.hashCode());
		
		A b = new B();
		System.out.println(b);
//		System.out.println(b.name);
		//당장 여기선 a의 네임을 사용하지 못한다
//		System.out.println(b.getNameA());
		//B클래스에서 메서드를 만들어야 한다

		A c = new C();
		I i = new C();
		
		
	}

}
