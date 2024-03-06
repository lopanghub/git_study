package ex.test.ch07;

public class Data {
	
	private static Data data = new Data();
	public static Data getData() {
		return data;
	}
	
	int count;
	private Data(){
		count=0;
	}
}
