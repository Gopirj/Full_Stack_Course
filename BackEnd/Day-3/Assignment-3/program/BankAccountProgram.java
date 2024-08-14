package program;

class BankAccount{
	int accBal;
	void deposit(int n) {
		System.out.println("Enter Amount to deposited : "+n);
		this.accBal+=n;
	}
	void withdraw(int amt) {
		System.out.println("Amount is withdrwn "+amt);
	}
}

class SavingsAccount extends BankAccount{
	//int balance=super.accBal;
	void withdraw(int amt) {
		if(accBal<100 || amt>accBal) {
			System.out.println("your Balance is less than 100 or your card is declined");
		}
		else {
//			super.withdraw(amt);
			System.out.println("Amount is withdrwn "+amt);
			this.accBal-=amt;
		}
	}
}

public class BankAccountProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount obj=new SavingsAccount();
		obj.deposit(500);
		obj.withdraw(60);
	}

}
