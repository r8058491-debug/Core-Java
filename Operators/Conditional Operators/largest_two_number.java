package conditionaloperator_ques;
import java.util.Scanner;

public class largest_two_number {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :");
		System.out.println("Enter the second number :");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		if(num1>num2) {
			System.out.println("Highest number :"+num1);
		}else {
			System.out.println("Highest number :"+num2);
		}
		sc.close();
	}

}
