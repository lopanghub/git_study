package ex.test.ch14;
import java.util.Scanner;
public class Ex00000 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		do {
			System.out.println("원하는 값을 입력하세요. 입력을 마치려면 Q를 입력하세요. ->");
			input = scan.nextLine();
			System.out.println("입력하신 값은 "+input+"입니다.");
		} while(!input.equalsIgnoreCase("Q"));
		
		System.out.println("프로그램 종료");
		System.exit(0);
	}
}
