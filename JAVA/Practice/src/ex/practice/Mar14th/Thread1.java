package ex.practice.Mar14th;

public class Thread1 {
	public static void main(String[] args) {
		Thread1_1 t1 = new Thread1_1();  //스레드 만드는 방식 두가지
		
		Runnable r = new Thread1_2();
		Thread t2 = new Thread(r);
	}
}

class Thread1_1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

class Thread1_2 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
