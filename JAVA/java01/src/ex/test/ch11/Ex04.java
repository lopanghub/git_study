package ex.test.ch11;

public class Ex04 {
	static Ex02 e;
	public static void main(String[] args) {
		try{
		
//			System.out.println(new Integer("hello"));
			System.out.println(e.toString());
			
		} catch(Exception e) {
			System.out.println("숫자를 입력");
		}
		
//		catch(NullPointerException nfe) {
//			System.out.println("null입니다 객체 생성후 사용");
//		} 

	}

}
