package ex.test.ch17;

import java.io.File;

public class Ex01 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Global IT\\Desktop\\team-projects\\index.html");
		// \ 하나만 쓰면 특수문자표현
		System.out.println(f);
		System.out.println("파일 절대 경로 : "+f.getAbsolutePath());
		//상대경로도 있지만 꼬일 가능성이 높아 추천 안함
		System.out.println("파일 크기 : "+f.length());
		System.out.println("읽기 속성 : "+f.canRead());
		System.out.println("쓰기 속성 : "+f.canWrite());
		System.out.println("숨김 속성 : "+f.isHidden());
		System.out.println("파일 경로 : "+f.getParent());
	}
}
