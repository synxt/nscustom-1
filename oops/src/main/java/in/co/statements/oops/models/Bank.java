package in.co.statements.oops.models;

import java.util.Arrays;
import java.util.Date;

public class Bank {
	private int bankId;
	private String bankName;
	private Customer[] customers = new Customer[3];
	private TransactionBook transactionBook = new TransactionBook();	
	private Account[] accounts = new Account[3];	
	private int customerCount = 0;
	private int accountCount = 0;
	private double totalTax = 0;
	private int transactionIds = 0;
	
	public Bank(int id){
		this.bankId = id;
	}	
	public Bank(int id,String name){
		this.bankId = id;
		this.bankName = name;
	}	
	public void setBankName(String bankName) {		
		this.bankName = bankName;
	}	
	
	//Registering Customer
	void registerCustomer(int customerId, String customerName) {
		Customer cust = new Customer();
		cust.setId(customerId);
		cust.setName(customerName);
		customers[customerCount++] = cust;
	}
	void addAccount(int accountId, int custId) {
		Account acc = new Account();
		acc.setId(accountId);
		acc.setBalance(0);
		accounts[accountCount++] = acc;
		for(Customer customer:customers) {
			if(customer!=null) {
				if(customer.getAccountId() == custId) {
					customer.setAccountId(accountId);
				}
			}
		}
	}
	//Creating Account
	void addAccount(int accountId,int balance, int custId) {
		Account acc = new Account();
		acc.setId(accountId);
		acc.setBalance(balance);
		accounts[accountCount++] = acc;
		for(Customer customer:customers) {
			if(customer!=null) {
				if(customer.getAccountId() == custId) {
					customer.setAccountId(accountId);
				}
			}
		}
	}
	public void transact(int fromAccount, int toAccount, double amount, String type) {
		// Find the from & to accounts
		Account from = null;
		Account to = null;
		
		for(Account account:accounts) {
			if(account.getId() == fromAccount) {
				from = account;
			}else if(account.getId() == toAccount){
				to = account;
			}
		}
		from.setBalance(from.getBalance()-amount);
		to.setBalance(to.getBalance()+amount);
		
		Transaction transaction = null; 
		if(type.equals("Online")) {
			transaction = new OnlineTransaction(++transactionIds);
		}else if(type.equals("UPI")){
			transaction = new UPITransaction(++transactionIds);
		}else if(type.equals("Branch")){
			transaction = new BranchTransaction(++transactionIds);
		}
		
		transaction.setFromAccount(from);
		transaction.setToAccount(to);
		transaction.setAmount(amount);
		transaction.setTransactionDate(new Date());
		
		transactionBook.addTransaction(transaction);
		double taxForThisTransaction = transaction.calculateTax();
		totalTax += taxForThisTransaction;
		from.setBalance(from.getBalance()-taxForThisTransaction);
	}
	
	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", bankName=" + bankName + ", customers=" + Arrays.toString(customers)
				+ ", transactionBook=" + transactionBook + ", accounts=" + Arrays.toString(accounts)
				+ ", customerCount=" + customerCount + ", accountCount=" + accountCount + "]";
	}
	
}
