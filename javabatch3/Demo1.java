package javabatch3;


class First{
	private int a,b;
	
	//Default Constructor
	public First() {
		System.out.println("Default Constructor");
	}
	
	//Parameterised Constructor
	public First(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Parameterised Constructor");
		
	}
	
	public void display() {
		System.out.println("Value A : "+this.a);
		System.out.println("Value B : "+this.b);
	}
	
	public void play() {
		System.out.println("Play of Class First");
	}
	
}


public class Demo1 {

	public static void main(String[] args) {
		
		First obj = new First();
		
//		obj.play();
		obj.display();
		
		First obj1 = new First(45, 23);
		obj1.display();
	}

}
