package Forloop;
public class Sum_of_a_digit_number {
	public static void main(String[]args) {
		int rev=0;
		int sum=0;
		
		for(int n=123;n!=0;n=n/10) {
			 rev=n%10;
			 sum=sum+rev;
			
			
		}
		System.out.println(sum);
	}

}
