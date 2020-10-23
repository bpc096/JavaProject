package Creator;

import Guest.Guest;
import Guest.PermanentGuest;

public class PermanentCreator implements Creator {
	
	protected String name, birth, room, ID;

	public PermanentCreator(String name, String birth, String room, String iD) {
		super();
		this.name = name;
		this.birth = birth;
		this.room = room;
		ID = iD;
	}

	@Override
	public Guest create() {
		return new PermanentGuest(name, birth, room, ID);
	}

}
