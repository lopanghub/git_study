package ex.practice.Feb27th;

public class Test {

	public static void main(String[] args) {
		// 1번 3
		// 2번 31
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z); 	
		// 3번 가
		int score = 85;
	    String result = (!(score>90))? "가" : "나";
	    System.out.println(result); 
	    // 4번 17개, 24개
	    int pencils = 534;
	    int students = 30;
	    int pencilsPerStudent = (pencils / students); //학생 한 명이 가지는 연필 수
	    System.out.println(pencilsPerStudent);
	    double pencilDivStudent = (pencils/(students*1.0));
	    System.out.println(pencilDivStudent);


	    int pencilsLeft = (pencils % students) ;//남은 연필 수
	    System.out.println(pencilsLeft); 
	    // 5번
	    int value = 356;
	    System.out.println(value-(value%100));
	    // 6번
	    int lengthTop = 5;
	    int lengthBottom = 10;
	    int height = 7;
	    double area = ((lengthTop+lengthBottom)*height/2.0) ;//여기서 나온값은 int값 double로 바꿔줘야 한다
	    													//2를 2.0으로 실수로 바꿔줘야 한다	
	    System.out.println(area); 
	    // 7번
	    int x2 = 10;
	    int y2 = 5;
	     
	    System.out.println( ( x2>7 ) && ( y2<=5 ) );                 //   ------------(    true     )
	    System.out.println( ( x2 % 3 == 2 ) || ( y2%2 != 1 ) );      //  ------------(      false     )
	    
	     
	}

}
