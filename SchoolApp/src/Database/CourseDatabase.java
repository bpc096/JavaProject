package Database;

import java.util.ArrayList;

import Course.Course;

public class CourseDatabase {
	
	private ArrayList<Course> courses = new ArrayList<>();
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
	public Course searchCourse(String name) {
		for(int i=0;i<courses.size();i++) {
			if(courses.get(i).getName().equals(name)) {
				return courses.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<Course> getCourses(){ return courses; }

}
