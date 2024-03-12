package ex.test.ch02;

public class Ex07 {

	public static void main(String[] args) {
		char a = 'a';
		// 湲곕낯�삎 - �젙�닔,�떎�닔,�끉由�
		// 李몄“�삎 - �겢�옒�뒪, 臾몄옄�뿴
		String s = "hello"+a; // hello�� a瑜� �뿰寃고븯寃좊떎
		System.out.println(s);
		System.out.println("hello world"+10);
		System.out.println(s+true);
		
		int x = 100;
		System.out.println("x = "+x); // string+int �뒗 string 臾댁“嫄댁씠�떎
	}

}
