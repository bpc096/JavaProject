package Creator;

import Customer.Customer;
import Customer.LoanCustomer;

public class LoanCreator implements Creator {
	
	private String name, dob, accountNumber;
	
	public LoanCreator(String name, String dob, String acocuntNumber) {
		this.name = name;
		this.dob = dob;
		this.accountNumber = accountNumber;
	}

	@Override
	public Customer create() {
		return new LoanCustomer(name, dob, accountNumber);
	}
}
