package ex.test.ch16;
import java.util.Calendar;
public class Ex03 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println(cal.get(Calendar.MONTH)+1+"월");
		System.out.println(cal.get(Calendar.DATE)+"일");
	}
}
