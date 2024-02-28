package ex.text.ch03;

public class ExIf03 {

	public static void main(String[] args) {
		System.out.println(1);
		if(false) {
			System.out.println(2);
		} else {
			if(true) // false인 인경우에도 트리구조로 계속 만들 수 있다
			System.out.println(3);
		}
		System.out.println("종료");
	}

}
