package myBank;

public class Customer {
	private String	firstName;
	
	private String  lastName;
	private Account [] acc1;

	
	private int NumberofAccount=0;
	
	public Customer(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.acc1=new Account [5];
	}
	
	public void addAccount(Account acc) {
		
		acc1[NumberofAccount]=acc;
		NumberofAccount++;
	}

	public Account getAccount(int index) {
		if(index<NumberofAccount) {
			return acc1[index];
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
		return NumberofAccount;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
