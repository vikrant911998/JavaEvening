package javabatch11;

interface Standard{
	int AGE = 23;
	
	abstract public void play();
	
}

class B implements Standard{

	@Override
	public void play() {
		System.out.println("PLay of class B "+AGE);
		
	}
	
}




public class Demo3 {

	public static void main(String[] args) {
		

		B obj = new B();
		obj.play();
	}

}
