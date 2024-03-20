package ex.test.ch17;

import java.io.IOException;

public class Ex04 {
	public static void main(String[] args) {
		System.out.println("hello world");
		
		for (int i=0;i<5;i++) {
		 	try {
				int c = System.in.read();
				System.out.println("->"+(char)c);
				// 10 LF  Line Feed 줄 바꿈 13 CR  Carriage Return 커서를 앞으로 돌리기
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
