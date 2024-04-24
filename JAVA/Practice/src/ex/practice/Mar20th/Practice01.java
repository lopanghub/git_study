package ex.practice.Mar20th;

import java.io.File;

public class Practice01 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Global IT\\Desktop\\team-projects\\index.html");

		System.out.println(f);
		System.out.println(f.getAbsolutePath());// 절대경로
		System.out.println(f.length()); // 파일크기
		System.out.println(f.canRead()); // 읽기가능
		System.out.println(f.canWrite());// 쓰기가능
		System.out.println(f.isHidden());// 숨김인지
		System.out.println(f.getParent());// 부모경로

	}
}
