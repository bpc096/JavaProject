package Database;

import java.util.ArrayList;

import Customer.Customer;

public class CustomerDatabase {
	private ArrayList<Customer> customers = new ArrayList<>();
	
	public void addCustomer(Customer c) {
		customers.add(c);
	}
	
	public Customer searchCustomer(String accountNumber) {
		for(int i=0;i<customers.size();i++) {
			if(customers.get(i).getName().equals(accountNumber)) {
				return customers.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<Customer> getCustomers(){ return customers; }
	
	public void searchAndDelete(String accountNumber) {
		Customer c = searchCustomer(accountNumber);
		customers.remove(c);
	}
}
