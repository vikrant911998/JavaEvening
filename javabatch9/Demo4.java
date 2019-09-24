package javabatch9;

//Overriding

class First{
	
	public void play() {
		System.out.println("Play of Class First");
	}
}

class Second extends First{
	
	//Annotation for Overriding
	@Override
	public void play() {
		System.out.println("Play of Class Second");
	}
	
	public void play1() {
		System.out.println("Play one of Class Second");
	}
}

public class Demo4 {

	public static void main(String[] args) {
//		First obj = new First();
//		obj.play();
		
		
		Second obj = new Second();
		obj.play();
		obj.play1();
	}

}
