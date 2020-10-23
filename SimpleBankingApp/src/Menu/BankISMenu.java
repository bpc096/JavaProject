package Menu;

import java.util.Scanner;

import Creator.CustomerFactory;
import Creator.LoanCreator;
import Creator.SavingsCreator;
import Customer.Customer;
import Database.CustomerDatabase;

public class BankISMenu implements Menu {
	
	private int input;
	private Scanner scan;
	private CustomerFactory factory;
	private CustomerDatabase db;
	
	public BankISMenu() {
		scan = new Scanner(System.in);
		input = 1;
		db = new CustomerDatabase();
	}


	@Override
	public void display() {
		while(input >= 1 && input <= 4) {
			System.out.println("=======================");
			System.out.println("1. Insert new Customer");
			System.out.println("2. Search For a Customer");
			System.out.println("3. Delete Customer");
			System.out.println("4. Update Customer Data");
			System.out.println("5. Quit");
			System.out.println("=======================");
			System.out.println("Input : ");
			input = scan.nextInt();
			
			if(input == 1) {
				int typeInput = 0;
				Customer customer = null;
				
				System.out.println("Input 1 for saving, 2 for loan : ");
				typeInput = scan.nextInt();
				
				System.out.println("Input nama : ");
				String nama = scan.next();
				
				System.out.println("Input Account Number : ");
				String ID = scan.next();
				
				System.out.println("Input Date of Birth : ");
				String dob = scan.next();
				
				if(typeInput == 1) {
					factory = new CustomerFactory(new SavingsCreator(nama, dob, ID));
					
				}
				else {
					factory = new CustomerFactory(new LoanCreator(nama, dob, ID));
				}
				customer = factory.create();
				customer.update();
				
				db.addCustomer(customer);
				
			}
			else if(input == 2) {
				
				System.out.println("Input Account Number : ");
				String ID = scan.next();
				
				Customer result = db.searchCustomer(ID);
				result.display();
				
			}
			else if(input == 3) {
				System.out.println("Input Account Number : ");
				String ID = scan.next();
				
				db.searchAndDelete(ID);
			}
			else if(input == 4) {
				System.out.println("Input Account Number : ");
				String ID = scan.next();
				
				Customer result = db.searchCustomer(ID);
				result.update();
			}

		}
	}
}
