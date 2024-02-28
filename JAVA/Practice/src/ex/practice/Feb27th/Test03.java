package ex.practice.Feb27th;

public class Test03 {

	public static void main(String[] args) {
		// 1.  값을 저장(대입)할 때 사용하는 연산자의 기호는 무엇인가요?
		// a1. =
		
		// 2. 기본적인 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지를 계산할 때 사용하는 연산자의 기호는 순서대로 각각 무엇인가요?
		// a2. 
		
		// 3. += 는 무엇을 할 때 사용하는 연산자 인가요?
		// a3. 결과값을 바로 변수에 반영할때
		// s3. 덧셈하고 대입까지 진행
		
		// 4. 연산의 순서를 모르거나 확실히 하고 싶을 때에는 어떤 기호를 사용해야 하나요?
		// a4. ()

		// 5. ==와 !=의 차이는 무엇인가요?
		// a5. 전자는 두 값이 같은지 후자는 두 값이 다른지 확인
		
		// 6. <와 <=의 차이는 무엇인가요?
		// a6. 미만 이하 
		
		// 7. ! 연산자는 어떤 타입에 사용 할 수 있나요?
		// true false로 값이 나오는 타입(비교, 논리)
		// s7. boolean 타입에 사용
		
		// 8. ? : 로 표시하는 삼항 연산자의 ?와 : 뒤에 명시해 주는 값은 무엇을 의미 하나요?
		// a8. 조건 ? true : false;
		
		// 9. 자바는 형변환을 한다고 했는데, short의 값을 long에 할당할 때에는 어떤 것을 해 주어야 하나요?
		// a9. 작은 값이 큰값으로 갈때는 자동으로 변환이 된다 (long) 을 붙여도 상관 없다
		
		// 10. 반대로 long값을 short에 할당할 때에는 어떤 것을 해 주어야 하나요?
		// a10. 큰타입에서 작은 타입으로 갈때는 반드시 (short) 같은 타입변환을 해줘야 한다.
		
		
		// 11. 9와 10의 경우 중 어떤 경우가 기존 값이 사라지고, 엉뚱한 값으로 바뀔 수 있나요?
		// a11. 16진수의 경우 10이 A로 표기된다
		// s11. 데이터오버플로우 현상
		
		/* 12. 다음 코드가 수행 될 때 출력되는 값을 적어보세요.
				int num;
				num = -5 + 3 * 10 / 2;
				①System.out.println(num); */
		// a12. 10

		/* 13.  다음 코드가 수행 될 때 출력되는 값을 적어보세요.
				int num = 10;
				
				①System.out.println(num);
				②System.out.println(num++);
				③System.out.println(num);
				④System.out.println(--num); */
		// a13. ① 10 ② 10 ③ 11 ④ 10
		
		/* 14. 다음 코드가 수행 될 때 출력되는 값을 적어보세요.
				int num1 = 10;
				int num2 = 20;
				boolean result; 
				
				result = ( (num1 > 10) && (num2 > 10) );
				①System.out.println(result);
				result = ( (num1 > 10) || (num2 > 10) );
				②System.out.println(result);
				③System.out.println(!result); */ //result 값자체는 여전히 true
		// a14. ① false ② true ③ false
		
		/* 15. 다음 코드가 수행 될 때 출력되는 값을 적어보세요.
				int num1 = 2; //0010
				int num2 = 10;//1010
				
				①System.out.println(num1 & num2);
				②System.out.println(num1 | num2);
				③System.out.println(num1 ^ num2);
				④System.out.println(~num1); */
		// a15. ① 2 ② 10 ③ 8 ④ 이건몰루
		
		/* 16. 다음 코드가 수행 될 때 출력되는 값을 적어보세요.
				int num = 8;
		
				①System.out.println(num += 10);
				②System.out.println(num -= 10); */
		// a16. ① 18 ② 8
		
		/* 17. 다음 코드가 수행 될 때 출력되는 값을 적어보세요.
				int num = 10;
				int num2 = 20;
				
				int result = (num >= 10) ? num2 + 10 : num2 - 10;
				①System.out.println(result); */
		// a17. 30
		

	}

}
