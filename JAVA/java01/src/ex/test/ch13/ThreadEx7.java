package ex.test.ch13;

import javax.swing.JOptionPane;
class ThreadEx7 {
	public static void main(String[] args) throws Exception 	{
		ThreadEx7_1 th1 = new ThreadEx7_1();
		th1.start();
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���."); 
		System.out.println("�Է��Ͻ� ���� " + input + "�Դϴ�.");
	}
}
class ThreadEx7_1 extends Thread {
	public void run() {
		for(int i=10; i > 0; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch(Exception e ) {}
			
		}}}