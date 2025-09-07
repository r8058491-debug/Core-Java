package balance_Calculation;
import java.util.Scanner;
public class BankAccount {

		float accountNumber;
		String name;
		double balance;
		double balance1;
		double dep_amt;
		double with_amt;
		double fin_amt;
		
		void  input() {
			Scanner src=new Scanner(System.in);
			System.out.print("Enter the A/c no.:");
			accountNumber=src.nextFloat();
			System.out.print("Enter the name :");
			name=src.next();
			System.out.print("Enter the balance :");
			balance=src.nextDouble();
			
			src.close();
		}
		void deposit() {
			dep_amt=59000.432;
			balance1=balance+dep_amt;
		}
		void withdraw() {
			with_amt=16532.210;
			fin_amt=balance1-with_amt;
		}
		void display() {
			System.out.println("Account Number :"+accountNumber);
			System.out.println("Name :"+name);
			System.out.println("Final Balance :"+fin_amt);
		}


}
