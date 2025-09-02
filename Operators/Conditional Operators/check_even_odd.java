package conditionaloperator_ques;
import java.util.Scanner;

public class check_even_odd {
	public static void main(String[]args) {
		Scanner src=new Scanner(System.in);
		System.out.print("Enter the number :");
		int num=src.nextInt();
		
		if(num%2==0) {
			System.out.println(num+" "+"is an even number.");
		}else {
			System.out.println(num+" "+"is an odd number.");
		}
		src.close();
	}

}
