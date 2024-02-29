package ex.practice.Feb29th;

public class Practice00 {
int a = 1; //전역변수(인스턴스변수) : 같은 클래스내에서 호출 가능
static int globalStaticVariable = 2; //전역변수(클래스 변수) : 다른 클래스 에서도 호출 가능
	public static void main(String[] args) {
		Practice00 c =new Practice00();
		c.num();
	}
	
	public void num() {
		int a = 10;
			System.out.println(a);
//			System.out.println(globalVariable);		
	}
}
