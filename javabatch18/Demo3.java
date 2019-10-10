package javabatch18;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		
		String path = "a1.txt";
		File file = new File(path); 
		char[] ch = new char[(int)file.length()];
		
		FileReader fr = new FileReader(path);
		
		fr.read(ch);
		
		for(char c:ch) {
			System.out.print(c);
		}
		
//		int i = fr.read();//return type->int
//		
//		while(i != -1) {
//			System.out.print((char)i);
//			i = fr.read();
//		}
		
		
		
		fr.close();

	}

}
