package in.co.statements.oopsdemo.controller;

import in.co.statements.oopsdemo.service.AccountService;
import in.co.statements.oopsdemo.service.Service;

public class AccountController implements Controller{
	private Service accountService;
	
	public Service getAccountService() {
		return accountService;
	}

	public void setAccountService(Service accountService) {
		this.accountService = accountService;
	}

	public String getAccountDetails(String username) {
		//inout
		return accountService.getAccountDetails(username);
	}
}
