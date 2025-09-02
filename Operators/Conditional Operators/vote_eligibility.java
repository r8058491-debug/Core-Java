package conditionaloperator_ques;
import java.util.Scanner;

public class vote_eligibility {
	public static void main(String[]args) {
		Scanner src=new Scanner(System.in);
		System.out.print("Enter the age :");
		int age=src.nextInt();
		
		if(age>=18) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("Not eligible to vote");
		}
		src.close();
	}

}
