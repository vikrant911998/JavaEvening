package javabatch6;

class AddAmount{
	int amount = 50;
	
	public AddAmount() {
		System.out.println("Amount : "+this.amount);
	}
	
	public AddAmount(int amount) {
		this.amount = this.amount + amount;
		System.out.println("Amount : "+this.amount);
	}
	
}


public class Demo4 {

	public static void main(String[] args) {
		AddAmount a1 = new AddAmount();
		AddAmount a2 = new AddAmount(500);

	}

}
