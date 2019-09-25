package javabatch11;


abstract class Bank{
	
	int a;
	
	public void play() {
		System.out.println("Play of Class Bank");
	}
	
	abstract public void show(); //function or method declaration
}

class HDFC extends Bank{

	@Override
	public void show() {
		
		
	}
	
}

class SBI extends Bank{

	@Override
	public void show() {
		System.out.println("SHow of class SBI");
		
	}
	
}


public class Demo1 {

	public static void main(String[] args) {
//		Bank obj = new Bank();
		
		SBI obj = new SBI();
		obj.show();
		obj.play();

	}

}
