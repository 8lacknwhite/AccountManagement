package in.org.rebit.accountmanagement.factory;

import java.io.InputStream;
import java.util.Scanner;

import in.org.rebit.accountmanagement.dao.AccountDao;
import in.org.rebit.accountmanagement.dao.impl.AccountDaoImpl;
import in.org.rebit.accountmanagement.entity.Account;
import in.org.rebit.accountmanagement.service.AccountService;
import in.org.rebit.accountmanagement.service.impl.AccountServiceImpl;
import in.org.rebit.accountmanagement.view.AccountView;
import in.org.rebit.accountmanagement.view.impl.AccountViewImpl;

public class BeanFactory {
	
	public AccountDao getAccountDao() {
		AccountDaoImpl dao = new AccountDaoImpl();
		return dao;
	}
	
	public AccountService getAccountService() {
		AccountServiceImpl service = new AccountServiceImpl(getAccountDao());
		return service;
	}
	
	public Scanner getScanner() {
		Scanner sc = new Scanner(System.in);
		return sc;
	}
	
	public AccountView getView() {
		AccountViewImpl view = new AccountViewImpl();
		return view;
	}
	public Account getAccount(String name, int balance) {
		Account account = new Account(name, balance);
		return account;
	}

}
