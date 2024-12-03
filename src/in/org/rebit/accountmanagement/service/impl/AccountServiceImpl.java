package in.org.rebit.accountmanagement.service.impl;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import in.org.rebit.accountmanagement.dao.AccountDao;
import in.org.rebit.accountmanagement.entity.Account;
import in.org.rebit.accountmanagement.service.AccountService;

public class AccountServiceImpl implements AccountService {
	
	private AccountDao dao;
	
	public AccountServiceImpl(AccountDao dao) {
		this.dao = dao;
	}
	
	private Stream<Account> filterAccounts(Predicate<Account> p ){
		return this.findAllAccount()
				   .stream()
				   .filter(p);
	}

	@Override
	public void addAccount(Account account) {
		
		System.out.println("In service");//testing
		this.dao.createAccount(account);
		
	}

	@Override
	public boolean deleteAccount(int id) {
		System.out.println("Deleted");
		return this.dao.deleteAccount(id);
	}

	@Override
	public Account findAccount(int id) {
		return this.dao.searchAccount(id);
		
	}

	@Override
	public List<Account> findAllAccount() {
		return this.dao.getAllAccounts();
		
	}

	@Override
	public List<Account> findAllAccountMoreThan(int balance) {
		return this.filterAccounts(account -> account.getAccountbalance()>balance).toList();
	}

}
