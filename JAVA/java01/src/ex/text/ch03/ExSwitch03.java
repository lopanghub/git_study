package ex.text.ch03;

public class ExSwitch03 {

	public static void main(String[] args) {
		int m = 1;
		switch (m) { 
			case 1,3,5 : //1이거나 3이거나 5이거나
				System.out.println("31일");
				break;
			case 2 :
				System.out.println("28,29일");
				break;
			case 4,6 :
				System.out.println("30일");
			
		}

	}

}
