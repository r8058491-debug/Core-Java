package operator_ques;

public class checkleapyr {
	public static void main(String[]args) {
		int year=2026;
		int year1=2024;
		if((year%400==0)||((year%4==0)&&(year%100!=0))){
			System.out.println("Leap Year");
		}else {
			System.out.println("No Leap Year");
		}
		if((year1%400==0)||((year1%4==0)&&(year1%100!=0))){
			System.out.println("Leap Year");
		}else {
			System.out.println("No Leap Year");
		}

	}

}
