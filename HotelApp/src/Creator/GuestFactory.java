package Creator;

import Guest.Guest;

public class GuestFactory {
	
	private Creator creator;

	public GuestFactory(Creator creator) {
		this.creator = creator;
	}
	
	public Guest create() {
		return creator.create();
	}
}
