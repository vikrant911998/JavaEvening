package javabatch15;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		int a[] = new int[10];
		boolean bool = false; 
		int positivecount = 0;
		int negativecount = 0;
		int oddcount=0,evencount=0,zerocount=0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the elements of the array");
		
		for(int i=0;i<10;i++) {
			a[i] = sc.nextInt();
		}
		
		for(int s:a) {
				
			
			if(s>0) {
				positivecount++;
			}
			else if(s < 0 ) {
				negativecount++;
			}
			else {
				zerocount++;
			}
			
			
			if(s%2 == 0) {
				evencount++;
			}
			else {
				oddcount++;
			}
			
			
		}
		
		
		
		
		
//		System.out.println("Enter the number to be found");
//		int number = sc.nextInt();
		
		
		
		
//		for(int s:a) {
//			
//			if(s == number) {
//				bool = true;
//				System.out.println("Number found");
//			}
////			else {
////				System.out.println("Number not found");
////			}
//			
//		}
//		
//		if(bool == false) {
//			System.out.println("number not found");
//		}
		
		
	}

}
