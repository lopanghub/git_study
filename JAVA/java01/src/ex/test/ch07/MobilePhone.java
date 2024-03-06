package ex.test.ch07;

public class MobilePhone {
	// 브랜드 이름, 폰의 가로크기, 세로크기 , 무게
	String brand ="samsung";
	double w =7.5;
	double h =12.0;
	double b =0.9;
	
	// 전화걸기, 전화 받기, 문자 보내기, 문자 받기
	public void call(String number) {
		System.out.println(number+" : 전화 걸기");
	}
	public void answer() {
		System.out.println("전화 받기");
	}
	public void msgCall() {
		System.out.println("문자 보내기");
	}
	public void msgReceiving() {
		System.out.println("문자 받기");
	}
}
