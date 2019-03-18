package myBank;

public class testBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bank bank=new Bank();
	Customer customer;
	Account account;
	
	bank.addCustomer("jacky", "chan");
	account=new savingAccount(500, 3);
	customer=bank.getCustomer(0);
	customer.setAcc(account);
	customer.getAcc().withdraw(150);
	customer.getAcc().deposit(22.5);
	customer.getAcc().withdraw(47.62);
	customer.getAcc().withdraw(400);
	System.out.println(customer.getFirstName()+customer.getLastName()+"的存款是"+customer.getAcc().getMoney());
	
	bank.addCustomer("andy", "law");
	customer=bank.getCustomer(1);
	account=new CheckingAccount(500);
	customer.setAcc(account);
	customer.getAcc().withdraw(250);
	customer.getAcc().deposit(22.5);
	customer.getAcc().withdraw(47.62);
	customer.getAcc().withdraw(400);
	System.out.println(customer.getFirstName()+customer.getLastName()+"的存款是"+customer.getAcc().getMoney());
	
	
	bank.addCustomer("arrown", "kwor");
	customer=bank.getCustomer(2);
	account=new CheckingAccount(500,500);
	customer.setAcc(account);
	customer.getAcc().withdraw(250);
	customer.getAcc().deposit(22.5);
	customer.getAcc().withdraw(47.62);
	customer.getAcc().withdraw(400);
	System.out.println(customer.getFirstName()+customer.getLastName()+"的存款是"+customer.getAcc().getMoney());
	
	bank.addCustomer("leon", "lai");
	customer=bank.getCustomer(3);
	customer.setAcc(bank.getCustomer(2).getAcc());
	customer.getAcc().withdraw(250);
	customer.getAcc().deposit(22.5);
	customer.getAcc().withdraw(47.62);
	customer.getAcc().withdraw(400);
	System.out.println(customer.getFirstName()+customer.getLastName()+"的存款是"+customer.getAcc().getMoney());
	
	
	
		for(int i=0;i<bank.getNumberofCustomer();i++) {
			System.out.println("customer ["+i+"]:"+bank.getCustomer(i).getFirstName()+"\t"+bank.getCustomer(i).getLastName());
		}
		
	}

}
