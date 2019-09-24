package javabatch10;

//Upcasting and DownCasting

class A{
	void play() {
		System.out.println("Play of Class A");
	}
}

class B extends A{
	void play1() {
		System.out.println("Play1 of Class B");
	}
}

//char c ='A';
//int f = (int)c;



public class Demo1 {

	public static void main(String[] args) {
//		B obj  = new B();
	    A obj  = new B();	//upcasting
	    obj.play();
	    
	    
	    B obj1 = (B)obj;   //downcasting
	    obj1.play1();
	    obj1.play();
	    
	    

	}

}
