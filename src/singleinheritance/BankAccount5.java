package singleinheritance;

public class BankAccount5 {
	int accountNumber;
	float balance;
	
	BankAccount5(int accountNumber, float balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	void display() {
		System.out.println("Account Number :"+ accountNumber);
		System.out.println("Balance :"+ balance);
	}
}
