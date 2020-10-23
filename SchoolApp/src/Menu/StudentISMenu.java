package Menu;

import java.util.Scanner;

import Course.Course;
import Database.StudentDatabase;
import Student.OfflineStudent;
import Student.OnlineStudent;
import Student.Student;
import StudentCreator.OfflineCreator;
import StudentCreator.OnlineCreator;
import StudentCreator.StudentFactory;

public class StudentISMenu implements Menu {
	
	private Scanner scan;
	private int input;
	private StudentDatabase db;
	
	private StudentFactory factory;

	public StudentISMenu() {
		super();
		scan = new Scanner(System.in);
		input = 1;
		db = new StudentDatabase();
		
//		Student bill1 = new OfflineStudent("Bill Petrus", "2201438372", "19-7-2000", 2);
//		Student bill2 = new OnlineStudent("Faustine Wilona", "2201438372", "19-7-2000", "Di hatiku");
//		
//		db.add(bill1);
//		db.add(bill2);
	}



	@Override
	public void display() {
		
		
		factory = new StudentFactory(new OfflineCreator("Bill Petrus", "2201438372", "19-7-2000", 2));
		Student st = factory.create();
		db.add(st);
		
		factory = new StudentFactory(new OnlineCreator("Faustine Wilona", "2201438372", "19-7-2000", "Di hatiku"));
		st = factory.create();
		db.add(st);
		
		while(input >= 1 && input <= 6) {
			System.out.println("=======================");
			System.out.println("1. Insert Student");
			System.out.println("2. Search For a Student");
			System.out.println("3. Delete Student");
			System.out.println("4. Update Student Data");
			System.out.println("5. Add Taken Courses");
			System.out.println("6. Add Current Courses");
			System.out.println("7. Quit");
			System.out.println("=======================");
			System.out.println("Input : ");
			input = scan.nextInt();
			
			if(input == 1) {
				int typeInput = 0;
				System.out.println("Input 1 for online, 2 for offline : ");
				typeInput = scan.nextInt();
				
				System.out.println("Input nama : ");
				String nama = scan.next();
				
				System.out.println("Input NIM : ");
				String ID = scan.next();
				
				System.out.println("Input Tanggal Lahir : ");
				String dob = scan.next();
				
				
				
				if(typeInput == 1) {
					String address = null;
					System.out.println("Input address : " );
					address = scan.next();
					factory = new StudentFactory(new OnlineCreator(nama, ID, dob, address));
				}
				else {
					int absence = 0;
					System.out.println("Input absence : " );
					absence = scan.nextInt();
					factory = new StudentFactory(new OfflineCreator(nama, ID, dob, absence));
				}
				
				db.add(factory.create());
			}
			else if(input == 2) {
				String id = null;
				System.out.println("Input student ID : ");
				id = scan.next();
				Student result = db.search(id);
				if(result == null) {
					System.out.println("===Student doesn't exist===");
				}
				else {
					result.display();
				}
			}
			else if(input == 3) {
				String id = null;
				System.out.println("Input student ID : ");
				id = scan.next();
				db.searchAndDelete(id);
			}
			else if(input == 4) {
				String id = null;
				System.out.println("Input student ID : ");
				id = scan.next();
				Student student = db.search(id);
				student.update();
			}
			else if(input == 5) {
				
				String id = null;
				System.out.println("Input student ID : ");
				id = scan.next();
				Student student = db.search(id);
				
				if(student != null) {
					String name = null;
					String grade = null;
					System.out.println("Input course name : ");
					name = scan.next();
					System.out.println("Input grade : ");
					grade = scan.next();
					
					student.addTakenCourses(new Course(name, grade, ""));
				}
				else {
					System.out.println("Student not found!!");
				}
			}
			else {
				String id = null;
				System.out.println("Input student ID : ");
				id = scan.next();
				Student student = db.search(id);
				
				if(student != null) {
					String name = null;
				
					System.out.println("Input course name : ");
					name = scan.next();
					
					student.addTakenCourses(new Course(name));
				}
				else {
					System.out.println("Student not found!!");
				}
			}
		}
		
	}

}
