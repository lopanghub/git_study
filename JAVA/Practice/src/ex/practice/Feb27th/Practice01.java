package ex.practice.Feb27th;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;
		int c = a++ + a++; // 하나의 변수의 연산대기는 한번 밖에 안됨 10 + (a++)++ 면 a++이 적용됨
		int d = ++b + ++b;
		int e = a++ + ++b;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
