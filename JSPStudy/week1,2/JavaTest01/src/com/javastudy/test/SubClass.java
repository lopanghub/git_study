package com.javastudy.test;

public class SubClass extends SuperClass {

	int age;

	public SubClass(String name, int age) {

		super(name);

		this.age = age;

	}

	public String toString() {

		return name + ", " + age;

	}

	public static void main(String[] args) {

		int i = 65;

		System.out.println((char) i + 5);
	}

}

//이순신,20 : 홍길동
class SuperClass {

	String name;

	public SuperClass(String name) {

		this.name = name;

	}

	public String toString() {

		return name;

	}

}

class Method {
	int plus(int a, int b) {
		return a + b;
	}
}