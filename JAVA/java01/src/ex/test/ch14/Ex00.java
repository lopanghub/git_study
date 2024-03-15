package ex.test.ch14;

public class Ex00 extends Base{
	public static void main(String[] args) {
		int arr [][]; //다차원 배열 선언
		int []arr2 = {1,2,3,}; //쉼표뒤에 아무것도 없으면 기본값
		int []arr6[] = new int [3][];//다차원배열중 가변배열
		boolean results[]=new boolean[] {true, false, true};//생성 boolean뒤에 숫자 넣으면 에러
		
		int i =1, j=10;
		do {
			if(i++>--j) {
				continue;
			}
			System.out.println("i="+i+" j="+j);
		}while(i<5);
		System.out.println("i="+i+" j="+j);
		
		int num = 10;
		
		String r = num > 0 ? "양수"  : num == 0 ? "0":"음수";
		
		Ex00 e = new Ex00();
	}
	
//	Ex00(){
//		super();// 자동으로 생성된다
//	}
}

class Base{
	Base(){
		System.out.println("zhf");
	}
}
