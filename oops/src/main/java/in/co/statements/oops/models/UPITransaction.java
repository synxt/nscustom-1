package in.co.statements.oops.models;

public class UPITransaction extends Transaction{
	public UPITransaction(int id) {
		super(id,"UPI");
		System.out.println("ID Constructor Of UPI");
	}
	public double calculateTax() {
		return getAmount()*0.10;
	}
}
