package ex.practice.Mar12th;

public class ExceptionEx6 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생 시킴");
			throw e;
		} catch (Exception e) {
			System.out.println("에러 : "+ e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 정료");
	}

}
