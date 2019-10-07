package javabatch17;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		String path = "/Users/vikrant/Documents/abc.txt";
			
		FileWriter filewriter = new FileWriter(path,true);
		char name[] = {'\n','d','e','m','o','o','b','j','e','c','t','\n'};
		String s = "\nPresident\n";
		
//		filewriter.write(100);
		filewriter.write("\n************\n");
		filewriter.write(s);
		filewriter.write(name);
		
		filewriter.close();
		System.out.println("last line");
		
	}

}
