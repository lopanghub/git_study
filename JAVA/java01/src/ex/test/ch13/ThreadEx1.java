package ex.test.ch13;

class ThreadEx1 {
	public static void main(String args[]) {
		ThreadEx1_1 t1 = new ThreadEx1_1();
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);	
		t1.start(); //새로운 스레드를 만들고 run() 실행
		t2.start();
		System.out.println("메인 종료");
	}}
class ThreadEx1_1 extends Thread {
	@Override
	public void run() {
		for(int i=0; i < 5; i++) {
			System.out.println(getName());
		}
		System.out.println("t1 종료");
	}	
}
class ThreadEx1_2 implements Runnable {
	public void run() {
		for(int i=0; i < 5; i++) {
		      System.out.println(
				  Thread.currentThread().getName());
		}
		System.out.println("t2 종료");
	}
}