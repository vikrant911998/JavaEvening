package javabatch10;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	double height;
	String name;
	Scanner sc = new Scanner(System.in);
	
	void input() {
		System.out.println("Enter the name");
		this.name = sc.nextLine();
		System.out.println("Enter the height");
		this.height = sc.nextDouble();
	}

}



public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList<Student> list  = new ArrayList<Student>();
		
		for(int i=1;i<=3;i++) {
			Student obj = new Student();
			obj.input();
			list.add(obj);
		}
		double count=0;
		for(Student s:list) {
			count = count + s.height;
		}
		
		System.out.println("SUM : "+count);
		
		System.out.println("Average : "+count/3);
	}

}
