package ex.practice.Mar20th;

import java.io.IOException;

public class Practice04 {
	public static void main(String[] args) {
		System.out.println("hello world");
		for(int i=0;i<5;i++) {
			try {
				int c = System.in.read();
				System.out.println((char)c);// 10 LF 줄바꿈 13 CR 커서 맨앞으로 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
