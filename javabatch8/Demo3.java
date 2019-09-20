package javabatch8;

import java.util.Scanner;

class Member{
	String name;
	int age;
	long phone;
	String address;
	double salary;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name");
		this.name = sc.nextLine();
		
		System.out.println("Enter the age");
		this.age = sc.nextInt();
		
		System.out.println("Enter  the phone number");
		this.phone = sc.nextLong();
		
		sc.nextLine();
		
		System.out.println("Enter the address");
		this.address = sc.nextLine();
		
		System.out.println("Enter the Salary");
		this.salary = sc.nextDouble();
		
	}
	
	void printSalary(){
		System.out.println("Salary : "+this.salary);
	}
}


class Employee extends Member{
	String specialization;
	String department;
	
	Employee(){
		this.specialization = "employee";
		this.department = "IT";
	}
	
	void display() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Phone : "+this.phone);
		System.out.println("Address : "+this.address);
		System.out.println("Specialization : "+this.specialization);
		System.out.println("Department : "+this.department);
	}
	
}


class Manager extends Member{
	String specialization;
	String department;
	
	Manager(){
		this.specialization = "manager";
		this.department = "Forensics";
	}
	
	void display() {
		System.out.println("Name : "+this.name);
		System.out.println("Age : "+this.age);
		System.out.println("Phone : "+this.phone);
		System.out.println("Address : "+this.address);
		System.out.println("Specialization : "+this.specialization);
		System.out.println("Department : "+this.department);
	}
	
}





public class Demo3 {

	public static void main(String[] args) {
//		Employee obj = new Employee();
//		obj.input();
//		obj.display();
//		obj.printSalary();
		
		Manager obj = new Manager();
		obj.input();
		obj.display();
		obj.printSalary();

	}

}
