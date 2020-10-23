import java.util.Scanner;

public class Owner{
	
	private String name = "";
	private String nim;
	private Date dob;
	
	public Owner(String name, String nim, Date dob) {
		super();
		this.name = name;
		this.nim = nim;
		this.dob = new Date(dob);
	}
	
	
	public Owner() {
		this.name = name;
		this.nim = nim;
		this.dob = dob;
	}
	
	public Owner(Owner owner) {
		this.name = owner.name;
		this.nim = owner.nim;
		this.dob = new Date(owner.dob);
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNim() {
		return nim;
	}


	public void setNim(String nim) {
		this.nim = nim;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Owner Information");
		System.out.println("Owner Name : ");
		this.name = scan.nextLine();
		System.out.println("Owner NIM : ");
		this.nim = scan.nextLine();
		System.out.println("Owner DOB : ");
		this.dob.input();
	}
	
	public void print() {
		System.out.println("Owner Information");
		System.out.println("Name : " + this.name);
		System.out.println("NIM : " + this.nim);
		System.out.println("DOB : " + this.dob);
	}


	@Override
	public String toString() {
		return this.name + "(" + this.nim + ")";
	}
	
	
	
}
