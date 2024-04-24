package ex.practice.Mar12th;

public class FinallyTest3 {

	public static void main(String[] args) {
		method1();
		System.out.println("method1()�� ������ ��ġ�� main�޼���� ����");
	}

	static void method1() {
		try {
			System.out.println("method1()�� ȣ��");
			return;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1()�� fianlly ���� ����");
		}
	}
}
