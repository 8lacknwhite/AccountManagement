package in.org.rebit.accountmanagement.dao.impl;

import java.util.ArrayList;
import java.util.List;

import in.org.rebit.accountmanagement.dao.AccountDao;
import in.org.rebit.accountmanagement.entity.Account;

public class AccountDaoImpl implements AccountDao{
	
	List<Account> accounts;
	
	public AccountDaoImpl() {
		this.accounts = new ArrayList<>();
	}

	@Override
	public void createAccount(Account account) {
		
		System.out.println("In dao");//testing
		accounts.add(account);
		System.out.println(account);
		
	}

}
