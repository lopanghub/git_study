package ex.text.ch03;

public class ExSwitch04 {

	public static void main(String[] args) {
		// switch - int, String
		String str = " hello";
		switch(str) {
				case "안녕" : // 스위치의 조건이 스트링이기 때문에 숫자를 넣으면 에러
				case "hi" :	// 스위치 안에 스위치,조건문 가능하지만 굳이 하진 않는다
					if(true) {
						
					}
				case "hello" :
		}

	}

}
