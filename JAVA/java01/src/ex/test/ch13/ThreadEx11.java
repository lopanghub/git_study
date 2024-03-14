package ex.test.ch13;

class ThreadEx11 implements Runnable  {
	static boolean autoSave = false;
	public static void main(String[] args) {
		Thread t = new Thread(new ThreadEx11());
		//t.setDaemon(true);		
		t.start();
		for(int i=1; i <= 20; i++) {
			try{
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			System.out.println(i);			
			if(i==5)
				autoSave = true;
		}
		System.out.println("프로그램을 종료합니다");
	}
	public void run() {
		while(true) {
			try { 
				Thread.sleep(3 * 1000);
			} catch(InterruptedException e) {}	
			
			if(autoSave) {
				autoSave();
			}}}
	public void autoSave() {
		System.out.println("파일이 자동 저장 됩니다.");
	}}