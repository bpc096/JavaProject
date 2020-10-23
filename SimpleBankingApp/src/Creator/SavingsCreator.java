package Creator;

import Customer.Customer;
import Customer.LoanCustomer;
import Customer.SavingsCustomer;

public class SavingsCreator implements Creator {
	
private String name, dob, accountNumber;
	
	public SavingsCreator(String name, String dob, String accountNumber) {
		this.name = name;
		this.dob = dob;
		this.accountNumber = accountNumber;
	}

	@Override
	public Customer create() {
		return new SavingsCustomer(name, dob, accountNumber);
	}

}
