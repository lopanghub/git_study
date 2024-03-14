package ex.test.ch13;

public class Ex01 {

	public static void main(String[] args) {
		Integer i1 = new Integer("15"); //권장x
		Integer i2 = Integer.valueOf(21);//권장
		
		int sum = i1.intValue()+i2.intValue();
		
		System.out.println(sum);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.TYPE);
	}

}
