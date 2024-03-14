package ex.test.ch13;

class ThreadEx16 {
	public static void main(String args[]) {
		RunImplEx16 r = new RunImplEx16();
		Thread th1 = new Thread(r, "*");
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");
		th1.start();
		th2.start();
		th3.start();
		try {
			System.out.println("--------------");
			Thread.sleep(2000);//메인
			
			th1.suspend();
			System.out.println("--------------");
			Thread.sleep(2000);
			
			th2.suspend();
			System.out.println("--------------");
			Thread.sleep(3000);
			
			th1.resume();	
			System.out.println("--------------");
			Thread.sleep(3000);
			
			th1.stop();		
			th2.stop();
			System.out.println("--------------");
			Thread.sleep(2000);
			
			th3.stop();
		} catch (InterruptedException e) {}
	} // main
}

class RunImplEx16 implements Runnable {
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
		}
	} // run()
}