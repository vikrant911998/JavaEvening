package javabatch5;

import java.util.ArrayList;

class Student{
	int roll_no;
	String name;
	
	public Student(int roll_no,String name){
		this.roll_no = roll_no;
		this.name = name;
	}
	
	public void display() {
		System.out.println("RollNo : "+this.roll_no);
		System.out.println("Name : "+this.name);
	}


}



public class Demo3 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		
		
		Student s1 = new Student(101,"vikrant");
		list.add(s1);
		
		Student s2 = new Student(102,"rahul");
		list.add(s2);
		
		Student s3 = new Student(103,"rohit");
		list.add(s3);
		
		for(Student s:list) {
			s.display();
			System.out.println();
		}

	}

}





