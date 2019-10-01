package javabatch14;

abstract class Marks{
	
	abstract void getPercentage();
}


class A extends Marks{
	private int m1,m2,m3;
	
	public A(int a1,int a2,int a3){
		this.m1 = a1;
		this.m2 = a2;
		this.m3 = a3;
	}

	@Override
	void getPercentage() {
		double percent = ((m1+m2+m3)*100)/300;
		System.out.println("Percent Of A : "+percent);
		
	}
	
}

class B extends Marks{
	private int m1,m2,m3,m4;
	
	public B(int a1,int a2,int a3, int a4) {
		this.m1 = a1;
		this.m2 = a2;
		this.m3 = a3;
		this.m4 = a4;
	}
	
	@Override
	void getPercentage() {
		double percent = ((m1+m2+m3+m4)*100)/400;
		System.out.println("Percent Of B : "+percent);
		
	}
	
}


public class Demo1 {

	public static void main(String[] args) {
		
		A obj = new A(45, 25, 56);
		obj.getPercentage();
		
		B obj1 = new B(45, 25, 56,75);
		obj1.getPercentage();

	}

}
