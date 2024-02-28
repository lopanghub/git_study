package ex.text.ch03;

public class ExSwitch01 {

	public static void main(String[] args) {
		int num = 10;
		switch (num*5) { //int까지의 정수형 long은 x//
			default : System.out.println("0"); // 맞는 케이스가 없으면 디폴트 조건문과 다르게 위치는 상관이 없다
			case 10 : System.out.println("10");
			case 20 : System.out.println("20");
			case 30 : System.out.println("30"); // 조건에 맞는 케이스부터 순차적으로 실행
			case 40 : System.out.println("40");
			
		}
	}	

}
