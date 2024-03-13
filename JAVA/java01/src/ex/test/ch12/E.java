package ex.test.ch12;

public class E {
	public void add() {
		int x = 100;
		System.out.println(x);
		class Data{ //지역 클래스
			int y = 200;
			void value() {
				// 내부클래스를 쓰면 메서드 안에 넣기 가능
			}
			
		}
		Data d = new Data();
		System.out.println(d.y);
		
//		public void value() {
//			메서드 안의 메서드는 불가능	
//		}
	}
}
