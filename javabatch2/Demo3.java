package javabatch2;

import java.util.ArrayList;

public class Demo3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(32);//[32,45,97]
		list.add(45);
		list.add(97);
		
		//Enhanced For loop
		for(int a:list) {
			System.out.println("Value : "+a);
		}

	}

}
