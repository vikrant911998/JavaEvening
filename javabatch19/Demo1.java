package javabatch19;


import java.io.FileReader;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		
		String path =  "a1.txt";
		FileReader fr = new FileReader(path);
		
		int ch = fr.read();//return type int(unicode)
		
		while(ch != -1) {
			System.out.print((char)ch);
			ch = fr.read();
		}
		
		fr.close();

	}

}
