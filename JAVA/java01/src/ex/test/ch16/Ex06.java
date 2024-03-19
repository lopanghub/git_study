package ex.test.ch16;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex06 {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("test.txt");
			String content = "asinvoqldi vlrhgosg";
			byte [] data = content.getBytes();//문자열을 한글자 씩 넣기
			for(byte b: data) {
				os.write(b);
			}
			os.flush(); // 버퍼의 저장된 내용을 강제로 출력 
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
