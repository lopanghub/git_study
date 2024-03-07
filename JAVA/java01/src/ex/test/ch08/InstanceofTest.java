package ex.test.ch08;

class InstanceofTest {
	public static void main(String args[]) {
		FireEngineT fe = new FireEngineT();
		CarT c = new CarT();

		if(fe instanceof FireEngineT) {
			System.out.println("This is a FireEngine instance.");
			
		} 

		if(fe instanceof CarT) {
			System.out.println("This is a Car instance.");
			c = (CarT)fe;
		} 

		if(fe instanceof Object) {
			System.out.println("This is an Object instance.");
		} 
	}
} // class

class CarT {}
class FireEngineT extends CarT {}

