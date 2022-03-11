package in.co.statements.oopsdemo.repo;

public class PostgresRepository implements Repository{
	public String getAccountInfo(String username) {
		//Postgres DB Logic
		return "PostName:Sushma,AccountNo:91201111212212,IFSC:UTIB0000428";
	}
}
