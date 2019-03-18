package myBank;

public class Bank {
private Customer [] customers;
private int numberofCustomer;

public Bank() {
	 customers=new Customer [50];
	 
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
