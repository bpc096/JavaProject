package Creator;

import Customer.Customer;

public class CustomerFactory {
	
	private Creator creator;

	public CustomerFactory(Creator creator) {
		this.creator = creator;
	}
	
	public Customer create() {
		return creator.create();
	}
}
