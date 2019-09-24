package javabatch9;

//Access Specifiers
//private 
//public 
//protected
//Default(not written)


class Bank{
	private int amount;
	protected String bankName;
	
	public Bank(int amount){
		this.amount = amount;
	}
	
	public Bank() {
		this.bankName = "";
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void display() {
		System.out.println(this.amount);
	}
	
}

class SBI extends Bank{
	
	public SBI() {
		
		this.bankName = "SBI";
	}
	
}



public class Demo2 {
	
	public static void main(String[] args) {
		Bank bank = new Bank(12);
		bank.display();
		bank.setAmount(45);
		
		System.out.println(bank.getAmount());
//		bank.amount; -->Illegal syntax
//		bank.display();
	}

}
