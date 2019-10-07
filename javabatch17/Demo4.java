package javabatch17;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		String path = "/Users/vikrant/Documents/abc.txt";
		
		File file = new File(path);
		
		FileReader filereader = new FileReader(path);
		
		
		
		filereader.close();
		
//		FileReader filereader1 = new FileReader(file);

	}

}
