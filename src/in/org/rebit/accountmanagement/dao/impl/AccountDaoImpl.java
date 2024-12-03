package in.org.rebit.accountmanagement.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import in.org.rebit.accountmanagement.dao.AccountDao;
import in.org.rebit.accountmanagement.entity.Account;

public class AccountDaoImpl implements AccountDao{
	
	List<Account> accounts;
	
	public AccountDaoImpl() {
		this.accounts = new ArrayList<>();
	}

	@Override
	public Account createAccount(Account account) {
		
		
		accounts.add(account);
		return account;
		
	}

	@Override
	public boolean deleteAccount(int id) {
		
		Iterator<Account> it = accounts.iterator();
		while(it.hasNext()) {
			Account i = it.next();
			if(i.getAccountid() == id) {
				it.remove();
				return true;
			}
		}
		return false;
	}

	@Override
	public Account searchAccount(int id) {
		Iterator<Account> it = accounts.iterator();
		while(it.hasNext()) {
			Account i = it.next();
			if(i.getAccountid() == id) {
				return i;
			}
		};
		return null;
		
	}

	@Override
	public List<Account> getAllAccounts() {
		return this.accounts;
		
	}

}
