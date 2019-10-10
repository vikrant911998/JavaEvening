package javabatch18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		
		String path = "a1.txt";
//		File file = new File(path);
		
		char[] ch = {'\n','d','e','m','o'}; 
		FileWriter fw = new FileWriter(path,true);
		
		fw.write(65);
		fw.write(ch);
		fw.write("\nHello World");
		
		fw.close();
		

	}

}
