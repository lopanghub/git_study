package ex.test.ch16;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex07 {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("test.txt");
			int r ;
			while(true) {
				r= is.read();
				if(r==-1) {//읽을때 끝에 도달하면 -1로 리턴함
					break;
				}
				System.out.print((char)r);
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
