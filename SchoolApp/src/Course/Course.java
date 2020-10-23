package Course;

import java.util.Scanner;

public class Course {
	
	private String name;
	private String grade;
	private String examSchedule;
	private Scanner scan;
	
	public Course(String name, String grade, String examSchedule) {
		super();
		this.name = name;
		this.grade = grade;
		this.examSchedule = examSchedule;
		
		scan = new Scanner(System.in);
	}
	
	public Course(String name) {
		super();
		this.name = name;
		
		scan = new Scanner(System.in);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getExamSchedule() {
		return examSchedule;
	}

	public void setExamSchedule(String examSchedule) {
		this.examSchedule = examSchedule;
	}
	
	public void update() {
		System.out.println("Input new name : ");
		String name = scan.next();
		System.out.println("Input new grade : ");
		String grade = scan.next();
		System.out.println("Input new exam schedule : ");
		String examSchedule = scan.next();
		
		setName(name);
		setGrade(grade);
		setExamSchedule(examSchedule);
	}
}
