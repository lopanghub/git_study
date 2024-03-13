package ex.test.ch12;

import java.util.*;

public class Test {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//ex02();
		String s=  ex05("hello world java");
		System.out.println(s);
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
}
