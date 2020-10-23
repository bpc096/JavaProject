package Customer;

import java.util.ArrayList;
import java.util.Scanner;

import Transaction.Transaction;

public abstract class Customer {
	
	protected String name, dob, accountNumber;
	protected int credit, debit, balance;
	protected ArrayList<Transaction> transactions = new ArrayList<>();
	protected Scanner scan;
	
	public Customer(String name, String dob, String acocuntNumber) {
		super();
		this.name = name;
		this.dob = dob;
		this.accountNumber = acocuntNumber;
		this.credit = 0;
		this.debit = 0;
		this.balance = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAcocuntNumber() {
		return accountNumber;
	}
	public void setAcocuntNumber(String acocuntNumber) {
		this.accountNumber = acocuntNumber;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getDebit() {
		return debit;
	}
	public void setDebit(int debit) {
		this.debit = debit;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void display() {
		System.out.println("=====================");
		System.out.println("Name : " + name);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Date of Birth : " + dob);
		System.out.println("=====================");
		displayTransactions();
		displayAdditionalData();
	}
	
	public void displayTransactions() {
		
		balance = 0;
		
		for(int i=0;i<transactions.size();i++) {
			balance += transactions.get(i).getAmount();
		}
		
		System.out.println("TRANSACTION LIST");
		for(int i=0;i<transactions.size();i++) {
			System.out.println(transactions.get(i).getDate() + " - " + transactions.get(i).getDetail() + " - $" + transactions.get(i).getAmount());
		}
		
		System.out.println("=================");
		System.out.println("Balance : $" + balance);
	}
	
	public abstract void update();
	public abstract void displayAdditionalData();
}
