package ex.test.ch18;

interface Test2{
	public void add(int x, double d); //abstract 생략가능 
}

public class Ex02 {
	public static void main(String[] args) {
		Test2 t = (x, y) ->System.out.println(x);
	}
}
