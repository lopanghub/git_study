package ex.test.ch07;

public class Ex04 {

	public static void main(String[] args) {
		// Data 객체 생성
		//Data d = new Data(); //생성자가 private라 에러가 뜸
		
		Data d= Data.getData();
		d.count = 100;
		System.out.println(d);
		
		Data d2 = Data.getData();
		System.out.println(d2); //???? 왜 100이야
	}

}
