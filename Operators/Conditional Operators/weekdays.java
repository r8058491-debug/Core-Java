package conditionaloperator_ques;
import java.util.Scanner;

public class weekdays {
	public static void main(String[]args) {
		Scanner src=new Scanner(System.in);
		System.out.print("Enter the no. for week :");
		int day=src.nextInt();
		
		switch(day){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break ;
		case 3:
			System.out.println("Wednesday");
			break ;
		case 4:
			System.out.println("Thursday");
			break ;
		case 5:
			System.out.println("Friday");
			break ;
		case 6:
			System.out.println("Saturday");
			break ;
		case 7:
			System.out.println("Sunday");
			break ;
		default:
			System.out.println("Invalid date number.Please enter (1 to 7) no.");
			
		}
		src.close();
		
	}

}
