package ex.test.ch11;

public class Ex06 {

	public static void main(String[] args) {
		Integer i1;
		try {
			i1 = new Integer("100");
		} catch(Exception e){
			i1 = new Integer(0);
		}
		System.out.println(i1.toString());
	}

}
