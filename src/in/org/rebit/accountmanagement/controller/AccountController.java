package in.org.rebit.accountmanagement.controller;

import java.util.Scanner;

import in.org.rebit.accountmanagement.entity.Account;
import in.org.rebit.accountmanagement.factory.BeanFactory;
import in.org.rebit.accountmanagement.service.AccountService;
import in.org.rebit.accountmanagement.view.AccountView;

public class AccountController {

	public static void main(String[] args) {
		
		BeanFactory factory = new BeanFactory();
		Scanner sc  = factory.getScanner();
		AccountService service = factory.getAccountService();
		AccountView view =  factory.getView();
		int options =0;
		
		do {
			view.getHeader();
			view.getBody();
			view.getFooter();
			options = view.acceptInt(sc);
			
			switch (options) {
			case 1 ->{
				view.getMessage("Enter Name");
				String name =view.acceptString(sc);
				view.getMessage("Enter Amount in the account");
				int balance = view.acceptInt(sc);
				Account account = factory.getAccount(name, balance);
				service.addAccount(account);
			}
			}
			
			
			
		}while(options !=-1);


	}
}
