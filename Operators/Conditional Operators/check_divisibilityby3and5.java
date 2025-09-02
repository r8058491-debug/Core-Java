package conditionaloperator_ques;
import java.util.Scanner;

public class check_divisibilityby3and5 {
	public static void main(String[]args) {
		Scanner src=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=src.nextInt();
		
		if(num%3==0 && num%5==0) {
			System.out.println(num);
		}else {
			System.out.println("Not divisible ");
		}
		src.close();
	}

}
