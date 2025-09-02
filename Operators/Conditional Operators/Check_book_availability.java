package conditionaloperator_ques;
import java.util.Scanner;

public class Check_book_availability {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Is book available ?");
		String n=sc.next();
		
		if(n.equals("yes")) {
			System.out.println("You can borrow.");
		}else {
			System.out.println("No,You can not borrow.");
		}
		sc.close();
	}

}
