package in.co.statements.oops.models;

public class BranchTransaction extends Transaction{
	private String branch;
	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public BranchTransaction(int id) {
		super(id,"BRANCH");
	}
	
	public double calculateTax() {
		return getAmount()*0.18;
	}
	
}
