package ex.test.ch08;

public class Game extends Super{
	int count = 10;
	int s = 50;
	
	@Override
	public void getName() {
		System.out.println("Game-class");
	}
	
	public void getPoint() {
		System.out.println("777-point");
	}
}
