package ex.test.ch07;

public class Solution {
	public static void main(String[] args) {
		Exx01 e =new Exx01();
		e.printStr();
		e.printYear();
		
		Exx02 e2 = new Exx02();
		e2.setA();
		e2.setD();
		e2.isPlay();
		System.out.println(e2.a);
		System.out.println(e2.isPlay);
		System.out.println(e2.d);
	}
}
class Exx01 {
	String str = "hello java";
	int year = 2020;
	
	public void printStr() {
		System.out.println(str);
	}
	public void printYear() {
		System.out.println(year);
	}
	
	
}

class Exx02 {
	int a; 
	boolean isPlay;
	double d;
	
	public void setA() {
		this.a =100;
	}
	public void setD() {
		this.d = 3.14;
	}
	public void isPlay() {
		this.isPlay = true;
	}
}


