package javabatch4;

class Student{
	//Instance Variable
	int roll_no;
	String name;
	
	//Default Constructor
	Student(){
		System.out.println("Default Constructor");
	}
	
	
	//Parameterised Constructor
	Student(int roll_no, String name){
		this.roll_no = roll_no;
		this.name = name;
	}
	
	void display() {
		System.out.println("Roll No : "+this.roll_no);
		System.out.println("Name : "+this.name);
	}
}




public class Demo1 {

	public static void main(String[] args) {
		
		Student obj1 = new Student(101,"Rahul");
		Student obj2 = new Student(102,"Rohit");
		
		obj1.display();
		obj2.display();
		
//		obj1.roll_no = 101;
//		obj2.roll_no =102;
//		System.out.println("RollNo : "+obj1.roll_no);
//		System.out.println("RollNo : "+obj2.roll_no);
		
		
	}

}
