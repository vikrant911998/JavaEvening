package javabatch19;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		
		String path =  "a1.txt";
		File f = new File(path);
		
		FileReader fr = new FileReader(f);
		
		char ch[] = new char[(int)f.length()];
		
		fr.read(ch);
		
		for(char c:ch) {
			System.out.print(c);
		}
		
		fr.close();


	}

}
