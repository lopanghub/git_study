package ex.practice.Mar14th;

import javax.swing.JOptionPane;

public class Thread8 {
	static boolean inputCheck = false;

	public static void main(String[] args) {
		Thread8_1 th1 = new Thread8_1();
		Thread8_2 th2 = new Thread8_2();
		th1.start();
		th2.start();
	}
}

class Thread8_1 extends Thread {
	public void run() {
		for (int i = 10; i > 0; i--) {
			if (Thread8.inputCheck) {
				return;
			}
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {

			}
		}
		System.out.println("10초간 입력이 없어 종료됩니다");
		System.exit(0);
	}
}

class Thread8_2 extends Thread {
	public void run() {
		System.out.println("10초 안에 입력하세요.");
		String input = JOptionPane.showInputDialog("아무값이나 입력");
		Thread8.inputCheck = true;
		System.out.println("입력값은 " + input);
	}
}