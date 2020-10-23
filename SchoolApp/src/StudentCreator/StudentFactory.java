package StudentCreator;
import Student.Student;

public class StudentFactory {
	
	private Creator creator;
	
	public StudentFactory(Creator creator) {
		super();
		this.creator = creator;
	}

	
	public Student create() {
		return creator.create();
	}
	
}
