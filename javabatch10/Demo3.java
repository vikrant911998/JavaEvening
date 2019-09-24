package javabatch10;

import java.util.Scanner;

class BankAccount{
	String depositorName;
	String depositorAddress;
	String accountType;
	double accountBalance;
	int transanctions;
	Scanner sc = new Scanner(System.in);
	static int count=543210000;
	
	
	public static String generate_Account_number() {
		return "BACC"+count++;
	}
	
	public void display() {
		System.out.println("Depositor Name : "+this.depositorName);
		System.out.println("Depositor Address : "+this.depositorAddress);
		System.out.println("Account Type : "+this.accountType);
		System.out.println("Account Balance : "+this.accountBalance);
		System.out.println("Number of Transanctions : "+this.transanctions);
	}
	
	public void addAmount() {
		this.accountBalance += 45000;
	}
	
	public void reduceAmount() {
		this.accountBalance -= 5000;
	}
	
	public void changeAddress() {
		System.out.println("Enter the new Address");
		this.depositorAddress = sc.nextLine();
	}
}


public class Demo3 {

	public static void main(String[] args) {
			
		BankAccount obj = new BankAccount();
		obj.display();
		System.out.println();
		obj.addAmount();
		obj.display();
		System.out.println();
		obj.reduceAmount();
		obj.display();
		System.out.println();
		obj.changeAddress();
		obj.display();
		
//		System.out.println(BankAccount.generate_Account_number());
//		System.out.println(BankAccount.generate_Account_number());
//		System.out.println(BankAccount.generate_Account_number());
		
	}

}
