package ex.test.ch10;

public final class Data {
	public final int x ; //명시적 초기화
	private int code = 7; // 1~10사이의 값만 대입하도록
	
	{
//		x = 200; //블럭 초기화
	}
	
	Data(){
		x = 300; //생성자 초기화
		code = (int)(Math.random()*10)+1;
	}
	
	public int getCode() {
		return code;
	}
	
	Data(int c){ //
		x = 0;
		this.code = c ;
	}
}
