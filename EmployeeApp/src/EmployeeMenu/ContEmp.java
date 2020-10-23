package EmployeeMenu;

import java.util.Scanner;

/**
 * @author Bill Petrus
 *
 */
public class ContEmp extends Employee{
	
	//Hourly Rate = Tarif Gaji Per Jam
	private float hrate;
	//Total Hours
	private int thours;
	
	public ContEmp(Name name, Date dob, String nim, float hrate, int thours) {
		super(name, dob, nim);
		this.hrate = hrate;
		this.thours = thours;
	}
	
	public ContEmp() {
		//Contractor Employee
		super();
		this.hrate = 0;
		this.thours = 0;
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Contract Employee");
		//Get Employee Input
		super.input();
		System.out.println("Hourly Rate : ");
		hrate = scan.nextFloat();
		System.out.println("Total Hours : ");
		thours = scan.nextInt();
	}
	
	public void print() {
		System.out.println("Contractor Employee");
		System.out.println("--------------------");
		super.print();
		System.out.println("Hourly rate : " + hrate);
		System.out.println("Number of hours : " + thours);
		System.out.println("////////////////////////////");
	}

	@Override
	public String toString() {
		return "Contractor";
	}
	
	
	
}
