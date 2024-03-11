package ex.test.ch10;

public class C extends A implements I{ //추상메서드는 자손에서 무조건 오버라이딩

	@Override
	public void getCount() {
		System.out.println(I.COUNT);
		System.out.println(COUNT);
	}
	
	@Override // 해도 되고 안해도 되고
	public String toString() {
		return "C-class";
	}
}
