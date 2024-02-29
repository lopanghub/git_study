package ex.text.ch04;

public class Ex03 {

	public static void main(String[] args) {
		int i = 0;
		while(i<3) {
			System.out.println(i); //무한 반복 오류 날 가능성 높음
			i++;
		}
		
		int x = 2;
		
		while(x<=9) {
			int y= 1;
			while(y<=9) {
				System.out.println(x+"X"+y+"="+(x*y));
				y++;
			}
			x++;
			
		
		}
		
	}

}
