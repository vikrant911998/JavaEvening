package javabatch8;

//Multilevel Inheritance


//Super Class or Parent Class
class A{
	
	void play1() {
		System.out.println("Play 1 of Class A");
	}
	
}


//Child Class or Sub Class Of A
class B extends A{
	
	void play2() {
		System.out.println("Play 2 of Class B");
	}
	
}


//Child Class or Sub Class of B
class C extends B{
	
	void play3() {
		System.out.println("Play 3 of Class C");
	}
	
}



public class Demo1 {

	public static void main(String[] args) {
//		A obj = new A();
//		obj.play1();
		
//		B obj = new B();
//		obj.play1();
//		obj.play2();
		
		C obj = new C();
		obj.play1();
		obj.play2();
		obj.play3();
				
		

	}

}
