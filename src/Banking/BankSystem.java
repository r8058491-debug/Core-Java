package Banking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankSystem {
	private static List<BankAccount> accounts=new ArrayList<>();
	private static Scanner sc=new Scanner(System.in);

	public static void main(String[]args) {
		int choice;

		do {
			System.out.println("\n-----Welcome to My Bank----");
			System.out.println("1. Create Account :");
			System.out.println("2. Deposit Money :");
			System.out.println("3. Withdraw Money :");
			System.out.println("4. Show Account Details :");
			System.out.println("5. Exit");

			System.out.print("Enter Choice :");
			choice=sc.nextInt();

			switch(choice) {
			case 1 -> createAccount();
			case 2 -> depositMoney();
			case 3 -> withdrawMoney();
			case 4 -> showAccountDetails();
			case 5 -> System.out.println("Exit....");
			default -> System.out.println("Invalid Choice.");
			}
		}
		while(choice!=5);
	}

	private static void showAccountDetails() {
		BankAccount acc=findAccount();
		if(acc==null) {
			System.out.println("Account Not Found..");
			return;
		}
		acc.displayDetails();

	}

	private static BankAccount findAccount() {
		System.out.print("Enter Account Number :");
		String acc=sc.next();
		for(BankAccount a :accounts) {
			if(a.getAccountNumber().equals(acc)) {
				return a;
			}
		}
		return null;
	}

	private static void withdrawMoney() {
		BankAccount acc=findAccount();
		if(acc==null) {
			System.out.println("Account Not Found.");
			return ;
		}
		System.out.print("Enter Amount :");
		double amt=sc.nextDouble();

		try {
			acc.withdraw(amt);
		}catch(Exception e) {
			System.out.println("e.getMessage()");
		}

	}

	private static void depositMoney() {
		BankAccount acc=findAccount();
		if(acc==null) {
			System.out.println("Account Not Found.");
			return;
		}
		System.out.print("Enter Amount :");
		double amt=sc.nextDouble();

		try {
			acc.deposit(amt);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void createAccount() {
		System.out.print("Enter Account Number");
		String accNo=sc.next();

		for(BankAccount acc:accounts) {
			if(acc.getAccountNumber().equals(accNo)) {
				System.out.println("Account Already Exists..");
				return;
			}
		}
		System.out.print("Enter Owner Name :");
		String name=sc.next();

		System.out.println("1. Saving Account");
		System.out.println("2. Current Account");

		System.out.print("Choose Type:");
		int type=sc.nextInt();

		BankAccount newAcc=null;

		if(type==1) {newAcc=new SavingAccount(accNo,name,bal);
		}
		elseif(type==2){newAcc=new CurrentAccount(accNo,name,bal);
		}
		else {
			System.out.println("Invalid Type");
			return;
		}

		accounts.add(newAcc);
		System.out.println("Account Created Successfully..");

	}
}
