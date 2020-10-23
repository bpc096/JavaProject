package Customer;

import java.util.Scanner;

public class LoanCustomer extends Customer {
	
	private int interestRate;
	private int installmentsPerMonth;
	private int installmentCount;

	public LoanCustomer(String name, String dob, String acocuntNumber) {
		super(name, dob, acocuntNumber);
		scan = new Scanner(System.in);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		System.out.println("Input Interest Rate : ");
		int interestRate = scan.nextInt();
		
		System.out.println("Input Installments Per Month : ");
		int installmentsPerMonth = scan.nextInt();
		
		System.out.println("Input Installment Count : ");
		int installmentCount = scan.nextInt();
		
		this.interestRate = interestRate;
		this.installmentsPerMonth = installmentsPerMonth;
		this.installmentCount = installmentCount;
	}

	@Override
	public void displayAdditionalData() {
		System.out.println("Interest Rate : " + interestRate);
		System.out.println("Installments Per Month : " + installmentsPerMonth);
		System.out.println("Installment Count : " + installmentCount);
	}

}
