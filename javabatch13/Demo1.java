package javabatch13;

interface First{
	
	abstract void interest();
}


//Abstract class doesn't instantiate object
abstract class C implements First{
	//Annotation
//	@Override
//	public void interest() {
//		System.out.println("Overridden Interest Method ");
//		
//	}
	
}


class A extends C{
	
	
	void play() {
		System.out.println("Play of Class A");
	}

	@Override
	public void interest() {
		System.out.println("Interest Function inside the Class A");
		
	}
}





public class Demo1 {

	public static void main(String[] args) {
		
		
//		C obj2 = new C();
		A obj2 = new A();
		obj2.interest();
	}

}
