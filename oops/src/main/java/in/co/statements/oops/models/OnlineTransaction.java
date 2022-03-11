package in.co.statements.oops.models;

public class OnlineTransaction extends Transaction{
	public OnlineTransaction(int id) {
		super(id,"ONLINE");
	}
	public double calculateTax() {
		return getAmount()*0.12;
	}
}
