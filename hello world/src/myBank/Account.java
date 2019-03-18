package myBank;

public class Account {
	public Account(double money) {
	
		this.money = money;
	}

	protected double money;

	public double getMoney() {
		return money;
	}

	public boolean deposit(double amt){
		if(amt>0) {
			money+=amt;
			System.out.println("存款成功");
			return true;
		}else {
			System.out.println("金额不能小于0");
			return false;
		}
	
	}
	
	public boolean withdraw(double amt) {
		if(amt >0) {
			if(money-1>amt) {
				money-=amt;
				System.out.println("取款成功");
				return true;
			}else {
				System.out.println("余额不足");
				return false;
			}
		}else {
			System.out.println("金额不能小于0");
			return false;
		}
	}
}
