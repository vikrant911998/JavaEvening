package com.bmpl.los.operation;

import java.util.ArrayList;

import com.bmpl.los.customer.Customer;
import com.bmpl.los.customer.LoanDetails;
import com.bmpl.los.customer.PersonalInformation;
import com.bmpl.los.utils.CommonConstants;
import com.bmpl.los.utils.LoanConstants;
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
		
		customer.setStage(DEDUPE);
		boolean isNegativeFound = false;
		
		ArrayList<Customer> list = NegativeCustomer.getNegativeCustomers();
//		for(Customer cus:list) {
//			System.out.println(cus.getPersonal().getFirstName());
//		}
		
		for(Customer negative:list) {
//			System.out.println(negative.getPersonal().getFirstName());
			int negativeScore = isNegative(customer,negative);
			
			if(negativeScore >0) {
				System.out.println("Customer found negative in dedupe stage"
						+ "with negative score "+negativeScore);
				isNegativeFound = true;
				break;
			}
		}
		
		if(isNegativeFound) {
			System.out.println("Do you want to take this loan");
			char choice = Utility.scanner.next().toUpperCase().charAt(0);
			
			if(choice == NO) {
				customer.setRemarks("Your Loan Request has been denied");
				customer.setStage(REJECT);
				
				return ;
			}
		}
		
		
	}
	
	int isNegative(Customer customer, Customer negative) {
//		System.out.println(customer.getPersonal().getFirstName().eq);
		int score = 0;
		
		if(customer.getPersonal().getFirstName()
				.equals(negative.getPersonal().getFirstName())) {
//			System.out.println("Inside firstname");
			score = score + 20;
			
		}
		
		if(customer.getPersonal().getLastName()
				.equals(negative.getPersonal().getLastName())) {
			System.out.println("Inside second name");
			score += 20;
		}
		
		if(customer.getPersonal().getMobile_no() == 
				negative.getPersonal().getMobile_no()) {
			score += 20;
		}
		
		if(customer.getPersonal().getEmail()
				.equals(negative.getPersonal().getEmail())) {
			score +=20;
		}
		
		if(customer.getPersonal().getVoterId()
				.equals(negative.getPersonal().getVoterId())) {
			score += 20;
		}
		
		
		
		return score;

	}
	
	public void scoring(Customer customer) {
		customer.setStage(SCORING);
		int score = 0;
		
		double totalIncome = customer.getIncome()-customer.getLiability();
		
		if(customer.getPersonal().getAge() >21 && 
				customer.getPersonal().getAge() <40) {
			score +=50;
			System.out.println("You got 50 points due to Age Score");
		}
		
		if(totalIncome >= 100000) {
			score += 50;
			System.out.println("You got 50 more points due to Income Score");
		}
		
		System.out.println("Customer, Your Final Score is "+score);
		customer.getLoanDetails().setScore(score);		
		
	}
	
	
	public void approval(Customer customer) {
		customer.setStage(APPROVAL);
		int score = customer.getLoanDetails().getScore();
		
		double approvedAmount = customer.getLoanDetails().getAmount()*(score/100);
		
		System.out.println("Your Approved Amount is "+approvedAmount);
		
		
		System.out.println("Do you want to take this loan");
		char choice  = Utility.scanner.next().toUpperCase().charAt(0);
		
		if(choice == NO) {
			customer.setStage(REJECT);
			customer.setRemarks("Customer denied the Approved Amount "+approvedAmount);
			return;
		}
		else {
			showEmi(customer);
		}
		
	}
	
	public void showEmi(Customer customer) {
		
		if(customer.getLoanDetails().getType().
				equalsIgnoreCase(LoanConstants.HOME_LOAN)) {
			customer.getLoanDetails().setRoi(LoanConstants.HOME_LOAN_ROI);
		}
		
		if(customer.getLoanDetails().getType().
				equalsIgnoreCase(LoanConstants.AUTO_LOAN)){
			customer.getLoanDetails().setRoi(LoanConstants.AUTO_LOAN_ROI);
		}
		
		if(customer.getLoanDetails().getType().
				equalsIgnoreCase(LoanConstants.PERSONAL_LOAN)){
			customer.getLoanDetails().setRoi(LoanConstants.PERSONAL_LOAN_ROI);
		}
		
		double perMonthPrinciple = customer.getLoanDetails().getAmount()/
									customer.getLoanDetails().getDuration();
		
		double perMonthInterest = perMonthPrinciple*customer.getLoanDetails().getRoi();
		double totalEMI = perMonthInterest+perMonthPrinciple;
		
		System.out.println("Your Total EMI is "+totalEMI);
		
	}
	
	public void moveToNextStage(Customer customer) {
		
		while(true) {
			
			
			if(customer.getStage() == SOURCING) {
				System.out.println("Do you want to move to the next stage");
				char choice = Utility.scanner.next()
						.toUpperCase().charAt(0);
//				System.out.println("Inside Sourcing");
				
				if(choice == YES) {
//					System.out.println("going to QDE stage");
					qde(customer);
				}
				else {
					return;
				}
			}
			
			else if(customer.getStage() == QDE) {
				System.out.println("Do you want to move to the next stage");
				char choice = Utility.scanner.next()
						.toUpperCase().charAt(0);
//				System.out.println("Inside QDE");
				
				if(choice == YES) {
//					System.out.println("Going to Dedupe");
					dedupe(customer);
					
				}
				else {
					return;
				}
			}
			
			else if(customer.getStage() == DEDUPE) {
				System.out.println("Do you want to move to the next stage");
				char choice = Utility.scanner.next()
						.toUpperCase().charAt(0);
				
				if(choice == YES) {
					scoring(customer);
				}
				else {
					return;
				}
			}
			
			else if(customer.getStage() == SCORING) {
				System.out.println("Do you want to move to the next stage");
				char choice = Utility.scanner.next()
						.toUpperCase().charAt(0);
				
				if(choice == YES) {
					approval(customer);
				}
				else {
					return;
				}
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
