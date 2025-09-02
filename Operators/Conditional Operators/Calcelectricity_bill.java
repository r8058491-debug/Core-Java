package conditionaloperator_ques;
import java.util.Scanner;

public class Calcelectricity_bill {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Electricity Unit Consumed :");
		int n=sc.nextInt();
		
		if(n<=100 && n>0) {
			System.out.println("Electricity bill :"+ (n*5));
		}if(n<=200 && n>=101) {
			System.out.println("Electricity bill :"+ (n*7));
		}else {
			System.out.println("Electricity bill :"+ (n*10));
		}
		sc.close();
			
	}

}
