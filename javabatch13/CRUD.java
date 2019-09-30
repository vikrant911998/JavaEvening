package javabatch13;

public interface CRUD {
	
	String CONSTANT = "Constant of CRUD interface";
	
	
	//function declaration inside the interface
	void create();
	void read();
	void update();
	void delete();
	
	default void first() {
		System.out.println("first of interface");
	}
	
	static void second() {
		
	}
	
}
