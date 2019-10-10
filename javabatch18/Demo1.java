package javabatch18;

import java.io.File;
import java.io.IOException;

public class Demo1 {
	
	public static void main(String[] args) throws IOException {
		
		String path = "./subfolder/abc.txt";
		File file = new File(path);
		
//		file.createNewFile();
//		System.out.println(file.exists());
//		System.out.println(file.length());//file.length() -> long return type
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getCanonicalPath());
//		System.out.println(file.getName());
		System.out.println(file.delete());
//		
	}
}
