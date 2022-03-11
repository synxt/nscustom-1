package in.co.statements.oops.models;

public class Customer {
	private int id;
	private String name;
	private int accountId;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", accountId=" + accountId + "]";
	}
	
}
