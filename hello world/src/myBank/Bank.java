package myBank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
private List<Customer> customers;


private static Bank bank;

private Bank() {
	customers=new ArrayList<>();
	 
}
public static Bank getBankInstance() {
	if(bank==null) {
		bank=new Bank();
	}
		return bank;
	
}

public void addCustomer(String f,String l) {
	customers.add(new Customer(f, l));
	
}
public Customer getCustomer(int index) {
	if(index>=0) {
		return customers.get(index);
	}else {
		System.out.println("ÊäÈëÓĞÎó£¡");
		return null;
	}
	
}
public int getNumberofCustomer() {
	return customers.size();
}



}
