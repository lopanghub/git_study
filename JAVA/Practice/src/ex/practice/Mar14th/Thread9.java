package ex.practice.Mar14th;

public class Thread9 {
	public static void main(String[] args) {
		Thread9_1 th1 = new Thread9_1();
		Thread9_2 th2 = new Thread9_2();
		th2.setPriority(7);
		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th2(|) : " + th2.getPriority());
		th1.start();
		th2.start();
	}
}

class Thread9_1 extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.print("-");
		}
	}
}

class Thread9_2 extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.print("|");
		}
	}
}