package in.org.rebit.accountmanagement.service.impl;

import in.org.rebit.accountmanagement.dao.AccountDao;
import in.org.rebit.accountmanagement.entity.Account;
import in.org.rebit.accountmanagement.service.AccountService;

public class AccountServiceImpl implements AccountService {
	
	private AccountDao dao;
	
	public AccountServiceImpl(AccountDao dao) {
		this.dao = dao;
	}

	@Override
	public void addAccount(Account account) {
		
		System.out.println("In service");//testing
		this.dao.createAccount(account);
		
	}

}
