package javabatch1;


public class Demo1 {

	public static void main(String[] args) {
//		int a[] = {1,2,3,4,5};
//		
//		for(int i=0;i<5;i++) {
//			System.out.println(a[i]);
//		}
		
		int a = 5;
		
		if(a==5) {
			if( a%2 == 0) {
				System.out.println("Number is even");
			}
			else {
				System.out.println("Number is not even");
				
				if(a%2 !=0 ) {
					System.out.println("NUmber is odd");
				}
			}
		}

	}

}
