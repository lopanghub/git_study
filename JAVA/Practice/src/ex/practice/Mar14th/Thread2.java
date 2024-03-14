package ex.practice.Mar14th;

public class Thread2 {
	public static void main(String[] args) {
		Thread2_1 t1 = new Thread2_1();
		//t1.start();  // 멀티스레드 스레드2_1이 새로 생성됨 main과 run이 따로 돈다 
		t1.run();  // 싱글스레드 스택형 
		System.out.println("run과 start의 차이");
	}
}

class Thread2_1 extends Thread{
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
