package Guest;

public class PermanentGuest extends Guest {
	
	public PermanentGuest(String name, String birth, String room, String iD) {
		super(name, birth, room, iD);
	}

	private int rentFee;
	private String extendStatus, expirationDate;
	
	

	@Override
	protected void displaySpecificData() {
		System.out.println("Rent Fee : " + rentFee);
		System.out.println("Extend Status : " + extendStatus);
		System.out.println("Expiration Date : " + expirationDate);
	}

	@Override
	public void specificUpdate() {
		
		System.out.println("Input Rent Fee : ");
		rentFee = scan.nextInt();
		
		System.out.println("Input Extend Status : ");
		extendStatus = scan.next();
		
		System.out.println("Input Expiration Date : ");
		expirationDate = scan.next();
		
	}

}
