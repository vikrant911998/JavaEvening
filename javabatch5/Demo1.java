package javabatch5;

class A{
	int a;
	
	public void play() {
		System.out.println("Play of Class A");
	}
	
	public void play(int a) {
		System.out.println("Parameter Play of Class A :"+a);
	}
	
	public void play(String s) {
		System.out.println("String Play of Class A :"+s);
	}
}


public class Demo1 {

	public static void main(String[] args) {
		
		A sc = new A();
		sc.play();
		sc.play(45);
		sc.play("Vikrant");
		

	}

}
