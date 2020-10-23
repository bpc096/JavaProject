import java.util.Scanner;
import java.util.Vector;

public class MainProgram {
	
	Scanner Scan = new Scanner(System.in);
	Vector<Date> vecDate = new Vector<>();
	Vector<Owner> vecOwner = new Vector<>();
	
	public static void main(String[] args) {
		
		Owner vecOwner = new Owner();
		vecOwner.input();
		vecOwner.print();
		
		//Date date = new Date(22, 6, 2019);
		//System.out.println("" + date);
		
	}

}
