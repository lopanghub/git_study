package ex.practice.Mar11th;

public class Tv_Main_Practice {

	public static void main(String[] args) {
		Tv t = new Tv();
		for (int k = 0; k < Tv.chValue.length; k++) {
			System.out.print(Tv.chValue[k] + " ");
		}
		System.out.println();

		t.channelChange(25);

		t.view();

		t.channelUpDown(-104);

	}

}
