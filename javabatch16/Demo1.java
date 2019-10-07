package javabatch16;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	
	private int rollno;
	private String name;
	private byte age;
	
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
	
	public byte getAge() {
		return age;
	}
	
	public void setAge(byte age) {
		this.age = age;
	}
	
	
}

public class Demo1 {

	public static void main(String[] args) {
		
		ArrayList<Student> list  = new ArrayList<Student>();
		
		Student obj;
		Scanner sc = new Scanner(System.in);
		String name;
		int rollno;
		byte age;
		
		for(int i=0;i<3;i++) {
			obj = new Student();
			
			System.out.println("Enter the roll no");
			rollno = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter the student name");
			name = sc.nextLine();
			
			System.out.println("Enter the student age");
			age = sc.nextByte();
			
			
			obj.setRollno(rollno);
			obj.setName(name);
			obj.setAge(age);
			
			list.add(obj);
				
		}
		
		
		for(Student s:list) {
			System.out.println("Name : "+s.getName());
		}
		

	}

}






