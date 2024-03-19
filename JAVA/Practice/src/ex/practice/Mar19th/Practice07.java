package ex.practice.Mar19th;

import java.io.FileInputStream;
import java.io.InputStream;

public class Practice07 {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("test.txt");
			int r;
			while(true) {
				r=is.read();
				if(r==-1){ //-1인 이유는 다읽으면 -1로 반환됨
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
