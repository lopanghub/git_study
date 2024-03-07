package ex.test.ch08;

public class Ex05 {

	public static void main(String[] args) {
		Super s1 = new Super();
		Game g1 = null;
		Game g2 = null;
		
		Super s = new Game(); // 조상이 자손참조 가능
		//Game g = new Super(); // 반대는 에러
		
		System.out.println(s1.s);
		s1.getName();
		
		
		if(s1 instanceof Game) { //상속 관계면 true && 자손인가?
			System.out.println("가능");
			g1 = (Game)s1;
 		} else {
 			System.out.println("불가능");
 			g1 = new Game();
 		}
		//g1 = (Game)s1; //문법적으로 가능 실행시 에러 위의 에러와 사실상 같은 코드
		System.out.println(g1);
		System.out.println(s1);
	}

}
