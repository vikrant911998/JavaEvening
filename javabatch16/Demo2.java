package javabatch16;

import java.util.ArrayList;
import java.util.Scanner;

class BankAccount{
	
	private String accountNumber;
	private String accountHolderName;
	private String address;
	private String accountType;
	private double accountBalance;
	private int numberOfTransanctions;


	public BankAccount() {
		this.accountBalance = 1000;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public int getNumberOfTransanctions() {
		return numberOfTransanctions;
	}
	public void setNumberOfTransanctions(int numberOfTransanctions) {
		this.numberOfTransanctions = numberOfTransanctions;
	}
	
	public void deposit(double d) {
		this.accountBalance +=d;
		this.numberOfTransanctions++;
	}
	
	
}


public class Demo2 {

	public static void main(String[] args) {
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();
		
		int count=1000;
		BankAccount obj;
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=2;i++) {
			obj = new BankAccount();
			
			obj.setAccountNumber("BA"+count);
			
			System.out.println("Enter the depositor name");
			obj.setAccountHolderName(sc.nextLine());
			
			System.out.println("Enter the depositor address");
			obj.setAddress(sc.nextLine());
			
			
			System.out.println("Enter the account type");
			obj.setAccountType(sc.nextLine());
			
			obj.deposit(count);
			
			list.add(obj);
			
			count++;
			
		}
		
		
		for(BankAccount b:list) {
			System.out.println("Account Number : "+b.getAccountNumber());
			System.out.println("Account Holder Name : "+b.getAccountHolderName());
			System.out.println("Account Type : "+b.getAccountType());
			System.out.println("Address : "+b.getAddress());
			System.out.println("Account Balance : "+b.getAccountBalance());
			System.out.println("Number of Transanctions : "+b.getNumberOfTransanctions());
			System.out.println();
		}
		
		
		

	}

}
