package Guest;

public class RegularGuest extends Guest{
	
	public RegularGuest(String name, String birth, String room, String iD) {
		super(name, birth, room, iD);
	}

	private String checkIn, checkOut;

	@Override
	protected void displaySpecificData() {
		System.out.println("Check in date : " + checkIn);
		System.out.println("Check out date : " + checkOut);
	}

	@Override
	public void specificUpdate() {
		System.out.println("Input check in date : ");
		checkIn = scan.next();
		
		System.out.println("Input check out date : ");
		checkOut = scan.next();
	}

}
