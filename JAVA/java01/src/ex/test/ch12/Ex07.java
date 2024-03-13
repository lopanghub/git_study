package ex.test.ch12;

class Ex07_Point implements Cloneable {
	int x = 100;
	int[] arr = new int[3];

	public Ex07_Point clone() {
		Object obj = null;

		try {
			obj = super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (Ex07_Point)obj;
	}
}

public class Ex07 {

	public static void main(String[] args) {
		Ex07_Point po = new Ex07_Point();
		Ex07_Point po2 = po.clone(); // 왜? protected - 같은 패키지거나 자손// 이 clone은 오브젝트의 clone
		
		System.out.println(po);
		System.out.println(po2);
	}
}
