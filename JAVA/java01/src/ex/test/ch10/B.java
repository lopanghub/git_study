package ex.test.ch10;

public class B extends A{
	String name ="B-class"; //B의 name 변수는 2개
	
	public String getNameA() {
		return super.name;
	}
	
	@Override
	public String toString() {
		return name+"_A"; //B는 오브젝트를 모른다 
	}
}
