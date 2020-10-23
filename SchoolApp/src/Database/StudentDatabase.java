package Database;
import java.util.ArrayList;

import Student.Student;

public class StudentDatabase {
	
	private ArrayList<Student> students = new ArrayList<>();
	
	public void add(Student student) {
		students.add(student);
	}
	
	public void delete(Student student) {
		students.remove(student);
	}
	
	public Student search(String id) {
		
		for(int i=0;i<students.size();i++) {
			if(students.get(i).getId().equals(id)) {
				return students.get(i);
			}
		}
		
		return null;
	}
	
	public void searchAndDelete(String id) {
		for(int i=0;i<students.size();i++) {
			if(students.get(i).getId().equals(id)) {
				students.remove(i);
			}
		}
	}
}
