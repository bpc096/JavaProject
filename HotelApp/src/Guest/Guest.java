package Guest;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Guest {
	
	protected String name, birth, room, ID;
	protected ArrayList<String> facilities = new ArrayList<>();
	protected Scanner scan;
	
	public Guest(String name, String birth, String room, String iD) {
		super();
		this.name = name;
		this.birth = birth;
		this.room = room;
		ID = iD;
		scan = new Scanner(System.in);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	public void addFacility(String facility) {
		facilities.add(facility);
	}
	
	public void displayFacilities() {
		System.out.println("Facilities : ");
		System.out.println("=============");
		for(int i=0;i<facilities.size();i++) {
			System.out.println((i+1) + ". " + facilities.get(i));
		}
		System.out.println("=============");
	}
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("ID : " + ID);
		System.out.println("Birth : " + birth);
		System.out.println("Room : " + room);
		System.out.println("==================");
		displaySpecificData();
	}
	
	protected abstract void displaySpecificData();
	
	public void update() {
		System.out.println("Input name : ");
		name = scan.next();
		
		System.out.println("Input ID : ");
		ID = scan.next();
		
		System.out.println("Input birth : ");
		birth = scan.next();
		
		System.out.println("Input room : ");
		room = scan.next();
		
		specificUpdate();
		
	}
	
	public abstract void specificUpdate();
}
