package myBank;

public class CheckingAccount extends Account {

	private double overdraftProtection;
	public CheckingAccount(double money) {
		super(money);
		// TODO Auto-generated constructor stub
	}

	public CheckingAccount(double money,double overdraftProtection) {
		super(money);
		this.overdraftProtection=overdraftProtection;
		// TODO Auto-generated constructor stub
	}
	public double getOverdraftProtection() {
		return this.overdraftProtection;
	}
	public void setOverdraftProtection(double overdraftProtection) {
		this.overdraftProtection = overdraftProtection;
	}
	@Override
	public boolean withdraw(double amt) {
		// TODO Auto-generated method stub
		if(amt >0) {
			if(money-1>amt) {
				money-=amt;
				System.out.println("取款成功");
				return true;
			}else {
				if(overdraftProtection>=(amt-money)) {
					overdraftProtection-=(amt-money);
					money=0;
					return true;
				}else {
					System.out.print("透支已超出范围");
					return false;
				}
				
			}
		}else {
			System.out.println("金额不能小于0");
			return false;
		}
	}
}
