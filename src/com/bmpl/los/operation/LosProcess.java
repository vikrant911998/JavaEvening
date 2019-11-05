package com.bmpl.los.operation;

import java.util.ArrayList;

import com.bmpl.los.customer.Customer;
import com.bmpl.los.customer.LoanDetails;
import com.bmpl.los.customer.PersonalInformation;
import com.bmpl.los.utils.StageConstants;
import com.bmpl.los.utils.Utility;

public class LosProcess implements StageConstants {
	
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	
	public void sourcing() {
		
		Customer customer = new Customer();
		customer.setLoanId(Utility.SERIAL_COUNTER);
		customer.setStage(SOURCING);
		
		
		System.out.println("Enter the First Name");
		String firstName = Utility.scanner.next();
		
		System.out.println("Enter the Last Name");
		String lastName = Utility.scanner.next();
		
		System.out.println("Enter the age");
		int age = Utility.scanner.nextInt();
		
		System.out.println("Enter the gender");
		String gender = Utility.scanner.next();
		
		System.out.println("Enter th mobile_no");
		long mobile = Utility.scanner.nextLong();
		
		System.out.println("Enter the email ID");
		String email = Utility.scanner.next();
		
		System.out.println("Enter the Loan Type: HL, AL, EL, PL");
		String type = Utility.scanner.next();
		
		System.out.println("Enter the Amount");
		double amount = Utility.scanner.nextDouble();
		
		System.out.println("Enter the duration ");
		int duration = Utility.scanner.nextInt();
		
		PersonalInformation personal =  new PersonalInformation();
		
		personal.setFirstName(firstName);
		personal.setLastName(lastName);
		personal.setAge(age);
		personal.setGender(gender);
		personal.setMobile_no(mobile);
		personal.setEmail(email);
		
		customer.setPersonal(personal);
		
		LoanDetails loanDetails = new LoanDetails();
		loanDetails.setType(type);
		loanDetails.setAmount(amount);
		loanDetails.setDuration(duration);
		
		customer.setLoanDetails(loanDetails);

		customers.add(customer);
		
		Utility.SERIAL_COUNTER++;
		System.out.println("Sourcing Done......");
	}
	
	
	public boolean checkStage(int applicationNumber) {
		
		for(Customer customer:customers) {
			if(customer.getLoanId() == applicationNumber) {
				return true;
			}
		}
		return false;
		
	}
			

}
