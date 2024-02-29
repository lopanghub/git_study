package ex.practice.Feb29th;

public class Practice02 {

	public static void main(String[] args) {
		ab :
		for(int x=2; x<=9; x++) {
			for(int y=1; y<=9;y++) {
				System.out.println(x+" "+y);
				if(y==3) {
					break ab;
				}
			}
		}
	}

}
