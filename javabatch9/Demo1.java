package javabatch9;

class Rectangle{
	int length,breadth;
	
	public Rectangle(int length , int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	void area() {
		System.out.println("Area : "+this.length*this.breadth);
	}
	
	void perimeter() {
		System.out.println("Perimeter : "+(2*(this.length+this.breadth)));
	}
	
	
}


class Square extends Rectangle{
	int side;
	
	
	public Square(int side) {
		super(side,side);
		this.side = side;
	}
	void area(){
		System.out.println("Area : "+this.side*this.side);
	}
	
	void perimeter() {
		System.out.println("Perimeter : "+(this.side*4));
	}
	
	
}

public class Demo1 {

	public static void main(String[] args) {
//		Bank b = new Bank();
//		b.bankName = "skdlf";
//		Rectangle rec = new Rectangle(4,15);
//		rec.area();
//		rec.perimeter();
		
		Square square  = new Square(12);
		square.area();
		square.perimeter();
		

	}

}


//integer(int)  --> nextInt();
//double(double) -->nextDouble();
//long (long)  --> nextLong();
//String(String)  -->next()-single word
//					 nextLine()-sentence 