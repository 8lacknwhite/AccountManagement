package in.org.rebit.accountmanagement.view;

import java.util.Scanner;

public interface AccountView {
	
	public void getHeader();
	public void getFooter();
	public void getBody();
	public void getMessage(String s);
	public String acceptString(Scanner sc);
	public int acceptInt(Scanner sc);

}
