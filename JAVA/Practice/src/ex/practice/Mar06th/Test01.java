package ex.practice.Mar06th;

public class Test01 {
	// 1. 4 2. 2 3. 2 4. 2x 답4 5. 2 답 4 6. 3

	// 7 (1)필드 (2) 생성자 (3) 메소드

}

//8번
class Ex01 {
	String str = "hello java";
	int year = 2020;

	String str() {
		return str;
	}

	int year() {
		return year;
	}
}

//10번
class Ex02 {
	int a;
	boolean isPlay;
	double d;

	int setA(int a) {
		this.a = a;
		return a;
	}

	boolean setP(boolean P) {
		isPlay = P;
		return isPlay;
	}

	double setD(double d) {
		this.d = d;
		return d;
	}
}

//12 번
class MobilePhone {
	String brand;
	int width;
	int height;
	double weight;

	public MobilePhone(String brand, int width, int height, double weight) {
		this.brand = brand;
		this.width = width;
		this.height = height;
		this.weight = weight;
	}

	void makeCall() {
		System.out.println("전화 걸기");
	}

	boolean receiveCall() {
		System.out.println("전화 받기");
		return true;
	}

	void sendMessage() {
		System.out.println("문자 보내기");
	}

	String receiveMessage(String s) {
		System.out.println("문자 받기");
		return s;
	}

	// 14번
//	private String phoneNumber;
//	
//	public void phoneCall(String phoneNumber) {
//		for(int i=0;i<phoneNumber.length();i++) {
//			char c = phoneNumber.charAt(i);
//			if((c>=65&&c<=90)||(c>=97&&c<122) ) {
//				System.out.println("올바른 숫자를 입력하세요");
//			} else if (phoneNumber.length() != 11) {
//				System.out.println("전화번호는 11자리 입니다");
//			} else {
//				System.out.println(phoneNumber+"로 전화를 걸고 있습니다.");
//			}

	//

}

class Gugudan {

	void gugudan(int i) {
		for (int j = 1; j <= 9; j++) {
			System.out.println(i + " X " + j + " = " + i * j);
		}
	}
}
