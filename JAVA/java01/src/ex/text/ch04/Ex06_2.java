package ex.text.ch04;

public class Ex06_2 {

	public static void main(String[] args) {
		// 4번
//		for (int i=1;i<6;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print(i+j);
//			}
//			System.out.println();
//		}
		// 4번 풀이
//		for (int i=0;i<5;i++) {
//			for(int x=i+1;x<6+i;x++) {
//				System.out.print(x);
//			}
//			System.out.println();
//		}

		// 5번
//		for (int i=5;i>0;i--) {
//			for(int j=0;j<5;j++) {
//				System.out.print(i+j);
//			}
//			System.out.println();
//		}

		// 6번 패스
//		for (int i=0;i<5;i++) {
//			for(int j=0;j<1+i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<4-i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 8번
//		for (int i=0;i<5;i++) {
//			for (int j=0;j<i;j++) {
//				System.out.print(" ");
//			}
//			for (int j=0;j<5-i;j++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}

		// 9번
//		for (int i=0;i<6;i++) {
//			for(int j=0;j<5-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<1+i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<i+1;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<5-i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//9번 풀이
//		int star=1, space =5;
//		boolean status = true;
//		for(int i=0;i<11;i++) {
//			for (int j= 0; j < space;j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0;j<star;j++) {
//				System.out.print("*");
//			}
//			if (star==6) {
//				status =false;
//			}
//			if(status) {
//				star++;
//				space--;
//			} else {
//				star--;
//				space++;
//			}
//			System.out.println();
//		}

		// 11번
//		int star = 9;
//		for (int i=0;i<5;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j<star;j++) {
//				System.out.print("*");
//			}
//			star-=2;
//			System.out.println();
//		}

		// 12번
//		for (int i=0;i<5;i++) {
//			for(int j=0;j<5-i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i=1;i<5;i++) {
//			for(int j=0;j<i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 13번
//		for (int i = 0; i < 5; i++) {
//			for(int j = 0; j<i;j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < 5 - i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = 1; i < 5; i++) {
//			for(int j = 0; j<4-i;j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < i + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//14번
		int star = 1;
		for (int i=0;i<5;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<star;j++) {
				System.out.print("*");
			}
			star +=2;
			System.out.println();
		}
		
		star -=2;
		
		for (int i=1;i<5;i++) {
			star -=2;
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<star;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
