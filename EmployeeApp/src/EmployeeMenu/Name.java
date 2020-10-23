package EmployeeMenu;

import java.util.Scanner;

/**
 * @author Bill Petrus
 *
 */
public class Name {
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	public Name() {
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
	}
	
	public Name(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public Name(Name name) {
		this.firstName = name.firstName;
		this.middleName = name.middleName;
		this.lastName = name.lastName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return firstName + " " + middleName + " " + lastName;
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name");
		System.out.println("First Name : ");
		firstName = scan.nextLine();
		
		System.out.println("Middle Name : ");
		middleName = scan.nextLine();
		
		System.out.println("Last Name : ");
		lastName = scan.nextLine();
		
	}
	
	
}
