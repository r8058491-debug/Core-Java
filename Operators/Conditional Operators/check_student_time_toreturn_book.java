package conditionaloperator_ques;
import java.util.Scanner;

public class check_student_time_toreturn_book {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Is student late ?");
		System.out.println("How many days?");
		String a=sc.next();
		int day=sc.nextInt();
		if(a.equalsIgnoreCase("Yes") && day<=5 && day>=1) {
			System.out.println("Rs.5");
		}else if(a.equalsIgnoreCase("Yes") && day<=10 && day>=6) {
			System.out.println("Rs.10");
		}else {
			System.out.println("Rs.20");
		}
		sc.close();
	}

}
