package Creator;

import Guest.Guest;
import Guest.RegularGuest;

public class RegularCreator implements Creator {
	
	protected String name, birth, room, ID;

	public RegularCreator(String name, String birth, String room, String iD) {
		super();
		this.name = name;
		this.birth = birth;
		this.room = room;
		ID = iD;
	}

	@Override
	public Guest create() {
		return new RegularGuest(name, birth, room, ID);
	}

}
