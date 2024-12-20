package in.org.rebit.accountmanagement.view.impl;

import java.util.Scanner;

import in.org.rebit.accountmanagement.view.AccountView;

public class AccountViewImpl implements AccountView {

	@Override
	public void getHeader() {
		getMessage("Welcome to Account Management Portal");
		
	}

	@Override
	public void getFooter() {
		getMessage("=============ReBIT2024==============");
		
	}

	@Override
	public void getBody() {
		getMessage("1. Add Account \n2. Delete Account \n3. Search Account \n4.Get all Accounts \n5. Filter Accounts by balance \n6. Count of all accounts filtered by balance \nEnter your choice:");
		
	}

	@Override
	public void getMessage(String s) {
		System.out.println(s);
	}

	@Override
	public String acceptString(Scanner sc) {
		
		String name = sc.next();
		
		return name;
	}

	@Override
	public int acceptInt(Scanner sc) {
		
		int balance = sc.nextInt();
		
		return balance;
	}

}
