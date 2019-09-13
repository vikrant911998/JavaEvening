package javabatch2;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		int a[] = new int[5];//size given without initialise
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the elements of the array");
		for(int i=0;i<5;i++) {
			a[i] = sc.nextInt();
		}
		
//		for(int i=0;i<5;i++) {
//			System.out.println("VALUE : "+a[i]);
//		}
		
		for(int b:a) {
			System.out.println("value : "+b);
		}

	}

}
