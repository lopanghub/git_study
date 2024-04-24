package ex.practice.Mar12th;

public class ExceptionEx6 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception("���Ƿ� �߻� ��Ŵ");
			throw e;
		} catch (Exception e) {
			System.out.println("���� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷� ���� ����");
	}

}
