package ex.test.ch07;

public class Ex03 {

	public static void main(String[] args) {
//		Member m1 = new Member("java", "0000");
//		System.out.println(m1.ID);
//		System.out.println(m1.pw);
////		System.out.println(m1.number);
//		System.out.println(m1.c);

		Member m1 = new Member();
		m1.setAge(200);
		System.out.println(m1.getAge());
		
		m1.setId("abcfg");
		if (m1.getId() != null) {
			System.out.println(m1.getId());
		}
		
		m1.setName("java");
		System.out.println(m1.getName());
	}

}
