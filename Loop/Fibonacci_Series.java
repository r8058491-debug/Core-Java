package Loop;

public class Fibonacci_Series {
	public static void main(String[]args) {
		int f1=0;
		int f2=1;
		System.out.print("Fibonacci Series :");
		for(int i=2;i<=100;i++) {
	
		System.out.print(f1+" ");
		int next=f1+f2;
		f1=f2;
		f2=next;
		}
	}

}
