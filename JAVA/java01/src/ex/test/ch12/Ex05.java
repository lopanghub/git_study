package ex.test.ch12;

class Value{
	int value;
	Value(int value){
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj!=null&& obj instanceof Value ) { //instanceof 타입 체크
			Value v= (Value)obj;
			result = value == v.value;
		}
		return result;
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		System.out.println(v1.value == v2.value);
		System.out.println(v1.equals(v2));//기본적으로 ==(비교연산)과 같은 기능
		
		
	}
}
