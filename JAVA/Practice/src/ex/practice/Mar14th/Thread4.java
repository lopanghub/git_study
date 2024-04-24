package ex.practice.Mar14th;

public class Thread4 {
	static long startTime = System.currentTimeMillis();

	public static void main(String[] args) {
		Thread4_1 t1 = new Thread4_1();
		t1.start();
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.print("소요시간 1 : " + (System.currentTimeMillis() - startTime));

	}
}

class Thread4_1 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");
		}
		System.out.print("소요시간 2 : " + (System.currentTimeMillis() - Thread4.startTime));
	}
}