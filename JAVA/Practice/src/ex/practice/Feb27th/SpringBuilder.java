package ex.practice.Feb27th;

public class SpringBuilder {

	public static void main(String[] args) {
		String name = "Ben";
		StringBuilder sb = new StringBuilder();
		sb.append("Hello, ");
		sb.append(name);
		sb.append(" nice to meet you");
		System.out.println(sb.toString());
		// Hello, Ben nice to meet you
	}

}
