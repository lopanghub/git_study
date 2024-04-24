package ex.practice.Feb29th;

public class Practice06 {

	public static void main(String[] args) {
		// 모래시계
//		int star =11, space=0;
//		boolean status = true;
//		for (int i= 0;i<11;i++) {
//			for(int j=0;j<space;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<star;j++) {
//				System.out.print("*");
//			}
//			if(star == 1) {
//				status= false;
//			}
//			if(status) {
//				star -=2;
//				space++;
//			} else {
//				star+=2;
//				space--;
//			}
//			System.out.println();

		// 14번
		int star = 1, space = 5;
		boolean status = true;
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			if (star == 11) {
				status = false;
			}
			if (status) {
				space--;
				star += 2;
			} else {
				space++;
				star -= 2;
			}
			System.out.println();
		}

	}

}
