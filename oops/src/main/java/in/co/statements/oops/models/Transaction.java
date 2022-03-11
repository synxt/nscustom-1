package in.co.statements.oops.models;

import java.util.Date;

public class Transaction {
	public static int version;
	private int id;
	private Account fromAccount;
	private Account toAccount;
	private double amount;
	private Date transactionDate;
	private String branch;
	private String mode;
	public Transaction(String mode) {
		this.id = 0;
		this.mode = mode;
	}
	public Transaction(int id,String mode) {
		this.id = id;
		this.mode = mode;
	}
	public Account getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(Account fromAccount) {
		this.fromAccount = fromAccount;
	}
	public Account getToAccount() {
		return toAccount;
	}
	public void setToAccount(Account toAccount) {
		this.toAccount = toAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double calculateTax() {
		return amount*0.18;
	}
	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", fromAccount=" + fromAccount + ", toAccount=" + toAccount + ", amount="
				+ amount + ", transactionDate=" + transactionDate + "]";
	}
	
}
