package singleinheritance;

public class SavingAccount5 extends BankAccount5{
	float interestRate;
	
	SavingAccount5(int accountNumber, float balance, float interestRate){
		super(accountNumber, balance);
		this.interestRate=interestRate;
	}
	
	float deposit(int amt) {
		return balance+=amt;
		
	}
	float withdraw(int amt) {
		return balance-=amt;
	}
	
	float interest() {
		return balance* interestRate/100;
		  
	}
	
	void display() {
		super.display();
		System.out.println("Deposit :"+ deposit(5621) );
		System.out.println("Withdraw :"+ withdraw(123));
		System.out.println("Final Balance :"+(interest()+deposit(5621)-withdraw(123)+balance));
	}
	public static void main(String[]args) {
		SavingAccount5 sa=new SavingAccount5(152,1555414f,5f);
		sa.display();
	}

}
