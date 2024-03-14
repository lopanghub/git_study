package ex.test.ch12;

import java.util.*;
import java.math.BigInteger;
public class Test {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//ex02();
//		String s=  ex05("hello world java");
//		System.out.println(s);
		
		//ex06();;
		//ex03_1();
		ex08("basic/java_web/jsp_framework/spring");
	}
	
	public static void ex02(){
		System.out.print("입력");
		String num = scan.nextLine();
		int sum =0;
		for(int i =0;i<num.length();i++) {
			int c =num.charAt(i)-'0';
			sum += c;
			
		}
		System.out.println("입력값 "+num);
		System.out.println("출력값 "+sum);
	}
	
	public static String ex05(String str) {
		String [] strArr = str.split(" ");
		String result ="";
		for (int i =0;i<strArr.length;i++) {
			String s= strArr[i];
			char u = (char)(s.charAt(0)-32);
			
			result += (u+s.substring(1))+" ";
		}
		return result;
	
	}
	
	public static void ex06() {
		System.out.print("입력 ");
		String input = scan.nextLine();
		String result = "";
		for(int i = input.length()-1;i>=0;i--) {
			result += input.charAt(i);
		}
		System.out.println("역순 " +result);
	}
	
	public static void ex06_1() {
		System.out.print("입력 ");
		
		StringBuffer sb = new StringBuffer(scan.nextLine());
		System.out.println("역순 : "+sb.reverse());
	}
	
	public static void ex03() {
		long result =1L;
		for(int i= 2 ; i<=100;i++) {
			result *=i;
			System.out.println(result);
		}
	}
	
	public static void ex03_1() {
		BigInteger big = new BigInteger("1");
		for(int i = 2; i<100;i++) {
			//big.multiply(new BigInteger(i+""));
			big=big.multiply(BigInteger.valueOf(i));
		}
		System.out.println(big.toString());
	}	
	public static void ex08(String s) {
		s= s.replace("_", " ");
		s= s.replace("/", ":");
		System.out.println(s);
	}
}
