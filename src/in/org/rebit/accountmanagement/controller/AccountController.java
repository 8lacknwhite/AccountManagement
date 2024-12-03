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
			case 2->{
				view.getMessage("Enter id:");
				int id = view.acceptInt(sc);
				service.deleteAccount(id);
			}
			case 3->{
				view.getMessage("Enter id:");
				int id = view.acceptInt(sc);
				System.out.println(service.findAccount(id)); 
			}
			case 4->{
				System.out.println(service.findAllAccount()); 
			}
			case 5->{
			view.getMessage("Enter balance:");
			int balance = view.acceptInt(sc);
			
			System.out.println(service.findAllAccountMoreThan(balance));
			}
			
			}
			
		}while(options !=-1);


	}
}
