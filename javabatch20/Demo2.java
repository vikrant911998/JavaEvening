package javabatch20;

class First implements Runnable{

	@Override
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

class Second implements Runnable{

	@Override
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


public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		First first = new First();
		Second second = new Second();
		
		Thread t1 = new Thread(first);
		Thread t2 = new Thread(second);
		
		t1.start();
		Thread.sleep(500);
		
		t2.start();
//		for(int i=1;i<=10;i++) {
//			System.out.println(i);
//		}
		
//		first.run();
//		second.run();
	
	}

}
