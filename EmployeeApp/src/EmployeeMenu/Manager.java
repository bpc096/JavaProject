package EmployeeMenu;

import java.util.Scanner;

public class Manager extends FullTimeEmployee{
	
	private String car;
	private String phone;
	
	public Manager(Name name, Date dob, String nim, float salary, String car, String phone) {
		super(name, dob, nim, salary);
		this.car = car;
		this.phone = phone;
	}
	
	public Manager() {
		super();
		this.car = "";
		this.phone = "";
	}

	@Override
	public String toString() {
		return "Manager";
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Manager");
		//Get Employee Input
		super.input();
		System.out.println("Car Number : ");
		car = scan.nextLine();
		System.out.println("Phone Number : ");
		phone = scan.nextLine();
	}
	
	public void print() {
		System.out.println("Manager");
		System.out.println("--------------------");
		super.print();
		System.out.println("Car : " + car);
		System.out.println("Phone : " + phone);
		System.out.println("////////////////////////////");
	}
	
}
