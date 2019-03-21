package myBank;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String	firstName;
	
	private String  lastName;
	private List<Account> accounts;

	
	
	public Customer(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		accounts=new ArrayList<>();
	}
	
	public void addAccount(Account acc) {
		
		accounts.add(acc);
		
	}

	public Account getAccount(int index) {
		if(index>=0) {
			return accounts.get(index);
		}else {
			return null;
		}
		
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getNumberofAccount() {
		return accounts.size();
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
