package javabatch4;

class Rectangle{
	int length,breadth;
	
	Rectangle(int l,int b){
		this.length = l;
		this.breadth = b;
	}
	
	void area() {
		System.out.println("Area : "+this.breadth*this.length);
	}
}



public class Demo2 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(4, 5);
		rec.area();

	}

}
