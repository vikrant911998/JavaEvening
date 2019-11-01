package javabatch22;


//Interface with only one abstract method is known as Functional Interface.
interface Account{
	int ID=0;
	//method declaration
	void display();
}
interface Demo{
	
}

//Adapter Classes

//abstract class Account{
//	private int id;
//	private String name;
//	
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	abstract void display();
//}


class SavingAccount implements Account{

	@Override
	public void display() {
		System.out.println("Saving Account Type");
		System.out.println("5% Rate of Interest");
		
	}
	
}

class CurrentAccount implements Account{

	@Override
	public void display() {
		
		
	}
	
}



public class Demo1 {

	public static void main(String[] args) {
		
		
	}

}
