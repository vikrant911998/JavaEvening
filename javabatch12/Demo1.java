package javabatch12;

interface Constant{
	int INTEGER_CONSTANT = 50;
	String STRING_CONSTANT = "Const";
	
	void play();
	void show();
	
	default void m2() {
		System.out.println("m2 method");
	}
	
	static void m1() {
		
	}
	
}

abstract class ProjectConstant implements Constant{
		abstract void show1();
		void play1() {
			System.out.println("Play one of abstract Class");
		}
}

class GameConstant extends ProjectConstant{

	@Override
	public void play() {
		System.out.println("Overridden Play Method");
		
	}

	@Override
	public void show() {
		System.out.println("Overridden Show Method");
		
	}

	@Override
	void show1() {
		System.out.println("Overridden Show1 Method");
		
	}
	
}


public class Demo1 {

	public static void main(String[] args) {
		GameConstant obj = new GameConstant();
		obj.play();
		obj.play1();
		obj.show();
		obj.show1();
		obj.m2();

	}

}
