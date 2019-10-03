package javabatch15;

import java.util.ArrayList;

class Student{
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
		
}


public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<>();
		
		
		
		Student s1 = new Student();
		s1.setName("RAM");
		s1.setRollno(101);
		
		list.add(s1);
		
		Student s2 = new Student();
		s2.setName("SHYAM");
		s2.setRollno(102);
		
		list.add(s2);
		
		
		for(Student s:list) {
			System.out.println("Name : "+s.getName());
			System.out.println("Roll No : "+s.getRollno());
			System.out.println();
		}
		

	}

}
