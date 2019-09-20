package javabatch8;

//Hierarchical Inheritance
class A1{
	void play1() {
		System.out.println("Play 1 of Class A1");
	}
}

class B1 extends A1{
	void play2() {
		System.out.println("Play 2 of Class B1");
	}
}

class C1 extends A1{
	void play3() {
		System.out.println("Play 2 of Class C1");
	}
}


public class Demo2 {

	public static void main(String[] args) {
//		B1 obj = new B1();
//		obj.play1();
//		obj.play2();
		
		C1 obj = new C1();
		obj.play1();
		obj.play3();

	}

}
