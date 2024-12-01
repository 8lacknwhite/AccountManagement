package in.org.rebit.accountmanagement.entity;

public class Account {
	
	private static int count;
	private int accountid;
	private String name;
	private int accountbalance;
	public Account(String name, int accountbalance) {
		count ++;
		this.accountid = count;
		this.name = name;
		this.accountbalance = accountbalance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountbalance() {
		return accountbalance;
	}
	public void setAccountbalance(int accountbalance) {
		this.accountbalance = accountbalance;
	}
	public int getAccountid() {
		return accountid;
	}
	
	@Override
	public String toString() {
		return accountid + "  " + name + "  " + accountbalance; 
	}

}
