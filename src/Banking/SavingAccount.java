package Banking;
//minimum balance 500rs.
//withdraw override hoga...


public class SavingAccount extends BankAccount {
	public SavingAccount(String accountNumber,String ownerName,double balance) {
		super(accountNumber,ownerName,balance);
	}
	
	@Override
	public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException{
		if(amount<=0) throw new InvalidAmountException("Amount must be positive.");
		
		if(balance-amount<500) throw new InsufficientBalanceException("Minimum balance Rs.500 required..");
		balance-=amount;
		System.out.println(amount+"withdrawn from saving account.");
	}
	
	@Override
	public void performTransaction(double amount) {
		System.out.println("Savings Account Transaction of"+amount);
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
