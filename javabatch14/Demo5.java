package javabatch14;

import java.util.ArrayList;

//number = 34523
//a[]= {3,4,5,2,3}

public class Demo5 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		int b[] = new int[5];
		
		
//		for(int a1:a) {
//			System.out.println(a1);
//		}
//		for(int i=6;i>=0;i--) {
//			System.out.println(a[i]);
//		}
		
//		String s[]= {"vikrant","brian","java","python"};
//		for(String s1:s) {
//			System.out.println(s1);
//		}
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=100;i>0;i--) {
			list.add(i);
		}
		
		
//		list.add(45);
//		list.add(56);
//		System.out.println(list.get(1));
//		list.set(2, 567);
		
		for(int s2:list) {
			System.out.println(s2);
		}
		
	}

}
