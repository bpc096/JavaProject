package EmployeeMenu;

import java.util.Scanner;

/**
 * @author Bill Petrus
 *
 */
public class Employee {
	
	private Name name;
	private Date dob;	//Date Of Birth
	private String nim;
	
	public Employee(Name name, Date dob, String nim) {
		super();
		this.name = new Name(name);
		this.dob = new Date(dob);
		this.nim = nim;
	}

	public Employee() {
		this.name = new Name();
		this.dob = new Date();
		this.nim = "0000000000v";
	}

	@Override
	public String toString() {
		return "Employee : " + name;
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee Information");
		System.out.println("--------------------------");
		name.input();
		dob.input();
		
		System.out.println("NIM : ");
		nim = scan.nextLine();
	}
	
	public void print() {
		System.out.println("Employee Details");
		System.out.println("Name : " + name);
		System.out.println("DoB : " + dob);
		System.out.println("NIM : " + nim);
	}
	
	// This Method required to get NIM
	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}
	
	// This method required to get NIM
	
	
}
