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
			System.out.println("���ɹ�");
			return true;
		}else {
			System.out.println("����С��0");
			return false;
		}
	
	}
	
	public boolean withdraw(double amt) {
		if(amt >0) {
			if(money-1>amt) {
				money-=amt;
				System.out.println("ȡ��ɹ�");
				return true;
			}else {
				System.out.println("����");
				return false;
			}
		}else {
			System.out.println("����С��0");
			return false;
		}
	}
}
