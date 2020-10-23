package EmployeeMenu;

import java.util.Scanner;

public class MainMenu {
	
	// Add Employee Array
	static Employee emp [] = new Employee[100];
	static int EmployeeCount;
	
	// Create a main menu
	public static void mainMenu() {
		System.out.println("Employee Application");
		System.out.println("++++++++++++++++++++");
		System.out.println("1. Add new Employee");
		System.out.println("2. Print All");
		System.out.println("3. Print given Employee");
		System.out.println("4. Exit");
		
	}
	
	// Create a method to get Menu Option
	// Read Integer Number
	public static int getMenuOption() {
		int option = 0;
		do {
			Scanner scan;
			try {
				scan = new Scanner(System.in);
				System.out.println("Enter your option : ");
				option = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Input must be numeric!");
			}
		} while (option < 1 || option > 4);
		return option;
		
	}
	
	public static void printGiven() {
		// GET NIM
		String NIM;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter NIM : ");
		NIM = scan.nextLine();
		for(int i = 0; i < EmployeeCount; i++) {
			if(NIM.equals(emp[i].getNim())) {
				System.out.println("*** GIVEN EMPLOYEE DETAILS ***");
				emp[i].print();
			}
			else {
				System.out.println("No Employee NIM Registered Yet!");
			}
		}
	}
	
	// Create a method to View ALL
	public static void printAll() {
		for(int i = 0; i < EmployeeCount; i++) {
			emp[i].print();
		}
	}
	
	// Now Add methods to the main and crate app
	public static void AddNewEmployee() {
		int type = 0;
		System.out.println("Enter Employee type");
		System.out.println("1-Full Emp | 2-Manager | 3-Contractor");
		type = getMenuOption();
		switch(type) {
			case 1 :
				// FullTimeEmployee
				emp[EmployeeCount] = new FullTimeEmployee();
				emp[EmployeeCount].input();
				EmployeeCount++;
				break;
			case 2 :
				// Manager
				emp[EmployeeCount] = new Manager();
				emp[EmployeeCount].input();
				EmployeeCount++;
				break;
			case 3 :
				// Contractor
				emp[EmployeeCount] = new ContEmp();
				emp[EmployeeCount].input();
				EmployeeCount++;
				break;
		}
		
	}
	
	public static void main(String[] args) {
		
		EmployeeCount = 0;
		// Main Loop
		int op = 0;
		do {
			mainMenu();
			op = getMenuOption();
			
			switch(op) {
				case 1 :
					System.out.println("Insert");
					AddNewEmployee();
					break;
				case 2 :
					System.out.println("View ALL");
					System.out.println("========================");
					printAll();
					break;
				case 3 :
					System.out.println("Print GIVEN");
					printGiven();
					break;
				case 4 : 
					System.out.println("Thanks for your information!");
					break;
				default :
					System.out.println("ERROR INPUT!");
			}
			
		}while(op != 4);
		
		
		//Date date = new Date(20, 6, 2019);
		//System.out.println("" + date);
		
		//Name name = new Name("Bill", "Petrus", "Cerullo");
		//System.out.println("" + name);
		
		//Employee employee = new Employee();
		//employee.input();
		//employee.print();
		
		//FullTimeEmployee ftemp = new FullTimeEmployee();
		//ftemp.input();
		//ftemp.print();
		
		//ContEmp ce = new ContEmp();
		//ce.input();
		//ce.print();
		
		//Manager me = new Manager();
		//me.input();
		//me.print();
		
	}

}
