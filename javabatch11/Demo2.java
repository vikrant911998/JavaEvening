package javabatch11;

import java.util.ArrayList;

class Student{
	private String name,address;
	private int age;
	
	public Student(){
		this.name = "Unknown";
		this.age = 0;
		this.address = "Not available";
	}
	
	public void setInfo(String name, int age) {
		this.name  = name;
		this.age = age;
	}
	
	public void setInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}





public class Demo2 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student obj = new Student();
		obj.setInfo("vikrant",23,"rohini");
		list.add(obj);
		
		Student obj1 = new Student();
		obj1.setInfo("rahul",27,"pitampura");
		list.add(obj1);
		
		Student obj2 = new Student();
		obj2.setInfo("vikrant singh",25,"rohini sec-5");
		list.add(obj2);
		
		for(Student s:list) {
			System.out.println(s.getName());
			System.out.println(s.getAge());
			System.out.println(s.getAddress());
			System.out.println("******************");
		}
		
		
		
	}

}
