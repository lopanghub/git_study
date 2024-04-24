package ex.practice.Mar14th;

public class Practice02 {
	public static void main(String[] args) {
		stringSpeed();
		bufferSpeed();
	}

	public static void stringSpeed() {
		long start = System.currentTimeMillis();
		String data = "";
		for (int i = 1; i < 100000; i++) {
			data += i;
		}
		long end = System.currentTimeMillis();
		System.out.println("실행 시간 : " + (end - start));
	}

	public static void bufferSpeed() {
		long start = System.currentTimeMillis();
		StringBuffer data = new StringBuffer("1");
		for (int i = 1; i < 100000; i++) {
			data.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("실행 시간 : " + (end - start));
	}
}
