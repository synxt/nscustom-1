package in.co.statements.oopsdemo.service;

import in.co.statements.oopsdemo.repo.Repository;

public class AccountService implements Service {
	private Repository accountRepo;
	
	public Repository getAccountRepo() {
		return accountRepo;
	}

	public void setAccountRepo(Repository accountRepo) {
		this.accountRepo = accountRepo;
	}

	public String getAccountDetails(String username) {
		//Business Logic -> Formatting
		String accountDetails = accountRepo.getAccountInfo(username);
		return accountDetails.toLowerCase();
	}
}
