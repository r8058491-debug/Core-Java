package conditionaloperator_ques;
import java.util.Scanner;

public class marksheet {
	public static void main(String[]args) {
		Scanner src=new Scanner(System.in);
		System.out.print("Enter the marks :");
		int marks=src.nextInt();
		
		if (marks<=100 && marks>=90) {
			System.out.println("A");
		}if(marks<=89 && marks>=80) {
			System.out.println("B");
		}if(marks<=79 && marks>=70) {
			System.out.println("C");
		}if(marks<=69 && marks>=60) {
			System.out.println("D");
		}else {
			System.out.println("Fail");
		}
		src.close();
		
	}

}
