package javabatch20;


class One extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
	
}

class Two extends Thread{
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
	
}


public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		One obj1 = new One();
		Two obj2 = new Two();
		
//		obj1.start();
//		Thread.sleep(500);
//		obj2.start();
//		
		obj1.run();
		obj2.run();
//		obj1.show();
//		obj2.show();

	}

}
