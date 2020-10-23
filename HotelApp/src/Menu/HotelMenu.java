package Menu;


import Database.GuestDatabase;
import Guest.Guest;

import java.util.Scanner;

import Creator.GuestFactory;
import Creator.PermanentCreator;
import Creator.RegularCreator;

public class HotelMenu implements Menu {
	
	private int input;
	private Scanner scan;
	private GuestDatabase db;
	private GuestFactory factory;
	
	public HotelMenu() {
		scan = new Scanner(System.in);
		input = 1;
		db = new GuestDatabase();
	}

	@Override
	public void display() {
		while(input >= 1 && input <= 4) {
			System.out.println("=======================");
			System.out.println("1. Insert new guest");
			System.out.println("2. Search For a guest");
			System.out.println("3. Delete guest");
			System.out.println("4. Update guest Data");
			System.out.println("5. Quit");
			System.out.println("=======================");
			System.out.println("Input : ");
			input = scan.nextInt();
			
			if(input == 1) {
				int typeInput = 0;
				Guest guest = null;
				
				System.out.println("Input 1 for permanent, 2 for regular : ");
				typeInput = scan.nextInt();
				
				System.out.println("Input name : ");
				String nama = scan.next();
				
				System.out.println("Input ID : ");
				String ID = scan.next();
				
				System.out.println("Input Date of Birth : ");
				String dob = scan.next();
				
				System.out.println("Input Room : ");
				String room = scan.next();
				
				if(typeInput == 1) {
					factory = new GuestFactory(new PermanentCreator(nama, dob, room, ID));
					
				}
				else {
					factory = new GuestFactory(new RegularCreator(nama, dob, room, ID));
				}
				guest = factory.create();
				guest.specificUpdate();
				
				db.addGuest(guest);
				
			}
			else if(input == 2) {
				
				System.out.println("Input Account Number : ");
				String ID = scan.next();
				
				Guest result = db.searchGuest(ID);
				result.display();
				
			}
			else if(input == 3) {
				System.out.println("Input Account Number : ");
				String ID = scan.next();
				
				db.searchAndDelete(ID);
			}
			else if(input == 4) {
				System.out.println("Input Account Number : ");
				String ID = scan.next();
				
				Guest result = db.searchGuest(ID);
				result.update();
			}

		}
	}

}
