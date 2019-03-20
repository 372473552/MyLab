package myBank;

public class testBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bank bank=Bank.getBankInstance();
	Customer customer;
	Account account;
	CustomerReport cr=new CustomerReport();
	bank.addCustomer("jacky", "chan");
	customer=bank.getCustomer(0);
	account=new SavingAccount(500, 3);
	customer.addAccount(account);
	customer.addAccount(new CheckingAccount(200, 400));
	customer.getAccount(0).withdraw(150);
	
	bank.addCustomer("andy", "law");
	customer=bank.getCustomer(1);
	customer.addAccount(new CheckingAccount(200.00));
	
	bank.addCustomer("arrown", "kwor");
	customer=bank.getCustomer(2);
	customer.addAccount(new CheckingAccount(200));
	customer.addAccount(new SavingAccount(1500,0.05));
	
	bank.addCustomer("leon", "lai");
	customer=bank.getCustomer(3);
	customer.addAccount(bank.getCustomer(2).getAccount(0));
	customer.addAccount(new SavingAccount(150,0.05));
	
	cr.generateReport();
	
		
	}

}
