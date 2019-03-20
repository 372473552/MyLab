package myBank;

public class CustomerReport {
	public void  generateReport() {
		System.out.println("CUSTOMER REPORTE");
		System.out.println("====================================");
		Bank bank=Bank.getBankInstance();
		for(int i=0;i<bank.getNumberofCustomer();i++) {
			Customer customer=bank.getCustomer(i);
			System.out.println("Customer ["+ customer.getFirstName()+","+customer.getLastName()+"]");
			
			for(int j=0; j<customer.getNumberofAccount();j++) {
				Account account=customer.getAccount(j);
				String accountType="";
				if(account instanceof SavingAccount) {
					accountType="Saving Account";
				}
				if(account instanceof CheckingAccount) {
					accountType="Checking Account";
				}
				System.out.println(accountType+"current balance is "+account.getMoney());
			}
			
			System.out.println("***************************");
		}
		
		
	}
}
