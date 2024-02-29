package ex.text.ch04;

public class Ex00 {

	public static void main(String[] args) {
		for(int i= 0; i<10; i++) {
			System.out.println(i);
			if(i == 5) {
				break; //i가 5가되면 반복문정지
			}
		}
		System.out.println("종료");
	}

}
