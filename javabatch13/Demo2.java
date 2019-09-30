package javabatch13;

abstract class FirstObject implements CRUD{//adapter classes
	int a;
	
	
	void play() {
		System.out.println("Play of Class FirstObject");
	}
	
	@Override
	public void create() {
		System.out.println("Create of First Object");
		
	}

	@Override
	public void read() {
		System.out.println("read of First Object");
		
	}

//	@Override
//	public void update() {
//		System.out.println("update of First Object");
//		
//	}
//
//	@Override
//	public void delete() {
//		System.out.println("delete of First Object");
//		
//	}
	
}

class SecondObject extends FirstObject{

	@Override
	public void update() {
		
	}

	@Override
	public void delete() {
			
	}
	
}


public class Demo2 {

	public static void main(String[] args) {
		SecondObject obj1 = new SecondObject();
//		FirstObject obj1 = new FirstObject();
		obj1.create();
		obj1.play();
		obj1.first();
		System.out.println(obj1.CONSTANT);

	}

}
