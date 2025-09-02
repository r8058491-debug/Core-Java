package conditionaloperator_ques;
import java.util.Scanner;

public class Check_student_allowedto_borrow_book {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Pending dues :");
		String alw=sc.next();
		
		if(alw.equalsIgnoreCase("Yes")) {
			System.out.println("No,You should have to pay pending dues first.");
		}else if(alw.equalsIgnoreCase("No")) {
			System.out.println("Yes,You can borrow it.");
		}else {
			System.out.println("Invalid Input.Try again!");
		}
		sc.close();
	}

}
