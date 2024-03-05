package ex.test.ch05;

public class Car {
	String brand = "Hyundae";
	String color = "black";
	int maxSpeed = 240;
	int price = 30000000;
	
	public Car(int s, int p) {
		if(s<=250) {
			maxSpeed =s;
		}
		if (p>=30000000&&p<=100000000) {
			price = p;
		}
	}
	
}
