package javabatch7;

//extends -->Inheritance
//Single Inheritance

class A{
	int a;//instance variable,member variables,data
	
	A(){
		this.a = 45;
		System.out.println("Default Constructor of Class A");
	}
	
	A(int a){
		System.out.println("Parameter Constructor of Class A");
	}
	
	
	//methods,member functions
	void play() {
		System.out.println("Play of Class A");
	}
}

class B extends A{
	
	B(){
		super(4546);
		System.out.println("Default Constructor of Class B");
	}
	
	void show() {
		System.out.println("Show of Class B");
	}
}



public class Demo2 {

	public static void main(String[] args) {
		
		B obj = new B();
		System.out.println(obj.a);
		obj.play();
		obj.show();

	}

}
