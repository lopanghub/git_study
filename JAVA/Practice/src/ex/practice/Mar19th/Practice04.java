package ex.practice.Mar19th;

import java.util.Random;

public class Practice04 {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(10));
		// Math.random()*10 과 동일
		System.out.println(r.nextDouble());
	}
}
