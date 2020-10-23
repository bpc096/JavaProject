package StudentCreator;

import Student.OnlineStudent;
import Student.Student;

public class OnlineCreator implements Creator {
	
	private String address;
	private String name, dob, id;
	
	public OnlineCreator(String name, String id, String dob, String address) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.address = address;
	}

	
	@Override
	public Student create() {
		return new OnlineStudent(name, id, dob, address);
	}

}
