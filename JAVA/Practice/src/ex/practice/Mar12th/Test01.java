package ex.practice.Mar12th;

public class Test01 {

	public static void main(String[] args) {
		// ���� ����
		// 1�� 4
		// 2�� 3
		// 3�� 4
		// 4�� 2
		// 5�� 3
		// 6��

		String[] strArray = { "10", "22" };

		int value = 0;

		try {
			for (int i = 0; i < 2; i++) {
				value = Integer.parseInt(strArray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스를 초과했음");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없음");
			e.printStackTrace();
		} finally {
			System.out.println(value);
		}

	}
}
