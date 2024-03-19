package ex.practice.Mar19th;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Practice06 {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("test.txt"); // OutputStream은 추상클래스
			// FileOutputStream은 예외처리를 해줘야 한다(FileNotFoundException)
		
			String content = "hi nice to meet you";
			byte [] data = content.getBytes();//문자열 한글자씩 넣기
			for(byte b: data) {
				os.write(b);
			}
			os.flush();//옵션 // 버퍼의 저장된 내용을 강제로 출력
			os.close();//없어도 실행엔 지장이 없다 // 연결 끊기
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
