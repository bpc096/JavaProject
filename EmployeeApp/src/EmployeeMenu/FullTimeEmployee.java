package EmployeeMenu;

import java.util.Scanner;

/**
 * @author Bill Petrus
 *
 */
public class FullTimeEmployee extends Employee{
	
	private float salary;

	public FullTimeEmployee() {
		super();
		this.salary = 0;
	}

	public FullTimeEmployee(Name name, Date dob, String nim, float salary) {
		super(name, dob, nim);
		this.salary = salary;
	}	
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Full Time Employee");
		//Get Employee Input
		super.input();
		System.out.println("Salary : ");
		salary = scan.nextFloat();
	}
	
	public void print() {
		System.out.println("Full Time Employee");
		System.out.println("--------------------");
		super.print();
		System.out.println("Salary : " + salary);
		System.out.println("////////////////////////////");
	}

	@Override
	public String toString() {
		return "Full Time Employee";
	}
	
}
