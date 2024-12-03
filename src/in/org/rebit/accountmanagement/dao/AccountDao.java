package in.org.rebit.accountmanagement.dao;

import java.util.List;

import in.org.rebit.accountmanagement.entity.Account;

public interface AccountDao {

	public Account createAccount(Account account);
	public boolean deleteAccount(int id);
	public Account searchAccount(int id);
	public List<Account> getAllAccounts();
}
