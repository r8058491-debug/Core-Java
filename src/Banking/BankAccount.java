package Banking;

//kuch cheeze common hai accountNumber,ownerName,balance

public abstract class BankAccount implements Transactionable{
	protected String accountNumber;
	protected String ownerName;
	protected double balance;
	
	public BankAccount(String ac,String  o,double b) {
		this.accountNumber=ac;
		this.ownerName=o;
		this.balance=b;
	}
	
	public void deposit(double amount) throws InvalidAmountException {
		if(amount<=0) throw new InvalidAmountException("Amount must be positive.");
		balance+=amount;
		System.out.println(amount+"deposited");
	}
	//but withdraw()har account mein different chalega isliye abstract method..

	public abstract  void withdraw(double amt) throws InvalidAmountException, InsufficientBalanceException;
	
	public void displayDetails() {
		System.out.println("Account Number :"+accountNumber);
		System.out.println("Owner Name :"+ownerName);
		System.out.println("Balance :"+ balance);
	}
	protected abstract String getAccountNumber();
	protected abstract String getOwnerName();
	protected abstract Double getBalance();

	

}
