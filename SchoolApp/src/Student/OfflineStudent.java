package Student;

public class OfflineStudent extends Student {
	
	private int absence;

	public OfflineStudent(String name, String id, String dob, int absence) {
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.absence = absence;
	}


	public void update() {
		
	}

	
	public void specificDisplay() {
		String eligibility = isEligible()? "YES" : "NO";
		
		System.out.println("Eligible : " + eligibility);
		
	}
	
	public boolean isEligible() { return absence <= 3; }

}
