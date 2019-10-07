package javabatch17;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		String path = "/Users/vikrant/Documents/abc.txt";
		File file = new File(path);
		file.createNewFile();
		
		//Overriding the data written in file
//		FileWriter filewriter = new FileWriter(path);
//		FileWriter filewriter1 = new FileWriter(file);
		
		//append the data in the file
		FileWriter filewriter2 = new FileWriter(path);
//		FileWriter filewriter3 = new FileWriter(file,true);
		
		char name[] = {'d','e','m','o'};
		String s = "->this is the path";
//		filewriter.write(100);
		filewriter2.write("Hello this is hello world file program");
		filewriter2.write(s);
		
//		filewriter.close();
		filewriter2.close();
		System.out.println(file.exists());
	}

}
