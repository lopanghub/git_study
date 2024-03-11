package ex.test.ch10;

public class Ex01_Array {

	public static void main(String[] args) {
		int [] a = new int[3]; // new로 쓰는건 모두 새로운 메모리를 만드는 참조형
		System.out.println(a); // long과 더블은 못넣는다 int 보다 작은 단위 넣는것만 가능
		
		a[0] = 10; a[1]=20; a[2]=30;
		int a0 = 10;
		
		int [] b = {10,20,30};
		System.out.println(b[0]);
	}

}
