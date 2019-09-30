package javabatch13;

import java.io.File;
import java.io.IOException;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader

public class Demo3 {

	public static void main(String[] args) throws IOException {
		// D:\\demo1\\abc.txt
		File fileobj1 = new File("subfolder");
		File fileobj = new File("subfolder/abc.txt");
		System.out.println(fileobj.exists());
		fileobj1.mkdir();
		fileobj.createNewFile();
		System.out.println(fileobj.exists());
	}

}
