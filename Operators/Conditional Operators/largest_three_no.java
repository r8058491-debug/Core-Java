package conditionaloperator_ques;
import java.util.Scanner;

public class largest_three_no {
	public static void main(String[]args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the first no.:");
		System.out.println("Enter the second no.:");
		System.out.println("Enter the third no.:");
		int num1 =src.nextInt();
		int num2=src.nextInt();
		int num3=src.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("Largest no.:"+num1);
		}else if(num2>num3) {
			System.out.println("Largest no.:"+num2);
		}else {
			System.out.println("Largest no.:"+num3);
		}
		src.close();
		
	}

}
