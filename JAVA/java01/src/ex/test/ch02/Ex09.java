package ex.test.ch02;

public class Ex09 {

	public static void main(String[] args) {
		
		//System.out.printf(); // c에서 주로 사용 자바에선 잘 안씀
		
		System.out.print("ㅁㅁㅁ");
		System.out.print("ㅠㅠㅠㅠ");
		System.out.print("ㄱㄱㄱㄱㄱㄱ");
		//가로로만 출력
		
		System.out.println("\nㅁㅁㅁ");
		System.out.println("ㅠㅠㅠㅠ");
		System.out.println("ㄱㄱㄱㄱㄱㄱ");
		//출력 후 줄바꿈
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("dhdndn");
		//아무것도 안넣어도 줄바꿈 기능은 작동한다
		
		int a = 10;
		int b = 20;
		System.out.println(a+" "+b); // "" 들어가 있어서 string이 된다
		System.out.println(a+"x"+b+"="+(a*b)); //(a*b)가 최우선 그후 +연산자로 연결 
	}

}
