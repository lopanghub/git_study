package ex.practice.Mar20th;

import java.io.File;
import java.util.Date;

public class Practice02 {
	public static void main(String[] args) {
		File f = new File("c:\\");
		String[] names = f.list();

//		for(String s : names) {
//			System.out.println(s);
//		}

		File[] files = f.listFiles();
		for (File fi : files) {
			if (fi.isDirectory()) {
				System.out.print(new Date(fi.lastModified()));
				System.out.print("\t <DIR> \t");
				System.out.println(fi.getName());
			} else {
				System.out.println(fi.getName() + "_file");
			}
		}
	}
}
