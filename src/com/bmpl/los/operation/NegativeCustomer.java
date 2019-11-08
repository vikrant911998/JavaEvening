package com.bmpl.los.operation;

import java.util.ArrayList;

import com.bmpl.los.customer.Customer;
import com.bmpl.los.customer.PersonalInformation;

public interface NegativeCustomer {
	
	
	public static ArrayList<Customer> getNegativeCustomers(){
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		Customer customer = new Customer();
		PersonalInformation pd = new PersonalInformation();
		
		pd.setFirstName("vikrant");
		pd.setLastName("singh");
		pd.setAge(23);
		pd.setMobile_no(1234567890);
		pd.setVoterId("KDS435FJG");
		pd.setEmail("vikrant12@gmail.com");
		
		customer.setPersonal(pd);
		list.add(customer);

		customer = new Customer();
		
		pd = new PersonalInformation();
		pd.setFirstName("vikas");
		pd.setLastName("singh");
		pd.setAge(25);
		pd.setMobile_no(345678905);
		pd.setVoterId("WET435FJG");
		pd.setEmail("vikas12@gmail.com");
		
		customer.setPersonal(pd);
		list.add(customer);
		
		return list;
		
	}	
}
