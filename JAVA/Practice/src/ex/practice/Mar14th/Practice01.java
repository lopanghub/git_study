package ex.practice.Mar14th;

public class Practice01 {
 public static void main(String[] args) {
	 Integer i1 = new Integer("15"); //새로 생성하는 방식은 권장 x 
	 Integer i2 = Integer.valueOf(21);
	 
	 int sum = i1.intValue()+i2.intValue();
	 System.out.println(sum);
	 
	 System.out.println(Integer.BYTES); // Integer 클래스의 상수들
	 System.out.println(Integer.MAX_VALUE);
	 System.out.println(Integer.MIN_VALUE);
	 System.out.println(Integer.SIZE);
	 System.out.println(Integer.TYPE);
 }
}
