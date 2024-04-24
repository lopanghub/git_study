package ex.practice.Mar20th;

import java.io.File;

public class Practice03 {
	public static void main(String[] args) {
		File f = new File("C:\\\\Users\\\\Global IT\\\\Desktop\\\\team-projects\\\\hover.html");
//		f.delete();
		try {
			f.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
