package conditionaloperator_ques;
import java.util.Scanner;

public class leapyear {
	public static void main(String[]args) {
		Scanner src=new Scanner(System.in);
		System.out.print("Enter the year :");
		int ly=src.nextInt();
		
		if(ly%4==0 || ly%400==0 && ly%100!=0) {
			System.out.println("Leap year");
		}else {
			System.out.println("It is not a leap year");
		}
		src.close();
	}

}
