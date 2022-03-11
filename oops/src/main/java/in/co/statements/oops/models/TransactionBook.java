package in.co.statements.oops.models;

import java.util.Arrays;

public class TransactionBook {
	private Transaction[] transactions = new Transaction[10];
	private int transCount = 0;
	public void addTransaction(Transaction trans) {
		transactions[transCount++] = trans;
	}
	@Override
	public String toString() {
		return "TransactionBook [transactions=" + Arrays.toString(transactions) + ", transCount=" + transCount + "]";
	}
	
}
