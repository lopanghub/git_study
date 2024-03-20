package ex.test.ch17;

import java.io.File;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args)  {
		File f = new File("C:\\Users\\Global IT\\Desktop\\team-projects\\hover.html");
//		f.delete();
		try {
		f.createNewFile();
		} catch(IOException e) {
			e.printStackTrace();
		}
				
	}
}
