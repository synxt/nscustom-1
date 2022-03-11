package in.co.statements.oops.models;

public class ObjectCreation {
	public static void main(String[] args) {
		System.out.println("Beginnning");
		Transaction obj = new UPITransaction(1);
		System.out.println(Transaction.version);
		System.out.println("Completed");
	}
}
