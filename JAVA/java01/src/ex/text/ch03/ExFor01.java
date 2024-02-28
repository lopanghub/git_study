package ex.text.ch03;

public class ExFor01 {

	public static void main(String[] args) {
		int i = 1;
		for(;i<=10;i++) { //초기식과 증감식은 없어도 됨 증감식이 만약 없다면 무한 반복 상태
			System.out.println("hello"+i); 
		}

	}

}
