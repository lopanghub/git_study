package ex.test.ch08;

class SuperTest {
	public static void main(String args[]) {
		Childs c = new Childs();
		c.method();
	}
}

class Parents {
	int x=10;
}

class Childs extends Parents {
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);
	}
}