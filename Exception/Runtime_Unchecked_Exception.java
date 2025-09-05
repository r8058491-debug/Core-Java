package Exception_Class;
//import java.util.Scanner;
public class Runtime_Unchecked_Exception {
	public static void main(String[]args) {
//		Scanner src=new Scanner(System.in);
//		System.out.print("Tell me the number:");
//		int n=src.nextInt();
//		int r=0;
//		int s=n/r;
//		System.out.println(s); //It gives back ArithmeticException....
//		System.out.println("Tell me the String :");
//		String bee=src.next();
//		String bee=null;
//		System.out.println(bee.length());// It gives back NullPointerException....
//		int s[] = {1,2,3,1};
//		System.out.println(s[5]);//It gives back ArrayIndexOutOfBoundsException....
		String s="123";
		int n=Integer.parseInt(s);//String convert to int
		System.out.println(n);
		String x="Sbd";
		int c=Integer.parseInt(x);
		System.out.println(c);// It gives back NumberFormatException
	}

}
