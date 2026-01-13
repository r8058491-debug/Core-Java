package neeraj;

public class BankAccount {
	public abstract class BankAccont implements Transactionable {
		private String accountNumber;
		private String ownerName;
		private String balance;

		public void deposit (double amount ) throws InvalidAmountException {
			
			if (amount <= 0)
				
				throw new InvalidAmountException
				("Deposite amount must be postive");
			
			balance += amount;
			
			{
				
				public abstract void withdraw (double amount)	throws InvalidAmount Exception,InsuffcientBalanceException ;
				
				public void display accountDetails () {
					
					System.out.println("Account number + account number ");
					System.out.println("Owner name + owner name ");
					System.out.println("Balance + balance  ");
					
				}
			}
			
			
			
			
			
		
		
		
	

}
