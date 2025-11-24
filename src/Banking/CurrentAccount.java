package Banking;

//minimum balance 1000rs. required....

public class CurrentAccount extends BankAccount {
	public CurrentAccount(String accountNumber,String ownerName,double balance) {
		super(accountNumber,ownerName,balance);
	}
	
	@Override
	public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException{
		if(amount<=0) throw new InvalidAmountException("Amount must be positive.");
		
		if(balance-amount<1000) throw new InsufficientBalanceException("Minimum balance Rs.1000 required.");
		balance-=amount;
		System.out.println(amount+"withdrawn from current account.");
	}
	
	@Override
	public void performTransaction(double amount) {
		System.out.println("Current Account Transaction of"+amount);
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	public Double getBalance() {
		return balance;
	}
	

}
