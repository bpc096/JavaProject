package Student;

import java.util.ArrayList;

import Course.Course;
import Database.CourseDatabase;

public abstract class Student {
	
	protected CourseDatabase takenCourses;
	protected CourseDatabase currentCourses;
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null)
			return false;
		
		Student other = (Student) obj;
		
		if(other == null)
			return false;
		
		return other.id.equals(id);
	}
	
	protected String name, dob, id;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void display() {
		System.out.println("Nama : " + getName());
		System.out.println("ID : " + getId());
		System.out.println("Date Of Birth : " + getDob());
		
		System.out.println("=====================");
		System.out.println("Taken courses");
		
		ArrayList<Course> taken = takenCourses.getCourses();
		for(int i=0;i<taken.size();i++) {
			System.out.println(taken.get(i).getName() + " - " + taken.get(i).getGrade());
		}
		
		System.out.println("---------------------");
		System.out.println("Current courses");
		ArrayList<Course> current = currentCourses.getCourses();
		for(int i=0;i<current.size();i++) {
			System.out.println(current.get(i).getName());
		}
		
		System.out.println("=====================");
		
		specificDisplay();
	}
	
	public void addTakenCourses(Course c) {
		takenCourses.addCourse(c);
	}
	
	public void addCurrentCourses(Course c) {
		currentCourses.addCourse(c);
	}

	public abstract void update();
	public abstract void specificDisplay();
}
