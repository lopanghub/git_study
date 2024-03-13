package ex.test.ch12;

public class Ex10 {

	public static void main(String[] args) {
		String fullName ="Hello.java";
		int index = fullName.indexOf('.');	
		System.out.println(index);
		String fileName = fullName.substring(0,index);//0~5미만
		String ext = fullName.substring(index+1);
		System.out.println(fullName+"의 확장자를 제외한 이름은"+fileName);
		System.out.println(fullName+"의 확장자는 "+ext);

		
		
		String s1 = "hello world java";
		
		String [] arr = s1.split(" ");
		for (int i= 0;i<arr.length;i++) {
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		
		String s2 = " abc ";
		String msg = null;
		
		msg = s2.replace("a","b");  
		System.out.println("msg : "+msg);
		msg = s2.toUpperCase();		
		System.out.println("msg : "+msg);
		msg = s2.trim();		
		System.out.println("msg : "+msg);
	}

}
