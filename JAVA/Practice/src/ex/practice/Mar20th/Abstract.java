package ex.practice.Mar20th;

abstract class Animal{
	abstract void cry(); {
		//선언만 존재 구현은 x 세미콜론의 위치 체크
	}
}

class Cat extends Animal{
	void cry() {
		System.out.println("meow meow");
	}
}
class Dog extends Animal{
	void cry() {
		System.out.println("woof woof");
	}
}
public class Abstract {
	public static void main(String[] args) {
		//Animal a = new Animal(); // 추상 클래스는 객체생성 불가
		Cat c = new Cat();
		Dog d = new Dog();
		
		c.cry();
		d.cry();
	}
}
