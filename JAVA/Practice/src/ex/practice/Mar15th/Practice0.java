package ex.practice.Mar15th;

public class Practice0 extends Base{
	public static void main(String[] args) {
		Practice0 p = new Practice0(); //부모생성자 출력
	}
	
	Practice0(){
		//super(); 기본 생성자는 자동 생성
		super("s");
		} 
	
}

class Base {
	Base(String s){
		System.out.println("부모생성자");
	}
}