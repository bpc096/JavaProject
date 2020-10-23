package Database;

import java.util.ArrayList;

import Guest.Guest;

public class GuestDatabase {
	private ArrayList<Guest> guests = new ArrayList<>();
	
	public void addGuest(Guest c) {
		guests.add(c);
	}
	
	public Guest searchGuest(String ID) {
		for(int i=0;i<guests.size();i++) {
			if(guests.get(i).getID().equals(ID)) {
				return guests.get(i);
			}
		}
		return null;
	}
	
	public ArrayList<Guest> getGuests(){ return guests; }
	
	public void searchAndDelete(String ID) {
		Guest c = searchGuest(ID);
		guests.remove(c);
	}
}
