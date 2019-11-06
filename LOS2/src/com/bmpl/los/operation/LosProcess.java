package com.bmpl.los.operation;

import java.util.ArrayList;

import com.bmpl.los.customer.Customer;
import com.bmpl.los.customer.LoanDetails;
import com.bmpl.los.customer.PersonalInformation;
import com.bmpl.los.utils.CommonConstants;
import com.bmpl.los.utils.StageConstants;
import com.bmpl.los.utils.Utility;


public class LosProcess implements StageConstants,CommonConstants {
	
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
	
	
	public void qde(Customer customer) {
		customer.setStage(QDE);
		
		System.out.println("Name : "+customer.getPersonal()
			.getFirstName()+" "+customer.
			getPersonal().getLastName());
		System.out.println("Age : "+customer.getPersonal().getAge());
		
		System.out.println("Amount : "+customer.getLoanDetails()
			.getAmount());
		System.out.println("Duration : "+customer.getLoanDetails()
			.getDuration());
		System.out.println("Loan Type : "+customer.getLoanDetails()
			.getType());
		
		
		System.out.println("Enter the voterID");
		String voterId = Utility.scanner.next();
		
		System.out.println("Enter the PanCard");
		String panCard = Utility.scanner.next();
		
		System.out.println("Enter the Income");
		double income = Utility.scanner.nextDouble();
		
		System.out.println("Enter the Liability");
		double liability = Utility.scanner.nextDouble();
		
		PersonalInformation personal = new PersonalInformation();
		
		personal.setPanCard(panCard);
		personal.setVoterId(voterId);
		customer.setPersonal(personal);
		
		customer.setIncome(income);
		customer.setLiability(liability);
		
		System.out.println("QDE Done.........");
	}
	
	public void dedupe(Customer customer) {
		
	}
	
	public void moveToNextStage(Customer customer) {
		
		if(customer.getStage() == SOURCING) {
			System.out.println("Do you want to move to the next stage");
			char choice = Utility.scanner.next()
					.toUpperCase().charAt(0);
			
			if(choice == YES) {
				qde(customer);
			}
			else {
				return;
			}
		}
		
		if(customer.getStage() == QDE) {
			System.out.println("Do you want to move to the next stage");
			char choice = Utility.scanner.next()
					.toUpperCase().charAt(0);
			
			if(choice == YES) {
				dedupe(customer);
			}
			else {
				return;
			}
		}
		
		
		
	}
	
	
	public void checkStage(int applicationNumber) {
		
		boolean isUserExist = false;
		
		if(customers != null && customers.size()>0) {
			
			for(Customer customer:customers) {
				
				if(customer.getLoanId() == applicationNumber) {
					
					isUserExist = true;
					
					System.out.println("You are on "+
					Utility.getStageName(customer.getStage())+" Stage");
					
					moveToNextStage(customer);
					break;
				}
				
			}
			
			if(!isUserExist) {
				System.out.println("Invalid application Number");
			}
			
		}
		
	}
			

}
