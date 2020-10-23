package Transaction;

public class Transaction {
	private String date;
	private int amount;
	private String detail;
	
	
	public Transaction(String date, int amount, String detail) {
		super();
		this.date = date;
		this.amount = amount;
		this.detail = detail;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
}
