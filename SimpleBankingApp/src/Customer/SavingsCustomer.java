package Customer;

import java.util.Scanner;
import Transaction.Transaction;

public class SavingsCustomer extends Customer {
	
	

	public SavingsCustomer(String name, String dob, String acocuntNumber) {
		super(name, dob, acocuntNumber);
		scan = new Scanner(System.in);
	}

	@Override
	public void update() {
		System.out.println("Input transaction date : ");
		String date = scan.next();
		
		System.out.println("Input transaction details : ");
		String detail = scan.next();
		
		System.out.println("Input transaction amount : ");
		int amount = scan.nextInt();
		
		transactions.add(new Transaction(date, amount, detail));
	}

	@Override
	public void displayAdditionalData() {
		
	}

}
