package myBank;

public class Bank {
private Customer [] customers;
private int numberofCustomer;

private static Bank bank;

private Bank() {
	 customers=new Customer [50];
	 
}
public static Bank getBankInstance() {
	if(bank==null) {
		bank=new Bank();
	}
		return bank;
	
}

public void addCustomer(String f,String l) {
	customers[numberofCustomer]=new Customer(f, l);
	numberofCustomer++;
}
public Customer getCustomer(int index) {
	if(index<numberofCustomer) {
		return customers[index];
	}else {
		System.out.println("ÊäÈëÓÐÎó£¡");
		return null;
	}
	
}
public int getNumberofCustomer() {
	return numberofCustomer;
}



}
