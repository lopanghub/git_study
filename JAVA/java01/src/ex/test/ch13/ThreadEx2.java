package ex.test.ch13;

class ThreadEx2 {
	public static void main(String args[]) throws Exception {
		MyThreadEx2_1 t1 = new MyThreadEx2_1();
		t1.start(); // 멀티 스레드 메인과 런이 따로 돈다
		//t1.run(); // run()으로 실행하면 싱글 스레드
		System.out.println("종료");
	}}
class MyThreadEx2_1 extends Thread {
	public void run() {
		throwException();
	}
	public void throwException() {
		try {
			throw new Exception();		
		} catch(Exception e) {
			e.printStackTrace();	
		}
	}
}