package ex.practice.Mar14th;

public class Thread3 {
	public static void main(String[] args) {
		Thread3_1 t1 = new Thread3_1();
		t1.run();
	}
}

class Thread3_1 extends Thread{
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