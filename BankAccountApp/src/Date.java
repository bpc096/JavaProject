import java.util.Scanner;

public class Date {
	
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public Date() {
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}
	
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(Date date) {
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Date of Birth");
		System.out.println("Day : ");
		day = scan.nextInt();
		
		System.out.println("Month : ");
		month = scan.nextInt();
		
		System.out.println("Year : ");
		year = scan.nextInt();
	}
	
}
