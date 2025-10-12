package exception;
import java.util.Scanner;
public class RuntimeUnchecked {
	public static void main(String[]args) {
		Scanner src=new Scanner(System.in);
		System.out.print("Tell me the number:");
		int n=src.nextInt();
		int r=0;
		int s=n/r;
		System.out.println(s); //It gives back ArithmeticException....
		System.out.println("Tell me the String :");
		String bee=src.next();
		String be=null;
		System.out.println(bee.length());// It gives back NullPointerException....
		int sr[] = {1,2,3,1};
		System.out.println(sr[5]);//It gives back ArrayIndexOutOfBoundsException....
		String sh="123";
		int nr=Integer.parseInt(sh);//String convert to int
		System.out.println(n);
		String x="Sbd";
		int c=Integer.parseInt(x);
		System.out.println(c);// It gives back NumberFormatException
		src.close();
	}

}
