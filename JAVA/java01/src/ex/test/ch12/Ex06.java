package ex.test.ch12;

class Ex06_Data{
	
}

public class Ex06 {

	public static void main(String[] args) {
		Ex06_Data d = new Ex06_Data();
		System.out.println(d.hashCode());
		System.out.println(d.toString());
		
		System.out.println(Integer.toHexString(d.hashCode()));
		System.out.println(d);
	}

}
