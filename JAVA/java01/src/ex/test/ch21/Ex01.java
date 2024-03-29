package ex.test.ch21;

public class Ex01 {
	public static void main(String[] args) {
//		for(int i=0;i<5;i++) {
//			System.out.println("hello");
//		}
		
//		int i=0;
//		while(i<5) {
//			System.out.println("hello");
//			i++;
//		}
		
		int score=85;
		if(score>=80) {
			for(int i=0;i<5;i++) {
				System.out.println("good");
			} 
		} else if(score<85) {
			for(int i=0;i<2;i++) {
				System.out.println("good");
			}
		}
		
		Tv tv = new Tv(54);
		
		tv.TvOn();
		
		new StackTraceElement("", "", "", 10);
	}
}
