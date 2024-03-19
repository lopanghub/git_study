package ex.test.ch16;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(10));
		//Math.random()*10
		System.out.println(r.nextDouble());
	}
}
