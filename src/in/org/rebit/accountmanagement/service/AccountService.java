package in.org.rebit.accountmanagement.service;

import java.util.List;

import in.org.rebit.accountmanagement.entity.Account;

public interface AccountService {
	
	public void addAccount(Account account);
	public boolean deleteAccount(int id);
	public Account findAccount(int id);
	public List<Account> findAllAccount();
	public List<Account> findAllAccountMoreThan(int balance);

}
