package myBank;

public class Customer {
	private String	firstName;
	
	private String  lastName;
	private Account acc;
	
	public Customer(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Account getAcc() {
		return acc;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
