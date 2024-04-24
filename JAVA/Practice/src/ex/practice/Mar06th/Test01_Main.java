package ex.practice.Mar06th;

public class Test01_Main {

	public static void main(String[] args) {

		// 9번
		Ex01 e = new Ex01();

		e.str();
		e.year();
		System.out.println(e.str);
		System.out.println(e.year);

		// 11번
		Ex02 e2 = new Ex02();
		e2.setA(3);
		e2.setP(false);
		e2.setD(6.66);
		System.out.println(e2.a);
		System.out.println(e2.isPlay);
		System.out.println(e2.d);

		// 13번
		MobilePhone s24 = new MobilePhone("삼성", 240, 100, 1.25);
		System.out.println(s24.brand);
		System.out.println(s24.width);
		System.out.println(s24.height);
		System.out.println(s24.weight);

		s24.makeCall();
		s24.receiveCall();
		s24.sendMessage();
		s24.receiveMessage("ㅗㅑ");

		// 14번

//		s24.phoneCall(01018293aa);

		// 15번
		int s = sum(-15, 119);
		System.out.println(s);

		// 16번
		Gugudan g = new Gugudan();
		g.gugudan(3);

	}

	static int sum(int a, int b) {
		if (a > 0 && b > 0) {
			return a + b;
		} else {
			return 0;
		}
	}

}
