package conditionaloperator_ques;
import java.util.Scanner;

public class check_character {
	public static void main(String[]args) {
		Scanner src=new Scanner(System.in);
		System.out.print("Enter the alphabet :");
	    char alp=src.next().charAt(0);
	    
	    if(alp=='a'|| alp=='i' || alp=='e' || alp=='o' || alp=='u') {
	    	System.out.println(alp +" "+"is a vowel.");
	    }else {
	    	System.out.println(alp +" "+"is a consonant.");
	    }
	    src.close();
	}

}
