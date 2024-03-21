package ex.practice.Mar21th;

interface Test2{
	public void add(int x, double d);
}

public class Practice02 {
	public static void main(String[] args) {
		Test2 t = (x, y) -> System.out.println(x);
		//매개 변수의 타입도 생략가능 요구하는 매개변수의 수만 맞춰주면 된다
	}
}
