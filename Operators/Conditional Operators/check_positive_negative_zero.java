package conditionaloperator_ques;
import java.util.Scanner;

public class check_positive_negative_zero {
	public static void main(String[]args) {
		Scanner as=new Scanner(System.in);
		System.out.print("Enter a number :");
		int num=as.nextInt();
		
		if(num>0) {
			System.out.println(num+" "+"is a positive.");
		}else if(num<0) {
			System.out.println(num+ " "+"is a negative.");
		}else {
			System.out.println(num+ " "+"is a zero.");
		}
		as.close();
	}

}
