
package conditionaloperator_ques;
import java.util.Scanner;

public class How_much_electricity_consumed {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("How much consuming electricity :");
		int unit=sc.nextInt();
		if(unit>500) {
			System.out.println("High Consumption");
		}else {
			System.out.println("Normal Consumption");
		}
		sc.close();
	}

}
