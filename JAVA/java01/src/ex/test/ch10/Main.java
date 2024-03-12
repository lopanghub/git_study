package ex.test.ch10;

public class Main {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		 System.out.println("chValue 배열의 첫 번째 값: " + Tv.chValue[0]);
		
		System.out.println();
		t1.powerChange();
		t1.view();
		t1.channelDown();
		t1.view();
		t1.channelUp();
		t1.view();

	}

}
