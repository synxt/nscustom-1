package in.co.statements.oopsdemo.repo;

public class AccountRepository implements Repository{
	public String getAccountInfo(String username) {
		//Oracle DB Logic
		return "Name:Sushma,AccountNo:91201111212212,IFSC:UTIB0000428";
	}
}
