package ex.test.ch12;

public class Ex08 {

	public static void main(String[] args) {
		String sum = "";
		long start = System.currentTimeMillis();
		for(int i= 0; i<1000;i++) {
			
//			if(i==3) {
//				System.exit(889);// 프로그램 종료 
				// 0 정상종료 1 강제종료같은걸 임의 부여 int 변수는 아무 숫자나 상관 없다
			sum += i;
		}
		long end = System.currentTimeMillis();
		System.out.println(sum);
		
		System.out.println(end-start);
	}

}
