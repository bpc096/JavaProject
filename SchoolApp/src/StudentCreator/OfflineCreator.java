package StudentCreator;

import Student.OfflineStudent;
import Student.Student;

public class OfflineCreator implements Creator {
	private int absence;
	private String name; 
	private String id; 
	private String dob;
	
	public OfflineCreator(String name, String id, String dob, int absence) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.absence = absence;
	}

	
	@Override
	public Student create() {
		return new OfflineStudent(name, id, dob, absence);
	}

}
