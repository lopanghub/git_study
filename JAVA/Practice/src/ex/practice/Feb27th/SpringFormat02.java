package ex.practice.Feb27th;

public class SpringFormat02 {
	public static void main(String[] args) {
		String str1 = String.format("8진수로 표현하면? %o", 12);
		System.out.println(str1);
		//8진수로 표현하면? 14
		
		String str2 = String.format("16진수로 표현하면? %x", 50);
		System.out.println(str2);
		//16진수로 표현하면? 32
		
		String str3 = String.format("%03d", 1);
		System.out.println(str3);
		// 001
		
		String str4 = String.format("%-6d_", 100);
		System.out.println(str4);
		//100   _ 
	}
	
}
