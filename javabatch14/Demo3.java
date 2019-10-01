package javabatch14;

class A1{
	protected void display() {
		System.out.println("Protected display");
	}
}

class B1 extends A1{
	
	void play() {
		System.out.println("play");
//		super.display();
	}
}



public class Demo3 {

	public static void main(String[] args) {
		B1 obj = new B1();
		obj.display();
		B1 obj1 = new B1();
		obj1.play();
	
	}

}
